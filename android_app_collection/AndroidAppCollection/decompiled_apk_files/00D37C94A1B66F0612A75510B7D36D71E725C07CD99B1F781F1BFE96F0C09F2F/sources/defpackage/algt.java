package defpackage;
/* compiled from: PG */
/* renamed from: algt  reason: default package */
/* loaded from: classes.dex */
public abstract class algt {
    public final avuo j;
    private final albf o;
    private final alht p;

    public algt(avuo avuoVar, albf albfVar, alht alhtVar) {
        this.j = avuoVar;
        this.o = albfVar;
        this.p = alhtVar;
    }

    public abstract albu a(alcw alcwVar);

    public abstract alct b(alcw alcwVar);

    public ankt d(String str, akzp akzpVar) {
        return anlz.q(t(this.p.e(), false));
    }

    public abstract aypx e();

    public abstract String f();

    public abstract boolean h();

    public boolean j() {
        return false;
    }

    public albu l() {
        return null;
    }

    public abstract akzs m(Throwable th, String str, akzp akzpVar, boolean z);

    public abstract ankt p(String str, akzp akzpVar);

    public void r(long j, alcw alcwVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final akzs t(alct alctVar, boolean z) {
        return u(alctVar, z, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final akzs u(alct alctVar, boolean z, ayqb ayqbVar) {
        aypx e = e();
        if (e == null) {
            throw new IllegalStateException("Only GarbageCollection has a null setState func and should not call createJobUpdater");
        }
        return new algs(this, this.o, alctVar, ayqbVar, alctVar, z, e);
    }
}
