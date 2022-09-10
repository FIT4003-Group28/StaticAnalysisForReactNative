package defpackage;
/* compiled from: PG */
/* renamed from: crxi  reason: default package */
/* loaded from: classes5.dex */
final class crxi implements dbsz<crua> {
    private final crxn a;
    private final long b;
    private long c = 0;
    private double d = -1.0d;

    public crxi(crxn crxnVar, long j) {
        this.a = crxnVar;
        this.b = j;
    }

    @Override // defpackage.dbsz
    public final /* bridge */ /* synthetic */ void NU(crua cruaVar) {
        crua cruaVar2 = cruaVar;
        this.c = Math.max(cruaVar2.i, this.c);
        if ((cruaVar2.a & 32) == 0) {
            long j = this.b;
            double d = dcyn.a;
            if (j > 0) {
                double d2 = cruaVar2.i;
                double d3 = j;
                Double.isNaN(d2);
                Double.isNaN(d3);
                d = Math.min(1.0d, Math.max((double) dcyn.a, d2 / d3));
            }
            dsqp dsqpVar = (dsqp) cruaVar2.cu(5);
            dsqpVar.bC(cruaVar2);
            crtt crttVar = (crtt) dsqpVar;
            if (crttVar.c) {
                crttVar.bF();
                crttVar.c = false;
            }
            crua cruaVar3 = (crua) crttVar.b;
            cruaVar3.a |= 32;
            cruaVar3.h = d;
            cruaVar2 = crttVar.bK();
        }
        if (this.a.h() || this.d >= cruaVar2.h) {
            return;
        }
        dsqp dsqpVar2 = (dsqp) cruaVar2.cu(5);
        dsqpVar2.bC(cruaVar2);
        crtt crttVar2 = (crtt) dsqpVar2;
        String uri = this.a.k.toString();
        if (crttVar2.c) {
            crttVar2.bF();
            crttVar2.c = false;
        }
        crua cruaVar4 = (crua) crttVar2.b;
        uri.getClass();
        int i = cruaVar4.a | 2;
        cruaVar4.a = i;
        cruaVar4.c = uri;
        crts crtsVar = this.a.l;
        crtsVar.getClass();
        cruaVar4.d = crtsVar;
        cruaVar4.a = i | 4;
        crua bK = crttVar2.bK();
        this.d = bK.h;
        this.a.Sv(bK);
    }

    public final long b() {
        long j = this.c;
        this.c = 0L;
        return j;
    }
}
