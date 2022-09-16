package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: atn  reason: default package */
/* loaded from: classes2.dex */
public final class atn extends ate {
    public final int d;

    public atn(asy asyVar) {
        super(asyVar, 2008, 1);
        this.d = 14;
    }

    @Deprecated
    public atn(IOException iOException, asy asyVar) {
        super(iOException, asyVar, 2000, 1);
        this.d = -1;
    }

    public atn(IOException iOException, asy asyVar, int i, int i2) {
        super(iOException, asyVar, i, 1);
        this.d = i2;
    }

    @Deprecated
    public atn(asy asyVar, byte[] bArr) {
        super("OnesieRetryingDataSource time out.", asyVar, 2000, 1);
        this.d = -1;
    }

    public atn(asy asyVar, char[] cArr) {
        super("HTTP request with non-empty body must set Content-Type", asyVar, 1004, 1);
        this.d = 0;
    }
}
