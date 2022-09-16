package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nfp  reason: default package */
/* loaded from: classes3.dex */
public final class nfp implements Runnable {
    public boolean a = false;
    public boolean b = false;
    public float c;
    public int d;
    final /* synthetic */ nfq e;

    public nfp(nfq nfqVar) {
        this.e = nfqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.a = false;
        this.b = false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a) {
            return;
        }
        nfq nfqVar = this.e;
        if (nfqVar.q == null) {
            apzg apzgVar = nfqVar.o;
            if (apzgVar == null) {
                apzgVar = nfqVar.m;
                acti oi = nfqVar.d.oi();
                if (oi != null && oi.c() != null) {
                    oi.n(new acte(actj.SWIPE_TO_CAMERA_START_ACTION));
                    aopa createBuilder = atnp.a.createBuilder();
                    String str = oi.c().a;
                    createBuilder.copyOnWrite();
                    atnp atnpVar = (atnp) createBuilder.instance;
                    str.getClass();
                    atnpVar.b |= 1;
                    atnpVar.c = str;
                    int i = actj.SWIPE_TO_CAMERA_START_ACTION.II;
                    createBuilder.copyOnWrite();
                    atnp atnpVar2 = (atnp) createBuilder.instance;
                    atnpVar2.b |= 2;
                    atnpVar2.d = i;
                    aopc aopcVar = (aopc) apzgVar.mo52toBuilder();
                    aopcVar.e(atno.b, (atnp) createBuilder.mo39build());
                    aopcVar.copyOnWrite();
                    apzg apzgVar2 = (apzg) aopcVar.instance;
                    apzgVar2.b &= -2;
                    apzgVar2.c = apzg.a.c;
                    apzgVar = (apzg) aopcVar.mo39build();
                }
            }
            this.e.q = hml.p(apzgVar, true, true);
            nfq nfqVar2 = this.e;
            hml hmlVar = nfqVar2.q;
            hmlVar.as = nfqVar2;
            if (!hmlVar.ap()) {
                ex l = this.e.c.l();
                l.q(this.d, this.e.q, "creation_fragment");
                l.k();
            }
            if (this.b) {
                this.e.q.av.a();
                this.b = false;
            }
        }
        hmm hmmVar = this.e.q.ar;
        float f = this.c;
        hmc hmcVar = ((hmh) hmmVar).a.an;
        if (hmcVar != null) {
            hmcVar.aj = f;
        }
        this.a = false;
    }
}
