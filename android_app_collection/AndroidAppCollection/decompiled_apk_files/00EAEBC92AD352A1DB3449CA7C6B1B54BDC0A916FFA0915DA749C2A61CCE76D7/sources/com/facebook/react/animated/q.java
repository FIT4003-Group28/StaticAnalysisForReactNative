package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class q extends b {

    /* renamed from: e  reason: collision with root package name */
    private final l f5395e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5396f;

    /* renamed from: g  reason: collision with root package name */
    private final int f5397g;

    /* renamed from: h  reason: collision with root package name */
    private final int f5398h;
    private final JavaOnlyMap i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(ReadableMap readableMap, l lVar) {
        this.f5395e = lVar;
        this.f5396f = readableMap.getInt("animationId");
        this.f5397g = readableMap.getInt("toValue");
        this.f5398h = readableMap.getInt("value");
        this.i = JavaOnlyMap.deepClone(readableMap.mo210getMap("animationConfig"));
    }

    @Override // com.facebook.react.animated.b
    public void a() {
        this.i.putDouble("toValue", ((s) this.f5395e.d(this.f5397g)).e());
        this.f5395e.a(this.f5396f, this.f5398h, this.i, null);
    }
}
