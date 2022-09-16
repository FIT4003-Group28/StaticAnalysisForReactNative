package defpackage;
/* compiled from: PG */
/* renamed from: azin  reason: default package */
/* loaded from: classes2.dex */
final class azin implements ayom {
    final ayom a;
    final ayok b;
    boolean d = true;
    final ayqm c = new ayqm();

    public azin(ayom ayomVar, ayok ayokVar) {
        this.a = ayomVar;
        this.b = ayokVar;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        if (this.d) {
            this.d = false;
        }
        this.a.c(obj);
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        ayqi.f(this.c, aypgVar);
    }

    @Override // defpackage.ayom
    public final void sm() {
        if (this.d) {
            this.d = false;
            this.b.az(this);
            return;
        }
        this.a.sm();
    }
}
