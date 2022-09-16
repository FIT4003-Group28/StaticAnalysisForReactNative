package org.chromium.net;

import J.N;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.ThreadUtils;
/* compiled from: PG */
/* loaded from: classes4.dex */
public class HttpNegotiateAuthenticator {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "net_auth";
    private final String mAccountType;
    private Bundle mSpnegoContext;

    protected HttpNegotiateAuthenticator(String str) {
        this.mAccountType = str;
    }

    static HttpNegotiateAuthenticator create(String str) {
        return new HttpNegotiateAuthenticator(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processResult(Bundle bundle, badc badcVar) {
        this.mSpnegoContext = bundle.getBundle(HttpNegotiateConstants.KEY_SPNEGO_CONTEXT);
        int i = -9;
        switch (bundle.getInt(HttpNegotiateConstants.KEY_SPNEGO_RESULT, 1)) {
            case 0:
                i = 0;
                break;
            case 2:
                i = -3;
                break;
            case 3:
                i = NetError.ERR_UNEXPECTED_SECURITY_LIBRARY_STATUS;
                break;
            case 4:
                i = NetError.ERR_INVALID_RESPONSE;
                break;
            case 5:
                i = NetError.ERR_INVALID_AUTH_CREDENTIALS;
                break;
            case 6:
                i = NetError.ERR_UNSUPPORTED_AUTH_SCHEME;
                break;
            case 7:
                i = NetError.ERR_MISSING_AUTH_CREDENTIALS;
                break;
            case 8:
                i = NetError.ERR_UNDOCUMENTED_SECURITY_LIBRARY_STATUS;
                break;
            case 9:
                i = NetError.ERR_MALFORMED_IDENTITY;
                break;
        }
        N.M0s8NeYn(badcVar.a, this, i, bundle.getString("authtoken"));
    }

    private void requestTokenWithActivity(Context context, Activity activity, badc badcVar, String[] strArr) {
        int i = Build.VERSION.SDK_INT;
        boolean z = i < 23;
        String str = i < 23 ? "android.permission.MANAGE_ACCOUNTS" : "android.permission.GET_ACCOUNTS";
        if (lacksPermission(context, str, z)) {
            bacc.d(TAG, "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: %s permission not granted. Aborting authentication", str);
            N.M0s8NeYn(badcVar.a, this, NetError.ERR_MISCONFIGURED_AUTH_ENVIRONMENT, null);
            return;
        }
        badcVar.b.getAuthTokenByFeatures(this.mAccountType, badcVar.d, strArr, activity, null, badcVar.c, new badb(this, badcVar), new Handler(ThreadUtils.b()));
    }

    private void requestTokenWithoutActivity(Context context, badc badcVar, String[] strArr) {
        if (lacksPermission(context, "android.permission.GET_ACCOUNTS", true)) {
            bacc.d(TAG, "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: GET_ACCOUNTS permission not granted. Aborting authentication.", new Object[0]);
            N.M0s8NeYn(badcVar.a, this, NetError.ERR_MISCONFIGURED_AUTH_ENVIRONMENT, null);
            return;
        }
        badcVar.b.getAccountsByTypeAndFeatures(this.mAccountType, strArr, new badb(this, badcVar, 1), new Handler(ThreadUtils.b()));
    }

    void getNextAuthToken(long j, String str, String str2, boolean z) {
        Context context = babj.c;
        badc badcVar = new badc();
        badcVar.d = HttpNegotiateConstants.SPNEGO_TOKEN_TYPE_BASE + str;
        badcVar.b = AccountManager.get(context);
        badcVar.a = j;
        String[] strArr = {HttpNegotiateConstants.SPNEGO_FEATURE};
        badcVar.c = new Bundle();
        if (str2 != null) {
            badcVar.c.putString(HttpNegotiateConstants.KEY_INCOMING_AUTH_TOKEN, str2);
        }
        Bundle bundle = this.mSpnegoContext;
        if (bundle != null) {
            badcVar.c.putBundle(HttpNegotiateConstants.KEY_SPNEGO_CONTEXT, bundle);
        }
        badcVar.c.putBoolean(HttpNegotiateConstants.KEY_CAN_DELEGATE, z);
        babs babsVar = ApplicationStatus.a;
        requestTokenWithoutActivity(context, badcVar, strArr);
    }

    public boolean lacksPermission(Context context, String str, boolean z) {
        return (!z || Build.VERSION.SDK_INT < 23) && context.checkPermission(str, Process.myPid(), Process.myUid()) != 0;
    }
}
