package com.google.firebase.crashlytics.c.h;

import java.io.File;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private final String f8753a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.firebase.crashlytics.c.m.h f8754b;

    public n(String str, com.google.firebase.crashlytics.c.m.h hVar) {
        this.f8753a = str;
        this.f8754b = hVar;
    }

    private File d() {
        return new File(this.f8754b.b(), this.f8753a);
    }

    public boolean a() {
        try {
            return d().createNewFile();
        } catch (IOException e2) {
            com.google.firebase.crashlytics.c.b a2 = com.google.firebase.crashlytics.c.b.a();
            a2.b("Error creating marker: " + this.f8753a, e2);
            return false;
        }
    }

    public boolean b() {
        return d().exists();
    }

    public boolean c() {
        return d().delete();
    }
}
