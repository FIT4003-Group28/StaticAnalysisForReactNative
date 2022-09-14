package defpackage;
/* compiled from: PG */
/* renamed from: ghv  reason: default package */
/* loaded from: classes6.dex */
final class ghv implements jco {
    final /* synthetic */ ghw a;

    public ghv(ghw ghwVar) {
        this.a = ghwVar;
    }

    @Override // defpackage.jco
    public final void a(int i, boolean z) {
        ghw ghwVar = this.a;
        int i2 = ghwVar.c;
        if (!z || i == i2) {
            return;
        }
        cjtd f = ghwVar.b.get(i).f();
        cjql a = this.a.b.get(i).g().a();
        cjqm cjqmVar = null;
        if (f != null && a != null) {
            cjqmVar = this.a.a.n(a, new cjte(deaf.SWIPE, i > this.a.c ? dead.LEFT : dead.RIGHT), f);
        }
        ghw ghwVar2 = this.a;
        ghwVar2.p(ghwVar2.b.get(i).e(), this.a.e);
        ghw ghwVar3 = this.a;
        ghwVar3.d.c(ghwVar3, i, 1, cjqmVar);
    }

    @Override // defpackage.jco
    public final void b(int i) {
    }
}
