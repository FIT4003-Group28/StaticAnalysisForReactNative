package defpackage;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import com.google.android.apps.maps.R;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: atuj  reason: default package */
/* loaded from: classes2.dex */
public class atuj extends atsh<aryn> {
    private static final cqrp A = cqrp.d(18.0d);
    private final aufc B;

    public atuj(crqr<aryn> crqrVar, long j, dbsg<atcw> dbsgVar, btrm btrmVar, btvo btvoVar, cref crefVar, Context context, cqat cqatVar, cjqy cjqyVar, cjqq cjqqVar, dehq dehqVar, Executor executor, atsr atsrVar, vtn vtnVar, cqhn cqhnVar, boolean z, aufc aufcVar) {
        super(crqrVar, dbsgVar, btrmVar, btvoVar, crefVar, context, context.getResources(), cqatVar, cjqyVar, cjqqVar, dehqVar, executor, atsrVar, vtnVar, dtxw.cf, dtxw.cg, dtxw.bY, dtxw.bZ, dtxw.ca, dtxw.cb, z, true, j);
        Spannable spannable;
        this.B = aufcVar;
        this.p = crqrVar.a.d();
        cqtd cqtdVar = null;
        if (((aryr) crqrVar.a).g) {
            bvsx bvsxVar = new bvsx(context.getResources());
            float e = A.e(context);
            Spannable f = bvsxVar.f(itd.c().a(context), e, e);
            bvsu c = bvsxVar.c(R.string.NO_TRAFFIC_DATA_NAVIGATION);
            bvsv a = bvsxVar.a(f);
            a.g(" ");
            a.f(c);
            spannable = a.c();
        } else {
            spannable = null;
        }
        if (spannable != null) {
            B(spannable);
        }
        aryn arynVar = crqrVar.a;
        if ((arynVar instanceof aryr) && !crqrVar.k()) {
            aryr aryrVar = (aryr) arynVar;
            asth d = astj.d(aryrVar);
            asth asthVar = asth.GAS_PRICE;
            int i = R.color.nav_prompt_icon_bkgd_color_hotel;
            int i2 = 2131231656;
            if (d != asthVar) {
                if (d != asth.HOTEL_PRICE) {
                    Iterator<String> it = aryrVar.n.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = 2131231715;
                            i = R.color.nav_prompt_icon_bkgd_color_pin;
                            break;
                        }
                        String next = it.next();
                        if (!next.contains("restaurant")) {
                            if (!next.contains("bar")) {
                                if (!next.contains("coffee_shop")) {
                                    if (!next.contains("gas_station")) {
                                        if (!next.contains("grocery")) {
                                            if (!next.contains("shopping")) {
                                                if (next.contains("hotel")) {
                                                    break;
                                                } else if (!next.contains("parking")) {
                                                    if (!next.contains("post_office")) {
                                                        if (next.contains("pharmacy")) {
                                                            i2 = 2131231665;
                                                            i = R.color.nav_prompt_icon_bkgd_color_pharmacy;
                                                            break;
                                                        }
                                                    } else {
                                                        i2 = 2131231667;
                                                        i = R.color.nav_prompt_icon_bkgd_color_post_office;
                                                        break;
                                                    }
                                                } else {
                                                    i2 = R.drawable.ic_qu_local_parking;
                                                    i = R.color.nav_prompt_icon_bkgd_color_parking;
                                                    break;
                                                }
                                            } else {
                                                i2 = 2131231659;
                                                i = R.color.nav_prompt_icon_bkgd_color_mall;
                                                break;
                                            }
                                        } else {
                                            i2 = 2131231653;
                                            i = R.color.nav_prompt_icon_bkgd_color_grocery;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                } else {
                                    i2 = 2131231646;
                                    i = R.color.nav_prompt_icon_bkgd_color_cafe;
                                    break;
                                }
                            } else {
                                i2 = 2131231645;
                                i = R.color.nav_prompt_icon_bkgd_color_bar;
                                break;
                            }
                        } else {
                            i2 = 2131231669;
                            i = R.color.nav_prompt_icon_bkgd_color_restaurant;
                            break;
                        }
                    }
                }
                cqtdVar = iup.g(cqrt.g(i2, ibl.b()), 0.5f, cqrt.c(i));
            }
            i = R.color.nav_prompt_icon_bkgd_color_gas_station;
            i2 = 2131231652;
            cqtdVar = iup.g(cqrt.g(i2, ibl.b()), 0.5f, cqrt.c(i));
        }
        if (cqtdVar != null) {
            H(cqtdVar);
        }
    }

    @Override // defpackage.atss, defpackage.atxz
    @dzsi
    public CharSequence V() {
        crqr crqrVar = (crqr) this.e;
        T t = crqrVar.a;
        if (!(t instanceof aryr) || crqrVar.k()) {
            return null;
        }
        aryr aryrVar = (aryr) t;
        asth d = astj.d(aryrVar);
        bvsx bvsxVar = new bvsx(this.j);
        boolean b = this.B.b();
        asth asthVar = asth.OPENING_HOURS;
        int ordinal = d.ordinal();
        if (ordinal == 0) {
            String a = astj.a(aryrVar.h, this.j);
            dbsk.s(a);
            int i = true != b ? R.color.google_red600 : R.color.google_red300;
            bvsv a2 = bvsxVar.a(a);
            a2.m(i);
            return a2.c();
        } else if (ordinal == 1) {
            String b2 = astj.b(aryrVar.k, this.j);
            dbsk.s(b2);
            return b2;
        } else if (ordinal == 2) {
            String str = aryrVar.l;
            dbsk.a(!dbsj.d(str));
            return str;
        } else if (ordinal != 3) {
            return null;
        } else {
            Locale locale = Locale.getDefault();
            Float f = aryrVar.m;
            dbsk.s(f);
            String format = String.format(locale, "%.1f", f);
            List<asti> e = astj.e(aryrVar.m.floatValue(), false);
            dcdn m = dcdn.m(asti.FULL, new BitmapDrawable(asti.FULL.a(this.j, b)), asti.HALF, new BitmapDrawable(asti.HALF.a(this.j, b)), asti.EMPTY, new BitmapDrawable(asti.EMPTY.a(this.j, b)));
            bvsv a3 = bvsxVar.a(format);
            a3.m(R.color.qu_orange_800);
            a3.g(" ");
            for (asti astiVar : e) {
                a3.g(bvsxVar.e((Drawable) m.get(astiVar), 1.0f));
            }
            return a3.c();
        }
    }

    @Override // defpackage.atsh
    protected final void d() {
        cjta c = cjtd.c(((crqr) this.e).a.h());
        c.d = dtxw.ce;
        this.v = c.a();
    }

    @Override // defpackage.atsh
    protected final boolean e() {
        return false;
    }

    @Override // defpackage.atsh
    protected final amuh h(amub amubVar, amub amubVar2) {
        return amuh.e(1, amubVar, amubVar2);
    }
}
