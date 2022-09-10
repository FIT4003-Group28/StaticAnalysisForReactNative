package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bxts  reason: default package */
/* loaded from: classes4.dex */
public class bxts implements bxsz {
    private static final dcdn<drjr, Integer> k = dcdn.m(drjr.FLIGHT_RESERVATION, Integer.valueOf((int) R.string.RESERVATIONS_CARD_AIRPORT), drjr.HOTEL_RESERVATION, Integer.valueOf((int) R.string.RESERVATIONS_CARD_HOTEL), drjr.CAR_RENTAL_RESERVATION, Integer.valueOf((int) R.string.CAR_RENTAL_RESERVATION_ITEM_FALLBACK_DETAILS_TEXT));
    private static final dcdn<drkd, Integer> l = dcdn.n(drkd.TRAIN, Integer.valueOf((int) R.string.RESERVATIONS_CARD_TRAIN), drkd.BUS, Integer.valueOf((int) R.string.RESERVATIONS_CARD_BUS), drkd.TAXI, Integer.valueOf((int) R.string.RESERVATIONS_CARD_TAXI), drkd.FERRY, Integer.valueOf((int) R.string.RESERVATIONS_CARD_FERRY));
    private static final dcdn<drjr, ddho> m = dcdn.o(drjr.FLIGHT_RESERVATION, dtyb.cl, drjr.HOTEL_RESERVATION, dtyb.cq, drjr.CAR_RENTAL_RESERVATION, dtyb.cg, drjr.RESTAURANT_RESERVATION, dtyb.ct, drjr.SOCIAL_EVENT_RESERVATION, dtyb.cv);
    private static final dcdn<drkd, ddho> n = dcdn.n(drkd.TRAIN, dtyb.cx, drkd.BUS, dtyb.cf, drkd.TAXI, dtyb.cw, drkd.FERRY, dtyb.ck);
    private final gft a;
    private final dxio<qbt> b;
    private final Activity c;
    private final cqtd d;
    private final cqss e = bxnv.h(7);
    private final drdg f;
    private final String g;
    private final String h;
    private final cjtd i;
    private final int j;

    public bxts(gft gftVar, dxio<qbt> dxioVar, Activity activity, drjs drjsVar, int i) {
        drke drkeVar;
        drke drkeVar2;
        cjtd a;
        drjj drjjVar;
        String str;
        this.a = gftVar;
        this.b = dxioVar;
        this.c = activity;
        this.j = i;
        this.d = cqrt.g(batk.f(drjsVar), bxnv.i(7));
        drdg e = batk.e(drjsVar);
        this.f = e;
        dcdn<drjr, Integer> dcdnVar = k;
        drjr a2 = drjr.a(drjsVar.a);
        dcdn<drkd, Integer> dcdnVar2 = l;
        if (drjsVar.a == 5) {
            drkeVar = (drke) drjsVar.b;
        } else {
            drkeVar = drke.k;
        }
        drkd b = drkd.b(drkeVar.b);
        int intValue = dcdnVar.getOrDefault(a2, dcdnVar2.getOrDefault(b == null ? drkd.UNKNOWN_TRANSPORTATION_TYPE : b, 0)).intValue();
        if (intValue != 0) {
            this.g = activity.getString(intValue);
            if (drjsVar.a == 3) {
                drjjVar = (drjj) drjsVar.b;
            } else {
                drjjVar = drjj.c;
            }
            drjh drjhVar = drjjVar.a;
            drir drirVar = (drjhVar == null ? drjh.j : drjhVar).b;
            String str2 = (drirVar == null ? drir.d : drirVar).a;
            if (!str2.isEmpty()) {
                alp a3 = alp.a();
                String str3 = e.g;
                if (a3.d.a(str3, str3.length())) {
                    String str4 = e.g;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str4).length());
                    sb.append("\u200f");
                    sb.append(str2);
                    sb.append(" · ");
                    sb.append(str4);
                    this.h = sb.toString();
                } else {
                    String str5 = e.g;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(str5).length());
                    sb2.append(str2);
                    sb2.append(" · ");
                    sb2.append(str5);
                    str = sb2.toString();
                }
            } else {
                str = e.g;
            }
            this.h = str;
        } else {
            this.g = e.g;
            this.h = e.h;
        }
        dcdn<drjr, ddho> dcdnVar3 = m;
        drjr a4 = drjr.a(drjsVar.a);
        dcdn<drkd, ddho> dcdnVar4 = n;
        if (drjsVar.a == 5) {
            drkeVar2 = (drke) drjsVar.b;
        } else {
            drkeVar2 = drke.k;
        }
        drkd b2 = drkd.b(drkeVar2.b);
        ddho orDefault = dcdnVar3.getOrDefault(a4, dcdnVar4.get(b2 == null ? drkd.UNKNOWN_TRANSPORTATION_TYPE : b2));
        if (orDefault == null) {
            a = cjtd.b;
        } else {
            a = cjtd.a(orDefault);
        }
        this.i = a;
    }

    @Override // defpackage.bxsz
    public cqtd a() {
        return this.d;
    }

    @Override // defpackage.bxsz
    public cqss b() {
        return this.e;
    }

    @Override // defpackage.bxsz
    public cqss c() {
        return null;
    }

    @Override // defpackage.abiu
    public String d() {
        return e();
    }

    @Override // defpackage.bxsz
    public String e() {
        return this.g;
    }

    @Override // defpackage.bxsz
    @dzsi
    public String f() {
        return this.h;
    }

    @Override // defpackage.bxsz
    public Integer g() {
        return Integer.valueOf(this.j);
    }

    @Override // defpackage.abiu
    public cqkl h(cjqm cjqmVar) {
        if (this.a.bb()) {
            qbt a = this.b.a();
            qcw x = qcx.x();
            drdg drdgVar = this.f;
            amvg P = amvh.P();
            P.c = (akqi) dbsc.a(akqi.f(drdgVar.d), akqi.a);
            P.a = dpjs.ENTITY_TYPE_NICKNAME;
            P.j = drdgVar.g;
            dpum dpumVar = drdgVar.f;
            if (dpumVar == null) {
                dpumVar = dpum.d;
            }
            double d = dpumVar.b;
            dpum dpumVar2 = drdgVar.f;
            if (dpumVar2 == null) {
                dpumVar2 = dpum.d;
            }
            P.d = new akqq(d, dpumVar2.c);
            P.b = drdgVar.h;
            x.u(P.a());
            x.r(amvh.i(this.c));
            x.k(qbs.DEFAULT);
            a.m(x.a());
        }
        return cqkl.a;
    }

    @Override // defpackage.abiu
    public cjtd i() {
        return this.i;
    }

    @Override // defpackage.abql
    public View.OnAttachStateChangeListener j() {
        return null;
    }

    @Override // defpackage.abql
    public cqtd k() {
        return abqk.a();
    }

    @Override // defpackage.abiu
    public jic l() {
        return new jic((String) null, ckqc.FIFE, this.d, 0);
    }
}
