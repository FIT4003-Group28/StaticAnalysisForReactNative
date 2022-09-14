package com.facebook.common.time;
/* compiled from: SystemClock.java */
/* loaded from: classes.dex */
public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private static final b f2334a = new b();

    private b() {
    }

    public static b b() {
        return f2334a;
    }

    @Override // com.facebook.common.time.a
    public long a() {
        return System.currentTimeMillis();
    }
}
