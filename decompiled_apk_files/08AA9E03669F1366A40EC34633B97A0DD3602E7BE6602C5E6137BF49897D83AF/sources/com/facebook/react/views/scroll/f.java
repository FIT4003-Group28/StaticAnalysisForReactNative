package com.facebook.react.views.scroll;

import com.facebook.react.bridge.am;
import com.facebook.react.uimanager.o;
import java.util.Map;
/* compiled from: ReactScrollViewCommandHelper.java */
/* loaded from: classes.dex */
public class f {

    /* compiled from: ReactScrollViewCommandHelper.java */
    /* loaded from: classes.dex */
    public interface a<T> {
        void flashScrollIndicators(T t);

        void scrollTo(T t, b bVar);

        void scrollToEnd(T t, c cVar);
    }

    /* compiled from: ReactScrollViewCommandHelper.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f4034a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4035b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f4036c;

        b(int i, int i2, boolean z) {
            this.f4034a = i;
            this.f4035b = i2;
            this.f4036c = z;
        }
    }

    /* compiled from: ReactScrollViewCommandHelper.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f4037a;

        c(boolean z) {
            this.f4037a = z;
        }
    }

    public static Map<String, Integer> a() {
        return com.facebook.react.b.f.a("scrollTo", 1, "scrollToEnd", 2, "flashScrollIndicators", 3);
    }

    public static <T> void a(a<T> aVar, T t, int i, am amVar) {
        com.facebook.j.a.a.b(aVar);
        com.facebook.j.a.a.b(t);
        com.facebook.j.a.a.b(amVar);
        switch (i) {
            case 1:
                aVar.scrollTo(t, new b(Math.round(o.a(amVar.getDouble(0))), Math.round(o.a(amVar.getDouble(1))), amVar.getBoolean(2)));
                return;
            case 2:
                aVar.scrollToEnd(t, new c(amVar.getBoolean(0)));
                return;
            case 3:
                aVar.flashScrollIndicators(t);
                return;
            default:
                throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", Integer.valueOf(i), aVar.getClass().getSimpleName()));
        }
    }
}
