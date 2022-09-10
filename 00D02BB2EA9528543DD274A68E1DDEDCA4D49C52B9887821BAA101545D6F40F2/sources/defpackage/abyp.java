package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: abyp  reason: default package */
/* loaded from: classes2.dex */
public final class abyp implements btzi<dkem, dkeo> {
    final /* synthetic */ dkem a;
    final /* synthetic */ deig b;
    final /* synthetic */ dbrn c;
    final /* synthetic */ abys d;

    public abyp(abys abysVar, dkem dkemVar, deig deigVar, dbrn dbrnVar) {
        this.d = abysVar;
        this.a = dkemVar;
        this.b = deigVar;
        this.c = dbrnVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dkem> btzrVar, btzy btzyVar) {
        if (!this.b.isCancelled()) {
            this.b.k(new btzz(btzyVar));
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dkem> btzrVar, dkeo dkeoVar) {
        dkeo dkeoVar2 = dkeoVar;
        dqlu dqluVar = abys.a;
        if (dkeoVar2.a.size() > 0) {
            boolean z = false;
            dqlw dqlwVar = dkeoVar2.a.get(0).d;
            if (dqlwVar == null) {
                dqlwVar = dqlw.i;
            }
            if ((dqlwVar.a & 2) != 0) {
                abyq f = abyr.f();
                dkel dkelVar = this.a.b;
                if (dkelVar == null) {
                    dkelVar = dkel.c;
                }
                dhjx dhjxVar = dkelVar.b;
                if (dhjxVar == null) {
                    dhjxVar = dhjx.f;
                }
                abwv abwvVar = (abwv) f;
                abwvVar.a = dhjxVar;
                dqmi b = dqmi.b(this.a.f);
                if (b == null) {
                    b = dqmi.UNKNOWN_RANKING_STRATEGY;
                }
                abwvVar.c = b;
                dqlu dqluVar2 = this.a.e;
                if (dqluVar2 == null) {
                    dqluVar2 = dqlu.c;
                }
                f.b(dqluVar2);
                dqlw dqlwVar2 = dkeoVar2.a.get(0).d;
                if (dqlwVar2 == null) {
                    dqlwVar2 = dqlw.i;
                }
                abwvVar.b = dqlwVar2.c;
                if (dkeoVar2.a.size() > 0) {
                    dqlw dqlwVar3 = dkeoVar2.a.get(0).d;
                    if (dqlwVar3 == null) {
                        dqlwVar3 = dqlw.i;
                    }
                    z = !dqlwVar3.f;
                }
                abwvVar.d = Boolean.valueOf(z);
                this.d.c = f.a();
            }
        }
        this.b.j(this.c.a(dkeoVar2));
    }
}
