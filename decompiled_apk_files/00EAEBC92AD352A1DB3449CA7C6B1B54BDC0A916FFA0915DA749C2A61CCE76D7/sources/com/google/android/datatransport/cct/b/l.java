package com.google.android.datatransport.cct.b;

import com.google.android.datatransport.cct.b.f;
/* loaded from: classes.dex */
public abstract class l {

    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract a a(long j);

        public abstract a a(o oVar);

        public abstract a a(Integer num);

        public abstract l a();

        public abstract a b(long j);

        public abstract a c(long j);
    }

    public static a a(String str) {
        f.b bVar = new f.b();
        bVar.a(str);
        return bVar;
    }

    public static a a(byte[] bArr) {
        f.b bVar = new f.b();
        bVar.a(bArr);
        return bVar;
    }

    public abstract Integer a();

    public abstract long b();

    public abstract long c();

    public abstract o d();

    public abstract byte[] e();

    public abstract String f();

    public abstract long g();
}
