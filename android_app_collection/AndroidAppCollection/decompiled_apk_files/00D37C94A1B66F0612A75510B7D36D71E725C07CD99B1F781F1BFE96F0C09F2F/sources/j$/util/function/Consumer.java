package j$.util.function;
/* loaded from: classes5.dex */
public interface Consumer {

    /* compiled from: D8$$SyntheticClass */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class VivifiedWrapper implements Consumer {
        final /* synthetic */ java.util.function.Consumer wrappedValue;

        private /* synthetic */ VivifiedWrapper(java.util.function.Consumer consumer) {
            this.wrappedValue = consumer;
        }

        public static /* synthetic */ Consumer convert(java.util.function.Consumer consumer) {
            if (consumer == null) {
                return null;
            }
            return consumer instanceof Wrapper ? Consumer.this : new VivifiedWrapper(consumer);
        }

        @Override // j$.util.function.Consumer
        public /* synthetic */ void accept(Object obj) {
            this.wrappedValue.accept(obj);
        }

        @Override // j$.util.function.Consumer
        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return convert(this.wrappedValue.andThen(Wrapper.convert(consumer)));
        }
    }

    /* compiled from: D8$$SyntheticClass */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class Wrapper implements java.util.function.Consumer {
        private /* synthetic */ Wrapper() {
        }

        public static /* synthetic */ java.util.function.Consumer convert(Consumer consumer) {
            if (consumer == null) {
                return null;
            }
            return consumer instanceof VivifiedWrapper ? ((VivifiedWrapper) consumer).wrappedValue : new Wrapper();
        }

        @Override // java.util.function.Consumer
        public /* synthetic */ void accept(Object obj) {
            Consumer.this.accept(obj);
        }

        @Override // java.util.function.Consumer
        public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
            return convert(Consumer.this.andThen(VivifiedWrapper.convert(consumer)));
        }
    }

    void accept(Object obj);

    Consumer andThen(Consumer consumer);

    /* renamed from: j$.util.function.Consumer$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        public static /* synthetic */ void lambda$andThen$0(Consumer consumer, Consumer consumer2, Object obj) {
            consumer.accept(obj);
            consumer2.accept(obj);
        }
    }
}
