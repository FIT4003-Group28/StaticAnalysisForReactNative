package defpackage;
/* compiled from: PG */
/* renamed from: axrl  reason: default package */
/* loaded from: classes2.dex */
public final class axrl implements axrk {
    public static final vbt a;

    static {
        vbr vbrVar = new vbr(vbi.a("com.google.android.gms.droidguard"));
        a = vbrVar.f("droidguard_enable_local_apk_signature_verification_in_client", true);
        vbrVar.f("droidguard_enable_local_apk_signature_verification_in_module", true);
    }

    @Override // defpackage.axrk
    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
