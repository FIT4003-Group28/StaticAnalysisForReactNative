package c.e.a.b.d.f;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f4028a = Logger.getLogger(i.class.getName());

    private i() {
    }

    public static void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                try {
                    f4028a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", (Throwable) e2);
                } catch (IOException e3) {
                    throw new AssertionError(e3);
                }
            }
        }
    }
}
