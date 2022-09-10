package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
import java.util.Locale;
import java.util.Objects;
/* compiled from: PG */
/* renamed from: mfk  reason: default package */
/* loaded from: classes7.dex */
public class mfk implements mfd {
    public final mey a;
    private final Context b;
    private final jzp c;
    private final cqat d;
    private final mog e;
    private final mny f;
    private final ncf g;
    private final ldm h;
    private final aryr i;
    private final int j;
    private final String k;
    private final Boolean l;
    @dzsi
    private final akqi m;
    private final int n;
    private final Runnable o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private final boolean s;
    @dzsi
    private final kok t;
    private final boolean u;
    @dzsi
    private cjql v;

    /* JADX WARN: Removed duplicated region for block: B:44:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public mfk(android.content.Context r27, defpackage.jzp r28, defpackage.cqat r29, defpackage.ksr r30, defpackage.mog r31, defpackage.ldm r32, defpackage.dcdc<defpackage.ldm> r33, defpackage.aryr r34, final int r35, @defpackage.dzsi defpackage.akqi r36, int r37, defpackage.mey r38, boolean r39, java.lang.Runnable r40, boolean r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mfk.<init>(android.content.Context, jzp, cqat, ksr, mog, ldm, dcdc, aryr, int, akqi, int, mey, boolean, java.lang.Runnable, boolean, boolean):void");
    }

    private final boolean H() {
        return cqsz.d().a(this.b) >= cqrp.d(445.0d).a(this.b);
    }

    private final Boolean I() {
        dvxz j = this.i.j();
        boolean z = true;
        boolean z2 = H() && this.s;
        boolean z3 = !H() && !this.s;
        if (!this.q || this.r || ((!z2 && !z3) || j == null || (j.a & 1) == 0)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    private final boolean J() {
        ilo iloVar = this.h.d;
        return iloVar != null && !dbsj.d(iloVar.ab()) && !bfdq.a(iloVar.ac(), this.d);
    }

    private final Boolean K() {
        Boolean bool;
        boolean z = true;
        if (!E().booleanValue()) {
            ilo iloVar = this.h.d;
            if (iloVar != null) {
                bool = Boolean.valueOf(iloVar.as() != null && iloVar.as().contains("electric_vehicle_charging_station"));
            } else {
                bool = false;
            }
            if (!bool.booleanValue()) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.mfd
    public Boolean A() {
        boolean z = false;
        if (!TextUtils.isEmpty(y()) && (w().booleanValue() || p().booleanValue() || m().booleanValue())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.mfd
    public Boolean B() {
        boolean z = true;
        if (!n().booleanValue() || (!r().booleanValue() && !p().booleanValue())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.mfd
    public void C(cjqp cjqpVar) {
        this.v = cjqpVar.d(g());
    }

    @Override // defpackage.mfd
    @dzsi
    public cjql D() {
        return this.v;
    }

    @Override // defpackage.mfd
    public Boolean E() {
        ilo iloVar = this.h.d;
        boolean z = false;
        if (iloVar != null) {
            if (iloVar.ad() != null) {
                dnjf ad = iloVar.ad();
                dbsk.s(ad);
                int a = dnje.a(ad.a);
                if (a != 0 && a == 2) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
        return false;
    }

    @dzsi
    public Float F() {
        ilo iloVar = this.h.d;
        if (iloVar == null) {
            return null;
        }
        float af = iloVar.af();
        if (!Float.isNaN(af)) {
            return Float.valueOf(af);
        }
        return null;
    }

    public CharSequence G() {
        if (this.g.a() == 0) {
            return "";
        }
        mog mogVar = this.e;
        ncf ncfVar = this.g;
        return mogVar.a(ncfVar.b(ncfVar.c));
    }

    @Override // defpackage.mfd
    public ncf a() {
        return this.g;
    }

    @Override // defpackage.mfd
    public aryr b() {
        return this.i;
    }

    @Override // defpackage.mfd
    public ldm c() {
        return this.h;
    }

    @Override // defpackage.mfd
    @dzsi
    public kof d() {
        return this.t;
    }

    @Override // defpackage.mfd
    public cqkl e() {
        this.o.run();
        return cqkl.a;
    }

    @Override // defpackage.mfd
    public Boolean f() {
        return Boolean.valueOf(this.c.h());
    }

    @Override // defpackage.mfd
    public cjtd g() {
        ilo iloVar = this.h.d;
        cjta c = cjtd.c(iloVar != null ? iloVar.bY() : null);
        c.i(this.j);
        if (akqi.d(this.m) && Objects.equals(this.m, this.h.h.d)) {
            ddmb bZ = ddmc.d.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddmc ddmcVar = (ddmc) bZ.b;
            ddmcVar.a |= 2;
            ddmcVar.c = true;
            c.h(bZ.bK());
        }
        return c.a();
    }

    @Override // defpackage.mfd
    public Boolean h() {
        return Boolean.valueOf(this.j == this.n + (-1));
    }

    @Override // defpackage.mfd
    @dzsi
    public CharSequence i() {
        return this.h.b;
    }

    @Override // defpackage.mfd
    public Boolean j() {
        dvxz j = this.i.j();
        boolean z = false;
        if (this.p && !this.r && ((H() || !this.s) && !I().booleanValue() && j != null && (j.a & 4) != 0)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.mfd
    public Boolean k() {
        dvxz j = this.i.j();
        boolean z = true;
        if (!this.q || this.r || !H() || this.s || j == null || (j.a & 1) == 0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.mfd
    @dzsi
    public CharSequence l() {
        dvxz j = this.i.j();
        if (!I().booleanValue() || j == null) {
            return null;
        }
        String str = true != j.b.isEmpty() ? ", " : "";
        String str2 = j.b;
        String str3 = j.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + str.length() + String.valueOf(str3).length());
        sb.append(str2);
        sb.append(str);
        sb.append(str3);
        return sb.toString();
    }

    @Override // defpackage.mfd
    public Boolean m() {
        boolean z = false;
        if (F() != null && !w().booleanValue() && !K().booleanValue() && !p().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.mfd
    public Boolean n() {
        boolean z = false;
        if (F() != null && !w().booleanValue() && !K().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.mfd
    @dzsi
    public String o() {
        Float F = F();
        if (F != null) {
            return String.format(Locale.getDefault(), "%.1f", F);
        }
        return null;
    }

    @Override // defpackage.mfd
    public Boolean p() {
        boolean z = false;
        if (J() && !w().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.mfd
    @dzsi
    public String q() {
        ilo iloVar = this.h.d;
        return (iloVar != null && J()) ? iloVar.ab() : "";
    }

    @Override // defpackage.mfd
    public Boolean r() {
        boolean z = false;
        if (!dbsj.d(s()) && !p().booleanValue() && !w().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.mfd
    @dzsi
    public String s() {
        ilo iloVar = this.h.d;
        if (iloVar == null) {
            return null;
        }
        return iloVar.Z();
    }

    @Override // defpackage.mfd
    public CharSequence t() {
        return String.format(Locale.getDefault(), "%d", Integer.valueOf(this.j + 1));
    }

    @Override // defpackage.mfd
    public cqtd u() {
        if (this.i.o == aryq.GENERIC) {
            return nqu.az(this.j + 1);
        }
        return nqu.aA(this.j + 1, false);
    }

    @Override // defpackage.mfd
    public aryq v() {
        return this.i.o;
    }

    @Override // defpackage.mfd
    public Boolean w() {
        return Boolean.valueOf(!TextUtils.isEmpty(x()));
    }

    @Override // defpackage.mfd
    public CharSequence x() {
        ilo iloVar = this.h.d;
        if (iloVar == null || iloVar.al() == null) {
            return "";
        }
        mny mnyVar = this.f;
        byed b = iloVar.al().b(mnyVar.b);
        if (b == null) {
            return "";
        }
        byeb byebVar = byeb.PERMANENTLY_CLOSED;
        int ordinal = b.a().ordinal();
        if (ordinal != 0 && ordinal != 1) {
            switch (ordinal) {
                case 4:
                case 5:
                    return mnyVar.a.getString(R.string.CAR_SEARCH_PLACE_CLOSING);
                case 6:
                case 7:
                case 8:
                case 9:
                    break;
                default:
                    return "";
            }
        }
        return mnyVar.a.getString(R.string.CAR_SEARCH_PLACE_CLOSED);
    }

    @Override // defpackage.mfd
    public CharSequence y() {
        return this.u ? this.k : G();
    }

    @Override // defpackage.mfd
    public Boolean z() {
        return this.l;
    }
}
