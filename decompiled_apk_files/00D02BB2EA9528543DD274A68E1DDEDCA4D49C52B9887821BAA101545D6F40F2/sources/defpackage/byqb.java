package defpackage;
/* compiled from: PG */
/* renamed from: byqb  reason: default package */
/* loaded from: classes4.dex */
public enum byqb {
    NOT_ENABLED(0, "Device not enabled to send Smartspace notifications"),
    NO_CLIENT_CAPABILITY(1, "No client capability to send Smartspace notifications"),
    FAILURE_TO_BIND(2, "Failure to bind to RemoteSearchService"),
    TIMEOUT(3, "Timeout sending Smartspace notification"),
    NO_ACCOUNT_NAME(4, "No account name found for user"),
    SECURITY_EXCEPTION_WHILE_BINDING(5, "Security exception while binding to RemoteSearchService"),
    SECURITY_EXCEPTION_WHILE_QUERYING_GSA(6, "Security exception while querying GSA"),
    SECURITY_EXCEPTION_WHILE_SENDING_NOTIFICATION(7, "Security exception while sending notification"),
    SECURITY_EXCEPTION_WHILE_ENDING_RSS_SESSION(8, "Security exception while ending RSS session"),
    REMOTE_EXCEPTION_WHILE_QUERYING_GSA(9, "Remote exception while querying GSA"),
    REMOTE_EXCEPTION_WHILE_SENDING_NOTIFICATION(10, "Remote exception while sending notification"),
    REMOTE_EXCEPTION_WHILE_ENDING_RSS_SESSION(11, "Remote exception while ending RSS session"),
    OTHER_EXCEPTION_WHILE_BINDING(12, "Exception while binding to RemoteSearchService"),
    OTHER_EXCEPTION_WHILE_QUERYING_GSA(13, "Exception while querying GSA"),
    OTHER_EXCEPTION_WHILE_SENDING_NOTIFICATION(14, "Exception while sending notification"),
    OTHER_EXCEPTION_WHILE_ENDING_RSS_SESSION(15, "Exception while ending RSS session"),
    INVALID_PROTOCOL_BUFFER_EXCEPTION_WHILE_PROCESSING_GSA_RESPONSE(16, "Invalid protocol buffer exception while processing GSA response"),
    GSA_RESPONSE_INVALID_EVENT_ID(17, "GSA response has invalid event ID"),
    GSA_RESPONSE_MISSING(18, "GSA response missing"),
    GSA_RESPONSE_NOT_SMARTSPACE_ENABLED(19, "GSA response not smartspace enabled"),
    NULL_REMOTE_SEARCH_SERVICE_SESSION_WHILE_PROCESSING_GSA_RESPONSE(20, "Null RSS session while processing GSA response"),
    NULL_REMOTE_SEARCH_SERVICE_SESSION_WHILE_SENDING_NOTIFICATION(21, "Null RSS session while sending notification"),
    TOMBSTONE_SUCCESSFUL(22, "Tombstone successful"),
    SEND_SUCCESSFUL(23, "Send successful"),
    GMM_ACCOUNT_NULL(24, "GMM account is null"),
    SHOULD_SUPPRESS_NOTIFICATION(25, "Should suppress commute notification for session"),
    SMARTSPACE_NOTIFICATION_NULL(26, "Null Smartspace notification"),
    CONFIG_SETTINGS_NO_SMARTSPACE_COMMUTE(27, "Smartspace commute not enabled in config settings"),
    REMOTE_SEARCH_SERVICE_ALREADY_EXISTS(28, "RemoteSearchService connection already exists"),
    SMARTSPACE_PARAMETERS_TRANSIT_NOT_ENABLED(29, "Transit commute prameters not enabled for Smartspace");
    
    public final int E;
    public final String F;

    byqb(int i, String str) {
        this.E = i;
        this.F = str;
    }
}
