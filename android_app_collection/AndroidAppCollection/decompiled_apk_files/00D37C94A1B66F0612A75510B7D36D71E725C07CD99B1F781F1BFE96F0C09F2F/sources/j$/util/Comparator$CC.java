package j$.util;

import j$.util.function.Function;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.util.Collections;
import java.util.Comparator;
/* renamed from: j$.util.Comparator$-CC */
/* loaded from: classes5.dex */
public final /* synthetic */ class Comparator$CC {
    public static Comparator reverseOrder() {
        return Collections.reverseOrder();
    }

    public static Comparator naturalOrder() {
        return Comparators$NaturalOrderComparator.INSTANCE;
    }

    public static Comparator comparing(Function function) {
        function.getClass();
        return new Comparator$$ExternalSyntheticLambda2(function);
    }

    public static Comparator comparingInt(ToIntFunction toIntFunction) {
        toIntFunction.getClass();
        return new Comparator$$ExternalSyntheticLambda4(toIntFunction);
    }

    public static Comparator comparingLong(ToLongFunction toLongFunction) {
        toLongFunction.getClass();
        return new Comparator$$ExternalSyntheticLambda5(toLongFunction);
    }

    public static /* synthetic */ int lambda$comparingLong$6043328a$1(ToLongFunction toLongFunction, Object obj, Object obj2) {
        return (toLongFunction.applyAsLong(obj) > toLongFunction.applyAsLong(obj2) ? 1 : (toLongFunction.applyAsLong(obj) == toLongFunction.applyAsLong(obj2) ? 0 : -1));
    }
}
