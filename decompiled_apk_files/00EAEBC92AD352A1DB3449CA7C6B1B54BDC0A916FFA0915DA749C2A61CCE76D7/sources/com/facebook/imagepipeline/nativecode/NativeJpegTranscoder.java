package com.facebook.imagepipeline.nativecode;

import c.d.d.d.i;
import java.io.InputStream;
import java.io.OutputStream;
@c.d.d.d.d
/* loaded from: classes.dex */
public class NativeJpegTranscoder implements c.d.j.q.c {

    /* renamed from: a  reason: collision with root package name */
    private boolean f5280a;

    /* renamed from: b  reason: collision with root package name */
    private int f5281b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5282c;

    static {
        d.a();
    }

    public NativeJpegTranscoder(boolean z, int i, boolean z2) {
        this.f5280a = z;
        this.f5281b = i;
        this.f5282c = z2;
    }

    public static void a(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) {
        d.a();
        boolean z = false;
        i.a(i2 >= 1);
        i.a(i2 <= 16);
        i.a(i3 >= 0);
        i.a(i3 <= 100);
        i.a(c.d.j.q.e.d(i));
        if (i2 != 8 || i != 0) {
            z = true;
        }
        i.a(z, "no transformation requested");
        i.a(inputStream);
        i.a(outputStream);
        nativeTranscodeJpeg(inputStream, outputStream, i, i2, i3);
    }

    public static void b(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) {
        d.a();
        boolean z = false;
        i.a(i2 >= 1);
        i.a(i2 <= 16);
        i.a(i3 >= 0);
        i.a(i3 <= 100);
        i.a(c.d.j.q.e.c(i));
        if (i2 != 8 || i != 1) {
            z = true;
        }
        i.a(z, "no transformation requested");
        i.a(inputStream);
        i.a(outputStream);
        nativeTranscodeJpegWithExifOrientation(inputStream, outputStream, i, i2, i3);
    }

    @c.d.d.d.d
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3);

    @c.d.d.d.d
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3);

    @Override // c.d.j.q.c
    public c.d.j.q.b a(c.d.j.k.d dVar, OutputStream outputStream, c.d.j.e.f fVar, c.d.j.e.e eVar, c.d.i.c cVar, Integer num) {
        if (num == null) {
            num = 85;
        }
        if (fVar == null) {
            fVar = c.d.j.e.f.e();
        }
        int a2 = c.d.j.q.a.a(fVar, eVar, dVar, this.f5281b);
        try {
            int a3 = c.d.j.q.e.a(fVar, eVar, dVar, this.f5280a);
            int a4 = c.d.j.q.e.a(a2);
            if (this.f5282c) {
                a3 = a4;
            }
            InputStream h2 = dVar.h();
            if (c.d.j.q.e.f3659a.contains(Integer.valueOf(dVar.e()))) {
                b(h2, outputStream, c.d.j.q.e.a(fVar, dVar), a3, num.intValue());
            } else {
                a(h2, outputStream, c.d.j.q.e.b(fVar, dVar), a3, num.intValue());
            }
            c.d.d.d.b.a(h2);
            int i = 1;
            if (a2 != 1) {
                i = 0;
            }
            return new c.d.j.q.b(i);
        } catch (Throwable th) {
            c.d.d.d.b.a(null);
            throw th;
        }
    }

    @Override // c.d.j.q.c
    public String a() {
        return "NativeJpegTranscoder";
    }

    @Override // c.d.j.q.c
    public boolean a(c.d.i.c cVar) {
        return cVar == c.d.i.b.f3144a;
    }

    @Override // c.d.j.q.c
    public boolean a(c.d.j.k.d dVar, c.d.j.e.f fVar, c.d.j.e.e eVar) {
        if (fVar == null) {
            fVar = c.d.j.e.f.e();
        }
        return c.d.j.q.e.a(fVar, eVar, dVar, this.f5280a) < 8;
    }
}
