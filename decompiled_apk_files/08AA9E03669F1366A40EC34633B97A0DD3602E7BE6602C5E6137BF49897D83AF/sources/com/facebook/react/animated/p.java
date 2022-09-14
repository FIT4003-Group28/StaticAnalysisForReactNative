package com.facebook.react.animated;

import com.facebook.react.bridge.am;
import com.facebook.react.bridge.an;
import com.facebook.react.bridge.s;
import com.facebook.react.bridge.t;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TransformAnimatedNode.java */
/* loaded from: classes.dex */
public class p extends com.facebook.react.animated.b {
    private final l e;
    private final List<c> f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TransformAnimatedNode.java */
    /* loaded from: classes.dex */
    public class c {

        /* renamed from: c  reason: collision with root package name */
        public String f3161c;

        private c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TransformAnimatedNode.java */
    /* loaded from: classes.dex */
    public class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public int f3157a;

        private a() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TransformAnimatedNode.java */
    /* loaded from: classes.dex */
    public class b extends c {

        /* renamed from: a  reason: collision with root package name */
        public double f3159a;

        private b() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(an anVar, l lVar) {
        am e = anVar.e("transforms");
        this.f = new ArrayList(e.size());
        for (int i = 0; i < e.size(); i++) {
            an c2 = e.c(i);
            String string = c2.getString("property");
            if (c2.getString("type").equals("animated")) {
                a aVar = new a();
                aVar.f3161c = string;
                aVar.f3157a = c2.getInt("nodeTag");
                this.f.add(aVar);
            } else {
                b bVar = new b();
                bVar.f3161c = string;
                bVar.f3159a = c2.getDouble("value");
                this.f.add(bVar);
            }
        }
        this.e = lVar;
    }

    public void a(t tVar) {
        double d2;
        ArrayList arrayList = new ArrayList(this.f.size());
        for (c cVar : this.f) {
            if (cVar instanceof a) {
                com.facebook.react.animated.b a2 = this.e.a(((a) cVar).f3157a);
                if (a2 == null) {
                    throw new IllegalArgumentException("Mapped style node does not exists");
                }
                if (a2 instanceof q) {
                    d2 = ((q) a2).b();
                } else {
                    throw new IllegalArgumentException("Unsupported type of node used as a transform child node " + a2.getClass());
                }
            } else {
                d2 = ((b) cVar).f3159a;
            }
            arrayList.add(t.a(cVar.f3161c, Double.valueOf(d2)));
        }
        tVar.a("transform", s.a(arrayList));
    }
}
