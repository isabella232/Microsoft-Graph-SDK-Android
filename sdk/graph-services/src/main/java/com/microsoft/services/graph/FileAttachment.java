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
package com.microsoft.services.graph;





/**
 * The type File Attachment.
*/
public class FileAttachment extends Attachment {

    public FileAttachment(){
        setODataType("#microsoft.graph.fileAttachment");
    }
            
    private String contentId;
     
    /**
    * Gets the content Id.
    *
    * @return the String
    */
    public String getContentId() {
        return this.contentId; 
    }

    /**
    * Sets the content Id.
    *
    * @param value the String
    */
    public void setContentId(String value) { 
        this.contentId = value; 
        valueChanged("contentId", value);

    }
            
    private String contentLocation;
     
    /**
    * Gets the content Location.
    *
    * @return the String
    */
    public String getContentLocation() {
        return this.contentLocation; 
    }

    /**
    * Sets the content Location.
    *
    * @param value the String
    */
    public void setContentLocation(String value) { 
        this.contentLocation = value; 
        valueChanged("contentLocation", value);

    }
            
    private byte[] contentBytes;
     
    /**
    * Gets the content Bytes.
    *
    * @return the byte[]
    */
    public byte[] getContentBytes() {
        return this.contentBytes; 
    }

    /**
    * Sets the content Bytes.
    *
    * @param value the byte[]
    */
    public void setContentBytes(byte[] value) { 
        this.contentBytes = value; 
        valueChanged("contentBytes", value);

    }
}

