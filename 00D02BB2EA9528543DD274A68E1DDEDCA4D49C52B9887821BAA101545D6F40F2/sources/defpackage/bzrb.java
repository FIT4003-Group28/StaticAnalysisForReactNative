package defpackage;
/* compiled from: PG */
/* renamed from: bzrb  reason: default package */
/* loaded from: classes4.dex */
public class bzrb implements bzra {
    private final dxio<afgy> a;
    private final dxio<afha> b;
    private final dxio<bvvw> c;
    private final dxio<blpp> d;
    private final dxio<cklf> e;
    private final btvo f;
    private final dqhn g;
    private String h;
    private boolean i;

    public bzrb(dxio<afgy> dxioVar, dxio<afha> dxioVar2, dxio<bvvw> dxioVar3, dxio<blpp> dxioVar4, dxio<cklf> dxioVar5, btvo btvoVar, dqhn dqhnVar, String str, boolean z) {
        this.a = dxioVar;
        this.b = dxioVar2;
        this.c = dxioVar3;
        this.d = dxioVar4;
        this.e = dxioVar5;
        this.f = btvoVar;
        this.g = dqhnVar;
        this.h = str;
        this.i = z;
    }

    @Override // defpackage.bzra
    public String a() {
        dqhm dqhmVar = this.g.b;
        if (dqhmVar == null) {
            dqhmVar = dqhm.b;
        }
        return dqhmVar.a;
    }

    @Override // defpackage.bzra
    @dzsi
    public jic b() {
        dqhn dqhnVar = this.g;
        if ((dqhnVar.a & 2) != 0) {
            dptm dptmVar = dqhnVar.c;
            if (dptmVar == null) {
                dptmVar = dptm.c;
            }
            if ((dptmVar.a & 1) != 0) {
                dptm dptmVar2 = this.g.c;
                if (dptmVar2 == null) {
                    dptmVar2 = dptm.c;
                }
                return new jic(dptmVar2.b, ckqc.FULLY_QUALIFIED, (cqtd) null, 0);
            }
        }
        return null;
    }

    @Override // defpackage.bzra
    public Boolean c() {
        dpsp dpspVar;
        dpze dpzeVar;
        dqdm dqdmVar;
        dpuu dpuuVar;
        dpus dpusVar;
        dpna dpnaVar = this.g.e;
        if (dpnaVar == null) {
            dpnaVar = dpna.c;
        }
        int a = dpmy.a(dpnaVar.a);
        int i = a - 1;
        if (a != 0) {
            boolean z = true;
            if (i == 0) {
                if (dpnaVar.a == 1) {
                    dpspVar = (dpsp) dpnaVar.b;
                } else {
                    dpspVar = dpsp.b;
                }
                return Boolean.valueOf(!dpspVar.a.isEmpty());
            } else if (i == 1) {
                if (dpnaVar.a == 2) {
                    dpzeVar = (dpze) dpnaVar.b;
                } else {
                    dpzeVar = dpze.b;
                }
                return Boolean.valueOf(!dpzeVar.a.isEmpty());
            } else if (i == 2) {
                if (dpnaVar.a == 3) {
                    dqdmVar = (dqdm) dpnaVar.b;
                } else {
                    dqdmVar = dqdm.b;
                }
                dqdk dqdkVar = dqdmVar.a;
                if (dqdkVar == null) {
                    dqdkVar = dqdk.e;
                }
                if (1 != (dqdkVar.a & 1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            } else if (i == 3) {
                if (dpnaVar.a == 4) {
                    dpuuVar = (dpuu) dpnaVar.b;
                } else {
                    dpuuVar = dpuu.b;
                }
                return Boolean.valueOf(!dpuuVar.a.isEmpty());
            } else if (i == 4) {
                if (dpnaVar.a == 5) {
                    dpusVar = (dpus) dpnaVar.b;
                } else {
                    dpusVar = dpus.b;
                }
                return Boolean.valueOf(!dpusVar.a.isEmpty());
            } else {
                return false;
            }
        }
        throw null;
    }

    @Override // defpackage.bzra
    public String d() {
        return this.g.d;
    }

    @Override // defpackage.bzra
    public cqkl e() {
        dpsp dpspVar;
        dpze dpzeVar;
        dqdm dqdmVar;
        dpuu dpuuVar;
        dpus dpusVar;
        dpna dpnaVar = this.g.e;
        if (dpnaVar == null) {
            dpnaVar = dpna.c;
        }
        int a = dpmy.a(dpnaVar.a);
        int i = a - 1;
        if (a != 0) {
            if (i == 0) {
                bvvw a2 = this.c.a();
                if (dpnaVar.a == 1) {
                    dpspVar = (dpsp) dpnaVar.b;
                } else {
                    dpspVar = dpsp.b;
                }
                String str = dpspVar.a;
                bvxn bZ = bvxu.A.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bvxu bvxuVar = (bvxu) bZ.b;
                str.getClass();
                int i2 = bvxuVar.a | 1;
                bvxuVar.a = i2;
                bvxuVar.b = str;
                int i3 = i2 | 2;
                bvxuVar.a = i3;
                bvxuVar.c = true;
                int i4 = i3 | 32;
                bvxuVar.a = i4;
                bvxuVar.g = true;
                int i5 = i4 | 8;
                bvxuVar.a = i5;
                bvxuVar.e = true;
                bvxuVar.a = i5 | 16;
                bvxuVar.f = 1;
                bvxu.c(bvxuVar);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bvxu bvxuVar2 = (bvxu) bZ.b;
                bvxuVar2.a |= 2048;
                bvxuVar2.m = true;
                bvxu.d(bvxuVar2);
                bvxj bZ2 = bvxm.e.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                bvxm bvxmVar = (bvxm) bZ2.b;
                bvxmVar.c = 2;
                bvxmVar.a = 2 | bvxmVar.a;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bvxu bvxuVar3 = (bvxu) bZ.b;
                bvxm bK = bZ2.bK();
                bK.getClass();
                bvxuVar3.t = bK;
                bvxuVar3.a |= 262144;
                dkyx aT = this.f.getUgcParameters().aT();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bvxu bvxuVar4 = (bvxu) bZ.b;
                aT.getClass();
                bvxuVar4.j = aT;
                bvxuVar4.a |= 256;
                a2.k(bZ.bK(), null, dtxu.ai);
            } else if (i == 1) {
                afgy a3 = this.a.a();
                if (dpnaVar.a == 2) {
                    dpzeVar = (dpze) dpnaVar.b;
                } else {
                    dpzeVar = dpze.b;
                }
                a3.f(dpzeVar.a);
            } else if (i == 2) {
                afha a4 = this.b.a();
                if (dpnaVar.a == 3) {
                    dqdmVar = (dqdm) dpnaVar.b;
                } else {
                    dqdmVar = dqdm.b;
                }
                dqdk dqdkVar = dqdmVar.a;
                if (dqdkVar == null) {
                    dqdkVar = dqdk.e;
                }
                a4.D(dqdkVar);
            } else if (i == 3) {
                blpp a5 = this.d.a();
                if (dpnaVar.a == 4) {
                    dpuuVar = (dpuu) dpnaVar.b;
                } else {
                    dpuuVar = dpuu.b;
                }
                a5.i(dpuuVar.a, 1, blpq.LOCAL_GUIDES_CAMPAIGN_ENTRY_POINT_NONPREFETCH);
            } else if (i == 4) {
                cklf a6 = this.e.a();
                if (dpnaVar.a == 5) {
                    dpusVar = (dpus) dpnaVar.b;
                } else {
                    dpusVar = dpus.b;
                }
                a6.a(dpusVar.a);
            }
            return cqkl.a;
        }
        throw null;
    }

    @Override // defpackage.bzra
    public String f() {
        dqhm dqhmVar = this.g.b;
        if (dqhmVar == null) {
            dqhmVar = dqhm.b;
        }
        return dqhmVar.a;
    }

    @Override // defpackage.bzra
    public Boolean g() {
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.bzra
    public cjtd h() {
        cjta b = cjtd.b();
        b.d = dtxl.et;
        if (!this.h.isEmpty()) {
            b.g(this.h);
        }
        if (g().booleanValue()) {
            b.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
        }
        return b.a();
    }

    @Override // defpackage.bzra
    public cjtd i() {
        cjta b = cjtd.b();
        b.d = dtxl.eu;
        if (!this.h.isEmpty()) {
            b.g(this.h);
        }
        if (g().booleanValue()) {
            b.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
        }
        return b.a();
    }
}
