package com.facebook.react.uimanager;

import com.facebook.yoga.YogaNode;
/* compiled from: YogaNodePool.java */
/* loaded from: classes.dex */
public class av {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f3835a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static com.facebook.react.b.a<YogaNode> f3836b;

    public static com.facebook.react.b.a<YogaNode> a() {
        com.facebook.react.b.a<YogaNode> aVar;
        if (f3836b != null) {
            return f3836b;
        }
        synchronized (f3835a) {
            if (f3836b == null) {
                f3836b = new com.facebook.react.b.a<>(1024);
            }
            aVar = f3836b;
        }
        return aVar;
    }
}
