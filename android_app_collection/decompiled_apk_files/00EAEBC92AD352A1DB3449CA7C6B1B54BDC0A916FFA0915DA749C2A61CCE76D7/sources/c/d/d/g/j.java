package c.d.d.g;

import c.d.d.d.n;
import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes.dex */
public abstract class j extends OutputStream {
    /* renamed from: a */
    public abstract g mo193a();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e2) {
            n.a(e2);
            throw null;
        }
    }

    public abstract int size();
}
