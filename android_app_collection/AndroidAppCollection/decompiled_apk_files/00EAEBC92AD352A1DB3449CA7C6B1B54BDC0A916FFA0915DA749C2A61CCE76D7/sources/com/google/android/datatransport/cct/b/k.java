package com.google.android.datatransport.cct.b;

import com.google.android.datatransport.cct.b.e;
/* loaded from: classes.dex */
public abstract class k {

    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract a a(com.google.android.datatransport.cct.b.a aVar);

        public abstract a a(b bVar);

        public abstract k a();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: classes.dex */
    public static final class b extends Enum<b> {

        /* renamed from: b  reason: collision with root package name */
        public static final b f6650b = new b("UNKNOWN", 0, 0);

        /* renamed from: c  reason: collision with root package name */
        public static final b f6651c = new b("ANDROID_FIREBASE", 1, 23);

        static {
            b[] bVarArr = {f6650b, f6651c};
        }

        private b(String str, int i, int i2) {
        }
    }

    public static a c() {
        return new e.b();
    }

    public abstract com.google.android.datatransport.cct.b.a a();

    public abstract b b();
}
