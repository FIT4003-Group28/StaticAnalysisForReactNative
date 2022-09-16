package defpackage;
/* compiled from: PG */
/* renamed from: eanm  reason: default package */
/* loaded from: classes6.dex */
public final class eanm {
    public final Object a;
    public eamo b;
    public final boolean c;
    public final eaod d;
    public byte[] e = null;
    protected byte[] f = null;
    public char[] g = null;
    protected char[] h = null;

    public eanm(eaod eaodVar, Object obj, boolean z) {
        this.d = eaodVar;
        this.a = obj;
        this.c = z;
    }

    public final byte[] a() {
        if (this.f != null) {
            throw new IllegalStateException("Trying to call allocWriteEncodingBuffer() second time");
        }
        byte[] a = this.d.a(eaob.WRITE_ENCODING_BUFFER);
        this.f = a;
        return a;
    }

    public final char[] b() {
        if (this.h != null) {
            throw new IllegalStateException("Trying to call allocConcatBuffer() second time");
        }
        char[] c = this.d.c(eaoc.CONCAT_BUFFER);
        this.h = c;
        return c;
    }

    public final void c(byte[] bArr) {
        if (bArr == this.e) {
            this.e = null;
            this.d.b(eaob.READ_IO_BUFFER, bArr);
            return;
        }
        throw new IllegalArgumentException("Trying to release buffer not owned by the context");
    }

    public final void d(byte[] bArr) {
        if (bArr == this.f) {
            this.f = null;
            this.d.b(eaob.WRITE_ENCODING_BUFFER, bArr);
            return;
        }
        throw new IllegalArgumentException("Trying to release buffer not owned by the context");
    }

    public final void e(char[] cArr) {
        if (cArr == this.h) {
            this.h = null;
            this.d.e(eaoc.CONCAT_BUFFER, cArr);
            return;
        }
        throw new IllegalArgumentException("Trying to release buffer not owned by the context");
    }
}
