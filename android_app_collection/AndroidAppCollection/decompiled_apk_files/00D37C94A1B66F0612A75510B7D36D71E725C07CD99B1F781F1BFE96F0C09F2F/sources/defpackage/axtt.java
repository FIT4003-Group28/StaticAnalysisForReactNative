package defpackage;
/* compiled from: PG */
/* renamed from: axtt  reason: default package */
/* loaded from: classes2.dex */
public final class axtt implements axts {
    public static final vbt a;

    static {
        vbr vbrVar = new vbr(vbi.a("com.google.android.gms.measurement"));
        a = vbrVar.f("measurement.validation.internal_limits_internal_event_params", false);
        vbrVar.d("measurement.id.validation.internal_limits_internal_event_params", 0L);
    }

    @Override // defpackage.axts
    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
