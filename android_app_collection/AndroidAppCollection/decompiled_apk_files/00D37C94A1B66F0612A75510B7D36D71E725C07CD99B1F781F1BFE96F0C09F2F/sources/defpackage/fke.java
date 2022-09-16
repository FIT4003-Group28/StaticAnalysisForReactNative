package defpackage;
/* compiled from: PG */
/* renamed from: fke  reason: default package */
/* loaded from: classes3.dex */
public final class fke extends ajts {
    private final axnm b;

    public fke(axnm axnmVar) {
        this.b = axnmVar;
    }

    @Override // defpackage.ajsr
    public final void a() {
        ((ajtj) this.b.get()).a();
    }

    @Override // defpackage.ajsr
    public final void b() {
        ((ajtj) this.b.get()).b();
    }

    @Override // defpackage.ajts
    protected final boolean c() {
        ajti ajtiVar = ((ajts) this).a;
        g(ajtiVar.b);
        ajth a = ajti.a();
        a.g(ajtiVar.a);
        a.b(ajtiVar.b);
        a.f(ajtiVar.c);
        a.e(ajtiVar.d);
        a.c(ajtiVar.e);
        a.d(ajtiVar.f);
        a.h(ajtiVar.g);
        a.i(ajtiVar.h);
        return ((ajtj) this.b.get()).e(a.a());
    }

    @Override // defpackage.ajts
    protected final boolean d(ajtg ajtgVar) {
        return true;
    }
}
