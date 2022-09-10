package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bijm  reason: default package */
/* loaded from: classes3.dex */
public class bijm extends bijk implements biix {
    private final dnfu g;

    public bijm(dnfu dnfuVar, bijz bijzVar, gga ggaVar, cjqy cjqyVar, cjqq cjqqVar, buzn buznVar, dxio<axwy> dxioVar, @dzsi axxe axxeVar) {
        super(bijzVar, ggaVar, cjqyVar, cjqqVar, buznVar, dxioVar, axxeVar);
        this.g = dnfuVar;
    }

    @dzsi
    private final String i() {
        dnfu dnfuVar = this.g;
        if ((dnfuVar.a & 128) != 0) {
            return dnfuVar.f;
        }
        return null;
    }

    @Override // defpackage.biix
    @dzsi
    public String a() {
        dnfu dnfuVar = this.g;
        if ((dnfuVar.a & 16) != 0) {
            return this.b.getString(R.string.PERSONAL_CAR_RENTAL_CONFIRMATION, new Object[]{dnfuVar.e});
        }
        return null;
    }

    @Override // defpackage.biix
    @dzsi
    public String b() {
        String str = null;
        if (i() == null) {
            return null;
        }
        dbrz j = dbrz.e(this.b.getString(R.string.PERSONAL_CAR_RENTAL_DETAILS_SEPARATOR)).j();
        String i = i();
        dnfu dnfuVar = this.g;
        if ((dnfuVar.a & 256) != 0) {
            str = this.b.getString(R.string.PERSONAL_CAR_RENTAL_RESERVED_MAKE, new Object[]{dnfuVar.g});
        }
        return j.i(i, str, new Object[0]);
    }

    @Override // defpackage.biix
    @dzsi
    public String c() {
        dnfu dnfuVar = this.g;
        if ((dnfuVar.a & 1) != 0) {
            dnfr dnfrVar = dnfuVar.b;
            if (dnfrVar == null) {
                dnfrVar = dnfr.c;
            }
            dnjl dnjlVar = dnfrVar.a;
            if (dnjlVar == null) {
                dnjlVar = dnjl.b;
            }
            return dnjlVar.a;
        }
        return null;
    }

    @Override // defpackage.biix
    @dzsi
    public String d() {
        dnfu dnfuVar = this.g;
        if ((dnfuVar.a & 1) != 0) {
            gga ggaVar = this.b;
            Object[] objArr = new Object[1];
            dnfr dnfrVar = dnfuVar.b;
            if (dnfrVar == null) {
                dnfrVar = dnfr.c;
            }
            objArr[0] = dnfrVar.b;
            return ggaVar.getString(R.string.PERSONAL_CAR_RENTAL_PICKUP_WHERE, objArr);
        }
        return null;
    }

    @Override // defpackage.biix
    public Boolean e() {
        boolean z = true;
        if (1 != (this.g.a & 1)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.biix
    @dzsi
    public String f() {
        dnfu dnfuVar = this.g;
        if ((dnfuVar.a & 2) != 0) {
            dnfr dnfrVar = dnfuVar.c;
            if (dnfrVar == null) {
                dnfrVar = dnfr.c;
            }
            dnjl dnjlVar = dnfrVar.a;
            if (dnjlVar == null) {
                dnjlVar = dnjl.b;
            }
            return dnjlVar.a;
        }
        return null;
    }

    @Override // defpackage.biix
    @dzsi
    public String g() {
        dnfu dnfuVar = this.g;
        if ((dnfuVar.a & 2) != 0) {
            gga ggaVar = this.b;
            Object[] objArr = new Object[1];
            dnfr dnfrVar = dnfuVar.c;
            if (dnfrVar == null) {
                dnfrVar = dnfr.c;
            }
            objArr[0] = dnfrVar.b;
            return ggaVar.getString(R.string.PERSONAL_CAR_RENTAL_DROP_OFF_WHERE, objArr);
        }
        return null;
    }

    @Override // defpackage.biix
    public Boolean h() {
        return Boolean.valueOf((this.g.a & 2) != 0);
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
