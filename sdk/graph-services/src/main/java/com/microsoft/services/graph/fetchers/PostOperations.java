/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/
package com.microsoft.services.graph.fetchers;

import com.microsoft.services.graph.*;
import com.google.common.util.concurrent.*;
import com.microsoft.services.orc.core.*;
import com.microsoft.services.orc.http.*;
import static com.microsoft.services.orc.core.Helpers.*;
import com.microsoft.services.orc.serialization.JsonSerializer;

/**
 * The type PostOperations.
 */
public class PostOperations extends OutlookItemOperations {

     /**
      * Instantiates a new PostOperations.
      *
      * @param urlComponent the url component
      * @param parent the parent
      */
    public PostOperations(String urlComponent, OrcExecutable parent) {
            super(urlComponent, parent);
    }

    /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public PostOperations addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public PostOperations addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

    
    
    /**
     * forward listenable future.
     * @param comment the comment @param toRecipients the toRecipients 
     * @return the listenable future
     */         
    public ListenableFuture<Integer> forward(String comment, java.util.List<Recipient> toRecipients) { 
        
		JsonSerializer serializer = getResolver().getJsonSerializer();      
        
		String serializedComment = serializer.serialize(comment);
		String serializedToRecipients = serializer.serialize(toRecipients);
		  
        
		
		ListenableFuture<String> future = forwardRaw(serializedComment, serializedToRecipients);
		return transformToEntityListenableFuture(future, Integer.class, getResolver());
        
    }

     /**
     * forwardRaw listenable future.
     * @param comment the comment @param toRecipients the toRecipients 
     * @return the listenable future
     */ 
    public ListenableFuture<String> forwardRaw(String comment, String toRecipients){
        
        java.util.Map<String, String> map = new java.util.HashMap<String, String>();
        
        map.put("Comment", comment);
		map.put("ToRecipients", toRecipients);
		
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.setContent(getResolver().getJsonSerializer()
               .jsonObjectFromJsonMap(map).getBytes(Constants.UTF8));
                        
        request.getUrl().appendPathComponent("microsoft.graph.forward");
        
        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


    
    
    /**
     * reply listenable future.
     * @param post the post 
     * @return the listenable future
     */         
    public ListenableFuture<Integer> reply(Post post) { 
        
		JsonSerializer serializer = getResolver().getJsonSerializer();      
        
		String serializedPost = serializer.serialize(post);
		  
        
		
		ListenableFuture<String> future = replyRaw(serializedPost);
		return transformToEntityListenableFuture(future, Integer.class, getResolver());
        
    }

     /**
     * replyRaw listenable future.
     * @param post the post 
     * @return the listenable future
     */ 
    public ListenableFuture<String> replyRaw(String post){
        
        java.util.Map<String, String> map = new java.util.HashMap<String, String>();
        
        map.put("Post", post);
		
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.setContent(getResolver().getJsonSerializer()
               .jsonObjectFromJsonMap(map).getBytes(Constants.UTF8));
                        
        request.getUrl().appendPathComponent("microsoft.graph.reply");
        
        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


}
