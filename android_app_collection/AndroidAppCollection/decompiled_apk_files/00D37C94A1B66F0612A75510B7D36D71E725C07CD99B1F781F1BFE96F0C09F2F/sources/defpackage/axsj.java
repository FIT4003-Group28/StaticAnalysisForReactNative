package defpackage;
/* compiled from: PG */
/* renamed from: axsj  reason: default package */
/* loaded from: classes2.dex */
public final class axsj implements axsi {
    public static final vbt a;
    public static final vbt b;

    static {
        vbr vbrVar = new vbr(vbi.a("com.google.android.gms.measurement"));
        a = vbrVar.f("measurement.euid.client.dev", false);
        b = vbrVar.f("measurement.euid.service", false);
    }

    @Override // defpackage.axsi
    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    @Override // defpackage.axsi
    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
