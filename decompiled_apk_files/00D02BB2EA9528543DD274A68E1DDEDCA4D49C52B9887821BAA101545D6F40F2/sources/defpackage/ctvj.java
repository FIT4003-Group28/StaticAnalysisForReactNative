package defpackage;

import android.content.Context;
import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: ctvj  reason: default package */
/* loaded from: classes5.dex */
public final class ctvj {
    public static cuhv a(final ctyy ctyyVar, final Context context, dxsm dxsmVar, final String str, final ctxo ctxoVar) {
        cuhe c = cuhv.c();
        c.b(cstr.a(dxsmVar.a, new dbrn(ctyyVar, context, str, ctxoVar) { // from class: ctux
            private final ctyy a;
            private final Context b;
            private final String c;
            private final ctxo d;

            {
                this.a = ctyyVar;
                this.b = context;
                this.c = str;
                this.d = ctxoVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                final ctyy ctyyVar2 = this.a;
                final Context context2 = this.b;
                final String str2 = this.c;
                final ctxo ctxoVar2 = this.d;
                dxse dxseVar = (dxse) obj;
                cuhf g = cuhg.g();
                g.e(dxseVar.a);
                g.f(dxseVar.e);
                dxsq dxsqVar = dxseVar.b;
                if (dxsqVar != null) {
                    cuhp a = cuhp.a(dxsqVar.a);
                    if (a.equals(cuhp.UNKNOWN)) {
                        ctxm r = ctxn.r();
                        r.g(24);
                        r.n(ctyyVar2.b().e());
                        r.o(ctyyVar2.c().J());
                        r.p(str2);
                        r.f(R.styleable.AppCompatTheme_tooltipForegroundColor);
                        ctxoVar2.b(r.a());
                    }
                    g.d(a);
                }
                if (dxseVar.c.size() != 0) {
                    g.c(cstr.a(dxseVar.c, new dbrn(ctyyVar2, str2, ctxoVar2) { // from class: ctvb
                        private final ctyy a;
                        private final String b;
                        private final ctxo c;

                        {
                            this.a = ctyyVar2;
                            this.b = str2;
                            this.c = ctxoVar2;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj2) {
                            dxsk dxskVar;
                            ctyy ctyyVar3 = this.a;
                            String str3 = this.b;
                            ctxo ctxoVar3 = this.c;
                            dxso dxsoVar = (dxso) obj2;
                            cuhs cuhsVar = cuhs.UNKNOWN;
                            cuhn cuhnVar = cuhn.UNKNOWN;
                            int i = dxsoVar.c;
                            int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
                            if (i2 == 0) {
                                i2 = 1;
                            }
                            int i3 = i2 - 2;
                            if (i3 == 1) {
                                if (dxsoVar.a == 2) {
                                    dxskVar = (dxsk) dxsoVar.b;
                                } else {
                                    dxskVar = dxsk.b;
                                }
                                return cube.a(dxskVar.a);
                            } else if (i3 == 2) {
                                return cuba.a;
                            } else {
                                ctxm r2 = ctxn.r();
                                r2.g(24);
                                r2.n(ctyyVar3.b().e());
                                r2.o(ctyyVar3.c().J());
                                r2.p(str3);
                                r2.f(R.styleable.AppCompatTheme_tooltipFrameBackground);
                                ctxoVar3.b(r2.a());
                                return cubc.a;
                            }
                        }
                    }));
                }
                if (dxseVar.d.size() != 0) {
                    g.b(cstr.a(dxseVar.d, new dbrn(ctyyVar2, context2, str2, ctxoVar2) { // from class: ctvc
                        private final ctyy a;
                        private final Context b;
                        private final String c;
                        private final ctxo d;

                        {
                            this.a = ctyyVar2;
                            this.b = context2;
                            this.c = str2;
                            this.d = ctxoVar2;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj2) {
                            final ctyy ctyyVar3 = this.a;
                            final String str3 = this.c;
                            final ctxo ctxoVar3 = this.d;
                            dxsg dxsgVar = (dxsg) obj2;
                            cuhh e = cuhi.e();
                            e.c(dxsgVar.a);
                            e.b(dxsgVar.b);
                            e.d(cstr.a(dxsgVar.c, new dbrn(ctyyVar3, str3, ctxoVar3) { // from class: ctvh
                                private final ctyy a;
                                private final String b;
                                private final ctxo c;

                                {
                                    this.a = ctyyVar3;
                                    this.b = str3;
                                    this.c = ctxoVar3;
                                }

                                @Override // defpackage.dbrn
                                public final Object a(Object obj3) {
                                    int i;
                                    dugy dugyVar;
                                    dugy dugyVar2;
                                    dxsu dxsuVar;
                                    dxsi dxsiVar;
                                    ctyy ctyyVar4 = this.a;
                                    String str4 = this.b;
                                    ctxo ctxoVar4 = this.c;
                                    dxss dxssVar = (dxss) obj3;
                                    cuhs cuhsVar = cuhs.UNKNOWN;
                                    cuhn cuhnVar = cuhn.UNKNOWN;
                                    int i2 = 3;
                                    int i3 = 0;
                                    switch (dxssVar.c) {
                                        case 0:
                                            i = 2;
                                            break;
                                        case 1:
                                            i = 3;
                                            break;
                                        case 2:
                                            i = 4;
                                            break;
                                        case 3:
                                            i = 5;
                                            break;
                                        case 4:
                                            i = 6;
                                            break;
                                        case 5:
                                            i = 7;
                                            break;
                                        case 6:
                                            i = 8;
                                            break;
                                        case 7:
                                            i = 9;
                                            break;
                                        case 8:
                                            i = 10;
                                            break;
                                        case 9:
                                            i = 11;
                                            break;
                                        case 10:
                                            i = 12;
                                            break;
                                        case 11:
                                            i = 13;
                                            break;
                                        case 12:
                                            i = 14;
                                            break;
                                        default:
                                            i = 0;
                                            break;
                                    }
                                    if (i == 0) {
                                        i = 1;
                                    }
                                    switch (i - 2) {
                                        case 1:
                                            return cuhq.p();
                                        case 2:
                                            return cuhq.q();
                                        case 3:
                                            return cuhq.r();
                                        case 4:
                                            return cuhq.s();
                                        case 5:
                                            return cuhq.t();
                                        case 6:
                                            return cuhq.u();
                                        case 7:
                                            if (dxssVar.a == 8) {
                                                dugyVar = (dugy) dxssVar.b;
                                            } else {
                                                dugyVar = dugy.e;
                                            }
                                            return cubt.a(ctuh.b(dugyVar));
                                        case 8:
                                            if (dxssVar.a == 9) {
                                                dugyVar2 = (dugy) dxssVar.b;
                                            } else {
                                                dugyVar2 = dugy.e;
                                            }
                                            return cubt.b(ctuh.b(dugyVar2));
                                        case 9:
                                            if (dxssVar.a == 10) {
                                                i3 = ((Integer) dxssVar.b).intValue();
                                            }
                                            return cubt.c(i3);
                                        case 10:
                                            if (dxssVar.a == 11) {
                                                dxsuVar = (dxsu) dxssVar.b;
                                            } else {
                                                dxsuVar = dxsu.b;
                                            }
                                            return cubt.d(cstr.a(dxsuVar.a, new dbrn(ctyyVar4, str4, ctxoVar4) { // from class: ctuy
                                                private final ctyy a;
                                                private final String b;
                                                private final ctxo c;

                                                {
                                                    this.a = ctyyVar4;
                                                    this.b = str4;
                                                    this.c = ctxoVar4;
                                                }

                                                @Override // defpackage.dbrn
                                                public final Object a(Object obj4) {
                                                    ctyy ctyyVar5 = this.a;
                                                    String str5 = this.b;
                                                    ctxo ctxoVar5 = this.c;
                                                    cuhu a2 = cuhu.a(((dxsw) obj4).a);
                                                    if (a2.equals(cuhu.UNKNOWN)) {
                                                        ctxm r2 = ctxn.r();
                                                        r2.g(24);
                                                        r2.n(ctyyVar5.b().e());
                                                        r2.o(ctyyVar5.c().J());
                                                        r2.p(str5);
                                                        r2.f(R.styleable.AppCompatTheme_toolbarStyle);
                                                        ctxoVar5.b(r2.a());
                                                    }
                                                    return a2;
                                                }
                                            }));
                                        case 11:
                                            if (dxssVar.a == 12) {
                                                int intValue = ((Integer) dxssVar.b).intValue();
                                                if (intValue == 0) {
                                                    i2 = 2;
                                                } else if (intValue != 1) {
                                                    i2 = intValue != 2 ? 0 : 4;
                                                }
                                                if (i2 == 0) {
                                                    i2 = 1;
                                                }
                                            } else {
                                                i2 = 2;
                                            }
                                            int i4 = i2 - 2;
                                            if (i4 == 1) {
                                                i3 = 1;
                                            } else if (i4 == 2) {
                                                i3 = 2;
                                            }
                                            return cubt.e(i3);
                                        case 12:
                                            if (dxssVar.a == 13) {
                                                dxsiVar = (dxsi) dxssVar.b;
                                            } else {
                                                dxsiVar = dxsi.b;
                                            }
                                            cuhj b = cuhk.b();
                                            b.b(dxsiVar.a);
                                            return cubt.f(b.a());
                                        default:
                                            ctxm r2 = ctxn.r();
                                            r2.g(24);
                                            r2.n(ctyyVar4.b().e());
                                            r2.o(ctyyVar4.c().J());
                                            r2.p(str4);
                                            r2.f(R.styleable.AppCompatTheme_viewInflaterClass);
                                            ctxoVar4.b(r2.a());
                                            return cuhq.o();
                                    }
                                }
                            }));
                            return e.a();
                        }
                    }));
                }
                return g.a();
            }
        }));
        return c.a();
    }

    public static dxsm b(cuhv cuhvVar) {
        dxsl bZ = dxsm.b.bZ();
        dcdc a = cstr.a(cuhvVar.a(), ctva.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxsm dxsmVar = (dxsm) bZ.b;
        dsrj<dxse> dsrjVar = dxsmVar.a;
        if (!dsrjVar.a()) {
            dxsmVar.a = dsqw.cl(dsrjVar);
        }
        dsod.bv(a, dxsmVar.a);
        return bZ.bK();
    }
}
