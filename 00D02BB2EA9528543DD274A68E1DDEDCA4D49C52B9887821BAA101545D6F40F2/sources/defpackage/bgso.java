package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bgso  reason: default package */
/* loaded from: classes3.dex */
public final class bgso implements bgrb {
    final /* synthetic */ bgsp a;

    public bgso(bgsp bgspVar) {
        this.a = bgspVar;
    }

    @Override // defpackage.bgrb
    public final void a(brlu brluVar) {
        this.a.d.clear();
        for (final ilo iloVar : brluVar.G()) {
            bgsp bgspVar = this.a;
            List<jba> list = bgspVar.d;
            bnjs a = bgspVar.b.a(iloVar);
            a.n = cjtd.a(dtxn.eu);
            a.a = new bnjt(this, iloVar) { // from class: bgsn
                private final bgso a;
                private final ilo b;

                {
                    this.a = this;
                    this.b = iloVar;
                }

                @Override // defpackage.bnjt
                public final void a(cjqm cjqmVar) {
                    bgsf.e(this.b, this.a.a.c);
                }
            };
            list.add(a.a());
        }
        cqkx.p(this.a);
    }
}
