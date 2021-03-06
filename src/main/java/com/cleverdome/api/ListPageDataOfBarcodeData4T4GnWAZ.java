/**
 * ListPageDataOfBarcodeData4T4GnWAZ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public class ListPageDataOfBarcodeData4T4GnWAZ  implements java.io.Serializable {
    private com.cleverdome.api.BarcodeData[] items;

    private java.lang.Integer totalCount;

    public ListPageDataOfBarcodeData4T4GnWAZ() {
    }

    public ListPageDataOfBarcodeData4T4GnWAZ(
           com.cleverdome.api.BarcodeData[] items,
           java.lang.Integer totalCount) {
           this.items = items;
           this.totalCount = totalCount;
    }


    /**
     * Gets the items value for this ListPageDataOfBarcodeData4T4GnWAZ.
     * 
     * @return items
     */
    public com.cleverdome.api.BarcodeData[] getItems() {
        return items;
    }


    /**
     * Sets the items value for this ListPageDataOfBarcodeData4T4GnWAZ.
     * 
     * @param items
     */
    public void setItems(com.cleverdome.api.BarcodeData[] items) {
        this.items = items;
    }


    /**
     * Gets the totalCount value for this ListPageDataOfBarcodeData4T4GnWAZ.
     * 
     * @return totalCount
     */
    public java.lang.Integer getTotalCount() {
        return totalCount;
    }


    /**
     * Sets the totalCount value for this ListPageDataOfBarcodeData4T4GnWAZ.
     * 
     * @param totalCount
     */
    public void setTotalCount(java.lang.Integer totalCount) {
        this.totalCount = totalCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListPageDataOfBarcodeData4T4GnWAZ)) return false;
        ListPageDataOfBarcodeData4T4GnWAZ other = (ListPageDataOfBarcodeData4T4GnWAZ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.items==null && other.getItems()==null) || 
             (this.items!=null &&
              java.util.Arrays.equals(this.items, other.getItems()))) &&
            ((this.totalCount==null && other.getTotalCount()==null) || 
             (this.totalCount!=null &&
              this.totalCount.equals(other.getTotalCount())));
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
        if (getItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalCount() != null) {
            _hashCode += getTotalCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListPageDataOfBarcodeData4T4GnWAZ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Pager", "ListPageDataOfBarcodeData4T4gnWAZ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("items");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Pager", "Items"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CDSImaging.Barcodes", "BarcodeData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CDSImaging.Barcodes", "BarcodeData"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/DocumentManagementCommon.Pager", "TotalCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
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
