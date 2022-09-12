package defpackage;
/* compiled from: PG */
/* renamed from: dybw  reason: default package */
/* loaded from: classes6.dex */
public final class dybw implements dybv {
    public static final cxju<Boolean> a;
    public static final cxju<Boolean> b;

    static {
        cxjs cxjsVar = new cxjs("phenotype__com.google.android.libraries.social.populous");
        a = cxjsVar.h("SocialAffinityLoggingFeature__log_external_event_source", true);
        b = cxjsVar.h("SocialAffinityLoggingFeature__log_is_boosted", false);
    }

    @Override // defpackage.dybv
    public final boolean a() {
        return a.f().booleanValue();
    }

    @Override // defpackage.dybv
    public final boolean b() {
        return b.f().booleanValue();
    }
}
