package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: ddam  reason: default package */
/* loaded from: classes5.dex */
public final class ddam {
    static final Logger a = Logger.getLogger(ddam.class.getName());

    private ddam() {
    }

    public static void a(InputStream inputStream) {
        try {
            b(inputStream);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public static void b(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", (Throwable) e);
        }
    }
}
