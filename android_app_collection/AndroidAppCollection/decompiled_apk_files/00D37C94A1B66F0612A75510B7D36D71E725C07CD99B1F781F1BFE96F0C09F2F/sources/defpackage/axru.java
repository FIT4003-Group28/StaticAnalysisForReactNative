package defpackage;
/* compiled from: PG */
/* renamed from: axru  reason: default package */
/* loaded from: classes2.dex */
public final class axru implements axrt {
    public static final vbt a;

    static {
        vbr vbrVar = new vbr(vbi.a("com.google.android.gms.measurement"));
        a = vbrVar.f("measurement.androidId.delete_feature", true);
        vbrVar.f("measurement.log_androidId_enabled", false);
    }

    @Override // defpackage.axrt
    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
