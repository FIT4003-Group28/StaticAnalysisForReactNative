package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class t extends m {

    /* renamed from: a  reason: collision with root package name */
    private List<d> f10029a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends d {

        /* renamed from: b  reason: collision with root package name */
        public int f10030b;

        private b() {
            super();
        }

        @Override // com.swmansion.reanimated.nodes.t.d
        public Object a(com.swmansion.reanimated.b bVar) {
            return bVar.b(this.f10030b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends d {

        /* renamed from: b  reason: collision with root package name */
        public Object f10031b;

        private c() {
            super();
        }

        @Override // com.swmansion.reanimated.nodes.t.d
        public Object a(com.swmansion.reanimated.b bVar) {
            return this.f10031b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class d {

        /* renamed from: a  reason: collision with root package name */
        public String f10032a;

        private d() {
        }

        public abstract Object a(com.swmansion.reanimated.b bVar);
    }

    public t(int i, ReadableMap readableMap, com.swmansion.reanimated.b bVar) {
        super(i, readableMap, bVar);
        this.f10029a = a(readableMap.getArray("transform"));
    }

    private static List<d> a(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList(readableArray.size());
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap mo209getMap = readableArray.mo209getMap(i);
            String string = mo209getMap.getString("property");
            if (mo209getMap.hasKey("nodeID")) {
                b bVar = new b();
                bVar.f10032a = string;
                bVar.f10030b = mo209getMap.getInt("nodeID");
                arrayList.add(bVar);
            } else {
                c cVar = new c();
                cVar.f10032a = string;
                cVar.f10031b = mo209getMap.getType("value") == ReadableType.String ? mo209getMap.getString("value") : Double.valueOf(mo209getMap.getDouble("value"));
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.swmansion.reanimated.nodes.m
    /* renamed from: evaluate */
    public WritableArray mo321evaluate() {
        ArrayList arrayList = new ArrayList(this.f10029a.size());
        for (d dVar : this.f10029a) {
            arrayList.add(JavaOnlyMap.of(dVar.f10032a, dVar.a(this.mNodesManager)));
        }
        return JavaOnlyArray.from(arrayList);
    }
}
