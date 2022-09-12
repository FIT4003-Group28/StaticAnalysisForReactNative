package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: dyad  reason: default package */
/* loaded from: classes6.dex */
public final class dyad implements dyac {
    public static final cxmb<Boolean> a;
    public static final cxmb<Boolean> b;
    public static final cxmb<Long> c;
    public static final cxmb<String> d;
    public static final cxmb<Long> e;

    static {
        cxml a2 = new cxml("com.google.android.libraries.consent.flows.location").a();
        a = a2.d("LocationHistoryConsentFeature__enable_network_error_message", false);
        b = a2.d("LocationHistoryConsentFeature__kill_switch_on", false);
        c = a2.c("LocationHistoryConsentFeature__mobile_text_service_deadline_ms", 10000L);
        d = a2.e("LocationHistoryConsentFeature__mobile_text_service_host", "mobiletextsservice-pa.googleapis.com");
        e = a2.c("LocationHistoryConsentFeature__mobile_text_service_port", 443L);
    }

    @Override // defpackage.dyac
    public final boolean a(Context context) {
        return a.b(context).booleanValue();
    }

    @Override // defpackage.dyac
    public final boolean b(Context context) {
        return b.b(context).booleanValue();
    }

    @Override // defpackage.dyac
    public final long c(Context context) {
        return c.b(context).longValue();
    }

    @Override // defpackage.dyac
    public final String d(Context context) {
        return d.b(context);
    }

    @Override // defpackage.dyac
    public final long e(Context context) {
        return e.b(context).longValue();
    }
}
