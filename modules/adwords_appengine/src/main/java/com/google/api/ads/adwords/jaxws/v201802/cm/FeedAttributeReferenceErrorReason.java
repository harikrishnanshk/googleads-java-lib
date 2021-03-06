// Copyright 2018 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.adwords.jaxws.v201802.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedAttributeReferenceError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeedAttributeReferenceError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CANNOT_REFERENCE_DELETED_FEED"/>
 *     &lt;enumeration value="INVALID_FEED_NAME"/>
 *     &lt;enumeration value="INVALID_FEED_ATTRIBUTE_NAME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeedAttributeReferenceError.Reason")
@XmlEnum
public enum FeedAttributeReferenceErrorReason {


    /**
     * 
     *                 A feed referenced by ID has been deleted.
     *               
     * 
     */
    CANNOT_REFERENCE_DELETED_FEED,

    /**
     * 
     *                 There is no active feed with the given name.
     *               
     * 
     */
    INVALID_FEED_NAME,

    /**
     * 
     *                 There is no feed attribute in an active feed with the given name.
     *               
     * 
     */
    INVALID_FEED_ATTRIBUTE_NAME;

    public String value() {
        return name();
    }

    public static FeedAttributeReferenceErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
