package defpackage;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: axpq  reason: default package */
/* loaded from: classes2.dex */
public class axpq {
    public static final Pattern e = Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);
    public static final Pattern f = Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);
    public static final Pattern g = Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");
    public static final Logger h = Logger.getLogger(axpq.class.getName());
    public final String i;
    public volatile ServerSocket j;
    public Thread k;
    protected final axpf l = new axpf();

    public axpq(String str) {
        this.i = str;
    }

    public static axpn i(axpl axplVar, String str, InputStream inputStream, long j) {
        return new axpn(axplVar, str, inputStream, j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String j(String str) {
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e2) {
            h.log(Level.WARNING, "Encoding not supported, ignored", (Throwable) e2);
            return null;
        }
    }

    public static final void l(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                } else if (obj instanceof Socket) {
                    ((Socket) obj).close();
                } else if (obj instanceof ServerSocket) {
                    ((ServerSocket) obj).close();
                } else {
                    throw new IllegalArgumentException("Unknown object to close");
                }
            } catch (IOException e2) {
                h.log(Level.SEVERE, "Could not close", (Throwable) e2);
            }
        }
    }

    public static axpn n(axpl axplVar, String str) {
        byte[] bArr;
        String str2;
        Pattern pattern = axpd.a;
        String str3 = "text/plain";
        String str4 = "";
        String a = axpd.a(str3, axpd.a, str4, 1);
        String a2 = axpd.a(str3, axpd.b, null, 2);
        if ("multipart/form-data".equalsIgnoreCase(a)) {
            axpd.a(str3, axpd.c, null, 2);
        }
        if (str == null) {
            return i(axplVar, str3, new ByteArrayInputStream(new byte[0]), 0L);
        }
        try {
            if (!Charset.forName(axpd.b(a2)).newEncoder().canEncode(str) && a2 == null) {
                String concat = str3.concat("; charset=UTF-8");
                if (concat != null) {
                    str4 = axpd.a(concat, axpd.a, str4, 1);
                    str2 = axpd.a(concat, axpd.b, null, 2);
                } else {
                    str2 = "UTF-8";
                }
                if ("multipart/form-data".equalsIgnoreCase(str4)) {
                    axpd.a(concat, axpd.c, null, 2);
                }
                str3 = concat;
                a2 = str2;
            }
            bArr = str.getBytes(axpd.b(a2));
        } catch (UnsupportedEncodingException e2) {
            h.log(Level.SEVERE, "encoding problem, responding nothing", (Throwable) e2);
            bArr = new byte[0];
        }
        return i(axplVar, str3, new ByteArrayInputStream(bArr), bArr.length);
    }

    public axpn a(axpj axpjVar) {
        throw null;
    }

    public void f() {
        throw null;
    }

    public final synchronized void k() {
        f();
    }

    public final boolean m() {
        return this.j != null && this.k != null && !this.j.isClosed() && this.k.isAlive();
    }
}
