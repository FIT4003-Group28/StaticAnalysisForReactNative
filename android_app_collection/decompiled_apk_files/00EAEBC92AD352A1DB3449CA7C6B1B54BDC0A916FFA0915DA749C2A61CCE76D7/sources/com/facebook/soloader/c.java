package com.facebook.soloader;

import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: classes.dex */
public class c extends l {

    /* renamed from: a  reason: collision with root package name */
    protected final File f6459a;

    /* renamed from: b  reason: collision with root package name */
    protected final int f6460b;

    public c(File file, int i) {
        this.f6459a = file;
        this.f6460b = i;
    }

    private void a(File file, int i, StrictMode.ThreadPolicy threadPolicy) {
        String[] a2 = a(file);
        Log.d("SoLoader", "Loading lib dependencies: " + Arrays.toString(a2));
        for (String str : a2) {
            if (!str.startsWith("/")) {
                SoLoader.b(str, (i | 1) & (-3), threadPolicy);
            }
        }
    }

    private static String[] a(File file) {
        if (SoLoader.f6438a) {
            Api18TraceUtils.a("SoLoader.getElfDependencies[", file.getName(), "]");
        }
        try {
            return i.a(file);
        } finally {
            if (SoLoader.f6438a) {
                Api18TraceUtils.a();
            }
        }
    }

    @Override // com.facebook.soloader.l
    public int a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return a(str, i, this.f6459a, threadPolicy);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int a(String str, int i, File file, StrictMode.ThreadPolicy threadPolicy) {
        File file2 = new File(file, str);
        if (!file2.exists()) {
            Log.d("SoLoader", str + " not found on " + file.getCanonicalPath());
            return 0;
        }
        Log.d("SoLoader", str + " found on " + file.getCanonicalPath());
        if ((i & 1) != 0 && (this.f6460b & 2) != 0) {
            Log.d("SoLoader", str + " loaded implicitly");
            return 2;
        }
        if ((this.f6460b & 1) != 0) {
            a(file2, i, threadPolicy);
        } else {
            Log.d("SoLoader", "Not resolving dependencies for " + str);
        }
        try {
            SoLoader.f6439b.a(file2.getAbsolutePath(), i);
            return 1;
        } catch (UnsatisfiedLinkError e2) {
            if (!e2.getMessage().contains("bad ELF magic")) {
                throw e2;
            }
            Log.d("SoLoader", "Corrupted lib file detected");
            return 3;
        }
    }

    @Override // com.facebook.soloader.l
    public File a(String str) {
        File file = new File(this.f6459a, str);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    @Override // com.facebook.soloader.l
    public String toString() {
        String name;
        try {
            name = String.valueOf(this.f6459a.getCanonicalPath());
        } catch (IOException unused) {
            name = this.f6459a.getName();
        }
        return getClass().getName() + "[root = " + name + " flags = " + this.f6460b + ']';
    }
}
