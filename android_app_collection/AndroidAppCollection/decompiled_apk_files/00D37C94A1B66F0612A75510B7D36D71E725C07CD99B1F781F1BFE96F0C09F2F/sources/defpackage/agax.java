package defpackage;
/* compiled from: PG */
/* renamed from: agax  reason: default package */
/* loaded from: classes.dex */
public final class agax {
    private final acsf a;

    public agax(acsf acsfVar) {
        this.a = acsfVar;
    }

    private final void e(int i) {
        this.a.b(new acsd(i - 1, 10), aqzj.FLOW_TYPE_CHIME_REGISTRATION);
    }

    public final void a(Throwable th) {
        e(6);
        afus.c(2, 7, "Chime registration error", th);
    }

    public final void b() {
        e(5);
    }

    public final void c(Throwable th) {
        e(8);
        afus.c(2, 7, "Chime unregistration error", th);
    }

    public final void d() {
        e(7);
    }
}
