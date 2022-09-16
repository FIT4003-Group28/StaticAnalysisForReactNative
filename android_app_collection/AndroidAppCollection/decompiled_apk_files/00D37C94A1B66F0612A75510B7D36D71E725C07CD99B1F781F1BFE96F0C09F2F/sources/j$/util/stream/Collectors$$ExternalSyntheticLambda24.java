package j$.util.stream;

import j$.util.function.BiConsumer;
import java.util.Set;
/* compiled from: D8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class Collectors$$ExternalSyntheticLambda24 implements BiConsumer {
    public static final /* synthetic */ Collectors$$ExternalSyntheticLambda24 INSTANCE = new Collectors$$ExternalSyntheticLambda24();

    private /* synthetic */ Collectors$$ExternalSyntheticLambda24() {
    }

    @Override // j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        ((Set) obj).add(obj2);
    }

    @Override // j$.util.function.BiConsumer
    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return biConsumer.getClass();
    }
}
