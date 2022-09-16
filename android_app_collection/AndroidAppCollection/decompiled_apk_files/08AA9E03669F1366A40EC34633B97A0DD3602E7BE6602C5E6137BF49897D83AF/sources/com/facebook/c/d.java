package com.facebook.c;

import com.facebook.common.d.k;
/* compiled from: DataSources.java */
/* loaded from: classes.dex */
public class d {
    public static <T> c<T> a(Throwable th) {
        h j = h.j();
        j.a(th);
        return j;
    }

    public static <T> k<c<T>> b(final Throwable th) {
        return new k<c<T>>() { // from class: com.facebook.c.d.1
            @Override // com.facebook.common.d.k
            /* renamed from: a */
            public c<T> b() {
                return d.a(th);
            }
        };
    }
}
