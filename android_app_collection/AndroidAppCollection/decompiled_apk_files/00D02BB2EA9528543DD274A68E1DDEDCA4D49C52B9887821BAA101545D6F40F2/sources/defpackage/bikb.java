package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bikb  reason: default package */
/* loaded from: classes3.dex */
public class bikb extends bijk implements bijf {
    private final doqp g;

    public bikb(doqp doqpVar, bijz bijzVar, gga ggaVar, cjqy cjqyVar, cjqq cjqqVar, buzn buznVar, dxio<axwy> dxioVar, @dzsi axxe axxeVar) {
        super(bijzVar, ggaVar, cjqyVar, cjqqVar, buznVar, dxioVar, axxeVar);
        this.g = doqpVar;
    }

    @Override // defpackage.bijf
    @dzsi
    public String a() {
        doqp doqpVar = this.g;
        if ((doqpVar.a & 16) != 0) {
            return this.b.getString(R.string.PERSONAL_TRANSPORTATION_ROUTE_CONFIRMATION, new Object[]{doqpVar.f});
        }
        return null;
    }

    @Override // defpackage.bijf
    @dzsi
    public String b() {
        if (!c().booleanValue()) {
            return null;
        }
        gga ggaVar = this.b;
        Object[] objArr = new Object[1];
        doqk doqkVar = this.g.b;
        if (doqkVar == null) {
            doqkVar = doqk.d;
        }
        objArr[0] = doqkVar.b;
        return ggaVar.getString(R.string.PERSONAL_TRANSPORTATION_ROUTE_DEPARTURE_WHERE, objArr);
    }

    @Override // defpackage.bijf
    public Boolean c() {
        boolean z = true;
        if (1 != (this.g.a & 1)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bijf
    @dzsi
    public String d() {
        if (!e().booleanValue()) {
            return null;
        }
        gga ggaVar = this.b;
        Object[] objArr = new Object[1];
        doqk doqkVar = this.g.c;
        if (doqkVar == null) {
            doqkVar = doqk.d;
        }
        objArr[0] = doqkVar.b;
        return ggaVar.getString(R.string.PERSONAL_TRANSPORTATION_ROUTE_ARRIVAL_WHERE, objArr);
    }

    @Override // defpackage.bijf
    public Boolean e() {
        return Boolean.valueOf((this.g.a & 2) != 0);
    }

    @Override // defpackage.bijf
    @dzsi
    public String f() {
        doqk doqkVar = this.g.b;
        if (doqkVar == null) {
            doqkVar = doqk.d;
        }
        dnjl dnjlVar = doqkVar.a;
        if (dnjlVar == null) {
            dnjlVar = dnjl.b;
        }
        return dnjlVar.a;
    }

    @Override // defpackage.bijf
    @dzsi
    public String g() {
        doqk doqkVar = this.g.c;
        if (doqkVar == null) {
            doqkVar = doqk.d;
        }
        dnjl dnjlVar = doqkVar.a;
        if (dnjlVar == null) {
            dnjlVar = dnjl.b;
        }
        return dnjlVar.a;
    }

    @Override // defpackage.bijf
    @dzsi
    public String h() {
        if (!c().booleanValue()) {
            return null;
        }
        doqk doqkVar = this.g.b;
        if (doqkVar == null) {
            doqkVar = doqk.d;
        }
        String str = doqkVar.c;
        if (!dbsj.d(str)) {
            return this.b.getString(R.string.PERSONAL_TRANSPORTATION_ROUTE_PLATFORM, new Object[]{str});
        }
        return null;
    }

    @Override // defpackage.bijf
    @dzsi
    public String i() {
        if (!e().booleanValue()) {
            return null;
        }
        doqk doqkVar = this.g.c;
        if (doqkVar == null) {
            doqkVar = doqk.d;
        }
        String str = doqkVar.c;
        if (!dbsj.d(str)) {
            return this.b.getString(R.string.PERSONAL_TRANSPORTATION_ROUTE_PLATFORM, new Object[]{str});
        }
        return null;
    }

    @Override // defpackage.bijd
    public String q() {
        dnwd dnwdVar = this.g.h;
        if (dnwdVar == null) {
            dnwdVar = dnwd.b;
        }
        return dnwdVar.a;
    }

    @Override // defpackage.bijf
    @dzsi
    public cqtd s() {
        int i;
        int a = doqo.a(this.g.e);
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 == 1) {
            i = 2131231764;
        } else if (i2 == 2) {
            i = 2131231737;
        } else if (i2 != 3) {
            return null;
        } else {
            i = 2131231676;
        }
        return cqrt.g(i, cqrt.c(R.color.qu_daynight_grey_700));
    }

    @Override // defpackage.bijf
    @dzsi
    public String t() {
        int a = doqo.a(this.g.e);
        if (a == 0) {
            a = 1;
        }
        if (a == 2) {
            return this.b.getString(R.string.PERSONAL_TRANSPORTATION_ROUTE_MODE_TRAIN);
        }
        if (a == 3) {
            return this.b.getString(R.string.PERSONAL_TRANSPORTATION_ROUTE_MODE_BUS);
        }
        if (a != 4) {
            return null;
        }
        return this.b.getString(R.string.PERSONAL_TRANSPORTATION_ROUTE_MODE_TAXI);
    }

    @Override // defpackage.bijk
    @dzsi
    public final String u() {
        return t();
    }

    @Override // defpackage.bijk
    @dzsi
    public final String v() {
        dnpq dnpqVar = this.g.g;
        if (dnpqVar == null) {
            dnpqVar = dnpq.g;
        }
        return dnpqVar.c;
    }
}
