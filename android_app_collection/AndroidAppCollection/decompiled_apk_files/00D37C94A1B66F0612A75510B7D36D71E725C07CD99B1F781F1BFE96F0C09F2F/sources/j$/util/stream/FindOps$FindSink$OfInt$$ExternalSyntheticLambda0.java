package j$.util.stream;

import j$.util.OptionalInt;
import j$.util.function.Predicate;
/* compiled from: D8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class FindOps$FindSink$OfInt$$ExternalSyntheticLambda0 implements Predicate {
    public static final /* synthetic */ FindOps$FindSink$OfInt$$ExternalSyntheticLambda0 INSTANCE = new FindOps$FindSink$OfInt$$ExternalSyntheticLambda0();

    private /* synthetic */ FindOps$FindSink$OfInt$$ExternalSyntheticLambda0() {
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return predicate.getClass();
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate or(Predicate predicate) {
        return predicate.getClass();
    }

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        return ((OptionalInt) obj).isPresent();
    }
}
