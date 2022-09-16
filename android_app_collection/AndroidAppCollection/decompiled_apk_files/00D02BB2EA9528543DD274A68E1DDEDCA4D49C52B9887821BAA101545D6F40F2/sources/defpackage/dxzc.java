package defpackage;
/* compiled from: PG */
/* renamed from: dxzc  reason: default package */
/* loaded from: classes6.dex */
public final class dxzc implements dxzb {
    public static final cxju<Boolean> a;

    static {
        cxjs cxjsVar = new cxjs(cxjd.a("com.google.android.gms.droidguard"));
        a = cxjsVar.h("droidguard_enable_local_apk_signature_verification_in_client", true);
        cxjsVar.h("droidguard_enable_local_apk_signature_verification_in_module", true);
    }

    @Override // defpackage.dxzb
    public final boolean a() {
        return a.f().booleanValue();
    }
}
