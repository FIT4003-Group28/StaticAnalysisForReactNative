package defpackage;
/* compiled from: PG */
/* renamed from: axsy  reason: default package */
/* loaded from: classes2.dex */
public final class axsy implements axsx {
    public static final vbt a;

    static {
        vbr vbrVar = new vbr(vbi.a("com.google.android.gms.measurement"));
        a = vbrVar.f("measurement.client.sessions.check_on_reset_and_enable2", true);
        vbrVar.f("measurement.client.sessions.check_on_startup", true);
        vbrVar.f("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // defpackage.axsx
    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    @Override // defpackage.axsx
    public final void b() {
    }
}
