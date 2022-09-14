package com.google.firebase.installations.r;

import com.google.firebase.installations.r.b;
/* loaded from: classes.dex */
public abstract class e {

    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract a a(long j);

        public abstract a a(b bVar);

        public abstract a a(String str);

        public abstract e a();
    }

    /* loaded from: classes.dex */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a d() {
        b.C0189b c0189b = new b.C0189b();
        c0189b.a(0L);
        return c0189b;
    }

    public abstract b a();

    public abstract String b();

    public abstract long c();
}
