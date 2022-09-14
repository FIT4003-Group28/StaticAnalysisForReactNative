package com.google.firebase.crashlytics.c.o.c;

import com.google.firebase.crashlytics.c.o.c.c;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final File f9090a;

    /* renamed from: b  reason: collision with root package name */
    private final File[] f9091b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f9092c;

    public d(File file) {
        this(file, Collections.emptyMap());
    }

    public d(File file, Map<String, String> map) {
        this.f9090a = file;
        this.f9091b = new File[]{file};
        this.f9092c = new HashMap(map);
    }

    @Override // com.google.firebase.crashlytics.c.o.c.c
    public String a() {
        String d2 = d();
        return d2.substring(0, d2.lastIndexOf(46));
    }

    @Override // com.google.firebase.crashlytics.c.o.c.c
    public Map<String, String> b() {
        return Collections.unmodifiableMap(this.f9092c);
    }

    @Override // com.google.firebase.crashlytics.c.o.c.c
    public File[] c() {
        return this.f9091b;
    }

    @Override // com.google.firebase.crashlytics.c.o.c.c
    public String d() {
        return e().getName();
    }

    @Override // com.google.firebase.crashlytics.c.o.c.c
    public File e() {
        return this.f9090a;
    }

    @Override // com.google.firebase.crashlytics.c.o.c.c
    public c.a getType() {
        return c.a.JAVA;
    }

    @Override // com.google.firebase.crashlytics.c.o.c.c
    public void remove() {
        com.google.firebase.crashlytics.c.b a2 = com.google.firebase.crashlytics.c.b.a();
        a2.a("Removing report at " + this.f9090a.getPath());
        this.f9090a.delete();
    }
}
