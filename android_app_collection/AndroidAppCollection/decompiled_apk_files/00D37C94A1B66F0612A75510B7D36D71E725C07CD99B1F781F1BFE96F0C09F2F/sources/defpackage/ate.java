package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
/* compiled from: PG */
/* renamed from: ate  reason: default package */
/* loaded from: classes2.dex */
public class ate extends asw {
    public final asy b;
    public final int c;

    @Deprecated
    public ate(asy asyVar, int i) {
        this(asyVar, 2000, i);
    }

    private static int b(int i, int i2) {
        return i == 2000 ? i2 != 1 ? 2000 : 2001 : i;
    }

    public static ate rw(IOException iOException, asy asyVar, int i) {
        String message = iOException.getMessage();
        int i2 = 2001;
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else if (message != null && akzj.g(message).matches("cleartext.*not permitted.*")) {
            i2 = 2007;
        }
        if (i2 == 2007) {
            return new atc(iOException, asyVar);
        }
        return new ate(iOException, asyVar, i2, i);
    }

    public ate(asy asyVar, int i, int i2) {
        super(b(i, i2));
        this.b = asyVar;
        this.c = i2;
    }

    public ate(IOException iOException, asy asyVar, int i, int i2) {
        super(iOException, b(i, i2));
        this.b = asyVar;
        this.c = i2;
    }

    @Deprecated
    public ate(String str, asy asyVar, int i) {
        this(str, asyVar, 2000, i);
    }

    public ate(String str, asy asyVar, int i, int i2) {
        super(str, b(i, i2));
        this.b = asyVar;
        this.c = i2;
    }

    public ate(String str, IOException iOException, asy asyVar, int i) {
        super(str, iOException, b(i, 1));
        this.b = asyVar;
        this.c = 1;
    }
}
