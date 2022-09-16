package j$.util.stream;

import j$.util.function.BiConsumer;
import java.util.List;
/* compiled from: D8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class Collectors$$ExternalSyntheticLambda23 implements BiConsumer {
    public static final /* synthetic */ Collectors$$ExternalSyntheticLambda23 INSTANCE = new Collectors$$ExternalSyntheticLambda23();

    private /* synthetic */ Collectors$$ExternalSyntheticLambda23() {
    }

    @Override // j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        ((List) obj).add(obj2);
    }

    @Override // j$.util.function.BiConsumer
    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return biConsumer.getClass();
    }
}
