package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: dasy  reason: default package */
/* loaded from: classes5.dex */
public abstract class dasy {
    private final String g(Object obj, boolean z) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Charset charset = datw.a;
        dasz e = e(byteArrayOutputStream);
        if (z) {
            e.q();
        }
        e.p(obj);
        e.a();
        return byteArrayOutputStream.toString("UTF-8");
    }

    public abstract datc a(InputStream inputStream);

    public abstract datc b(String str);

    public final String c(Object obj) {
        return g(obj, false);
    }

    public final String d(Object obj) {
        return g(obj, true);
    }

    public abstract dasz e(OutputStream outputStream);

    public abstract datc f(InputStream inputStream);
}
