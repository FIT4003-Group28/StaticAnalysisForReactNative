package defpackage;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cgn  reason: default package */
/* loaded from: classes2.dex */
public final class cgn implements Closeable {
    public final File a;
    public final File b;
    public final File c;
    public Writer f;
    public int h;
    private final File j;
    private final long l;
    public long e = 0;
    public final LinkedHashMap g = new LinkedHashMap(0, 0.75f, true);
    private long m = 0;
    final ThreadPoolExecutor i = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new cgj());
    private final Callable n = new cgi(this);
    private final int k = 1;
    public final int d = 1;

    public cgn(File file, long j) {
        this.a = file;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.j = new File(file, "journal.bkp");
        this.l = j;
    }

    public static void c(File file) {
        if (!file.exists() || file.delete()) {
            return;
        }
        throw new IOException();
    }

    public static void f(File file, File file2, boolean z) {
        if (z) {
            c(file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException();
    }

    private final void k() {
        if (this.f != null) {
            return;
        }
        throw new IllegalStateException("cache is closed");
    }

    private static void l(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    private static void m(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final synchronized cgm a(String str) {
        k();
        cgl cglVar = (cgl) this.g.get(str);
        if (cglVar == null) {
            return null;
        }
        if (!cglVar.e) {
            return null;
        }
        File[] fileArr = cglVar.c;
        int length = fileArr.length;
        for (int i = 0; i < length; i = 1) {
            if (!fileArr[0].exists()) {
                return null;
            }
        }
        this.h++;
        this.f.append((CharSequence) "READ");
        this.f.append(' ');
        this.f.append((CharSequence) str);
        this.f.append('\n');
        if (h()) {
            this.i.submit(this.n);
        }
        return new cgm(cglVar.c);
    }

    public final synchronized void b(cgk cgkVar, boolean z) {
        cgl cglVar = cgkVar.a;
        if (cglVar.f == cgkVar) {
            if (z && !cglVar.e) {
                for (int i = 0; i < this.d; i = 1) {
                    if (cgkVar.b[0]) {
                        if (!cglVar.d().exists()) {
                            cgkVar.a();
                            return;
                        }
                    } else {
                        cgkVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index 0");
                    }
                }
            }
            for (int i2 = 0; i2 < this.d; i2 = 1) {
                File d = cglVar.d();
                if (z) {
                    if (d.exists()) {
                        File c = cglVar.c();
                        d.renameTo(c);
                        long j = cglVar.b[0];
                        long length = c.length();
                        cglVar.b[0] = length;
                        this.e = (this.e - j) + length;
                    }
                } else {
                    c(d);
                }
            }
            this.h++;
            cglVar.f = null;
            if (cglVar.e | z) {
                cglVar.e = true;
                this.f.append((CharSequence) "CLEAN");
                this.f.append(' ');
                this.f.append((CharSequence) cglVar.a);
                this.f.append((CharSequence) cglVar.a());
                this.f.append('\n');
                if (z) {
                    this.m++;
                }
            } else {
                this.g.remove(cglVar.a);
                this.f.append((CharSequence) "REMOVE");
                this.f.append(' ');
                this.f.append((CharSequence) cglVar.a);
                this.f.append('\n');
            }
            m(this.f);
            if (this.e <= this.l && !h()) {
                return;
            }
            this.i.submit(this.n);
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.g.values());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cgk cgkVar = ((cgl) arrayList.get(i)).f;
            if (cgkVar != null) {
                cgkVar.a();
            }
        }
        g();
        l(this.f);
        this.f = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0129, code lost:
        if (r4.length() == 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012b, code lost:
        r4 = "unexpected journal line: ".concat(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0130, code lost:
        r4 = new java.lang.String("unexpected journal line: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0138, code lost:
        throw new java.io.IOException(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgn.d():void");
    }

    public final synchronized void e() {
        Writer writer = this.f;
        if (writer != null) {
            l(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), cgq.a));
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.k));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.d));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (cgl cglVar : this.g.values()) {
            if (cglVar.f == null) {
                String str = cglVar.a;
                String a = cglVar.a();
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(a).length());
                sb.append("CLEAN ");
                sb.append(str);
                sb.append(a);
                sb.append('\n');
                bufferedWriter.write(sb.toString());
            } else {
                String str2 = cglVar.a;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 7);
                sb2.append("DIRTY ");
                sb2.append(str2);
                sb2.append('\n');
                bufferedWriter.write(sb2.toString());
            }
        }
        l(bufferedWriter);
        if (this.b.exists()) {
            f(this.b, this.j, true);
        }
        f(this.c, this.b, false);
        this.j.delete();
        this.f = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), cgq.a));
    }

    public final void g() {
        while (this.e > this.l) {
            j((String) ((Map.Entry) this.g.entrySet().iterator().next()).getKey());
        }
    }

    public final boolean h() {
        int i = this.h;
        return i >= 2000 && i >= this.g.size();
    }

    public final synchronized cgk i(String str) {
        k();
        cgl cglVar = (cgl) this.g.get(str);
        if (cglVar == null) {
            cglVar = new cgl(this, str);
            this.g.put(str, cglVar);
        } else if (cglVar.f != null) {
            return null;
        }
        cgk cgkVar = new cgk(this, cglVar);
        cglVar.f = cgkVar;
        this.f.append((CharSequence) "DIRTY");
        this.f.append(' ');
        this.f.append((CharSequence) str);
        this.f.append('\n');
        m(this.f);
        return cgkVar;
    }

    public final synchronized void j(String str) {
        k();
        cgl cglVar = (cgl) this.g.get(str);
        if (cglVar == null || cglVar.f != null) {
            return;
        }
        for (int i = 0; i < this.d; i = 1) {
            File c = cglVar.c();
            if (c.exists() && !c.delete()) {
                String valueOf = String.valueOf(c);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
                sb.append("failed to delete ");
                sb.append(valueOf);
                throw new IOException(sb.toString());
            }
            long j = this.e;
            long[] jArr = cglVar.b;
            this.e = j - jArr[0];
            jArr[0] = 0;
        }
        this.h++;
        this.f.append((CharSequence) "REMOVE");
        this.f.append(' ');
        this.f.append((CharSequence) str);
        this.f.append('\n');
        this.g.remove(str);
        if (!h()) {
            return;
        }
        this.i.submit(this.n);
    }
}
