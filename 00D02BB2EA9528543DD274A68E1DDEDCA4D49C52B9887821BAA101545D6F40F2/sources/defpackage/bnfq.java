package defpackage;
/* compiled from: PG */
/* renamed from: bnfq  reason: default package */
/* loaded from: classes3.dex */
public final class bnfq implements bnen {
    private final jbj a;
    private final jbe b;
    private final jbd c;

    public bnfq(iyj iyjVar, ixv ixvVar, ixb ixbVar, bwrs<ilo> bwrsVar, cdjd cdjdVar) {
        String str = null;
        this.a = iyjVar.b(bwrsVar, cdjdVar, null);
        ilo c = bwrsVar.c();
        this.b = ixvVar.a(cdjdVar, c != null ? c.n() : str, false);
        this.c = ixbVar.a(bwrsVar, cdjdVar);
    }

    @Override // defpackage.bnen
    public jbj a() {
        return this.a;
    }

    @Override // defpackage.bnen
    public jbe b() {
        return this.b;
    }

    @Override // defpackage.bnen
    public jbd c() {
        return this.c;
    }
}
