package defpackage;

import android.os.Bundle;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cfrb  reason: default package */
/* loaded from: classes4.dex */
public class cfrb implements cfra {
    private final ccct a;
    private final cgbk b;
    private final cfyo c;
    private final cfvt d;
    private final cfta e;
    private final cfsm f;
    private final cftd g;
    private final bzrc h;
    private final acyp i;
    private final btvo j;
    private final cgcv m;
    private final cfuz n;
    private final ccby o;
    private final cfxh p;
    private bzra x;
    private final Bundle k = new Bundle();
    private final Bundle l = new Bundle();
    private final ConcurrentHashMap<drnp, cqix<cccu>> q = new ConcurrentHashMap<>();
    private boolean r = false;
    private boolean s = true;
    private boolean t = false;
    private boolean u = true;
    private dcdc<cqix<?>> v = dcdc.e();
    private dcdc<cfvs> w = dcdc.e();

    public cfrb(cqhn cqhnVar, cgbl cgblVar, cfyp cfypVar, cfzb cfzbVar, cfso cfsoVar, cfvt cfvtVar, cftd cftdVar, cfth cfthVar, bzrc bzrcVar, cfxj cfxjVar, acyp acypVar, btvo btvoVar, cgcv cgcvVar, ccct ccctVar, ges gesVar, Runnable runnable, Runnable runnable2, Runnable runnable3) {
        this.a = ccctVar;
        cchz a = cgblVar.a.a();
        cgbl.a(a, 1);
        cqhn a2 = cgblVar.b.a();
        cgbl.a(a2, 2);
        akfa a3 = cgblVar.c.a();
        cgbl.a(a3, 3);
        axjh a4 = cgblVar.d.a();
        cgbl.a(a4, 4);
        ceet a5 = cgblVar.e.a();
        cgbl.a(a5, 5);
        acyp a6 = cgblVar.f.a();
        cgbl.a(a6, 6);
        axhq a7 = cgblVar.g.a();
        cgbl.a(a7, 7);
        cgbl.a(gesVar, 8);
        cgbk cgbkVar = new cgbk(a, a2, a3, a4, a5, a6, a7, gesVar);
        this.b = cgbkVar;
        this.d = cfvtVar;
        btvo a8 = cfzbVar.a.a();
        cfzb.a(a8, 1);
        dxio a9 = ((dxjh) cfzbVar.b).a();
        cfzb.a(a9, 2);
        cgak a10 = cfzbVar.c.a();
        cfzb.a(a10, 3);
        dxio a11 = ((dxjh) cfzbVar.d).a();
        cfzb.a(a11, 4);
        cfza cfzaVar = new cfza(a8, a9, a10, a11);
        cftc a12 = cftdVar.a(R.string.MORE_WAYS_TO_CONTRIBUTE, dtxl.eb);
        cgaf a13 = cfypVar.a.a();
        cfyp.a(a13, 1);
        cftd a14 = cfypVar.b.a();
        cfyp.a(a14, 2);
        cqhn a15 = cfypVar.c.a();
        cfyp.a(a15, 3);
        dxio a16 = ((dxjh) cfypVar.d).a();
        cfyp.a(a16, 4);
        dxio a17 = ((dxjh) cfypVar.e).a();
        cfyp.a(a17, 5);
        bunc a18 = cfypVar.f.a();
        cfyp.a(a18, 6);
        anhk a19 = cfypVar.g.a();
        cfyp.a(a19, 7);
        cklq a20 = cfypVar.h.a();
        cfyp.a(a20, 8);
        gga a21 = cfypVar.i.a();
        cfyp.a(a21, 9);
        Executor a22 = cfypVar.j.a();
        cfyp.a(a22, 10);
        cgak a23 = cfypVar.k.a();
        cfyp.a(a23, 11);
        cfyp.a(cfzaVar, 12);
        cfyp.a(gesVar, 13);
        cfyp.a(a12, 14);
        cfyo cfyoVar = new cfyo(a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, cfzaVar, gesVar, a12);
        this.c = cfyoVar;
        this.g = cftdVar;
        cftg cftgVar = new cftg(runnable);
        this.e = cftgVar;
        cfsc a24 = cfsoVar.a.a();
        cfso.a(a24, 1);
        cfum a25 = cfsoVar.b.a();
        cfso.a(a25, 2);
        cfse a26 = cfsoVar.c.a();
        cfso.a(a26, 3);
        cftf a27 = cfsoVar.d.a();
        cfso.a(a27, 4);
        cfue a28 = cfsoVar.e.a();
        cfso.a(a28, 5);
        cgcv a29 = cfsoVar.f.a();
        cfso.a(a29, 6);
        cfso.a(runnable2, 7);
        cfsn cfsnVar = new cfsn(a24, a25, a26, a27, a28, a29, runnable2);
        this.f = cfsnVar;
        this.h = bzrcVar;
        this.x = null;
        this.i = acypVar;
        this.j = btvoVar;
        this.m = cgcvVar;
        ccby a30 = ccctVar.a();
        this.o = a30;
        cfxi cfxiVar = new cfxi(runnable3);
        this.p = cfxiVar;
        this.n = new cfuz(cgbkVar, cfsnVar, cfyoVar, cftgVar, cftdVar.a(R.string.CONTRIBUTE_NOW, dtxl.ei), a30, cfxiVar);
    }

    private final dcdc<cqix<?>> F(cgcr cgcrVar) {
        String str;
        dccx dccxVar = new dccx();
        for (cgcq cgcqVar : cgcrVar.a) {
            if (cgcp.a(cgcqVar.b) != 7 || this.t) {
                cfuw cfuwVar = new cfuw();
                cfuz cfuzVar = this.n;
                dccx dccxVar2 = new dccx();
                cgco cgcoVar = cgcqVar.d;
                if (cgcoVar == null) {
                    cgcoVar = cgco.d;
                }
                int i = cgcoVar.b;
                int i2 = cgcoVar.c;
                int a = cgcp.a(cgcqVar.b);
                int i3 = a - 1;
                if (a != 0) {
                    switch (i3) {
                        case 0:
                            dccxVar2.g(cqgr.fT(new cfsx(), cfuzVar.c));
                            break;
                        case 1:
                            dccxVar2.g(cqgr.fT(new cfyh(), cfuzVar.d));
                            break;
                        case 2:
                            dccxVar2.g(cqgr.fT(new ccbx(), cfuzVar.g));
                            break;
                        case 3:
                            dccxVar2.g(cqgr.fT(new cfve(), cfuzVar.f));
                            break;
                        case 4:
                            dccxVar2.g(cqgr.fT(new cfwm(), cfuzVar.c));
                            break;
                        case 5:
                            dccxVar2.g(cqgr.fT(new cgbe(), cfuzVar.b));
                            break;
                        case 6:
                            dccxVar2.g(cqgr.fT(new cftm(), cfuzVar.e));
                            break;
                        case 7:
                            dccxVar2.g(cqgr.fT(new cfxg(), cfuzVar.h));
                            break;
                        default:
                            Object[] objArr = new Object[1];
                            int a2 = cgcp.a(cgcqVar.b);
                            switch (a2) {
                                case 1:
                                    str = "CONTRIBUTION_ACTIONS_MODULE";
                                    break;
                                case 2:
                                    str = "CONTRIBUTION_SUGGESTIONS_MODULE";
                                    break;
                                case 3:
                                    str = "INFORMATIONAL_CARDS_MODULE";
                                    break;
                                case 4:
                                    str = "MORE_WAYS_TO_CONTRIBUTE_MODULE";
                                    break;
                                case 5:
                                    str = "ONBOARDING_MODULE";
                                    break;
                                case 6:
                                    str = "PROFILE_INFO_MODULE";
                                    break;
                                case 7:
                                    str = "PROMOTE_LOCATION_HISTORY_MODULE";
                                    break;
                                case 8:
                                    str = "OFFLINE_RETRY_MODULE";
                                    break;
                                case 9:
                                    str = "MODULE_NOT_SET";
                                    break;
                                default:
                                    str = "null";
                                    break;
                            }
                            if (a2 != 0) {
                                objArr[0] = str;
                                bvoo.h("Unsupported module: %s", objArr);
                                break;
                            } else {
                                throw null;
                            }
                    }
                    dccxVar.g(cqgr.fT(cfuwVar, new cfuy(i, i2, dccxVar2.f())));
                } else {
                    throw null;
                }
            }
        }
        return dccxVar.f();
    }

    public void A(cgcg cgcgVar) {
        this.f.i(cgcgVar);
        cqkx.p(this);
    }

    public void B(cgby cgbyVar) {
        dccx dccxVar = new dccx();
        for (drnp drnpVar : cgbyVar.a) {
            cqix<cccu> cqixVar = this.q.get(drnpVar);
            if (cqixVar == null) {
                cqixVar = this.a.b(drnpVar);
                this.q.put(drnpVar, cqixVar);
            }
            dccxVar.g(cqixVar);
        }
        this.o.c(dccxVar.f());
        cqkx.p(this);
    }

    public void C(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        q(cfvh.c(bundle.getBundle("motivation")));
        Bundle bundle2 = bundle.getBundle("campaign");
        dwtu dwtuVar = null;
        if (bundle2 != null && bundle2.getSerializable("campaign") != null) {
            dwtuVar = (dwtu) bvrt.f((bvrt) bundle2.getSerializable("campaign"), (dssr) dwtu.c.cu(7), dwtu.c);
        }
        u(dwtuVar);
    }

    public Bundle D() {
        Bundle bundle = new Bundle();
        bundle.putBundle("motivation", this.k);
        bundle.putBundle("campaign", this.l);
        return bundle;
    }

    public boolean E(Object obj) {
        return this.c.k(obj);
    }

    @Override // defpackage.cfra
    public cfws a() {
        if (!this.r) {
            return cfws.OFFLINE;
        }
        return this.s ? cfws.VETERAN : cfws.NEWBIE;
    }

    @Override // defpackage.cfra
    public cgbf b() {
        return this.b;
    }

    @Override // defpackage.cfra
    public cfsm c() {
        return this.f;
    }

    @Override // defpackage.cfra
    public cfyi d() {
        return this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r2 != 3) goto L11;
     */
    @Override // defpackage.cfra
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Boolean e() {
        /*
            r3 = this;
            bzra r0 = r3.x
            r1 = 0
            if (r0 == 0) goto L27
            java.lang.Boolean r0 = r0.g()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L10
            goto L27
        L10:
            btvo r0 = r3.j
            dkyr r0 = r0.getUgcParameters()
            int r0 = r0.bq()
            int r2 = r0 + (-1)
            if (r0 == 0) goto L25
            r0 = 2
            if (r2 == r0) goto L27
            r0 = 3
            if (r2 == r0) goto L27
            goto L34
        L25:
            r0 = 0
            throw r0
        L27:
            cfyo r0 = r3.c
            java.lang.Boolean r0 = r0.e()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L34
            r1 = 1
        L34:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfrb.e():java.lang.Boolean");
    }

    @Override // defpackage.cfra
    public dcdc<cfvr> f() {
        return dcdc.r(this.w);
    }

    @Override // defpackage.cfra
    public bzra g() {
        return this.x;
    }

    @Override // defpackage.cfra
    public cfxh h() {
        return this.p;
    }

    @Override // defpackage.cfra
    public Boolean i() {
        int bq = this.j.getUgcParameters().bq();
        boolean z = bq == 4;
        if (bq == 0) {
            throw null;
        }
        return Boolean.valueOf(!z);
    }

    @Override // defpackage.cfra
    public cfta j() {
        if (this.t) {
            return this.e;
        }
        return null;
    }

    @Override // defpackage.cfra
    public cfta k(int i, ddho ddhoVar) {
        return this.g.a(R.string.CONTRIBUTE_NOW, ddhoVar);
    }

    @Override // defpackage.cfra
    public Boolean l() {
        return Boolean.valueOf(this.u);
    }

    @Override // defpackage.cfra
    public Boolean m() {
        return Boolean.valueOf(this.i.f());
    }

    @Override // defpackage.cfra
    public Boolean n() {
        return Boolean.valueOf(this.m.a());
    }

    @Override // defpackage.cfra
    public dcdc<cqix<?>> o() {
        if (!this.r) {
            return F(cgbn.a());
        }
        return this.v.isEmpty() ? dcdc.f(cqgr.fT(new cfus(), cqkp.T)) : this.v;
    }

    public void p(List<dwmk> list) {
        this.c.h(list);
        cqkx.p(this);
    }

    public void q(List<dwue> list) {
        this.w = cfvh.a(this.d, list);
        cfvh.b(this.k, list);
        cqkx.p(this);
    }

    public void r(dqam dqamVar) {
        this.b.n(dqamVar);
    }

    public void s(dqwa dqwaVar) {
        this.b.o(dqwaVar);
        this.s = this.b.d().intValue() > 0;
        cqkx.p(this);
    }

    public void t(cqeo cqeoVar) {
        this.t = cqeo.CAN_ASK_FOR_CONSENT.equals(cqeoVar);
        cqkx.p(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u(defpackage.dwtu r15) {
        /*
            r14 = this;
            if (r15 == 0) goto L90
            int r0 = r15.a
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L90
            dpvo r0 = r15.b
            if (r0 != 0) goto Le
            dpvo r0 = defpackage.dpvo.e
        Le:
            int r0 = r0.a
            r2 = 2
            if (r0 != r2) goto L90
            bzrc r0 = r14.h
            dpvo r3 = r15.b
            if (r3 != 0) goto L1b
            dpvo r3 = defpackage.dpvo.e
        L1b:
            int r4 = r3.a
            if (r4 != r2) goto L24
            java.lang.Object r3 = r3.b
            dqhn r3 = (defpackage.dqhn) r3
            goto L26
        L24:
            dqhn r3 = defpackage.dqhn.f
        L26:
            r11 = r3
            dpvo r3 = r15.b
            if (r3 != 0) goto L2d
            dpvo r3 = defpackage.dpvo.e
        L2d:
            java.lang.String r12 = r3.c
            dpvo r3 = r15.b
            if (r3 != 0) goto L35
            dpvo r3 = defpackage.dpvo.e
        L35:
            boolean r13 = r3.d
            bzrb r3 = new bzrb
            dzsj<dxio<afgy>> r4 = r0.a
            dxjh r4 = (defpackage.dxjh) r4
            dxio r5 = r4.a()
            defpackage.bzrc.a(r5, r1)
            dzsj<dxio<afha>> r1 = r0.b
            dxjh r1 = (defpackage.dxjh) r1
            dxio r6 = r1.a()
            defpackage.bzrc.a(r6, r2)
            dzsj<dxio<bvvw>> r1 = r0.c
            dxjh r1 = (defpackage.dxjh) r1
            dxio r7 = r1.a()
            r1 = 3
            defpackage.bzrc.a(r7, r1)
            dzsj<dxio<blpp>> r1 = r0.d
            dxjh r1 = (defpackage.dxjh) r1
            dxio r8 = r1.a()
            r1 = 4
            defpackage.bzrc.a(r8, r1)
            dzsj<dxio<cklf>> r1 = r0.e
            dxjh r1 = (defpackage.dxjh) r1
            dxio r9 = r1.a()
            r1 = 5
            defpackage.bzrc.a(r9, r1)
            dzsj<btvo> r0 = r0.f
            java.lang.Object r0 = r0.a()
            r10 = r0
            btvo r10 = (defpackage.btvo) r10
            r0 = 6
            defpackage.bzrc.a(r10, r0)
            r0 = 7
            defpackage.bzrc.a(r11, r0)
            r0 = 8
            defpackage.bzrc.a(r12, r0)
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.x = r3
            goto L93
        L90:
            r0 = 0
            r14.x = r0
        L93:
            android.os.Bundle r0 = r14.l
            java.lang.String r1 = "campaign"
            if (r15 == 0) goto La1
            bvrt r15 = defpackage.bvrt.b(r15)
            r0.putSerializable(r1, r15)
            goto La4
        La1:
            r0.remove(r1)
        La4:
            defpackage.cqkx.p(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfrb.u(dwtu):void");
    }

    public void v(boolean z) {
        this.r = z;
        cqkx.p(this);
    }

    public void w(boolean z) {
        this.u = z;
        cqkx.p(this);
    }

    public void x(cgcr cgcrVar) {
        this.v = F(cgcrVar);
        cqkx.p(this);
    }

    public void y(cgbt cgbtVar) {
        this.f.h(cgbtVar);
        cqkx.p(this);
    }

    public void z(cgci cgciVar) {
        this.b.p(cgciVar);
    }
}
