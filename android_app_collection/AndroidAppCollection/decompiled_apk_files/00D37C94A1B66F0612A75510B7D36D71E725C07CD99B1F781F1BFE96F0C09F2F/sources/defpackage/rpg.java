package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rpg  reason: default package */
/* loaded from: classes4.dex */
public final class rpg implements Runnable {
    final /* synthetic */ rpn a;

    public rpg(rpn rpnVar) {
        this.a = rpnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rpn rpnVar = this.a;
        rpnVar.v();
        rpnVar.h = new rli(rpnVar);
        rjt rjtVar = new rjt(rpnVar);
        rjtVar.W();
        rpnVar.b = rjtVar;
        rjp f = rpnVar.f();
        rlp rlpVar = rpnVar.a;
        qnm.b(rlpVar);
        f.a = rlpVar;
        ron ronVar = new ron(rpnVar);
        ronVar.W();
        rpnVar.g = ronVar;
        rjl rjlVar = new rjl(rpnVar);
        rjlVar.W();
        rpnVar.e = rjlVar;
        rnl rnlVar = new rnl(rpnVar);
        rnlVar.W();
        rpnVar.f = rnlVar;
        rpd rpdVar = new rpd(rpnVar);
        rpdVar.W();
        rpnVar.d = rpdVar;
        rpnVar.c = new rkz(rpnVar);
        if (rpnVar.m != rpnVar.n) {
            rpnVar.aG().c.c("Not all upload components initialized", Integer.valueOf(rpnVar.m), Integer.valueOf(rpnVar.n));
        }
        rpnVar.j = true;
        rpn rpnVar2 = this.a;
        rpnVar2.v();
        rpnVar2.j().u();
        if (rpnVar2.g.c.a() == 0) {
            rlc rlcVar = rpnVar2.g.c;
            rpnVar2.T();
            rlcVar.b(System.currentTimeMillis());
        }
        rpnVar2.K();
    }
}
