package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;
/* compiled from: PG */
/* renamed from: dasf  reason: default package */
/* loaded from: classes5.dex */
public final class dasf {
    public final String a;
    final dasm b;
    public final int c;
    public final String d;
    private InputStream e;
    private final String f;
    private final dasb g;
    private final dasc h;
    private boolean i;

    public dasf(dasc dascVar, dasm dasmVar) {
        StringBuilder sb;
        this.h = dascVar;
        this.b = dasmVar;
        this.f = dasmVar.b();
        int e = dasmVar.e();
        e = e < 0 ? 0 : e;
        this.c = e;
        String f = dasmVar.f();
        this.d = f;
        Logger logger = dasj.a;
        boolean isLoggable = logger.isLoggable(Level.CONFIG);
        dasb dasbVar = null;
        if (isLoggable) {
            sb = new StringBuilder();
            sb.append("-------------- RESPONSE --------------");
            sb.append(daux.a);
            String d = dasmVar.d();
            if (d != null) {
                sb.append(d);
            } else {
                sb.append(e);
                if (f != null) {
                    sb.append(' ');
                    sb.append(f);
                }
            }
            sb.append(daux.a);
        } else {
            sb = null;
        }
        dascVar.c.c(dasmVar, true != isLoggable ? null : sb);
        String c = dasmVar.c();
        c = c == null ? (String) dasa.g(dascVar.c.contentType) : c;
        this.a = c;
        if (c != null) {
            try {
                dasbVar = new dasb(c);
            } catch (IllegalArgumentException unused) {
            }
        }
        this.g = dasbVar;
        if (isLoggable) {
            logger.logp(Level.CONFIG, "com.google.api.client.http.HttpResponse", "<init>", sb.toString());
        }
    }

    public final dasa a() {
        return this.h.c;
    }

    public final boolean b() {
        return dasi.a(this.c);
    }

    public final InputStream c() {
        if (!this.i) {
            InputStream a = this.b.a();
            if (a != null) {
                try {
                    String str = this.f;
                    if (str != null && str.contains("gzip")) {
                        a = new GZIPInputStream(a);
                    }
                    Logger logger = dasj.a;
                    if (logger.isLoggable(Level.CONFIG)) {
                        a = new daup(a, logger, Level.CONFIG);
                    }
                    this.e = a;
                } catch (EOFException unused) {
                    a.close();
                } catch (Throwable th) {
                    a.close();
                    throw th;
                }
            }
            this.i = true;
        }
        return this.e;
    }

    public final void d() {
        InputStream c = c();
        if (c != null) {
            c.close();
        }
    }

    public final void e() {
        d();
        this.b.j();
    }

    public final <T> T f(Class<T> cls) {
        int i = this.c;
        if (this.h.f.equals("HEAD") || i / 100 == 1 || i == 204 || i == 304) {
            d();
            return null;
        }
        return (T) this.h.k.b(c(), h(), cls);
    }

    public final String g() {
        InputStream c = c();
        if (c == null) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        daum.b(c, byteArrayOutputStream);
        return byteArrayOutputStream.toString(h().name());
    }

    public final Charset h() {
        dasb dasbVar = this.g;
        if (dasbVar == null || dasbVar.d() == null) {
            return datw.b;
        }
        return this.g.d();
    }
}
