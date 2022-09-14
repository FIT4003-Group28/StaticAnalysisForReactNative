package com.google.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ExtensionRegistryLite.java */
/* loaded from: classes.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f4689a = false;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Object, Object<?, ?>> f4692d;

    /* renamed from: c  reason: collision with root package name */
    private static final Class<?> f4691c = b();

    /* renamed from: b  reason: collision with root package name */
    static final p f4690b = new p(true);

    static Class<?> b() {
        try {
            return Class.forName("com.google.protobuf.l");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static boolean c() {
        return f4689a;
    }

    public static p d() {
        return o.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p() {
        this.f4692d = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(p pVar) {
        if (pVar == f4690b) {
            this.f4692d = Collections.emptyMap();
        } else {
            this.f4692d = Collections.unmodifiableMap(pVar.f4692d);
        }
    }

    p(boolean z) {
        this.f4692d = Collections.emptyMap();
    }
}
