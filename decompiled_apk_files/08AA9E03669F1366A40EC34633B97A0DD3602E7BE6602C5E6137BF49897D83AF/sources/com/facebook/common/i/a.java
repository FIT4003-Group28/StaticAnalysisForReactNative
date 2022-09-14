package com.facebook.common.i;
/* compiled from: SoLoaderShim.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f2310a = new C0051a();

    /* compiled from: SoLoaderShim.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(String str);
    }

    /* compiled from: SoLoaderShim.java */
    /* renamed from: com.facebook.common.i.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0051a implements b {
        @Override // com.facebook.common.i.a.b
        public void a(String str) {
            System.loadLibrary(str);
        }
    }

    public static void a(b bVar) {
        if (bVar == null) {
            throw new NullPointerException("Handler cannot be null");
        }
        f2310a = bVar;
    }

    public static void a(String str) {
        f2310a.a(str);
    }
}
