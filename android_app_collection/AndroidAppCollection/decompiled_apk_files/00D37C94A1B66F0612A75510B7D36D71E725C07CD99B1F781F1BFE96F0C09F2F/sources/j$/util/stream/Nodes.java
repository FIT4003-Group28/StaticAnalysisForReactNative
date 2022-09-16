package j$.util.stream;

import j$.util.DesugarArrays;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.BinaryOperator;
import j$.util.function.Consumer;
import j$.util.function.DoubleConsumer;
import j$.util.function.IntConsumer;
import j$.util.function.IntFunction;
import j$.util.function.LongConsumer;
import j$.util.function.LongFunction;
import j$.util.stream.Node;
import j$.util.stream.Sink;
import j$.util.stream.SpinedBuffer;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.concurrent.CountedCompleter;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class Nodes {
    private static final Node EMPTY_NODE = new EmptyNode.OfRef();
    private static final Node.OfInt EMPTY_INT_NODE = new EmptyNode.OfInt();
    private static final Node.OfLong EMPTY_LONG_NODE = new EmptyNode.OfLong();
    private static final Node.OfDouble EMPTY_DOUBLE_NODE = new EmptyNode.OfDouble();
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final long[] EMPTY_LONG_ARRAY = new long[0];
    private static final double[] EMPTY_DOUBLE_ARRAY = new double[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    public static IntFunction castingArray() {
        return Nodes$$ExternalSyntheticLambda0.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object[] lambda$castingArray$0(int i) {
        return new Object[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.util.stream.Nodes$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$util$stream$StreamShape;

        static {
            int[] iArr = new int[StreamShape.values().length];
            $SwitchMap$java$util$stream$StreamShape = iArr;
            try {
                iArr[StreamShape.REFERENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$util$stream$StreamShape[StreamShape.INT_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$util$stream$StreamShape[StreamShape.LONG_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$util$stream$StreamShape[StreamShape.DOUBLE_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Node emptyNode(StreamShape streamShape) {
        int i = AnonymousClass1.$SwitchMap$java$util$stream$StreamShape[streamShape.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return EMPTY_INT_NODE;
            }
            if (i == 3) {
                return EMPTY_LONG_NODE;
            }
            if (i == 4) {
                return EMPTY_DOUBLE_NODE;
            }
            String valueOf = String.valueOf(streamShape);
            StringBuilder sb = new StringBuilder(valueOf.length() + 14);
            sb.append("Unknown shape ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
        return EMPTY_NODE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Node conc(StreamShape streamShape, Node node, Node node2) {
        int i = AnonymousClass1.$SwitchMap$java$util$stream$StreamShape[streamShape.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new ConcNode.OfInt((Node.OfInt) node, (Node.OfInt) node2);
            }
            if (i == 3) {
                return new ConcNode.OfLong((Node.OfLong) node, (Node.OfLong) node2);
            }
            if (i == 4) {
                return new ConcNode.OfDouble((Node.OfDouble) node, (Node.OfDouble) node2);
            }
            String valueOf = String.valueOf(streamShape);
            StringBuilder sb = new StringBuilder(valueOf.length() + 14);
            sb.append("Unknown shape ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
        return new ConcNode(node, node2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Node node(Object[] objArr) {
        return new ArrayNode(objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Node.Builder builder(long j, IntFunction intFunction) {
        if (j >= 0 && j < 2147483639) {
            return new FixedNodeBuilder(j, intFunction);
        }
        return builder();
    }

    static Node.Builder builder() {
        return new SpinedNodeBuilder();
    }

    static Node.OfInt node(int[] iArr) {
        return new IntArrayNode(iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Node.Builder.OfInt intBuilder(long j) {
        if (j >= 0 && j < 2147483639) {
            return new IntFixedNodeBuilder(j);
        }
        return intBuilder();
    }

    static Node.Builder.OfInt intBuilder() {
        return new IntSpinedNodeBuilder();
    }

    static Node.OfLong node(long[] jArr) {
        return new LongArrayNode(jArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Node.Builder.OfLong longBuilder(long j) {
        if (j >= 0 && j < 2147483639) {
            return new LongFixedNodeBuilder(j);
        }
        return longBuilder();
    }

    static Node.Builder.OfLong longBuilder() {
        return new LongSpinedNodeBuilder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Node.Builder.OfDouble doubleBuilder(long j) {
        if (j >= 0 && j < 2147483639) {
            return new DoubleFixedNodeBuilder(j);
        }
        return doubleBuilder();
    }

    static Node.Builder.OfDouble doubleBuilder() {
        return new DoubleSpinedNodeBuilder();
    }

    public static Node collect(PipelineHelper pipelineHelper, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long exactOutputSizeIfKnown = pipelineHelper.exactOutputSizeIfKnown(spliterator);
        if (exactOutputSizeIfKnown < 0 || !spliterator.hasCharacteristics(16384)) {
            Node node = (Node) new CollectorTask.OfRef(pipelineHelper, intFunction, spliterator).invoke();
            return z ? flatten(node, intFunction) : node;
        } else if (exactOutputSizeIfKnown >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        } else {
            Object[] objArr = (Object[]) intFunction.apply((int) exactOutputSizeIfKnown);
            new SizedCollectorTask.OfRef(spliterator, pipelineHelper, objArr).invoke();
            return node(objArr);
        }
    }

    public static Node.OfInt collectInt(PipelineHelper pipelineHelper, Spliterator spliterator, boolean z) {
        long exactOutputSizeIfKnown = pipelineHelper.exactOutputSizeIfKnown(spliterator);
        if (exactOutputSizeIfKnown < 0 || !spliterator.hasCharacteristics(16384)) {
            Node.OfInt ofInt = (Node.OfInt) new CollectorTask.OfInt(pipelineHelper, spliterator).invoke();
            return z ? flattenInt(ofInt) : ofInt;
        } else if (exactOutputSizeIfKnown >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        } else {
            int[] iArr = new int[(int) exactOutputSizeIfKnown];
            new SizedCollectorTask.OfInt(spliterator, pipelineHelper, iArr).invoke();
            return node(iArr);
        }
    }

    public static Node.OfLong collectLong(PipelineHelper pipelineHelper, Spliterator spliterator, boolean z) {
        long exactOutputSizeIfKnown = pipelineHelper.exactOutputSizeIfKnown(spliterator);
        if (exactOutputSizeIfKnown < 0 || !spliterator.hasCharacteristics(16384)) {
            Node.OfLong ofLong = (Node.OfLong) new CollectorTask.OfLong(pipelineHelper, spliterator).invoke();
            return z ? flattenLong(ofLong) : ofLong;
        } else if (exactOutputSizeIfKnown >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        } else {
            long[] jArr = new long[(int) exactOutputSizeIfKnown];
            new SizedCollectorTask.OfLong(spliterator, pipelineHelper, jArr).invoke();
            return node(jArr);
        }
    }

    public static Node flatten(Node node, IntFunction intFunction) {
        if (node.getChildCount() > 0) {
            long count = node.count();
            if (count >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            Object[] objArr = (Object[]) intFunction.apply((int) count);
            new ToArrayTask.OfRef(node, objArr, 0).invoke();
            return node(objArr);
        }
        return node;
    }

    public static Node.OfInt flattenInt(Node.OfInt ofInt) {
        if (ofInt.getChildCount() > 0) {
            long count = ofInt.count();
            if (count >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            int[] iArr = new int[(int) count];
            new ToArrayTask.OfInt(ofInt, iArr, 0).invoke();
            return node(iArr);
        }
        return ofInt;
    }

    public static Node.OfLong flattenLong(Node.OfLong ofLong) {
        if (ofLong.getChildCount() > 0) {
            long count = ofLong.count();
            if (count >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            long[] jArr = new long[(int) count];
            new ToArrayTask.OfLong(ofLong, jArr, 0).invoke();
            return node(jArr);
        }
        return ofLong;
    }

    /* loaded from: classes5.dex */
    abstract class EmptyNode implements Node {
        public void copyInto(Object obj, int i) {
        }

        @Override // j$.util.stream.Node
        public long count() {
            return 0L;
        }

        public void forEach(Object obj) {
        }

        @Override // j$.util.stream.Node
        /* renamed from: getChild */
        public /* synthetic */ Node mo499getChild(int i) {
            return Node.CC.$default$getChild(this, i);
        }

        @Override // j$.util.stream.Node
        public /* synthetic */ int getChildCount() {
            return Node.CC.$default$getChildCount(this);
        }

        @Override // j$.util.stream.Node
        /* renamed from: truncate */
        public /* synthetic */ Node mo501truncate(long j, long j2, IntFunction intFunction) {
            return Node.CC.$default$truncate(this, j, j2, intFunction);
        }

        EmptyNode() {
        }

        @Override // j$.util.stream.Node
        public Object[] asArray(IntFunction intFunction) {
            return (Object[]) intFunction.apply(0);
        }

        /* loaded from: classes5.dex */
        class OfRef extends EmptyNode {
            @Override // j$.util.stream.Node
            public /* bridge */ /* synthetic */ void copyInto(Object[] objArr, int i) {
                super.copyInto((Object) objArr, i);
            }

            @Override // j$.util.stream.Node
            public /* bridge */ /* synthetic */ void forEach(Consumer consumer) {
                super.forEach((Object) consumer);
            }

            private OfRef() {
            }

            @Override // j$.util.stream.Node
            /* renamed from: spliterator */
            public Spliterator mo494spliterator() {
                return Spliterators.emptySpliterator();
            }
        }

        /* loaded from: classes5.dex */
        final class OfInt extends EmptyNode implements Node.OfInt {
            @Override // j$.util.stream.Node.OfInt
            public /* synthetic */ void copyInto(Integer[] numArr, int i) {
                Node.OfInt.CC.$default$copyInto((Node.OfInt) this, numArr, i);
            }

            @Override // j$.util.stream.Node
            public /* bridge */ /* synthetic */ void copyInto(Object[] objArr, int i) {
                copyInto((Integer[]) objArr, i);
            }

            @Override // j$.util.stream.Node
            public /* synthetic */ void forEach(Consumer consumer) {
                Node.OfInt.CC.$default$forEach(this, consumer);
            }

            @Override // j$.util.stream.Nodes.EmptyNode, j$.util.stream.Node
            /* renamed from: getChild */
            public /* synthetic */ Node.OfPrimitive mo499getChild(int i) {
                return Node.OfPrimitive.CC.$default$getChild((Node.OfPrimitive) this, i);
            }

            @Override // j$.util.stream.Nodes.EmptyNode, j$.util.stream.Node
            /* renamed from: getChild  reason: collision with other method in class */
            public /* bridge */ /* synthetic */ Node mo499getChild(int i) {
                Node mo499getChild;
                mo499getChild = mo499getChild(i);
                return mo499getChild;
            }

            @Override // j$.util.stream.Node.OfInt, j$.util.stream.Node.OfPrimitive
            /* renamed from: newArray */
            public /* synthetic */ int[] mo457newArray(int i) {
                return Node.OfInt.CC.m441$default$newArray((Node.OfInt) this, i);
            }

            @Override // j$.util.stream.Nodes.EmptyNode, j$.util.stream.Node
            /* renamed from: truncate */
            public /* synthetic */ Node.OfInt mo501truncate(long j, long j2, IntFunction intFunction) {
                return Node.OfInt.CC.$default$truncate((Node.OfInt) this, j, j2, intFunction);
            }

            @Override // j$.util.stream.Nodes.EmptyNode, j$.util.stream.Node
            /* renamed from: truncate  reason: collision with other method in class */
            public /* bridge */ /* synthetic */ Node mo501truncate(long j, long j2, IntFunction intFunction) {
                Node mo501truncate;
                mo501truncate = mo501truncate(j, j2, intFunction);
                return mo501truncate;
            }

            OfInt() {
            }

            @Override // j$.util.stream.Node
            /* renamed from: spliterator */
            public Spliterator.OfInt mo494spliterator() {
                return Spliterators.emptyIntSpliterator();
            }

            @Override // j$.util.stream.Node.OfPrimitive
            /* renamed from: asPrimitiveArray  reason: collision with other method in class */
            public int[] mo497asPrimitiveArray() {
                return Nodes.EMPTY_INT_ARRAY;
            }
        }

        /* loaded from: classes5.dex */
        final class OfLong extends EmptyNode implements Node.OfLong {
            @Override // j$.util.stream.Node.OfLong
            public /* synthetic */ void copyInto(Long[] lArr, int i) {
                Node.OfLong.CC.$default$copyInto((Node.OfLong) this, lArr, i);
            }

            @Override // j$.util.stream.Node
            public /* bridge */ /* synthetic */ void copyInto(Object[] objArr, int i) {
                copyInto((Long[]) objArr, i);
            }

            @Override // j$.util.stream.Node
            public /* synthetic */ void forEach(Consumer consumer) {
                Node.OfLong.CC.$default$forEach(this, consumer);
            }

            @Override // j$.util.stream.Nodes.EmptyNode, j$.util.stream.Node
            /* renamed from: getChild */
            public /* synthetic */ Node.OfPrimitive mo499getChild(int i) {
                return Node.OfPrimitive.CC.$default$getChild((Node.OfPrimitive) this, i);
            }

            @Override // j$.util.stream.Nodes.EmptyNode, j$.util.stream.Node
            /* renamed from: getChild  reason: collision with other method in class */
            public /* bridge */ /* synthetic */ Node mo499getChild(int i) {
                Node mo499getChild;
                mo499getChild = mo499getChild(i);
                return mo499getChild;
            }

            @Override // j$.util.stream.Node.OfLong, j$.util.stream.Node.OfPrimitive
            /* renamed from: newArray */
            public /* synthetic */ long[] mo457newArray(int i) {
                return Node.OfLong.CC.m443$default$newArray((Node.OfLong) this, i);
            }

            @Override // j$.util.stream.Nodes.EmptyNode, j$.util.stream.Node
            /* renamed from: truncate */
            public /* synthetic */ Node.OfLong mo501truncate(long j, long j2, IntFunction intFunction) {
                return Node.OfLong.CC.$default$truncate((Node.OfLong) this, j, j2, intFunction);
            }

            @Override // j$.util.stream.Nodes.EmptyNode, j$.util.stream.Node
            /* renamed from: truncate  reason: collision with other method in class */
            public /* bridge */ /* synthetic */ Node mo501truncate(long j, long j2, IntFunction intFunction) {
                Node mo501truncate;
                mo501truncate = mo501truncate(j, j2, intFunction);
                return mo501truncate;
            }

            OfLong() {
            }

            @Override // j$.util.stream.Node
            /* renamed from: spliterator */
            public Spliterator.OfLong mo494spliterator() {
                return Spliterators.emptyLongSpliterator();
            }

            @Override // j$.util.stream.Node.OfPrimitive
            /* renamed from: asPrimitiveArray  reason: collision with other method in class */
            public long[] mo497asPrimitiveArray() {
                return Nodes.EMPTY_LONG_ARRAY;
            }
        }

        /* loaded from: classes5.dex */
        final class OfDouble extends EmptyNode implements Node.OfDouble {
            @Override // j$.util.stream.Node.OfDouble
            public /* synthetic */ void copyInto(Double[] dArr, int i) {
                Node.OfDouble.CC.$default$copyInto((Node.OfDouble) this, dArr, i);
            }

            @Override // j$.util.stream.Node
            public /* bridge */ /* synthetic */ void copyInto(Object[] objArr, int i) {
                copyInto((Double[]) objArr, i);
            }

            @Override // j$.util.stream.Node
            public /* synthetic */ void forEach(Consumer consumer) {
                Node.OfDouble.CC.$default$forEach(this, consumer);
            }

            @Override // j$.util.stream.Nodes.EmptyNode, j$.util.stream.Node
            /* renamed from: getChild */
            public /* synthetic */ Node.OfPrimitive mo499getChild(int i) {
                return Node.OfPrimitive.CC.$default$getChild((Node.OfPrimitive) this, i);
            }

            @Override // j$.util.stream.Nodes.EmptyNode, j$.util.stream.Node
            /* renamed from: getChild  reason: collision with other method in class */
            public /* bridge */ /* synthetic */ Node mo499getChild(int i) {
                Node mo499getChild;
                mo499getChild = mo499getChild(i);
                return mo499getChild;
            }

            @Override // j$.util.stream.Node.OfDouble, j$.util.stream.Node.OfPrimitive
            /* renamed from: newArray */
            public /* synthetic */ double[] mo457newArray(int i) {
                return Node.OfDouble.CC.m439$default$newArray((Node.OfDouble) this, i);
            }

            @Override // j$.util.stream.Nodes.EmptyNode, j$.util.stream.Node
            /* renamed from: truncate */
            public /* synthetic */ Node.OfDouble mo501truncate(long j, long j2, IntFunction intFunction) {
                return Node.OfDouble.CC.$default$truncate((Node.OfDouble) this, j, j2, intFunction);
            }

            @Override // j$.util.stream.Nodes.EmptyNode, j$.util.stream.Node
            /* renamed from: truncate  reason: collision with other method in class */
            public /* bridge */ /* synthetic */ Node mo501truncate(long j, long j2, IntFunction intFunction) {
                Node mo501truncate;
                mo501truncate = mo501truncate(j, j2, intFunction);
                return mo501truncate;
            }

            OfDouble() {
            }

            @Override // j$.util.stream.Node
            /* renamed from: spliterator */
            public Spliterator.OfDouble mo494spliterator() {
                return Spliterators.emptyDoubleSpliterator();
            }

            @Override // j$.util.stream.Node.OfPrimitive
            /* renamed from: asPrimitiveArray  reason: collision with other method in class */
            public double[] mo497asPrimitiveArray() {
                return Nodes.EMPTY_DOUBLE_ARRAY;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class ArrayNode implements Node {
        final Object[] array;
        int curSize;

        @Override // j$.util.stream.Node
        /* renamed from: getChild */
        public /* synthetic */ Node mo499getChild(int i) {
            return Node.CC.$default$getChild(this, i);
        }

        @Override // j$.util.stream.Node
        public /* synthetic */ int getChildCount() {
            return Node.CC.$default$getChildCount(this);
        }

        @Override // j$.util.stream.Node
        /* renamed from: truncate */
        public /* synthetic */ Node mo501truncate(long j, long j2, IntFunction intFunction) {
            return Node.CC.$default$truncate(this, j, j2, intFunction);
        }

        ArrayNode(long j, IntFunction intFunction) {
            if (j >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            this.array = (Object[]) intFunction.apply((int) j);
            this.curSize = 0;
        }

        ArrayNode(Object[] objArr) {
            this.array = objArr;
            this.curSize = objArr.length;
        }

        @Override // j$.util.stream.Node
        /* renamed from: spliterator */
        public Spliterator mo494spliterator() {
            return DesugarArrays.spliterator(this.array, 0, this.curSize);
        }

        @Override // j$.util.stream.Node
        public void copyInto(Object[] objArr, int i) {
            System.arraycopy(this.array, 0, objArr, i, this.curSize);
        }

        @Override // j$.util.stream.Node
        public Object[] asArray(IntFunction intFunction) {
            Object[] objArr = this.array;
            if (objArr.length == this.curSize) {
                return objArr;
            }
            throw new IllegalStateException();
        }

        @Override // j$.util.stream.Node
        public long count() {
            return this.curSize;
        }

        @Override // j$.util.stream.Node
        public void forEach(Consumer consumer) {
            for (int i = 0; i < this.curSize; i++) {
                consumer.accept(this.array[i]);
            }
        }

        public String toString() {
            return String.format("ArrayNode[%d][%s]", Integer.valueOf(this.array.length - this.curSize), Arrays.toString(this.array));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public abstract class AbstractConcNode implements Node {
        protected final Node left;
        protected final Node right;
        private final long size;

        @Override // j$.util.stream.Node
        public int getChildCount() {
            return 2;
        }

        public /* synthetic */ StreamShape getShape() {
            StreamShape streamShape;
            streamShape = StreamShape.REFERENCE;
            return streamShape;
        }

        AbstractConcNode(Node node, Node node2) {
            this.left = node;
            this.right = node2;
            this.size = node.count() + node2.count();
        }

        @Override // j$.util.stream.Node
        /* renamed from: getChild */
        public Node mo499getChild(int i) {
            if (i == 0) {
                return this.left;
            }
            if (i == 1) {
                return this.right;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // j$.util.stream.Node
        public long count() {
            return this.size;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class ConcNode extends AbstractConcNode {
        /* JADX INFO: Access modifiers changed from: package-private */
        public ConcNode(Node node, Node node2) {
            super(node, node2);
        }

        @Override // j$.util.stream.Node
        /* renamed from: spliterator */
        public Spliterator mo494spliterator() {
            return new InternalNodeSpliterator.OfRef(this);
        }

        @Override // j$.util.stream.Node
        public void copyInto(Object[] objArr, int i) {
            objArr.getClass();
            this.left.copyInto(objArr, i);
            this.right.copyInto(objArr, i + ((int) this.left.count()));
        }

        @Override // j$.util.stream.Node
        public Object[] asArray(IntFunction intFunction) {
            long count = count();
            if (count >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            Object[] objArr = (Object[]) intFunction.apply((int) count);
            copyInto(objArr, 0);
            return objArr;
        }

        @Override // j$.util.stream.Node
        public void forEach(Consumer consumer) {
            this.left.forEach(consumer);
            this.right.forEach(consumer);
        }

        @Override // j$.util.stream.Node
        /* renamed from: truncate */
        public Node mo501truncate(long j, long j2, IntFunction intFunction) {
            if (j == 0 && j2 == count()) {
                return this;
            }
            long count = this.left.count();
            if (j >= count) {
                return this.right.mo501truncate(j - count, j2 - count, intFunction);
            }
            if (j2 <= count) {
                return this.left.mo501truncate(j, j2, intFunction);
            }
            return Nodes.conc(getShape(), this.left.mo501truncate(j, count, intFunction), this.right.mo501truncate(0L, j2 - count, intFunction));
        }

        public String toString() {
            return count() < 32 ? String.format("ConcNode[%s.%s]", this.left, this.right) : String.format("ConcNode[size=%d]", Long.valueOf(count()));
        }

        /* loaded from: classes5.dex */
        abstract class OfPrimitive extends AbstractConcNode implements Node.OfPrimitive {
            @Override // j$.util.stream.Node
            public /* synthetic */ Object[] asArray(IntFunction intFunction) {
                return Node.OfPrimitive.CC.$default$asArray(this, intFunction);
            }

            @Override // j$.util.stream.Nodes.AbstractConcNode, j$.util.stream.Node
            /* renamed from: getChild */
            public /* bridge */ /* synthetic */ Node.OfPrimitive mo499getChild(int i) {
                return (Node.OfPrimitive) super.mo499getChild(i);
            }

            OfPrimitive(Node.OfPrimitive ofPrimitive, Node.OfPrimitive ofPrimitive2) {
                super(ofPrimitive, ofPrimitive2);
            }

            @Override // j$.util.stream.Node.OfPrimitive
            public void forEach(Object obj) {
                ((Node.OfPrimitive) this.left).forEach(obj);
                ((Node.OfPrimitive) this.right).forEach(obj);
            }

            @Override // j$.util.stream.Node.OfPrimitive
            public void copyInto(Object obj, int i) {
                ((Node.OfPrimitive) this.left).copyInto(obj, i);
                ((Node.OfPrimitive) this.right).copyInto(obj, i + ((int) ((Node.OfPrimitive) this.left).count()));
            }

            @Override // j$.util.stream.Node.OfPrimitive
            /* renamed from: asPrimitiveArray */
            public Object mo497asPrimitiveArray() {
                long count = count();
                if (count >= 2147483639) {
                    throw new IllegalArgumentException("Stream size exceeds max array size");
                }
                Object mo457newArray = mo457newArray((int) count);
                copyInto(mo457newArray, 0);
                return mo457newArray;
            }

            public String toString() {
                return count() < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.left, this.right) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(count()));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public final class OfInt extends OfPrimitive implements Node.OfInt {
            @Override // j$.util.stream.Node.OfInt
            public /* synthetic */ void copyInto(Integer[] numArr, int i) {
                Node.OfInt.CC.$default$copyInto((Node.OfInt) this, numArr, i);
            }

            @Override // j$.util.stream.Node
            public /* bridge */ /* synthetic */ void copyInto(Object[] objArr, int i) {
                copyInto((Integer[]) objArr, i);
            }

            @Override // j$.util.stream.Node
            public /* synthetic */ void forEach(Consumer consumer) {
                Node.OfInt.CC.$default$forEach(this, consumer);
            }

            @Override // j$.util.stream.Node.OfPrimitive
            /* renamed from: newArray */
            public /* bridge */ /* synthetic */ Object mo457newArray(int i) {
                Object mo457newArray;
                mo457newArray = mo457newArray(i);
                return mo457newArray;
            }

            @Override // j$.util.stream.Node.OfPrimitive
            /* renamed from: newArray  reason: collision with other method in class */
            public /* synthetic */ int[] mo457newArray(int i) {
                return Node.OfInt.CC.m441$default$newArray((Node.OfInt) this, i);
            }

            @Override // j$.util.stream.Node
            /* renamed from: truncate */
            public /* synthetic */ Node.OfInt mo501truncate(long j, long j2, IntFunction intFunction) {
                return Node.OfInt.CC.$default$truncate((Node.OfInt) this, j, j2, intFunction);
            }

            @Override // j$.util.stream.Node
            /* renamed from: truncate  reason: collision with other method in class */
            public /* bridge */ /* synthetic */ Node mo501truncate(long j, long j2, IntFunction intFunction) {
                Node mo501truncate;
                mo501truncate = mo501truncate(j, j2, intFunction);
                return mo501truncate;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public OfInt(Node.OfInt ofInt, Node.OfInt ofInt2) {
                super(ofInt, ofInt2);
            }

            @Override // j$.util.stream.Node
            /* renamed from: spliterator */
            public Spliterator.OfInt mo494spliterator() {
                return new InternalNodeSpliterator.OfInt(this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public final class OfLong extends OfPrimitive implements Node.OfLong {
            @Override // j$.util.stream.Node.OfLong
            public /* synthetic */ void copyInto(Long[] lArr, int i) {
                Node.OfLong.CC.$default$copyInto((Node.OfLong) this, lArr, i);
            }

            @Override // j$.util.stream.Node
            public /* bridge */ /* synthetic */ void copyInto(Object[] objArr, int i) {
                copyInto((Long[]) objArr, i);
            }

            @Override // j$.util.stream.Node
            public /* synthetic */ void forEach(Consumer consumer) {
                Node.OfLong.CC.$default$forEach(this, consumer);
            }

            @Override // j$.util.stream.Node.OfPrimitive
            /* renamed from: newArray */
            public /* bridge */ /* synthetic */ Object mo457newArray(int i) {
                Object mo457newArray;
                mo457newArray = mo457newArray(i);
                return mo457newArray;
            }

            @Override // j$.util.stream.Node.OfPrimitive
            /* renamed from: newArray  reason: collision with other method in class */
            public /* synthetic */ long[] mo457newArray(int i) {
                return Node.OfLong.CC.m443$default$newArray((Node.OfLong) this, i);
            }

            @Override // j$.util.stream.Node
            /* renamed from: truncate */
            public /* synthetic */ Node.OfLong mo501truncate(long j, long j2, IntFunction intFunction) {
                return Node.OfLong.CC.$default$truncate((Node.OfLong) this, j, j2, intFunction);
            }

            @Override // j$.util.stream.Node
            /* renamed from: truncate  reason: collision with other method in class */
            public /* bridge */ /* synthetic */ Node mo501truncate(long j, long j2, IntFunction intFunction) {
                Node mo501truncate;
                mo501truncate = mo501truncate(j, j2, intFunction);
                return mo501truncate;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public OfLong(Node.OfLong ofLong, Node.OfLong ofLong2) {
                super(ofLong, ofLong2);
            }

            @Override // j$.util.stream.Node
            /* renamed from: spliterator */
            public Spliterator.OfLong mo494spliterator() {
                return new InternalNodeSpliterator.OfLong(this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public final class OfDouble extends OfPrimitive implements Node.OfDouble {
            @Override // j$.util.stream.Node.OfDouble
            public /* synthetic */ void copyInto(Double[] dArr, int i) {
                Node.OfDouble.CC.$default$copyInto((Node.OfDouble) this, dArr, i);
            }

            @Override // j$.util.stream.Node
            public /* bridge */ /* synthetic */ void copyInto(Object[] objArr, int i) {
                copyInto((Double[]) objArr, i);
            }

            @Override // j$.util.stream.Node
            public /* synthetic */ void forEach(Consumer consumer) {
                Node.OfDouble.CC.$default$forEach(this, consumer);
            }

            @Override // j$.util.stream.Node.OfPrimitive
            /* renamed from: newArray */
            public /* bridge */ /* synthetic */ Object mo457newArray(int i) {
                Object mo457newArray;
                mo457newArray = mo457newArray(i);
                return mo457newArray;
            }

            @Override // j$.util.stream.Node.OfPrimitive
            /* renamed from: newArray  reason: collision with other method in class */
            public /* synthetic */ double[] mo457newArray(int i) {
                return Node.OfDouble.CC.m439$default$newArray((Node.OfDouble) this, i);
            }

            @Override // j$.util.stream.Node
            /* renamed from: truncate */
            public /* synthetic */ Node.OfDouble mo501truncate(long j, long j2, IntFunction intFunction) {
                return Node.OfDouble.CC.$default$truncate((Node.OfDouble) this, j, j2, intFunction);
            }

            @Override // j$.util.stream.Node
            /* renamed from: truncate  reason: collision with other method in class */
            public /* bridge */ /* synthetic */ Node mo501truncate(long j, long j2, IntFunction intFunction) {
                Node mo501truncate;
                mo501truncate = mo501truncate(j, j2, intFunction);
                return mo501truncate;
            }

            OfDouble(Node.OfDouble ofDouble, Node.OfDouble ofDouble2) {
                super(ofDouble, ofDouble2);
            }

            @Override // j$.util.stream.Node
            /* renamed from: spliterator */
            public Spliterator.OfDouble mo494spliterator() {
                return new InternalNodeSpliterator.OfDouble(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public abstract class InternalNodeSpliterator implements Spliterator {
        int curChildIndex;
        Node curNode;
        Spliterator lastNodeSpliterator;
        Spliterator tryAdvanceSpliterator;
        Deque tryAdvanceStack;

        @Override // j$.util.Spliterator
        public final int characteristics() {
            return 64;
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ Comparator getComparator() {
            return Spliterator.CC.$default$getComparator(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i) {
            return Spliterator.CC.$default$hasCharacteristics(this, i);
        }

        InternalNodeSpliterator(Node node) {
            this.curNode = node;
        }

        protected final Deque initStack() {
            ArrayDeque arrayDeque = new ArrayDeque(8);
            int childCount = this.curNode.getChildCount();
            while (true) {
                childCount--;
                if (childCount >= this.curChildIndex) {
                    arrayDeque.addFirst(this.curNode.mo499getChild(childCount));
                } else {
                    return arrayDeque;
                }
            }
        }

        protected final Node findNextLeafNode(Deque deque) {
            while (true) {
                Node node = (Node) deque.pollFirst();
                if (node != null) {
                    if (node.getChildCount() == 0) {
                        if (node.count() > 0) {
                            return node;
                        }
                    } else {
                        for (int childCount = node.getChildCount() - 1; childCount >= 0; childCount--) {
                            deque.addFirst(node.mo499getChild(childCount));
                        }
                    }
                } else {
                    return null;
                }
            }
        }

        protected final boolean initTryAdvance() {
            if (this.curNode == null) {
                return false;
            }
            if (this.tryAdvanceSpliterator != null) {
                return true;
            }
            Spliterator spliterator = this.lastNodeSpliterator;
            if (spliterator == null) {
                Deque initStack = initStack();
                this.tryAdvanceStack = initStack;
                Node findNextLeafNode = findNextLeafNode(initStack);
                if (findNextLeafNode != null) {
                    this.tryAdvanceSpliterator = findNextLeafNode.mo494spliterator();
                    return true;
                }
                this.curNode = null;
                return false;
            }
            this.tryAdvanceSpliterator = spliterator;
            return true;
        }

        @Override // j$.util.Spliterator
        /* renamed from: trySplit */
        public final Spliterator mo545trySplit() {
            Node node = this.curNode;
            if (node == null || this.tryAdvanceSpliterator != null) {
                return null;
            }
            Spliterator spliterator = this.lastNodeSpliterator;
            if (spliterator != null) {
                return spliterator.mo545trySplit();
            }
            if (this.curChildIndex < node.getChildCount() - 1) {
                Node node2 = this.curNode;
                int i = this.curChildIndex;
                this.curChildIndex = i + 1;
                return node2.mo499getChild(i).mo494spliterator();
            }
            Node mo499getChild = this.curNode.mo499getChild(this.curChildIndex);
            this.curNode = mo499getChild;
            if (mo499getChild.getChildCount() == 0) {
                Spliterator mo494spliterator = this.curNode.mo494spliterator();
                this.lastNodeSpliterator = mo494spliterator;
                return mo494spliterator.mo545trySplit();
            }
            this.curChildIndex = 0;
            Node node3 = this.curNode;
            this.curChildIndex = 1;
            return node3.mo499getChild(0).mo494spliterator();
        }

        @Override // j$.util.Spliterator
        public final long estimateSize() {
            long j = 0;
            if (this.curNode == null) {
                return 0L;
            }
            Spliterator spliterator = this.lastNodeSpliterator;
            if (spliterator != null) {
                return spliterator.estimateSize();
            }
            for (int i = this.curChildIndex; i < this.curNode.getChildCount(); i++) {
                j += this.curNode.mo499getChild(i).count();
            }
            return j;
        }

        /* loaded from: classes5.dex */
        final class OfRef extends InternalNodeSpliterator {
            OfRef(Node node) {
                super(node);
            }

            @Override // j$.util.Spliterator
            public boolean tryAdvance(Consumer consumer) {
                Node findNextLeafNode;
                if (!initTryAdvance()) {
                    return false;
                }
                boolean tryAdvance = this.tryAdvanceSpliterator.tryAdvance(consumer);
                if (!tryAdvance) {
                    if (this.lastNodeSpliterator == null && (findNextLeafNode = findNextLeafNode(this.tryAdvanceStack)) != null) {
                        Spliterator mo494spliterator = findNextLeafNode.mo494spliterator();
                        this.tryAdvanceSpliterator = mo494spliterator;
                        return mo494spliterator.tryAdvance(consumer);
                    }
                    this.curNode = null;
                }
                return tryAdvance;
            }

            @Override // j$.util.Spliterator
            public void forEachRemaining(Consumer consumer) {
                if (this.curNode == null) {
                    return;
                }
                if (this.tryAdvanceSpliterator == null) {
                    Spliterator spliterator = this.lastNodeSpliterator;
                    if (spliterator == null) {
                        Deque initStack = initStack();
                        while (true) {
                            Node findNextLeafNode = findNextLeafNode(initStack);
                            if (findNextLeafNode != null) {
                                findNextLeafNode.forEach(consumer);
                            } else {
                                this.curNode = null;
                                return;
                            }
                        }
                    } else {
                        spliterator.forEachRemaining(consumer);
                    }
                } else {
                    do {
                    } while (tryAdvance(consumer));
                }
            }
        }

        /* loaded from: classes5.dex */
        abstract class OfPrimitive extends InternalNodeSpliterator implements Spliterator.OfPrimitive {
            OfPrimitive(Node.OfPrimitive ofPrimitive) {
                super(ofPrimitive);
            }

            @Override // j$.util.Spliterator.OfPrimitive
            public boolean tryAdvance(Object obj) {
                Node.OfPrimitive ofPrimitive;
                if (!initTryAdvance()) {
                    return false;
                }
                boolean tryAdvance = ((Spliterator.OfPrimitive) this.tryAdvanceSpliterator).tryAdvance(obj);
                if (!tryAdvance) {
                    if (this.lastNodeSpliterator == null && (ofPrimitive = (Node.OfPrimitive) findNextLeafNode(this.tryAdvanceStack)) != null) {
                        Spliterator.OfPrimitive mo494spliterator = ofPrimitive.mo494spliterator();
                        this.tryAdvanceSpliterator = mo494spliterator;
                        return mo494spliterator.tryAdvance(obj);
                    }
                    this.curNode = null;
                }
                return tryAdvance;
            }

            @Override // j$.util.Spliterator.OfPrimitive
            public void forEachRemaining(Object obj) {
                if (this.curNode == null) {
                    return;
                }
                if (this.tryAdvanceSpliterator == null) {
                    Spliterator spliterator = this.lastNodeSpliterator;
                    if (spliterator == null) {
                        Deque initStack = initStack();
                        while (true) {
                            Node.OfPrimitive ofPrimitive = (Node.OfPrimitive) findNextLeafNode(initStack);
                            if (ofPrimitive != null) {
                                ofPrimitive.forEach(obj);
                            } else {
                                this.curNode = null;
                                return;
                            }
                        }
                    } else {
                        ((Spliterator.OfPrimitive) spliterator).forEachRemaining(obj);
                    }
                } else {
                    do {
                    } while (tryAdvance(obj));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public final class OfInt extends OfPrimitive implements Spliterator.OfInt {
            @Override // j$.util.Spliterator
            public /* synthetic */ void forEachRemaining(Consumer consumer) {
                Spliterator.OfInt.CC.$default$forEachRemaining(this, consumer);
            }

            @Override // j$.util.Spliterator
            public /* synthetic */ boolean tryAdvance(Consumer consumer) {
                return Spliterator.OfInt.CC.$default$tryAdvance(this, consumer);
            }

            @Override // j$.util.Spliterator.OfInt
            public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
                super.forEachRemaining((Object) intConsumer);
            }

            @Override // j$.util.Spliterator.OfInt
            public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
                return super.tryAdvance((Object) intConsumer);
            }

            OfInt(Node.OfInt ofInt) {
                super(ofInt);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public final class OfLong extends OfPrimitive implements Spliterator.OfLong {
            @Override // j$.util.Spliterator
            public /* synthetic */ void forEachRemaining(Consumer consumer) {
                Spliterator.OfLong.CC.$default$forEachRemaining(this, consumer);
            }

            @Override // j$.util.Spliterator
            public /* synthetic */ boolean tryAdvance(Consumer consumer) {
                return Spliterator.OfLong.CC.$default$tryAdvance(this, consumer);
            }

            @Override // j$.util.Spliterator.OfLong
            public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
                super.forEachRemaining((Object) longConsumer);
            }

            @Override // j$.util.Spliterator.OfLong
            public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
                return super.tryAdvance((Object) longConsumer);
            }

            OfLong(Node.OfLong ofLong) {
                super(ofLong);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public final class OfDouble extends OfPrimitive implements Spliterator.OfDouble {
            @Override // j$.util.Spliterator
            public /* synthetic */ void forEachRemaining(Consumer consumer) {
                Spliterator.OfDouble.CC.$default$forEachRemaining(this, consumer);
            }

            @Override // j$.util.Spliterator
            public /* synthetic */ boolean tryAdvance(Consumer consumer) {
                return Spliterator.OfDouble.CC.$default$tryAdvance(this, consumer);
            }

            @Override // j$.util.Spliterator.OfDouble
            public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
                super.forEachRemaining((Object) doubleConsumer);
            }

            @Override // j$.util.Spliterator.OfDouble
            public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
                return super.tryAdvance((Object) doubleConsumer);
            }

            OfDouble(Node.OfDouble ofDouble) {
                super(ofDouble);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class FixedNodeBuilder extends ArrayNode implements Node.Builder {
        static final /* synthetic */ boolean $assertionsDisabled = true;

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
        public /* synthetic */ boolean cancellationRequested() {
            return Sink.CC.$default$cancellationRequested(this);
        }

        FixedNodeBuilder(long j, IntFunction intFunction) {
            super(j, intFunction);
            if ($assertionsDisabled || j < 2147483639) {
                return;
            }
            throw new AssertionError();
        }

        @Override // j$.util.stream.Node.Builder
        /* renamed from: build */
        public Node mo498build() {
            if (this.curSize >= this.array.length) {
                return this;
            }
            throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.curSize), Integer.valueOf(this.array.length)));
        }

        @Override // j$.util.stream.Sink
        public void begin(long j) {
            if (j != this.array.length) {
                throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(this.array.length)));
            }
            this.curSize = 0;
        }

        @Override // j$.util.function.Consumer
        public void accept(Object obj) {
            int i = this.curSize;
            Object[] objArr = this.array;
            if (i < objArr.length) {
                this.curSize = i + 1;
                objArr[i] = obj;
                return;
            }
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(this.array.length)));
        }

        @Override // j$.util.stream.Sink
        public void end() {
            if (this.curSize >= this.array.length) {
                return;
            }
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.curSize), Integer.valueOf(this.array.length)));
        }

        @Override // j$.util.stream.Nodes.ArrayNode
        public String toString() {
            return String.format("FixedNodeBuilder[%d][%s]", Integer.valueOf(this.array.length - this.curSize), Arrays.toString(this.array));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class SpinedNodeBuilder extends SpinedBuffer implements Node, Node.Builder {
        static final /* synthetic */ boolean $assertionsDisabled = true;
        private boolean building = false;

        @Override // j$.util.stream.Sink
        public /* synthetic */ void accept(int i) {
            Sink.CC.$default$accept((Sink) this, i);
        }

        @Override // j$.util.stream.Sink
        public /* synthetic */ void accept(long j) {
            Sink.CC.$default$accept(this, j);
        }

        @Override // j$.util.stream.Sink
        public /* synthetic */ boolean cancellationRequested() {
            return Sink.CC.$default$cancellationRequested(this);
        }

        @Override // j$.util.stream.Node
        /* renamed from: getChild */
        public /* synthetic */ Node mo499getChild(int i) {
            return Node.CC.$default$getChild(this, i);
        }

        @Override // j$.util.stream.Node
        public /* synthetic */ int getChildCount() {
            return Node.CC.$default$getChildCount(this);
        }

        @Override // j$.util.stream.Node
        /* renamed from: truncate */
        public /* synthetic */ Node mo501truncate(long j, long j2, IntFunction intFunction) {
            return Node.CC.$default$truncate(this, j, j2, intFunction);
        }

        SpinedNodeBuilder() {
        }

        @Override // j$.util.stream.SpinedBuffer, java.lang.Iterable, j$.lang.Iterable
        /* renamed from: spliterator */
        public Spliterator mo536spliterator() {
            if ($assertionsDisabled || !this.building) {
                return super.mo536spliterator();
            }
            throw new AssertionError("during building");
        }

        @Override // j$.util.stream.SpinedBuffer, j$.lang.Iterable
        public void forEach(Consumer consumer) {
            if ($assertionsDisabled || !this.building) {
                super.forEach(consumer);
                return;
            }
            throw new AssertionError("during building");
        }

        @Override // j$.util.stream.Sink
        public void begin(long j) {
            if ($assertionsDisabled || !this.building) {
                this.building = $assertionsDisabled;
                clear();
                ensureCapacity(j);
                return;
            }
            throw new AssertionError("was already building");
        }

        @Override // j$.util.stream.SpinedBuffer, j$.util.function.Consumer
        public void accept(Object obj) {
            if ($assertionsDisabled || this.building) {
                super.accept(obj);
                return;
            }
            throw new AssertionError("not building");
        }

        @Override // j$.util.stream.Sink
        public void end() {
            if ($assertionsDisabled || this.building) {
                this.building = false;
                return;
            }
            throw new AssertionError("was not building");
        }

        @Override // j$.util.stream.SpinedBuffer, j$.util.stream.Node
        public void copyInto(Object[] objArr, int i) {
            if ($assertionsDisabled || !this.building) {
                super.copyInto(objArr, i);
                return;
            }
            throw new AssertionError("during building");
        }

        @Override // j$.util.stream.SpinedBuffer, j$.util.stream.Node
        public Object[] asArray(IntFunction intFunction) {
            if ($assertionsDisabled || !this.building) {
                return super.asArray(intFunction);
            }
            throw new AssertionError("during building");
        }

        @Override // j$.util.stream.Node.Builder
        /* renamed from: build */
        public Node mo498build() {
            if ($assertionsDisabled || !this.building) {
                return this;
            }
            throw new AssertionError("during building");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class IntArrayNode implements Node.OfInt {
        final int[] array;
        int curSize;

        @Override // j$.util.stream.Node
        public /* synthetic */ Object[] asArray(IntFunction intFunction) {
            return Node.OfPrimitive.CC.$default$asArray(this, intFunction);
        }

        @Override // j$.util.stream.Node.OfInt
        public /* synthetic */ void copyInto(Integer[] numArr, int i) {
            Node.OfInt.CC.$default$copyInto((Node.OfInt) this, numArr, i);
        }

        @Override // j$.util.stream.Node
        public /* bridge */ /* synthetic */ void copyInto(Object[] objArr, int i) {
            copyInto((Integer[]) objArr, i);
        }

        @Override // j$.util.stream.Node
        public /* synthetic */ void forEach(Consumer consumer) {
            Node.OfInt.CC.$default$forEach(this, consumer);
        }

        @Override // j$.util.stream.Node.OfPrimitive, j$.util.stream.Node
        /* renamed from: getChild */
        public /* synthetic */ Node.OfPrimitive mo499getChild(int i) {
            return Node.OfPrimitive.CC.$default$getChild((Node.OfPrimitive) this, i);
        }

        @Override // j$.util.stream.Node.OfPrimitive, j$.util.stream.Node
        /* renamed from: getChild  reason: collision with other method in class */
        public /* bridge */ /* synthetic */ Node mo499getChild(int i) {
            Node mo499getChild;
            mo499getChild = mo499getChild(i);
            return mo499getChild;
        }

        @Override // j$.util.stream.Node
        public /* synthetic */ int getChildCount() {
            return Node.CC.$default$getChildCount(this);
        }

        @Override // j$.util.stream.Node.OfInt, j$.util.stream.Node.OfPrimitive
        /* renamed from: newArray */
        public /* synthetic */ int[] mo457newArray(int i) {
            return Node.OfInt.CC.m441$default$newArray((Node.OfInt) this, i);
        }

        @Override // j$.util.stream.Node.OfInt, j$.util.stream.Node
        /* renamed from: truncate */
        public /* synthetic */ Node.OfInt mo501truncate(long j, long j2, IntFunction intFunction) {
            return Node.OfInt.CC.$default$truncate((Node.OfInt) this, j, j2, intFunction);
        }

        @Override // j$.util.stream.Node.OfInt, j$.util.stream.Node
        /* renamed from: truncate  reason: collision with other method in class */
        public /* bridge */ /* synthetic */ Node mo501truncate(long j, long j2, IntFunction intFunction) {
            Node mo501truncate;
            mo501truncate = mo501truncate(j, j2, intFunction);
            return mo501truncate;
        }

        IntArrayNode(long j) {
            if (j >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            this.array = new int[(int) j];
            this.curSize = 0;
        }

        IntArrayNode(int[] iArr) {
            this.array = iArr;
            this.curSize = iArr.length;
        }

        @Override // j$.util.stream.Node.OfPrimitive, j$.util.stream.Node
        /* renamed from: spliterator */
        public Spliterator.OfInt mo494spliterator() {
            return DesugarArrays.spliterator(this.array, 0, this.curSize);
        }

        @Override // j$.util.stream.Node.OfPrimitive
        /* renamed from: asPrimitiveArray  reason: collision with other method in class */
        public int[] mo497asPrimitiveArray() {
            int[] iArr = this.array;
            int length = iArr.length;
            int i = this.curSize;
            return length == i ? iArr : Arrays.copyOf(iArr, i);
        }

        @Override // j$.util.stream.Node.OfPrimitive
        public void copyInto(int[] iArr, int i) {
            System.arraycopy(this.array, 0, iArr, i, this.curSize);
        }

        @Override // j$.util.stream.Node
        public long count() {
            return this.curSize;
        }

        @Override // j$.util.stream.Node.OfPrimitive
        public void forEach(IntConsumer intConsumer) {
            for (int i = 0; i < this.curSize; i++) {
                intConsumer.accept(this.array[i]);
            }
        }

        public String toString() {
            return String.format("IntArrayNode[%d][%s]", Integer.valueOf(this.array.length - this.curSize), Arrays.toString(this.array));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class LongArrayNode implements Node.OfLong {
        final long[] array;
        int curSize;

        @Override // j$.util.stream.Node
        public /* synthetic */ Object[] asArray(IntFunction intFunction) {
            return Node.OfPrimitive.CC.$default$asArray(this, intFunction);
        }

        @Override // j$.util.stream.Node.OfLong
        public /* synthetic */ void copyInto(Long[] lArr, int i) {
            Node.OfLong.CC.$default$copyInto((Node.OfLong) this, lArr, i);
        }

        @Override // j$.util.stream.Node
        public /* bridge */ /* synthetic */ void copyInto(Object[] objArr, int i) {
            copyInto((Long[]) objArr, i);
        }

        @Override // j$.util.stream.Node
        public /* synthetic */ void forEach(Consumer consumer) {
            Node.OfLong.CC.$default$forEach(this, consumer);
        }

        @Override // j$.util.stream.Node.OfPrimitive, j$.util.stream.Node
        /* renamed from: getChild */
        public /* synthetic */ Node.OfPrimitive mo499getChild(int i) {
            return Node.OfPrimitive.CC.$default$getChild((Node.OfPrimitive) this, i);
        }

        @Override // j$.util.stream.Node.OfPrimitive, j$.util.stream.Node
        /* renamed from: getChild  reason: collision with other method in class */
        public /* bridge */ /* synthetic */ Node mo499getChild(int i) {
            Node mo499getChild;
            mo499getChild = mo499getChild(i);
            return mo499getChild;
        }

        @Override // j$.util.stream.Node
        public /* synthetic */ int getChildCount() {
            return Node.CC.$default$getChildCount(this);
        }

        @Override // j$.util.stream.Node.OfLong, j$.util.stream.Node.OfPrimitive
        /* renamed from: newArray */
        public /* synthetic */ long[] mo457newArray(int i) {
            return Node.OfLong.CC.m443$default$newArray((Node.OfLong) this, i);
        }

        @Override // j$.util.stream.Node.OfLong, j$.util.stream.Node
        /* renamed from: truncate */
        public /* synthetic */ Node.OfLong mo501truncate(long j, long j2, IntFunction intFunction) {
            return Node.OfLong.CC.$default$truncate((Node.OfLong) this, j, j2, intFunction);
        }

        @Override // j$.util.stream.Node.OfLong, j$.util.stream.Node
        /* renamed from: truncate  reason: collision with other method in class */
        public /* bridge */ /* synthetic */ Node mo501truncate(long j, long j2, IntFunction intFunction) {
            Node mo501truncate;
            mo501truncate = mo501truncate(j, j2, intFunction);
            return mo501truncate;
        }

        LongArrayNode(long j) {
            if (j >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            this.array = new long[(int) j];
            this.curSize = 0;
        }

        LongArrayNode(long[] jArr) {
            this.array = jArr;
            this.curSize = jArr.length;
        }

        @Override // j$.util.stream.Node.OfPrimitive, j$.util.stream.Node
        /* renamed from: spliterator */
        public Spliterator.OfLong mo494spliterator() {
            return DesugarArrays.spliterator(this.array, 0, this.curSize);
        }

        @Override // j$.util.stream.Node.OfPrimitive
        /* renamed from: asPrimitiveArray  reason: collision with other method in class */
        public long[] mo497asPrimitiveArray() {
            long[] jArr = this.array;
            int length = jArr.length;
            int i = this.curSize;
            return length == i ? jArr : Arrays.copyOf(jArr, i);
        }

        @Override // j$.util.stream.Node.OfPrimitive
        public void copyInto(long[] jArr, int i) {
            System.arraycopy(this.array, 0, jArr, i, this.curSize);
        }

        @Override // j$.util.stream.Node
        public long count() {
            return this.curSize;
        }

        @Override // j$.util.stream.Node.OfPrimitive
        public void forEach(LongConsumer longConsumer) {
            for (int i = 0; i < this.curSize; i++) {
                longConsumer.accept(this.array[i]);
            }
        }

        public String toString() {
            return String.format("LongArrayNode[%d][%s]", Integer.valueOf(this.array.length - this.curSize), Arrays.toString(this.array));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public abstract class DoubleArrayNode implements Node.OfDouble {
        final double[] array;
        int curSize;

        @Override // j$.util.stream.Node
        public /* synthetic */ Object[] asArray(IntFunction intFunction) {
            return Node.OfPrimitive.CC.$default$asArray(this, intFunction);
        }

        @Override // j$.util.stream.Node.OfDouble
        public /* synthetic */ void copyInto(Double[] dArr, int i) {
            Node.OfDouble.CC.$default$copyInto((Node.OfDouble) this, dArr, i);
        }

        @Override // j$.util.stream.Node
        public /* bridge */ /* synthetic */ void copyInto(Object[] objArr, int i) {
            copyInto((Double[]) objArr, i);
        }

        @Override // j$.util.stream.Node
        public /* synthetic */ void forEach(Consumer consumer) {
            Node.OfDouble.CC.$default$forEach(this, consumer);
        }

        @Override // j$.util.stream.Node.OfPrimitive, j$.util.stream.Node
        /* renamed from: getChild */
        public /* synthetic */ Node.OfPrimitive mo499getChild(int i) {
            return Node.OfPrimitive.CC.$default$getChild((Node.OfPrimitive) this, i);
        }

        @Override // j$.util.stream.Node.OfPrimitive, j$.util.stream.Node
        /* renamed from: getChild  reason: collision with other method in class */
        public /* bridge */ /* synthetic */ Node mo499getChild(int i) {
            Node mo499getChild;
            mo499getChild = mo499getChild(i);
            return mo499getChild;
        }

        @Override // j$.util.stream.Node
        public /* synthetic */ int getChildCount() {
            return Node.CC.$default$getChildCount(this);
        }

        @Override // j$.util.stream.Node.OfDouble, j$.util.stream.Node.OfPrimitive
        /* renamed from: newArray */
        public /* synthetic */ double[] mo457newArray(int i) {
            return Node.OfDouble.CC.m439$default$newArray((Node.OfDouble) this, i);
        }

        @Override // j$.util.stream.Node.OfDouble, j$.util.stream.Node
        /* renamed from: truncate */
        public /* synthetic */ Node.OfDouble mo501truncate(long j, long j2, IntFunction intFunction) {
            return Node.OfDouble.CC.$default$truncate((Node.OfDouble) this, j, j2, intFunction);
        }

        @Override // j$.util.stream.Node.OfDouble, j$.util.stream.Node
        /* renamed from: truncate  reason: collision with other method in class */
        public /* bridge */ /* synthetic */ Node mo501truncate(long j, long j2, IntFunction intFunction) {
            Node mo501truncate;
            mo501truncate = mo501truncate(j, j2, intFunction);
            return mo501truncate;
        }

        DoubleArrayNode(long j) {
            if (j >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            this.array = new double[(int) j];
            this.curSize = 0;
        }

        @Override // j$.util.stream.Node.OfPrimitive, j$.util.stream.Node
        /* renamed from: spliterator */
        public Spliterator.OfDouble mo494spliterator() {
            return DesugarArrays.spliterator(this.array, 0, this.curSize);
        }

        @Override // j$.util.stream.Node.OfPrimitive
        /* renamed from: asPrimitiveArray  reason: collision with other method in class */
        public double[] mo497asPrimitiveArray() {
            double[] dArr = this.array;
            int length = dArr.length;
            int i = this.curSize;
            return length == i ? dArr : Arrays.copyOf(dArr, i);
        }

        @Override // j$.util.stream.Node.OfPrimitive
        public void copyInto(double[] dArr, int i) {
            System.arraycopy(this.array, 0, dArr, i, this.curSize);
        }

        @Override // j$.util.stream.Node
        public long count() {
            return this.curSize;
        }

        @Override // j$.util.stream.Node.OfPrimitive
        public void forEach(DoubleConsumer doubleConsumer) {
            for (int i = 0; i < this.curSize; i++) {
                doubleConsumer.accept(this.array[i]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class IntFixedNodeBuilder extends IntArrayNode implements Node.Builder.OfInt {
        static final /* synthetic */ boolean $assertionsDisabled = true;

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
        public /* synthetic */ boolean cancellationRequested() {
            return Sink.CC.$default$cancellationRequested(this);
        }

        IntFixedNodeBuilder(long j) {
            super(j);
            if ($assertionsDisabled || j < 2147483639) {
                return;
            }
            throw new AssertionError();
        }

        @Override // j$.util.stream.Node.Builder.OfInt, j$.util.stream.Node.Builder
        /* renamed from: build */
        public Node.OfInt mo498build() {
            if (this.curSize >= this.array.length) {
                return this;
            }
            throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.curSize), Integer.valueOf(this.array.length)));
        }

        @Override // j$.util.stream.Sink
        public void begin(long j) {
            if (j != this.array.length) {
                throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(this.array.length)));
            }
            this.curSize = 0;
        }

        @Override // j$.util.stream.Sink
        public void accept(int i) {
            int i2 = this.curSize;
            int[] iArr = this.array;
            if (i2 < iArr.length) {
                this.curSize = i2 + 1;
                iArr[i2] = i;
                return;
            }
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(this.array.length)));
        }

        @Override // j$.util.stream.Sink
        public void end() {
            if (this.curSize >= this.array.length) {
                return;
            }
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.curSize), Integer.valueOf(this.array.length)));
        }

        @Override // j$.util.stream.Nodes.IntArrayNode
        public String toString() {
            return String.format("IntFixedNodeBuilder[%d][%s]", Integer.valueOf(this.array.length - this.curSize), Arrays.toString(this.array));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class LongFixedNodeBuilder extends LongArrayNode implements Node.Builder.OfLong {
        static final /* synthetic */ boolean $assertionsDisabled = true;

        @Override // j$.util.stream.Sink
        public /* synthetic */ void accept(int i) {
            Sink.CC.$default$accept((Sink) this, i);
        }

        @Override // j$.util.stream.Sink.OfLong
        public /* synthetic */ void accept(Long l) {
            Sink.OfLong.CC.$default$accept((Sink.OfLong) this, l);
        }

        @Override // j$.util.function.Consumer
        public /* bridge */ /* synthetic */ void accept(Object obj) {
            accept((Long) obj);
        }

        @Override // j$.util.function.Consumer
        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return consumer.getClass();
        }

        @Override // j$.util.stream.Sink
        public /* synthetic */ boolean cancellationRequested() {
            return Sink.CC.$default$cancellationRequested(this);
        }

        LongFixedNodeBuilder(long j) {
            super(j);
            if ($assertionsDisabled || j < 2147483639) {
                return;
            }
            throw new AssertionError();
        }

        @Override // j$.util.stream.Node.Builder.OfLong, j$.util.stream.Node.Builder
        /* renamed from: build */
        public Node.OfLong mo498build() {
            if (this.curSize >= this.array.length) {
                return this;
            }
            throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.curSize), Integer.valueOf(this.array.length)));
        }

        @Override // j$.util.stream.Sink
        public void begin(long j) {
            if (j != this.array.length) {
                throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(this.array.length)));
            }
            this.curSize = 0;
        }

        @Override // j$.util.stream.Sink
        public void accept(long j) {
            int i = this.curSize;
            long[] jArr = this.array;
            if (i < jArr.length) {
                this.curSize = i + 1;
                jArr[i] = j;
                return;
            }
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(this.array.length)));
        }

        @Override // j$.util.stream.Sink
        public void end() {
            if (this.curSize >= this.array.length) {
                return;
            }
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.curSize), Integer.valueOf(this.array.length)));
        }

        @Override // j$.util.stream.Nodes.LongArrayNode
        public String toString() {
            return String.format("LongFixedNodeBuilder[%d][%s]", Integer.valueOf(this.array.length - this.curSize), Arrays.toString(this.array));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class DoubleFixedNodeBuilder extends DoubleArrayNode implements Node.Builder.OfDouble {
        static final /* synthetic */ boolean $assertionsDisabled = true;

        @Override // j$.util.stream.Sink
        public /* synthetic */ void accept(int i) {
            Sink.CC.$default$accept((Sink) this, i);
        }

        @Override // j$.util.stream.Sink
        public /* synthetic */ void accept(long j) {
            Sink.CC.$default$accept(this, j);
        }

        @Override // j$.util.stream.Sink.OfDouble
        public /* synthetic */ void accept(Double d) {
            Sink.OfDouble.CC.$default$accept((Sink.OfDouble) this, d);
        }

        @Override // j$.util.function.Consumer
        public /* bridge */ /* synthetic */ void accept(Object obj) {
            accept((Double) obj);
        }

        @Override // j$.util.function.Consumer
        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return consumer.getClass();
        }

        @Override // j$.util.stream.Sink
        public /* synthetic */ boolean cancellationRequested() {
            return Sink.CC.$default$cancellationRequested(this);
        }

        DoubleFixedNodeBuilder(long j) {
            super(j);
            if ($assertionsDisabled || j < 2147483639) {
                return;
            }
            throw new AssertionError();
        }

        @Override // j$.util.stream.Node.Builder.OfDouble, j$.util.stream.Node.Builder
        /* renamed from: build */
        public Node.OfDouble mo498build() {
            if (this.curSize >= this.array.length) {
                return this;
            }
            throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.curSize), Integer.valueOf(this.array.length)));
        }

        @Override // j$.util.stream.Sink
        public void begin(long j) {
            if (j != this.array.length) {
                throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(this.array.length)));
            }
            this.curSize = 0;
        }

        @Override // j$.util.stream.Sink.OfDouble, j$.util.function.DoubleConsumer
        public void accept(double d) {
            int i = this.curSize;
            double[] dArr = this.array;
            if (i < dArr.length) {
                this.curSize = i + 1;
                dArr[i] = d;
                return;
            }
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(this.array.length)));
        }

        @Override // j$.util.stream.Sink
        public void end() {
            if (this.curSize >= this.array.length) {
                return;
            }
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.curSize), Integer.valueOf(this.array.length)));
        }

        public String toString() {
            return String.format("DoubleFixedNodeBuilder[%d][%s]", Integer.valueOf(this.array.length - this.curSize), Arrays.toString(this.array));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class IntSpinedNodeBuilder extends SpinedBuffer.OfInt implements Node.OfInt, Node.Builder.OfInt {
        static final /* synthetic */ boolean $assertionsDisabled = true;
        private boolean building = false;

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

        @Override // j$.util.stream.Node
        public /* synthetic */ Object[] asArray(IntFunction intFunction) {
            return Node.OfPrimitive.CC.$default$asArray(this, intFunction);
        }

        @Override // j$.util.stream.Sink
        public /* synthetic */ boolean cancellationRequested() {
            return Sink.CC.$default$cancellationRequested(this);
        }

        @Override // j$.util.stream.Node.OfInt
        public /* synthetic */ void copyInto(Integer[] numArr, int i) {
            Node.OfInt.CC.$default$copyInto((Node.OfInt) this, numArr, i);
        }

        @Override // j$.util.stream.Node
        public /* bridge */ /* synthetic */ void copyInto(Object[] objArr, int i) {
            copyInto((Integer[]) objArr, i);
        }

        @Override // j$.util.stream.Node.OfPrimitive, j$.util.stream.Node
        /* renamed from: getChild */
        public /* synthetic */ Node.OfPrimitive mo499getChild(int i) {
            return Node.OfPrimitive.CC.$default$getChild((Node.OfPrimitive) this, i);
        }

        @Override // j$.util.stream.Node.OfPrimitive, j$.util.stream.Node
        /* renamed from: getChild  reason: collision with other method in class */
        public /* bridge */ /* synthetic */ Node mo499getChild(int i) {
            Node mo499getChild;
            mo499getChild = mo499getChild(i);
            return mo499getChild;
        }

        @Override // j$.util.stream.Node
        public /* synthetic */ int getChildCount() {
            return Node.CC.$default$getChildCount(this);
        }

        @Override // j$.util.stream.Node.OfInt, j$.util.stream.Node
        /* renamed from: truncate */
        public /* synthetic */ Node.OfInt mo501truncate(long j, long j2, IntFunction intFunction) {
            return Node.OfInt.CC.$default$truncate((Node.OfInt) this, j, j2, intFunction);
        }

        @Override // j$.util.stream.Node.OfInt, j$.util.stream.Node
        /* renamed from: truncate  reason: collision with other method in class */
        public /* bridge */ /* synthetic */ Node mo501truncate(long j, long j2, IntFunction intFunction) {
            Node mo501truncate;
            mo501truncate = mo501truncate(j, j2, intFunction);
            return mo501truncate;
        }

        IntSpinedNodeBuilder() {
        }

        @Override // j$.util.stream.SpinedBuffer.OfInt, java.lang.Iterable, j$.lang.Iterable
        /* renamed from: spliterator */
        public Spliterator.OfInt mo536spliterator() {
            if ($assertionsDisabled || !this.building) {
                return super.mo536spliterator();
            }
            throw new AssertionError("during building");
        }

        @Override // j$.util.stream.SpinedBuffer.OfPrimitive, j$.util.stream.Node.OfPrimitive
        public void forEach(IntConsumer intConsumer) {
            if ($assertionsDisabled || !this.building) {
                super.forEach((Object) intConsumer);
                return;
            }
            throw new AssertionError("during building");
        }

        @Override // j$.util.stream.Sink
        public void begin(long j) {
            if ($assertionsDisabled || !this.building) {
                this.building = $assertionsDisabled;
                clear();
                ensureCapacity(j);
                return;
            }
            throw new AssertionError("was already building");
        }

        @Override // j$.util.stream.SpinedBuffer.OfInt, j$.util.function.IntConsumer
        public void accept(int i) {
            if ($assertionsDisabled || this.building) {
                super.accept(i);
                return;
            }
            throw new AssertionError("not building");
        }

        @Override // j$.util.stream.Sink
        public void end() {
            if ($assertionsDisabled || this.building) {
                this.building = false;
                return;
            }
            throw new AssertionError("was not building");
        }

        @Override // j$.util.stream.SpinedBuffer.OfPrimitive, j$.util.stream.Node.OfPrimitive
        public void copyInto(int[] iArr, int i) {
            if ($assertionsDisabled || !this.building) {
                super.copyInto((Object) iArr, i);
                return;
            }
            throw new AssertionError("during building");
        }

        @Override // j$.util.stream.SpinedBuffer.OfPrimitive, j$.util.stream.Node.OfPrimitive
        /* renamed from: asPrimitiveArray  reason: collision with other method in class */
        public int[] mo497asPrimitiveArray() {
            if ($assertionsDisabled || !this.building) {
                return (int[]) super.mo497asPrimitiveArray();
            }
            throw new AssertionError("during building");
        }

        @Override // j$.util.stream.Node.Builder.OfInt, j$.util.stream.Node.Builder
        /* renamed from: build */
        public Node.OfInt mo498build() {
            if ($assertionsDisabled || !this.building) {
                return this;
            }
            throw new AssertionError("during building");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class LongSpinedNodeBuilder extends SpinedBuffer.OfLong implements Node.OfLong, Node.Builder.OfLong {
        static final /* synthetic */ boolean $assertionsDisabled = true;
        private boolean building = false;

        @Override // j$.util.stream.Sink
        public /* synthetic */ void accept(int i) {
            Sink.CC.$default$accept((Sink) this, i);
        }

        @Override // j$.util.stream.Sink.OfLong
        public /* synthetic */ void accept(Long l) {
            Sink.OfLong.CC.$default$accept((Sink.OfLong) this, l);
        }

        @Override // j$.util.function.Consumer
        public /* bridge */ /* synthetic */ void accept(Object obj) {
            accept((Long) obj);
        }

        @Override // j$.util.function.Consumer
        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return consumer.getClass();
        }

        @Override // j$.util.stream.Node
        public /* synthetic */ Object[] asArray(IntFunction intFunction) {
            return Node.OfPrimitive.CC.$default$asArray(this, intFunction);
        }

        @Override // j$.util.stream.Sink
        public /* synthetic */ boolean cancellationRequested() {
            return Sink.CC.$default$cancellationRequested(this);
        }

        @Override // j$.util.stream.Node.OfLong
        public /* synthetic */ void copyInto(Long[] lArr, int i) {
            Node.OfLong.CC.$default$copyInto((Node.OfLong) this, lArr, i);
        }

        @Override // j$.util.stream.Node
        public /* bridge */ /* synthetic */ void copyInto(Object[] objArr, int i) {
            copyInto((Long[]) objArr, i);
        }

        @Override // j$.util.stream.Node.OfPrimitive, j$.util.stream.Node
        /* renamed from: getChild */
        public /* synthetic */ Node.OfPrimitive mo499getChild(int i) {
            return Node.OfPrimitive.CC.$default$getChild((Node.OfPrimitive) this, i);
        }

        @Override // j$.util.stream.Node.OfPrimitive, j$.util.stream.Node
        /* renamed from: getChild  reason: collision with other method in class */
        public /* bridge */ /* synthetic */ Node mo499getChild(int i) {
            Node mo499getChild;
            mo499getChild = mo499getChild(i);
            return mo499getChild;
        }

        @Override // j$.util.stream.Node
        public /* synthetic */ int getChildCount() {
            return Node.CC.$default$getChildCount(this);
        }

        @Override // j$.util.stream.Node.OfLong, j$.util.stream.Node
        /* renamed from: truncate */
        public /* synthetic */ Node.OfLong mo501truncate(long j, long j2, IntFunction intFunction) {
            return Node.OfLong.CC.$default$truncate((Node.OfLong) this, j, j2, intFunction);
        }

        @Override // j$.util.stream.Node.OfLong, j$.util.stream.Node
        /* renamed from: truncate  reason: collision with other method in class */
        public /* bridge */ /* synthetic */ Node mo501truncate(long j, long j2, IntFunction intFunction) {
            Node mo501truncate;
            mo501truncate = mo501truncate(j, j2, intFunction);
            return mo501truncate;
        }

        LongSpinedNodeBuilder() {
        }

        @Override // j$.util.stream.SpinedBuffer.OfLong, java.lang.Iterable, j$.lang.Iterable
        /* renamed from: spliterator */
        public Spliterator.OfLong mo536spliterator() {
            if ($assertionsDisabled || !this.building) {
                return super.mo536spliterator();
            }
            throw new AssertionError("during building");
        }

        @Override // j$.util.stream.SpinedBuffer.OfPrimitive, j$.util.stream.Node.OfPrimitive
        public void forEach(LongConsumer longConsumer) {
            if ($assertionsDisabled || !this.building) {
                super.forEach((Object) longConsumer);
                return;
            }
            throw new AssertionError("during building");
        }

        @Override // j$.util.stream.Sink
        public void begin(long j) {
            if ($assertionsDisabled || !this.building) {
                this.building = $assertionsDisabled;
                clear();
                ensureCapacity(j);
                return;
            }
            throw new AssertionError("was already building");
        }

        @Override // j$.util.stream.SpinedBuffer.OfLong, j$.util.function.LongConsumer
        public void accept(long j) {
            if ($assertionsDisabled || this.building) {
                super.accept(j);
                return;
            }
            throw new AssertionError("not building");
        }

        @Override // j$.util.stream.Sink
        public void end() {
            if ($assertionsDisabled || this.building) {
                this.building = false;
                return;
            }
            throw new AssertionError("was not building");
        }

        @Override // j$.util.stream.SpinedBuffer.OfPrimitive, j$.util.stream.Node.OfPrimitive
        public void copyInto(long[] jArr, int i) {
            if ($assertionsDisabled || !this.building) {
                super.copyInto((Object) jArr, i);
                return;
            }
            throw new AssertionError("during building");
        }

        @Override // j$.util.stream.SpinedBuffer.OfPrimitive, j$.util.stream.Node.OfPrimitive
        /* renamed from: asPrimitiveArray  reason: collision with other method in class */
        public long[] mo497asPrimitiveArray() {
            if ($assertionsDisabled || !this.building) {
                return (long[]) super.mo497asPrimitiveArray();
            }
            throw new AssertionError("during building");
        }

        @Override // j$.util.stream.Node.Builder.OfLong, j$.util.stream.Node.Builder
        /* renamed from: build */
        public Node.OfLong mo498build() {
            if ($assertionsDisabled || !this.building) {
                return this;
            }
            throw new AssertionError("during building");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class DoubleSpinedNodeBuilder extends SpinedBuffer.OfDouble implements Node.OfDouble, Node.Builder.OfDouble {
        static final /* synthetic */ boolean $assertionsDisabled = true;
        private boolean building = false;

        @Override // j$.util.stream.Sink
        public /* synthetic */ void accept(int i) {
            Sink.CC.$default$accept((Sink) this, i);
        }

        @Override // j$.util.stream.Sink
        public /* synthetic */ void accept(long j) {
            Sink.CC.$default$accept(this, j);
        }

        @Override // j$.util.stream.Sink.OfDouble
        public /* synthetic */ void accept(Double d) {
            Sink.OfDouble.CC.$default$accept((Sink.OfDouble) this, d);
        }

        @Override // j$.util.function.Consumer
        public /* bridge */ /* synthetic */ void accept(Object obj) {
            accept((Double) obj);
        }

        @Override // j$.util.function.Consumer
        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return consumer.getClass();
        }

        @Override // j$.util.stream.Node
        public /* synthetic */ Object[] asArray(IntFunction intFunction) {
            return Node.OfPrimitive.CC.$default$asArray(this, intFunction);
        }

        @Override // j$.util.stream.Sink
        public /* synthetic */ boolean cancellationRequested() {
            return Sink.CC.$default$cancellationRequested(this);
        }

        @Override // j$.util.stream.Node.OfDouble
        public /* synthetic */ void copyInto(Double[] dArr, int i) {
            Node.OfDouble.CC.$default$copyInto((Node.OfDouble) this, dArr, i);
        }

        @Override // j$.util.stream.Node
        public /* bridge */ /* synthetic */ void copyInto(Object[] objArr, int i) {
            copyInto((Double[]) objArr, i);
        }

        @Override // j$.util.stream.Node.OfPrimitive, j$.util.stream.Node
        /* renamed from: getChild */
        public /* synthetic */ Node.OfPrimitive mo499getChild(int i) {
            return Node.OfPrimitive.CC.$default$getChild((Node.OfPrimitive) this, i);
        }

        @Override // j$.util.stream.Node.OfPrimitive, j$.util.stream.Node
        /* renamed from: getChild  reason: collision with other method in class */
        public /* bridge */ /* synthetic */ Node mo499getChild(int i) {
            Node mo499getChild;
            mo499getChild = mo499getChild(i);
            return mo499getChild;
        }

        @Override // j$.util.stream.Node
        public /* synthetic */ int getChildCount() {
            return Node.CC.$default$getChildCount(this);
        }

        @Override // j$.util.stream.Node.OfDouble, j$.util.stream.Node
        /* renamed from: truncate */
        public /* synthetic */ Node.OfDouble mo501truncate(long j, long j2, IntFunction intFunction) {
            return Node.OfDouble.CC.$default$truncate((Node.OfDouble) this, j, j2, intFunction);
        }

        @Override // j$.util.stream.Node.OfDouble, j$.util.stream.Node
        /* renamed from: truncate  reason: collision with other method in class */
        public /* bridge */ /* synthetic */ Node mo501truncate(long j, long j2, IntFunction intFunction) {
            Node mo501truncate;
            mo501truncate = mo501truncate(j, j2, intFunction);
            return mo501truncate;
        }

        DoubleSpinedNodeBuilder() {
        }

        @Override // j$.util.stream.SpinedBuffer.OfDouble, java.lang.Iterable, j$.lang.Iterable
        /* renamed from: spliterator */
        public Spliterator.OfDouble mo536spliterator() {
            if ($assertionsDisabled || !this.building) {
                return super.mo536spliterator();
            }
            throw new AssertionError("during building");
        }

        @Override // j$.util.stream.SpinedBuffer.OfPrimitive, j$.util.stream.Node.OfPrimitive
        public void forEach(DoubleConsumer doubleConsumer) {
            if ($assertionsDisabled || !this.building) {
                super.forEach((Object) doubleConsumer);
                return;
            }
            throw new AssertionError("during building");
        }

        @Override // j$.util.stream.Sink
        public void begin(long j) {
            if ($assertionsDisabled || !this.building) {
                this.building = $assertionsDisabled;
                clear();
                ensureCapacity(j);
                return;
            }
            throw new AssertionError("was already building");
        }

        @Override // j$.util.stream.SpinedBuffer.OfDouble, j$.util.function.DoubleConsumer
        public void accept(double d) {
            if ($assertionsDisabled || this.building) {
                super.accept(d);
                return;
            }
            throw new AssertionError("not building");
        }

        @Override // j$.util.stream.Sink
        public void end() {
            if ($assertionsDisabled || this.building) {
                this.building = false;
                return;
            }
            throw new AssertionError("was not building");
        }

        @Override // j$.util.stream.SpinedBuffer.OfPrimitive, j$.util.stream.Node.OfPrimitive
        public void copyInto(double[] dArr, int i) {
            if ($assertionsDisabled || !this.building) {
                super.copyInto((Object) dArr, i);
                return;
            }
            throw new AssertionError("during building");
        }

        @Override // j$.util.stream.SpinedBuffer.OfPrimitive, j$.util.stream.Node.OfPrimitive
        /* renamed from: asPrimitiveArray  reason: collision with other method in class */
        public double[] mo497asPrimitiveArray() {
            if ($assertionsDisabled || !this.building) {
                return (double[]) super.mo497asPrimitiveArray();
            }
            throw new AssertionError("during building");
        }

        @Override // j$.util.stream.Node.Builder.OfDouble, j$.util.stream.Node.Builder
        /* renamed from: build */
        public Node.OfDouble mo498build() {
            if ($assertionsDisabled || !this.building) {
                return this;
            }
            throw new AssertionError("during building");
        }
    }

    /* loaded from: classes5.dex */
    abstract class SizedCollectorTask extends CountedCompleter implements Sink {
        static final /* synthetic */ boolean $assertionsDisabled = true;
        protected int fence;
        protected final PipelineHelper helper;
        protected int index;
        protected long length;
        protected long offset;
        protected final Spliterator spliterator;
        protected final long targetSize;

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
        public /* synthetic */ boolean cancellationRequested() {
            return Sink.CC.$default$cancellationRequested(this);
        }

        @Override // j$.util.stream.Sink
        public /* synthetic */ void end() {
            Sink.CC.$default$end(this);
        }

        /* renamed from: makeChild */
        abstract SizedCollectorTask mo504makeChild(Spliterator spliterator, long j, long j2);

        SizedCollectorTask(Spliterator spliterator, PipelineHelper pipelineHelper, int i) {
            if ($assertionsDisabled || spliterator.hasCharacteristics(16384)) {
                this.spliterator = spliterator;
                this.helper = pipelineHelper;
                this.targetSize = AbstractTask.suggestTargetSize(spliterator.estimateSize());
                this.offset = 0L;
                this.length = i;
                return;
            }
            throw new AssertionError();
        }

        SizedCollectorTask(SizedCollectorTask sizedCollectorTask, Spliterator spliterator, long j, long j2, int i) {
            super(sizedCollectorTask);
            if ($assertionsDisabled || spliterator.hasCharacteristics(16384)) {
                this.spliterator = spliterator;
                this.helper = sizedCollectorTask.helper;
                this.targetSize = sizedCollectorTask.targetSize;
                this.offset = j;
                this.length = j2;
                if (j >= 0 && j2 >= 0 && (j + j2) - 1 < i) {
                    return;
                }
                throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
            }
            throw new AssertionError();
        }

        @Override // java.util.concurrent.CountedCompleter
        public void compute() {
            Spliterator mo545trySplit;
            Spliterator spliterator = this.spliterator;
            SizedCollectorTask sizedCollectorTask = this;
            while (spliterator.estimateSize() > sizedCollectorTask.targetSize && (mo545trySplit = spliterator.mo545trySplit()) != null) {
                sizedCollectorTask.setPendingCount(1);
                long estimateSize = mo545trySplit.estimateSize();
                sizedCollectorTask.mo504makeChild(mo545trySplit, sizedCollectorTask.offset, estimateSize).fork();
                sizedCollectorTask = sizedCollectorTask.mo504makeChild(spliterator, sizedCollectorTask.offset + estimateSize, sizedCollectorTask.length - estimateSize);
            }
            if ($assertionsDisabled || sizedCollectorTask.offset + sizedCollectorTask.length < 2147483639) {
                sizedCollectorTask.helper.wrapAndCopyInto(sizedCollectorTask, spliterator);
                sizedCollectorTask.propagateCompletion();
                return;
            }
            throw new AssertionError();
        }

        @Override // j$.util.stream.Sink
        public void begin(long j) {
            long j2 = this.length;
            if (j > j2) {
                throw new IllegalStateException("size passed to Sink.begin exceeds array length");
            }
            int i = (int) this.offset;
            this.index = i;
            this.fence = i + ((int) j2);
        }

        /* loaded from: classes5.dex */
        final class OfRef extends SizedCollectorTask {
            private final Object[] array;

            OfRef(Spliterator spliterator, PipelineHelper pipelineHelper, Object[] objArr) {
                super(spliterator, pipelineHelper, objArr.length);
                this.array = objArr;
            }

            OfRef(OfRef ofRef, Spliterator spliterator, long j, long j2) {
                super(ofRef, spliterator, j, j2, ofRef.array.length);
                this.array = ofRef.array;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // j$.util.stream.Nodes.SizedCollectorTask
            /* renamed from: makeChild */
            public OfRef mo504makeChild(Spliterator spliterator, long j, long j2) {
                return new OfRef(this, spliterator, j, j2);
            }

            @Override // j$.util.function.Consumer
            public void accept(Object obj) {
                int i = this.index;
                if (i >= this.fence) {
                    throw new IndexOutOfBoundsException(Integer.toString(this.index));
                }
                Object[] objArr = this.array;
                this.index = i + 1;
                objArr[i] = obj;
            }
        }

        /* loaded from: classes5.dex */
        final class OfInt extends SizedCollectorTask implements Sink.OfInt {
            private final int[] array;

            @Override // j$.util.stream.Sink.OfInt
            public /* synthetic */ void accept(Integer num) {
                Sink.OfInt.CC.$default$accept((Sink.OfInt) this, num);
            }

            @Override // j$.util.function.Consumer
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                Sink.OfInt.CC.$default$accept(this, obj);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return intConsumer.getClass();
            }

            OfInt(Spliterator spliterator, PipelineHelper pipelineHelper, int[] iArr) {
                super(spliterator, pipelineHelper, iArr.length);
                this.array = iArr;
            }

            OfInt(OfInt ofInt, Spliterator spliterator, long j, long j2) {
                super(ofInt, spliterator, j, j2, ofInt.array.length);
                this.array = ofInt.array;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // j$.util.stream.Nodes.SizedCollectorTask
            /* renamed from: makeChild */
            public OfInt mo504makeChild(Spliterator spliterator, long j, long j2) {
                return new OfInt(this, spliterator, j, j2);
            }

            @Override // j$.util.stream.Nodes.SizedCollectorTask, j$.util.stream.Sink
            public void accept(int i) {
                int i2 = this.index;
                if (i2 >= this.fence) {
                    throw new IndexOutOfBoundsException(Integer.toString(this.index));
                }
                int[] iArr = this.array;
                this.index = i2 + 1;
                iArr[i2] = i;
            }
        }

        /* loaded from: classes5.dex */
        final class OfLong extends SizedCollectorTask implements Sink.OfLong {
            private final long[] array;

            @Override // j$.util.stream.Sink.OfLong
            public /* synthetic */ void accept(Long l) {
                Sink.OfLong.CC.$default$accept((Sink.OfLong) this, l);
            }

            @Override // j$.util.function.Consumer
            public /* bridge */ /* synthetic */ void accept(Object obj) {
                accept((Long) obj);
            }

            OfLong(Spliterator spliterator, PipelineHelper pipelineHelper, long[] jArr) {
                super(spliterator, pipelineHelper, jArr.length);
                this.array = jArr;
            }

            OfLong(OfLong ofLong, Spliterator spliterator, long j, long j2) {
                super(ofLong, spliterator, j, j2, ofLong.array.length);
                this.array = ofLong.array;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // j$.util.stream.Nodes.SizedCollectorTask
            /* renamed from: makeChild */
            public OfLong mo504makeChild(Spliterator spliterator, long j, long j2) {
                return new OfLong(this, spliterator, j, j2);
            }

            @Override // j$.util.stream.Nodes.SizedCollectorTask, j$.util.stream.Sink
            public void accept(long j) {
                int i = this.index;
                if (i >= this.fence) {
                    throw new IndexOutOfBoundsException(Integer.toString(this.index));
                }
                long[] jArr = this.array;
                this.index = i + 1;
                jArr[i] = j;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public abstract class ToArrayTask extends CountedCompleter {
        protected final Node node;
        protected final int offset;

        abstract void copyNodeToArray();

        /* renamed from: makeChild */
        abstract ToArrayTask mo506makeChild(int i, int i2);

        ToArrayTask(Node node, int i) {
            this.node = node;
            this.offset = i;
        }

        ToArrayTask(ToArrayTask toArrayTask, Node node, int i) {
            super(toArrayTask);
            this.node = node;
            this.offset = i;
        }

        @Override // java.util.concurrent.CountedCompleter
        public void compute() {
            ToArrayTask toArrayTask = this;
            while (toArrayTask.node.getChildCount() != 0) {
                toArrayTask.setPendingCount(toArrayTask.node.getChildCount() - 1);
                int i = 0;
                int i2 = 0;
                while (i < toArrayTask.node.getChildCount() - 1) {
                    ToArrayTask mo506makeChild = toArrayTask.mo506makeChild(i, toArrayTask.offset + i2);
                    i2 = (int) (i2 + mo506makeChild.node.count());
                    mo506makeChild.fork();
                    i++;
                }
                toArrayTask = toArrayTask.mo506makeChild(i, toArrayTask.offset + i2);
            }
            toArrayTask.copyNodeToArray();
            toArrayTask.propagateCompletion();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public final class OfRef extends ToArrayTask {
            private final Object[] array;

            private OfRef(Node node, Object[] objArr, int i) {
                super(node, i);
                this.array = objArr;
            }

            private OfRef(OfRef ofRef, Node node, int i) {
                super(ofRef, node, i);
                this.array = ofRef.array;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // j$.util.stream.Nodes.ToArrayTask
            /* renamed from: makeChild */
            public OfRef mo506makeChild(int i, int i2) {
                return new OfRef(this, this.node.mo499getChild(i), i2);
            }

            @Override // j$.util.stream.Nodes.ToArrayTask
            void copyNodeToArray() {
                this.node.copyInto(this.array, this.offset);
            }
        }

        /* loaded from: classes5.dex */
        class OfPrimitive extends ToArrayTask {
            private final Object array;

            private OfPrimitive(Node.OfPrimitive ofPrimitive, Object obj, int i) {
                super(ofPrimitive, i);
                this.array = obj;
            }

            private OfPrimitive(OfPrimitive ofPrimitive, Node.OfPrimitive ofPrimitive2, int i) {
                super(ofPrimitive, ofPrimitive2, i);
                this.array = ofPrimitive.array;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // j$.util.stream.Nodes.ToArrayTask
            /* renamed from: makeChild */
            public OfPrimitive mo506makeChild(int i, int i2) {
                return new OfPrimitive(this, ((Node.OfPrimitive) this.node).mo499getChild(i), i2);
            }

            @Override // j$.util.stream.Nodes.ToArrayTask
            void copyNodeToArray() {
                ((Node.OfPrimitive) this.node).copyInto(this.array, this.offset);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public final class OfInt extends OfPrimitive {
            private OfInt(Node.OfInt ofInt, int[] iArr, int i) {
                super(ofInt, iArr, i);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public final class OfLong extends OfPrimitive {
            private OfLong(Node.OfLong ofLong, long[] jArr, int i) {
                super(ofLong, jArr, i);
            }
        }
    }

    /* loaded from: classes5.dex */
    class CollectorTask extends AbstractTask {
        protected final LongFunction builderFactory;
        protected final BinaryOperator concFactory;
        protected final PipelineHelper helper;

        CollectorTask(PipelineHelper pipelineHelper, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
            super(pipelineHelper, spliterator);
            this.helper = pipelineHelper;
            this.builderFactory = longFunction;
            this.concFactory = binaryOperator;
        }

        CollectorTask(CollectorTask collectorTask, Spliterator spliterator) {
            super(collectorTask, spliterator);
            this.helper = collectorTask.helper;
            this.builderFactory = collectorTask.builderFactory;
            this.concFactory = collectorTask.concFactory;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.AbstractTask
        /* renamed from: makeChild  reason: collision with other method in class */
        public CollectorTask mo523makeChild(Spliterator spliterator) {
            return new CollectorTask(this, spliterator);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.AbstractTask
        /* renamed from: doLeaf */
        public Node mo521doLeaf() {
            return ((Node.Builder) this.helper.wrapAndCopyInto((Node.Builder) this.builderFactory.apply(this.helper.exactOutputSizeIfKnown(this.spliterator)), this.spliterator)).mo498build();
        }

        @Override // j$.util.stream.AbstractTask, java.util.concurrent.CountedCompleter
        public void onCompletion(CountedCompleter countedCompleter) {
            if (!isLeaf()) {
                setLocalResult((Node) this.concFactory.apply((Node) ((CollectorTask) this.leftChild).getLocalResult(), (Node) ((CollectorTask) this.rightChild).getLocalResult()));
            }
            super.onCompletion(countedCompleter);
        }

        /* loaded from: classes5.dex */
        final class OfRef extends CollectorTask {
            OfRef(PipelineHelper pipelineHelper, final IntFunction intFunction, Spliterator spliterator) {
                super(pipelineHelper, spliterator, new LongFunction() { // from class: j$.util.stream.Nodes$CollectorTask$OfRef$$ExternalSyntheticLambda1
                    @Override // j$.util.function.LongFunction
                    public final Object apply(long j) {
                        Node.Builder builder;
                        builder = Nodes.builder(j, IntFunction.this);
                        return builder;
                    }
                }, Nodes$CollectorTask$OfRef$$ExternalSyntheticLambda0.INSTANCE);
            }
        }

        /* loaded from: classes5.dex */
        final class OfInt extends CollectorTask {
            OfInt(PipelineHelper pipelineHelper, Spliterator spliterator) {
                super(pipelineHelper, spliterator, Nodes$CollectorTask$OfInt$$ExternalSyntheticLambda1.INSTANCE, Nodes$CollectorTask$OfInt$$ExternalSyntheticLambda0.INSTANCE);
            }
        }

        /* loaded from: classes5.dex */
        final class OfLong extends CollectorTask {
            OfLong(PipelineHelper pipelineHelper, Spliterator spliterator) {
                super(pipelineHelper, spliterator, Nodes$CollectorTask$OfLong$$ExternalSyntheticLambda1.INSTANCE, Nodes$CollectorTask$OfLong$$ExternalSyntheticLambda0.INSTANCE);
            }
        }
    }
}
