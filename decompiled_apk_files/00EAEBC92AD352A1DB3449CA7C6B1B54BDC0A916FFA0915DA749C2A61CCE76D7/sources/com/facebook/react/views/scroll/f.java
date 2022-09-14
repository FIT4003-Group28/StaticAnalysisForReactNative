package com.facebook.react.views.scroll;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.q;
import java.util.Map;
/* loaded from: classes.dex */
public class f {

    /* loaded from: classes.dex */
    public interface a<T> {
        void flashScrollIndicators(T t);

        void scrollTo(T t, b bVar);

        void scrollToEnd(T t, c cVar);
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f6225a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6226b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f6227c;

        b(int i, int i2, boolean z) {
            this.f6225a = i;
            this.f6226b = i2;
            this.f6227c = z;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f6228a;

        c(boolean z) {
            this.f6228a = z;
        }
    }

    public static Map<String, Integer> a() {
        return com.facebook.react.common.f.a("scrollTo", 1, "scrollToEnd", 2, "flashScrollIndicators", 3);
    }

    public static <T> void a(a<T> aVar, T t, int i, ReadableArray readableArray) {
        c.d.k.a.a.a(aVar);
        c.d.k.a.a.a(t);
        c.d.k.a.a.a(readableArray);
        if (i == 1) {
            a(aVar, t, readableArray);
        } else if (i == 2) {
            b(aVar, t, readableArray);
        } else if (i != 3) {
            throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", Integer.valueOf(i), aVar.getClass().getSimpleName()));
        } else {
            aVar.flashScrollIndicators(t);
        }
    }

    private static <T> void a(a<T> aVar, T t, ReadableArray readableArray) {
        aVar.scrollTo(t, new b(Math.round(q.a(readableArray.getDouble(0))), Math.round(q.a(readableArray.getDouble(1))), readableArray.getBoolean(2)));
    }

    public static <T> void a(a<T> aVar, T t, String str, ReadableArray readableArray) {
        char c2;
        c.d.k.a.a.a(aVar);
        c.d.k.a.a.a(t);
        c.d.k.a.a.a(readableArray);
        int hashCode = str.hashCode();
        if (hashCode == -402165208) {
            if (str.equals("scrollTo")) {
                c2 = 0;
            }
            c2 = 65535;
        } else if (hashCode != 28425985) {
            if (hashCode == 2055114131 && str.equals("scrollToEnd")) {
                c2 = 1;
            }
            c2 = 65535;
        } else {
            if (str.equals("flashScrollIndicators")) {
                c2 = 2;
            }
            c2 = 65535;
        }
        if (c2 == 0) {
            a(aVar, t, readableArray);
        } else if (c2 == 1) {
            b(aVar, t, readableArray);
        } else if (c2 != 2) {
            throw new IllegalArgumentException(String.format("Unsupported command %s received by %s.", str, aVar.getClass().getSimpleName()));
        } else {
            aVar.flashScrollIndicators(t);
        }
    }

    private static <T> void b(a<T> aVar, T t, ReadableArray readableArray) {
        aVar.scrollToEnd(t, new c(readableArray.getBoolean(0)));
    }
}
