package com.facebook.react.views.b;

import com.facebook.imagepipeline.f.g;
import com.facebook.imagepipeline.f.j;
import java.util.List;
/* compiled from: MultiSourceHelper.java */
/* loaded from: classes.dex */
public class b {

    /* compiled from: MultiSourceHelper.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final com.facebook.react.views.b.a f3953a;

        /* renamed from: b  reason: collision with root package name */
        private final com.facebook.react.views.b.a f3954b;

        private a(com.facebook.react.views.b.a aVar, com.facebook.react.views.b.a aVar2) {
            this.f3953a = aVar;
            this.f3954b = aVar2;
        }

        public com.facebook.react.views.b.a a() {
            return this.f3953a;
        }

        public com.facebook.react.views.b.a b() {
            return this.f3954b;
        }
    }

    public static a a(int i, int i2, List<com.facebook.react.views.b.a> list) {
        return a(i, i2, list, 1.0d);
    }

    public static a a(int i, int i2, List<com.facebook.react.views.b.a> list, double d2) {
        if (list.isEmpty()) {
            return new a(null, null);
        }
        if (list.size() == 1) {
            return new a(list.get(0), null);
        }
        if (i <= 0 || i2 <= 0) {
            return new a(null, null);
        }
        g i3 = j.a().i();
        double d3 = i * i2 * d2;
        double d4 = Double.MAX_VALUE;
        double d5 = Double.MAX_VALUE;
        com.facebook.react.views.b.a aVar = null;
        com.facebook.react.views.b.a aVar2 = null;
        for (com.facebook.react.views.b.a aVar3 : list) {
            double abs = Math.abs(1.0d - (aVar3.c() / d3));
            if (abs < d4) {
                aVar2 = aVar3;
                d4 = abs;
            }
            if (abs < d5 && (i3.a(aVar3.b()) || i3.b(aVar3.b()))) {
                aVar = aVar3;
                d5 = abs;
            }
        }
        if (aVar != null && aVar2 != null && aVar.a().equals(aVar2.a())) {
            aVar = null;
        }
        return new a(aVar2, aVar);
    }
}
