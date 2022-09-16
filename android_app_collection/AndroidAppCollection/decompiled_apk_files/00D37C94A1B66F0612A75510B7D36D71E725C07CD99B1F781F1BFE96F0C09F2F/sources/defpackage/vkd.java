package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: PG */
/* renamed from: vkd  reason: default package */
/* loaded from: classes4.dex */
public final class vkd {
    public final vjb a;
    public final Uri b;

    public vkd(vjb vjbVar, Uri uri) {
        this.a = vjbVar;
        this.b = uri;
    }

    public final void a(InputStream inputStream, long j) {
        vja b;
        long a = this.a.a(this.b);
        if (j > a) {
            throw new IOException(String.format("Invalid resumed download; offsetBytes exceeds the existing data size: %d, %d", Long.valueOf(j), Long.valueOf(a)));
        }
        if (j > 0) {
            b = new vkg();
        } else {
            b = vkl.b();
        }
        OutputStream outputStream = (OutputStream) this.a.c(this.b, b);
        try {
            anek.g(inputStream, outputStream);
            if (outputStream == null) {
                return;
            }
            outputStream.close();
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
