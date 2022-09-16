package defpackage;
/* compiled from: PG */
/* renamed from: aajx  reason: default package */
/* loaded from: classes.dex */
final class aajx implements ayom {
    private final ayom a;
    private final aajy b;

    public aajx(ayom ayomVar, aajy aajyVar) {
        this.a = ayomVar;
        this.b = aajyVar;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        this.a.sj(new aajw(aypgVar, this.b));
    }

    @Override // defpackage.ayom
    public final void sm() {
        this.a.sm();
    }
}
