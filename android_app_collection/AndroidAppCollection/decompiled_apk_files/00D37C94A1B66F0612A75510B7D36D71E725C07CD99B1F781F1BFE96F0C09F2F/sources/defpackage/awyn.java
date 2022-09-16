package defpackage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* renamed from: awyn  reason: default package */
/* loaded from: classes2.dex */
public final class awyn implements awyp {
    public String a;
    public axij b;
    private String c;
    private String d;
    private awya e;
    private String f;
    private final awxx g;
    private final awxz h;
    private final long i;
    private double j;
    private int k = 1;
    private long l;
    private final Random m;
    private awyp n;
    private int o;
    private int p;
    private int q;

    public awyn(String str, String str2, awya awyaVar, awxx awxxVar, String str3, awxz awxzVar, awyu awyuVar, boolean z) {
        if (!z) {
            this.c = str;
            this.d = str2;
            this.e = awyaVar == null ? new awya() : awyaVar;
            this.f = str3;
        } else {
            this.a = str;
        }
        this.h = awxzVar;
        this.g = awxxVar;
        this.i = awyuVar.a;
        this.j = 0.0d;
        this.l = 1L;
        this.m = new Random();
        this.q = 1;
    }

    private final ankt h(final boolean z) {
        anku b = anku.b(new Callable() { // from class: awyl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                awys awysVar;
                awyb d;
                awyn awynVar = awyn.this;
                boolean z2 = z;
                try {
                    if (z2) {
                        d = awynVar.g(true);
                    } else if (awynVar.a == null) {
                        d = awynVar.g(false);
                    } else {
                        d = awynVar.d(true);
                    }
                    awysVar = new awys(d);
                } catch (awyr e) {
                    awysVar = new awys(e);
                } catch (Throwable th) {
                    awysVar = new awys(new awyr(awyq.UNKNOWN, th));
                }
                synchronized (awynVar) {
                    if (awynVar.b != null) {
                        if (!awysVar.a()) {
                            awynVar.b.b(awynVar);
                        } else if (!z2) {
                            awynVar.b.c(awynVar);
                        }
                    }
                }
                return awysVar;
            }
        });
        anlk anlkVar = new anlk();
        anlkVar.d("Scotty-Uploader-ResumableTransfer-%d");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(anlk.b(anlkVar));
        newSingleThreadExecutor.submit(b);
        newSingleThreadExecutor.shutdown();
        return b;
    }

    private final awyb k(awya awyaVar, String str, awxx awxxVar) {
        ankt a;
        l();
        awya awyaVar2 = new awya();
        awyaVar2.e("X-Goog-Upload-Protocol", "resumable");
        awyaVar2.e("X-Goog-Upload-Command", str);
        for (String str2 : awyaVar.c()) {
            for (String str3 : awyaVar.b(str2)) {
                awyaVar2.e(str2, str3);
            }
        }
        awyp a2 = this.h.a(str.equals("start") ? this.c : this.a, str.contains("start") ? this.d : "PUT", awyaVar2, awxxVar);
        if (this.b != null && !str.equals("start")) {
            synchronized (this) {
                a2.j(new awym(this, this.b, null, null), this.o, this.p);
            }
        }
        synchronized (this) {
            this.n = a2;
            a = a2.a();
        }
        try {
            awys awysVar = (awys) a.get();
            if (awysVar.b()) {
                if (awysVar.a.a != awyq.CANCELED) {
                    throw awysVar.a;
                }
                l();
                throw new awyr(awyq.CONNECTION_ERROR, "");
            }
            return awysVar.b;
        } catch (InterruptedException | ExecutionException e) {
            String valueOf = String.valueOf(e.getMessage());
            throw new RuntimeException(valueOf.length() != 0 ? "Unexpected error occurred: ".concat(valueOf) : new String("Unexpected error occurred: "));
        }
    }

    private final synchronized void l() {
        int i;
        while (true) {
            i = this.q;
            if (i != 2) {
                break;
            }
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
        if (i == 3) {
            throw new awyr(awyq.CANCELED, "");
        }
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        araa.x(z);
    }

    private final void m(awyr awyrVar) {
        if (this.j >= this.i) {
            throw awyrVar;
        }
        double nextDouble = this.m.nextDouble();
        try {
            double d = this.j;
            long j = this.l;
            double d2 = j;
            Double.isNaN(d2);
            this.j = d + (d2 * nextDouble);
            double d3 = j * 1000;
            Double.isNaN(d3);
            Thread.sleep((long) (d3 * nextDouble));
        } catch (InterruptedException unused) {
        }
        long j2 = this.l;
        this.l = j2 + j2;
    }

    private final void n() {
        if (this.g.e() > this.g.c()) {
            this.g.g();
            o();
        }
    }

    private final void o() {
        this.l = 1L;
        this.j = 0.0d;
    }

    private final boolean p() {
        try {
            return this.g.i();
        } catch (IOException e) {
            throw new awyr(awyq.REQUEST_BODY_READ_ERROR, "Could not call hasMoreData() on upload stream.", e);
        }
    }

    private static final boolean q(awyb awybVar) {
        return awybVar.a / 100 == 4;
    }

    private static final boolean r(awyb awybVar) {
        String a;
        awya awyaVar = awybVar.b;
        return (awyaVar == null || (a = awyaVar.a("X-Goog-Upload-Status")) == null || !akzj.i("final", a)) ? false : true;
    }

    private static final boolean s(awyb awybVar) {
        String a;
        awya awyaVar = awybVar.b;
        return awyaVar != null && (a = awyaVar.a("X-Goog-Upload-Status")) != null && akzj.i("active", a) && awybVar.a == 200;
    }

    @Override // defpackage.awyp
    public final ankt a() {
        return h(false);
    }

    @Override // defpackage.awyp
    public final ankt b() {
        return h(true);
    }

    @Override // defpackage.awyp
    public final awxx c() {
        return this.g;
    }

    @Override // defpackage.awyp
    public final String e() {
        return this.a;
    }

    @Override // defpackage.awyp
    public final void f() {
        synchronized (this) {
            awyp awypVar = this.n;
            if (awypVar != null) {
                awypVar.f();
                this.n = null;
            }
            this.q = 3;
            notifyAll();
        }
    }

    public final awyb g(boolean z) {
        awyb k;
        synchronized (this) {
            axij axijVar = this.b;
            if (axijVar != null) {
                axijVar.d();
            }
        }
        o();
        while (true) {
            try {
                k = k(this.e, "start", new awyo(amps.d(this.f)));
            } catch (awyr e) {
                if (e.a()) {
                    m(e);
                } else {
                    throw e;
                }
            }
            if (r(k)) {
                return k;
            }
            if (!s(k)) {
                if (q(k)) {
                    return k;
                }
                m(new awyr(awyq.SERVER_ERROR, k.a()));
            } else {
                awya awyaVar = k.b;
                String a = awyaVar.a("X-Goog-Upload-URL");
                try {
                    new URL(a);
                    this.a = a;
                    synchronized (this) {
                    }
                    String a2 = awyaVar.a("X-Goog-Upload-Chunk-Granularity");
                    if (a2 != null) {
                        try {
                            this.k = Integer.parseInt(a2);
                        } catch (NumberFormatException e2) {
                            throw new awyr(awyq.SERVER_ERROR, "Server returned an invalid chunk granularity.", e2);
                        }
                    }
                    return z ? k : d(false);
                } catch (MalformedURLException e3) {
                    throw new awyr(awyq.SERVER_ERROR, "Server returned an invalid upload url.", e3);
                }
            }
        }
    }

    @Override // defpackage.awyp
    public final boolean i() {
        return true;
    }

    @Override // defpackage.awyp
    public final synchronized void j(axij axijVar, int i, int i2) {
        aqxo.q(i > 0, "Progress threshold (bytes) must be greater than 0");
        aqxo.q(true, "Progress threshold (millis) must be greater or equal to 0");
        this.b = axijVar;
        this.o = i;
        this.p = i2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:22|(2:61|(1:63)(4:64|65|66|(1:71)(1:70)))(1:24)|25|(1:60)(1:(1:28)(1:59))|29|(1:31)|32|33|34|35|(2:37|(1:44)(1:(1:40)(3:41|42|43)))(2:51|52)) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00be, code lost:
        if (q(r0) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c4, code lost:
        if (r0.a == 400) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c7, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c8, code lost:
        r9.m(new defpackage.awyr(defpackage.awyq.SERVER_ERROR, r0.a()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d7, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00dc, code lost:
        if (r0.a() != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00de, code lost:
        r9.m(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ff, code lost:
        r1 = r0.b.a("X-Goog-Upload-Chunk-Granularity");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0107, code lost:
        if (r1 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0109, code lost:
        r9.k = java.lang.Integer.parseInt(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0110, code lost:
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011a, code lost:
        throw new defpackage.awyr(defpackage.awyq.SERVER_ERROR, "Server returned an invalid chunk granularity.", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011b, code lost:
        r0 = java.lang.Long.parseLong(r0.b.a("X-Goog-Upload-Size-Received"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012f, code lost:
        if (r0 < r9.g.c()) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0139, code lost:
        if (r0 < r9.g.e()) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013c, code lost:
        r9.g.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0149, code lost:
        if (r9.g.e() >= r0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014f, code lost:
        if (r9.p() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0151, code lost:
        r2 = r9.g;
        r2.f(r0 - r2.e());
        r9.g.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0162, code lost:
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016c, code lost:
        throw new defpackage.awyr(defpackage.awyq.REQUEST_BODY_READ_ERROR, "Could not skip in the data stream.", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016d, code lost:
        r3 = defpackage.awyq.REQUEST_BODY_READ_ERROR;
        r4 = r9.g.e();
        r9 = new java.lang.StringBuilder(241);
        r9.append("Upload stream does not have more data but it should. Maybe the caller passed in a data stream to upload with a mark position that didn't match the transfer handle? Confirmed offset from server: ");
        r9.append(r0);
        r9.append(" Size: ");
        r9.append(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0195, code lost:
        throw new defpackage.awyr(r3, r9.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0196, code lost:
        r9.n();
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x019b, code lost:
        r3 = defpackage.awyq.SERVER_ERROR;
        r4 = r9.g.c();
        r9 = new java.lang.StringBuilder((int) com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowFixedWidthMinor);
        r9.append("The server lost bytes that were previously committed. Our offset: ");
        r9.append(r4);
        r9.append(", server offset: ");
        r9.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01c3, code lost:
        throw new defpackage.awyr(r3, r9.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01c4, code lost:
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ce, code lost:
        throw new defpackage.awyr(defpackage.awyq.SERVER_ERROR, "Failed to parse X-Goog-Upload-Size-Received header", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01e5, code lost:
        if (r0 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e9, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01f7, code lost:
        throw r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00c8 -> B:104:0x00e1). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00de -> B:104:0x00e1). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.awyb d(boolean r9) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awyn.d(boolean):awyb");
    }
}
