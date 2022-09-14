package c.d.i;

import c.d.d.d.i;
import c.d.d.d.n;
import c.d.i.c;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
/* loaded from: classes.dex */
public class d {

    /* renamed from: d  reason: collision with root package name */
    private static d f3154d;

    /* renamed from: a  reason: collision with root package name */
    private int f3155a;

    /* renamed from: b  reason: collision with root package name */
    private List<c.a> f3156b;

    /* renamed from: c  reason: collision with root package name */
    private final c.a f3157c = new a();

    private d() {
        b();
    }

    private static int a(int i, InputStream inputStream, byte[] bArr) {
        i.a(inputStream);
        i.a(bArr);
        i.a(bArr.length >= i);
        if (inputStream.markSupported()) {
            try {
                inputStream.mark(i);
                return c.d.d.d.a.a(inputStream, bArr, 0, i);
            } finally {
                inputStream.reset();
            }
        }
        return c.d.d.d.a.a(inputStream, bArr, 0, i);
    }

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            if (f3154d == null) {
                f3154d = new d();
            }
            dVar = f3154d;
        }
        return dVar;
    }

    public static c b(InputStream inputStream) {
        return a().a(inputStream);
    }

    private void b() {
        this.f3155a = this.f3157c.a();
        List<c.a> list = this.f3156b;
        if (list != null) {
            for (c.a aVar : list) {
                this.f3155a = Math.max(this.f3155a, aVar.a());
            }
        }
    }

    public static c c(InputStream inputStream) {
        try {
            return b(inputStream);
        } catch (IOException e2) {
            n.a(e2);
            throw null;
        }
    }

    public c a(InputStream inputStream) {
        i.a(inputStream);
        int i = this.f3155a;
        byte[] bArr = new byte[i];
        int a2 = a(i, inputStream, bArr);
        c a3 = this.f3157c.a(bArr, a2);
        if (a3 == null || a3 == c.f3152b) {
            List<c.a> list = this.f3156b;
            if (list != null) {
                for (c.a aVar : list) {
                    c a4 = aVar.a(bArr, a2);
                    if (a4 != null && a4 != c.f3152b) {
                        return a4;
                    }
                }
            }
            return c.f3152b;
        }
        return a3;
    }
}
