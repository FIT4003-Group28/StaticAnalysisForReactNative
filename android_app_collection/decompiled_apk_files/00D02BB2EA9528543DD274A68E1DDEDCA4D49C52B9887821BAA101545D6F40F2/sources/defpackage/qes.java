package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: qes  reason: default package */
/* loaded from: classes7.dex */
public final class qes extends fd implements qfd {
    public qff a;
    public bxer ad;
    public dxio<ahjq> ae;
    public cqhw af;
    public cqhu ag;
    public qfl ah;
    public ite ai;
    public cqhn aj;
    public dehq ak;
    private cqkj al;
    private cqkf<qez> am;
    private qey an;
    private qez ao;
    private bxeq ap;
    public qfk b;
    public bxny c;
    public btrm d;
    public cjqy e;
    public bvjj f;
    public cqat g;

    @Override // defpackage.fd
    public final void Qi(Context context) {
        dxix.a(this);
        super.Qi(context);
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        this.am = this.al.c(new qew(), null);
        qff qffVar = new qff(this.ap, this.an, J(), this, this.ag, this.aj);
        this.a = qffVar;
        qfl qflVar = this.ah;
        bxeq bxeqVar = this.ap;
        bxny bxnyVar = this.c;
        cqhn a = qflVar.a.a();
        qfl.a(a, 1);
        dxio a2 = ((dxjh) qflVar.b).a();
        qfl.a(a2, 2);
        qfl.a(bxeqVar, 3);
        qfl.a(bxnyVar, 4);
        qfl.a(qffVar, 5);
        this.b = new qfk(a, a2, bxeqVar, bxnyVar, qffVar);
        qer qerVar = new qer(this);
        this.ao = qerVar;
        this.am.e(qerVar);
        return this.am.c();
    }

    @Override // defpackage.fd
    public final void ak() {
        super.ak();
        e();
        btrm btrmVar = this.d;
        dceq a = dcet.a();
        a.b(bxev.class, new qet(bxev.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
    }

    @Override // defpackage.fd
    public final void al() {
        super.al();
        EditText d = d();
        if (d != null) {
            d.clearFocus();
        }
        ((InputMethodManager) J().getSystemService("input_method")).hideSoftInputFromWindow(this.am.c().findViewById(R.id.search_omnibox_edit_text).getWindowToken(), 1);
        this.d.a(this);
    }

    @dzsi
    public final EditText d() {
        dbsg<EditText> d = hqv.d(this.am.c());
        if (!d.a()) {
            return null;
        }
        return d.b();
    }

    @Override // defpackage.qfd
    public final void e() {
        EditText d = d();
        if (d != null) {
            d.requestFocus();
        }
        ((InputMethodManager) J().getSystemService("input_method")).showSoftInput(this.am.c().findViewById(R.id.search_omnibox_edit_text), 1);
    }

    @Override // defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (this.al == null) {
            this.al = new qeq(this, J(), this.af, this.ak).g();
        }
        if (this.ap == null) {
            this.ap = (bxeq) J();
        }
        this.an = new qey(this.g, this.d, this.ad, this.ae, new bxko());
    }
}
