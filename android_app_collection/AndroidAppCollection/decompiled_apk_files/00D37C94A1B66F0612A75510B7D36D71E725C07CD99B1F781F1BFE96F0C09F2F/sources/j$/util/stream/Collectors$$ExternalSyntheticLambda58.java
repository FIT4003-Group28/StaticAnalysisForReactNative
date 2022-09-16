package j$.util.stream;

import j$.util.function.Function;
/* compiled from: D8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class Collectors$$ExternalSyntheticLambda58 implements Function {
    public static final /* synthetic */ Collectors$$ExternalSyntheticLambda58 INSTANCE = new Collectors$$ExternalSyntheticLambda58();

    private /* synthetic */ Collectors$$ExternalSyntheticLambda58() {
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Function andThen(Function function) {
        return function.getClass();
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        return Collectors.lambda$castingIdentity$2(obj);
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return function.getClass();
    }
}
