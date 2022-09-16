package com.facebook.common.g;
/* compiled from: NoOpMemoryTrimmableRegistry.java */
/* loaded from: classes.dex */
public class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private static d f2281a;

    @Override // com.facebook.common.g.c
    public void a(b bVar) {
    }

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            if (f2281a == null) {
                f2281a = new d();
            }
            dVar = f2281a;
        }
        return dVar;
    }
}
