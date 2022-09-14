package com.facebook.l;

import java.io.File;
/* compiled from: DirectorySoSource.java */
/* loaded from: classes.dex */
public class b extends h {

    /* renamed from: a  reason: collision with root package name */
    protected final File f3025a;

    /* renamed from: b  reason: collision with root package name */
    protected final int f3026b;

    public b(File file, int i) {
        this.f3025a = file;
        this.f3026b = i;
    }

    @Override // com.facebook.l.h
    public int a(String str, int i) {
        return a(str, i, this.f3025a);
    }

    protected int a(String str, int i, File file) {
        String[] a2;
        File file2 = new File(file, str);
        if (!file2.exists()) {
            return 0;
        }
        if ((i & 1) != 0 && (this.f3026b & 2) != 0) {
            return 2;
        }
        if ((this.f3026b & 1) != 0) {
            for (String str2 : a(file2)) {
                if (!str2.startsWith("/")) {
                    g.a(str2, i | 1);
                }
            }
        }
        System.load(file2.getAbsolutePath());
        return 1;
    }

    private static String[] a(File file) {
        return f.a(file);
    }

    @Override // com.facebook.l.h
    public File a(String str) {
        File file = new File(this.f3025a, str);
        if (file.exists()) {
            return file;
        }
        return null;
    }
}
