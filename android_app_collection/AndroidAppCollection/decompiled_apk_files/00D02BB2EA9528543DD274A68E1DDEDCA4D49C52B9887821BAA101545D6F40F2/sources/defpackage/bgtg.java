package defpackage;
/* compiled from: PG */
/* renamed from: bgtg  reason: default package */
/* loaded from: classes3.dex */
final class bgtg implements bgrb {
    final /* synthetic */ bgtm a;

    public bgtg(bgtm bgtmVar) {
        this.a = bgtmVar;
    }

    @Override // defpackage.bgrb
    public final void a(brlu brluVar) {
        for (final ilo iloVar : brluVar.G()) {
            bnjs a = this.a.d.a(iloVar);
            a.i = true;
            brwk a2 = this.a.e.a(a, new Runnable(this, iloVar) { // from class: bgtf
                private final bgtg a;
                private final ilo b;

                {
                    this.a = this;
                    this.b = iloVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bgsf.e(this.b, this.a.a.c);
                }
            }, dkee.SHOPPING, false, false, false, null, dtxn.ez, null);
            a2.QR(bwrs.a(iloVar));
            this.a.b.put(iloVar.ai().o(), a2);
        }
        cqkx.p(this.a);
    }
}
