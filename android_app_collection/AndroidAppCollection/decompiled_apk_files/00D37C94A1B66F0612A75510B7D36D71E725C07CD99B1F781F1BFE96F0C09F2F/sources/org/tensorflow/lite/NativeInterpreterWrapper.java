package org.tensorflow.lite;

import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes4.dex */
public class NativeInterpreterWrapper implements AutoCloseable {
    public long a;
    public long b;
    public Tensor[] c;
    public Tensor[] d;
    public boolean e;
    private long f;
    private ByteBuffer g;
    public long inferenceDurationNanoseconds = -1;
    private final List h = new ArrayList();
    private final List i = new ArrayList();

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0095, code lost:
        r3 = (org.tensorflow.lite.nnapi.NnApiDelegate) r4.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NativeInterpreterWrapper(java.nio.ByteBuffer r11) {
        /*
            r10 = this;
            r10.<init>()
            r0 = -1
            r10.inferenceDurationNanoseconds = r0
            r0 = 0
            r10.e = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r10.h = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r10.i = r1
            org.tensorflow.lite.TensorFlowLite.a()
            if (r11 == 0) goto Ld0
            boolean r1 = r11 instanceof java.nio.MappedByteBuffer
            if (r1 != 0) goto L31
            boolean r1 = r11.isDirect()
            if (r1 == 0) goto Ld0
            java.nio.ByteOrder r1 = r11.order()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.nativeOrder()
            if (r1 != r2) goto Ld0
        L31:
            r10.g = r11
            r11 = 512(0x200, float:7.175E-43)
            long r1 = createErrorReporter(r11)
            java.nio.ByteBuffer r11 = r10.g
            long r3 = createModelWithBuffer(r11, r1)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r10.a = r1
            r10.f = r3
            r5 = -1
            long r3 = createInterpreter(r3, r1, r5)
            r10.b = r3
            int r3 = getInputCount(r3)
            org.tensorflow.lite.Tensor[] r3 = new org.tensorflow.lite.Tensor[r3]
            r10.c = r3
            long r3 = r10.b
            int r3 = getOutputCount(r3)
            org.tensorflow.lite.Tensor[] r3 = new org.tensorflow.lite.Tensor[r3]
            r10.d = r3
            long r3 = r10.b
            boolean r3 = hasUnresolvedFlexOp(r3)
            if (r3 == 0) goto La8
            r3 = 0
            java.lang.String r4 = "org.tensorflow.lite.flex.FlexDelegate"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Exception -> L97
            java.util.Iterator r5 = r11.iterator()     // Catch: java.lang.Exception -> L97
        L74:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Exception -> L97
            if (r6 == 0) goto L87
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Exception -> L97
            org.tensorflow.lite.nnapi.NnApiDelegate r6 = (org.tensorflow.lite.nnapi.NnApiDelegate) r6     // Catch: java.lang.Exception -> L97
            boolean r6 = r4.isInstance(r6)     // Catch: java.lang.Exception -> L97
            if (r6 == 0) goto L74
            goto L98
        L87:
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L97
            java.lang.reflect.Constructor r4 = r4.getConstructor(r5)     // Catch: java.lang.Exception -> L97
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L97
            java.lang.Object r0 = r4.newInstance(r0)     // Catch: java.lang.Exception -> L97
            org.tensorflow.lite.nnapi.NnApiDelegate r0 = (org.tensorflow.lite.nnapi.NnApiDelegate) r0     // Catch: java.lang.Exception -> L97
            r3 = r0
            goto L98
        L97:
        L98:
            if (r3 == 0) goto La8
            java.util.List r0 = r10.i
            r0.add(r3)
            long r4 = r10.b
            long r6 = r10.a
            long r8 = r3.a
            applyDelegate(r4, r6, r8)
        La8:
            java.util.Iterator r11 = r11.iterator()
        Lac:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Lc7
            java.lang.Object r0 = r11.next()
            org.tensorflow.lite.nnapi.NnApiDelegate r0 = (org.tensorflow.lite.nnapi.NnApiDelegate) r0
            long r3 = r10.b
            long r5 = r10.a
            long r7 = r0.a
            applyDelegate(r3, r5, r7)
            java.util.List r3 = r10.h
            r3.add(r0)
            goto Lac
        Lc7:
            long r3 = r10.b
            allocateTensors(r3, r1)
            r11 = 1
            r10.e = r11
            return
        Ld0:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Model ByteBuffer should be either a MappedByteBuffer of the model file, or a direct ByteBuffer using ByteOrder.nativeOrder() which contains bytes of model content."
            r11.<init>(r0)
            goto Ld9
        Ld8:
            throw r11
        Ld9:
            goto Ld8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tensorflow.lite.NativeInterpreterWrapper.<init>(java.nio.ByteBuffer):void");
    }

    private static native long allocateTensors(long j, long j2);

    private static native void allowBufferHandleOutput(long j, boolean z);

    private static native void allowFp16PrecisionForFp32(long j, boolean z);

    private static native void applyDelegate(long j, long j2, long j3);

    private static native long createCancellationFlag(long j);

    private static native long createErrorReporter(int i);

    private static native long createInterpreter(long j, long j2, int i);

    private static native long createModel(String str, long j);

    private static native long createModelWithBuffer(ByteBuffer byteBuffer, long j);

    private static native void delete(long j, long j2, long j3);

    private static native long deleteCancellationFlag(long j);

    private static native int getExecutionPlanLength(long j);

    private static native int getInputCount(long j);

    private static native String[] getInputNames(long j);

    private static native int getInputTensorIndex(long j, int i);

    private static native int getOutputCount(long j);

    private static native int getOutputDataType(long j, int i);

    private static native String[] getOutputNames(long j);

    private static native int getOutputTensorIndex(long j, int i);

    public static native String[] getSignatureKeys(long j);

    private static native boolean hasUnresolvedFlexOp(long j);

    private static native void resetVariableTensors(long j, long j2);

    public static native boolean resizeInput(long j, long j2, int i, int[] iArr, boolean z);

    public static native void run(long j, long j2);

    private static native void setCancelled(long j, long j2, boolean z);

    private static native void useXNNPACK(long j, long j2, int i, int i2);

    public final Tensor a(int i) {
        if (i >= 0) {
            Tensor[] tensorArr = this.c;
            if (i < tensorArr.length) {
                Tensor tensor = tensorArr[i];
                if (tensor != null) {
                    return tensor;
                }
                long j = this.b;
                Tensor f = Tensor.f(j, getInputTensorIndex(j, i));
                tensorArr[i] = f;
                return f;
            }
        }
        StringBuilder sb = new StringBuilder(39);
        sb.append("Invalid input Tensor index: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final Tensor b(int i) {
        if (i >= 0) {
            Tensor[] tensorArr = this.d;
            if (i < tensorArr.length) {
                Tensor tensor = tensorArr[i];
                if (tensor != null) {
                    return tensor;
                }
                long j = this.b;
                Tensor f = Tensor.f(j, getOutputTensorIndex(j, i));
                tensorArr[i] = f;
                return f;
            }
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("Invalid output Tensor index: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean c() {
        int i = 0;
        if (this.e) {
            return false;
        }
        this.e = true;
        allocateTensors(this.b, this.a);
        while (true) {
            Tensor[] tensorArr = this.d;
            if (i >= tensorArr.length) {
                return true;
            }
            Tensor tensor = tensorArr[i];
            if (tensor != null) {
                tensor.i();
            }
            i++;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int i = 0;
        while (true) {
            Tensor[] tensorArr = this.c;
            if (i >= tensorArr.length) {
                break;
            }
            Tensor tensor = tensorArr[i];
            if (tensor != null) {
                tensor.g();
                this.c[i] = null;
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            Tensor[] tensorArr2 = this.d;
            if (i2 >= tensorArr2.length) {
                break;
            }
            Tensor tensor2 = tensorArr2[i2];
            if (tensor2 != null) {
                tensor2.g();
                this.d[i2] = null;
            }
            i2++;
        }
        delete(this.a, this.f, this.b);
        deleteCancellationFlag(0L);
        this.a = 0L;
        this.f = 0L;
        this.b = 0L;
        this.g = null;
        this.e = false;
        this.h.clear();
        for (AutoCloseable autoCloseable : this.i) {
            try {
                autoCloseable.close();
            } catch (Exception e) {
                PrintStream printStream = System.err;
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
                sb.append("Failed to close flex delegate: ");
                sb.append(valueOf);
                printStream.println(sb.toString());
            }
        }
        this.i.clear();
    }
}
