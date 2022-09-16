package j$.util.stream;

import j$.util.Optional;
import j$.util.OptionalInt;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntConsumer;
import j$.util.function.Predicate;
import j$.util.function.Supplier;
import j$.util.stream.Sink;
import java.util.concurrent.CountedCompleter;
/* loaded from: classes5.dex */
abstract class FindOps {
    public static TerminalOp makeRef(boolean z) {
        return z ? FindSink.OfRef.OP_FIND_FIRST : FindSink.OfRef.OP_FIND_ANY;
    }

    public static TerminalOp makeInt(boolean z) {
        return z ? FindSink.OfInt.OP_FIND_FIRST : FindSink.OfInt.OP_FIND_ANY;
    }

    /* loaded from: classes5.dex */
    final class FindOp implements TerminalOp {
        final Object emptyValue;
        final int opFlags;
        final Predicate presentPredicate;
        private final StreamShape shape;
        final Supplier sinkSupplier;

        FindOp(boolean z, StreamShape streamShape, Object obj, Predicate predicate, Supplier supplier) {
            this.opFlags = (z ? 0 : StreamOpFlag.NOT_ORDERED) | StreamOpFlag.IS_SHORT_CIRCUIT;
            this.shape = streamShape;
            this.emptyValue = obj;
            this.presentPredicate = predicate;
            this.sinkSupplier = supplier;
        }

        @Override // j$.util.stream.TerminalOp
        public int getOpFlags() {
            return this.opFlags;
        }

        @Override // j$.util.stream.TerminalOp
        public StreamShape inputShape() {
            return this.shape;
        }

        @Override // j$.util.stream.TerminalOp
        /* renamed from: evaluateSequential */
        public Object mo512evaluateSequential(PipelineHelper pipelineHelper, Spliterator spliterator) {
            Object mo515get = ((TerminalSink) pipelineHelper.wrapAndCopyInto((TerminalSink) this.sinkSupplier.mo515get(), spliterator)).mo515get();
            return mo515get != null ? mo515get : this.emptyValue;
        }

        @Override // j$.util.stream.TerminalOp
        /* renamed from: evaluateParallel */
        public Object mo511evaluateParallel(PipelineHelper pipelineHelper, Spliterator spliterator) {
            return new FindTask(this, StreamOpFlag.ORDERED.isKnown(pipelineHelper.getStreamAndOpFlags()), pipelineHelper, spliterator).invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public abstract class FindSink implements TerminalSink {
        boolean hasValue;
        Object value;

        @Override // j$.util.stream.Sink
        public /* synthetic */ void accept(int i) {
            Sink.CC.$default$accept((Sink) this, i);
        }

        @Override // j$.util.stream.Sink
        public /* synthetic */ void accept(long j) {
            Sink.CC.$default$accept(this, j);
        }

        @Override // j$.util.function.Consumer
        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return consumer.getClass();
        }

        @Override // j$.util.stream.Sink
        public /* synthetic */ void begin(long j) {
            Sink.CC.$default$begin(this, j);
        }

        @Override // j$.util.stream.Sink
        public /* synthetic */ void end() {
            Sink.CC.$default$end(this);
        }

        FindSink() {
        }

        @Override // j$.util.function.Consumer
        public void accept(Object obj) {
            if (!this.hasValue) {
                this.hasValue = true;
                this.value = obj;
            }
        }

        @Override // j$.util.stream.Sink
        public boolean cancellationRequested() {
            return this.hasValue;
        }

        /* loaded from: classes5.dex */
        final class OfRef extends FindSink {
            static final TerminalOp OP_FIND_ANY;
            static final TerminalOp OP_FIND_FIRST;

            @Override // j$.util.function.Supplier
            /* renamed from: get */
            public Optional mo515get() {
                if (this.hasValue) {
                    return Optional.of(this.value);
                }
                return null;
            }

            static {
                StreamShape streamShape = StreamShape.REFERENCE;
                Optional empty = Optional.empty();
                FindOps$FindSink$OfRef$$ExternalSyntheticLambda0 findOps$FindSink$OfRef$$ExternalSyntheticLambda0 = FindOps$FindSink$OfRef$$ExternalSyntheticLambda0.INSTANCE;
                FindOps$FindSink$OfRef$$ExternalSyntheticLambda1 findOps$FindSink$OfRef$$ExternalSyntheticLambda1 = FindOps$FindSink$OfRef$$ExternalSyntheticLambda1.INSTANCE;
                OP_FIND_FIRST = new FindOp(true, streamShape, empty, findOps$FindSink$OfRef$$ExternalSyntheticLambda0, findOps$FindSink$OfRef$$ExternalSyntheticLambda1);
                OP_FIND_ANY = new FindOp(false, streamShape, Optional.empty(), findOps$FindSink$OfRef$$ExternalSyntheticLambda0, findOps$FindSink$OfRef$$ExternalSyntheticLambda1);
            }
        }

        /* loaded from: classes5.dex */
        final class OfInt extends FindSink implements Sink.OfInt {
            static final TerminalOp OP_FIND_ANY;
            static final TerminalOp OP_FIND_FIRST;

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return intConsumer.getClass();
            }

            @Override // j$.util.stream.Sink.OfInt
            public /* bridge */ /* synthetic */ void accept(Integer num) {
                super.accept((Object) num);
            }

            @Override // j$.util.stream.FindOps.FindSink, j$.util.stream.Sink
            public void accept(int i) {
                accept((Object) Integer.valueOf(i));
            }

            @Override // j$.util.function.Supplier
            /* renamed from: get */
            public OptionalInt mo515get() {
                if (this.hasValue) {
                    return OptionalInt.of(((Integer) this.value).intValue());
                }
                return null;
            }

            static {
                StreamShape streamShape = StreamShape.INT_VALUE;
                OptionalInt empty = OptionalInt.empty();
                FindOps$FindSink$OfInt$$ExternalSyntheticLambda0 findOps$FindSink$OfInt$$ExternalSyntheticLambda0 = FindOps$FindSink$OfInt$$ExternalSyntheticLambda0.INSTANCE;
                FindOps$FindSink$OfInt$$ExternalSyntheticLambda1 findOps$FindSink$OfInt$$ExternalSyntheticLambda1 = FindOps$FindSink$OfInt$$ExternalSyntheticLambda1.INSTANCE;
                OP_FIND_FIRST = new FindOp(true, streamShape, empty, findOps$FindSink$OfInt$$ExternalSyntheticLambda0, findOps$FindSink$OfInt$$ExternalSyntheticLambda1);
                OP_FIND_ANY = new FindOp(false, streamShape, OptionalInt.empty(), findOps$FindSink$OfInt$$ExternalSyntheticLambda0, findOps$FindSink$OfInt$$ExternalSyntheticLambda1);
            }
        }
    }

    /* loaded from: classes5.dex */
    final class FindTask extends AbstractShortCircuitTask {
        private final boolean mustFindFirst;
        private final FindOp op;

        FindTask(FindOp findOp, boolean z, PipelineHelper pipelineHelper, Spliterator spliterator) {
            super(pipelineHelper, spliterator);
            this.mustFindFirst = z;
            this.op = findOp;
        }

        FindTask(FindTask findTask, Spliterator spliterator) {
            super(findTask, spliterator);
            this.mustFindFirst = findTask.mustFindFirst;
            this.op = findTask.op;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.AbstractTask
        /* renamed from: makeChild  reason: collision with other method in class */
        public FindTask mo523makeChild(Spliterator spliterator) {
            return new FindTask(this, spliterator);
        }

        @Override // j$.util.stream.AbstractShortCircuitTask
        /* renamed from: getEmptyResult */
        protected Object mo522getEmptyResult() {
            return this.op.emptyValue;
        }

        private void foundResult(Object obj) {
            if (isLeftmostNode()) {
                shortCircuit(obj);
            } else {
                cancelLaterNodes();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.AbstractTask
        /* renamed from: doLeaf */
        public Object mo521doLeaf() {
            Object mo515get = ((TerminalSink) this.helper.wrapAndCopyInto((TerminalSink) this.op.sinkSupplier.mo515get(), this.spliterator)).mo515get();
            if (!this.mustFindFirst) {
                if (mo515get != null) {
                    shortCircuit(mo515get);
                }
                return null;
            } else if (mo515get == null) {
                return null;
            } else {
                foundResult(mo515get);
                return mo515get;
            }
        }

        @Override // j$.util.stream.AbstractTask, java.util.concurrent.CountedCompleter
        public void onCompletion(CountedCompleter countedCompleter) {
            if (this.mustFindFirst) {
                FindTask findTask = (FindTask) this.leftChild;
                FindTask findTask2 = null;
                while (true) {
                    if (findTask != findTask2) {
                        Object localResult = findTask.getLocalResult();
                        if (localResult == null || !this.op.presentPredicate.test(localResult)) {
                            findTask2 = findTask;
                            findTask = (FindTask) this.rightChild;
                        } else {
                            setLocalResult(localResult);
                            foundResult(localResult);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            super.onCompletion(countedCompleter);
        }
    }
}
