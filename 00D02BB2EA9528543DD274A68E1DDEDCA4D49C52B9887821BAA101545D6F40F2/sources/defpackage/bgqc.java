package defpackage;
/* compiled from: PG */
/* renamed from: bgqc  reason: default package */
/* loaded from: classes3.dex */
final class bgqc implements appn {
    final /* synthetic */ bgqd a;

    public bgqc(bgqd bgqdVar) {
        this.a = bgqdVar;
    }

    @Override // defpackage.appn
    public final void a() {
        this.a.e.h();
    }

    @Override // defpackage.appn
    public final void b() {
        bgqb bgqbVar = this.a.d;
        bgqbVar.E(!bgqbVar.j().booleanValue());
    }

    @Override // defpackage.appn
    public final void c(boolean z) {
        this.a.e.c(z);
        bgqd bgqdVar = this.a;
        if (!bgqdVar.h || !z) {
            return;
        }
        bgqdVar.d.K(bgqdVar.f);
        bgqd bgqdVar2 = this.a;
        if (!bgqdVar2.g) {
            bgqdVar2.d.d();
        }
        this.a.h = false;
    }

    @Override // defpackage.appn
    public final void d() {
        this.a.b.s();
    }

    @Override // defpackage.appn
    public final void e() {
    }
}
