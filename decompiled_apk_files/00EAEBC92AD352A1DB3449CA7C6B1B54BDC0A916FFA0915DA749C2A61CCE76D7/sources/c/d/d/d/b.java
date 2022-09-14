package c.d.d.d;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final Logger f2806a = Logger.getLogger(b.class.getName());

    private b() {
    }

    public static void a(Closeable closeable, boolean z) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e2) {
            if (!z) {
                throw e2;
            }
            f2806a.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e2);
        }
    }

    public static void a(InputStream inputStream) {
        try {
            a(inputStream, true);
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
