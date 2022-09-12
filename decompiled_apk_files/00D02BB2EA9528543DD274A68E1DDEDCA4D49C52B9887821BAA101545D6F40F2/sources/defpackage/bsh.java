package defpackage;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bsh  reason: default package */
/* loaded from: classes.dex */
public final class bsh implements Closeable {
    public final File a;
    public Writer c;
    public int d;
    private final File f;
    private final File g;
    private final File h;
    private long k = 0;
    private final LinkedHashMap<String, bsf> l = new LinkedHashMap<>(0, 0.75f, true);
    private long m = 0;
    final ThreadPoolExecutor e = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new bsd());
    private final Callable<Void> n = new bsc(this);
    private final int i = 1;
    public final int b = 1;
    private final long j = 262144000;

    private bsh(File file) {
        this.a = file;
        this.f = new File(file, "journal");
        this.g = new File(file, "journal.tmp");
        this.h = new File(file, "journal.bkp");
    }

    public static bsh i(File file) {
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                l(file2, file3, false);
            }
        }
        bsh bshVar = new bsh(file);
        if (bshVar.f.exists()) {
            try {
                bshVar.j();
                k(bshVar.g);
                Iterator<bsf> it = bshVar.l.values().iterator();
                while (it.hasNext()) {
                    bsf next = it.next();
                    if (next.f == null) {
                        for (int i = 0; i < bshVar.b; i = 1) {
                            bshVar.k += next.b[0];
                        }
                    } else {
                        next.f = null;
                        for (int i2 = 0; i2 < bshVar.b; i2 = 1) {
                            k(next.c());
                            k(next.d());
                        }
                        it.remove();
                    }
                }
                return bshVar;
            } catch (IOException e) {
                PrintStream printStream = System.out;
                String valueOf = String.valueOf(file);
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36 + String.valueOf(message).length());
                sb.append("DiskLruCache ");
                sb.append(valueOf);
                sb.append(" is corrupt: ");
                sb.append(message);
                sb.append(", removing");
                printStream.println(sb.toString());
                bshVar.f();
            }
        }
        file.mkdirs();
        bsh bshVar2 = new bsh(file);
        bshVar2.a();
        return bshVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0128, code lost:
        if (r4.length() == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012a, code lost:
        r4 = "unexpected journal line: ".concat(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012f, code lost:
        r4 = new java.lang.String("unexpected journal line: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0137, code lost:
        throw new java.io.IOException(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void j() {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsh.j():void");
    }

    private static void k(File file) {
        if (!file.exists() || file.delete()) {
            return;
        }
        throw new IOException();
    }

    private static void l(File file, File file2, boolean z) {
        if (z) {
            k(file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException();
    }

    private final void m() {
        if (this.c != null) {
            return;
        }
        throw new IllegalStateException("cache is closed");
    }

    private static void n(Writer writer) {
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

    private static void o(Writer writer) {
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

    public final synchronized void a() {
        Writer writer = this.c;
        if (writer != null) {
            n(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.g), bsk.a));
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.i));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.b));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (bsf bsfVar : this.l.values()) {
            if (bsfVar.f == null) {
                String str = bsfVar.a;
                String a = bsfVar.a();
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(a).length());
                sb.append("CLEAN ");
                sb.append(str);
                sb.append(a);
                sb.append('\n');
                bufferedWriter.write(sb.toString());
            } else {
                String str2 = bsfVar.a;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 7);
                sb2.append("DIRTY ");
                sb2.append(str2);
                sb2.append('\n');
                bufferedWriter.write(sb2.toString());
            }
        }
        n(bufferedWriter);
        if (this.f.exists()) {
            l(this.f, this.h, true);
        }
        l(this.g, this.f, false);
        this.h.delete();
        this.c = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f, true), bsk.a));
    }

    public final synchronized bsg b(String str) {
        m();
        bsf bsfVar = this.l.get(str);
        if (bsfVar == null) {
            return null;
        }
        if (!bsfVar.e) {
            return null;
        }
        File[] fileArr = bsfVar.c;
        int length = fileArr.length;
        for (int i = 0; i < length; i = 1) {
            if (!fileArr[0].exists()) {
                return null;
            }
        }
        this.d++;
        this.c.append((CharSequence) "READ");
        this.c.append(' ');
        this.c.append((CharSequence) str);
        this.c.append('\n');
        if (d()) {
            this.e.submit(this.n);
        }
        return new bsg(bsfVar.c);
    }

    public final synchronized void c(bse bseVar, boolean z) {
        bsf bsfVar = bseVar.a;
        if (bsfVar.f == bseVar) {
            if (z && !bsfVar.e) {
                for (int i = 0; i < this.b; i = 1) {
                    if (bseVar.b[0]) {
                        if (!bsfVar.d().exists()) {
                            bseVar.b();
                            return;
                        }
                    } else {
                        bseVar.b();
                        StringBuilder sb = new StringBuilder(61);
                        sb.append("Newly created entry didn't create value for index ");
                        sb.append(0);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
            for (int i2 = 0; i2 < this.b; i2 = 1) {
                File d = bsfVar.d();
                if (z) {
                    if (d.exists()) {
                        File c = bsfVar.c();
                        d.renameTo(c);
                        long j = bsfVar.b[0];
                        long length = c.length();
                        bsfVar.b[0] = length;
                        this.k = (this.k - j) + length;
                    }
                } else {
                    k(d);
                }
            }
            this.d++;
            bsfVar.f = null;
            if (bsfVar.e | z) {
                bsfVar.e = true;
                this.c.append((CharSequence) "CLEAN");
                this.c.append(' ');
                this.c.append((CharSequence) bsfVar.a);
                this.c.append((CharSequence) bsfVar.a());
                this.c.append('\n');
                if (z) {
                    this.m++;
                }
            } else {
                this.l.remove(bsfVar.a);
                this.c.append((CharSequence) "REMOVE");
                this.c.append(' ');
                this.c.append((CharSequence) bsfVar.a);
                this.c.append('\n');
            }
            o(this.c);
            if (this.k <= this.j && !d()) {
                return;
            }
            this.e.submit(this.n);
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.c == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.l.values());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bse bseVar = ((bsf) arrayList.get(i)).f;
            if (bseVar != null) {
                bseVar.b();
            }
        }
        e();
        n(this.c);
        this.c = null;
    }

    public final boolean d() {
        int i = this.d;
        return i >= 2000 && i >= this.l.size();
    }

    public final void e() {
        while (this.k > this.j) {
            h(this.l.entrySet().iterator().next().getKey());
        }
    }

    public final void f() {
        close();
        bsk.a(this.a);
    }

    public final synchronized bse g(String str) {
        m();
        bsf bsfVar = this.l.get(str);
        if (bsfVar == null) {
            bsfVar = new bsf(this, str);
            this.l.put(str, bsfVar);
        } else if (bsfVar.f != null) {
            return null;
        }
        bse bseVar = new bse(this, bsfVar);
        bsfVar.f = bseVar;
        this.c.append((CharSequence) "DIRTY");
        this.c.append(' ');
        this.c.append((CharSequence) str);
        this.c.append('\n');
        o(this.c);
        return bseVar;
    }

    public final synchronized void h(String str) {
        m();
        bsf bsfVar = this.l.get(str);
        if (bsfVar == null || bsfVar.f != null) {
            return;
        }
        for (int i = 0; i < this.b; i = 1) {
            File c = bsfVar.c();
            if (c.exists() && !c.delete()) {
                String valueOf = String.valueOf(c);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
                sb.append("failed to delete ");
                sb.append(valueOf);
                throw new IOException(sb.toString());
            }
            long j = this.k;
            long[] jArr = bsfVar.b;
            this.k = j - jArr[0];
            jArr[0] = 0;
        }
        this.d++;
        this.c.append((CharSequence) "REMOVE");
        this.c.append(' ');
        this.c.append((CharSequence) str);
        this.c.append('\n');
        this.l.remove(str);
        if (!d()) {
            return;
        }
        this.e.submit(this.n);
    }
}
