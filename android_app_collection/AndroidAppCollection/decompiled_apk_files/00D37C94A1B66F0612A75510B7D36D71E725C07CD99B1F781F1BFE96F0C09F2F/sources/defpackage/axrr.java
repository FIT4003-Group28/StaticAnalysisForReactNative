package defpackage;
/* compiled from: PG */
/* renamed from: axrr  reason: default package */
/* loaded from: classes2.dex */
public final class axrr implements axrq {
    public static final vbt a;
    public static final vbt b;

    static {
        vbr b2 = new vbr(vbi.a("com.google.android.gms.measurement")).b();
        a = b2.f("measurement.adid_zero.service", false);
        b = b2.f("measurement.adid_zero.remove_lair_if_adidzero_false", true);
    }

    @Override // defpackage.axrq
    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    @Override // defpackage.axrq
    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    @Override // defpackage.axrq
    public final void c() {
    }
}
