package com.facebook.react.uimanager;
/* compiled from: ReactRootViewTagGenerator.java */
/* loaded from: classes.dex */
public class v {

    /* renamed from: a  reason: collision with root package name */
    private static int f3937a = 1;

    public static synchronized int a() {
        int i;
        synchronized (v.class) {
            i = f3937a;
            f3937a += 10;
        }
        return i;
    }
}
