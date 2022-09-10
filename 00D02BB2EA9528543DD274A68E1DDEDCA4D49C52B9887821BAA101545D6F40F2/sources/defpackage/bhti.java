package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bhti  reason: default package */
/* loaded from: classes3.dex */
public class bhti implements bhsb {
    final /* synthetic */ jic a;
    final /* synthetic */ int b;
    final /* synthetic */ bhtk c;

    public bhti(bhtk bhtkVar, jic jicVar, int i) {
        this.c = bhtkVar;
        this.a = jicVar;
        this.b = i;
    }

    @Override // defpackage.bhsb
    public jic a() {
        return this.a;
    }

    @Override // defpackage.bhsb
    public cqkl b() {
        ckne ckneVar = new ckne(dcdc.r(this.c.a.i));
        int i = this.b;
        bbtv v = bbty.v();
        v.k(true);
        v.t(true);
        v.p(afyb.i(this.c.k, afyc.DEMO_LENS_DINING_ICON));
        this.c.h.a().o(ckneVar, i, v.a(), null);
        return cqkl.a;
    }

    @Override // defpackage.bhsb
    public cqkl c() {
        return this.c.d();
    }

    @Override // defpackage.bhsb
    public String d() {
        return this.c.f.getResources().getString(R.string.OFFERING_DETAILS_NUMBERED_PHOTO_CONTENT_DESCRIPTION, String.valueOf(this.b + 1));
    }

    @Override // defpackage.bhsb
    public cjtd e() {
        return this.c.l;
    }
}
