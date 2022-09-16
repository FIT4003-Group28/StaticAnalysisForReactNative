package j$.util.stream;

import j$.util.function.BiFunction;
import j$.util.function.BinaryOperator;
import j$.util.function.Function;
import java.util.List;
/* compiled from: D8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class Collectors$$ExternalSyntheticLambda37 implements BinaryOperator {
    public static final /* synthetic */ Collectors$$ExternalSyntheticLambda37 INSTANCE = new Collectors$$ExternalSyntheticLambda37();

    private /* synthetic */ Collectors$$ExternalSyntheticLambda37() {
    }

    @Override // j$.util.function.BiFunction
    public /* synthetic */ BiFunction andThen(Function function) {
        return function.getClass();
    }

    @Override // j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return ((List) obj).addAll((List) obj2);
    }
}
