package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: arip  reason: default package */
/* loaded from: classes2.dex */
public class arip implements jbf, arhg {
    private final Activity a;
    private final dxio<arfm> b;

    public arip(Activity activity, dxio<arfm> dxioVar) {
        this.a = activity;
        this.b = dxioVar;
    }

    @Override // defpackage.arhg
    public void D(dvcj dvcjVar) {
    }

    @Override // defpackage.arhg
    public void E(String str) {
    }

    @Override // defpackage.jbf
    public cqtd d() {
        return null;
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        this.b.a().r();
        return cqkl.a;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd g() {
        return null;
    }

    @Override // defpackage.jbf
    public cjtd h() {
        return cjtd.a(dtxv.eE);
    }

    @Override // defpackage.jbf
    public CharSequence l() {
        return null;
    }

    @Override // defpackage.jbi
    public CharSequence m() {
        return this.a.getString(R.string.MY_MAPS_VIEW_MAP_LEGEND_TEXT);
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
    }

    @Override // defpackage.bega
    public void u() {
    }

    @Override // defpackage.bega
    public Boolean w() {
        return true;
    }
}
