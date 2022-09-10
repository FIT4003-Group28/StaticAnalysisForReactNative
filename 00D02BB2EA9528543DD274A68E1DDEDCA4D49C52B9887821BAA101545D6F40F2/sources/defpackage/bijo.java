package defpackage;

import com.google.android.apps.maps.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bijo  reason: default package */
/* loaded from: classes3.dex */
public class bijo extends bijk implements biiz {
    private final dnjy g;

    public bijo(dnjy dnjyVar, bijz bijzVar, gga ggaVar, cjqy cjqyVar, cjqq cjqqVar, buzn buznVar, dxio<axwy> dxioVar, @dzsi axxe axxeVar) {
        super(bijzVar, ggaVar, cjqyVar, cjqqVar, buznVar, dxioVar, axxeVar);
        this.g = dnjyVar;
    }

    private final String s(dnjv dnjvVar) {
        int i = dnjvVar.a;
        String i2 = dbrz.e(this.b.getString(R.string.PERSONAL_FLIGHT_DETAILS_SEPARATOR)).j().i((i & 8) != 0 ? dnjvVar.e : null, (i & 16) != 0 ? this.b.getString(R.string.PERSONAL_FLIGHT_GATE, new Object[]{dnjvVar.f}) : null, new Object[0]);
        if (i2.isEmpty()) {
            return null;
        }
        return i2;
    }

    @dzsi
    private final String t() {
        return this.g.e;
    }

    @Override // defpackage.biiz
    @dzsi
    public String a() {
        return t();
    }

    @Override // defpackage.biiz
    public String b() {
        dnjv dnjvVar = this.g.b;
        if (dnjvVar == null) {
            dnjvVar = dnjv.g;
        }
        return this.b.getString(R.string.PERSONAL_FLIGHT_DEPARTURE_AIRPORT, new Object[]{dnjvVar.d, dnjvVar.c});
    }

    @Override // defpackage.biiz
    public String c() {
        dnjv dnjvVar = this.g.c;
        if (dnjvVar == null) {
            dnjvVar = dnjv.g;
        }
        return this.b.getString(R.string.PERSONAL_FLIGHT_ARRIVAL_AIRPORT, new Object[]{dnjvVar.d, dnjvVar.c});
    }

    @Override // defpackage.biiz
    public String d() {
        dnjv dnjvVar = this.g.b;
        if (dnjvVar == null) {
            dnjvVar = dnjv.g;
        }
        dnjl dnjlVar = dnjvVar.b;
        if (dnjlVar == null) {
            dnjlVar = dnjl.b;
        }
        return dnjlVar.a;
    }

    @Override // defpackage.biiz
    public String e() {
        dnjv dnjvVar = this.g.c;
        if (dnjvVar == null) {
            dnjvVar = dnjv.g;
        }
        dnjl dnjlVar = dnjvVar.b;
        if (dnjlVar == null) {
            dnjlVar = dnjl.b;
        }
        return dnjlVar.a;
    }

    @Override // defpackage.biiz
    @dzsi
    public String f() {
        dnjy dnjyVar = this.g;
        if ((dnjyVar.a & 32) != 0) {
            return this.b.getString(R.string.PERSONAL_FLIGHT_CONFIRMATION, new Object[]{dnjyVar.f});
        }
        return null;
    }

    @Override // defpackage.biiz
    @dzsi
    public String g() {
        dnjv dnjvVar = this.g.c;
        if (dnjvVar == null) {
            dnjvVar = dnjv.g;
        }
        return s(dnjvVar);
    }

    @Override // defpackage.biiz
    @dzsi
    public String h() {
        dnjv dnjvVar = this.g.b;
        if (dnjvVar == null) {
            dnjvVar = dnjv.g;
        }
        return s(dnjvVar);
    }

    @Override // defpackage.biiz
    public cqkl i() {
        dnpq dnpqVar = this.g.g;
        if (dnpqVar == null) {
            dnpqVar = dnpq.g;
        }
        String str = dnpqVar.c;
        if (str.isEmpty()) {
            str = cjxr.w(String.format(Locale.getDefault(), "http://www.google.com/search?q=%s", t()));
        }
        this.b.D(gfk.g(str, false));
        return cqkl.a;
    }

    @Override // defpackage.bijd
    public String q() {
        dnwd dnwdVar = this.g.i;
        if (dnwdVar == null) {
            dnwdVar = dnwd.b;
        }
        return dnwdVar.a;
    }

    @Override // defpackage.bijk
    @dzsi
    public final String u() {
        return a();
    }

    @Override // defpackage.bijk
    @dzsi
    public final String v() {
        dnpq dnpqVar = this.g.h;
        if (dnpqVar == null) {
            dnpqVar = dnpq.g;
        }
        return dnpqVar.c;
    }
}
