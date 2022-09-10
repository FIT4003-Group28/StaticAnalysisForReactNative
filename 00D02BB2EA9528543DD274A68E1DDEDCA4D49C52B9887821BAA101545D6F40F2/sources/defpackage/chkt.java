package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: chkt  reason: default package */
/* loaded from: classes4.dex */
public class chkt extends chjf implements btzi<djhq, djhs> {
    private final Executor a;
    private final buqs c;

    public chkt(Executor executor, buqs buqsVar, chmu chmuVar) {
        super(chmuVar);
        this.a = executor;
        this.c = buqsVar;
    }

    @Override // defpackage.btzi
    public void QY(btzr<djhq> btzrVar, btzy btzyVar) {
        this.b.h(djgl.g, 2);
    }

    @Override // defpackage.chmv
    public void RH(cqiv cqivVar) {
        cqivVar.a(new chha(), this);
    }

    @Override // defpackage.btzi
    /* renamed from: c */
    public void QZ(btzr<djhq> btzrVar, djhs djhsVar) {
        chmu chmuVar = this.b;
        djgl djglVar = djhsVar.b;
        if (djglVar == null) {
            djglVar = djgl.g;
        }
        chmuVar.h(djglVar, 2);
    }

    @Override // defpackage.chjf
    public void f() {
        chii chiiVar;
        buqs buqsVar = this.c;
        chik a = this.b.a();
        if (a.a == 3) {
            chiiVar = (chii) a.b;
        } else {
            chiiVar = chii.c;
        }
        djhq djhqVar = chiiVar.b;
        if (djhqVar == null) {
            djhqVar = djhq.j;
        }
        dsqp dsqpVar = (dsqp) djhqVar.cu(5);
        dsqpVar.bC(djhqVar);
        djgx djgxVar = (djgx) dsqpVar;
        djgw a2 = chiw.a();
        if (djgxVar.c) {
            djgxVar.bF();
            djgxVar.c = false;
        }
        djhq djhqVar2 = (djhq) djgxVar.b;
        a2.getClass();
        djhqVar2.b = a2;
        djhqVar2.a |= 1;
        buqsVar.b(djgxVar.bK(), this, this.a);
    }
}
