package defpackage;

import android.os.Bundle;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: brca  reason: default package */
/* loaded from: classes4.dex */
public final class brca implements brzc {
    public final bwrr<brlu> a = new brbz(this);
    public boolean b = false;
    public final bwqv c;
    public final brce d;
    public final brzd e;
    public final bwrs<brlu> f;
    public final brlk g;
    public final bsma h;
    public final dxio<abfg> i;
    public final dxio<akox> j;
    public final dxio<Executor> k;
    public final boolean l;
    public final dpvf m;
    public cryz<dhym> n;
    private final aehr o;
    private final dzsj<aeht> p;
    private final gfw q;
    private final gn r;
    private final bsoi s;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public brca(defpackage.brat r2, defpackage.gga r3, defpackage.bwqv r4, defpackage.aehr r5, defpackage.dzsj<defpackage.aeht> r6, defpackage.bsma r7, defpackage.dxio<defpackage.abfg> r8, defpackage.dxio<defpackage.akox> r9, defpackage.dxio<java.util.concurrent.Executor> r10, defpackage.brlk r11, defpackage.brce r12, defpackage.brzd r13, defpackage.bsoi r14, defpackage.gfw r15) {
        /*
            r1 = this;
            r1.<init>()
            brbz r0 = new brbz
            r0.<init>(r1)
            r1.a = r0
            r0 = 0
            r1.b = r0
            r1.c = r4
            r1.o = r5
            r1.p = r6
            gn r3 = r3.g()
            r1.r = r3
            r1.d = r12
            r1.e = r13
            bwrs r3 = r11.b()
            r1.f = r3
            r1.q = r15
            r1.g = r11
            r1.s = r14
            r1.h = r7
            r1.i = r8
            r1.j = r9
            r1.k = r10
            brln r4 = r11.d()
            if (r4 == 0) goto L67
            dwir r5 = r4.b()
            if (r5 == 0) goto L67
            dwir r5 = r4.b()
            int r5 = r5.N
            dpvf r5 = defpackage.dpvf.b(r5)
            if (r5 != 0) goto L4b
            dpvf r5 = defpackage.dpvf.UNKNOWN_CATEGORY
        L4b:
            dcep<dpvf> r2 = r2.d
            boolean r2 = r2.contains(r5)
            if (r2 == 0) goto L67
            r2 = 1
            r1.l = r2
            dwir r2 = r4.b()
            int r2 = r2.N
            dpvf r2 = defpackage.dpvf.b(r2)
            if (r2 != 0) goto L64
            dpvf r2 = defpackage.dpvf.UNKNOWN_CATEGORY
        L64:
            r1.m = r2
            goto L6d
        L67:
            r1.l = r0
            dpvf r2 = defpackage.dpvf.UNKNOWN_CATEGORY
            r1.m = r2
        L6d:
            java.io.Serializable r2 = r3.c()
            brlu r2 = (defpackage.brlu) r2
            if (r2 == 0) goto L7a
            bsjm r2 = r2.o
            r13.j(r2)
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brca.<init>(brat, gga, bwqv, aehr, dzsj, bsma, dxio, dxio, dxio, brlk, brce, brzd, bsoi, gfw):void");
    }

    public final void a(bsjm bsjmVar, boolean z) {
        brlu c = this.f.c();
        if (c == null) {
            return;
        }
        dnnn n = bsjmVar.n();
        if (n != null && !this.o.i()) {
            this.p.a().a(n);
        }
        if (z) {
            c.am(true);
        } else {
            c.z();
        }
        c.o = bsjmVar;
    }

    public final void b(bsjm bsjmVar, ddda dddaVar, cjqm cjqmVar) {
        if (this.f.c() == null) {
            return;
        }
        a(bsjmVar, false);
        if (this.g.f()) {
            c(bsjmVar);
        } else {
            this.d.f(bsjmVar.b(), bsjmVar.m(), true, cjqmVar, dddaVar);
        }
    }

    public final void c(bsjm bsjmVar) {
        bsoi bsoiVar = this.s;
        if (bsoiVar != null) {
            bsoiVar.a(false, jjn.HIDDEN);
        }
        brce brceVar = this.d;
        dfos a = bslz.a(bsjmVar.b);
        dfpo l = brceVar.d().l();
        if (l == null) {
            l = dfpo.h;
        }
        dsqp dsqpVar = (dsqp) l.cu(5);
        dsqpVar.bC(l);
        dfpn dfpnVar = (dfpn) dsqpVar;
        if (dfpnVar.c) {
            dfpnVar.bF();
            dfpnVar.c = false;
        }
        dfpo dfpoVar = (dfpo) dfpnVar.b;
        a.getClass();
        dfpoVar.b = a;
        dfpoVar.a |= 1;
        brlu e = brceVar.e();
        e.ai(true);
        brceVar.c.d(e);
        brceVar.b.b(dfpnVar.bK());
        brceVar.b.d();
    }

    @Override // defpackage.brzc
    public final void e(bsjm bsjmVar, ddda dddaVar, cjqm cjqmVar) {
        b(bsjmVar, dddaVar, cjqmVar);
    }

    @Override // defpackage.brzc
    public final void f(int i) {
        brlu c = this.f.c();
        if (c == null) {
            return;
        }
        bsjm bsjmVar = c.o;
        if (i != 31) {
            bsaa.aJ(bsjmVar, i).aP(this.r, this.q);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("refinements_model", bsjmVar);
        bundle.putInt("refinement_type", 31);
        bsas bsasVar = new bsas();
        bsasVar.B(bundle);
        bsasVar.aP(this.r, this.q);
    }

    @Override // defpackage.brzc
    public final void g() {
        brlu c = this.f.c();
        if (c == null) {
            return;
        }
        this.q.aZ(brzg.g(c.o));
    }
}
