package h;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
/* loaded from: classes.dex */
public interface d extends u, WritableByteChannel {
    long a(v vVar);

    /* renamed from: a */
    d mo330a(f fVar);

    /* renamed from: a */
    d mo331a(String str);

    /* renamed from: a */
    d mo332a(String str, int i, int i2);

    /* renamed from: c */
    d mo333c(long j);

    /* renamed from: d */
    d mo335d(long j);

    @Override // h.u, java.io.Flushable
    void flush();

    c j();

    d k();

    /* renamed from: l */
    d mo336l();

    OutputStream m();

    /* renamed from: write */
    d mo337write(byte[] bArr);

    /* renamed from: write */
    d mo338write(byte[] bArr, int i, int i2);

    /* renamed from: writeByte */
    d mo339writeByte(int i);

    /* renamed from: writeInt */
    d mo340writeInt(int i);

    /* renamed from: writeShort */
    d mo341writeShort(int i);
}
