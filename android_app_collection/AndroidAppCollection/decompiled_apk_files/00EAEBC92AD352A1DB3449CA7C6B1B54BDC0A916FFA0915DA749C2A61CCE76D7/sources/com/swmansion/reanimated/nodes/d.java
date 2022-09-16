package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes.dex */
public class d extends m {

    /* renamed from: a  reason: collision with root package name */
    private String f9995a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9996b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f9997c;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f9998d;

    public d(int i, ReadableMap readableMap, com.swmansion.reanimated.b bVar) {
        super(i, readableMap, bVar);
        this.f9996b = readableMap.getInt("what");
        this.f9998d = com.swmansion.reanimated.e.a(readableMap.getArray("params"));
        this.f9997c = com.swmansion.reanimated.e.a(readableMap.getArray("args"));
    }

    private void c() {
        com.swmansion.reanimated.d dVar = this.mNodesManager.p;
        this.f9995a = dVar.f9976b;
        dVar.f9976b = this.mNodesManager.p.f9976b + '/' + String.valueOf(this.mNodeID);
        int i = 0;
        while (true) {
            int[] iArr = this.f9998d;
            if (i < iArr.length) {
                ((p) this.mNodesManager.a(iArr[i], p.class)).a(Integer.valueOf(this.f9997c[i]), this.f9995a);
                i++;
            } else {
                return;
            }
        }
    }

    private void d() {
        int i = 0;
        while (true) {
            int[] iArr = this.f9998d;
            if (i >= iArr.length) {
                this.mNodesManager.p.f9976b = this.f9995a;
                return;
            }
            ((p) this.mNodesManager.a(iArr[i], p.class)).c();
            i++;
        }
    }

    @Override // com.swmansion.reanimated.nodes.m
    /* renamed from: evaluate */
    protected Object mo321evaluate() {
        c();
        Object value = this.mNodesManager.a(this.f9996b, m.class).value();
        d();
        return value;
    }
}
