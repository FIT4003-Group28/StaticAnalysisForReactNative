package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.BooleanSupplier;
import j$.util.function.Consumer;
import j$.util.function.IntConsumer;
import j$.util.function.Supplier;
import j$.util.stream.Sink;
import j$.util.stream.SpinedBuffer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class StreamSpliterators$IntWrappingSpliterator extends StreamSpliterators$AbstractWrappingSpliterator implements Spliterator.OfInt {
    @Override // j$.util.Spliterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Spliterator.OfInt.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return Spliterator.OfInt.CC.$default$tryAdvance(this, consumer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public StreamSpliterators$IntWrappingSpliterator(PipelineHelper pipelineHelper, Supplier supplier, boolean z) {
        super(pipelineHelper, supplier, z);
    }

    StreamSpliterators$IntWrappingSpliterator(PipelineHelper pipelineHelper, Spliterator spliterator, boolean z) {
        super(pipelineHelper, spliterator, z);
    }

    @Override // j$.util.stream.StreamSpliterators$AbstractWrappingSpliterator
    /* renamed from: wrap */
    StreamSpliterators$AbstractWrappingSpliterator mo544wrap(Spliterator spliterator) {
        return new StreamSpliterators$IntWrappingSpliterator(this.ph, spliterator, this.isParallel);
    }

    @Override // j$.util.stream.StreamSpliterators$AbstractWrappingSpliterator
    void initPartialTraversalState() {
        final SpinedBuffer.OfInt ofInt = new SpinedBuffer.OfInt();
        this.buffer = ofInt;
        this.bufferSink = this.ph.wrapSink(new Sink.OfInt() { // from class: j$.util.stream.StreamSpliterators$IntWrappingSpliterator$$ExternalSyntheticLambda2
            @Override // j$.util.stream.Sink.OfInt, j$.util.stream.Sink
            public final void accept(int i) {
                SpinedBuffer.OfInt.this.accept(i);
            }

            @Override // j$.util.stream.Sink
            public /* synthetic */ void accept(long j) {
                Sink.CC.$default$accept(this, j);
            }

            @Override // j$.util.stream.Sink.OfInt
            public /* synthetic */ void accept(Integer num) {
                Sink.OfInt.CC.$default$accept((Sink.OfInt) this, num);
            }

            @Override // j$.util.function.Consumer
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                Sink.OfInt.CC.$default$accept(this, obj);
            }

            @Override // j$.util.function.Consumer
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return consumer.getClass();
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return intConsumer.getClass();
            }

            @Override // j$.util.stream.Sink
            public /* synthetic */ void begin(long j) {
                Sink.CC.$default$begin(this, j);
            }

            @Override // j$.util.stream.Sink
            public /* synthetic */ boolean cancellationRequested() {
                return Sink.CC.$default$cancellationRequested(this);
            }

            @Override // j$.util.stream.Sink
            public /* synthetic */ void end() {
                Sink.CC.$default$end(this);
            }
        });
        this.pusher = new BooleanSupplier() { // from class: j$.util.stream.StreamSpliterators$IntWrappingSpliterator$$ExternalSyntheticLambda0
            @Override // j$.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return StreamSpliterators$IntWrappingSpliterator.this.lambda$initPartialTraversalState$0$StreamSpliterators$IntWrappingSpliterator();
            }
        };
    }

    public /* synthetic */ boolean lambda$initPartialTraversalState$0$StreamSpliterators$IntWrappingSpliterator() {
        return this.spliterator.tryAdvance(this.bufferSink);
    }

    @Override // j$.util.stream.StreamSpliterators$AbstractWrappingSpliterator, j$.util.Spliterator
    /* renamed from: trySplit */
    public Spliterator.OfInt mo545trySplit() {
        return (Spliterator.OfInt) super.mo545trySplit();
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        boolean doAdvance = doAdvance();
        if (doAdvance) {
            intConsumer.accept(((SpinedBuffer.OfInt) this.buffer).get(this.nextToConsume));
        }
        return doAdvance;
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public void forEachRemaining(final IntConsumer intConsumer) {
        if (this.buffer == null && !this.finished) {
            intConsumer.getClass();
            init();
            this.ph.wrapAndCopyInto(new Sink.OfInt() { // from class: j$.util.stream.StreamSpliterators$IntWrappingSpliterator$$ExternalSyntheticLambda1
                @Override // j$.util.stream.Sink.OfInt, j$.util.stream.Sink
                public final void accept(int i) {
                    IntConsumer.this.accept(i);
                }

                @Override // j$.util.stream.Sink
                public /* synthetic */ void accept(long j) {
                    Sink.CC.$default$accept(this, j);
                }

                @Override // j$.util.stream.Sink.OfInt
                public /* synthetic */ void accept(Integer num) {
                    Sink.OfInt.CC.$default$accept((Sink.OfInt) this, num);
                }

                @Override // j$.util.function.Consumer
                public /* bridge */ /* synthetic */ void accept(Object obj) {
                    Sink.OfInt.CC.$default$accept(this, obj);
                }

                @Override // j$.util.function.Consumer
                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return consumer.getClass();
                }

                @Override // j$.util.function.IntConsumer
                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return intConsumer2.getClass();
                }

                @Override // j$.util.stream.Sink
                public /* synthetic */ void begin(long j) {
                    Sink.CC.$default$begin(this, j);
                }

                @Override // j$.util.stream.Sink
                public /* synthetic */ boolean cancellationRequested() {
                    return Sink.CC.$default$cancellationRequested(this);
                }

                @Override // j$.util.stream.Sink
                public /* synthetic */ void end() {
                    Sink.CC.$default$end(this);
                }
            }, this.spliterator);
            this.finished = true;
            return;
        }
        do {
        } while (tryAdvance(intConsumer));
    }
}
