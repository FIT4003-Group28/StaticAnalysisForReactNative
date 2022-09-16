package defpackage;

import java.io.InputStream;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: babd  reason: default package */
/* loaded from: classes2.dex */
public final class babd {
    static {
        Logger.getLogger(babd.class.getName());
    }

    private babd() {
    }

    public static baba a(babl bablVar) {
        return new babh(bablVar);
    }

    public static babl b(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        return new babc(inputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
