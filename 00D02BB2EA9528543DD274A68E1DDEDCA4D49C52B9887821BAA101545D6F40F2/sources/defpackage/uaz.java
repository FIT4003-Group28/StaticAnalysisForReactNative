package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: uaz  reason: default package */
/* loaded from: classes7.dex */
public class uaz implements uah {
    private final afha a;
    private final tur b;
    private final twb c;
    private final twa d;
    private final twc e;
    private final doxr f;
    private final cjtd g;
    private final tlv h;
    private final amve i;
    private final String j;
    @dzsi
    private final String k;

    public uaz(Activity activity, afha afhaVar, tur turVar, tlv tlvVar, amve amveVar) {
        this.a = afhaVar;
        this.b = turVar;
        this.d = new twi(activity, amveVar);
        doxr doxrVar = amveVar.b().l;
        doxrVar = doxrVar == null ? doxr.k : doxrVar;
        this.f = doxrVar;
        this.j = String.format("%s — %s", doxrVar.b, doxrVar.c);
        this.k = f(activity, doxrVar);
        this.c = new uax(activity, doxrVar);
        this.e = new uay(activity, doxrVar);
        this.g = vyb.u(amveVar, dtxn.dS);
        this.h = tlvVar;
        this.i = amveVar;
    }

    @dzsi
    private static String f(Activity activity, doxr doxrVar) {
        if ((doxrVar.a & 128) != 0) {
            String string = activity.getResources().getString(pxo.FLIGHT_DIRECTIONS_ROUND_TRIP_PRICE_LABEL);
            if ((doxrVar.a & 4) == 0) {
                return string;
            }
            Object[] objArr = new Object[2];
            objArr[0] = string;
            doun dounVar = doxrVar.d;
            if (dounVar == null) {
                dounVar = doun.b;
            }
            objArr[1] = dounVar.a;
            return String.format("%s, %s", objArr);
        }
        return null;
    }

    @Override // defpackage.uah
    public twa a() {
        return this.d;
    }

    @Override // defpackage.uah
    public twb b() {
        return this.c;
    }

    @Override // defpackage.uah
    public twc c() {
        return this.e;
    }

    @Override // defpackage.uah
    public String d() {
        return this.j;
    }

    @Override // defpackage.uah
    @dzsi
    public String e() {
        return this.k;
    }

    @Override // defpackage.ual
    public Boolean k() {
        return Boolean.valueOf(e() != null);
    }

    @Override // defpackage.ual
    public Boolean l() {
        return true;
    }

    @Override // defpackage.ual
    public Boolean m() {
        return uak.b();
    }

    @Override // defpackage.ual
    public cjtd o() {
        return this.b.c(this.g, this.h, this.i);
    }

    @Override // defpackage.ual
    public cqkl n() {
        String str;
        doxr doxrVar = this.f;
        int i = doxrVar.a;
        if ((i & 8) != 0) {
            dnpq dnpqVar = doxrVar.e;
            if (dnpqVar == null) {
                dnpqVar = dnpq.g;
            }
            str = dnpqVar.c;
        } else if ((i & 4096) != 0) {
            dnpq dnpqVar2 = doxrVar.j;
            if (dnpqVar2 == null) {
                dnpqVar2 = dnpq.g;
            }
            str = dnpqVar2.c;
        } else {
            str = null;
        }
        if (!dbsj.d(str)) {
            this.a.r(str, 4);
        }
        return cqkl.a;
    }
}
