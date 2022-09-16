package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: afwb  reason: default package */
/* loaded from: classes2.dex */
class afwb extends afwf {
    final /* synthetic */ arfk a;
    final /* synthetic */ afwg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afwb(afwg afwgVar, cqtd cqtdVar, CharSequence charSequence, cjtd cjtdVar, arfk arfkVar) {
        super(afwgVar, cqtdVar, charSequence, cjtdVar, true);
        this.b = afwgVar;
        this.a = arfkVar;
    }

    @Override // defpackage.afwf, defpackage.izt
    public cqtd a() {
        gid b = gie.b(ibr.c);
        b.b = ibm.c();
        b.b(24.0d);
        return b.a();
    }

    @Override // defpackage.afwf, defpackage.izt
    @dzsi
    public CharSequence b() {
        return this.b.a.getString(R.string.MY_MAPS_MAP_DETAILS_DESCRIPTION);
    }

    @Override // defpackage.afwf, defpackage.izt
    public Boolean c() {
        return true;
    }

    @Override // defpackage.afwf, defpackage.izt
    public cqkl i() {
        this.b.u.a().r();
        return cqkl.a;
    }

    @Override // defpackage.afwf, defpackage.izt
    public cjtd j() {
        return cjtd.a(dtye.l);
    }

    @Override // defpackage.afuz
    public cqkl n(cjqm cjqmVar) {
        this.b.i.a().q();
        boolean z = !this.a.f;
        this.b.u.a().m(z);
        if (z) {
            this.b.u.a().l();
        }
        return cqkl.a;
    }

    @Override // defpackage.afwf, defpackage.afuz
    public Boolean o() {
        return Boolean.valueOf(this.a.f);
    }

    @Override // defpackage.afwf, defpackage.afuz
    public View.AccessibilityDelegate q() {
        return new afot(this.a.f);
    }
}
