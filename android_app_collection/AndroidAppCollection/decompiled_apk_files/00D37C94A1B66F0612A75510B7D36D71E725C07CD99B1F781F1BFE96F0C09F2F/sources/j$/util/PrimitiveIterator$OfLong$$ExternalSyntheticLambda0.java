package j$.util;

import j$.util.function.Consumer;
import j$.util.function.LongConsumer;
/* compiled from: D8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class PrimitiveIterator$OfLong$$ExternalSyntheticLambda0 implements LongConsumer {
    public final /* synthetic */ Consumer f$0;

    public /* synthetic */ PrimitiveIterator$OfLong$$ExternalSyntheticLambda0(Consumer consumer) {
        this.f$0 = consumer;
    }

    @Override // j$.util.function.LongConsumer
    public final void accept(long j) {
        this.f$0.accept(Long.valueOf(j));
    }
}
