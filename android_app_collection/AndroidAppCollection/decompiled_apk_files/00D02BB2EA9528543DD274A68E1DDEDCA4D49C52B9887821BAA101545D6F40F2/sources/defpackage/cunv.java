package defpackage;

import android.content.Context;
import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: cunv  reason: default package */
/* loaded from: classes5.dex */
public final class cunv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static cuqd a(ctyy ctyyVar, Context context, dxro dxroVar, String str, ctxo ctxoVar) {
        dxrq dxrqVar;
        cuql a;
        dxry dxryVar;
        dccx dccxVar = new dccx();
        for (dxrw dxrwVar : dxroVar.a) {
            cuqp cuqpVar = cuqp.RICH_TEXT;
            cuqi cuqiVar = cuqi.STACK_COMPONENT;
            cupw cupwVar = cupw.STACK_CARD;
            int i = dxrwVar.c;
            int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
            if (i2 == 0) {
                i2 = 1;
            }
            int i3 = i2 - 2;
            if (i3 == 1) {
                if (dxrwVar.a == 101) {
                    dxrqVar = (dxrq) dxrwVar.b;
                } else {
                    dxrqVar = dxrq.b;
                }
                dccx dccxVar2 = new dccx();
                for (dxry dxryVar2 : dxrqVar.a) {
                    dccxVar2.g(b(ctyyVar, context, dxryVar2, str, ctxoVar));
                }
                cuqj b = cuqk.b();
                b.b(dccxVar2.f());
                a = cuoe.a(b.a());
            } else if (i3 == 2) {
                if (dxrwVar.a == 102) {
                    dxryVar = (dxry) dxrwVar.b;
                } else {
                    dxryVar = dxry.h;
                }
                a = cuoe.b(b(ctyyVar, context, dxryVar, str, ctxoVar));
            } else {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Got unknown UI component: ");
                sb.append(i);
                throw new ctui(sb.toString(), 222);
            }
            dccxVar.g(a);
        }
        cuqc b2 = cuqd.b();
        b2.b(dccxVar.f());
        return b2.a();
    }

    static cuqq b(ctyy ctyyVar, final Context context, dxry dxryVar, final String str, ctxo ctxoVar) {
        dxsm dxsmVar;
        dxru dxruVar;
        dxre dxreVar;
        dxrm dxrmVar;
        dxrc dxrcVar;
        dxra dxraVar;
        cuqm g = cuqq.g();
        g.e(dxryVar.d);
        g.f(dxryVar.e);
        g.d(dxryVar.f);
        g.c(dxryVar.g);
        cuqp cuqpVar = cuqp.RICH_TEXT;
        cuqi cuqiVar = cuqi.STACK_COMPONENT;
        cupw cupwVar = cupw.STACK_CARD;
        int b = dxpb.b(dxryVar.c);
        int i = 1;
        if (b == 0) {
            b = 1;
        }
        switch (b - 2) {
            case 1:
                if (dxryVar.a == 101) {
                    dxsmVar = (dxsm) dxryVar.b;
                } else {
                    dxsmVar = dxsm.b;
                }
                g.l(ctvj.a(ctyyVar, context, dxsmVar, str, ctxoVar));
                return g.a();
            case 2:
            default:
                int b2 = dxpb.b(dxryVar.c);
                if (b2 != 0) {
                    i = b2;
                }
                int a = dxpb.a(i);
                StringBuilder sb = new StringBuilder(35);
                sb.append("Got unknown UI element: ");
                sb.append(a);
                throw new ctui(sb.toString(), 223);
            case 3:
                if (dxryVar.a == 103) {
                    dxruVar = (dxru) dxryVar.b;
                } else {
                    dxruVar = dxru.d;
                }
                cuqg d = cuqh.d();
                d.c(dxruVar.a);
                dugy dugyVar = dxruVar.b;
                if (dugyVar == null) {
                    dugyVar = dugy.e;
                }
                d.b(ctuh.b(dugyVar));
                dugy dugyVar2 = dxruVar.c;
                if (dugyVar2 == null) {
                    dugyVar2 = dugy.e;
                }
                d.d(ctuh.b(dugyVar2));
                g.m(d.a());
                return g.a();
            case 4:
                if (dxryVar.a == 104) {
                    dxreVar = (dxre) dxryVar.b;
                } else {
                    dxreVar = dxre.e;
                }
                if (dxreVar.a == null) {
                    throw new ctui("Got invalid image proto.", 228);
                }
                cupt g2 = cupu.g();
                cukm c = cukn.c();
                dxpv dxpvVar = dxreVar.a;
                if (dxpvVar == null) {
                    dxpvVar = dxpv.f;
                }
                dxvy dxvyVar = dxpvVar.a;
                if (dxvyVar == null) {
                    dxvyVar = dxvy.d;
                }
                c.b(dxvyVar.a);
                dxpv dxpvVar2 = dxreVar.a;
                if (dxpvVar2 == null) {
                    dxpvVar2 = dxpv.f;
                }
                dxvy dxvyVar2 = dxpvVar2.a;
                if (dxvyVar2 == null) {
                    dxvyVar2 = dxvy.d;
                }
                dsqy dsqyVar = dxvyVar2.c;
                if (dsqyVar == null) {
                    dsqyVar = dsqy.b;
                }
                c.c(dsqyVar.a);
                g2.e(c.a());
                dxpv dxpvVar3 = dxreVar.a;
                if (dxpvVar3 == null) {
                    dxpvVar3 = dxpv.f;
                }
                g2.h(dxpvVar3.c.G());
                g2.g(dxreVar.b);
                g2.b(dxreVar.c);
                g2.c(dxreVar.d);
                g.j(g2.a());
                return g.a();
            case 5:
                if (dxryVar.a == 105) {
                    dxrmVar = (dxrm) dxryVar.b;
                } else {
                    dxrmVar = dxrm.d;
                }
                cupy d2 = cuqb.d();
                csvo.a(context);
                if (csvo.v(dxzy.a.a().p()) && dxrmVar.b == 2) {
                    d2.c(dxrmVar.c);
                }
                d2.d(dxrmVar.b);
                d2.b(cstr.c(dxrmVar.a, new dbrn(context, str) { // from class: cunq
                    private final Context a;
                    private final String b;

                    {
                        this.a = context;
                        this.b = str;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        Context context2 = this.a;
                        String str2 = this.b;
                        dxrk dxrkVar = (dxrk) obj;
                        cupz i2 = cuqa.i();
                        dxna dxnaVar = dxrkVar.g;
                        if (dxnaVar == null) {
                            dxnaVar = dxna.f;
                        }
                        if (dxnaVar.Qv()) {
                            dxna dxnaVar2 = dxrkVar.g;
                            if (dxnaVar2 == null) {
                                dxnaVar2 = dxna.f;
                            }
                            i2.f(ctur.a(dxnaVar2));
                        }
                        dxmm dxmmVar = dxrkVar.b;
                        if (dxmmVar == null) {
                            dxmmVar = dxmm.j;
                        }
                        dbsg<ctzl> a2 = ctug.a(context2, dxmmVar, dbsg.i(str2), dbsg.i(str2));
                        if (!a2.a()) {
                            return dbpy.a;
                        }
                        i2.g(dxrkVar.a);
                        i2.b(a2.b());
                        dugy dugyVar3 = dxrkVar.c;
                        if (dugyVar3 == null) {
                            dugyVar3 = dugy.e;
                        }
                        i2.h(ctuh.b(dugyVar3));
                        dugy dugyVar4 = dxrkVar.d;
                        if (dugyVar4 == null) {
                            dugyVar4 = dugy.e;
                        }
                        i2.c(ctuh.b(dugyVar4));
                        dugy dugyVar5 = dxrkVar.e;
                        if (dugyVar5 == null) {
                            dugyVar5 = dugy.e;
                        }
                        i2.d(ctuh.b(dugyVar5));
                        i2.e(dxrkVar.f);
                        return dbsg.i(i2.a());
                    }
                }));
                g.k(d2.a());
                return g.a();
            case 6:
                if (dxryVar.a == 106) {
                    dxrcVar = (dxrc) dxryVar.b;
                } else {
                    dxrcVar = dxrc.c;
                }
                cupr c2 = cups.c();
                dugy dugyVar3 = dxrcVar.a;
                if (dugyVar3 == null) {
                    dugyVar3 = dugy.e;
                }
                c2.b(ctuh.b(dugyVar3));
                c2.c(dxrcVar.b);
                g.i(c2.a());
                return g.a();
            case 7:
                if (dxryVar.a == 107) {
                    dxraVar = (dxra) dxryVar.b;
                } else {
                    dxraVar = dxra.b;
                }
                cupn b3 = cupq.b();
                b3.b(cstr.a(dxraVar.a, new dbrn(context, str) { // from class: cunr
                    private final Context a;
                    private final String b;

                    {
                        this.a = context;
                        this.b = str;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        Context context2 = this.a;
                        String str2 = this.b;
                        dxsa dxsaVar = (dxsa) obj;
                        cupo e = cupp.e();
                        e.d(dxsaVar.b.G());
                        e.c(dxsaVar.a);
                        dxmm dxmmVar = dxsaVar.c;
                        if (dxmmVar == null) {
                            dxmmVar = dxmm.j;
                        }
                        e.b(ctug.a(context2, dxmmVar, dbsg.i(str2), dbsg.i(str2)).b());
                        dxna dxnaVar = dxsaVar.d;
                        if (dxnaVar == null) {
                            dxnaVar = dxna.f;
                        }
                        e.e(ctur.a(dxnaVar));
                        return e.a();
                    }
                }));
                g.h(b3.a());
                return g.a();
            case 8:
                g.g();
                return g.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dxry c(cuqq cuqqVar) {
        dxrx bZ = dxry.h.bZ();
        int b = cuqqVar.b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((dxry) bZ.b).d = b;
        int c = cuqqVar.c();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((dxry) bZ.b).e = c;
        int d = cuqqVar.d();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((dxry) bZ.b).f = d;
        int e = cuqqVar.e();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((dxry) bZ.b).g = e;
        cuqp cuqpVar = cuqp.RICH_TEXT;
        cuqi cuqiVar = cuqi.STACK_COMPONENT;
        cupw cupwVar = cupw.STACK_CARD;
        int ordinal = cuqqVar.f().ordinal();
        if (ordinal == 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ((dxry) bZ.b).c = dxpb.a(3);
            dxsm b2 = ctvj.b(cuqqVar.a().f());
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dxry dxryVar = (dxry) bZ.b;
            b2.getClass();
            dxryVar.b = b2;
            dxryVar.a = R.styleable.AppCompatTheme_switchStyle;
            return bZ.bK();
        } else if (ordinal == 7) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ((dxry) bZ.b).c = dxpb.a(10);
            return bZ.bK();
        } else if (ordinal == 2) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ((dxry) bZ.b).c = dxpb.a(5);
            cuqh g = cuqqVar.a().g();
            dxrt bZ2 = dxru.d.bZ();
            String a = g.a();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            a.getClass();
            ((dxru) bZ2.b).a = a;
            dugy a2 = ctuh.a(g.b());
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            a2.getClass();
            ((dxru) bZ2.b).b = a2;
            dugy a3 = ctuh.a(g.c());
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            a3.getClass();
            ((dxru) bZ2.b).c = a3;
            dxru bK = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dxry dxryVar2 = (dxry) bZ.b;
            bK.getClass();
            dxryVar2.b = bK;
            dxryVar2.a = R.styleable.AppCompatTheme_textAppearanceListItem;
            return bZ.bK();
        } else if (ordinal == 3) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ((dxry) bZ.b).c = dxpb.a(7);
            cuqb e2 = cuqqVar.a().e();
            dxrl bZ3 = dxrm.d.bZ();
            int b3 = e2.b();
            if (b3 == 1) {
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                ((dxrm) bZ3.b).b = dxoy.a(3);
            } else if (b3 == 2) {
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                ((dxrm) bZ3.b).b = dxoy.a(4);
            } else {
                int b4 = e2.b();
                StringBuilder sb = new StringBuilder(53);
                sb.append("Got unknown buttons orientation integer: ");
                sb.append(b4);
                sb.append(".");
                throw new IllegalArgumentException(sb.toString());
            }
            dcdc a4 = cstr.a(e2.a(), cuns.a);
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dxrm dxrmVar = (dxrm) bZ3.b;
            dsrj<dxrk> dsrjVar = dxrmVar.a;
            if (!dsrjVar.a()) {
                dxrmVar.a = dsqw.cl(dsrjVar);
            }
            dsod.bv(a4, dxrmVar.a);
            dxrm bK2 = bZ3.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dxry dxryVar3 = (dxry) bZ.b;
            bK2.getClass();
            dxryVar3.b = bK2;
            dxryVar3.a = 105;
            return bZ.bK();
        } else if (ordinal == 4) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ((dxry) bZ.b).c = dxpb.a(8);
            cups c2 = cuqqVar.a().c();
            dxrb bZ4 = dxrc.c.bZ();
            dugy a5 = ctuh.a(c2.a());
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            a5.getClass();
            ((dxrc) bZ4.b).a = a5;
            float b5 = c2.b();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            ((dxrc) bZ4.b).b = b5;
            dxrc bK3 = bZ4.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dxry dxryVar4 = (dxry) bZ.b;
            bK3.getClass();
            dxryVar4.b = bK3;
            dxryVar4.a = R.styleable.AppCompatTheme_textAppearancePopupMenuHeader;
            return bZ.bK();
        } else if (ordinal == 5) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ((dxry) bZ.b).c = dxpb.a(9);
            cupq b6 = cuqqVar.a().b();
            dxqz bZ5 = dxra.b.bZ();
            dcdc a6 = cstr.a(b6.a(), cunu.a);
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dxra dxraVar = (dxra) bZ5.b;
            dsrj<dxsa> dsrjVar2 = dxraVar.a;
            if (!dsrjVar2.a()) {
                dxraVar.a = dsqw.cl(dsrjVar2);
            }
            dsod.bv(a6, dxraVar.a);
            dxra bK4 = bZ5.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dxry dxryVar5 = (dxry) bZ.b;
            bK4.getClass();
            dxryVar5.b = bK4;
            dxryVar5.a = R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle;
            return bZ.bK();
        } else {
            String valueOf = String.valueOf(cuqqVar.f());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb2.append("Got unknown ui element model type: ");
            sb2.append(valueOf);
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
