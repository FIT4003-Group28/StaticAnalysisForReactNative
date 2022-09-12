package defpackage;
/* compiled from: PG */
/* renamed from: cmuj  reason: default package */
/* loaded from: classes5.dex */
public enum cmuj {
    CLIENT_LOGIN_DISABLED("ClientLoginDisabled"),
    SOCKET_TIMEOUT("SocketTimeout"),
    SUCCESS("Ok"),
    UNKNOWN_ERROR("UNKNOWN_ERR"),
    NETWORK_ERROR("NetworkError"),
    SERVICE_UNAVAILABLE("ServiceUnavailable"),
    INTNERNAL_ERROR("InternalError"),
    BAD_AUTHENTICATION("BadAuthentication"),
    BAD_TOKEN_REQUEST("BAD_REQUEST"),
    EMPTY_CONSUMER_PKG_OR_SIG("EmptyConsumerPackageOrSig"),
    NEEDS_2F("InvalidSecondFactor"),
    NEEDS_POST_SIGN_IN_FLOW("PostSignInFlowRequired"),
    NEEDS_BROWSER("NeedsBrowser"),
    UNKNOWN("Unknown"),
    NOT_VERIFIED("NotVerified"),
    TERMS_NOT_AGREED("TermsNotAgreed"),
    ACCOUNT_DISABLED("AccountDisabled"),
    CAPTCHA("CaptchaRequired"),
    ACCOUNT_DELETED("AccountDeleted"),
    SERVICE_DISABLED("ServiceDisabled"),
    NEED_PERMISSION("NeedPermission"),
    NEED_REMOTE_CONSENT("NeedRemoteConsent"),
    INVALID_SCOPE("INVALID_SCOPE"),
    USER_CANCEL("UserCancel"),
    PERMISSION_DENIED("PermissionDenied"),
    INVALID_AUDIENCE("INVALID_AUDIENCE"),
    UNREGISTERED_ON_API_CONSOLE("UNREGISTERED_ON_API_CONSOLE"),
    THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED("ThirdPartyDeviceManagementRequired"),
    DM_INTERNAL_ERROR("DeviceManagementInternalError"),
    DM_SYNC_DISABLED("DeviceManagementSyncDisabled"),
    DM_ADMIN_BLOCKED("DeviceManagementAdminBlocked"),
    DM_ADMIN_PENDING_APPROVAL("DeviceManagementAdminPendingApproval"),
    DM_STALE_SYNC_REQUIRED("DeviceManagementStaleSyncRequired"),
    DM_DEACTIVATED("DeviceManagementDeactivated"),
    DM_SCREENLOCK_REQUIRED("DeviceManagementScreenlockRequired"),
    DM_REQUIRED("DeviceManagementRequired"),
    DEVICE_MANAGEMENT_REQUIRED("DeviceManagementRequiredOrSyncDisabled"),
    ALREADY_HAS_GMAIL("ALREADY_HAS_GMAIL"),
    BAD_PASSWORD("WeakPassword"),
    BAD_REQUEST("BadRequest"),
    BAD_USERNAME("BadUsername"),
    DELETED_GMAIL("DeletedGmail"),
    EXISTING_USERNAME("ExistingUsername"),
    LOGIN_FAIL("LoginFail"),
    NOT_LOGGED_IN("NotLoggedIn"),
    NO_GMAIL("NoGmail"),
    REQUEST_DENIED("RequestDenied"),
    SERVER_ERROR("ServerError"),
    USERNAME_UNAVAILABLE("UsernameUnavailable"),
    GPLUS_OTHER("GPlusOther"),
    GPLUS_NICKNAME("GPlusNickname"),
    GPLUS_INVALID_CHAR("GPlusInvalidChar"),
    GPLUS_INTERSTITIAL("GPlusInterstitial"),
    GPLUS_PROFILE_ERROR("ProfileUpgradeError"),
    AUTH_SECURITY_ERROR("AuthSecurityError");
    
    private final String ad;

    cmuj(String str) {
        this.ad = str;
    }

    public static final cmuj a(String str) {
        cmuj[] values;
        cmuj cmujVar = UNKNOWN;
        for (cmuj cmujVar2 : values()) {
            if (true == cmujVar2.ad.equals(str)) {
                cmujVar = cmujVar2;
            }
        }
        return cmujVar;
    }

    public static boolean b(cmuj cmujVar) {
        return BAD_AUTHENTICATION.equals(cmujVar) || CAPTCHA.equals(cmujVar) || NEED_PERMISSION.equals(cmujVar) || NEED_REMOTE_CONSENT.equals(cmujVar) || NEEDS_BROWSER.equals(cmujVar) || USER_CANCEL.equals(cmujVar) || DEVICE_MANAGEMENT_REQUIRED.equals(cmujVar) || DM_INTERNAL_ERROR.equals(cmujVar) || DM_SYNC_DISABLED.equals(cmujVar) || DM_ADMIN_BLOCKED.equals(cmujVar) || DM_ADMIN_PENDING_APPROVAL.equals(cmujVar) || DM_STALE_SYNC_REQUIRED.equals(cmujVar) || DM_DEACTIVATED.equals(cmujVar) || DM_REQUIRED.equals(cmujVar) || THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(cmujVar) || DM_SCREENLOCK_REQUIRED.equals(cmujVar);
    }
}
