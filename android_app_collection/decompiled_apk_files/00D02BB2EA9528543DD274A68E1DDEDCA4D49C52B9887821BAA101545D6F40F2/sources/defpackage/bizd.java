package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bizd  reason: default package */
/* loaded from: classes3.dex */
public class bizd implements biyz, bega {
    @dzsi
    public cjtd a;
    @dzsi
    public Runnable b;
    public boolean c;
    public final cjqy d;
    public final dxio<boxa> e;
    public final Handler f = new Handler();
    @dzsi
    cjqv g;
    @dzsi
    private bwrs<ilo> h;
    private boolean i;
    private boolean j;
    private final Activity k;
    private final eeu l;
    private final dxio<aesb> m;
    private final btvo n;

    public bizd(Activity activity, cjqy cjqyVar, eeu eeuVar, dxio<aesb> dxioVar, dxio<boxa> dxioVar2, btvo btvoVar, bhat bhatVar) {
        this.k = activity;
        this.d = cjqyVar;
        this.l = eeuVar;
        this.m = dxioVar;
        this.e = dxioVar2;
        this.n = btvoVar;
    }

    @Override // defpackage.biyz
    public Boolean a() {
        return Boolean.valueOf(this.j);
    }

    @Override // defpackage.biyz
    public Boolean b() {
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.biyz
    @dzsi
    public cjtd c() {
        return this.a;
    }

    @Override // defpackage.biyz
    @dzsi
    public CharSequence d() {
        doav cx;
        ilo iloVar = (ilo) bwrs.b(this.h);
        if (iloVar == null || iloVar.cx() == null || (cx = iloVar.cx()) == null) {
            return null;
        }
        int a = doau.a(cx.b);
        if (a != 0 && a == 2) {
            return this.k.getString(R.string.YOUR_EDIT_IS_BEING_REVIEWED);
        }
        int a2 = doau.a(cx.b);
        if (a2 != 0 && a2 == 3) {
            return this.k.getString(R.string.YOUR_EDIT_IS_PUBLISHED);
        }
        int a3 = doau.a(cx.b);
        if (a3 != 0 && a3 == 4) {
            return this.k.getString(R.string.YOUR_EDIT_HAS_BEEN_REJECTED);
        }
        int a4 = doau.a(cx.b);
        if (a4 != 0 && a4 == 5) {
            return this.k.getString(R.string.YOUR_EDIT_IS_ACKNOWLEDGED);
        }
        return null;
    }

    @Override // defpackage.biyz
    @dzsi
    public CharSequence e() {
        return this.k.getString(R.string.PLACE_SUGGEST_EDIT_SECTION_TITLE);
    }

    @Override // defpackage.biyz
    @dzsi
    public CharSequence f() {
        ilo iloVar = (ilo) bwrs.b(this.h);
        if (iloVar == null || !iloVar.bf().r) {
            return this.k.getString(R.string.PLACE_SUGGEST_AN_EDIT);
        }
        return this.k.getString(R.string.PLACE_SUGGEST_AN_EDIT_MERCHANT_LABEL);
    }

    @Override // defpackage.biyz
    public cqkl g() {
        ilo iloVar;
        if (((efh) this.l).b && (iloVar = (ilo) bwrs.b(this.h)) != null) {
            this.m.a().D(iloVar, 8, dtxy.lK);
            dnps bZ = dnqe.i.bZ();
            dnqb dnqbVar = dnqb.PLACE_CARD;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqe dnqeVar = (dnqe) bZ.b;
            dnqeVar.b = dnqbVar.ah;
            dnqeVar.a |= 1;
            dnqe dnqeVar2 = (dnqe) bZ.b;
            dnqeVar2.c = 1;
            dnqeVar2.a |= 2;
            boxa a = this.e.a();
            bwrs<ilo> bwrsVar = this.h;
            dbsk.s(bwrsVar);
            a.B(bwrsVar, bZ.bK(), null);
            return cqkl.a;
        }
        return cqkl.a;
    }

    @Override // defpackage.biyz
    public cqss h() {
        int a;
        int a2;
        int a3;
        ilo iloVar = (ilo) bwrs.b(this.h);
        if (iloVar == null || iloVar.cx() == null) {
            return irg.H();
        }
        doav cx = iloVar.cx();
        if (cx != null && (a3 = doau.a(cx.b)) != 0 && a3 == 2) {
            return ibm.n();
        }
        if (cx == null || (((a = doau.a(cx.b)) == 0 || a != 3) && ((a2 = doau.a(cx.b)) == 0 || a2 != 5))) {
            return irg.H();
        }
        return irg.w();
    }

    @Override // defpackage.biyz
    public View.OnAttachStateChangeListener i() {
        return new bizc(this);
    }

    public boolean j() {
        return this.n.getUgcParameters().ab();
    }

    public final boolean k() {
        doav cx;
        int a;
        int a2;
        ilo iloVar = (ilo) bwrs.b(this.h);
        return (iloVar == null || (cx = iloVar.cx()) == null || (((a = doau.a(cx.b)) == 0 || a != 3) && ((a2 = doau.a(cx.b)) == 0 || a2 != 4)) || cx.d || this.c) ? false : true;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        this.h = bwrsVar;
        ilo c = bwrsVar.c();
        boolean z = true;
        if (j() && c != null) {
            c.H = true;
        }
        this.i = c != null && !c.i && (c.be() == iln.BUSINESS || c.be() == iln.STATION) && c.aY();
        if (c == null || c.bS().a()) {
            z = false;
        }
        this.j = z;
        cjta b = cjtd.b();
        b.d = dtxy.lL;
        if (c != null) {
            b.b = c.a().e;
        }
        this.a = b.a();
        if (k()) {
            this.b = new biza(this, bwrsVar);
        }
    }

    @Override // defpackage.bega
    public void u() {
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(this.i);
    }
}
