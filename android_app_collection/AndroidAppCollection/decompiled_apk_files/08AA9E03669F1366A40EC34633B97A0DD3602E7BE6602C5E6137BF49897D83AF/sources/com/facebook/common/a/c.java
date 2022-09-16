package com.facebook.common.a;
/* compiled from: NoOpDiskTrimmableRegistry.java */
/* loaded from: classes.dex */
public class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private static c f2259a;

    @Override // com.facebook.common.a.b
    public void a(a aVar) {
    }

    private c() {
    }

    public static synchronized c a() {
        c cVar;
        synchronized (c.class) {
            if (f2259a == null) {
                f2259a = new c();
            }
            cVar = f2259a;
        }
        return cVar;
    }
}
