/**
 * Copyright 2016 SAP SE
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.09.26 at 11:44:06 AM EEST
//


package com.sap.cloud.sfsf.notification;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the test.autorizacion package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ExternalEventResponse_QNAME = new QName("http://notification.event.successfactors.com", "ExternalEventResponse");
    private final static QName _ExternalEvent_QNAME = new QName("http://notification.event.successfactors.com", "ExternalEvent");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: test.autorizacion
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EenAlertRequestData }
     *
     */
    public EenAlertRequestData createEenAlertRequestData() {
        return new EenAlertRequestData();
    }

    /**
     * Create an instance of {@link ExternalEvent }
     *
     */
    public ExternalEvent createExternalEvent() {
        return new ExternalEvent();
    }

    /**
     * Create an instance of {@link ExternalEventResponse }
     *
     */
    public ExternalEventResponse createExternalEventResponse() {
        return new ExternalEventResponse();
    }

    /**
     * Create an instance of {@link EenAlertResponsePayload }
     *
     */
    public EenAlertResponsePayload createEenAlertResponsePayload() {
        return new EenAlertResponsePayload();
    }

    /**
     * Create an instance of {@link Param }
     *
     */
    public Param createParam() {
        return new Param();
    }

    /**
     * Create an instance of {@link Events }
     *
     */
    public Events createEvents() {
        return new Events();
    }

    /**
     * Create an instance of {@link EenAlertRequestMeta }
     *
     */
    public EenAlertRequestMeta createEenAlertRequestMeta() {
        return new EenAlertRequestMeta();
    }

    /**
     * Create an instance of {@link EenAlertRequestData.EntityKeys }
     *
     */
    public EenAlertRequestData.EntityKeys createEenAlertRequestDataEntityKeys() {
        return new EenAlertRequestData.EntityKeys();
    }

    /**
     * Create an instance of {@link EenAlertRequestData.Params }
     *
     */
    public EenAlertRequestData.Params createEenAlertRequestDataParams() {
        return new EenAlertRequestData.Params();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalEventResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://notification.event.successfactors.com", name = "ExternalEventResponse")
    public JAXBElement<ExternalEventResponse> createExternalEventResponse(final ExternalEventResponse value) {
        return new JAXBElement<>(_ExternalEventResponse_QNAME, ExternalEventResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalEvent }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://notification.event.successfactors.com", name = "ExternalEvent")
    public JAXBElement<ExternalEvent> createExternalEvent(final ExternalEvent value) {
        return new JAXBElement<>(_ExternalEvent_QNAME, ExternalEvent.class, null, value);
    }

}
