package defpackage;
/* compiled from: PG */
/* renamed from: bakc  reason: default package */
/* loaded from: classes2.dex */
public abstract class bakc extends bajr {
    final long a;
    private final bahv b;

    public bakc(bahp bahpVar, bahv bahvVar) {
        super(bahpVar);
        if (!bahvVar.g()) {
            throw new IllegalArgumentException("Unit duration field must be precise");
        }
        long e = bahvVar.e();
        this.a = e;
        if (e >= 1) {
            this.b = bahvVar;
            return;
        }
        throw new IllegalArgumentException("The unit milliseconds must be at least 1");
    }

    @Override // defpackage.bahn
    public int d() {
        return 0;
    }

    @Override // defpackage.bajr, defpackage.bahn
    public long f(long j) {
        if (j >= 0) {
            return j % this.a;
        }
        long j2 = this.a;
        return (((j + 1) % j2) + j2) - 1;
    }

    @Override // defpackage.bajr, defpackage.bahn
    public long g(long j) {
        long j2;
        if (j >= 0) {
            j2 = j % this.a;
        } else {
            long j3 = j + 1;
            j2 = this.a;
            j = j3 - (j3 % j2);
        }
        return j - j2;
    }

    @Override // defpackage.bajr, defpackage.bahn
    public long h(long j, int i) {
        bajw.e(this, i, d(), v(j, i));
        return j + ((i - a(j)) * this.a);
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final bahv p() {
        return this.b;
    }

    protected int v(long j, int i) {
        return u(j);
    }
}
