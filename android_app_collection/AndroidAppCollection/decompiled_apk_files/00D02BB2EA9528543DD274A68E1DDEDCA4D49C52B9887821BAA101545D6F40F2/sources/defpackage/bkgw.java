package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bkgw  reason: default package */
/* loaded from: classes3.dex */
public class bkgw extends bmya implements bkgv {
    @dzsi
    ilo a;
    private final dxio<apyz> i;

    public bkgw(Activity activity, cqhn cqhnVar, dxio<apyz> dxioVar, dxio<begg> dxioVar2, btvo btvoVar) {
        super(activity, dxioVar2);
        this.i = dxioVar;
    }

    @Override // defpackage.bmya
    protected final boolean a() {
        if (!this.g.c(jjn.COLLAPSED) || this.c) {
            return false;
        }
        this.c = true;
        if (b().booleanValue() && !this.d) {
            r();
        }
        return true;
    }

    @Override // defpackage.bmya, defpackage.bmxw
    public Boolean b() {
        super.b().booleanValue();
        return false;
    }

    @Override // defpackage.bmxw
    public String c() {
        return this.b.getString(R.string.BUSINESS_MESSAGING_QUOTES_TOAST_HEADER);
    }

    @Override // defpackage.bmxw
    public String d() {
        return this.b.getString(R.string.BUSINESS_MESSAGING_QUOTES_TOAST_BODY);
    }

    @Override // defpackage.bmxw
    public String e() {
        return this.b.getString(R.string.BUSINESS_MESSAGING_QUOTES_TOAST_MESSAGING_BUTTON);
    }

    @Override // defpackage.bmxw
    public cqkl f() {
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.bmxw
    public cjtd h() {
        return cjtd.a(dtxy.lE);
    }

    @Override // defpackage.bmxw
    public cjtd i() {
        return cjtd.a(dtxy.lF);
    }

    @Override // defpackage.bmxw
    public cqkl j() {
        cqkx.p(this);
        if (this.i.a().o()) {
            ilo iloVar = this.a;
            dbsk.s(iloVar);
            this.i.a().m(iloVar, apzb.PLACEPAGE_TOAST_QUOTE);
        }
        return cqkl.a;
    }

    @Override // defpackage.bmxw
    @dzsi
    public cqtd k() {
        return cqrt.f(2131232347);
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        this.a = bwrsVar.c();
    }

    @Override // defpackage.bega
    public void u() {
        this.a = null;
    }
}
