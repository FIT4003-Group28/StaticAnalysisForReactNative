package defpackage;
/* compiled from: PG */
/* renamed from: avpg  reason: default package */
/* loaded from: classes3.dex */
final class avpg implements avoy {
    final /* synthetic */ avph a;

    public avpg(avph avphVar) {
        this.a = avphVar;
    }

    @Override // defpackage.avoy
    public final void a(avpd avpdVar) {
        if (((avoq) avpdVar).c.b) {
            final long b = this.a.h.b();
            avph avphVar = this.a;
            long j = avphVar.i;
            eaow e = eaow.e(b - avphVar.g.w(bvjk.bL, 0L));
            eaow e2 = eaow.e(b - j);
            if (!e.p(avph.a) || !e2.p(avph.b)) {
                return;
            }
            bvqj.c(this.a.e.C().j(), new bvqg(this, b) { // from class: avpf
                private final avpg a;
                private final long b;

                {
                    this.a = this;
                    this.b = b;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    avpg avpgVar = this.a;
                    long j2 = this.b;
                    btlu btluVar = (btlu) obj;
                    avph avphVar2 = avpgVar.a;
                    avphVar2.d.s(avphVar2.f.i());
                    avpgVar.a.g.Z(bvjk.bL, j2);
                }
            }, this.a.c);
            return;
        }
        this.a.d.t();
    }
}
