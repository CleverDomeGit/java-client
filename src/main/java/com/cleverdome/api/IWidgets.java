/**
 * IWidgets.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cleverdome.api;

public interface IWidgets extends java.rmi.Remote {
    public com.cleverdome.api.OperationResultOfVendorInfo52SKXdDF getVendorCertInfo(java.lang.String sessionID) throws java.rmi.RemoteException;
    public com.cleverdome.api.UploadResultOfVendorInfo52SKXdDF updateVendorCert(byte[] inputStream) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfdateTime archiveDocumentRevisions(java.lang.String sessionID, java.lang.String[] revisionGuids, java.lang.Integer retentionPeriod, java.lang.Integer retentionUnit) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfboolean createNewVendor(java.lang.String sessionID, java.lang.String name) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfboolean isCurrentRevisionViewedByCurrentUser(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfint addDocumentEvent(java.lang.String sessionID, java.lang.String documentGuid, java.lang.Integer documentEvent) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfguiduHEDJ7Dj getDocumentsForEventsNotArchived(java.lang.String sessionID, int[] eventIDs, java.lang.Integer applicationID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType markForArchive(java.lang.String sessionID, java.lang.String documentGuid, java.lang.Integer retentionPeriodYears) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfboolean markedForArchival(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfboolean archiveLatestVesion(java.lang.String sessionID, java.lang.String documentGuid, java.lang.Integer years) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType removeDocumentIndex(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType updateWorkflowPendingDocument(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException;
    public void getQualityReviewReport(java.lang.String begindDate, java.lang.String endDate, java.lang.Integer timePeriod) throws java.rmi.RemoteException;
    public void getObjectLayout(java.lang.String fieldID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType updateWorkflowForDocument(java.lang.String sessionID, java.lang.String documentGuid, java.lang.Integer docEventID, java.lang.String[] batchDocumentGuids) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType addTermToSearchStatistics(java.lang.String sessionID, java.lang.Integer applicationID, java.lang.String searchTerm, com.cleverdome.api.DocumentMetadataValueBase metadataValue) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType addFacetToSearchStatistics(java.lang.String sessionID, java.lang.Integer applicationID, com.cleverdome.api.DocumentMetadataValueBase metadataValue) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType addDocumentSelectionStatistics(java.lang.String sessionID, java.lang.Integer applicationID, java.lang.String documentGuid, com.cleverdome.api.DocumentMetadataValueBase[] metadataValues, java.lang.Boolean previewedOnly) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfChangedDocumentwJCT_PyJf getDocumentsInProcessing(java.lang.String sessionID, java.lang.Integer applicationID, com.cleverdome.api.DocumentMetadataValueBase[] metadataValues) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfRecentDocumentsInfowJCT_PyJf getRecentDocuments(java.lang.String sessionID, java.lang.String[] documentGuids, java.lang.Integer sharedUserId, java.lang.String documentFilter, com.cleverdome.api.DocumentMetadataValueBase[] metadataValues) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfUpdatedDocumentsInfowJCT_PyJf getDocumentsWithUpdates(java.lang.String sessionID, com.cleverdome.api.ListPagerParams listPageInfo, com.cleverdome.api.FilterOptions filterOptions, java.lang.Integer sharedUserID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfTrustedUser50La3KLP getTrustedUsers(java.lang.String sessionID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfTrustedUser50La3KLP addTrustedUser(java.lang.String sessionID, java.lang.Integer trustedUserID, java.lang.Integer phoneId) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType deleteTrustedUser(java.lang.String sessionID, java.lang.Integer trustedUserID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType sendInviteTrustedUser(java.lang.String sessionID, java.lang.Integer trustedUserID, java.lang.Integer vendorID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfTrustedUser50La3KLP inviteTrustedUser(java.lang.String sessionID, java.lang.String firstName, java.lang.String lastName, java.lang.String email, java.lang.String mobilePhone, java.lang.Integer vendorID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfDocumentsSharingInfo50La3KLP getDocumentsSharingInfo(java.lang.String sessionID, java.lang.String[] documentGuids) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType setPermissionsForUser(java.lang.String sessionID, java.lang.String[] documentGuids, java.lang.Integer userID, java.lang.Integer securityLevel) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType shareDocument(java.lang.String sessionID, java.lang.Integer securityLevel, java.lang.Boolean sendEmail, java.util.Calendar expirationDate, int[] userIDs, java.lang.String[] documentGuids, java.lang.String message, java.lang.Integer vendorID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType shareAllDocuments(java.lang.String sessionID, java.lang.Integer securityLevel, java.lang.Boolean sendEmail, int[] userIDs, com.cleverdome.api.FilterOptions filterOptions, java.lang.Integer sharedUserId, java.lang.String[] additionalDocGuids, java.lang.String message, java.lang.Integer vendorID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType removeSharedDocumentRights(java.lang.String sessionID, java.lang.String[] documentGuids, java.lang.Integer userID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType changSharedDocumentSecurityLevel(java.lang.String sessionID, java.lang.String[] documentGuids, java.lang.Integer userID, java.lang.Integer securityLevel) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType changSharedDocumentExpiration(java.lang.String sessionID, java.lang.String[] documentGuids, java.lang.Integer userID, java.util.Calendar expirationDate) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfstring isEnoughSpaceToUploadFile(java.lang.Integer applicationID, java.lang.String sessionId, java.lang.Long fileSize, java.lang.String fileExtension) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfUploadCheckResult52SKXdDF checkIfCanUploadDocument(java.lang.String sessionID, java.lang.Integer applicationID, java.lang.Long fileSize, java.lang.String fileExtension) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfUploadCheckResult52SKXdDF checkIfCanReuploadDocument(java.lang.String sessionID, java.lang.String documentGuid, java.lang.Long fileSize, java.lang.String fileExtension) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfBucketQuotaInfo52SKXdDF getBucketQuotaInfo(java.lang.Integer applicationID, java.lang.String sessionID, java.lang.Integer sharedUserID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType lockUnlockDocsForDelete(java.lang.String sessionID, java.lang.String[] documentGuids, java.lang.Boolean lockDocuments) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfdateTime archiveDocuments(java.lang.String sessionID, java.lang.String[] documentGuids, java.lang.Integer retentionPeriod, java.lang.Integer retentionUnit) throws java.rmi.RemoteException;
    public com.cleverdome.api.BarcodesDataList getDocumentActiveBarcodes(byte[] inputStream) throws java.rmi.RemoteException;
    public com.cleverdome.api.DocumentRevision addDocumentRevision(byte[] inputStream) throws java.rmi.RemoteException;
    public java.lang.String addExternalDocumentRevision(java.lang.String parentDocGuid, java.lang.Long fileSize, java.util.Calendar revisionDate, java.lang.Integer uploadedBy, java.lang.String fileType, java.lang.String sha1Hash, java.lang.String versionID, java.lang.Integer appID) throws java.rmi.RemoteException;
    public byte[] downloadDocumentRevision(java.lang.String sessionID, java.lang.String documentGuid, java.lang.String revisionGuid) throws java.rmi.RemoteException;
    public byte[] getDocumentHTML(java.lang.String sessionID, java.lang.String documentGuid, java.lang.String revisionGuid) throws java.rmi.RemoteException;
    public byte[] downloadDocumentHeadRevision(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException;
    public byte[] getDocumentsArchive(java.lang.String sessionID, java.lang.String documentGuids) throws java.rmi.RemoteException;
    public byte[] downloadDocuments(java.lang.String sessionID, java.lang.String downloadID) throws java.rmi.RemoteException;
    public java.lang.String getSpecifiedDocsDownloadID(java.lang.String sessionID, java.lang.String[] documentGuids) throws java.rmi.RemoteException;
    public java.lang.String getAllFilteredDocsDownloadID(java.lang.String sessionID, com.cleverdome.api.FilterOptions filterOptions, java.lang.Integer sharedUserId, java.lang.String[] additionalDocGuids) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfBulkUploadResponseMh1QQS5Z bulkUploadDocuments(byte[] input) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfguiduHEDJ7Dj getLackDeletePermissionDocuments(java.lang.String sessionID, java.lang.String[] documentGuids) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfboolean removeDocument(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType removeDocuments(java.lang.String sessionID, java.lang.String[] documentGuids) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfboolean deleteDocumentsPermamently(java.lang.String sessionID, java.lang.String[] documentIDs) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfint removeAllDocuments(java.lang.String sessionID, com.cleverdome.api.FilterOptions filterOptions, java.lang.Integer sharedUserId, java.lang.String[] additionalDocGuids) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfboolean repairRemovedDocuments(java.lang.String sessionID, java.lang.String[] documentGuids, java.lang.Integer sharedUserId) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfboolean repairAllRemovedDocuments(java.lang.String sessionID, java.lang.Integer batchID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfDocumentNotejJIl8QZi getDocumentNotes(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfDocumentNotejJIl8QZi createDocumentNote(java.lang.String sessionID, java.lang.String documentGuid, java.lang.String note) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfDisplayDocumentInfowJCT_PyJf getDocumentPages(java.lang.String sessionID, java.lang.String documentGuid, java.lang.String revisionGuid, java.lang.Integer pageNumber) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType burnAnnotations(java.lang.String sessionID, java.lang.String revisionGuid) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType setAnnotation(java.lang.String sessionID, java.lang.String revisionGuid, java.lang.String annID, java.lang.String data) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfDocumentPreviewDatawJCT_PyJf getDocumentPreviewInfo(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType setupBatchForDocument(java.lang.String sessionID, java.lang.String documentGuid, java.lang.Integer batchTypeID, com.cleverdome.api.DocumentMetadataValueBase[] values) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfDocumentBatchwJCT_PyJf getDocumentBatches(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfguiduHEDJ7Dj getBatchItems(java.lang.String sessionID, java.lang.Integer batchID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfDocumentBatchItemForApproval52SKXdDF getDocumentBatchItemsForApproval(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType copyMetadataToNextBatchItem(java.lang.String sessionID, java.lang.Integer batchID, java.lang.Integer sequence) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfListPageDataOfBarcodeData4T4GnWAZYbvldztq getDocumentBarcodes(java.lang.String sessionID, com.cleverdome.api.ListPagerParams listPageInfo) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType saveDocumentBarcode(java.lang.String sessionID, com.cleverdome.api.BarcodeData barcode) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfDocumentLockInformationwJCT_PyJf getDocumentLockInformation(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType lockDocument(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType removeDocumentLock(java.lang.String sessionID, java.lang.String documentGuid, java.lang.Boolean resetDocument) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfBaseDocumentDocumentEventjJIl8QZi getWorkflowEvents(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfBaseDocumentDocumentEventjJIl8QZi getWorkflowEventsCurrentRevision(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfBaseDocumentEventjJIl8QZi getWorkflowEvent(java.lang.String sessionID, java.lang.Integer documentEvent) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfDocumentMetadataValuewJCT_PyJf getUserDefinedMetadata(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfboolean setMetadataValues(java.lang.String sessionID, java.lang.String documentGuid, com.cleverdome.api.DocumentMetadataValueBase[] documentMetadata, int[] removeRecordIDs) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfDocumentMetadataValueBasewJCT_PyJf getIntegratedMetadata(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfDocumentFieldwJCT_PyJf getIntegratedFieldTypesForDocument(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfDocumentFieldDetailedwJCT_PyJf getAllAvailableDocumentFieldTypesDetailed(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfguiduHEDJ7Dj getDocumentsByMetadataValue(java.lang.String sessionID, java.lang.Integer applicationID, java.lang.Integer documentTypeID, java.lang.Integer fieldType, java.lang.String fieldValue, java.lang.Integer limit, int[] requiredEvents) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfDocumentMetadataValueBasewJCT_PyJf getMetadataValuesForFieldType(java.lang.String sessionID, java.lang.String documentGuid, java.lang.Integer fieldTypeID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfDocumentTemplatewJCT_PyJf getTemplatesByMetadata(java.lang.String sessionID, com.cleverdome.api.DocumentMetadataValueBase[] metadataValues, java.lang.Integer applicationID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfDocumentTypewJCT_PyJf getDocumentTypesByMetadata(java.lang.String sessionID, com.cleverdome.api.DocumentMetadataValueBase[] metadataValues, java.lang.Integer applicationID, java.lang.Integer templateID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfApplicationTypewJCT_PyJf getApplications(java.lang.String sessionID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfDefaultTemplateTypewJCT_PyJf getDefaulTemplateAndDescription(java.lang.String sessionID, java.lang.Integer applicationID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfESignDataWOI_P4YU8 getDocumentEsignInfo(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfListPageDataOfESignDataWOI_P4YU8Ybvldztq getEsignEnvelopes(java.lang.String sessionID, java.lang.String status, com.cleverdome.api.ListPagerParams listPageInfo) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfstringuHEDJ7Dj getAllEsignStatuses(java.lang.String sessionID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfSecurityGroupwJCT_PyJf getSecurityGroupsByType(java.lang.String sessionID, java.lang.String documentGuid, java.lang.Integer securityGroupType) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfSecurityGroupDatawJCT_PyJf getSecurityGroups(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfSecurityGroupwJCT_PyJf getSecurityGroupByID(java.lang.String sessionID, java.lang.Integer groupID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfSecurityGroupwJCT_PyJf createSecurityGroup(java.lang.String sessionID, java.lang.String name, java.lang.String description, java.lang.Integer type, java.lang.Integer ownerID, java.lang.Integer templateApplicationID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType removeSecurityGroup(java.lang.String sessionID, java.lang.Integer securityGroupID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfUserDatawJCT_PyJf getUsersForGroup(java.lang.String sessionID, java.lang.Integer groupID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfSecurityGroupwJCT_PyJf getUserSecurityGroups(java.lang.String sessionID, java.lang.Integer userID, java.lang.Boolean isOwner, java.lang.Integer securityGroupType) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfUserDatawJCT_PyJf addUserToSecurityGroup(java.lang.String sessionID, java.lang.Integer groupID, java.lang.Integer userID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType removeUserFromSecurityGroup(java.lang.String sessionID, java.lang.Integer groupID, java.lang.Integer userID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfUserDatawJCT_PyJf searchUsers(java.lang.String sessionID, java.lang.String searchTerm) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfUserDatawJCT_PyJf getUserDataByEmail(java.lang.String sessionID, java.lang.String email, java.lang.String phone) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfSecurityGroupwJCT_PyJf searchSecurityGroup(java.lang.String sessionID, java.lang.String searchTerm) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfSecurityGroupwJCT_PyJf searchSecurityGroupNotAdded(java.lang.String sessionID, java.lang.String searchTerm, java.lang.String documentGuid) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType removeSecurityGroupFromDocument(java.lang.String sessionID, java.lang.String documentGuid, java.lang.Integer securityGroupID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfSecurityGroupTypewJCT_PyJf getSecurityGroupTypes(java.lang.String sessionID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType removeAllSecurityGroupsFromDocument(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType attachSecurityGroupsToDocument(java.lang.String sessionID, java.lang.String documentGuid, int[] securityGroupIDs, java.lang.Integer securityLevel) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfint getPermissionsForCurrentUser(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfNullableOfint5F2DSckg getBatchIDForCriteria(java.lang.String sessionID, com.cleverdome.api.DocumentMetadataValueBase[] valsToSearch, com.cleverdome.api.ImagingBatchBatchTypes batchType) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType markRequiredDocumentsComplete(java.lang.String sessionID, java.lang.String documentGuid, java.lang.Integer batchID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfboolean userCanEditMetadata(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfDocumentRevisionwJCT_PyJf getDocumentRevisions(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfDocumentwJCT_PyJf getDocument(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfDocumentDetailedMetadataInfowJCT_PyJf getDocumentDetailedMetadataInfo(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfDocumentMetadataEntrywJCT_PyJf getDocumentMetadata(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfDocumentMetadataValueBasewJCT_PyJf getDocumentMetadataBase(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfDocumentFieldwJCT_PyJf getAllowedFieldsForDocument(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfDocumentFieldwJCT_PyJf getAvailableFields(java.lang.String sessionID, java.lang.Integer applicationID, java.lang.Integer templateID, java.lang.Integer typeID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfDocumentFieldwJCT_PyJf getDocumentRequiredFields(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfint addDocumentField(java.lang.String sessionID, java.lang.String documentGuid, java.lang.Integer fieldID, java.lang.String fieldValue) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType removeDocumentField(java.lang.String sessionID, java.lang.String documentGuid, java.lang.Integer valueID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType removeDocumentFieldByValue(java.lang.String sessionID, java.lang.String documentGuid, java.lang.Integer fieldTypeID, java.lang.String fieldValue) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfDocumentTagwJCT_PyJf getDocumentTags(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfDocumentTagwJCT_PyJf getUserTags(java.lang.String sessionID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfDocumentTagwJCT_PyJf addDocumentTag(java.lang.String sessionID, java.lang.String documentGuid, java.lang.String tagName) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfboolean addTagsToDocuments(java.lang.String sessionID, java.lang.String[] tagNames, java.lang.String[] documentGuids) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfboolean editDocumentsTags(java.lang.String sessionID, java.lang.String[] tagNamesDelete, java.lang.String[] tagNamesInsert, java.lang.String[] documentGuids) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfboolean editAllDocumentsTags(java.lang.String sessionID, java.lang.String[] tagNamesDelete, java.lang.String[] tagNamesInsert, java.lang.Integer sharedUserId, com.cleverdome.api.FilterOptions filterOptions, java.lang.String[] additionalDocGuids) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType removeDocumentTag(java.lang.String sessionID, java.lang.String documentGuid, java.lang.Integer tagID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType removeDocumentTagByName(java.lang.String sessionID, java.lang.String documentGuid, java.lang.String tagName) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfBaseDocumentMetadataHierarchyElementjJIl8QZi getDocumentMetadataHierarchy(java.lang.String sessionID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfBaseDocumentMetadataHierarchyElementjJIl8QZi getMetadataHierarchysBehalfUser(java.lang.String sessionID, java.lang.Integer userID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfguiduHEDJ7Dj addMetadataHierarchyNode(java.lang.String sessionID, com.cleverdome.api.BaseDocumentMetadataHierarchyElement[] elems, java.lang.Integer sharedUserId) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfboolean moveMetadataHierarchyNode(java.lang.String sessionID, java.lang.String nodeID, java.lang.String parentNodeID, java.lang.Integer sharedUserId) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType removeMetadataHierarchyNode(java.lang.String sessionID, java.lang.String nodeID, java.lang.Integer sharedUserId) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfboolean renameMetadataHierarchyNode(java.lang.String sessionID, java.lang.String nodeID, java.lang.String newValue, java.lang.Integer sharedUserId) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfAlertE_P4QZOfs createUserTagAlert(java.lang.String sessionID, java.lang.String userTagID, java.lang.String name, java.lang.Integer typeID, java.lang.Integer scheduleTypeID, java.lang.Boolean isClient, java.lang.Integer vendorID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfboolean updateUserTagAlert(java.lang.String sessionID, java.lang.Integer alertID, java.lang.String userTagID, java.lang.String name, java.lang.Integer typeID, java.lang.Integer scheduleTypeID, java.lang.Boolean isClient, java.lang.Integer vendorID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfboolean deleteUserTagAlert(java.lang.String sessionID, java.lang.Integer alertID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfDocumentFieldTypewJCT_PyJf getAvailableFieldTypesForDocumentType(java.lang.String sessionID, java.lang.Integer applicationID, java.lang.Integer templateID, java.lang.Integer typeID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfDocumentFieldwJCT_PyJf addFieldToDocumentType(java.lang.String sessionID, java.lang.Integer applicationID, java.lang.Integer templateID, java.lang.Integer typeID, com.cleverdome.api.DocumentFieldType fieldType) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType removeFieldFromDocumentType(java.lang.String sessionID, java.lang.Integer applicationID, java.lang.Integer templateID, java.lang.Integer typeID, java.lang.Integer fieldID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfDocumentFieldTypewJCT_PyJf getAllFieldTypes(java.lang.String sessionID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfstring searchDocumentMetadata(java.lang.String sessionID, java.lang.String searchTerm, java.lang.Boolean searchTagsOnly, com.cleverdome.api.DocumentMetadataValueBase[] requiredValues, java.lang.Integer applicationID, java.lang.Integer templateID, java.lang.Integer typeID, java.lang.String documentFilter) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfstring getFacetSearchSuggest(java.lang.String sessionID, com.cleverdome.api.DocumentMetadataValueBase[] requiredValues, java.lang.Integer applicationID, java.lang.Integer templateID, java.lang.Integer typeID, java.lang.String searchTerm, java.lang.String documentFilter, java.lang.Integer fieldTypeID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfstringuHEDJ7Dj getFacetFieldNames(java.lang.String sessionID, com.cleverdome.api.DocumentMetadataValueBase[] requiredValues, java.lang.Integer applicationID, java.lang.Integer templateID, java.lang.Integer typeID, java.lang.String searchTerm, java.lang.String documentFilter) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfstring searchFacetValues(java.lang.String sessionID, com.cleverdome.api.DocumentMetadataValueBase[] requiredValues, java.lang.String searchTerm, java.lang.String commonSearchTerm, java.lang.Integer fieldTypeID, java.lang.Integer applicationID, java.lang.Integer templateID, java.lang.Integer typeID, java.lang.String documentFilter) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfSearcheableMetadataTypewJCT_PyJf getAllSearcheableFields(java.lang.String sessionID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfDocumentDashboardwJCT_PyJf getDashboardEvents(java.lang.String sessionID, java.lang.Integer applicationID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfDocumentRevisionHistorywJCT_PyJf getEventsForDocument(java.lang.String sessionID, java.lang.String documentGuid, int[] eventIds) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfDocumentRevisionArchiveInfowJCT_PyJf getArchiveInfoForDocument(java.lang.String sessionID, java.lang.String[] documentGuids) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType setDefaultDescriptionForApplication(java.lang.String sessionID, java.lang.Integer applicationID, java.lang.Integer templateID, java.lang.Integer descriptionID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfguiduHEDJ7Dj getDocumentsForEventsByMetaValue(java.lang.String sessionID, int[] eventIDs, java.lang.Integer applicationID, java.lang.String dbValue, java.lang.Integer metaID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfguiduHEDJ7Dj getDocumentsForEvents(java.lang.String sessionID, int[] eventIDs, java.lang.Integer applicationID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfDocumentwJCT_PyJf getListOfDocumentsByEvent(java.lang.String sessionID, java.lang.Integer applicationID, java.lang.Integer documentEventID, java.lang.Integer pageSize, java.lang.Integer pageNumber) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfDocumentwJCT_PyJf getFilterDocuments(java.lang.String sessionID, java.lang.Integer templateID, java.lang.Integer documentTypeID, java.util.Calendar fromDate, java.util.Calendar toDate, com.cleverdome.api.FieldValue[] fieldValues, java.lang.Integer documentEventID, java.lang.Integer orderType, java.lang.Integer pageSize, java.lang.Integer applicationID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfDocumentDetailedMetadataInfowJCT_PyJf getFilterDocumentsWithMetadata(java.lang.String sessionID, java.lang.Integer templateID, java.lang.Integer documentTypeID, java.lang.Integer applicationID, com.cleverdome.api.FieldValue[][] fieldValueGroups) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfListPageDataOfDocumentSearchResultwJCT_PyJfYbvldztq getDeactivatedDocuments(java.lang.String sessionID, com.cleverdome.api.ListPagerParams listPageInfo, java.lang.Integer applicationID, com.cleverdome.api.DocumentMetadataValueBase[] metadataValues) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType changeDocumentApplication(java.lang.String sessionID, java.lang.String documentGuid, java.lang.Integer applicationID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfBaseDocumentEventjJIl8QZi getAvailableDocumentEventsForApplication(java.lang.String sessionID, java.lang.Integer applicationID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfBaseDocumentEventjJIl8QZi getAllDocumentEvents(java.lang.String sessionID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfListPageDataOfDocumentwJCT_PyJfYbvldztq getRelatedDocuments(java.lang.String sessionID, java.lang.String documentGuid, com.cleverdome.api.ListPagerParams listPageInfo, java.lang.Integer orderType) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfDocumentwJCT_PyJf getDocumensByTags(java.lang.String sessionID, java.lang.String[] tags, java.lang.Integer pageSize, java.lang.Integer pageNumber) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfListPageDataOfDocumentSearchResultwJCT_PyJfYbvldztq getDocumentsInfoByMetadataValue(java.lang.String sessionID, com.cleverdome.api.ListPagerParams listPageInfo, com.cleverdome.api.FilterOptions filterOptions) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfListPageDataOfDocumentSearchResultwJCT_PyJfYbvldztq getDocumentsBehalfSharedUser(java.lang.String sessionID, com.cleverdome.api.ListPagerParams listPageInfo, com.cleverdome.api.FilterOptions filterOptions, java.lang.Integer sharedUserID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfPermittedTagTreesInfo52SKXdDF getPermittedTagTrees(java.lang.String sessionID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfDocumentTemplatewJCT_PyJf createDocumentTemplate(java.lang.String sessionID, java.lang.String name) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType removeDocumentTemplate(java.lang.String sessionID, java.lang.Integer templateID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType unlinkTemplate(java.lang.String sessionID, java.lang.Integer templateID, java.lang.Integer applicationID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfDocumentTemplatewJCT_PyJf getAllDocumentTemplates(java.lang.String sessionID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfDocumentTemplatewJCT_PyJf getDocumentTemplate(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfDocumentTemplatewJCT_PyJf getDocumentTemplates(java.lang.String sessionID, java.lang.Integer applicationID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType setDocumentTemplate(java.lang.String sessionID, java.lang.String documentGuid, java.lang.Integer templateID, java.lang.Integer documentTypeID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfDocumentTypewJCT_PyJf createDocumentType(java.lang.String sessionID, java.lang.Integer applicationID, java.lang.Integer templateID, java.lang.String name) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfanyType removeDocumentType(java.lang.String sessionID, java.lang.Integer applicationID, java.lang.Integer templateID, java.lang.Integer typeID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfDocumentTypewJCT_PyJf getDocumentType(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfDocumentTypewJCT_PyJf getDocumentTypes(java.lang.String sessionID, java.lang.Integer templateID, java.lang.Integer applicationID) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfArrayOfDocumentTypewJCT_PyJf getAllDocumentTypes(java.lang.String sessionID) throws java.rmi.RemoteException;
    public java.lang.String uploadFile(byte[] inputStream) throws java.rmi.RemoteException;
    public java.lang.String flxFileUpload(byte[] inputStream) throws java.rmi.RemoteException;
    public java.lang.String uploadFileJava(java.lang.String sessionID, java.lang.Integer applicationID, java.lang.Integer templateID, java.lang.Integer descriptionID, com.cleverdome.api.DocumentMetadataValueBase[] metadataValues, java.lang.String filename, byte[] inputStream) throws java.rmi.RemoteException;
    public java.lang.String addNewExternalDocument(java.lang.String fileName, java.lang.String cdSession, java.lang.Integer applicationID, java.lang.Integer templateID, java.lang.Integer typeID, com.cleverdome.api.DocumentMetadataValueBase[] metadata) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfDocumentDetailswJCT_PyJf getDocumentDetailed(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException;
    public com.cleverdome.api.OperationResultOfDocumentDetailswJCT_PyJf getDocumentDetailedWithoutPages(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException;
}