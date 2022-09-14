package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class r extends com.facebook.react.animated.b {

    /* renamed from: e  reason: collision with root package name */
    private final l f5399e;

    /* renamed from: f  reason: collision with root package name */
    private final List<d> f5400f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends d {

        /* renamed from: b  reason: collision with root package name */
        public int f5401b;

        private b(r rVar) {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c extends d {

        /* renamed from: b  reason: collision with root package name */
        public double f5402b;

        private c(r rVar) {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        public String f5403a;

        private d(r rVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.facebook.react.animated.r$d, com.facebook.react.animated.r$c] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.facebook.react.animated.r$d, com.facebook.react.animated.r$b] */
    public r(ReadableMap readableMap, l lVar) {
        ?? cVar;
        ReadableArray array = readableMap.getArray("transforms");
        this.f5400f = new ArrayList(array.size());
        for (int i = 0; i < array.size(); i++) {
            ReadableMap mo209getMap = array.mo209getMap(i);
            String string = mo209getMap.getString("property");
            if (mo209getMap.getString("type").equals("animated")) {
                cVar = new b();
                cVar.f5403a = string;
                cVar.f5401b = mo209getMap.getInt("nodeTag");
            } else {
                cVar = new c();
                cVar.f5403a = string;
                cVar.f5402b = mo209getMap.getDouble("value");
            }
            this.f5400f.add(cVar);
        }
        this.f5399e = lVar;
    }

    public void a(JavaOnlyMap javaOnlyMap) {
        double d2;
        ArrayList arrayList = new ArrayList(this.f5400f.size());
        for (d dVar : this.f5400f) {
            if (dVar instanceof b) {
                com.facebook.react.animated.b d3 = this.f5399e.d(((b) dVar).f5401b);
                if (d3 == null) {
                    throw new IllegalArgumentException("Mapped style node does not exists");
                }
                if (!(d3 instanceof s)) {
                    throw new IllegalArgumentException("Unsupported type of node used as a transform child node " + d3.getClass());
                }
                d2 = ((s) d3).e();
            } else {
                d2 = ((c) dVar).f5402b;
            }
            arrayList.add(JavaOnlyMap.of(dVar.f5403a, Double.valueOf(d2)));
        }
        javaOnlyMap.putArray("transform", JavaOnlyArray.from(arrayList));
    }
}
