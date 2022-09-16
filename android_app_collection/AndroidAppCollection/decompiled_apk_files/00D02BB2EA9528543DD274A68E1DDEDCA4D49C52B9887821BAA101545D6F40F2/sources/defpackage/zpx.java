package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zpx  reason: default package */
/* loaded from: classes7.dex */
public final class zpx implements Runnable {
    final /* synthetic */ dozz a;
    final /* synthetic */ amub b;
    final /* synthetic */ zfb c;

    public zpx(dozz dozzVar, amub amubVar, zfb zfbVar) {
        this.a = dozzVar;
        this.b = amubVar;
        this.c = zfbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dozs dozsVar;
        dozz dozzVar = this.a;
        if (dozzVar.b == 22) {
            dozsVar = (dozs) dozzVar.c;
        } else {
            dozsVar = dozs.q;
        }
        if ((dozsVar.a & 256) != 0) {
            amwb F = amwb.F(this.a);
            dozl dozlVar = dozsVar.j;
            if (dozlVar == null) {
                dozlVar = dozl.e;
            }
            akrp a = this.b.ar(dozlVar.b, dozlVar.c).a();
            akra akraVar = new akra();
            a.t(akraVar);
            amub amubVar = this.b;
            akrp p = a.p(Math.max(a.m(), a.n()) / 2);
            akrp a2 = amubVar.l.a();
            if (true == p.l(a2)) {
                p = a2;
            }
            this.c.p(F, akraVar, akqg.d(aksj.c(p)));
        }
    }
}
