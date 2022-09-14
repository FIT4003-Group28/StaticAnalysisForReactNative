package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.b;
/* loaded from: classes.dex */
public class e extends m implements b.d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f9999a;

    public e(int i, ReadableMap readableMap, com.swmansion.reanimated.b bVar) {
        super(i, readableMap, bVar);
    }

    @Override // com.swmansion.reanimated.b.d
    public void b() {
        if (this.f9999a) {
            markUpdated();
            this.mNodesManager.a(this);
        }
    }

    public void c() {
        if (this.f9999a) {
            return;
        }
        this.f9999a = true;
        this.mNodesManager.a(this);
    }

    public void d() {
        this.f9999a = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.swmansion.reanimated.nodes.m
    /* renamed from: evaluate */
    public Double mo321evaluate() {
        return Double.valueOf(this.mNodesManager.o);
    }
}
