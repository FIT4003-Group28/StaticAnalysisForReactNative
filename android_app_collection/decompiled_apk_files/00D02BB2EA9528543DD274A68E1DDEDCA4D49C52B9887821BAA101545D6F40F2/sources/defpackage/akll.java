package defpackage;

import android.app.Activity;
import java.util.List;
/* compiled from: PG */
/* renamed from: akll  reason: default package */
/* loaded from: classes2.dex */
public final class akll implements akla {
    private final akgk a;
    @dzsi
    private final acwt b;
    private final dxio<aklw> c;
    private final dxio<aklq> d;

    public akll(akgk akgkVar, acwt acwtVar, dxio<aklw> dxioVar, dxio<aklq> dxioVar2) {
        this.a = akgkVar;
        this.b = acwtVar;
        this.c = dxioVar;
        this.d = dxioVar2;
    }

    private static ddho e(dpwr dpwrVar, dhxz dhxzVar, absg absgVar) {
        dpwr dpwrVar2 = dpwr.UNKNOWN_MAJOR_EVENT_CARD_PLACEMENT;
        switch (dpwrVar.ordinal()) {
            case 1:
            case 2:
            case 4:
            case 11:
                if (dhxzVar.a != 4) {
                    return absgVar == absg.AREA_EXPLORE ? dtxj.ch : dtxr.O;
                }
                int a = diim.a(((diin) dhxzVar.b).f);
                if (a == 0 || a != 5) {
                    return dtxr.P;
                }
                return absgVar == absg.AREA_EXPLORE ? dtxj.ci : dtxr.Q;
            case 3:
            case 5:
                return dtxr.R;
            case 6:
            case 7:
                return dtxr.S;
            case 8:
            case 9:
                return dtxy.iw;
            case 10:
                return dtxo.aK;
            case 12:
                return dtxo.bu;
            case 13:
                return dtxo.bN;
            case 14:
                return dtxl.q;
            case 15:
                return dtxu.bl;
            case 16:
                return dtxl.ac;
            default:
                IllegalStateException illegalStateException = new IllegalStateException();
                int i = dpwrVar.r;
                bvoo.i(illegalStateException);
                return dtxv.y;
        }
    }

    @Override // defpackage.akla
    public final List<cqix<? extends aklb>> a(dhxw dhxwVar) {
        return b(dhxwVar, dbpy.a, absg.UNKNOWN_EXPLORE_SURFACE);
    }

    @Override // defpackage.akla
    public final List<cqix<? extends aklb>> b(dhxw dhxwVar, dbsg<aaao> dbsgVar, absg absgVar) {
        djsd djsdVar;
        cqiw akkuVar;
        djsd djsdVar2;
        cqix fT;
        ddho ddhoVar;
        diin diinVar;
        cqiw akioVar;
        diin diinVar2;
        cqiw akjkVar;
        dhxw dhxwVar2 = dhxwVar;
        dccx F = dcdc.F();
        for (dhxz dhxzVar : dhxwVar2.c) {
            dpwr b = dpwr.b(dhxwVar2.b);
            if (b == null) {
                b = dpwr.UNKNOWN_MAJOR_EVENT_CARD_PLACEMENT;
            }
            dpwr dpwrVar = b;
            ddho e = e(dpwrVar, dhxzVar, absgVar);
            int a = dhxy.a(dhxzVar.a);
            int i = a - 1;
            if (a == 0) {
                throw null;
            }
            if (i != 0) {
                if (i == 2) {
                    if (dpwrVar.ordinal() != 10) {
                        ddhoVar = e(dpwrVar, dhxzVar, absgVar);
                    } else {
                        ddhoVar = dtxo.aL;
                    }
                    ddho ddhoVar2 = ddhoVar;
                    if (dhxzVar.a == 4) {
                        diinVar = (diin) dhxzVar.b;
                    } else {
                        diinVar = diin.h;
                    }
                    diik diikVar = diinVar.d;
                    if (diikVar == null) {
                        diikVar = diik.c;
                    }
                    diii b2 = diii.b(diikVar.b);
                    if (b2 == null) {
                        b2 = diii.UNKNOWN_ALIGNMENT;
                    }
                    int a2 = diim.a(diinVar.f);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    int i2 = a2 - 1;
                    if (i2 == 1) {
                        akioVar = new akio(this.a.a(), b2, new akku(akio.a), new akku(akio.b));
                    } else if (i2 != 2) {
                        if (i2 == 3) {
                            akjkVar = new akjk(this.a.a(), b2);
                        } else if (i2 != 4) {
                            akioVar = null;
                        } else {
                            akjkVar = new akji(this.a.a());
                        }
                        akioVar = akjkVar;
                    } else {
                        akioVar = new akio(this.a.a(), b2, new akki(akio.d, akkh.CAROUSEL_SUB_CARD), new akki(akio.c, akkh.CAROUSEL_SUB_CARD));
                    }
                    if (akioVar != null) {
                        aklq a3 = this.d.a();
                        if (dhxzVar.a == 4) {
                            diinVar2 = (diin) dhxzVar.b;
                        } else {
                            diinVar2 = diin.h;
                        }
                        diin diinVar3 = diinVar2;
                        acwt acwtVar = this.b;
                        aklq.a(diinVar3, 1);
                        aklq.a(dpwrVar, 2);
                        aklq.a(absgVar, 6);
                        cqat a4 = a3.a.a();
                        aklq.a(a4, 7);
                        aklw a5 = a3.b.a();
                        aklq.a(a5, 8);
                        aklo a6 = a3.c.a();
                        aklq.a(a6, 9);
                        fT = cqgr.fT(akioVar, new aklp(diinVar3, dpwrVar, e, ddhoVar2, acwtVar, absgVar, a4, a5, a6));
                    }
                }
                fT = null;
            } else {
                if (dhxzVar.a == 1) {
                    djsdVar = (djsd) dhxzVar.b;
                } else {
                    djsdVar = djsd.f;
                }
                int a7 = djsc.a(djsdVar.c);
                if (a7 == 0) {
                    a7 = 1;
                }
                int i3 = a7 - 1;
                if (i3 != 0 && i3 != 1 && i3 != 3) {
                    akgk akgkVar = this.a;
                    int a8 = djsc.a(djsdVar.c);
                    if (a8 == 0) {
                        a8 = 1;
                    }
                    akkuVar = new akki(akgkVar.b(a8), akkh.STANDALONE);
                } else {
                    akgk akgkVar2 = this.a;
                    int a9 = djsc.a(djsdVar.c);
                    if (a9 == 0) {
                        a9 = 1;
                    }
                    akkuVar = new akku(akgkVar2.b(a9));
                }
                aklw a10 = this.c.a();
                if (dhxzVar.a == 1) {
                    djsdVar2 = (djsd) dhxzVar.b;
                } else {
                    djsdVar2 = djsd.f;
                }
                aklw.b(djsdVar2, 1);
                aklw.b(dpwrVar, 2);
                aklw.b(dbsgVar, 4);
                Activity activity = (Activity) ((dxjd) a10.a).a;
                aklw.b(activity, 5);
                akkz a11 = a10.b.a();
                aklw.b(a11, 6);
                aklj a12 = a10.c.a();
                aklw.b(a12, 7);
                eiq a13 = a10.d.a();
                aklw.b(a13, 8);
                dxio a14 = ((dxjh) a10.e).a();
                aklw.b(a14, 9);
                fT = cqgr.fT(akkuVar, new aklv(djsdVar2, dpwrVar, e, dbsgVar, activity, a11, a12, a13, a14));
            }
            if (fT != null) {
                F.g(fT);
            }
            dhxwVar2 = dhxwVar;
        }
        return F.f();
    }

    @Override // defpackage.akla
    @dzsi
    public final akle c(dhxw dhxwVar) {
        List<cqix<? extends aklb>> a = a(dhxwVar);
        if (!a.isEmpty()) {
            return new aklr(a);
        }
        return null;
    }

    @Override // defpackage.akla
    public final List<cqix<? extends aklb>> d(dhxw dhxwVar) {
        return b(dhxwVar, dbpy.a, absg.UNKNOWN_EXPLORE_SURFACE);
    }
}
