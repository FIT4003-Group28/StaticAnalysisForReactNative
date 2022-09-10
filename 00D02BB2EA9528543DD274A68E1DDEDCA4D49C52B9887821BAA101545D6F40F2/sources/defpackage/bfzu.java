package defpackage;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bfzu  reason: default package */
/* loaded from: classes3.dex */
public final class bfzu {
    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        cqmj<T> gs = cqgr.gs(cqgr.aR(Integer.valueOf((int) R.id.header)), cqgr.bq(cqrp.d(88.0d)));
        gs.f(cqmpVarArr);
        return gs;
    }

    public static Animation b() {
        return f(0.0f, 1.0f);
    }

    public static Animation c() {
        return f(1.0f, 0.0f);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> d(cqmp<T>... cqmpVarArr) {
        cqmj<T> gs = cqgr.gs(cqgr.cd(-1), cqgr.bq(cqrp.d(6.0d)), cqgr.x(ibp.b()));
        gs.f(cqmpVarArr);
        return gs;
    }

    public static <T extends cqkp> cqmj<T> e(cqmp<T> cqmpVar, cqlc<T, Number> cqlcVar, cqlc<T, Boolean> cqlcVar2) {
        return cqgr.fY(cqgr.cd(-1), cqgr.bq(cqrt.d(R.dimen.shadow_height_rounded_corners)), cqic.f(cqlcVar2, new cqmp[0]), cqmpVar, cqgr.j(cqlcVar), cqgr.L(true), cqgr.fr(cqrt.d(R.dimen.above_shadow_translation_y)), cqgr.x(ibp.a()));
    }

    private static Animation f(float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(irf.a);
        return alphaAnimation;
    }
}
