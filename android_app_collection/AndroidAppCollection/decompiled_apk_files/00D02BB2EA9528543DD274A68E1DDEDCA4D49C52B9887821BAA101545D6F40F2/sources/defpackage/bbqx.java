package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: bbqx  reason: default package */
/* loaded from: classes3.dex */
public final class bbqx implements bbuh {
    private static final dcqe c = dcqe.c("bbqx");
    public final bbtu a;
    public final Context b;
    private final crtf d;

    public bbqx(Context context, crtf crtfVar, bbtu bbtuVar) {
        this.b = context;
        this.d = crtfVar;
        this.a = bbtuVar;
    }

    public static dced<akqi, bbqw<?>> c(Context context, List<crua> list, dcka<akqi, bbqw<?>> dckaVar) {
        Object i;
        bbqw<?> a;
        dcdz j = dced.j();
        HashMap hashMap = new HashMap();
        for (crua cruaVar : list) {
            crtx b = crtx.b(cruaVar.e);
            if (b == null) {
                b = crtx.UNKNOWN;
            }
            if (b.equals(crtx.UPLOADED)) {
                dfqq dfqqVar = cruaVar.j;
                if (dfqqVar == null) {
                    dfqqVar = dfqq.x;
                }
                hashMap.put(dfqqVar.c, cruaVar);
            } else {
                d(context, cruaVar, j);
            }
        }
        for (Map.Entry<akqi, bbqw<?>> entry : dckaVar.I()) {
            bbqw<?> value = entry.getValue();
            if (!value.b().a()) {
                Object[] objArr = new Object[1];
                T t = value.a;
                if (t instanceof bbtm) {
                    i = dbsg.i(((bbtm) t).z().toString());
                } else {
                    i = t instanceof dwfl ? dbsg.i(((dwfl) t).h) : dbpy.a;
                }
                objArr[0] = i;
                bvoo.h("media key missing for: %s", objArr);
            } else {
                akqi key = entry.getKey();
                T t2 = value.a;
                if (!(t2 instanceof bbtm)) {
                    a = value;
                } else {
                    bbtl u = ((bbtm) t2).u();
                    u.s(crtx.PUBLISHED);
                    a = bbqw.a(u.a());
                }
                j.h(key, a);
                hashMap.remove(value.b().b());
            }
        }
        for (crua cruaVar2 : hashMap.values()) {
            d(context, cruaVar2, j);
        }
        return j.f();
    }

    private static void d(Context context, crua cruaVar, dcdz<akqi, bbqw<?>> dcdzVar) {
        String str;
        bbtm a;
        crts crtsVar = cruaVar.d;
        if (crtsVar == null) {
            crtsVar = crts.r;
        }
        dgrh dgrhVar = crtsVar.e;
        if (dgrhVar == null) {
            dgrhVar = dgrh.d;
        }
        akqi k = akqi.k(dgrhVar);
        dbsk.s(k);
        crtx b = crtx.b(cruaVar.e);
        if (b == null) {
            b = crtx.UNKNOWN;
        }
        if (b.equals(crtx.UPLOADED)) {
            dfqq dfqqVar = cruaVar.j;
            if (dfqqVar == null) {
                dfqqVar = dfqq.x;
            }
            str = dfqqVar.v;
        } else {
            str = cruaVar.c;
        }
        bbtl v = bbtm.v(str);
        crtx b2 = crtx.b(cruaVar.e);
        if (b2 == null) {
            b2 = crtx.UNKNOWN;
        }
        v.s(b2);
        crts crtsVar2 = cruaVar.d;
        if (crtsVar2 == null) {
            crtsVar2 = crts.r;
        }
        if ((crtsVar2.a & 1024) != 0) {
            crts crtsVar3 = cruaVar.d;
            if (crtsVar3 == null) {
                crtsVar3 = crts.r;
            }
            dspd dspdVar = crtsVar3.o;
            try {
                dsqa b3 = dsqa.b();
                bbpu bbpuVar = bbpu.h;
                try {
                    dspj s = dspdVar.s();
                    dsqw dsqwVar = (dsqw) bbpuVar.cu(4);
                    try {
                        dstc b4 = dsst.a.b(dsqwVar);
                        b4.f(dsqwVar, dspk.n(s), b3);
                        b4.j(dsqwVar);
                        try {
                            s.b(0);
                            dsqw.cv(dsqwVar);
                            bbpu bbpuVar2 = (bbpu) dsqwVar;
                            if ((bbpuVar2.a & 1) != 0) {
                                v.c(Long.valueOf(bbpuVar2.b));
                            }
                            if ((bbpuVar2.a & 2) != 0) {
                                v.q(Integer.valueOf(bbpuVar2.c));
                            }
                            if ((bbpuVar2.a & 4) != 0) {
                                v.p(Integer.valueOf(bbpuVar2.d));
                            }
                            if ((bbpuVar2.a & 8) != 0) {
                                v.n(Integer.valueOf(bbpuVar2.e));
                            }
                            if ((bbpuVar2.a & 16) != 0) {
                                v.d(Long.valueOf(bbpuVar2.f));
                            }
                            if ((bbpuVar2.a & 32) != 0) {
                                v.o(bbpuVar2.g);
                            }
                        } catch (dsrm e) {
                            throw e;
                        }
                    } catch (IOException e2) {
                        if (!(e2.getCause() instanceof dsrm)) {
                            throw new dsrm(e2.getMessage());
                        }
                        throw ((dsrm) e2.getCause());
                    } catch (RuntimeException e3) {
                        if (e3.getCause() instanceof dsrm) {
                            throw ((dsrm) e3.getCause());
                        }
                        throw e3;
                    }
                } catch (dsrm e4) {
                    throw e4;
                }
            } catch (dsrm unused) {
            }
        }
        crtx b5 = crtx.b(cruaVar.e);
        if (b5 == null) {
            b5 = crtx.UNKNOWN;
        }
        if (b5.equals(crtx.UPLOADED)) {
            dfqq dfqqVar2 = cruaVar.j;
            if (dfqqVar2 == null) {
                dfqqVar2 = dfqq.x;
            }
            v.k(dfqqVar2.c);
        }
        crts crtsVar4 = cruaVar.d;
        if (crtsVar4 == null) {
            crtsVar4 = crts.r;
        }
        if ((crtsVar4.a & 4) != 0) {
            crts crtsVar5 = cruaVar.d;
            if (crtsVar5 == null) {
                crtsVar5 = crts.r;
            }
            dgpo dgpoVar = crtsVar5.d;
            if (dgpoVar == null) {
                dgpoVar = dgpo.e;
            }
            double d = dgpoVar.b;
            crts crtsVar6 = cruaVar.d;
            if (crtsVar6 == null) {
                crtsVar6 = crts.r;
            }
            dgpo dgpoVar2 = crtsVar6.d;
            if (dgpoVar2 == null) {
                dgpoVar2 = dgpo.e;
            }
            v.i(new akqq(d, dgpoVar2.c));
        }
        int i = cruaVar.a;
        if ((i & 256) != 0 || (i & 512) != 0) {
            dfwj bZ = dfwk.d.bZ();
            int i2 = cruaVar.a;
            if ((i2 & 512) != 0) {
                dfwe e5 = e(cruaVar.l);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dfwk dfwkVar = (dfwk) bZ.b;
                e5.getClass();
                dfwkVar.c = e5;
                dfwkVar.a |= 128;
            } else if ((i2 & 256) != 0) {
                dfwe e6 = e(cruaVar.k);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dfwk dfwkVar2 = (dfwk) bZ.b;
                e6.getClass();
                dfwkVar2.c = e6;
                dfwkVar2.a |= 128;
            }
            dfxr bZ2 = dfxs.h.bZ();
            dfwk bK = bZ.bK();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dfxs dfxsVar = (dfxs) bZ2.b;
            bK.getClass();
            dfxsVar.g = bK;
            dfxsVar.a |= 32;
            v.u(bZ2.bK());
            v.g(bbti.PHOTO);
            crtx b6 = crtx.b(cruaVar.e);
            if (b6 == null) {
                b6 = crtx.UNKNOWN;
            }
            if (b6.equals(crtx.UPLOADED)) {
                dfqq dfqqVar3 = cruaVar.j;
                if (dfqqVar3 == null) {
                    dfqqVar3 = dfqq.x;
                }
                int a2 = dgpq.a(dfqqVar3.u);
                if (a2 != 0 && a2 == 3) {
                    v.g(bbti.VIDEO);
                }
            } else if ((cruaVar.a & 2) != 0) {
                dbsg<bbti> b7 = bbti.b(context, Uri.parse(cruaVar.c));
                if (b7.a() && b7.b() == bbti.VIDEO) {
                    v.g(bbti.VIDEO);
                }
            }
            a = v.a();
        } else {
            a = v.a();
        }
        dcdzVar.h(k, bbqw.a(a));
    }

    private static dfwe e(long j) {
        eaol eaolVar = new eaol(j, eaou.b);
        dfwd bZ = dfwe.j.bZ();
        int y = eaolVar.y();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfwe dfweVar = (dfwe) bZ.b;
        dfweVar.a |= 1;
        dfweVar.b = y;
        int z = eaolVar.z();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfwe dfweVar2 = (dfwe) bZ.b;
        dfweVar2.a |= 2;
        dfweVar2.c = z;
        int A = eaolVar.A();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfwe dfweVar3 = (dfwe) bZ.b;
        dfweVar3.a |= 4;
        dfweVar3.d = A;
        int C = eaolVar.C();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfwe dfweVar4 = (dfwe) bZ.b;
        dfweVar4.a |= 8;
        dfweVar4.e = C;
        int D = eaolVar.D();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfwe dfweVar5 = (dfwe) bZ.b;
        dfweVar5.a |= 16;
        dfweVar5.f = D;
        return bZ.bK();
    }

    @Override // defpackage.bbuh
    public final dcdc<crua> a(String str) {
        dcdc f;
        bvrj.UI_THREAD.d();
        final dcdc k = dcdc.k(crtx.PENDING, crtx.PREPROCESSING, crtx.IN_PROGRESS, crtx.UPLOADED, crtx.IMPORTED, crtx.TRANSIENT_ERROR);
        bvrj.UI_THREAD.d();
        crtf crtfVar = this.d;
        synchronized (crtfVar.k) {
            dccx F = dcdc.F();
            Queue<crua> queue = crtfVar.k.a.get(str);
            F.i(queue == null ? dcdc.e() : dcdc.r(queue));
            F.i(crtfVar.f.d("account_name = ?", new String[]{str}));
            f = F.f();
        }
        return dcbg.b(f).o(new dbsl(k) { // from class: bbqv
            private final List a;

            {
                this.a = k;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                List list = this.a;
                crua cruaVar = (crua) obj;
                dbsk.s(cruaVar);
                crtx b = crtx.b(cruaVar.e);
                if (b == null) {
                    b = crtx.UNKNOWN;
                }
                return list.contains(b);
            }
        }).z();
    }

    @Override // defpackage.bbuh
    public final dced<akqi, bbtm> b(String str, dcka<akqi, bbtm> dckaVar) {
        bvrj.UI_THREAD.d();
        return dced.k(dckz.d(c(this.b, a(str), dckz.d(dckaVar, bbqt.a)), new dbrn(this) { // from class: bbqu
            private final bbqx a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                bbqx bbqxVar = this.a;
                bbqw bbqwVar = (bbqw) obj;
                if (bbqwVar == null) {
                    return null;
                }
                T t = bbqwVar.a;
                if (t instanceof bbtm) {
                    return (bbtm) t;
                }
                if (t instanceof dwfl) {
                    return bbqxVar.a.a((dwfl) t, eaou.i());
                }
                return null;
            }
        }));
    }
}
