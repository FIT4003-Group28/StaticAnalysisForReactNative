package android.support.v4.h;
/* compiled from: TextDirectionHeuristicsCompat.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final android.support.v4.h.b f427a = new e(null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final android.support.v4.h.b f428b = new e(null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final android.support.v4.h.b f429c = new e(b.f434a, false);

    /* renamed from: d  reason: collision with root package name */
    public static final android.support.v4.h.b f430d = new e(b.f434a, true);
    public static final android.support.v4.h.b e = new e(a.f431a, false);
    public static final android.support.v4.h.b f = f.f437a;

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* renamed from: android.support.v4.h.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private interface InterfaceC0009c {
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes.dex */
    private static abstract class d implements android.support.v4.h.b {

        /* renamed from: a  reason: collision with root package name */
        private final InterfaceC0009c f435a;

        d(InterfaceC0009c interfaceC0009c) {
            this.f435a = interfaceC0009c;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes.dex */
    private static class e extends d {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f436a;

        e(InterfaceC0009c interfaceC0009c, boolean z) {
            super(interfaceC0009c);
            this.f436a = z;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes.dex */
    private static class b implements InterfaceC0009c {

        /* renamed from: a  reason: collision with root package name */
        static final b f434a = new b();

        private b() {
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes.dex */
    private static class a implements InterfaceC0009c {

        /* renamed from: a  reason: collision with root package name */
        static final a f431a = new a(true);

        /* renamed from: b  reason: collision with root package name */
        static final a f432b = new a(false);

        /* renamed from: c  reason: collision with root package name */
        private final boolean f433c;

        private a(boolean z) {
            this.f433c = z;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes.dex */
    private static class f extends d {

        /* renamed from: a  reason: collision with root package name */
        static final f f437a = new f();

        f() {
            super(null);
        }
    }
}
