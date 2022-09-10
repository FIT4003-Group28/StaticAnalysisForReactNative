package defpackage;
/* compiled from: PG */
/* renamed from: bcu  reason: default package */
/* loaded from: classes3.dex */
public final class bcu implements bcg {
    private final z<bcf> c = new z<>();
    private final bid<bce> d = bid.e();

    public bcu() {
        b(bcg.b);
    }

    @Override // defpackage.bcg
    public final dehn<bce> a() {
        return this.d;
    }

    public final void b(bcf bcfVar) {
        this.c.f(bcfVar);
        if (bcfVar instanceof bce) {
            this.d.f((bid<bce>) ((bce) bcfVar));
        } else if (!(bcfVar instanceof bcc)) {
        } else {
            this.d.g(((bcc) bcfVar).a);
        }
    }
}
