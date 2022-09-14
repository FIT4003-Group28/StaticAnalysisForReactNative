package defpackage;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: dxdz  reason: default package */
/* loaded from: classes6.dex */
public final class dxdz implements Closeable {
    static final Pattern a = Pattern.compile("[a-z0-9_-]{1,64}");
    public static final OutputStream g = new dxdu();
    public final File b;
    public Writer d;
    public int e;
    private final File h;
    private final File i;
    private final File j;
    private final long l;
    private long m = 0;
    private final LinkedHashMap<String, dxdx> n = new LinkedHashMap<>(0, 0.75f, true);
    private long o = 0;
    final ThreadPoolExecutor f = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private final Callable<Void> p = new dxdt(this);
    private final int k = 1;
    public final int c = 1;

    private dxdz(File file, long j) {
        this.b = file;
        this.h = new File(file, "journal");
        this.i = new File(file, "journal.tmp");
        this.j = new File(file, "journal.bkp");
        this.l = j;
    }

    public static dxdz k(File file, long j) {
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                o(file2, file3, false);
            }
        }
        dxdz dxdzVar = new dxdz(file, j);
        if (dxdzVar.h.exists()) {
            try {
                dxdzVar.m();
                n(dxdzVar.i);
                Iterator<dxdx> it = dxdzVar.n.values().iterator();
                while (it.hasNext()) {
                    dxdx next = it.next();
                    if (next.d == null) {
                        for (int i = 0; i < dxdzVar.c; i = 1) {
                            dxdzVar.m += next.b[0];
                        }
                    } else {
                        next.d = null;
                        for (int i2 = 0; i2 < dxdzVar.c; i2 = 1) {
                            n(next.c());
                            n(next.d());
                        }
                        it.remove();
                    }
                }
                dxdzVar.d = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dxdzVar.h, true), dxec.a));
                return dxdzVar;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                dxdzVar.i();
            }
        }
        file.mkdirs();
        dxdz dxdzVar2 = new dxdz(file, j);
        dxdzVar2.a();
        return dxdzVar2;
    }

    private final void m() {
        String a2;
        String substring;
        dxeb dxebVar = new dxeb(new FileInputStream(this.h), dxec.a);
        try {
            String a3 = dxebVar.a();
            String a4 = dxebVar.a();
            String a5 = dxebVar.a();
            String a6 = dxebVar.a();
            String a7 = dxebVar.a();
            if ("libcore.io.DiskLruCache".equals(a3) && "1".equals(a4) && Integer.toString(this.k).equals(a5) && Integer.toString(this.c).equals(a6) && "".equals(a7)) {
                int i = 0;
                while (true) {
                    try {
                        a2 = dxebVar.a();
                        int indexOf = a2.indexOf(32);
                        if (indexOf == -1) {
                            throw new IOException("unexpected journal line: " + a2);
                        }
                        int i2 = indexOf + 1;
                        int indexOf2 = a2.indexOf(32, i2);
                        if (indexOf2 == -1) {
                            substring = a2.substring(i2);
                            if (indexOf == 6) {
                                if (a2.startsWith("REMOVE")) {
                                    this.n.remove(substring);
                                    i++;
                                } else {
                                    indexOf = 6;
                                }
                            }
                        } else {
                            substring = a2.substring(i2, indexOf2);
                        }
                        dxdx dxdxVar = this.n.get(substring);
                        if (dxdxVar == null) {
                            dxdxVar = new dxdx(this, substring);
                            this.n.put(substring, dxdxVar);
                        }
                        if (indexOf2 != -1 && indexOf == 5 && a2.startsWith("CLEAN")) {
                            String[] split = a2.substring(indexOf2 + 1).split(" ");
                            dxdxVar.c = true;
                            dxdxVar.d = null;
                            if (split.length == dxdxVar.e.c) {
                                for (int i3 = 0; i3 < split.length; i3++) {
                                    try {
                                        dxdxVar.b[i3] = Long.parseLong(split[i3]);
                                    } catch (NumberFormatException unused) {
                                        throw dxdx.e(split);
                                    }
                                }
                            } else {
                                throw dxdx.e(split);
                            }
                        } else if (indexOf2 == -1 && indexOf == 5 && a2.startsWith("DIRTY")) {
                            dxdxVar.d = new dxdw(this, dxdxVar);
                        } else if (indexOf2 != -1 || indexOf != 4 || !a2.startsWith("READ")) {
                            break;
                        }
                        i++;
                    } catch (EOFException unused2) {
                        this.e = i - this.n.size();
                        dxec.c(dxebVar);
                        return;
                    }
                }
                throw new IOException("unexpected journal line: " + a2);
            }
            throw new IOException("unexpected journal header: [" + a3 + ", " + a4 + ", " + a6 + ", " + a7 + "]");
        } catch (Throwable th) {
            dxec.c(dxebVar);
            throw th;
        }
    }

    private static void n(File file) {
        if (!file.exists() || file.delete()) {
            return;
        }
        throw new IOException();
    }

    private static void o(File file, File file2, boolean z) {
        if (z) {
            n(file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException();
    }

    private final void p() {
        if (this.d != null) {
            return;
        }
        throw new IllegalStateException("cache is closed");
    }

    private static final void q(String str) {
        if (a.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
    }

    public final synchronized void a() {
        Writer writer = this.d;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.i), dxec.a));
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.k));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.c));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (dxdx dxdxVar : this.n.values()) {
            if (dxdxVar.d != null) {
                bufferedWriter.write("DIRTY " + dxdxVar.a + '\n');
            } else {
                bufferedWriter.write("CLEAN " + dxdxVar.a + dxdxVar.a() + '\n');
            }
        }
        bufferedWriter.close();
        if (this.h.exists()) {
            o(this.h, this.j, true);
        }
        o(this.i, this.h, false);
        this.j.delete();
        this.d = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.h, true), dxec.a));
    }

    public final synchronized dxdy b(String str) {
        InputStream inputStream;
        p();
        q(str);
        dxdx dxdxVar = this.n.get(str);
        if (dxdxVar == null) {
            return null;
        }
        if (!dxdxVar.c) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.c];
        for (int i = 0; i < this.c; i = 1) {
            try {
                inputStreamArr[0] = new FileInputStream(dxdxVar.c());
            } catch (FileNotFoundException unused) {
                for (int i2 = 0; i2 < this.c && (inputStream = inputStreamArr[0]) != null; i2 = 1) {
                    dxec.c(inputStream);
                }
                return null;
            }
        }
        this.e++;
        this.d.append((CharSequence) ("READ " + str + '\n'));
        if (e()) {
            this.f.submit(this.p);
        }
        return new dxdy(inputStreamArr);
    }

    public final synchronized long c() {
        return this.m;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.d == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.n.values());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dxdw dxdwVar = ((dxdx) arrayList.get(i)).d;
            if (dxdwVar != null) {
                dxdwVar.b();
            }
        }
        h();
        this.d.close();
        this.d = null;
    }

    public final synchronized void d(dxdw dxdwVar, boolean z) {
        dxdx dxdxVar = dxdwVar.a;
        if (dxdxVar.d == dxdwVar) {
            if (z && !dxdxVar.c) {
                for (int i = 0; i < this.c; i = 1) {
                    if (dxdwVar.b[0]) {
                        if (!dxdxVar.d().exists()) {
                            dxdwVar.b();
                            return;
                        }
                    } else {
                        dxdwVar.b();
                        throw new IllegalStateException("Newly created entry didn't create value for index 0");
                    }
                }
            }
            for (int i2 = 0; i2 < this.c; i2 = 1) {
                File d = dxdxVar.d();
                if (z) {
                    if (d.exists()) {
                        File c = dxdxVar.c();
                        d.renameTo(c);
                        long j = dxdxVar.b[0];
                        long length = c.length();
                        dxdxVar.b[0] = length;
                        this.m = (this.m - j) + length;
                    }
                } else {
                    n(d);
                }
            }
            this.e++;
            dxdxVar.d = null;
            if (dxdxVar.c | z) {
                dxdxVar.c = true;
                this.d.write("CLEAN " + dxdxVar.a + dxdxVar.a() + '\n');
                if (z) {
                    this.o++;
                }
            } else {
                this.n.remove(dxdxVar.a);
                this.d.write("REMOVE " + dxdxVar.a + '\n');
            }
            this.d.flush();
            if (this.m <= this.l && !e()) {
                return;
            }
            this.f.submit(this.p);
            return;
        }
        throw new IllegalStateException();
    }

    public final boolean e() {
        int i = this.e;
        return i >= 2000 && i >= this.n.size();
    }

    public final synchronized boolean f() {
        return this.d == null;
    }

    public final synchronized void g() {
        p();
        h();
        this.d.flush();
    }

    public final void h() {
        while (this.m > this.l) {
            l(this.n.entrySet().iterator().next().getKey());
        }
    }

    public final void i() {
        close();
        dxec.b(this.b);
    }

    public final synchronized dxdw j(String str) {
        p();
        q(str);
        dxdx dxdxVar = this.n.get(str);
        if (dxdxVar == null) {
            dxdxVar = new dxdx(this, str);
            this.n.put(str, dxdxVar);
        } else if (dxdxVar.d != null) {
            return null;
        }
        dxdw dxdwVar = new dxdw(this, dxdxVar);
        dxdxVar.d = dxdwVar;
        Writer writer = this.d;
        writer.write("DIRTY " + str + '\n');
        this.d.flush();
        return dxdwVar;
    }

    public final synchronized void l(String str) {
        p();
        q(str);
        dxdx dxdxVar = this.n.get(str);
        if (dxdxVar == null || dxdxVar.d != null) {
            return;
        }
        for (int i = 0; i < this.c; i = 1) {
            File c = dxdxVar.c();
            if (c.exists() && !c.delete()) {
                throw new IOException("failed to delete " + c);
            }
            long j = this.m;
            long[] jArr = dxdxVar.b;
            this.m = j - jArr[0];
            jArr[0] = 0;
        }
        this.e++;
        this.d.append((CharSequence) ("REMOVE " + str + '\n'));
        this.n.remove(str);
        if (!e()) {
            return;
        }
        this.f.submit(this.p);
    }
}
