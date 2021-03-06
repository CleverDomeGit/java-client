/**
 * GetUserSecurityGroupsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class GetUserSecurityGroupsResponse  implements java.io.Serializable {
    private com.cleverdome.api.OperationResultOfArrayOfSecurityGroupwJCT_PyJf getUserSecurityGroupsResult;

    public GetUserSecurityGroupsResponse() {
    }

    public GetUserSecurityGroupsResponse(
           com.cleverdome.api.OperationResultOfArrayOfSecurityGroupwJCT_PyJf getUserSecurityGroupsResult) {
           this.getUserSecurityGroupsResult = getUserSecurityGroupsResult;
    }


    /**
     * Gets the getUserSecurityGroupsResult value for this GetUserSecurityGroupsResponse.
     * 
     * @return getUserSecurityGroupsResult
     */
    public com.cleverdome.api.OperationResultOfArrayOfSecurityGroupwJCT_PyJf getGetUserSecurityGroupsResult() {
        return getUserSecurityGroupsResult;
    }


    /**
     * Sets the getUserSecurityGroupsResult value for this GetUserSecurityGroupsResponse.
     * 
     * @param getUserSecurityGroupsResult
     */
    public void setGetUserSecurityGroupsResult(com.cleverdome.api.OperationResultOfArrayOfSecurityGroupwJCT_PyJf getUserSecurityGroupsResult) {
        this.getUserSecurityGroupsResult = getUserSecurityGroupsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetUserSecurityGroupsResponse)) return false;
        GetUserSecurityGroupsResponse other = (GetUserSecurityGroupsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getUserSecurityGroupsResult==null && other.getGetUserSecurityGroupsResult()==null) || 
             (this.getUserSecurityGroupsResult!=null &&
              this.getUserSecurityGroupsResult.equals(other.getGetUserSecurityGroupsResult())));
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
        if (getGetUserSecurityGroupsResult() != null) {
            _hashCode += getGetUserSecurityGroupsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetUserSecurityGroupsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetUserSecurityGroupsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getUserSecurityGroupsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetUserSecurityGroupsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CleverDomeDocumentManagement.Data", "OperationResultOfArrayOfSecurityGroupwJCT_PyJf"));
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
