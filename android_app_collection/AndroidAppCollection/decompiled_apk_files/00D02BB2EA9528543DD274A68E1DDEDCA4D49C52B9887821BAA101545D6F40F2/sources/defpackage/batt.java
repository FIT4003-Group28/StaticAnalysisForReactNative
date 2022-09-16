package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: batt  reason: default package */
/* loaded from: classes3.dex */
class batt implements jbk {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ batu b;

    public batt(batu batuVar, CharSequence charSequence) {
        this.b = batuVar;
        this.a = charSequence;
    }

    @Override // defpackage.jbk
    public jib NC() {
        jhz a = jhz.a();
        a.a = this.a;
        a.i = cqrt.g(2131232205, ibm.p());
        a.j = cqrt.l(R.string.CLOSE_BUTTON);
        a.f(new bats(this));
        return a.b();
    }
}
