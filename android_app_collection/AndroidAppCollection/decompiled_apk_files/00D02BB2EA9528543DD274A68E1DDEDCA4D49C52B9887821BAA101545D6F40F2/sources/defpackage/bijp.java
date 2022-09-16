package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bijp  reason: default package */
/* loaded from: classes3.dex */
public class bijp extends bijk implements bija {
    private final dnnz g;

    public bijp(dnnz dnnzVar, bijz bijzVar, gga ggaVar, cjqy cjqyVar, cjqq cjqqVar, buzn buznVar, dxio<axwy> dxioVar, @dzsi axxe axxeVar) {
        super(bijzVar, ggaVar, cjqyVar, cjqqVar, buznVar, dxioVar, axxeVar);
        this.g = dnnzVar;
    }

    @Override // defpackage.bija
    public String a() {
        return this.b.getString(R.string.PERSONAL_HOTEL_CHECK_IN);
    }

    @Override // defpackage.bija
    public String b() {
        dnjl dnjlVar = this.g.a;
        if (dnjlVar == null) {
            dnjlVar = dnjl.b;
        }
        return dnjlVar.a;
    }

    @Override // defpackage.bija
    public String c() {
        return this.b.getString(R.string.PERSONAL_HOTEL_CHECK_OUT);
    }

    @Override // defpackage.bija
    public String d() {
        dnjl dnjlVar = this.g.b;
        if (dnjlVar == null) {
            dnjlVar = dnjl.b;
        }
        return dnjlVar.a;
    }

    @Override // defpackage.bijd
    public String q() {
        dnwd dnwdVar = this.g.f;
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
        dnpq dnpqVar = this.g.e;
        if (dnpqVar == null) {
            dnpqVar = dnpq.g;
        }
        return dnpqVar.c;
    }
}
