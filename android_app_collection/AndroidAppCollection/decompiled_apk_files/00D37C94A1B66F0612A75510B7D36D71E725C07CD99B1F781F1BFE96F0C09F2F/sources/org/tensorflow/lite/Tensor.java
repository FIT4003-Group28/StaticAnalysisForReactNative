package org.tensorflow.lite;

import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class Tensor {
    public long a;
    public int[] b;
    public final int c;

    private Tensor(long j) {
        this.a = j;
        int dtype = dtype(j);
        int[] iArr = bamg.a;
        for (int i = 0; i < 8; i++) {
            int i2 = iArr[i];
            if (i2 == 0) {
                throw null;
            }
            if (i2 == dtype) {
                this.c = i2;
                this.b = shape(j);
                shapeSignature(j);
                quantizationScale(j);
                quantizationZeroPoint(j);
                return;
            }
        }
        TensorFlowLite.a();
        String nativeRuntimeVersion = TensorFlowLite.nativeRuntimeVersion();
        StringBuilder sb = new StringBuilder(String.valueOf(nativeRuntimeVersion).length() + 73);
        sb.append("DataType error: DataType ");
        sb.append(dtype);
        sb.append(" is not recognized in Java (version ");
        sb.append(nativeRuntimeVersion);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    static int a(Object obj) {
        if (obj == null || !obj.getClass().isArray()) {
            return 0;
        }
        if (Array.getLength(obj) == 0) {
            throw new IllegalArgumentException("Array lengths cannot be 0.");
        }
        return a(Array.get(obj, 0)) + 1;
    }

    private static native ByteBuffer buffer(long j);

    private static native long create(long j, int i);

    private static native long createSignatureInputTensor(long j, String str);

    private static native long createSignatureOutputTensor(long j, String str);

    private static native void delete(long j);

    private static native int dtype(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Tensor f(long j, int i) {
        return new Tensor(create(j, i));
    }

    static void h(Object obj, int i, int[] iArr) {
        if (iArr == null || i == iArr.length) {
            return;
        }
        int length = Array.getLength(obj);
        int i2 = iArr[i];
        if (i2 == 0) {
            iArr[i] = length;
        } else if (i2 != length) {
            throw new IllegalArgumentException(String.format("Mismatched lengths (%d and %d) in dimension %d", Integer.valueOf(i2), Integer.valueOf(length), Integer.valueOf(i)));
        }
        for (int i3 = 0; i3 < length; i3++) {
            h(Array.get(obj, i3), i + 1, iArr);
        }
    }

    public static native boolean hasDelegateBufferHandle(long j);

    private static native int index(long j);

    private static native String name(long j);

    private static native int numBytes(long j);

    private static native float quantizationScale(long j);

    private static native int quantizationZeroPoint(long j);

    public static native void readMultiDimensionalArray(long j, Object obj);

    private static native int[] shape(long j);

    private static native int[] shapeSignature(long j);

    public static native void writeDirectBuffer(long j, Buffer buffer);

    public static native void writeMultiDimensionalArray(long j, Object obj);

    public static native void writeScalar(long j, Object obj);

    public final int b() {
        return numBytes(this.a);
    }

    public final int c() {
        int i = 1;
        for (int i2 : this.b) {
            i *= i2;
        }
        return i;
    }

    public final String d() {
        return name(this.a);
    }

    public final ByteBuffer e() {
        return buffer(this.a).order(ByteOrder.nativeOrder());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        delete(this.a);
        this.a = 0L;
    }

    public final void i() {
        this.b = shape(this.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
        if (r0 == 5) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tensorflow.lite.Tensor.j(java.lang.Object):void");
    }

    public final int[] k(Object obj) {
        int a = a(obj);
        int i = this.c;
        int[] iArr = bamg.a;
        if (i == 5) {
            Class<?> cls = obj.getClass();
            if (cls.isArray()) {
                while (cls.isArray()) {
                    cls = cls.getComponentType();
                }
                if (Byte.TYPE.equals(cls)) {
                    a--;
                }
            }
        }
        int[] iArr2 = new int[a];
        h(obj, 0, iArr2);
        return iArr2;
    }
}
