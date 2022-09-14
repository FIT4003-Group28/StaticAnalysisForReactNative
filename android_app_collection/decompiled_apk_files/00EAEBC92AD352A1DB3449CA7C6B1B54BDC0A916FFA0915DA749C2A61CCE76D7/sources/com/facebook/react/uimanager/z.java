package com.facebook.react.uimanager;
/* loaded from: classes.dex */
public class z {

    /* renamed from: a  reason: collision with root package name */
    private static int f6139a = 1;

    public static synchronized int a() {
        int i;
        synchronized (z.class) {
            i = f6139a;
            f6139a += 10;
        }
        return i;
    }
}
