package j$.util.stream;

import j$.util.StringJoiner;
import j$.util.function.BiConsumer;
/* compiled from: D8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class Collectors$$ExternalSyntheticLambda25 implements BiConsumer {
    public static final /* synthetic */ Collectors$$ExternalSyntheticLambda25 INSTANCE = new Collectors$$ExternalSyntheticLambda25();

    private /* synthetic */ Collectors$$ExternalSyntheticLambda25() {
    }

    @Override // j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        ((StringJoiner) obj).add((CharSequence) obj2);
    }

    @Override // j$.util.function.BiConsumer
    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return biConsumer.getClass();
    }
}
