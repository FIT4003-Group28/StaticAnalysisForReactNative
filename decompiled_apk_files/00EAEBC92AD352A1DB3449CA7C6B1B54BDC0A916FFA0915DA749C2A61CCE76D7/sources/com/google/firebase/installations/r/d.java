package com.google.firebase.installations.r;

import com.google.firebase.installations.r.a;
/* loaded from: classes.dex */
public abstract class d {

    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract a a(b bVar);

        public abstract a a(e eVar);

        public abstract a a(String str);

        public abstract d a();

        public abstract a b(String str);

        public abstract a c(String str);
    }

    /* loaded from: classes.dex */
    public enum b {
        OK,
        BAD_CONFIG
    }

    public static a f() {
        return new a.b();
    }

    public abstract e a();

    public abstract String b();

    public abstract String c();

    public abstract b d();

    public abstract String e();
}
