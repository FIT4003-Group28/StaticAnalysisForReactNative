package com.facebook.h;

import com.facebook.common.d.i;
import com.facebook.common.d.m;
import com.facebook.h.c;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
/* compiled from: ImageFormatChecker.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static d f2516a;

    /* renamed from: b  reason: collision with root package name */
    private int f2517b;

    /* renamed from: c  reason: collision with root package name */
    private List<c.a> f2518c;

    /* renamed from: d  reason: collision with root package name */
    private final c.a f2519d = new a();

    private d() {
        b();
    }

    public void a(List<c.a> list) {
        this.f2518c = list;
        b();
    }

    public c a(InputStream inputStream) {
        i.a(inputStream);
        byte[] bArr = new byte[this.f2517b];
        int a2 = a(this.f2517b, inputStream, bArr);
        if (this.f2518c != null) {
            for (c.a aVar : this.f2518c) {
                c a3 = aVar.a(bArr, a2);
                if (a3 != null && a3 != c.f2513a) {
                    return a3;
                }
            }
        }
        c a4 = this.f2519d.a(bArr, a2);
        return a4 == null ? c.f2513a : a4;
    }

    private void b() {
        this.f2517b = this.f2519d.a();
        if (this.f2518c != null) {
            for (c.a aVar : this.f2518c) {
                this.f2517b = Math.max(this.f2517b, aVar.a());
            }
        }
    }

    private static int a(int i, InputStream inputStream, byte[] bArr) {
        i.a(inputStream);
        i.a(bArr);
        i.a(bArr.length >= i);
        if (inputStream.markSupported()) {
            try {
                inputStream.mark(i);
                return com.facebook.common.d.a.a(inputStream, bArr, 0, i);
            } finally {
                inputStream.reset();
            }
        }
        return com.facebook.common.d.a.a(inputStream, bArr, 0, i);
    }

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            if (f2516a == null) {
                f2516a = new d();
            }
            dVar = f2516a;
        }
        return dVar;
    }

    public static c b(InputStream inputStream) {
        return a().a(inputStream);
    }

    public static c c(InputStream inputStream) {
        try {
            return b(inputStream);
        } catch (IOException e) {
            throw m.b(e);
        }
    }
}
