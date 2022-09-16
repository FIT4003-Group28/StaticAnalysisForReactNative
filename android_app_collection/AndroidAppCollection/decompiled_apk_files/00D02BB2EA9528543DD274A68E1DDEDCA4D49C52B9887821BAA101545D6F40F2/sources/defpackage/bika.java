package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bika  reason: default package */
/* loaded from: classes3.dex */
public class bika extends bijk implements biiy {
    private final dobz g;
    private final cjtd h;

    public bika(dobz dobzVar, bijz bijzVar, gga ggaVar, cjqy cjqyVar, cjqq cjqqVar, buzn buznVar, dxio<axwy> dxioVar, @dzsi axxe axxeVar) {
        super(bijzVar, ggaVar, cjqyVar, cjqqVar, buznVar, dxioVar, axxeVar);
        this.g = dobzVar;
        this.h = cjtd.a(dtxy.kW);
    }

    @Override // defpackage.biiy
    @dzsi
    public String a() {
        dnjl dnjlVar = this.g.a;
        if (dnjlVar == null) {
            dnjlVar = dnjl.b;
        }
        return dnjlVar.a;
    }

    @Override // defpackage.biiy
    @dzsi
    public String b() {
        int i = this.g.b;
        if (i <= 0) {
            return null;
        }
        return this.b.getString(R.string.PERSONAL_RESTAURANT_RESERVATION_SIZE, new Object[]{Integer.valueOf(i)});
    }

    @Override // defpackage.biiy
    public cjtd c() {
        return this.h;
    }

    @Override // defpackage.bijd
    public String q() {
        dnwd dnwdVar = this.g.d;
        if (dnwdVar == null) {
            dnwdVar = dnwd.b;
        }
        return dnwdVar.a;
    }

    @Override // defpackage.bijk
    @dzsi
    public final String u() {
        return b();
    }

    @Override // defpackage.bijk
    @dzsi
    public final String v() {
        dnpq dnpqVar = this.g.c;
        if (dnpqVar == null) {
            dnpqVar = dnpq.g;
        }
        return dnpqVar.c;
    }
}
