package j$.util.stream;

import j$.util.function.LongFunction;
/* compiled from: D8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class Nodes$CollectorTask$OfLong$$ExternalSyntheticLambda1 implements LongFunction {
    public static final /* synthetic */ Nodes$CollectorTask$OfLong$$ExternalSyntheticLambda1 INSTANCE = new Nodes$CollectorTask$OfLong$$ExternalSyntheticLambda1();

    private /* synthetic */ Nodes$CollectorTask$OfLong$$ExternalSyntheticLambda1() {
    }

    @Override // j$.util.function.LongFunction
    public final Object apply(long j) {
        return Nodes.longBuilder(j);
    }
}
