package defpackage;
/* compiled from: PG */
/* renamed from: amyf  reason: default package */
/* loaded from: classes.dex */
public final class amyf extends amvg {
    static final amyf a = new amyf(new amxq());
    public final transient amxq b;
    private final transient int c;
    private transient amvn d;

    public amyf(amxq amxqVar) {
        this.b = amxqVar;
        long j = 0;
        for (int i = 0; i < amxqVar.c; i++) {
            j += amxqVar.c(i);
        }
        this.c = almu.v(j);
    }

    @Override // defpackage.amxj
    public final int a(Object obj) {
        return this.b.b(obj);
    }

    @Override // defpackage.amub
    public final boolean l() {
        throw null;
    }

    @Override // defpackage.amvg, defpackage.amxj
    /* renamed from: n */
    public final amvn i() {
        amvn amvnVar = this.d;
        if (amvnVar == null) {
            amyd amydVar = new amyd(this);
            this.d = amydVar;
            return amydVar;
        }
        return amvnVar;
    }

    @Override // defpackage.amvg
    public final amxk p(int i) {
        return this.b.m(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.amxj
    public final int size() {
        return this.c;
    }

    @Override // defpackage.amvg, defpackage.amub
    Object writeReplace() {
        return new amye(this);
    }
}
