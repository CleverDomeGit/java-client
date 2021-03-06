/**
 * GetDashboardEventsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetDashboardEventsResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfArrayOfDocumentDashboardwJCT_PyJf getDashboardEventsResult;

    public GetDashboardEventsResponse() {
    }

    public GetDashboardEventsResponse(
           com.cleverdome.api.OperationResultOfArrayOfDocumentDashboardwJCT_PyJf getDashboardEventsResult) {
           this.getDashboardEventsResult = getDashboardEventsResult;
    }


    /**
     * Gets the getDashboardEventsResult value for this GetDashboardEventsResponse.
     * 
     * @return getDashboardEventsResult
     */
    public com.cleverdome.api.OperationResultOfArrayOfDocumentDashboardwJCT_PyJf getGetDashboardEventsResult() {
        return getDashboardEventsResult;
    }


    /**
     * Sets the getDashboardEventsResult value for this GetDashboardEventsResponse.
     * 
     * @param getDashboardEventsResult
     */
    public void setGetDashboardEventsResult(com.cleverdome.api.OperationResultOfArrayOfDocumentDashboardwJCT_PyJf getDashboardEventsResult) {
        this.getDashboardEventsResult = getDashboardEventsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDashboardEventsResponse)) return false;
        GetDashboardEventsResponse other = (GetDashboardEventsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDashboardEventsResult==null && other.getGetDashboardEventsResult()==null) || 
             (this.getDashboardEventsResult!=null &&
              this.getDashboardEventsResult.equals(other.getGetDashboardEventsResult())));
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
        if (getGetDashboardEventsResult() != null) {
            _hashCode += getGetDashboardEventsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDashboardEventsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDashboardEventsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDashboardEventsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDashboardEventsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfDocumentDashboardwJCT_PyJf"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
