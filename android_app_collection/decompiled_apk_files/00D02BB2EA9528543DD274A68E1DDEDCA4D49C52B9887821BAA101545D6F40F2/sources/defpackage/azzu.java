package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: azzu  reason: default package */
/* loaded from: classes3.dex */
public final class azzu extends azzm<azxi, azxg> {
    public static final /* synthetic */ int k = 0;
    private static final dcdc<dprc> l = dcdc.g(dprc.FAVORITES_ENTITY_LIST, dprc.WANT_TO_GO_ENTITY_LIST);
    public azxi j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private azzu(defpackage.azxi r9) {
        /*
            r8 = this;
            dolo r0 = r9.j()
            dpot r0 = r0.b
            if (r0 != 0) goto La
            dpot r0 = defpackage.dpot.m
        La:
            java.lang.String r2 = r0.f
            dolo r0 = r9.j()
            dpot r0 = r0.b
            if (r0 != 0) goto L16
            dpot r0 = defpackage.dpot.m
        L16:
            java.lang.String r3 = r0.g
            dolo r0 = r9.j()
            dpot r0 = r0.b
            if (r0 != 0) goto L22
            dpot r0 = defpackage.dpot.m
        L22:
            dpox r0 = r0.k
            if (r0 != 0) goto L28
            dpox r0 = defpackage.dpox.d
        L28:
            dnwl r4 = at(r0)
            dolo r0 = r9.j()
            dpot r0 = r0.b
            if (r0 != 0) goto L36
            dpot r0 = defpackage.dpot.m
        L36:
            dpos r0 = r0.j
            if (r0 != 0) goto L3c
            dpos r0 = defpackage.dpos.d
        L3c:
            dpqp r0 = r0.b
            if (r0 != 0) goto L42
            dpqp r0 = defpackage.dpqp.c
        L42:
            boolean r5 = r0.b
            dolo r0 = r9.j()
            dpot r0 = r0.b
            if (r0 != 0) goto L4e
            dpot r0 = defpackage.dpot.m
        L4e:
            long r6 = r0.i
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r8.j = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azzu.<init>(azxi):void");
    }

    public static azzu aq(azxi azxiVar) {
        azzu azzuVar = new azzu(azxiVar);
        ArrayList arrayList = new ArrayList();
        for (azxg azxgVar : azxiVar.a) {
            arrayList.add(azzv.u(azxgVar));
        }
        azzuVar.al(arrayList);
        return azzuVar;
    }

    @dzsi
    private static dnwl at(dpox dpoxVar) {
        if ((dpoxVar.a & 1) != 0) {
            dnwk bZ = dnwl.f.bZ();
            dnwq bZ2 = dnwr.c.bZ();
            String str = dpoxVar.b;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnwr dnwrVar = (dnwr) bZ2.b;
            str.getClass();
            dnwrVar.a |= 1;
            dnwrVar.b = str;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnwl dnwlVar = (dnwl) bZ.b;
            dnwr bK = bZ2.bK();
            bK.getClass();
            dnwlVar.e = bK;
            dnwlVar.a |= 8192;
            return bZ.bK();
        }
        return null;
    }

    private final dpot au() {
        dpot dpotVar = this.j.j().b;
        return dpotVar == null ? dpot.m : dpotVar;
    }

    private static boolean av(azxi azxiVar) {
        azwl azwlVar = azxiVar.j;
        return azwlVar != null && !dbsj.d(azwlVar.a) && !azwlVar.a.equals("Auto-generate a ClientId, please!");
    }

    @Override // defpackage.baad
    public final boolean A() {
        dpqw b = dpqw.b(au().c);
        if (b == null) {
            b = dpqw.UNKNOWN_ENTITY_LIST_ROLE;
        }
        return b == dpqw.COLLABORATOR_ENTITY_LIST;
    }

    @Override // defpackage.baad
    public final boolean B() {
        if (!y()) {
            dpri dpriVar = p().d;
            if (dpriVar == null) {
                dpriVar = dpri.f;
            }
            return (dpriVar.a & 8) != 0;
        }
        return false;
    }

    @Override // defpackage.baad
    public final boolean C() {
        dpri dpriVar = p().d;
        if (dpriVar == null) {
            dpriVar = dpri.f;
        }
        dpqn b = dpqn.b(dpriVar.b);
        if (b == null) {
            b = dpqn.PRIVATE_ENTITY_LIST;
        }
        return b == dpqn.WRITABLE_ENTITY_LIST;
    }

    @Override // defpackage.baad
    public final boolean D() {
        dpqw b = dpqw.b(au().c);
        if (b == null) {
            b = dpqw.UNKNOWN_ENTITY_LIST_ROLE;
        }
        return b == dpqw.OWNER_ENTITY_LIST;
    }

    @Override // defpackage.baad
    public final dpre N() {
        dpre dpreVar = au().e;
        return dpreVar == null ? dpre.e : dpreVar;
    }

    @Override // defpackage.baad
    public final String O() {
        dpre dpreVar = au().e;
        if (dpreVar == null) {
            dpreVar = dpre.e;
        }
        return dpreVar.b;
    }

    @Override // defpackage.baad
    public final String P() {
        dpre dpreVar = au().e;
        if (dpreVar == null) {
            dpreVar = dpre.e;
        }
        return dpreVar.c;
    }

    @Override // defpackage.baad
    public final boolean aa(baad baadVar) {
        if (baadVar instanceof azzu) {
            azxi azxiVar = ((azzu) baadVar).j;
            if (!azxiVar.n().a() || !this.j.n().a()) {
                if (!av(azxiVar) || !av(this.j)) {
                    return false;
                }
                azwl azwlVar = azxiVar.j;
                dbsk.s(azwlVar);
                String str = azwlVar.a;
                azwl azwlVar2 = this.j.j;
                dbsk.s(azwlVar2);
                return str.equals(azwlVar2.a);
            }
            return azxiVar.n().b().equals(this.j.n().b());
        }
        return false;
    }

    @Override // defpackage.baad
    public final void ad() {
        dpot dpotVar = this.j.j().b;
        if (dpotVar == null) {
            dpotVar = dpot.m;
        }
        F(dpotVar.f);
        dpot dpotVar2 = this.j.j().b;
        if (dpotVar2 == null) {
            dpotVar2 = dpot.m;
        }
        H(dpotVar2.g);
        dpot dpotVar3 = this.j.j().b;
        if (dpotVar3 == null) {
            dpotVar3 = dpot.m;
        }
        dpox dpoxVar = dpotVar3.k;
        if (dpoxVar == null) {
            dpoxVar = dpox.d;
        }
        J(at(dpoxVar));
        dpot dpotVar4 = this.j.j().b;
        if (dpotVar4 == null) {
            dpotVar4 = dpot.m;
        }
        dpos dposVar = dpotVar4.j;
        if (dposVar == null) {
            dposVar = dpos.d;
        }
        dpqp dpqpVar = dposVar.b;
        if (dpqpVar == null) {
            dpqpVar = dpqp.c;
        }
        K(dpqpVar.b);
        an();
        ArrayList arrayList = new ArrayList();
        for (azxg azxgVar : this.j.a) {
            arrayList.add(azzv.u(azxgVar));
        }
        al(arrayList);
    }

    @Override // defpackage.baad
    public final String ae() {
        dpqd dpqdVar = au().l;
        if (dpqdVar == null) {
            dpqdVar = dpqd.c;
        }
        return dpqdVar.a;
    }

    @Override // defpackage.baad
    public final long af() {
        dpos dposVar = au().j;
        if (dposVar == null) {
            dposVar = dpos.d;
        }
        dprg dprgVar = dposVar.c;
        if (dprgVar == null) {
            dprgVar = dprg.c;
        }
        return dprgVar.a;
    }

    @Override // defpackage.baad
    public final String ag() {
        dpos dposVar = au().j;
        if (dposVar == null) {
            dposVar = dpos.d;
        }
        dprg dprgVar = dposVar.c;
        if (dprgVar == null) {
            dprgVar = dprg.c;
        }
        return dprgVar.b;
    }

    @Override // defpackage.azzm, defpackage.baad
    public final long ah() {
        long q = this.j.q();
        for (azxg azxgVar : this.j.a) {
            if (azxgVar.q() > q) {
                q = azxgVar.q();
            }
        }
        return q;
    }

    @Override // defpackage.baad
    public final int ai() {
        dpqd dpqdVar = au().l;
        if (dpqdVar == null) {
            dpqdVar = dpqd.c;
        }
        int a = dpra.a(dpqdVar.b);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    @Override // defpackage.azzp
    public final /* bridge */ /* synthetic */ azwm ao() {
        return this.j;
    }

    @Override // defpackage.azzp
    public final void ap(azzo<azxi> azzoVar) {
        dpot dpotVar = this.j.j().b;
        if (dpotVar == null) {
            dpotVar = dpot.m;
        }
        dsqp dsqpVar = (dsqp) dpotVar.cu(5);
        dsqpVar.bC(dpotVar);
        dpoq dpoqVar = (dpoq) dsqpVar;
        if (this.h) {
            if (!q()) {
                String str = this.b;
                if (dpoqVar.c) {
                    dpoqVar.bF();
                    dpoqVar.c = false;
                }
                dpot dpotVar2 = (dpot) dpoqVar.b;
                str.getClass();
                int i = dpotVar2.a | 16;
                dpotVar2.a = i;
                dpotVar2.f = str;
                String str2 = this.c;
                str2.getClass();
                dpotVar2.a = i | 32;
                dpotVar2.g = str2;
                dnwl I = I();
                dpox dpoxVar = null;
                if (I != null) {
                    dnwr dnwrVar = I.e;
                    if (dnwrVar == null) {
                        dnwrVar = dnwr.c;
                    }
                    if ((dnwrVar.a & 1) != 0) {
                        dpow bZ = dpox.d.bZ();
                        dnwr dnwrVar2 = I.e;
                        if (dnwrVar2 == null) {
                            dnwrVar2 = dnwr.c;
                        }
                        String str3 = dnwrVar2.b;
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dpox dpoxVar2 = (dpox) bZ.b;
                        str3.getClass();
                        dpoxVar2.a |= 1;
                        dpoxVar2.b = str3;
                        dpoxVar = bZ.bK();
                    }
                }
                if (dpoxVar != null) {
                    if (dpoqVar.c) {
                        dpoqVar.bF();
                        dpoqVar.c = false;
                    }
                    dpot dpotVar3 = (dpot) dpoqVar.b;
                    dpoxVar.getClass();
                    dpotVar3.k = dpoxVar;
                    dpotVar3.a |= 2048;
                }
            }
            dpos dposVar = au().j;
            if (dposVar == null) {
                dposVar = dpos.d;
            }
            dsqp dsqpVar2 = (dsqp) dposVar.cu(5);
            dsqpVar2.bC(dposVar);
            dpor dporVar = (dpor) dsqpVar2;
            dpos dposVar2 = au().j;
            if (dposVar2 == null) {
                dposVar2 = dpos.d;
            }
            dpqp dpqpVar = dposVar2.b;
            if (dpqpVar == null) {
                dpqpVar = dpqp.c;
            }
            dsqp dsqpVar3 = (dsqp) dpqpVar.cu(5);
            dsqpVar3.bC(dpqpVar);
            dpqo dpqoVar = (dpqo) dsqpVar3;
            boolean z = this.e;
            if (dpqoVar.c) {
                dpqoVar.bF();
                dpqoVar.c = false;
            }
            dpqp dpqpVar2 = (dpqp) dpqoVar.b;
            dpqpVar2.a |= 1;
            dpqpVar2.b = z;
            if (dporVar.c) {
                dporVar.bF();
                dporVar.c = false;
            }
            dpos dposVar3 = (dpos) dporVar.b;
            dpqp bK = dpqoVar.bK();
            bK.getClass();
            dposVar3.b = bK;
            dposVar3.a |= 2;
            if (dpoqVar.c) {
                dpoqVar.bF();
                dpoqVar.c = false;
            }
            dpot dpotVar4 = (dpot) dpoqVar.b;
            dpos bK2 = dporVar.bK();
            bK2.getClass();
            dpotVar4.j = bK2;
            dpotVar4.a |= 1024;
        }
        azxh i2 = this.j.i();
        i2.c(dpoqVar.bK());
        this.j = azzoVar.a(i2.b(), this.h);
        an();
    }

    public final void ar(final azzo<azxg> azzoVar) {
        ArrayList arrayList = new ArrayList();
        dcdc<azzp<baal, azxg>> as = as();
        int size = as.size();
        for (int i = 0; i < size; i++) {
            azzp<baal, azxg> azzpVar = as.get(i);
            azzpVar.ap(new azzo(this, azzoVar) { // from class: azzs
                private final azzu a;
                private final azzo b;

                {
                    this.a = this;
                    this.b = azzoVar;
                }

                @Override // defpackage.azzo
                public final Object a(Object obj, boolean z) {
                    azzu azzuVar = this.a;
                    azzo azzoVar2 = this.b;
                    azxg azxgVar = (azxg) obj;
                    dbsg<String> n = azzuVar.j.n();
                    if (n.a() && !azxgVar.j().a()) {
                        azxf i2 = azxgVar.i();
                        String b = n.b();
                        dolm dolmVar = i2.a;
                        dsqp dsqpVar = (dsqp) dolmVar.cu(5);
                        dsqpVar.bC(dolmVar);
                        doll dollVar = (doll) dsqpVar;
                        if (dollVar.c) {
                            dollVar.bF();
                            dollVar.c = false;
                        }
                        dolm dolmVar2 = (dolm) dollVar.b;
                        dolm dolmVar3 = dolm.f;
                        b.getClass();
                        dolmVar2.a |= 2;
                        dolmVar2.c = b;
                        i2.a = dollVar.bK();
                        azxgVar = i2.a();
                    }
                    return (azxg) azzoVar2.a(azxgVar, z);
                }
            });
            arrayList.add(azzpVar.ao());
        }
        azxh i2 = this.j.i();
        i2.b = dcdc.r(arrayList);
        this.j = i2.b();
    }

    public final dcdc<azzp<baal, azxg>> as() {
        return dcbg.b(dcdc.r(this.f)).s(azzt.a).z();
    }

    @Override // defpackage.baad
    public final String l() {
        dbsg<String> n = this.j.n();
        azwl azwlVar = this.j.j;
        dbsk.s(azwlVar);
        return n.c(azwlVar.a);
    }

    @Override // defpackage.baad
    public final String m() {
        azwl azwlVar = this.j.j;
        dbsk.s(azwlVar);
        return azwlVar.a;
    }

    @Override // defpackage.azzm, defpackage.baad
    public final dpov n() {
        return this.j.o();
    }

    @Override // defpackage.baad
    public final baab o() {
        if (!y()) {
            return baab.CUSTOM;
        }
        return (baab) this.j.k().h(new dbrn(this) { // from class: azzq
            private final azzu a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                azzu azzuVar = this.a;
                dprc dprcVar = dprc.UNKNOWN_ENTITY_LIST_TYPE;
                dpqn dpqnVar = dpqn.UNKNOWN_ENTITY_LIST_PERMISSION;
                int ordinal = ((dprc) obj).ordinal();
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        dpqj c = azzuVar.j.m().c(dpqj.UNKNOWN_ENTITY_LIST_NAMESPACE);
                        List<dppz> l2 = azzuVar.j.l();
                        if (l2.size() == 1 && c == dpqj.UNIVERSAL_ENTITY_LIST) {
                            dppy b = dppy.b(((dppz) dcft.c(l2)).b);
                            if (b == null) {
                                b = dppy.UNKNOWN_ITEM_TYPE;
                            }
                            if (b == dppy.DEAL_ENTITY_LIST_ITEM) {
                                return baab.LOCAL_DEAL;
                            }
                        }
                        return azzuVar.D() ? baab.FAVORITES : baab.CUSTOM;
                    } else if (ordinal == 3) {
                        return azzuVar.D() ? baab.WANT_TO_GO : baab.CUSTOM;
                    } else if (ordinal == 4) {
                        dpqj c2 = azzuVar.j.m().c(dpqj.UNKNOWN_ENTITY_LIST_NAMESPACE);
                        List<dppz> l3 = azzuVar.j.l();
                        if (l3.size() == 1 && c2 == dpqj.LOCAL_FOLLOWING) {
                            dppy b2 = dppy.b(((dppz) dcft.c(l3)).b);
                            if (b2 == null) {
                                b2 = dppy.UNKNOWN_ITEM_TYPE;
                            }
                            if (b2 == dppy.PLACE_ENTITY_LIST_ITEM) {
                                return baab.LOCAL_FOLLOWING_STARRED_PLACES;
                            }
                        }
                        return baab.STARRED_PLACES;
                    } else {
                        return baab.UNKNOWN;
                    }
                }
                return baab.CUSTOM;
            }
        }).c(baab.UNKNOWN);
    }

    @Override // defpackage.baad
    public final dpot p() {
        dpot au = au();
        dsqp dsqpVar = (dsqp) au.cu(5);
        dsqpVar.bC(au);
        dpoq dpoqVar = (dpoq) dsqpVar;
        dpoqVar.a(dcft.o(i(), azzr.a));
        return dpoqVar.bK();
    }

    @Override // defpackage.azzm, defpackage.baad
    public final boolean q() {
        dpqj b = dpqj.b(this.j.o().e);
        if (b == null) {
            b = dpqj.UNKNOWN_ENTITY_LIST_NAMESPACE;
        }
        if (!b.equals(dpqj.EVERYDAY_TRIPS)) {
            return azzm.a.contains(o()) && D();
        }
        return true;
    }

    @Override // defpackage.baad
    public final boolean s() {
        return l.contains(this.j.k().c(dprc.UNKNOWN_ENTITY_LIST_TYPE)) && A();
    }

    @Override // defpackage.baad
    public final baac t() {
        dpri dpriVar = au().d;
        if (dpriVar == null) {
            dpriVar = dpri.f;
        }
        dpqn b = dpqn.b(dpriVar.b);
        if (b == null) {
            b = dpqn.PRIVATE_ENTITY_LIST;
        }
        dprc dprcVar = dprc.UNKNOWN_ENTITY_LIST_TYPE;
        int ordinal = b.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                int a = dpqr.a(dpriVar.c);
                if (a == 0 || a != 3) {
                    return baac.SHARED;
                }
                return baac.PUBLISHED;
            } else if (ordinal == 3) {
                int a2 = dpqr.a(dpriVar.c);
                if (a2 == 0 || a2 != 3) {
                    return baac.SHARED;
                }
                return baac.PUBLISHED;
            } else {
                return baac.UNKNOWN;
            }
        }
        return baac.PRIVATE;
    }

    @Override // defpackage.baad
    public final String u() {
        dpri dpriVar = au().d;
        if (dpriVar == null) {
            dpriVar = dpri.f;
        }
        return dpriVar.d;
    }

    @Override // defpackage.baad
    public final String v() {
        dpri dpriVar = au().d;
        if (dpriVar == null) {
            dpriVar = dpri.f;
        }
        return dpriVar.e;
    }

    @Override // defpackage.baad
    public final boolean w() {
        dpri dpriVar = p().d;
        if (dpriVar == null) {
            dpriVar = dpri.f;
        }
        dpqn b = dpqn.b(dpriVar.b);
        if (b == null) {
            b = dpqn.PRIVATE_ENTITY_LIST;
        }
        return b != dpqn.PRIVATE_ENTITY_LIST;
    }

    @Override // defpackage.baad
    public final boolean x() {
        dpri dpriVar = p().d;
        if (dpriVar == null) {
            dpriVar = dpri.f;
        }
        int a = dpqr.a(dpriVar.c);
        return a != 0 && a == 3;
    }

    @Override // defpackage.baad
    public final boolean y() {
        dpqw b = dpqw.b(au().c);
        if (b == null) {
            b = dpqw.UNKNOWN_ENTITY_LIST_ROLE;
        }
        if (b != dpqw.OWNER_ENTITY_LIST) {
            dpqw b2 = dpqw.b(au().c);
            if (b2 == null) {
                b2 = dpqw.UNKNOWN_ENTITY_LIST_ROLE;
            }
            return b2 == dpqw.COLLABORATOR_ENTITY_LIST;
        }
        return true;
    }

    @Override // defpackage.baad
    public final boolean z() {
        dpqw b = dpqw.b(au().c);
        if (b == null) {
            b = dpqw.UNKNOWN_ENTITY_LIST_ROLE;
        }
        return b == dpqw.FOLLOWER_ENTITY_LIST;
    }
}
