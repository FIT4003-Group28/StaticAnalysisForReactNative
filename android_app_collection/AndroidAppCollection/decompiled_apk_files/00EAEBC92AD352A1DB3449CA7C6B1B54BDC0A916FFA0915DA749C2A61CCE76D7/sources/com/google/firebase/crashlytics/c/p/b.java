package com.google.firebase.crashlytics.c.p;

import c.e.a.a.e;
import com.google.firebase.crashlytics.c.j.v;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
final /* synthetic */ class b implements e {

    /* renamed from: a  reason: collision with root package name */
    private static final b f9100a = new b();

    private b() {
    }

    public static e a() {
        return f9100a;
    }

    @Override // c.e.a.a.e
    public Object a(Object obj) {
        byte[] bytes;
        bytes = c.f9101b.a((v) obj).getBytes(Charset.forName("UTF-8"));
        return bytes;
    }
}
