package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.AbstractHttpEntity;
/* compiled from: PG */
/* renamed from: aipe  reason: default package */
/* loaded from: classes.dex */
public final class aipe extends AbstractHttpEntity {
    private final asv a;
    private final asy b;
    private axe c;

    public aipe(asv asvVar, asy asyVar) {
        asvVar.getClass();
        this.a = asvVar;
        this.b = asyVar;
        setContentType("video/mp4");
    }

    public final synchronized InputStream getContent() {
        if (this.c == null) {
            this.c = new axe(this.a, this.b);
        }
        return this.c;
    }

    public final long getContentLength() {
        return this.b.h;
    }

    public final boolean isRepeatable() {
        return false;
    }

    public final boolean isStreaming() {
        return true;
    }

    public final void writeTo(OutputStream outputStream) {
        outputStream.getClass();
        InputStream content = getContent();
        try {
            anek.g(content, outputStream);
        } finally {
            content.close();
        }
    }
}
