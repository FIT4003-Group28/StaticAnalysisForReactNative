package com.google.firebase.crashlytics.c.h;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class j0 {

    /* renamed from: a  reason: collision with root package name */
    private String f8656a = null;

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentHashMap<String, String> f8657b = new ConcurrentHashMap<>();

    private static String b(String str) {
        if (str != null) {
            String trim = str.trim();
            return trim.length() > 1024 ? trim.substring(0, 1024) : trim;
        }
        return str;
    }

    public Map<String, String> a() {
        return Collections.unmodifiableMap(this.f8657b);
    }

    public void a(String str) {
        this.f8656a = b(str);
    }

    public void a(String str, String str2) {
        if (str != null) {
            String b2 = b(str);
            if (this.f8657b.size() < 64 || this.f8657b.containsKey(b2)) {
                this.f8657b.put(b2, str2 == null ? "" : b(str2));
                return;
            } else {
                com.google.firebase.crashlytics.c.b.a().a("Exceeded maximum number of custom attributes (64)");
                return;
            }
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public String b() {
        return this.f8656a;
    }
}
