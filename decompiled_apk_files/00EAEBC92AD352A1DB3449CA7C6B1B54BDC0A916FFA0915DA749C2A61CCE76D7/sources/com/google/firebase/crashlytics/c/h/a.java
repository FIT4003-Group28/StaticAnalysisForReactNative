package com.google.firebase.crashlytics.c.h;

import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: e  reason: collision with root package name */
    private static final Pattern f8606e = Pattern.compile("http(s?)://[^\\/]+", 2);

    /* renamed from: a  reason: collision with root package name */
    private final String f8607a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.firebase.crashlytics.c.l.c f8608b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.firebase.crashlytics.c.l.a f8609c;

    /* renamed from: d  reason: collision with root package name */
    private final String f8610d;

    public a(String str, String str2, com.google.firebase.crashlytics.c.l.c cVar, com.google.firebase.crashlytics.c.l.a aVar) {
        if (str2 != null) {
            if (cVar == null) {
                throw new IllegalArgumentException("requestFactory must not be null.");
            }
            this.f8610d = str;
            this.f8607a = a(str2);
            this.f8608b = cVar;
            this.f8609c = aVar;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }

    private String a(String str) {
        return !h.b(this.f8610d) ? f8606e.matcher(str).replaceFirst(this.f8610d) : str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.google.firebase.crashlytics.c.l.b a() {
        return a(Collections.emptyMap());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.google.firebase.crashlytics.c.l.b a(Map<String, String> map) {
        com.google.firebase.crashlytics.c.l.b a2 = this.f8608b.a(this.f8609c, b(), map);
        a2.a("User-Agent", "Crashlytics Android SDK/" + m.i());
        a2.a("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String b() {
        return this.f8607a;
    }
}
