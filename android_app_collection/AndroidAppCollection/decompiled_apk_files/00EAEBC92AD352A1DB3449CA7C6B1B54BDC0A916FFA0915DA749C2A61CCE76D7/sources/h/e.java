package h;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public interface e extends v, ReadableByteChannel {
    int a(m mVar);

    long a(byte b2);

    String a(Charset charset);

    void a(c cVar, long j);

    boolean a(long j, f fVar);

    long b(f fVar);

    long c(f fVar);

    f e(long j);

    boolean f(long j);

    byte[] g(long j);

    String h(long j);

    void i(long j);

    @Deprecated
    c j();

    String n();

    byte[] o();

    int p();

    c q();

    boolean r();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    short s();

    void skip(long j);

    long t();

    long u();

    InputStream v();
}
