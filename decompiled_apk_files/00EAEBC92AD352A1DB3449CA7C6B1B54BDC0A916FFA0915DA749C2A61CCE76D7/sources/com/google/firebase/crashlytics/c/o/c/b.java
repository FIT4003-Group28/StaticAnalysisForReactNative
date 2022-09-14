package com.google.firebase.crashlytics.c.o.c;

import com.google.firebase.crashlytics.c.o.c.c;
import java.io.File;
import java.util.Map;
/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private final File f9086a;

    public b(File file) {
        this.f9086a = file;
    }

    @Override // com.google.firebase.crashlytics.c.o.c.c
    public String a() {
        return this.f9086a.getName();
    }

    @Override // com.google.firebase.crashlytics.c.o.c.c
    public Map<String, String> b() {
        return null;
    }

    @Override // com.google.firebase.crashlytics.c.o.c.c
    public File[] c() {
        return this.f9086a.listFiles();
    }

    @Override // com.google.firebase.crashlytics.c.o.c.c
    public String d() {
        return null;
    }

    @Override // com.google.firebase.crashlytics.c.o.c.c
    public File e() {
        return null;
    }

    @Override // com.google.firebase.crashlytics.c.o.c.c
    public c.a getType() {
        return c.a.NATIVE;
    }

    @Override // com.google.firebase.crashlytics.c.o.c.c
    public void remove() {
        File[] c2;
        for (File file : c()) {
            com.google.firebase.crashlytics.c.b.a().a("Removing native report file at " + file.getPath());
            file.delete();
        }
        com.google.firebase.crashlytics.c.b.a().a("Removing native report directory at " + this.f9086a);
        this.f9086a.delete();
    }
}
