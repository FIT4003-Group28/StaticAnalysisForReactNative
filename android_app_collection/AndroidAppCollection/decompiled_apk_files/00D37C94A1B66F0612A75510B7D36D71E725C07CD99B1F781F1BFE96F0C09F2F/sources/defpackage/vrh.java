package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Date;
/* compiled from: PG */
/* renamed from: vrh  reason: default package */
/* loaded from: classes4.dex */
public final class vrh {
    public final OutputStream a;
    public final ByteArrayOutputStream b;
    public Exception c;
    public final Date d;
    public final vui e;

    public vrh(OutputStream outputStream, Date date, vui vuiVar) {
        this.e = vuiVar;
        outputStream.getClass();
        this.a = outputStream;
        this.d = date;
        this.b = new ByteArrayOutputStream();
    }

    public static long a(long j, int i, int i2) {
        return (j << i) | (((-1) >>> (64 - i)) & i2);
    }
}
