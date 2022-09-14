package com.google.firebase.crashlytics.c.m;

import android.content.Context;
import java.io.File;
/* loaded from: classes.dex */
public class i implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Context f9057a;

    public i(Context context) {
        this.f9057a = context;
    }

    File a(File file) {
        if (file == null) {
            com.google.firebase.crashlytics.c.b.a().a("Null File");
            return null;
        } else if (file.exists() || file.mkdirs()) {
            return file;
        } else {
            com.google.firebase.crashlytics.c.b.a().d("Couldn't create file");
            return null;
        }
    }

    @Override // com.google.firebase.crashlytics.c.m.h
    public String a() {
        return new File(this.f9057a.getFilesDir(), ".com.google.firebase.crashlytics").getPath();
    }

    @Override // com.google.firebase.crashlytics.c.m.h
    public File b() {
        return a(new File(this.f9057a.getFilesDir(), ".com.google.firebase.crashlytics"));
    }
}
