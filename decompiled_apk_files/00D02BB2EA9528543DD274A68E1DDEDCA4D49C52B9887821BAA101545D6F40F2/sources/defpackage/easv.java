package defpackage;
/* compiled from: PG */
/* renamed from: easv  reason: default package */
/* loaded from: classes6.dex */
public class easv extends east {
    private static final long serialVersionUID = 8019982251647420015L;
    public final eaox b;

    public easv(eaox eaoxVar, eaoz eaozVar) {
        super(eaozVar);
        if (eaoxVar != null) {
            if (eaoxVar.b()) {
                this.b = eaoxVar;
                return;
            }
            throw new IllegalArgumentException("The field must be supported");
        }
        throw new IllegalArgumentException("The field must not be null");
    }

    @Override // defpackage.eaox
    public final boolean c() {
        return this.b.c();
    }

    @Override // defpackage.eaox
    public long d() {
        return this.b.d();
    }

    @Override // defpackage.eaox
    public long e(long j, int i) {
        return this.b.e(j, i);
    }

    @Override // defpackage.eaox
    public long f(long j, long j2) {
        return this.b.f(j, j2);
    }

    @Override // defpackage.eaox
    public long i(long j, long j2) {
        return this.b.i(j, j2);
    }
}
