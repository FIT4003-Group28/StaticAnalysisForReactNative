package defpackage;
/* compiled from: PG */
/* renamed from: easu  reason: default package */
/* loaded from: classes6.dex */
public class easu extends eass {
    public final eaon b;

    /* JADX INFO: Access modifiers changed from: protected */
    public easu(eaon eaonVar, eaop eaopVar) {
        super(eaopVar);
        if (eaonVar != null) {
            if (eaonVar.c()) {
                this.b = eaonVar;
                return;
            }
            throw new IllegalArgumentException("The field must be supported");
        }
        throw new IllegalArgumentException("The field must not be null");
    }

    @Override // defpackage.eass, defpackage.eaon
    public int A() {
        return this.b.A();
    }

    @Override // defpackage.eass, defpackage.eaon
    public long F(long j) {
        throw null;
    }

    @Override // defpackage.eass, defpackage.eaon
    public int d(long j) {
        throw null;
    }

    @Override // defpackage.eass, defpackage.eaon
    public long p(long j, int i) {
        return this.b.p(j, i);
    }

    @Override // defpackage.eass, defpackage.eaon
    public eaox s() {
        return this.b.s();
    }

    @Override // defpackage.eass, defpackage.eaon
    public eaox t() {
        return this.b.t();
    }

    @Override // defpackage.eass, defpackage.eaon
    public int w() {
        return this.b.w();
    }
}
