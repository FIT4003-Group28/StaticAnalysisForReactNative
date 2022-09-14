package defpackage;
/* compiled from: PG */
/* renamed from: eatd  reason: default package */
/* loaded from: classes6.dex */
public class eatd extends eate {
    private final int b;
    private final eaox c;

    public eatd(eaop eaopVar, eaox eaoxVar, eaox eaoxVar2) {
        super(eaopVar, eaoxVar);
        if (!eaoxVar2.c()) {
            throw new IllegalArgumentException("Range duration field must be precise");
        }
        int d = (int) (eaoxVar2.d() / this.a);
        this.b = d;
        if (d >= 2) {
            this.c = eaoxVar2;
            return;
        }
        throw new IllegalArgumentException("The effective range must be at least 2");
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int A() {
        return this.b - 1;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int d(long j) {
        if (j >= 0) {
            return (int) ((j / this.a) % this.b);
        }
        int i = this.b;
        return (i - 1) + ((int) (((j + 1) / this.a) % i));
    }

    @Override // defpackage.eate, defpackage.eass, defpackage.eaon
    public final long p(long j, int i) {
        easy.e(this, i, w(), A());
        return j + ((i - d(j)) * this.a);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final eaox t() {
        return this.c;
    }
}
