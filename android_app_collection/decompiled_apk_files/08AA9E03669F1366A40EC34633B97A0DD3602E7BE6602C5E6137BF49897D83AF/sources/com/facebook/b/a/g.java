package com.facebook.b.a;

import com.facebook.b.a.a;
/* compiled from: NoOpCacheErrorLogger.java */
/* loaded from: classes.dex */
public class g implements a {

    /* renamed from: a  reason: collision with root package name */
    private static g f2175a;

    @Override // com.facebook.b.a.a
    public void a(a.EnumC0042a enumC0042a, Class<?> cls, String str, Throwable th) {
    }

    private g() {
    }

    public static synchronized g a() {
        g gVar;
        synchronized (g.class) {
            if (f2175a == null) {
                f2175a = new g();
            }
            gVar = f2175a;
        }
        return gVar;
    }
}
