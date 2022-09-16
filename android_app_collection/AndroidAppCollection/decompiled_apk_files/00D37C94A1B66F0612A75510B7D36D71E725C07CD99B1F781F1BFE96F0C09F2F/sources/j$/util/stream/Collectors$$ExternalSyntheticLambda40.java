package j$.util.stream;

import j$.util.function.BiFunction;
import j$.util.function.BinaryOperator;
import j$.util.function.Function;
import java.util.Map;
/* compiled from: D8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class Collectors$$ExternalSyntheticLambda40 implements BinaryOperator {
    public static final /* synthetic */ Collectors$$ExternalSyntheticLambda40 INSTANCE = new Collectors$$ExternalSyntheticLambda40();

    private /* synthetic */ Collectors$$ExternalSyntheticLambda40() {
    }

    @Override // j$.util.function.BiFunction
    public /* synthetic */ BiFunction andThen(Function function) {
        return function.getClass();
    }

    @Override // j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return Collectors.lambda$uniqKeysMapMerger$0((Map) obj, (Map) obj2);
    }
}
