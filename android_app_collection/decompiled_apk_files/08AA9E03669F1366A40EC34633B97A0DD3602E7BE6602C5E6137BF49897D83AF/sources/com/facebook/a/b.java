package com.facebook.a;

import com.facebook.common.d.i;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
/* compiled from: FileBinaryResource.java */
/* loaded from: classes.dex */
public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final File f2165a;

    private b(File file) {
        this.f2165a = (File) i.a(file);
    }

    public File c() {
        return this.f2165a;
    }

    @Override // com.facebook.a.a
    public InputStream a() {
        return new FileInputStream(this.f2165a);
    }

    @Override // com.facebook.a.a
    public long b() {
        return this.f2165a.length();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        return this.f2165a.equals(((b) obj).f2165a);
    }

    public int hashCode() {
        return this.f2165a.hashCode();
    }

    public static b a(File file) {
        if (file != null) {
            return new b(file);
        }
        return null;
    }
}
