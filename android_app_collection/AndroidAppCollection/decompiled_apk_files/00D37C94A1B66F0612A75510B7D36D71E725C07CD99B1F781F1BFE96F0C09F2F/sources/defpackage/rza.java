package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
/* compiled from: PG */
/* renamed from: rza  reason: default package */
/* loaded from: classes4.dex */
public final class rza extends dp {
    public static final anay a = sbs.e();
    public static final ryp b;
    public static final ryp c;
    public static final amup d;
    public static final amup e;
    public ryq ae;
    public ryh af;
    public boolean ag;
    private String ah;
    private boolean ai;

    static {
        ryp c2 = ryp.c(2, 106);
        b = c2;
        c = ryp.b(109);
        amum h = amup.h();
        h.f("invalid_request", ryp.b(101));
        h.f("unauthorized_client", ryp.b(102));
        h.f("access_denied", ryp.c(2, 103));
        h.f("unsupported_response_type", ryp.b(104));
        h.f("invalid_scope", ryp.b(105));
        h.f("server_error", c2);
        h.f("temporarily_unavailable", ryp.c(2, 107));
        d = h.b();
        amum h2 = amup.h();
        h2.f("invalid_request", aotq.EVENT_APP_AUTH_INVALID_REQUEST);
        h2.f("unauthorized_client", aotq.EVENT_APP_AUTH_UNAUTHORIZED_CLIENT);
        h2.f("access_denied", aotq.EVENT_APP_AUTH_ACCESS_DENIED);
        h2.f("unsupported_response_type", aotq.EVENT_APP_AUTH_UNSUPPORTED_RESPONSE_TYPE);
        h2.f("invalid_scope", aotq.EVENT_APP_AUTH_INVALID_SCOPE);
        h2.f("server_error", aotq.EVENT_APP_AUTH_SERVER_ERROR);
        h2.f("temporarily_unavailable", aotq.EVENT_APP_AUTH_TEMPORARILY_UNAVAILABLE);
        e = h2.b();
    }

    public static rza a(String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("auth_url", str);
        bundle.putBoolean("need_one_time_auth_code", z);
        rza rzaVar = new rza();
        rzaVar.ae(bundle);
        return rzaVar;
    }

    @Override // defpackage.dp
    public final void S(int i, int i2, Intent intent) {
        super.S(i, i2, intent);
        this.af.h(aotq.EVENT_APP_AUTH_RECEIVE_ACTIVITY_RESULT);
        ((anav) a.k().i("com/google/android/libraries/accountlinking/flows/weboauth/WebOAuthFragment", "onActivityResult", 167, "WebOAuthFragment.java")).q("WebOAuthFragment received onActivityResult()");
        new Handler().postDelayed(new Runnable() { // from class: ryz
            @Override // java.lang.Runnable
            public final void run() {
                rza rzaVar = rza.this;
                if (rzaVar.ag) {
                    rzaVar.ag = false;
                    return;
                }
                ((anav) rza.a.k().i("com/google/android/libraries/accountlinking/flows/weboauth/WebOAuthFragment", "lambda$onActivityResult$0", 172, "WebOAuthFragment.java")).q("Custom Tab is closed by user");
                rzaVar.af.h(aotq.EVENT_APP_AUTH_DISMISS);
                rzaVar.ae.d(ryp.b(110));
            }
        }, 20L);
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        Intent intent;
        super.mQ(bundle);
        aC();
        Bundle bundle2 = this.m;
        bundle2.getClass();
        String string = bundle2.getString("auth_url");
        string.getClass();
        this.ah = string;
        this.ai = bundle2.getBoolean("need_one_time_auth_code");
        this.ae = (ryq) bb.a(mJ()).a(ryq.class);
        ryh ryhVar = (ryh) bb.a(mJ()).a(ryh.class);
        this.af = ryhVar;
        ryhVar.i(aots.STATE_APP_AUTH);
        String a2 = bact.a(rb());
        if (a2 == null) {
            this.af.h(aotq.EVENT_APP_AUTH_NO_CUSTOM_TABS_SUPPORTED_BROWSER);
            ((anav) a.k().i("com/google/android/libraries/accountlinking/flows/weboauth/WebOAuthFragment", "getCustomTabsPackage", 263, "WebOAuthFragment.java")).q("WebOAuth flow cannot be started because no custom tabs supported web browser is found on this device");
        }
        if (a2 != null) {
            String str = this.ah;
            intent = new aeq().a().a;
            intent.setPackage(a2);
            intent.setData(Uri.parse(str));
            if (!this.ai) {
                intent.setFlags(1073741824);
            }
            ((anav) a.k().i("com/google/android/libraries/accountlinking/flows/weboauth/WebOAuthFragment", "onCreate", 127, "WebOAuthFragment.java")).q("WebOAuthFragment is starting CustomTabs.");
        } else {
            ampq a3 = ryy.a(rb());
            if (!a3.h()) {
                this.af.h(aotq.EVENT_APP_AUTH_NO_BROWSER_FOUND);
                this.ae.d(ryp.b(108));
                ((anav) ((anav) a.g()).i("com/google/android/libraries/accountlinking/flows/weboauth/WebOAuthFragment", "onCreate", 139, "WebOAuthFragment.java")).q("WebOAuth flow cannot be started because no web browser is found on this device");
                return;
            }
            String str2 = this.ah;
            intent = new Intent("android.intent.action.VIEW");
            intent.setPackage((String) a3.c());
            intent.setData(Uri.parse(str2));
            if (!this.ai) {
                intent.setFlags(1073741824);
            }
            ((anav) a.k().i("com/google/android/libraries/accountlinking/flows/weboauth/WebOAuthFragment", "onCreate", 143, "WebOAuthFragment.java")).q("WebOAuthFragment is starting Browser.");
        }
        this.ag = false;
        startActivityForResult(intent, 1001);
    }
}
