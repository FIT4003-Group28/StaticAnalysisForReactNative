package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bgqi  reason: default package */
/* loaded from: classes3.dex */
public final class bgqi implements appn {
    final /* synthetic */ bgqj a;

    public bgqi(bgqj bgqjVar) {
        this.a = bgqjVar;
    }

    @Override // defpackage.appn
    public final void a() {
        bgqj bgqjVar = this.a;
        apnq apnqVar = bgqjVar.f;
        if (apnqVar.b != bgqjVar) {
            apnqVar.c(bgqjVar);
        }
        bgpw bgpwVar = this.a.j.d;
        if (bgpwVar != null) {
            bgpwVar.h();
        }
    }

    @Override // defpackage.appn
    public final void b() {
        bgqh bgqhVar = this.a.c;
        bgqhVar.E(!bgqhVar.j().booleanValue());
    }

    @Override // defpackage.appn
    public final void c(boolean z) {
        bgqj bgqjVar = this.a;
        Runnable runnable = bgqjVar.m;
        if (runnable == null || z || !bgqjVar.c.H().booleanValue()) {
            return;
        }
        runnable.run();
    }

    @Override // defpackage.appn
    public final void d() {
        bgqj bgqjVar = this.a;
        bgqjVar.h.a(bgqjVar.a, bgqjVar.b, bgqjVar.l, bgqjVar.c.k().booleanValue(), this.a.c.j().booleanValue(), this.a.c.m().intValue());
    }

    @Override // defpackage.appn
    public final void e() {
        bgpw bgpwVar = this.a.j.d;
        if (bgpwVar != null) {
            bgpwVar.b(false);
        }
    }
}
