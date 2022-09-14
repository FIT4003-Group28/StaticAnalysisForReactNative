package com.google.firebase.crashlytics.c.n;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
/* loaded from: classes.dex */
public class b extends FileOutputStream {

    /* renamed from: e  reason: collision with root package name */
    public static final FilenameFilter f9060e = new a();

    /* renamed from: b  reason: collision with root package name */
    private final String f9061b;

    /* renamed from: c  reason: collision with root package name */
    private File f9062c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f9063d;

    /* loaded from: classes.dex */
    class a implements FilenameFilter {
        a() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.endsWith(".cls_temp");
        }
    }

    public b(File file, String str) {
        super(new File(file, str + ".cls_temp"));
        this.f9063d = false;
        this.f9061b = file + File.separator + str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9061b);
        sb.append(".cls_temp");
        this.f9062c = new File(sb.toString());
    }

    public void a() {
        if (this.f9063d) {
            return;
        }
        this.f9063d = true;
        super.flush();
        super.close();
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.f9063d) {
            return;
        }
        this.f9063d = true;
        super.flush();
        super.close();
        File file = new File(this.f9061b + ".cls");
        if (this.f9062c.renameTo(file)) {
            this.f9062c = null;
            return;
        }
        String str = "";
        if (file.exists()) {
            str = " (target already exists)";
        } else if (!this.f9062c.exists()) {
            str = " (source does not exist)";
        }
        throw new IOException("Could not rename temp file: " + this.f9062c + " -> " + file + str);
    }
}
