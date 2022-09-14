package com.facebook.common.time;
/* loaded from: classes.dex */
public class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private static final c f5184a = new c();

    private c() {
    }

    public static c a() {
        return f5184a;
    }

    @Override // com.facebook.common.time.a
    public long now() {
        return System.currentTimeMillis();
    }
}
