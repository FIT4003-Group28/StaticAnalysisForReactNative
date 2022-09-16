package j$.util.stream;

import j$.util.StringJoiner;
import j$.util.function.Function;
/* compiled from: D8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class Collectors$$ExternalSyntheticLambda64 implements Function {
    public static final /* synthetic */ Collectors$$ExternalSyntheticLambda64 INSTANCE = new Collectors$$ExternalSyntheticLambda64();

    private /* synthetic */ Collectors$$ExternalSyntheticLambda64() {
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Function andThen(Function function) {
        return function.getClass();
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        return ((StringJoiner) obj).toString();
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return function.getClass();
    }
}
