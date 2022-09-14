package com.google.android.datatransport.cct.b;

import com.google.android.datatransport.cct.b.g;
import java.util.List;
/* loaded from: classes.dex */
public abstract class m {

    /* loaded from: classes.dex */
    public static abstract class a {
        public a a(int i) {
            a(Integer.valueOf(i));
            return this;
        }

        public abstract a a(long j);

        public abstract a a(k kVar);

        public abstract a a(p pVar);

        abstract a a(Integer num);

        abstract a a(String str);

        public abstract a a(List<l> list);

        public abstract m a();

        public abstract a b(long j);

        public a b(String str) {
            a(str);
            return this;
        }
    }

    public static a h() {
        return new g.b();
    }

    public abstract k a();

    public abstract List<l> b();

    public abstract Integer c();

    public abstract String d();

    public abstract p e();

    public abstract long f();

    public abstract long g();
}
