package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.DoubleConsumer;
import j$.util.function.IntConsumer;
import j$.util.function.IntFunction;
import j$.util.function.LongConsumer;
import j$.util.stream.Sink;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public interface Node {

    /* loaded from: classes5.dex */
    public interface Builder extends Sink {

        /* loaded from: classes5.dex */
        public interface OfDouble extends Builder, Sink.OfDouble {
            @Override // j$.util.stream.Node.Builder
            /* renamed from: build */
            OfDouble mo498build();
        }

        /* loaded from: classes5.dex */
        public interface OfInt extends Builder, Sink.OfInt {
            @Override // j$.util.stream.Node.Builder
            /* renamed from: build */
            OfInt mo498build();
        }

        /* loaded from: classes5.dex */
        public interface OfLong extends Builder, Sink.OfLong {
            @Override // j$.util.stream.Node.Builder
            /* renamed from: build */
            OfLong mo498build();
        }

        /* renamed from: build */
        Node mo498build();
    }

    Object[] asArray(IntFunction intFunction);

    void copyInto(Object[] objArr, int i);

    long count();

    void forEach(Consumer consumer);

    /* renamed from: getChild */
    Node mo499getChild(int i);

    int getChildCount();

    /* renamed from: spliterator */
    Spliterator mo494spliterator();

    /* renamed from: truncate */
    Node mo501truncate(long j, long j2, IntFunction intFunction);

    /* renamed from: j$.util.stream.Node$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class CC {
        public static int $default$getChildCount(Node node) {
            return 0;
        }

        public static /* synthetic */ void lambda$truncate$0(Object obj) {
        }

        public static Node $default$getChild(Node node, int i) {
            throw new IndexOutOfBoundsException();
        }

        public static Node $default$truncate(Node node, long j, long j2, IntFunction intFunction) {
            if (j == 0 && j2 == node.count()) {
                return node;
            }
            Spliterator mo494spliterator = node.mo494spliterator();
            long j3 = j2 - j;
            Builder builder = Nodes.builder(j3, intFunction);
            builder.begin(j3);
            for (int i = 0; i < j && mo494spliterator.tryAdvance(Node$$ExternalSyntheticLambda0.INSTANCE); i++) {
            }
            if (j2 == node.count()) {
                mo494spliterator.forEachRemaining(builder);
            } else {
                for (int i2 = 0; i2 < j3 && mo494spliterator.tryAdvance(builder); i2++) {
                }
            }
            builder.end();
            return builder.mo498build();
        }
    }

    /* loaded from: classes5.dex */
    public interface OfPrimitive extends Node {
        /* renamed from: asPrimitiveArray */
        Object mo497asPrimitiveArray();

        void copyInto(Object obj, int i);

        void forEach(Object obj);

        @Override // j$.util.stream.Node
        /* renamed from: getChild */
        OfPrimitive mo499getChild(int i);

        /* renamed from: newArray */
        Object mo457newArray(int i);

        @Override // j$.util.stream.Node
        /* renamed from: spliterator */
        Spliterator.OfPrimitive mo494spliterator();

        /* renamed from: j$.util.stream.Node$OfPrimitive$-CC  reason: invalid class name */
        /* loaded from: classes5.dex */
        public abstract /* synthetic */ class CC {
            public static OfPrimitive $default$getChild(OfPrimitive ofPrimitive, int i) {
                throw new IndexOutOfBoundsException();
            }

            public static Object[] $default$asArray(OfPrimitive ofPrimitive, IntFunction intFunction) {
                if (Tripwire.ENABLED) {
                    Tripwire.trip(ofPrimitive.getClass(), "{0} calling Node.OfPrimitive.asArray");
                }
                if (ofPrimitive.count() >= 2147483639) {
                    throw new IllegalArgumentException("Stream size exceeds max array size");
                }
                Object[] objArr = (Object[]) intFunction.apply((int) ofPrimitive.count());
                ofPrimitive.copyInto(objArr, 0);
                return objArr;
            }
        }
    }

    /* loaded from: classes5.dex */
    public interface OfInt extends OfPrimitive {
        void copyInto(Integer[] numArr, int i);

        @Override // j$.util.stream.Node.OfPrimitive
        /* renamed from: newArray */
        int[] mo457newArray(int i);

        @Override // j$.util.stream.Node
        /* renamed from: truncate */
        OfInt mo501truncate(long j, long j2, IntFunction intFunction);

        /* renamed from: j$.util.stream.Node$OfInt$-CC  reason: invalid class name */
        /* loaded from: classes5.dex */
        public abstract /* synthetic */ class CC {
            public static /* synthetic */ void lambda$truncate$0(int i) {
            }

            public static void $default$forEach(OfInt ofInt, Consumer consumer) {
                if (consumer instanceof IntConsumer) {
                    ofInt.forEach((IntConsumer) consumer);
                    return;
                }
                if (Tripwire.ENABLED) {
                    Tripwire.trip(ofInt.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                }
                ((Spliterator.OfInt) ofInt.mo494spliterator()).forEachRemaining(consumer);
            }

            public static void $default$copyInto(OfInt ofInt, Integer[] numArr, int i) {
                if (Tripwire.ENABLED) {
                    Tripwire.trip(ofInt.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
                }
                int[] iArr = (int[]) ofInt.mo497asPrimitiveArray();
                for (int i2 = 0; i2 < iArr.length; i2++) {
                    numArr[i + i2] = Integer.valueOf(iArr[i2]);
                }
            }

            public static OfInt $default$truncate(OfInt ofInt, long j, long j2, IntFunction intFunction) {
                if (j == 0 && j2 == ofInt.count()) {
                    return ofInt;
                }
                long j3 = j2 - j;
                Spliterator.OfInt ofInt2 = (Spliterator.OfInt) ofInt.mo494spliterator();
                Builder.OfInt intBuilder = Nodes.intBuilder(j3);
                intBuilder.begin(j3);
                for (int i = 0; i < j && ofInt2.tryAdvance((IntConsumer) Node$OfInt$$ExternalSyntheticLambda0.INSTANCE); i++) {
                }
                if (j2 == ofInt.count()) {
                    ofInt2.forEachRemaining((IntConsumer) intBuilder);
                } else {
                    for (int i2 = 0; i2 < j3 && ofInt2.tryAdvance((IntConsumer) intBuilder); i2++) {
                    }
                }
                intBuilder.end();
                return intBuilder.mo498build();
            }

            /* renamed from: $default$newArray  reason: collision with other method in class */
            public static int[] m441$default$newArray(OfInt ofInt, int i) {
                return new int[i];
            }
        }
    }

    /* loaded from: classes5.dex */
    public interface OfLong extends OfPrimitive {
        void copyInto(Long[] lArr, int i);

        @Override // j$.util.stream.Node.OfPrimitive
        /* renamed from: newArray */
        long[] mo457newArray(int i);

        @Override // j$.util.stream.Node
        /* renamed from: truncate */
        OfLong mo501truncate(long j, long j2, IntFunction intFunction);

        /* renamed from: j$.util.stream.Node$OfLong$-CC  reason: invalid class name */
        /* loaded from: classes5.dex */
        public abstract /* synthetic */ class CC {
            public static /* synthetic */ void lambda$truncate$0(long j) {
            }

            public static void $default$forEach(OfLong ofLong, Consumer consumer) {
                if (consumer instanceof LongConsumer) {
                    ofLong.forEach((LongConsumer) consumer);
                    return;
                }
                if (Tripwire.ENABLED) {
                    Tripwire.trip(ofLong.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                }
                ((Spliterator.OfLong) ofLong.mo494spliterator()).forEachRemaining(consumer);
            }

            public static void $default$copyInto(OfLong ofLong, Long[] lArr, int i) {
                if (Tripwire.ENABLED) {
                    Tripwire.trip(ofLong.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
                }
                long[] jArr = (long[]) ofLong.mo497asPrimitiveArray();
                for (int i2 = 0; i2 < jArr.length; i2++) {
                    lArr[i + i2] = Long.valueOf(jArr[i2]);
                }
            }

            public static OfLong $default$truncate(OfLong ofLong, long j, long j2, IntFunction intFunction) {
                if (j == 0 && j2 == ofLong.count()) {
                    return ofLong;
                }
                long j3 = j2 - j;
                Spliterator.OfLong ofLong2 = (Spliterator.OfLong) ofLong.mo494spliterator();
                Builder.OfLong longBuilder = Nodes.longBuilder(j3);
                longBuilder.begin(j3);
                for (int i = 0; i < j && ofLong2.tryAdvance((LongConsumer) Node$OfLong$$ExternalSyntheticLambda0.INSTANCE); i++) {
                }
                if (j2 == ofLong.count()) {
                    ofLong2.forEachRemaining((LongConsumer) longBuilder);
                } else {
                    for (int i2 = 0; i2 < j3 && ofLong2.tryAdvance((LongConsumer) longBuilder); i2++) {
                    }
                }
                longBuilder.end();
                return longBuilder.mo498build();
            }

            /* renamed from: $default$newArray  reason: collision with other method in class */
            public static long[] m443$default$newArray(OfLong ofLong, int i) {
                return new long[i];
            }
        }
    }

    /* loaded from: classes5.dex */
    public interface OfDouble extends OfPrimitive {
        void copyInto(Double[] dArr, int i);

        @Override // j$.util.stream.Node.OfPrimitive
        /* renamed from: newArray */
        double[] mo457newArray(int i);

        @Override // j$.util.stream.Node
        /* renamed from: truncate */
        OfDouble mo501truncate(long j, long j2, IntFunction intFunction);

        /* renamed from: j$.util.stream.Node$OfDouble$-CC  reason: invalid class name */
        /* loaded from: classes5.dex */
        public abstract /* synthetic */ class CC {
            public static /* synthetic */ void lambda$truncate$0(double d) {
            }

            public static void $default$forEach(OfDouble ofDouble, Consumer consumer) {
                if (consumer instanceof DoubleConsumer) {
                    ofDouble.forEach((DoubleConsumer) consumer);
                    return;
                }
                if (Tripwire.ENABLED) {
                    Tripwire.trip(ofDouble.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                }
                ((Spliterator.OfDouble) ofDouble.mo494spliterator()).forEachRemaining(consumer);
            }

            public static void $default$copyInto(OfDouble ofDouble, Double[] dArr, int i) {
                if (Tripwire.ENABLED) {
                    Tripwire.trip(ofDouble.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
                }
                double[] dArr2 = (double[]) ofDouble.mo497asPrimitiveArray();
                for (int i2 = 0; i2 < dArr2.length; i2++) {
                    dArr[i + i2] = Double.valueOf(dArr2[i2]);
                }
            }

            public static OfDouble $default$truncate(OfDouble ofDouble, long j, long j2, IntFunction intFunction) {
                if (j == 0 && j2 == ofDouble.count()) {
                    return ofDouble;
                }
                long j3 = j2 - j;
                Spliterator.OfDouble ofDouble2 = (Spliterator.OfDouble) ofDouble.mo494spliterator();
                Builder.OfDouble doubleBuilder = Nodes.doubleBuilder(j3);
                doubleBuilder.begin(j3);
                for (int i = 0; i < j && ofDouble2.tryAdvance((DoubleConsumer) Node$OfDouble$$ExternalSyntheticLambda0.INSTANCE); i++) {
                }
                if (j2 == ofDouble.count()) {
                    ofDouble2.forEachRemaining((DoubleConsumer) doubleBuilder);
                } else {
                    for (int i2 = 0; i2 < j3 && ofDouble2.tryAdvance((DoubleConsumer) doubleBuilder); i2++) {
                    }
                }
                doubleBuilder.end();
                return doubleBuilder.mo498build();
            }

            /* renamed from: $default$newArray  reason: collision with other method in class */
            public static double[] m439$default$newArray(OfDouble ofDouble, int i) {
                return new double[i];
            }
        }
    }
}
