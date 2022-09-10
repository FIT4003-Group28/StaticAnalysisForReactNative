package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cfro  reason: default package */
/* loaded from: classes4.dex */
public final class cfro implements btzi<dwtm, dwul> {
    final /* synthetic */ cfrq a;

    public cfro(cfrq cfrqVar) {
        this.a = cfrqVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwtm> btzrVar, btzy btzyVar) {
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwtm> btzrVar, dwul dwulVar) {
        final dwul dwulVar2 = dwulVar;
        this.a.p.g(dwulVar2);
        this.a.i.a(dwulVar2.r);
        this.a.b.execute(new Runnable(this, dwulVar2) { // from class: cfrn
            private final cfro a;
            private final dwul b;

            {
                this.a = this;
                this.b = dwulVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cfro cfroVar = this.a;
                dwul dwulVar3 = this.b;
                cfrq cfrqVar = cfroVar.a;
                ccie ccieVar = cfrqVar.d;
                btlu j = cfrqVar.c.j();
                dori doriVar = dwulVar3.b;
                if (doriVar == null) {
                    doriVar = dori.l;
                }
                dqwa dqwaVar = doriVar.j;
                if (dqwaVar == null) {
                    dqwaVar = dqwa.g;
                }
                ccieVar.c(j, dqwaVar);
                cfrq cfrqVar2 = cfroVar.a;
                cfrqVar2.w = false;
                cfrqVar2.e();
                cfrq cfrqVar3 = cfroVar.a;
                dqam dqamVar = dwulVar3.q;
                if (dqamVar == null) {
                    dqamVar = dqam.g;
                }
                btlu j2 = cfrqVar3.c.j();
                if (j2 == null || !cfrqVar3.k.e() || dqamVar.b != 1) {
                    return;
                }
                cfrqVar3.l.b(j2, (dqal) dqamVar.c);
            }
        });
        cfrz bZ = cfsa.f.bZ();
        dsrj<dwue> dsrjVar = dwulVar2.s;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cfsa cfsaVar = (cfsa) bZ.b;
        dsrj<dwue> dsrjVar2 = cfsaVar.c;
        if (!dsrjVar2.a()) {
            cfsaVar.c = dsqw.cl(dsrjVar2);
        }
        dsod.bv(dsrjVar, cfsaVar.c);
        if (this.a.k.e()) {
            dqam dqamVar = dwulVar2.q;
            if (dqamVar == null) {
                dqamVar = dqam.g;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cfsa cfsaVar2 = (cfsa) bZ.b;
            dqamVar.getClass();
            cfsaVar2.d = dqamVar;
            cfsaVar2.a |= 2;
        }
        final cfry cfryVar = this.a.j;
        btlu j = cfryVar.e.j();
        if (j == null || !btlu.i(j).equals(btlt.GOOGLE)) {
            return;
        }
        long b = cfryVar.a.b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cfsa cfsaVar3 = (cfsa) bZ.b;
        int i = cfsaVar3.a | 4;
        cfsaVar3.a = i;
        cfsaVar3.e = b;
        String str = j.d;
        str.getClass();
        cfsaVar3.a = i | 1;
        cfsaVar3.b = str;
        cfryVar.f = bZ.bK();
        cfryVar.c.execute(new Runnable(cfryVar) { // from class: cfru
            private final cfry a;

            {
                this.a = cfryVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cfry cfryVar2 = this.a;
                bzwd<cfsa> bzwdVar = cfryVar2.b;
                cfsa cfsaVar4 = cfryVar2.f;
                dbsk.s(cfsaVar4);
                bzwdVar.b(cfsaVar4);
            }
        });
    }
}
