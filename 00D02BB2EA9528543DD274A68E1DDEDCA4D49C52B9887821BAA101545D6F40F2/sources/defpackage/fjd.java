package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fjd  reason: default package */
/* loaded from: classes6.dex */
public final class fjd<T> implements dzsj<T> {
    final /* synthetic */ fje a;
    private final int b;

    public fjd(fje fjeVar, int i) {
        this.a = fjeVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                fje fjeVar = this.a;
                bpyl bpylVar = new bpyl(fjeVar.c.cu(), fjeVar.c.ap(), fjeVar.c.fV());
                bpyh b = bpyi.b(fjeVar.c.cu(), fjeVar.c.ap());
                bqdl fV = fjeVar.c.fV();
                bqdg bqdgVar = new bqdg(fjeVar.b(), fjeVar.c());
                fjeVar.c.wk();
                return (T) new bpyk(bpylVar, b, fV, bqdgVar);
            case 1:
                fje fjeVar2 = this.a;
                ftt fttVar = fjeVar2.c;
                return (T) new bnyd(fttVar.eV, fttVar.y(), fjeVar2.c.fO());
            case 2:
                fje fjeVar3 = this.a;
                boxa cm = fjeVar3.c.cm();
                acwo eg = fjeVar3.c.eg();
                bvrb tn = fjeVar3.c.eW.a.tn();
                dxjg.e(tn);
                return (T) new bptg(cm, eg, tn);
            case 3:
                ftt fttVar2 = this.a.c;
                return (T) new booa(fttVar2.a, fttVar2.cp());
            case 4:
                fje fjeVar4 = this.a;
                dzsj<zzn> d = fjeVar4.d();
                dzsj<Executor> di = fjeVar4.c.eW.di();
                dzsj<gga> ad = fjeVar4.c.ad();
                dzsj<btrm> n = fjeVar4.c.eW.n();
                dzsj<akzh> av = fjeVar4.c.av();
                dzsj<alhv> iR = fjeVar4.c.eW.iR();
                dzsj dzsjVar = fjeVar4.a;
                if (dzsjVar == null) {
                    dzsjVar = new fjd(fjeVar4, 6);
                    fjeVar4.a = dzsjVar;
                }
                dzsj dzsjVar2 = dzsjVar;
                dzsj<akox> as = fjeVar4.c.as();
                dzsj dzsjVar3 = fjeVar4.b;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new fjd(fjeVar4, 7);
                    fjeVar4.b = dzsjVar3;
                }
                return (T) new bqco(d, di, ad, n, av, iR, dzsjVar2, as, dzsjVar3);
            case 5:
                ftt fttVar3 = this.a.c;
                return (T) new zzn(fttVar3.a, dxjc.c(fttVar3.av()));
            case 6:
                return (T) new bpsj(this.a.c.au());
            case 7:
                ftt fttVar4 = this.a.c;
                return (T) new bpyj(fttVar4.a, fttVar4.ap());
            case 8:
                return (T) this.a.b();
            default:
                return (T) new bqbf(this.a.b());
        }
    }
}
