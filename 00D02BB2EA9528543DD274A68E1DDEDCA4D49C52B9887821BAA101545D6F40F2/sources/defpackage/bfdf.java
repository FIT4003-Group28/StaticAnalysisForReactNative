package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bfdf  reason: default package */
/* loaded from: classes3.dex */
public class bfdf extends bfde implements bzml {
    private final Activity a;
    private final bexz g;
    private final afzs h;
    private final dxio<afzv> i;
    private final dxio<bzmm> j;
    private final cjtd k;
    private String l;

    public bfdf(Activity activity, cqhn cqhnVar, cqhu cqhuVar, beya beyaVar, afzs afzsVar, dxio<afzv> dxioVar, dxio<bzmm> dxioVar2, dxio<cjqq> dxioVar3) {
        super(activity, cqhnVar, cqhuVar, dxioVar3);
        this.l = "";
        this.a = activity;
        this.g = beyaVar.a(null);
        this.h = afzsVar;
        this.i = dxioVar;
        this.j = dxioVar2;
        this.k = cjtd.a(dtxu.ae);
    }

    @Override // defpackage.bzml
    public dqkc a() {
        return dqkc.LOCAL_FOLLOW_EDUCATIONAL_TOAST;
    }

    @Override // defpackage.bzml
    public bzmj b() {
        return bzmj.CRITICAL;
    }

    @Override // defpackage.bzml
    public boolean c() {
        return false;
    }

    @Override // defpackage.bzml
    public boolean d() {
        return this.g.a() && this.h.a() && !this.e && this.j.a().d(a()) < 3;
    }

    @Override // defpackage.bzml
    public bzmk e() {
        return this.e ? bzmk.NONE : bzmk.VISIBLE;
    }

    @Override // defpackage.bzml
    public boolean f(bzmk bzmkVar) {
        bzmk bzmkVar2 = bzmk.UNKNOWN_VISIBILITY;
        if (bzmkVar.ordinal() != 3) {
            return false;
        }
        String valueOf = String.valueOf(k());
        String valueOf2 = String.valueOf(l());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(" ");
        sb.append(valueOf2);
        this.d = sb.toString();
        super.z(this.k);
        return true;
    }

    @Override // defpackage.bfch
    public void h(jjn jjnVar) {
        if (jjnVar == jjn.FULLY_EXPANDED) {
            y();
        }
    }

    @Override // defpackage.bfch
    public cqtd j() {
        return cqrt.i(iup.e(R.raw.ic_mod_tab_local_stream), ibm.c());
    }

    @Override // defpackage.bfch
    public CharSequence k() {
        return this.a.getString(R.string.LOCAL_FOLLOW_TOAST_HEADLINE);
    }

    @Override // defpackage.bfch
    public CharSequence l() {
        return this.a.getString(R.string.LOCAL_FOLLOW_TOAST_INFO, new Object[]{this.l});
    }

    @Override // defpackage.bfch
    public CharSequence n() {
        return this.a.getString(R.string.LOCAL_FOLLOW_TOAST_VISIT_BUTTON);
    }

    @Override // defpackage.bfch
    public CharSequence o() {
        return this.a.getString(R.string.LOCAL_FOLLOW_TOAST_DISMISS_BUTTON);
    }

    @Override // defpackage.bfch
    public cqkl p() {
        this.i.a().m();
        return cqkl.a;
    }

    @Override // defpackage.bfch
    public cqkl q() {
        y();
        return cqkl.a;
    }

    @Override // defpackage.bfch
    public cjtd r() {
        return this.k;
    }

    @Override // defpackage.bfch
    public cjtd s() {
        return cjtd.a(dtxu.ag);
    }

    @Override // defpackage.bfch
    public cjtd t() {
        return cjtd.a(dtxu.af);
    }

    public void w(bwrs<ilo> bwrsVar) {
        ilo c = bwrsVar.c();
        dbsk.s(c);
        this.l = c.n();
    }

    public void x() {
        this.l = "";
    }

    final void y() {
        super.A();
        this.j.a().f(a());
    }
}
