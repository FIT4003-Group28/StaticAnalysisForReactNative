package defpackage;

import com.airbnb.lottie.LottieAnimationView;
/* compiled from: PG */
/* renamed from: eit  reason: default package */
/* loaded from: classes6.dex */
public final class eit {
    public static final cqkv a = new eiu();

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(LottieAnimationView.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> b(Boolean bool) {
        return cqjv.i(eis.LOOP, bool, a);
    }

    public static <T extends cqkp> cqnf<T> c(Boolean bool) {
        return cqjv.i(eis.AUTO_PLAY, bool, a);
    }

    public static <T extends cqkp> cqnf<T> d(@dzsi eik eikVar) {
        return cqjv.i(eis.LOADER, eikVar, a);
    }

    public static <T extends cqkp> cqnf<T> e(cqlc<T, eik> cqlcVar) {
        return cqjv.g(eis.LOADER, cqlcVar, a);
    }
}
