package defpackage;

import android.content.Context;
import defpackage.dssj;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.Adler32;
/* compiled from: PG */
/* renamed from: bwrg  reason: default package */
/* loaded from: classes.dex */
public final class bwrg<T extends dssj> {
    public final String a;
    public final Executor b;
    @dzsi
    private final Context c;
    @dzsi
    private final bwre d;
    private File e;
    private File f;
    private File g;
    private final dssr<T> h;
    private final AtomicInteger i = new AtomicInteger();

    public bwrg(dssr<T> dssrVar, Context context, bwre bwreVar, String str, Executor executor) {
        this.c = context;
        this.d = bwreVar;
        this.a = str;
        this.h = dssrVar;
        this.b = executor;
    }

    public static File a(Context context, bwre bwreVar) {
        return bwreVar == bwre.CACHE_FILE ? context.getCacheDir() : context.getFilesDir();
    }

    private final File l() {
        if (this.f == null) {
            dbsk.s(this.c);
            dbsk.s(this.d);
            this.f = new File(a(this.c, this.d), this.a);
        }
        return this.f;
    }

    private final File m() {
        if (this.e == null) {
            dbsk.s(this.c);
            dbsk.s(this.d);
            this.e = new File(a(this.c, this.d), String.valueOf(this.a).concat(".cs"));
        }
        return this.e;
    }

    private final File n() {
        if (this.g == null) {
            dbsk.s(this.c);
            dbsk.s(this.d);
            this.g = new File(a(this.c, this.d), String.valueOf(this.a).concat(".adler32"));
        }
        return this.g;
    }

    private static byte[] o(File file) {
        mv mvVar = new mv(file);
        if (mvVar.c.exists()) {
            mv.a(mvVar.c, mvVar.a);
        }
        if (mvVar.b.exists() && mvVar.a.exists() && !mvVar.b.delete()) {
            String str = "Failed to delete outdated new file " + mvVar.b;
        }
        FileInputStream fileInputStream = new FileInputStream(mvVar.a);
        try {
            byte[] bArr = new byte[fileInputStream.available()];
            int i = 0;
            while (true) {
                int length = bArr.length;
                int read = fileInputStream.read(bArr, i, length - i);
                if (read <= 0) {
                    return bArr;
                }
                i += read;
                int available = fileInputStream.available();
                if (available > length - i) {
                    byte[] bArr2 = new byte[available + i];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    bArr = bArr2;
                }
            }
        } finally {
            fileInputStream.close();
        }
    }

    private static long p(byte[] bArr) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.put(bArr, 0, 8);
        allocate.flip();
        return allocate.getLong();
    }

    private static boolean q(File file) {
        if (!file.exists()) {
            return false;
        }
        mv mvVar = new mv(file);
        mvVar.a.delete();
        mvVar.b.delete();
        mvVar.c.delete();
        return true;
    }

    public final synchronized boolean b() {
        boolean z;
        if (!m().exists()) {
            if (!l().exists()) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    public final synchronized long c() {
        if (m().exists()) {
            return m().lastModified();
        } else if (!l().exists()) {
            return 0L;
        } else {
            return l().lastModified();
        }
    }

    public final synchronized long d() {
        if (m().exists()) {
            return m().length();
        } else if (!l().exists()) {
            return 0L;
        } else {
            return l().length();
        }
    }

    public final void e(final T t) {
        final int incrementAndGet = this.i.incrementAndGet();
        this.b.execute(new Runnable(this, t, incrementAndGet) { // from class: bwra
            private final bwrg a;
            private final dssj b;
            private final int c;

            {
                this.a = this;
                this.b = t;
                this.c = incrementAndGet;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.j(this.b, this.c);
            }
        });
    }

    public final boolean f(T t) {
        return j(t, this.i.incrementAndGet());
    }

    public final void g() {
        this.b.execute(new Runnable(this) { // from class: bwrb
            private final bwrg a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.k();
            }
        });
    }

    public final void h(final dbsz<T> dbszVar) {
        this.b.execute(new Runnable(this, dbszVar) { // from class: bwrc
            private final bwrg a;
            private final dbsz b;

            {
                this.a = this;
                this.b = dbszVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.b.NU((dssj) this.a.i().a);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6 A[Catch: all -> 0x00ed, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0010, B:6:0x0014, B:7:0x0018, B:9:0x001b, B:35:0x00b0, B:37:0x00b6, B:40:0x00be, B:41:0x00d3, B:45:0x00e7, B:10:0x0021, B:12:0x0037, B:13:0x0040, B:14:0x004c, B:15:0x0051, B:17:0x005b, B:18:0x0063, B:19:0x0067, B:22:0x006e, B:23:0x0072, B:25:0x0075, B:26:0x007a, B:28:0x0090, B:29:0x0098, B:33:0x00a4, B:34:0x00ab), top: B:53:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be A[Catch: all -> 0x00ed, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0010, B:6:0x0014, B:7:0x0018, B:9:0x001b, B:35:0x00b0, B:37:0x00b6, B:40:0x00be, B:41:0x00d3, B:45:0x00e7, B:10:0x0021, B:12:0x0037, B:13:0x0040, B:14:0x004c, B:15:0x0051, B:17:0x005b, B:18:0x0063, B:19:0x0067, B:22:0x006e, B:23:0x0072, B:25:0x0075, B:26:0x007a, B:28:0x0090, B:29:0x0098, B:33:0x00a4, B:34:0x00ab), top: B:53:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.zip.Checksum, java.util.zip.Adler32] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.bwrf<T> i() {
        /*
            r10 = this;
            monitor-enter(r10)
            java.io.File r0 = r10.m()     // Catch: java.lang.Throwable -> Led
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> Led
            r1 = 9
            r2 = 4
            r3 = 8
            if (r0 == 0) goto L51
            java.io.File r0 = r10.m()     // Catch: java.lang.Throwable -> Led
            byte[] r0 = o(r0)     // Catch: java.io.IOException -> L4c java.lang.Throwable -> Led
            int r1 = r0.length     // Catch: java.lang.Throwable -> Led
            if (r1 >= r3) goto L21
            bwrf r0 = defpackage.bwrf.b(r2)     // Catch: java.lang.Throwable -> Led
            goto Lb0
        L21:
            long r4 = p(r0)     // Catch: java.lang.Throwable -> Led
            java.util.zip.Adler32 r6 = new java.util.zip.Adler32     // Catch: java.lang.Throwable -> Led
            r6.<init>()     // Catch: java.lang.Throwable -> Led
            int r1 = r1 + (-8)
            r6.update(r0, r3, r1)     // Catch: java.lang.Throwable -> Led
            long r7 = r6.getValue()     // Catch: java.lang.Throwable -> Led
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 == 0) goto L40
            r6.getValue()     // Catch: java.lang.Throwable -> Led
            bwrf r0 = defpackage.bwrf.b(r2)     // Catch: java.lang.Throwable -> Led
            goto Lb0
        L40:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0, r3, r1)     // Catch: java.lang.Throwable -> Led
            bwrf r1 = new bwrf     // Catch: java.lang.Throwable -> Led
            r2 = 1
            r1.<init>(r0, r2, r2)     // Catch: java.lang.Throwable -> Led
            r0 = r1
            goto Lb0
        L4c:
            bwrf r0 = defpackage.bwrf.b(r1)     // Catch: java.lang.Throwable -> Led
            goto Lb0
        L51:
            java.io.File r0 = r10.l()     // Catch: java.lang.Throwable -> Led
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> Led
            if (r0 == 0) goto Lab
            java.io.File r0 = r10.l()     // Catch: java.lang.Throwable -> Led
            java.io.File r4 = r10.n()     // Catch: java.lang.Throwable -> Led
            byte[] r0 = o(r0)     // Catch: java.io.IOException -> L4c java.lang.Throwable -> Led
            boolean r1 = r4.exists()     // Catch: java.lang.Throwable -> Led
            if (r1 == 0) goto L98
            r1 = 5
            byte[] r5 = o(r4)     // Catch: java.io.IOException -> L4c java.lang.Throwable -> Led
            int r6 = r5.length     // Catch: java.lang.Throwable -> Led
            if (r6 == r3) goto L7a
            bwrf r0 = defpackage.bwrf.b(r1)     // Catch: java.lang.Throwable -> Led
            goto Lb0
        L7a:
            long r5 = p(r5)     // Catch: java.lang.Throwable -> Led
            java.util.zip.Adler32 r1 = new java.util.zip.Adler32     // Catch: java.lang.Throwable -> Led
            r1.<init>()     // Catch: java.lang.Throwable -> Led
            r7 = 0
            int r8 = r0.length     // Catch: java.lang.Throwable -> Led
            r1.update(r0, r7, r8)     // Catch: java.lang.Throwable -> Led
            long r7 = r1.getValue()     // Catch: java.lang.Throwable -> Led
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 == 0) goto L98
            r1.getValue()     // Catch: java.lang.Throwable -> Led
            bwrf r0 = defpackage.bwrf.b(r2)     // Catch: java.lang.Throwable -> Led
            goto Lb0
        L98:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)     // Catch: java.lang.Throwable -> Led
            boolean r1 = r4.exists()     // Catch: java.lang.Throwable -> Led
            if (r1 == 0) goto La3
            goto La4
        La3:
            r3 = 2
        La4:
            bwrf r2 = new bwrf     // Catch: java.lang.Throwable -> Led
            r2.<init>(r0, r1, r3)     // Catch: java.lang.Throwable -> Led
            r0 = r2
            goto Lb0
        Lab:
            r0 = 7
            bwrf r0 = defpackage.bwrf.b(r0)     // Catch: java.lang.Throwable -> Led
        Lb0:
            T r1 = r0.a     // Catch: java.lang.Throwable -> Led
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1     // Catch: java.lang.Throwable -> Led
            if (r1 != 0) goto Lbe
            int r0 = r0.c     // Catch: java.lang.Throwable -> Led
            bwrf r0 = defpackage.bwrf.b(r0)     // Catch: java.lang.Throwable -> Led
            monitor-exit(r10)
            return r0
        Lbe:
            byte[] r2 = r1.array()     // Catch: java.lang.Throwable -> Led
            int r3 = r1.arrayOffset()     // Catch: java.lang.Throwable -> Led
            int r4 = r1.position()     // Catch: java.lang.Throwable -> Led
            int r3 = r3 + r4
            int r1 = r1.remaining()     // Catch: java.lang.Throwable -> Led
            dsqa r4 = defpackage.dsqa.b()     // Catch: java.lang.Throwable -> Led
            dssr<T extends dssj> r5 = r10.h     // Catch: defpackage.dsrm -> Le6 java.lang.Throwable -> Led
            java.lang.Object r1 = r5.k(r2, r3, r1, r4)     // Catch: defpackage.dsrm -> Le6 java.lang.Throwable -> Led
            dssj r1 = (defpackage.dssj) r1     // Catch: defpackage.dsrm -> Le6 java.lang.Throwable -> Led
            bwrf r2 = new bwrf     // Catch: defpackage.dsrm -> Le6 java.lang.Throwable -> Led
            boolean r3 = r0.b     // Catch: defpackage.dsrm -> Le6 java.lang.Throwable -> Led
            int r0 = r0.c     // Catch: defpackage.dsrm -> Le6 java.lang.Throwable -> Led
            r2.<init>(r1, r3, r0)     // Catch: defpackage.dsrm -> Le6 java.lang.Throwable -> Led
            monitor-exit(r10)
            return r2
        Le6:
            r0 = 6
            bwrf r0 = defpackage.bwrf.b(r0)     // Catch: java.lang.Throwable -> Led
            monitor-exit(r10)
            return r0
        Led:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwrg.i():bwrf");
    }

    public final synchronized boolean j(dssj dssjVar, int i) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (i == this.i.get()) {
            mv mvVar = null;
            try {
                byte[] bS = dssjVar.bS();
                Adler32 adler32 = new Adler32();
                adler32.update(bS, 0, bS.length);
                mv mvVar2 = new mv(m());
                try {
                    if (mvVar2.c.exists()) {
                        mv.a(mvVar2.c, mvVar2.a);
                    }
                    try {
                        fileOutputStream2 = new FileOutputStream(mvVar2.b);
                    } catch (FileNotFoundException unused) {
                        if (!mvVar2.b.getParentFile().mkdirs()) {
                            throw new IOException("Failed to create directory for " + mvVar2.b);
                        }
                        try {
                            fileOutputStream2 = new FileOutputStream(mvVar2.b);
                        } catch (FileNotFoundException e) {
                            throw new IOException("Failed to create new file " + mvVar2.b, e);
                        }
                    }
                    FileOutputStream fileOutputStream3 = fileOutputStream2;
                    long value = adler32.getValue();
                    ByteBuffer allocate = ByteBuffer.allocate(8);
                    allocate.putLong(0, value);
                    allocate.flip();
                    fileOutputStream3.write(allocate.array());
                    fileOutputStream3.write(bS);
                    mv.b(fileOutputStream3);
                    try {
                        fileOutputStream3.close();
                    } catch (IOException unused2) {
                    }
                    mv.a(mvVar2.b, mvVar2.a);
                    q(l());
                    q(n());
                    return true;
                } catch (IOException | SecurityException unused3) {
                    fileOutputStream = null;
                    mvVar = mvVar2;
                    if (mvVar != null && fileOutputStream != null) {
                        mv.b(fileOutputStream);
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused4) {
                        }
                        if (!mvVar.b.delete()) {
                            String str = "Failed to delete new file " + mvVar.b;
                        }
                    }
                    return false;
                }
            } catch (IOException | SecurityException unused5) {
                fileOutputStream = null;
            }
        } else {
            return false;
        }
    }

    public final boolean k() {
        q(n());
        return q(l()) || q(m());
    }
}
