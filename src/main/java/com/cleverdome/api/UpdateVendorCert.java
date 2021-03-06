/**
 * UpdateVendorCert.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class UpdateVendorCert  implements java.io.Serializable {
    private byte[] inputStream;

    public UpdateVendorCert() {
    }

    public UpdateVendorCert(
           byte[] inputStream) {
           this.inputStream = inputStream;
    }


    /**
     * Gets the inputStream value for this UpdateVendorCert.
     * 
     * @return inputStream
     */
    public byte[] getInputStream() {
        return inputStream;
    }


    /**
     * Sets the inputStream value for this UpdateVendorCert.
     * 
     * @param inputStream
     */
    public void setInputStream(byte[] inputStream) {
        this.inputStream = inputStream;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateVendorCert)) return false;
        UpdateVendorCert other = (UpdateVendorCert) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inputStream==null && other.getInputStream()==null) || 
             (this.inputStream!=null &&
              java.util.Arrays.equals(this.inputStream, other.getInputStream())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getInputStream() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInputStream());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInputStream(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateVendorCert.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UpdateVendorCert"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputStream");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "inputStream"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
