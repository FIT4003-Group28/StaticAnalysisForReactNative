package c.d.d.g;

import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final int f2833a;

    /* renamed from: b  reason: collision with root package name */
    private final a f2834b;

    public k(a aVar) {
        this(aVar, 16384);
    }

    public k(a aVar, int i) {
        c.d.d.d.i.a(i > 0);
        this.f2833a = i;
        this.f2834b = aVar;
    }

    public long a(InputStream inputStream, OutputStream outputStream) {
        byte[] mo186get = this.f2834b.mo186get(this.f2833a);
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(mo186get, 0, this.f2833a);
                if (read == -1) {
                    return j;
                }
                outputStream.write(mo186get, 0, read);
                j += read;
            } finally {
                this.f2834b.a(mo186get);
            }
        }
    }
}
