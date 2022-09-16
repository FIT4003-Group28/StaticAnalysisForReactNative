package defpackage;
/* compiled from: PG */
/* renamed from: axss  reason: default package */
/* loaded from: classes2.dex */
public final class axss implements axsr {
    public static final vbt a;
    public static final vbt b;

    static {
        vbr vbrVar = new vbr(vbi.a("com.google.android.gms.measurement"));
        a = vbrVar.f("measurement.client.consent.suppress_1p_in_ga4f_install", true);
        b = vbrVar.f("measurement.client.consent.gmpappid_worker_thread_fix", true);
    }

    @Override // defpackage.axsr
    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    @Override // defpackage.axsr
    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    @Override // defpackage.axsr
    public final void c() {
    }
}
