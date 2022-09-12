package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: eafi  reason: default package */
/* loaded from: classes6.dex */
public final class eafi extends RuntimeException {
    public final IOException a;
    public IOException b;

    public eafi(IOException iOException) {
        super(iOException);
        this.a = iOException;
        this.b = iOException;
    }
}
