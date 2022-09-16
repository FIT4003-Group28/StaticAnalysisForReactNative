package j$.util.function;
/* loaded from: classes5.dex */
public interface IntConsumer {
    void accept(int i);

    IntConsumer andThen(IntConsumer intConsumer);

    /* renamed from: j$.util.function.IntConsumer$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        public static /* synthetic */ void lambda$andThen$0(IntConsumer intConsumer, IntConsumer intConsumer2, int i) {
            intConsumer.accept(i);
            intConsumer2.accept(i);
        }
    }
}
