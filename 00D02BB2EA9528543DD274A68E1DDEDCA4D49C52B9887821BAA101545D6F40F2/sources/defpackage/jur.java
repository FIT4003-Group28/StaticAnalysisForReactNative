package defpackage;

import android.app.Application;
import android.content.Context;
import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: jur  reason: default package */
/* loaded from: classes7.dex */
public final class jur implements kdi, nbs {
    public final nop a;
    public final asmp b;
    public final /* synthetic */ jvh c;
    public final moe d;
    private final dbty<astc> e;

    public jur(jvh jvhVar, nop nopVar, asmp asmpVar, dbty dbtyVar, moe moeVar) {
        this.c = jvhVar;
        this.a = nopVar;
        dbsk.s(asmpVar);
        this.b = asmpVar;
        dbsk.s(dbtyVar);
        this.e = dbtyVar;
        this.d = moeVar;
    }

    @Override // defpackage.kdi
    public final non a(kyx kyxVar, kyy kyyVar) {
        jvh jvhVar = this.c;
        kyo kyoVar = jvhVar.aA;
        cqkj cqkjVar = jvhVar.v;
        akox akoxVar = jvhVar.A;
        kxu kxuVar = jvhVar.C;
        kcv kcvVar = jvhVar.s;
        kcy kcyVar = jvhVar.t;
        jty jtyVar = jvhVar.bc;
        not notVar = jvhVar.V;
        kdg kdgVar = jvhVar.u;
        asmp asmpVar = this.b;
        dbty<astc> dbtyVar = this.e;
        bvnx a = kyoVar.a.a();
        kyo.a(a, 1);
        bvjj a2 = kyoVar.b.a();
        kyo.a(a2, 2);
        bnwn a3 = kyoVar.c.a();
        kyo.a(a3, 3);
        btrm a4 = kyoVar.d.a();
        kyo.a(a4, 4);
        kyo.a(cqkjVar, 5);
        kyo.a(akoxVar, 6);
        kyo.a(kxuVar, 7);
        kyo.a(kcvVar, 8);
        kyo.a(kcyVar, 9);
        kyo.a(jtyVar, 10);
        jzp a5 = kyoVar.e.a();
        kyo.a(a5, 11);
        kyo.a(notVar, 12);
        kyo.a(kdgVar, 13);
        kyo.a(asmpVar, 14);
        kyo.a(dbtyVar, 15);
        kyo.a(kyxVar, 16);
        kyo.a(kyyVar, 17);
        return new kyn(a, a2, a3, a4, cqkjVar, akoxVar, kxuVar, kcvVar, kcyVar, jtyVar, a5, notVar, kdgVar, asmpVar, dbtyVar, kyxVar, kyyVar);
    }

    @Override // defpackage.kdi
    public final non b(dndr dndrVar) {
        dbsk.l(dndrVar == dndr.HOME || dndrVar == dndr.WORK);
        jvh jvhVar = this.c;
        mhu mhuVar = jvhVar.aw;
        cqkj cqkjVar = jvhVar.v;
        not notVar = jvhVar.V;
        hwe hweVar = jvhVar.B;
        kxu kxuVar = jvhVar.C;
        noo nooVar = jvhVar.y;
        ncm a = jvhVar.M.a();
        asmp asmpVar = this.b;
        nop nopVar = this.a;
        jvh jvhVar2 = this.c;
        nov novVar = jvhVar2.x;
        kpj a2 = jvhVar2.R.a(dndrVar);
        kcv kcvVar = this.c.s;
        mhu.a(cqkjVar, 1);
        mhu.a(notVar, 2);
        mhu.a(hweVar, 3);
        mhu.a(kxuVar, 4);
        mhu.a(nooVar, 5);
        mhu.a(a, 6);
        mhu.a(asmpVar, 7);
        mhu.a(dndrVar, 8);
        mhu.a(this, 9);
        mhu.a(nopVar, 10);
        mhu.a(novVar, 11);
        mhu.a(a2, 12);
        btpc a3 = mhuVar.a.a();
        mhu.a(a3, 13);
        mhu.a(kcvVar, 14);
        Executor a4 = mhuVar.b.a();
        mhu.a(a4, 15);
        bvrb a5 = mhuVar.c.a();
        mhu.a(a5, 16);
        cjqy a6 = mhuVar.d.a();
        mhu.a(a6, 17);
        cjqq a7 = mhuVar.e.a();
        mhu.a(a7, 18);
        btvo a8 = mhuVar.f.a();
        mhu.a(a8, 19);
        return new mht(cqkjVar, notVar, hweVar, kxuVar, nooVar, a, asmpVar, dndrVar, this, nopVar, novVar, a2, a3, kcvVar, a4, a5, a6, a7, a8);
    }

    @Override // defpackage.kdi
    public final non c(ldm ldmVar, @dzsi ksr ksrVar, @dzsi vup vupVar, kdk kdkVar, mnz mnzVar, boolean z, boolean z2, dcdc<ldm> dcdcVar, @dzsi cjsz cjszVar, not notVar, nop nopVar) {
        dbsk.l(this.c.N.isDone());
        ksr a = ksrVar == null ? this.c.a() : ksrVar;
        axxb a2 = this.c.e.getCarParameters().i ? this.c.i.a() : null;
        axwi a3 = this.c.e.getCarParameters().i ? this.c.j.a() : null;
        mwp mwpVar = new mwp(this, this.a);
        jvh jvhVar = this.c;
        mip mipVar = jvhVar.ah;
        cqkj cqkjVar = jvhVar.v;
        Context context = cqkjVar.d;
        nov novVar = jvhVar.x;
        ksh kshVar = jvhVar.L;
        ksi ksiVar = jvhVar.G;
        qbo qboVar = jvhVar.H;
        kcw kcwVar = jvhVar.I;
        akox akoxVar = jvhVar.A;
        hwe hweVar = jvhVar.B;
        kxu kxuVar = jvhVar.C;
        lzf lzfVar = (lzf) deha.s(jvhVar.N);
        jvh jvhVar2 = this.c;
        return mipVar.a(context, novVar, kshVar, ksiVar, qboVar, a, kcwVar, cqkjVar, notVar, akoxVar, hweVar, kxuVar, lzfVar, jvhVar2.bc, this, nopVar, jvhVar2.M.a(), this.b, ldmVar, new ncf(this.c.v.d, ldmVar), dcdcVar, vupVar, null, kdkVar, mnzVar, z, this.c.Z, mwpVar, z2, cjszVar, a2, a3, this.d);
    }

    @Override // defpackage.kdi
    public final non d(nop nopVar, ldm ldmVar, dcdc<ldm> dcdcVar, not notVar) {
        String str = this.c.e.getVectorMapsParameters().h;
        int a = dujv.a(this.c.e.getAdsParameters().b);
        if (a == 0) {
            a = 1;
        }
        aluu aluuVar = new aluu(str, alxb.a(a, this.c.v.d.getResources()), this.c.e.getCategoricalSearchParameters().u());
        jvh jvhVar = this.c;
        mcb a2 = jvhVar.aP.a(this.b, jvhVar.v.d, jvhVar.A.aj());
        jvh jvhVar2 = this.c;
        mwv mwvVar = jvhVar2.aV;
        cqkj cqkjVar = jvhVar2.v;
        kdg kdgVar = jvhVar2.u;
        ksi ksiVar = jvhVar2.G;
        noo nooVar = jvhVar2.y;
        kxu kxuVar = jvhVar2.C;
        kcw kcwVar = jvhVar2.I;
        cqat a3 = mwvVar.a.a();
        mwv.a(a3, 1);
        mwv.a(aluuVar, 2);
        mwv.a(cqkjVar, 3);
        mwv.a(ldmVar, 4);
        mwv.a(kdgVar, 5);
        mwv.a(ksiVar, 6);
        mwv.a(nopVar, 7);
        mwv.a(nooVar, 8);
        mwv.a(notVar, 9);
        mwv.a(this, 10);
        mwv.a(kxuVar, 11);
        cjqy a4 = mwvVar.b.a();
        mwv.a(a4, 12);
        cjqq a5 = mwvVar.c.a();
        mwv.a(a5, 13);
        mwv.a(a2, 14);
        mwv.a(dcdcVar, 15);
        btvo a6 = mwvVar.d.a();
        mwv.a(a6, 16);
        mwv.a(kcwVar, 17);
        return new mwu(a3, aluuVar, cqkjVar, ldmVar, kdgVar, ksiVar, nopVar, nooVar, notVar, this, kxuVar, a4, a5, a2, dcdcVar, a6, kcwVar);
    }

    @Override // defpackage.kdi
    public final non e(ldm ldmVar, dcdc<ldm> dcdcVar, ncf ncfVar, ksr ksrVar, not notVar) {
        dbsk.l(this.c.N.isDone());
        jvh jvhVar = this.c;
        nbu nbuVar = jvhVar.aN;
        kdg kdgVar = jvhVar.u;
        nov novVar = jvhVar.x;
        noe noeVar = jvhVar.bg;
        asmp asmpVar = this.b;
        nbu.a(kdgVar, 1);
        nbu.a(novVar, 2);
        nbu.a(ldmVar, 3);
        nbu.a(dcdcVar, 4);
        nbu.a(ncfVar, 5);
        nbu.a(ksrVar, 6);
        nbu.a(this, 7);
        nbu.a(noeVar, 8);
        nbu.a(notVar, 9);
        nbu.a(asmpVar, 10);
        noh a = nbuVar.a.a();
        nbu.a(a, 11);
        return new nbt(kdgVar, novVar, ldmVar, dcdcVar, ncfVar, ksrVar, this, noeVar, notVar, asmpVar, a);
    }

    @Override // defpackage.kdi
    public final non f(alav alavVar, not notVar) {
        jvh jvhVar = this.c;
        nnx nnxVar = jvhVar.aU;
        kxu kxuVar = jvhVar.C;
        cqkj cqkjVar = jvhVar.v;
        noo nooVar = jvhVar.y;
        asmp asmpVar = this.b;
        nnx.a(alavVar, 1);
        nnx.a(kxuVar, 2);
        nnx.a(cqkjVar, 3);
        nnx.a(notVar, 4);
        cjqy a = nnxVar.a.a();
        nnx.a(a, 5);
        cjqq a2 = nnxVar.b.a();
        nnx.a(a2, 6);
        amfi a3 = nnxVar.c.a();
        nnx.a(a3, 7);
        nnx.a(nooVar, 8);
        jzp a4 = nnxVar.d.a();
        nnx.a(a4, 9);
        nnx.a(asmpVar, 10);
        bvgl a5 = nnxVar.e.a();
        nnx.a(a5, 11);
        return new nnw(alavVar, kxuVar, cqkjVar, notVar, a, a2, a3, nooVar, a4, asmpVar, a5);
    }

    @Override // defpackage.kdi
    public final non g(dcdc<ldm> dcdcVar, amte amteVar, boolean z) {
        dbsk.l(this.c.N.isDone());
        jvh jvhVar = this.c;
        nhg nhgVar = jvhVar.aT;
        cqkj cqkjVar = jvhVar.v;
        Context context = cqkjVar.d;
        noo nooVar = jvhVar.y;
        not notVar = jvhVar.V;
        kxu kxuVar = jvhVar.C;
        qbo qboVar = jvhVar.H;
        ksr a = jvhVar.a();
        lzf lzfVar = (lzf) deha.s(this.c.N);
        jvh jvhVar2 = this.c;
        jtp jtpVar = jvhVar2.bd;
        asmp asmpVar = this.b;
        noj nokVar = jvhVar2.u.o() ? new nok() : new noc();
        kdg kdgVar = this.c.u;
        nhg.a(context, 1);
        bvsl a2 = nhgVar.a.a();
        nhg.a(a2, 2);
        bvjj a3 = nhgVar.b.a();
        nhg.a(a3, 3);
        cqat a4 = nhgVar.c.a();
        nhg.a(a4, 4);
        nhg.a(nooVar, 5);
        jzp a5 = nhgVar.d.a();
        nhg.a(a5, 6);
        nhg.a(notVar, 7);
        nhg.a(cqkjVar, 8);
        nhg.a(kxuVar, 9);
        nhg.a(qboVar, 10);
        nhg.a(a, 11);
        nhg.a(lzfVar, 12);
        ahjq a6 = nhgVar.e.a();
        nhg.a(a6, 13);
        nhg.a(dcdcVar, 14);
        nhg.a(amteVar, 15);
        cjqy a7 = nhgVar.f.a();
        nhg.a(a7, 16);
        cjqq a8 = nhgVar.g.a();
        nhg.a(a8, 17);
        nhg.a(jtpVar, 19);
        jzv a9 = nhgVar.h.a();
        nhg.a(a9, 20);
        dxio a10 = ((dxjh) nhgVar.i).a();
        nhg.a(a10, 21);
        nhg.a(asmpVar, 22);
        nhg.a(nhgVar.j.a(), 23);
        nhg.a(nokVar, 24);
        Executor a11 = nhgVar.k.a();
        nhg.a(a11, 25);
        nhg.a(kdgVar, 26);
        return new nhf(context, a2, a3, a4, nooVar, a5, notVar, cqkjVar, kxuVar, qboVar, a, lzfVar, a6, dcdcVar, amteVar, a7, a8, z, jtpVar, a9, a10, asmpVar, nokVar, a11, kdgVar);
    }

    @Override // defpackage.kdi
    public final non h(dndr dndrVar) {
        jvh jvhVar = this.c;
        jvh jvhVar2 = this.c;
        jvh jvhVar3 = this.c;
        return jvhVar.az.a(jvhVar.c, jvhVar.P.a(), jvhVar2.u, this, jvhVar2.v, jvhVar2.A, jvhVar2.x, this.a, jvhVar2.y, null, jvhVar2.V, dndrVar, jvhVar2.R, jvhVar2.U.a(), jvhVar3.s, jvhVar3.w);
    }

    @Override // defpackage.kdi
    public final non i(mcm mcmVar) {
        jvh jvhVar = this.c;
        jvh jvhVar2 = this.c;
        jvh jvhVar3 = this.c;
        return jvhVar.az.a(jvhVar.c, jvhVar.P.a(), jvhVar2.u, this, jvhVar2.v, jvhVar2.A, jvhVar2.x, this.a, jvhVar2.y, mcmVar, jvhVar2.V, null, jvhVar2.R, jvhVar2.U.a(), jvhVar3.s, jvhVar3.w);
    }

    @Override // defpackage.kdi, defpackage.nbs
    public final non j(boolean z, mxs mxsVar, mxu mxuVar, not notVar) {
        jvh jvhVar = this.c;
        return jvhVar.aM.a(jvhVar.v, notVar, jvhVar.y, jvhVar.u, jvhVar.C, jvhVar.X, jvhVar.Y, mxsVar, mxuVar, z);
    }

    @Override // defpackage.kdi
    public final <T> non k(dcdc<T> dcdcVar, dbrn<T, String> dbrnVar, jwh<T> jwhVar, jyj jyjVar) {
        jvh jvhVar = this.c;
        cqkj cqkjVar = jvhVar.v;
        not notVar = jvhVar.V;
        noo nooVar = jvhVar.y;
        kdg kdgVar = jvhVar.u;
        kcv kcvVar = jvhVar.s;
        jvw.a(cqkjVar, 1);
        jvw.a(notVar, 2);
        jvw.a(nooVar, 3);
        jvw.a(kdgVar, 4);
        jvw.a(kcvVar, 5);
        jvw.a(dcdcVar, 6);
        jvw.a(dbrnVar, 7);
        jvw.a(jwhVar, 8);
        jvw.a(jyjVar, 9);
        return new jvv(cqkjVar, notVar, nooVar, kdgVar, kcvVar, dcdcVar, dbrnVar, jwhVar, jyjVar);
    }

    @Override // defpackage.kdi
    public final non l(dndr dndrVar) {
        jvh jvhVar = this.c;
        return mwd.a(jvhVar.bb, jvhVar.Q.a(dndrVar), this.c.s, false);
    }

    @Override // defpackage.kdi
    public final non m() {
        jvh jvhVar = this.c;
        return mwd.a(jvhVar.bb, jvhVar.Q.a(null), this.c.s, true);
    }

    @Override // defpackage.kdi
    public final non n(nop nopVar, ldm ldmVar, aryr aryrVar, ncf ncfVar, dcdc<ldm> dcdcVar, kdk kdkVar, not notVar, mnz mnzVar) {
        dbsk.l(this.c.N.isDone());
        axxb a = this.c.e.getCarParameters().i ? this.c.i.a() : null;
        axwi a2 = this.c.e.getCarParameters().i ? this.c.j.a() : null;
        mwp mwpVar = new mwp(this, this.a);
        jvh jvhVar = this.c;
        mip mipVar = jvhVar.ah;
        Context context = jvhVar.v.d;
        nov novVar = jvhVar.x;
        ksh kshVar = jvhVar.L;
        ksi ksiVar = jvhVar.G;
        qbo qboVar = jvhVar.H;
        ksr a3 = jvhVar.a();
        jvh jvhVar2 = this.c;
        kcw kcwVar = jvhVar2.I;
        cqkj cqkjVar = jvhVar2.v;
        akox akoxVar = jvhVar2.A;
        hwe hweVar = jvhVar2.B;
        kxu kxuVar = jvhVar2.C;
        lzf lzfVar = (lzf) deha.s(jvhVar2.N);
        jvh jvhVar3 = this.c;
        return mipVar.a(context, novVar, kshVar, ksiVar, qboVar, a3, kcwVar, cqkjVar, notVar, akoxVar, hweVar, kxuVar, lzfVar, jvhVar3.bc, this, nopVar, jvhVar3.M.a(), this.b, ldmVar, ncfVar, dcdcVar, null, aryrVar, kdkVar, mnzVar, false, this.c.Z, mwpVar, true, new cjsz(dtxm.cL), a, a2, this.d);
    }

    @Override // defpackage.kdi
    public final non o(not notVar, dcdc<ldm> dcdcVar, msv msvVar) {
        dbsk.l(this.c.N.isDone());
        jvh jvhVar = this.c;
        mrm mrmVar = jvhVar.aG;
        nop nopVar = this.a;
        ksr a = jvhVar.a();
        lzf lzfVar = (lzf) deha.s(this.c.N);
        jvh jvhVar2 = this.c;
        cqkj cqkjVar = jvhVar2.v;
        noo nooVar = jvhVar2.y;
        kxu kxuVar = jvhVar2.C;
        asmp asmpVar = this.b;
        mrm.a(this, 1);
        mrm.a(nopVar, 2);
        mrm.a(notVar, 3);
        mrm.a(a, 4);
        mrm.a(lzfVar, 5);
        mrm.a(dcdcVar, 6);
        mrm.a(cqkjVar, 7);
        mrm.a(nooVar, 8);
        mrm.a(kxuVar, 9);
        mrm.a(mrmVar.a.a(), 10);
        mtq a2 = mrmVar.b.a();
        mrm.a(a2, 11);
        cjqy a3 = mrmVar.c.a();
        mrm.a(a3, 12);
        cjqq a4 = mrmVar.d.a();
        mrm.a(a4, 13);
        mrm.a(asmpVar, 14);
        mtd a5 = mrmVar.e.a();
        mrm.a(a5, 15);
        mrm.a(msvVar, 16);
        return new mrl(this, nopVar, notVar, a, lzfVar, dcdcVar, cqkjVar, nooVar, kxuVar, a2, a3, a4, asmpVar, a5, msvVar);
    }

    @Override // defpackage.kdi
    public final non p(not notVar, ldm ldmVar, boolean z) {
        jvh jvhVar = this.c;
        mrh mrhVar = jvhVar.aJ;
        nop nopVar = this.a;
        ncm a = jvhVar.M.a();
        jvh jvhVar2 = this.c;
        noo nooVar = jvhVar2.y;
        cqkj cqkjVar = jvhVar2.v;
        ksh kshVar = jvhVar2.L;
        asmp asmpVar = this.b;
        akox akoxVar = jvhVar2.A;
        kxu kxuVar = jvhVar2.C;
        mrh.a(nopVar, 1);
        mrh.a(this, 2);
        mrh.a(a, 3);
        mrh.a(nooVar, 4);
        mrh.a(cqkjVar, 5);
        mrh.a(notVar, 6);
        mrh.a(ldmVar, 7);
        mrh.a(kshVar, 9);
        cqat a2 = mrhVar.a.a();
        mrh.a(a2, 10);
        cjqy a3 = mrhVar.b.a();
        mrh.a(a3, 11);
        cjqq a4 = mrhVar.c.a();
        mrh.a(a4, 12);
        mrh.a(asmpVar, 13);
        mrh.a(akoxVar, 14);
        mrh.a(kxuVar, 15);
        mti a5 = mrhVar.d.a();
        mrh.a(a5, 16);
        return new mrg(nopVar, this, a, nooVar, cqkjVar, notVar, ldmVar, z, kshVar, a2, a3, a4, asmpVar, akoxVar, kxuVar, a5);
    }

    @Override // defpackage.kdi
    public final non q(List<doew> list) {
        jvh jvhVar = this.c;
        kmh kmhVar = jvhVar.as;
        noo nooVar = jvhVar.y;
        cqkj cqkjVar = jvhVar.v;
        not notVar = jvhVar.V;
        cjqy a = kmhVar.a.a();
        kmh.a(a, 1);
        cjqq a2 = kmhVar.b.a();
        kmh.a(a2, 2);
        kmh.a(nooVar, 3);
        kmh.a(cqkjVar, 4);
        kmh.a(notVar, 5);
        kmh.a(list, 6);
        return new kmg(a, a2, nooVar, cqkjVar, notVar, list);
    }

    @Override // defpackage.kdi
    public final non r(nop nopVar, aste asteVar, mcj mcjVar, not notVar, @dzsi mnz mnzVar, mcl mclVar) {
        return z(nopVar, this.c.a(), mcjVar, asteVar, dcdc.e(), notVar, new mwp(this, this.a), mnzVar, mclVar);
    }

    public final dcdc<brcl> s() {
        dsrj<dupr> dsrjVar;
        if (this.c.r.a()) {
            if (this.c.e.getEnrouteParameters().h.size() > 0) {
                dsrjVar = this.c.e.getEnrouteParameters().h;
            } else {
                dsrjVar = this.c.e.getEnrouteParameters().e;
            }
            return brcm.a(dsrjVar);
        }
        return brcm.a(this.c.e.getEnrouteParameters().e);
    }

    public final lxh t() {
        jvh jvhVar = this.c;
        lxi lxiVar = jvhVar.aH;
        dbty<astc> dbtyVar = this.e;
        kxu kxuVar = jvhVar.C;
        akox akoxVar = jvhVar.A;
        lxi.a(dbtyVar, 1);
        lxi.a(kxuVar, 2);
        lxi.a(akoxVar, 3);
        bvnx a = lxiVar.a.a();
        lxi.a(a, 4);
        return new lxh(dbtyVar, kxuVar, akoxVar, a);
    }

    @Override // defpackage.kdi
    public final non u(ldm ldmVar) {
        jvh jvhVar = this.c;
        mgx mgxVar = jvhVar.aK;
        cqkj cqkjVar = jvhVar.v;
        Context context = cqkjVar.d;
        not notVar = jvhVar.V;
        kxu kxuVar = jvhVar.C;
        noo nooVar = jvhVar.y;
        hwe hweVar = jvhVar.B;
        mgx.a(context, 1);
        mgx.a(cqkjVar, 2);
        mgx.a(notVar, 3);
        mgx.a(kxuVar, 4);
        mgx.a(nooVar, 5);
        cjqy a = mgxVar.a.a();
        mgx.a(a, 6);
        cjqq a2 = mgxVar.b.a();
        mgx.a(a2, 7);
        axxb a3 = mgxVar.c.a();
        mgx.a(a3, 8);
        axwi a4 = mgxVar.d.a();
        mgx.a(a4, 9);
        mgx.a(ldmVar, 10);
        mgx.a(hweVar, 11);
        cqhn a5 = mgxVar.e.a();
        mgx.a(a5, 12);
        Executor a6 = mgxVar.f.a();
        mgx.a(a6, 13);
        Executor a7 = mgxVar.g.a();
        mgx.a(a7, 14);
        ckcw a8 = mgxVar.h.a();
        mgx.a(a8, 15);
        btrm a9 = mgxVar.i.a();
        mgx.a(a9, 16);
        return new mgw(context, cqkjVar, notVar, kxuVar, nooVar, a, a2, a3, a4, ldmVar, hweVar, a5, a6, a7, a8, a9);
    }

    @Override // defpackage.kdi
    public final non v(dcdc<ldm> dcdcVar, dnjf dnjfVar, mij mijVar, nop nopVar) {
        jvh jvhVar = this.c;
        kmk kmkVar = jvhVar.ax;
        noo nooVar = jvhVar.y;
        cqkj cqkjVar = jvhVar.v;
        not notVar = jvhVar.V;
        cjqy a = kmkVar.a.a();
        kmk.a(a, 1);
        cjqq a2 = kmkVar.b.a();
        kmk.a(a2, 2);
        kmk.a(this, 3);
        kmk.a(nooVar, 4);
        kmk.a(nopVar, 5);
        kmk.a(cqkjVar, 6);
        kmk.a(notVar, 7);
        kmk.a(dcdcVar, 8);
        kmk.a(dnjfVar, 9);
        kmk.a(mijVar, 10);
        return new kmj(a, a2, this, nooVar, nopVar, cqkjVar, notVar, dcdcVar, dnjfVar, mijVar);
    }

    @Override // defpackage.kdi
    public final non w(nop nopVar, aste asteVar, mcj mcjVar, not notVar, @dzsi mnz mnzVar, mcl mclVar, dcdc<ldm> dcdcVar, mwp mwpVar) {
        return z(nopVar, this.c.a(), mcjVar, asteVar, dcdcVar, notVar, mwpVar, mnzVar, mclVar);
    }

    @Override // defpackage.kdi
    public final non x() {
        dbty<lxh> dbtyVar = new dbty(this) { // from class: juq
            private final jur a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.t();
            }
        };
        jvh jvhVar = this.c;
        nfc nfcVar = jvhVar.aQ;
        nfh nfhVar = jvhVar.S;
        kdg kdgVar = jvhVar.u;
        cqkj cqkjVar = jvhVar.v;
        kcv kcvVar = jvhVar.s;
        nem nemVar = jvhVar.ap;
        akox akoxVar = jvhVar.A;
        kxu kxuVar = jvhVar.C;
        aufc a = jvhVar.p.a();
        jvh jvhVar2 = this.c;
        nemVar.a(kcvVar, akoxVar, kxuVar, dbtyVar, kdgVar, a, jvhVar2.y, this.a, this, jvhVar2.V, jvhVar2.v, jvhVar2.bc, jvhVar2.n);
        jvh jvhVar3 = this.c;
        jvhVar3.aq.a(jvhVar3.C, dbtyVar, jvhVar3.u, jvhVar3.y, this.a, this, jvhVar3.V, jvhVar3.v, jvhVar3.bc);
        jvh jvhVar4 = this.c;
        return nfcVar.a(nfhVar, kdgVar, cqkjVar, jvhVar4.V, this.a, jvhVar4.y, this, jvhVar4.bc, jvhVar4.z, jvhVar4.C, dbtyVar, this.b, true);
    }

    @Override // defpackage.kdi
    public final non y(khx khxVar, String str) {
        jvh jvhVar = this.c;
        cqkj cqkjVar = jvhVar.v;
        dukx dukxVar = jvhVar.e.getCarParameters().e;
        if (dukxVar == null) {
            dukxVar = dukx.c;
        }
        ntc ntcVar = new ntc(cqkjVar, dbsg.i(Integer.valueOf(dukxVar.a)));
        boolean z = btlu.i(this.c.a.j()) == btlt.GOOGLE;
        jvh jvhVar2 = this.c;
        Application application = jvhVar2.c;
        ckcw ckcwVar = jvhVar2.f;
        ahjq a = jvhVar2.b.a();
        axwq a2 = this.c.h.a();
        axwi a3 = this.c.j.a();
        jvh jvhVar3 = this.c;
        broq broqVar = jvhVar3.F;
        bvrb bvrbVar = jvhVar3.d;
        jvhVar3.k.a();
        khe kheVar = new khe(application, z, ckcwVar, a, a2, a3, broqVar, bvrbVar);
        jvh jvhVar4 = this.c;
        khu khuVar = jvhVar4.an;
        Application application2 = jvhVar4.c;
        nov novVar = jvhVar4.x;
        kcv kcvVar = jvhVar4.s;
        jty jtyVar = jvhVar4.bc;
        nop nopVar = this.a;
        noo nooVar = jvhVar4.y;
        not notVar = jvhVar4.V;
        kdg kdgVar = jvhVar4.u;
        cqkj cqkjVar2 = jvhVar4.v;
        nfk nfkVar = jvhVar4.bf;
        khu.a(application2, 1);
        khu.a(novVar, 2);
        khu.a(kcvVar, 3);
        btvo a4 = khuVar.a.a();
        khu.a(a4, 4);
        crzm<Boolean> a5 = khuVar.b.a();
        khu.a(a5, 5);
        khu.a(ntcVar, 6);
        khu.a(kheVar, 7);
        khu.a(jtyVar, 8);
        khu.a(this, 9);
        khu.a(nopVar, 10);
        khu.a(nopVar, 11);
        khu.a(nooVar, 12);
        khu.a(khxVar, 13);
        khu.a(notVar, 14);
        khu.a(kdgVar, 15);
        btpc a6 = khuVar.c.a();
        khu.a(a6, 16);
        cjqy a7 = khuVar.d.a();
        khu.a(a7, 17);
        cjqq a8 = khuVar.e.a();
        khu.a(a8, 18);
        khu.a(cqkjVar2, 19);
        khu.a(str, 20);
        khu.a(nfkVar, 21);
        akfa a9 = khuVar.f.a();
        khu.a(a9, 22);
        dehq a10 = khuVar.g.a();
        khu.a(a10, 23);
        bvrb a11 = khuVar.h.a();
        khu.a(a11, 24);
        btrm a12 = khuVar.i.a();
        khu.a(a12, 25);
        return new kht(application2, novVar, kcvVar, a4, a5, ntcVar, kheVar, jtyVar, this, nopVar, nopVar, nooVar, khxVar, notVar, kdgVar, a6, a7, a8, cqkjVar2, a9, a10, a11, a12);
    }

    public final non z(nop nopVar, @dzsi ksr ksrVar, mcj mcjVar, aste asteVar, dcdc<ldm> dcdcVar, not notVar, mwp mwpVar, @dzsi mnz mnzVar, mcl mclVar) {
        jvh jvhVar = this.c;
        mbq mbqVar = jvhVar.aD;
        cqkj cqkjVar = jvhVar.v;
        asmp asmpVar = this.b;
        kxu kxuVar = jvhVar.C;
        akox akoxVar = jvhVar.A;
        kcw kcwVar = jvhVar.I;
        nov novVar = jvhVar.x;
        boolean z = jvhVar.Z;
        kdg kdgVar = jvhVar.u;
        kox koxVar = jvhVar.at;
        lzf lzfVar = (lzf) deha.s(jvhVar.N);
        ViewGroup a = notVar.a();
        bvjj a2 = koxVar.a.a();
        kox.a(a2, 1);
        btrm a3 = koxVar.b.a();
        kox.a(a3, 2);
        kox.a(cqkjVar, 3);
        kox.a(lzfVar, 4);
        kox.a(a, 5);
        kow kowVar = new kow(a2, a3, cqkjVar, lzfVar, a);
        cqat a4 = mbqVar.a.a();
        mbq.a(a4, 1);
        bvsl a5 = mbqVar.b.a();
        mbq.a(a5, 2);
        mcc a6 = mbqVar.c.a();
        mbq.a(a6, 3);
        mbq.a(cqkjVar, 4);
        jzp a7 = mbqVar.d.a();
        mbq.a(a7, 5);
        mbq.a(ksrVar, 6);
        cjqy a8 = mbqVar.e.a();
        mbq.a(a8, 8);
        cjqq a9 = mbqVar.f.a();
        mbq.a(a9, 9);
        mbq.a(asmpVar, 10);
        mbq.a(mcjVar, 11);
        mbq.a(asteVar, 12);
        mbq.a(dcdcVar, 13);
        mbq.a(notVar, 14);
        mbq.a(kxuVar, 15);
        mbq.a(akoxVar, 16);
        mbq.a(kcwVar, 17);
        mbq.a(nopVar, 18);
        mbq.a(mwpVar, 19);
        mbq.a(this, 20);
        mbq.a(novVar, 21);
        mbq.a(mclVar, 23);
        mbq.a(kdgVar, 27);
        mbq.a(mbqVar.g.a(), 28);
        ckcw a10 = mbqVar.h.a();
        mbq.a(a10, 29);
        mbq.a(kowVar, 30);
        ckmd a11 = mbqVar.i.a();
        mbq.a(a11, 31);
        return new mbp(a4, a5, a6, cqkjVar, a7, ksrVar, null, a8, a9, asmpVar, mcjVar, asteVar, dcdcVar, notVar, kxuVar, akoxVar, kcwVar, nopVar, mwpVar, this, novVar, mnzVar, mclVar, null, null, z, kdgVar, a10, kowVar, a11);
    }
}
