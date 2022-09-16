package com.facebook.react.uimanager;
/* loaded from: classes.dex */
public class d1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f5890a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static com.facebook.react.common.a<com.facebook.yoga.p> f5891b;

    public static com.facebook.react.common.a<com.facebook.yoga.p> a() {
        com.facebook.react.common.a<com.facebook.yoga.p> aVar;
        com.facebook.react.common.a<com.facebook.yoga.p> aVar2 = f5891b;
        if (aVar2 != null) {
            return aVar2;
        }
        synchronized (f5890a) {
            if (f5891b == null) {
                f5891b = new com.facebook.react.common.a<>(1024);
            }
            aVar = f5891b;
        }
        return aVar;
    }
}
