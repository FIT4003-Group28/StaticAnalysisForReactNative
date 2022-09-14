package com.b.a.a.b;

import java.util.HashMap;
import java.util.Map;
/* compiled from: SyntaxRules.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private com.b.a.a.a f1437a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Map<String, com.b.a.a.a>> f1438b = new HashMap();

    public c(com.b.a.a.a aVar) {
        this.f1437a = aVar;
    }

    public com.b.a.a.a a() {
        return this.f1437a;
    }

    public void a(com.b.a.a.a aVar) {
        this.f1437a = aVar;
    }

    public boolean a(String str) {
        if (str != null) {
            str = str.toUpperCase();
        }
        return this.f1438b.containsKey(str);
    }

    public com.b.a.a.a a(String str, String str2) {
        Map<String, com.b.a.a.a> map = this.f1438b.get(str == null ? null : str.toUpperCase());
        if (map == null) {
            return null;
        }
        return map.get(str2);
    }

    public void a(String str, String str2, com.b.a.a.a aVar) {
        String upperCase = str == null ? null : str.toUpperCase();
        Map<String, com.b.a.a.a> map = this.f1438b.get(upperCase);
        if (map == null) {
            map = new HashMap<>();
            this.f1438b.put(upperCase, map);
        }
        map.put(str2, aVar);
    }

    public static c b() {
        c cVar = new c(com.b.a.a.a.OLD);
        cVar.a("VCARD", "2.1", com.b.a.a.a.OLD);
        cVar.a("VCARD", "3.0", com.b.a.a.a.NEW);
        cVar.a("VCARD", "4.0", com.b.a.a.a.NEW);
        return cVar;
    }
}
