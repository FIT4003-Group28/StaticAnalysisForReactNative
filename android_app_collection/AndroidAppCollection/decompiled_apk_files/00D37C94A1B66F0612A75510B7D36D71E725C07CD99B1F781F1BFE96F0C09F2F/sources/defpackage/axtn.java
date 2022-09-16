package defpackage;
/* compiled from: PG */
/* renamed from: axtn  reason: default package */
/* loaded from: classes2.dex */
public final class axtn implements axtm {
    public static final vbt a;
    public static final vbt b;

    static {
        vbr vbrVar = new vbr(vbi.a("com.google.android.gms.measurement"));
        vbrVar.d("measurement.id.lifecycle.app_in_background_parameter", 0L);
        a = vbrVar.f("measurement.lifecycle.app_backgrounded_engagement", false);
        vbrVar.f("measurement.lifecycle.app_backgrounded_tracking", true);
        b = vbrVar.f("measurement.lifecycle.app_in_background_parameter", false);
        vbrVar.d("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }

    @Override // defpackage.axtm
    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    @Override // defpackage.axtm
    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
