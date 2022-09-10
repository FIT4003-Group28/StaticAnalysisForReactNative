package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: earm  reason: default package */
/* loaded from: classes6.dex */
public final class earm extends easu {
    private final eaqt a;

    public earm(eaon eaonVar, eaqt eaqtVar) {
        super(eaonVar, eaop.d);
        this.a = eaqtVar;
    }

    @Override // defpackage.easu, defpackage.eass, defpackage.eaon
    public final int A() {
        return this.b.A();
    }

    @Override // defpackage.easu, defpackage.eass, defpackage.eaon
    public final long F(long j) {
        return this.b.F(j);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long G(long j) {
        return this.b.G(j);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long H(long j) {
        return this.b.H(j);
    }

    @Override // defpackage.easu, defpackage.eass, defpackage.eaon
    public final int d(long j) {
        int d = this.b.d(j);
        return d <= 0 ? 1 - d : d;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long k(long j, int i) {
        return this.b.k(j, i);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long l(long j, long j2) {
        return this.b.l(j, j2);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int n(long j, long j2) {
        return this.b.n(j, j2);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long o(long j, long j2) {
        return this.b.o(j, j2);
    }

    @Override // defpackage.easu, defpackage.eass, defpackage.eaon
    public final long p(long j, int i) {
        easy.e(this, i, 1, A());
        if (this.a.ac(j) <= 0) {
            i = 1 - i;
        }
        return super.p(j, i);
    }

    @Override // defpackage.easu, defpackage.eass, defpackage.eaon
    public final int w() {
        return 1;
    }
}
