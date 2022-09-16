package defpackage;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ykm  reason: default package */
/* loaded from: classes4.dex */
public final class ykm implements Closeable {
    public final File a;
    public Writer c;
    public int d;
    private final File e;
    private final File f;
    private final long h;
    private long i = 0;
    private final LinkedHashMap j = new LinkedHashMap(0, 0.75f, true);
    private long k = 0;
    private final ExecutorService l = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private final Callable m = new Callable() { // from class: ykh
        @Override // java.util.concurrent.Callable
        public final Object call() {
            ykm ykmVar = ykm.this;
            synchronized (ykmVar) {
                if (ykmVar.c == null) {
                    return null;
                }
                ykmVar.i();
                if (ykmVar.j()) {
                    ykmVar.h();
                    ykmVar.d = 0;
                }
                return null;
            }
        }
    };
    private final int g = 538181937;
    public final int b = 1;

    static {
        Charset.forName("UTF-8");
    }

    private ykm(File file, long j) {
        this.a = file;
        this.e = new File(file, "journal");
        this.f = new File(file, "journal.tmp");
        this.h = j;
    }

    public static String b(InputStream inputStream) {
        StringBuilder sb = new StringBuilder(80);
        while (true) {
            int read = inputStream.read();
            if (read != -1) {
                if (read != 10) {
                    sb.append((char) read);
                } else {
                    int length = sb.length();
                    if (length > 0) {
                        int i = length - 1;
                        if (sb.charAt(i) == '\r') {
                            sb.setLength(i);
                        }
                    }
                    return sb.toString();
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void f(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    f(file2);
                }
                if (!file2.delete()) {
                    String valueOf = String.valueOf(file2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                    sb.append("failed to delete file: ");
                    sb.append(valueOf);
                    throw new IOException(sb.toString());
                }
            }
            return;
        }
        String valueOf2 = String.valueOf(file);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 17);
        sb2.append("not a directory: ");
        sb2.append(valueOf2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static ykm l(File file, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        ykm ykmVar = new ykm(file, j);
        if (ykmVar.e.exists()) {
            try {
                ykmVar.p();
                o(ykmVar.f);
                Iterator it = ykmVar.j.values().iterator();
                while (it.hasNext()) {
                    ykk ykkVar = (ykk) it.next();
                    if (ykkVar.d == null) {
                        for (int i = 0; i < ykmVar.b; i = 1) {
                            ykmVar.i += ykkVar.b[0];
                        }
                    } else {
                        ykkVar.d = null;
                        for (int i2 = 0; i2 < ykmVar.b; i2 = 1) {
                            o(ykkVar.a(0));
                            o(ykkVar.d());
                        }
                        it.remove();
                    }
                }
                ykmVar.c = new BufferedWriter(new FileWriter(ykmVar.e, true), 8192);
                return ykmVar;
            } catch (IOException e) {
                zep.n("Disk cache journal is corrupt", e);
                ykmVar.e();
            }
        }
        file.mkdirs();
        ykm ykmVar2 = new ykm(file, j);
        ykmVar2.h();
        return ykmVar2;
    }

    private final void n() {
        if (this.c != null) {
            return;
        }
        throw new IllegalStateException("cache is closed");
    }

    private static void o(File file) {
        if (!file.exists() || file.delete()) {
            return;
        }
        throw new IOException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0118, code lost:
        r0 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0122, code lost:
        if (r0.length() == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0124, code lost:
        r0 = "unexpected journal line: ".concat(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0129, code lost:
        r0 = new java.lang.String("unexpected journal line: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0131, code lost:
        throw new java.io.IOException(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void p() {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ykm.p():void");
    }

    private static final void q(String str) {
        if (str.contains(" ") || str.contains("\n") || str.contains("\r")) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 44);
            sb.append("keys must not contain spaces or newlines: \"");
            sb.append(str);
            sb.append("\"");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final synchronized ykl a(String str) {
        n();
        q(str);
        ykk ykkVar = (ykk) this.j.get(str);
        if (ykkVar == null) {
            return null;
        }
        if (!ykkVar.c) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.b];
        for (int i = 0; i < this.b; i++) {
            try {
                inputStreamArr[i] = new FileInputStream(ykkVar.a(i));
            } catch (FileNotFoundException unused) {
                return null;
            }
        }
        this.d++;
        Writer writer = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6);
        sb.append("READ ");
        sb.append(str);
        sb.append('\n');
        writer.append((CharSequence) sb.toString());
        if (j()) {
            this.l.submit(this.m);
        }
        return new ykl(inputStreamArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.c == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.j.values());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ykj ykjVar = ((ykk) arrayList.get(i)).d;
            if (ykjVar != null) {
                ykjVar.a();
            }
        }
        i();
        this.c.close();
        this.c = null;
    }

    public final synchronized void d(ykj ykjVar, boolean z) {
        ykk ykkVar = ykjVar.a;
        if (ykkVar.d == ykjVar) {
            if (z && !ykkVar.c) {
                for (int i = 0; i < this.b; i = 1) {
                    if (!ykkVar.d().exists()) {
                        ykjVar.a();
                        throw new IllegalStateException("edit didn't create file 0");
                    }
                }
            }
            for (int i2 = 0; i2 < this.b; i2 = 1) {
                File d = ykkVar.d();
                if (z) {
                    if (d.exists()) {
                        File a = ykkVar.a(0);
                        d.renameTo(a);
                        long j = ykkVar.b[0];
                        long length = a.length();
                        ykkVar.b[0] = length;
                        this.i = (this.i - j) + length;
                    }
                } else {
                    o(d);
                }
            }
            this.d++;
            ykkVar.d = null;
            if (!ykkVar.c) {
                if (!z) {
                    this.j.remove(ykkVar.a);
                    Writer writer = this.c;
                    String str = ykkVar.a;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8);
                    sb.append("REMOVE ");
                    sb.append(str);
                    sb.append('\n');
                    writer.write(sb.toString());
                    g();
                    if (this.i > this.h && !j()) {
                        return;
                    }
                    this.l.submit(this.m);
                    return;
                }
                z = true;
            }
            ykkVar.c = true;
            Writer writer2 = this.c;
            String str2 = ykkVar.a;
            String b = ykkVar.b();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 7 + String.valueOf(b).length());
            sb2.append("CLEAN ");
            sb2.append(str2);
            sb2.append(b);
            sb2.append('\n');
            writer2.write(sb2.toString());
            if (z) {
                this.k++;
            }
            g();
            if (this.i > this.h) {
            }
            this.l.submit(this.m);
            return;
        }
        throw new IllegalStateException();
    }

    public final void e() {
        close();
        f(this.a);
    }

    public final synchronized void g() {
        n();
        i();
        this.c.flush();
    }

    public final synchronized void h() {
        Writer writer = this.c;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.f), 8192);
        bufferedWriter.write("com.google.android.libraries.youtube.common.cache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.g));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.b));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (ykk ykkVar : this.j.values()) {
            if (ykkVar.d == null) {
                String str = ykkVar.a;
                String b = ykkVar.b();
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(b).length());
                sb.append("CLEAN ");
                sb.append(str);
                sb.append(b);
                sb.append('\n');
                bufferedWriter.write(sb.toString());
            } else {
                String str2 = ykkVar.a;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 7);
                sb2.append("DIRTY ");
                sb2.append(str2);
                sb2.append('\n');
                bufferedWriter.write(sb2.toString());
            }
        }
        bufferedWriter.close();
        this.f.renameTo(this.e);
        this.c = new BufferedWriter(new FileWriter(this.e, true), 8192);
    }

    public final void i() {
        while (this.i > this.h) {
            m((String) ((Map.Entry) this.j.entrySet().iterator().next()).getKey());
        }
    }

    public final boolean j() {
        int i = this.d;
        return i >= 2000 && i >= this.j.size();
    }

    public final synchronized ykj k(String str) {
        n();
        q(str);
        ykk ykkVar = (ykk) this.j.get(str);
        if (ykkVar == null) {
            ykkVar = new ykk(this, str);
            this.j.put(str, ykkVar);
        } else if (ykkVar.d != null) {
            return null;
        }
        ykj ykjVar = new ykj(this, ykkVar);
        ykkVar.d = ykjVar;
        Writer writer = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
        sb.append("DIRTY ");
        sb.append(str);
        sb.append('\n');
        writer.write(sb.toString());
        this.c.flush();
        return ykjVar;
    }

    public final synchronized void m(String str) {
        n();
        q(str);
        ykk ykkVar = (ykk) this.j.get(str);
        if (ykkVar == null || ykkVar.d != null) {
            return;
        }
        for (int i = 0; i < this.b; i = 1) {
            File a = ykkVar.a(0);
            if (a.delete()) {
                long j = this.i;
                long[] jArr = ykkVar.b;
                this.i = j - jArr[0];
                jArr[0] = 0;
            } else {
                String valueOf = String.valueOf(a);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
                sb.append("failed to delete ");
                sb.append(valueOf);
                throw new IOException(sb.toString());
            }
        }
        this.d++;
        Writer writer = this.c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 8);
        sb2.append("REMOVE ");
        sb2.append(str);
        sb2.append('\n');
        writer.append((CharSequence) sb2.toString());
        this.j.remove(str);
        if (!j()) {
            return;
        }
        this.l.submit(this.m);
    }
}
