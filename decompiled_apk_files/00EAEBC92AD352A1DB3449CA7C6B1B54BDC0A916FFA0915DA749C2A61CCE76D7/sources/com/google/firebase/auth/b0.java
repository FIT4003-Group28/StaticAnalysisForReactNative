package com.google.firebase.auth;

import java.util.Map;
/* loaded from: classes.dex */
public class b0 {

    /* renamed from: a  reason: collision with root package name */
    private String f8305a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, Object> f8306b;

    public b0(String str, Map<String, Object> map) {
        this.f8305a = str;
        this.f8306b = map;
    }

    private final long a(String str) {
        Integer num = (Integer) this.f8306b.get(str);
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }

    public long a() {
        return a("auth_time");
    }

    public Map<String, Object> b() {
        return this.f8306b;
    }

    public long c() {
        return a("exp");
    }

    public long d() {
        return a("iat");
    }

    public String e() {
        Map map = (Map) this.f8306b.get("firebase");
        if (map != null) {
            return (String) map.get("sign_in_provider");
        }
        return null;
    }

    public String f() {
        return this.f8305a;
    }
}
