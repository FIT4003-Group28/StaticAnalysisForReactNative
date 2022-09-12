package defpackage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* renamed from: duim  reason: default package */
/* loaded from: classes6.dex */
public final class duim implements duio {
    public String a;
    @dzsi
    public duis b;
    private String c;
    private String d;
    private duhx e;
    private String f;
    private final duhv g;
    private final long h;
    private double i;
    private int j = 1;
    private long k;
    private final Random l;
    private duio m;
    private int n;
    private int o;
    private final duic p;

    public duim(String str, String str2, duhx duhxVar, duhv duhvVar, String str3, duic duicVar, duiu duiuVar, boolean z) {
        if (!z) {
            this.c = str;
            this.d = str2;
            this.e = duhxVar == null ? new duhx() : duhxVar;
            this.f = str3;
        } else {
            this.a = str;
        }
        this.p = duicVar;
        this.g = duhvVar;
        this.h = duiuVar.a;
        this.i = dcyn.a;
        this.k = 1L;
        this.l = new Random();
        this.o = 1;
    }

    private final boolean d() {
        try {
            return this.g.i();
        } catch (IOException e) {
            throw new duiq(duip.REQUEST_BODY_READ_ERROR, "Could not call hasMoreData() on upload stream.", e);
        }
    }

    private final void h() {
        if (this.g.d() > this.g.c()) {
            this.g.b();
            j();
        }
    }

    private final duhy i(duhx duhxVar, String str, duhv duhvVar) {
        dehn<duir> a;
        k();
        duhx duhxVar2 = new duhx();
        duhxVar2.a("X-Goog-Upload-Protocol", "resumable");
        duhxVar2.a("X-Goog-Upload-Command", str);
        for (String str2 : duhxVar.b()) {
            for (String str3 : duhxVar.c(str2)) {
                duhxVar2.a(str2, str3);
            }
        }
        duio a2 = this.p.a(str.equals("start") ? this.c : this.a, str.contains("start") ? this.d : "PUT", duhxVar2, duhvVar);
        if (this.b != null && !str.equals("start")) {
            synchronized (this) {
                a2.g(new duik(this, this.b), this.n);
            }
        }
        synchronized (this) {
            this.m = a2;
            a = a2.a();
        }
        try {
            duir duirVar = a.get();
            if (duirVar.a()) {
                if (duirVar.a.a != duip.CANCELED) {
                    throw duirVar.a;
                }
                k();
                throw new duiq(duip.CONNECTION_ERROR, "");
            }
            return duirVar.b;
        } catch (InterruptedException | ExecutionException e) {
            String valueOf = String.valueOf(e.getMessage());
            throw new RuntimeException(valueOf.length() != 0 ? "Unexpected error occurred: ".concat(valueOf) : new String("Unexpected error occurred: "));
        }
    }

    private final void j() {
        this.k = 1L;
        this.i = dcyn.a;
    }

    private final synchronized void k() {
        int i;
        while (true) {
            i = this.o;
            if (i != 2) {
                break;
            }
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
        if (i == 3) {
            throw new duiq(duip.CANCELED, "");
        }
    }

    private final void l(duiq duiqVar) {
        if (this.i >= this.h) {
            throw duiqVar;
        }
        double nextDouble = this.l.nextDouble();
        try {
            double d = this.i;
            long j = this.k;
            double d2 = j;
            Double.isNaN(d2);
            this.i = d + (d2 * nextDouble);
            double d3 = j * 1000;
            Double.isNaN(d3);
            Thread.sleep((long) (d3 * nextDouble));
        } catch (InterruptedException unused) {
        }
        long j2 = this.k;
        this.k = j2 + j2;
    }

    private static final boolean m(duhy duhyVar) {
        return duhyVar.a / 100 == 4;
    }

    private static final boolean n(duhy duhyVar) {
        String d;
        duhx duhxVar = duhyVar.b;
        return (duhxVar == null || (d = duhxVar.d("X-Goog-Upload-Status")) == null || !dbqa.e("final", d)) ? false : true;
    }

    private static final boolean o(duhy duhyVar) {
        String d;
        duhx duhxVar = duhyVar.b;
        return duhxVar != null && (d = duhxVar.d("X-Goog-Upload-Status")) != null && dbqa.e("active", d) && duhyVar.a == 200;
    }

    @Override // defpackage.duio
    public final dehn<duir> a() {
        deho b = deho.b(new duij(this));
        deip deipVar = new deip();
        deipVar.a = "Scotty-Uploader-ResumableTransfer-%d";
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(deip.a(deipVar));
        newSingleThreadExecutor.submit(b);
        newSingleThreadExecutor.shutdown();
        return b;
    }

    public final duhy c() {
        duhy i;
        synchronized (this) {
        }
        j();
        while (true) {
            try {
                i = i(this.e, "start", new duin(dbsj.e(this.f)));
            } catch (duiq e) {
                if (e.a()) {
                    l(e);
                } else {
                    throw e;
                }
            }
            if (n(i)) {
                return i;
            }
            if (!o(i)) {
                if (m(i)) {
                    return i;
                }
                l(new duiq(duip.SERVER_ERROR, i.a()));
            } else {
                duhx duhxVar = i.b;
                String d = duhxVar.d("X-Goog-Upload-URL");
                try {
                    new URL(d);
                    this.a = d;
                    synchronized (this) {
                        duis duisVar = this.b;
                        if (duisVar != null) {
                            duisVar.b(this);
                        }
                    }
                    String d2 = duhxVar.d("X-Goog-Upload-Chunk-Granularity");
                    if (d2 != null) {
                        try {
                            this.j = Integer.parseInt(d2);
                        } catch (NumberFormatException e2) {
                            throw new duiq(duip.SERVER_ERROR, "Server returned an invalid chunk granularity.", e2);
                        }
                    }
                    return b(false);
                } catch (MalformedURLException e3) {
                    throw new duiq(duip.SERVER_ERROR, "Server returned an invalid upload url.", e3);
                }
            }
        }
    }

    @Override // defpackage.duio
    public final void e() {
        synchronized (this) {
            duio duioVar = this.m;
            if (duioVar != null) {
                duioVar.e();
                this.m = null;
            }
            this.o = 3;
            notifyAll();
        }
    }

    @Override // defpackage.duio
    public final long f() {
        return this.g.d();
    }

    @Override // defpackage.duio
    public final synchronized void g(duis duisVar, int i) {
        dbsk.b(true, "Progress threshold (bytes) must be greater than 0");
        dbsk.b(true, "Progress threshold (millis) must be greater or equal to 0");
        this.b = duisVar;
        this.n = 1;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:22|(2:61|(1:63)(4:64|65|66|(1:71)(1:70)))(1:24)|25|(1:60)(1:(1:28)(1:59))|29|(1:31)|32|33|34|35|(2:37|(1:44)(1:(1:40)(3:41|42|43)))(2:51|52)) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00db, code lost:
        if (m(r1) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e1, code lost:
        if (r1.a == 400) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e4, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e5, code lost:
        r9.l(new defpackage.duiq(defpackage.duip.SERVER_ERROR, r1.a()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f4, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f9, code lost:
        if (r0.a() != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fb, code lost:
        r9.l(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011c, code lost:
        r1 = r0.b.d("X-Goog-Upload-Chunk-Granularity");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0124, code lost:
        if (r1 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0126, code lost:
        r9.j = java.lang.Integer.parseInt(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012d, code lost:
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0137, code lost:
        throw new defpackage.duiq(defpackage.duip.SERVER_ERROR, "Server returned an invalid chunk granularity.", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0138, code lost:
        r0 = java.lang.Long.parseLong(r0.b.d("X-Goog-Upload-Size-Received"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014c, code lost:
        if (r0 < r9.g.c()) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0156, code lost:
        if (r0 < r9.g.d()) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0159, code lost:
        r9.g.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0166, code lost:
        if (r9.g.d() >= r0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016c, code lost:
        if (r9.d() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016e, code lost:
        r2 = r9.g;
        r2.g(r0 - r2.d());
        r9.g.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017f, code lost:
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0189, code lost:
        throw new defpackage.duiq(defpackage.duip.REQUEST_BODY_READ_ERROR, "Could not skip in the data stream.", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x018a, code lost:
        r3 = defpackage.duip.REQUEST_BODY_READ_ERROR;
        r4 = r9.g.d();
        r9 = new java.lang.StringBuilder(241);
        r9.append("Upload stream does not have more data but it should. Maybe the caller passed in a data stream to upload with a mark position that didn't match the transfer handle? Confirmed offset from server: ");
        r9.append(r0);
        r9.append(" Size: ");
        r9.append(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01b2, code lost:
        throw new defpackage.duiq(r3, r9.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b3, code lost:
        r9.h();
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b8, code lost:
        r3 = defpackage.duip.SERVER_ERROR;
        r4 = r9.g.c();
        r9 = new java.lang.StringBuilder((int) com.google.android.filament.R.styleable.AppCompatTheme_windowFixedWidthMinor);
        r9.append("The server lost bytes that were previously committed. Our offset: ");
        r9.append(r4);
        r9.append(", server offset: ");
        r9.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01e0, code lost:
        throw new defpackage.duiq(r3, r9.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01e1, code lost:
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01eb, code lost:
        throw new defpackage.duiq(defpackage.duip.SERVER_ERROR, "Failed to parse X-Goog-Upload-Size-Received header", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0202, code lost:
        if (r0 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0206, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0214, code lost:
        throw r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00e5 -> B:106:0x00fe). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00fb -> B:106:0x00fe). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.duhy b(boolean r9) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duim.b(boolean):duhy");
    }
}
