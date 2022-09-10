package defpackage;

import com.google.android.apps.maps.R;
/* renamed from: kbm  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class kbm implements cqlc {
    static final cqlc a = new kbm();

    private kbm() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        int i = kbp.a;
        if (((kcf) cqkpVar).b().booleanValue()) {
            return cqrt.f(R.drawable.car_only_sidegradient_night);
        }
        return iva.e(cqrt.f(R.drawable.car_only_sidegradient_day), cqrt.f(R.drawable.car_only_sidegradient_night));
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
