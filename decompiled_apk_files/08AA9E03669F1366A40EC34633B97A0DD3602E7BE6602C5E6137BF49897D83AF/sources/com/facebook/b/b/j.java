package com.facebook.b.b;

import com.facebook.b.a.c;
import java.io.IOException;
/* compiled from: SettableCacheEvent.java */
/* loaded from: classes.dex */
public class j implements com.facebook.b.a.b {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f2228a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static j f2229b;

    /* renamed from: c  reason: collision with root package name */
    private static int f2230c;

    /* renamed from: d  reason: collision with root package name */
    private com.facebook.b.a.d f2231d;
    private String e;
    private long f;
    private long g;
    private long h;
    private IOException i;
    private c.a j;
    private j k;

    public static j a() {
        synchronized (f2228a) {
            if (f2229b != null) {
                j jVar = f2229b;
                f2229b = jVar.k;
                jVar.k = null;
                f2230c--;
                return jVar;
            }
            return new j();
        }
    }

    private j() {
    }

    public j a(com.facebook.b.a.d dVar) {
        this.f2231d = dVar;
        return this;
    }

    public j a(String str) {
        this.e = str;
        return this;
    }

    public j a(long j) {
        this.f = j;
        return this;
    }

    public j b(long j) {
        this.h = j;
        return this;
    }

    public j c(long j) {
        this.g = j;
        return this;
    }

    public j a(IOException iOException) {
        this.i = iOException;
        return this;
    }

    public j a(c.a aVar) {
        this.j = aVar;
        return this;
    }

    public void b() {
        synchronized (f2228a) {
            if (f2230c < 5) {
                c();
                f2230c++;
                if (f2229b != null) {
                    this.k = f2229b;
                }
                f2229b = this;
            }
        }
    }

    private void c() {
        this.f2231d = null;
        this.e = null;
        this.f = 0L;
        this.g = 0L;
        this.h = 0L;
        this.i = null;
        this.j = null;
    }
}
