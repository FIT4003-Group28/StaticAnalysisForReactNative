package com.facebook.react.j0.b;

import c.d.j.f.h;
import c.d.j.f.k;
import java.util.List;
/* loaded from: classes.dex */
public class b {

    /* renamed from: com.facebook.react.j0.b.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0124b {

        /* renamed from: a  reason: collision with root package name */
        private final com.facebook.react.j0.b.a f5547a;

        /* renamed from: b  reason: collision with root package name */
        private final com.facebook.react.j0.b.a f5548b;

        private C0124b(com.facebook.react.j0.b.a aVar, com.facebook.react.j0.b.a aVar2) {
            this.f5547a = aVar;
            this.f5548b = aVar2;
        }

        public com.facebook.react.j0.b.a a() {
            return this.f5547a;
        }

        public com.facebook.react.j0.b.a b() {
            return this.f5548b;
        }
    }

    public static C0124b a(int i, int i2, List<com.facebook.react.j0.b.a> list) {
        return a(i, i2, list, 1.0d);
    }

    public static C0124b a(int i, int i2, List<com.facebook.react.j0.b.a> list, double d2) {
        if (list.isEmpty()) {
            return new C0124b(null, null);
        }
        if (list.size() == 1) {
            return new C0124b(list.get(0), null);
        }
        if (i <= 0 || i2 <= 0) {
            return new C0124b(null, null);
        }
        h f2 = k.o().f();
        double d3 = i * i2 * d2;
        double d4 = Double.MAX_VALUE;
        double d5 = Double.MAX_VALUE;
        com.facebook.react.j0.b.a aVar = null;
        com.facebook.react.j0.b.a aVar2 = null;
        for (com.facebook.react.j0.b.a aVar3 : list) {
            double abs = Math.abs(1.0d - (aVar3.a() / d3));
            if (abs < d4) {
                aVar2 = aVar3;
                d4 = abs;
            }
            if (abs < d5 && (f2.a(aVar3.c()) || f2.b(aVar3.c()))) {
                aVar = aVar3;
                d5 = abs;
            }
        }
        if (aVar != null && aVar2 != null && aVar.b().equals(aVar2.b())) {
            aVar = null;
        }
        return new C0124b(aVar2, aVar);
    }
}
