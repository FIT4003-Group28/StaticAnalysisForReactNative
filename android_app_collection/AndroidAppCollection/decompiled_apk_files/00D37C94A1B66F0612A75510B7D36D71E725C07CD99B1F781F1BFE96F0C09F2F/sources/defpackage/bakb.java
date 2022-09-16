package defpackage;
/* compiled from: PG */
/* renamed from: bakb  reason: default package */
/* loaded from: classes2.dex */
public class bakb extends bakc {
    private final int b;
    private final bahv c;

    public bakb(bahp bahpVar, bahv bahvVar, bahv bahvVar2) {
        super(bahpVar, bahvVar);
        if (!bahvVar2.g()) {
            throw new IllegalArgumentException("Range duration field must be precise");
        }
        int e = (int) (bahvVar2.e() / this.a);
        this.b = e;
        if (e >= 2) {
            this.c = bahvVar2;
            return;
        }
        throw new IllegalArgumentException("The effective range must be at least 2");
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final int a(long j) {
        if (j >= 0) {
            return (int) ((j / this.a) % this.b);
        }
        int i = this.b;
        return (i - 1) + ((int) (((j + 1) / this.a) % i));
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final int c() {
        return this.b - 1;
    }

    @Override // defpackage.bakc, defpackage.bajr, defpackage.bahn
    public final long h(long j, int i) {
        bajw.e(this, i, 0, c());
        return j + ((i - a(j)) * this.a);
    }

    @Override // defpackage.bahn
    public final bahv r() {
        return this.c;
    }
}
