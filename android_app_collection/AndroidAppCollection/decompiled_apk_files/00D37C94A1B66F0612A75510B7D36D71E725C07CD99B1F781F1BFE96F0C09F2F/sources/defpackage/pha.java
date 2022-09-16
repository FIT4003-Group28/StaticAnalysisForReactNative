package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.view.Surface;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.video.DummySurface;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: pha  reason: default package */
/* loaded from: classes4.dex */
public final class pha implements avw {
    public final ScheduledExecutorService b;
    public final Executor c;
    public ExecutorService d;
    public int e;
    public final LruCache f;
    public int g;
    public boolean h;
    public final aewc i;
    public final afjz j;
    private final pgo k;
    private final Context l;
    private boolean m;
    private afly n;
    private int o;

    public pha(ScheduledExecutorService scheduledExecutorService, Context context, aewc aewcVar, afjz afjzVar, final amqo amqoVar) {
        ExecutorService newSingleThreadExecutor = afjzVar.M() ? Executors.newSingleThreadExecutor(pgw.a) : scheduledExecutorService;
        this.e = 0;
        this.o = 11;
        this.m = true;
        this.b = scheduledExecutorService;
        this.l = context;
        this.i = aewcVar;
        this.j = afjzVar;
        this.k = new pgo();
        this.g = afjzVar.h();
        this.c = new Executor() { // from class: pgu
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                Handler handler = (Handler) amqo.this.get();
                if (handler.getLooper().equals(Looper.myLooper())) {
                    runnable.run();
                } else {
                    handler.post(runnable);
                }
            }
        };
        this.d = newSingleThreadExecutor;
        this.f = new pgy(this, Math.max(this.g, 1));
    }

    private final synchronized pgz i(avv avvVar) {
        pgz pgzVar = (pgz) this.f.get(avvVar.a.a);
        if (pgzVar == null) {
            afki afkiVar = afki.ABR;
            if (this.f.size() > 0) {
                this.o = 25;
            }
            return null;
        }
        avv avvVar2 = pgzVar.b;
        Format format = avvVar2.c;
        Format format2 = avvVar.c;
        String str = format2.l;
        int i = 7;
        if (str != null && !str.equals(format.l) && p(5)) {
            i = 5;
        } else if (format.t != format2.t && p(3)) {
            i = 3;
        } else if (!avvVar2.a.e && ((format.q != format2.q || format.r != format2.r) && p(6))) {
            i = 6;
        } else if (!pxi.M(format.x, format2.x) && p(4)) {
            i = 4;
        } else if (format2.q > o(avvVar2.b, "max-width") && p(8)) {
            i = 8;
        } else if (format2.r > o(avvVar2.b, "max-height") && p(9)) {
            i = 9;
        } else if (format2.m > o(avvVar2.b, "max-input-size") && p(10)) {
            i = 10;
        } else if (pxi.a < 23 || n(avvVar2.b, 0.0f) == n(avvVar.b, 0.0f) || n(avvVar.b, -1.0f) != -1.0f || !p(7)) {
            if (avvVar.e != null) {
                i = 22;
            } else {
                i = (format2.e(format) || !p(29)) ? 0 : 29;
            }
        }
        if (i == 0) {
            return pgzVar;
        }
        afki afkiVar2 = afki.ABR;
        this.o = i;
        return null;
    }

    private final afly j() {
        k();
        afly aflyVar = new afly();
        this.n = aflyVar;
        return aflyVar;
    }

    private final void k() {
        afly aflyVar = this.n;
        if (aflyVar != null) {
            aflyVar.a = true;
        }
    }

    private static boolean l(avv avvVar, avv avvVar2) {
        return !avvVar2.c.e(avvVar.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0070, code lost:
        if (r4.a(r5) == false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized int m(boolean r4, java.lang.String r5, boolean r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.h     // Catch: java.lang.Throwable -> L7b
            r1 = 1
            if (r0 == 0) goto L79
            if (r6 != 0) goto L79
            if (r4 != 0) goto Lc
            goto L79
        Lc:
            afjz r4 = r3.j     // Catch: java.lang.Throwable -> L7b
            boolean r4 = r4.P()     // Catch: java.lang.Throwable -> L7b
            r6 = 2
            if (r4 == 0) goto L77
            int r4 = defpackage.pxi.a     // Catch: java.lang.Throwable -> L7b
            r0 = 29
            if (r4 != r0) goto L23
            java.lang.String r4 = "c2.android.aac.decoder"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L7b
            if (r4 != 0) goto L77
        L23:
            int r4 = defpackage.pxi.a     // Catch: java.lang.Throwable -> L7b
            r0 = 23
            if (r4 > r0) goto L31
            java.lang.String r4 = "OMX.google.vorbis.decoder"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L7b
            if (r4 != 0) goto L77
        L31:
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L7b
            r2 = 3
            if (r4 < r0) goto L75
            pgo r4 = r3.k     // Catch: java.lang.Throwable -> L7b
            afjz r0 = r3.j     // Catch: java.lang.Throwable -> L7b
            aacz r0 = r0.d     // Catch: java.lang.Throwable -> L7b
            apyy r0 = r0.b()     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L58
            atdx r0 = r0.q     // Catch: java.lang.Throwable -> L7b
            if (r0 != 0) goto L48
            atdx r0 = defpackage.atdx.a     // Catch: java.lang.Throwable -> L7b
        L48:
            apfj r0 = r0.b     // Catch: java.lang.Throwable -> L7b
            if (r0 != 0) goto L4e
            apfj r0 = defpackage.apfj.a     // Catch: java.lang.Throwable -> L7b
        L4e:
            int r0 = r0.c     // Catch: java.lang.Throwable -> L7b
            int r0 = defpackage.apfu.b(r0)     // Catch: java.lang.Throwable -> L7b
            if (r0 != 0) goto L57
            goto L58
        L57:
            r1 = r0
        L58:
            int r1 = r1 + (-1)
            if (r1 == r6) goto L75
            r6 = 4
            if (r1 == r2) goto L73
            if (r1 == r6) goto L68
            boolean r4 = r4.a(r5)     // Catch: java.lang.Throwable -> L7b
            if (r4 != 0) goto L75
            goto L73
        L68:
            boolean r0 = r4.c     // Catch: java.lang.Throwable -> L7b
            if (r0 != 0) goto L75
            boolean r4 = r4.a(r5)     // Catch: java.lang.Throwable -> L7b
            if (r4 == 0) goto L73
            goto L75
        L73:
            monitor-exit(r3)
            return r6
        L75:
            monitor-exit(r3)
            return r2
        L77:
            monitor-exit(r3)
            return r6
        L79:
            monitor-exit(r3)
            return r1
        L7b:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pha.m(boolean, java.lang.String, boolean):int");
    }

    private static float n(MediaFormat mediaFormat, float f) {
        return mediaFormat.containsKey("operating-rate") ? mediaFormat.getFloat("operating-rate") : f;
    }

    private static int o(MediaFormat mediaFormat, String str) {
        if (mediaFormat.containsKey(str)) {
            return mediaFormat.getInteger(str);
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean p(int r6) {
        /*
            r5 = this;
            afjz r0 = r5.j
            axxl r0 = r0.b
            aacz r1 = r0.b
            apyy r1 = r1.b()
            aqxe r1 = r1.C
            if (r1 != 0) goto L10
            aqxe r1 = defpackage.aqxe.a
        L10:
            r2 = 45354057(0x2b40c49, double:2.24078815E-316)
            boolean r4 = r1.a(r2)
            if (r4 == 0) goto L6c
            aoqp r1 = r1.b     // Catch: defpackage.aopx -> L46
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: defpackage.aopx -> L46
            boolean r3 = r1.containsKey(r2)     // Catch: defpackage.aopx -> L46
            if (r3 == 0) goto L40
            java.lang.Object r1 = r1.get(r2)     // Catch: defpackage.aopx -> L46
            aqxf r1 = (defpackage.aqxf) r1     // Catch: defpackage.aopx -> L46
            int r2 = r1.b     // Catch: defpackage.aopx -> L46
            r3 = 5
            if (r2 != r3) goto L35
            java.lang.Object r1 = r1.c     // Catch: defpackage.aopx -> L46
            aoob r1 = (defpackage.aoob) r1     // Catch: defpackage.aopx -> L46
            goto L37
        L35:
            aoob r1 = defpackage.aoob.b     // Catch: defpackage.aopx -> L46
        L37:
            aotn r2 = defpackage.aotn.a     // Catch: defpackage.aopx -> L46
            aopi r1 = defpackage.aopi.parseFrom(r2, r1)     // Catch: defpackage.aopx -> L46
            aotn r1 = (defpackage.aotn) r1     // Catch: defpackage.aopx -> L46
            goto L6e
        L40:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: defpackage.aopx -> L46
            r1.<init>()     // Catch: defpackage.aopx -> L46
            throw r1     // Catch: defpackage.aopx -> L46
        L46:
            r1 = move-exception
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = r1.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Unable to parse proto typed experiment flag: "
            int r3 = r1.length()
            if (r3 == 0) goto L64
            java.lang.String r1 = r2.concat(r1)
            goto L69
        L64:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
        L69:
            android.util.Log.e(r0, r1)
        L6c:
            aotn r1 = defpackage.aotn.a
        L6e:
            aopq r0 = r1.b
            int r6 = defpackage.alwb.n(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r6 = r0.contains(r6)
            if (r6 != 0) goto L80
            r6 = 1
            return r6
        L80:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pha.p(int):boolean");
    }

    public final synchronized void a() {
        this.h = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.avw
    public final synchronized avx b(final avv avvVar) {
        pgn pgnVar;
        pgn pgnVar2;
        boolean Y = this.j.Y();
        final int m = m(Y, avvVar.a.a, avvVar.e != null);
        if (Y) {
            int max = Math.max(this.j.h(), 1);
            if (this.g != max) {
                this.g = max;
                this.f.resize(max);
            }
            final pgz i = i(avvVar);
            if (i != null) {
                if (this.j.M()) {
                    final pgm pgmVar = new pgm(l(i.b, avvVar));
                    final afly j = j();
                    this.d.execute(new Runnable() { // from class: pgq
                        @Override // java.lang.Runnable
                        public final void run() {
                            pgn pgnVar3;
                            pha phaVar = pha.this;
                            afly aflyVar = j;
                            pgm pgmVar2 = pgmVar;
                            avv avvVar2 = avvVar;
                            pgz pgzVar = i;
                            int i2 = m;
                            phaVar.d(Thread.currentThread(), aflyVar, pgmVar2, avvVar2.d);
                            if (aflyVar.a) {
                                aflyVar.run();
                                return;
                            }
                            try {
                                pgnVar3 = phaVar.e(pgzVar, avvVar2, i2);
                            } catch (IOException e) {
                                phaVar.i.b(e);
                                try {
                                    pgn f = phaVar.f(avvVar2, i2);
                                    if (i2 != 1) {
                                        phaVar.f.put(avvVar2.a.a, new pgz(f, avvVar2));
                                    }
                                    pgnVar3 = f;
                                } catch (IOException | RuntimeException e2) {
                                    pgmVar2.r(e2, avvVar2.d);
                                    aflyVar.run();
                                    return;
                                }
                            }
                            pgmVar2.d(pgnVar3);
                            aflyVar.run();
                            afki afkiVar = afki.ABR;
                            String str = avvVar2.a.a;
                        }
                    });
                    pgnVar2 = pgmVar;
                } else {
                    try {
                        pgnVar2 = e(i, avvVar, m);
                    } catch (IOException e) {
                        this.i.b(e);
                        pgnVar2 = null;
                    }
                }
                if (pgnVar2 != null) {
                    return pgnVar2;
                }
            }
            int size = this.f.size();
            int i2 = this.g;
            if (size >= i2) {
                this.f.trimToSize(Math.max(i2 - 1, 0));
            }
        } else if (this.h) {
            g(26);
        }
        if (this.j.M()) {
            final pgm pgmVar2 = new pgm(false);
            final afly j2 = j();
            this.d.execute(new Runnable() { // from class: pgr
                @Override // java.lang.Runnable
                public final void run() {
                    pha phaVar = pha.this;
                    afly aflyVar = j2;
                    pgm pgmVar3 = pgmVar2;
                    avv avvVar2 = avvVar;
                    int i3 = m;
                    phaVar.d(Thread.currentThread(), aflyVar, pgmVar3, avvVar2.d);
                    if (aflyVar.a) {
                        aflyVar.run();
                        return;
                    }
                    int size2 = phaVar.f.size();
                    int i4 = phaVar.g;
                    if (size2 >= i4) {
                        phaVar.f.trimToSize(Math.max(i4 - 1, 0));
                    }
                    try {
                        pgn f = phaVar.f(avvVar2, i3);
                        if (aflyVar.a) {
                            f.h();
                            aflyVar.run();
                            return;
                        }
                        synchronized (phaVar) {
                            if (phaVar.h && i3 != 1) {
                                phaVar.f.put(avvVar2.a.a, new pgz(f, avvVar2));
                            }
                        }
                        pgmVar3.d(f);
                        aflyVar.run();
                        afki afkiVar = afki.ABR;
                        String str = avvVar2.a.a;
                    } catch (IOException | RuntimeException e2) {
                        pgmVar3.r(e2, avvVar2.d);
                        aflyVar.run();
                    }
                }
            });
            pgnVar = pgmVar2;
        } else {
            pgn f = f(avvVar, m);
            pgnVar = f;
            if (m != 1) {
                this.f.put(avvVar.a.a, new pgz(f, avvVar));
                return f;
            }
        }
        return pgnVar;
    }

    public final synchronized void c() {
        for (pgz pgzVar : this.f.snapshot().values()) {
            pgn pgnVar = pgzVar.a;
            int i = pgnVar.d;
            DummySurface dummySurface = null;
            if (i == 0) {
                throw null;
            }
            if (i == 4) {
                afms.e(Build.VERSION.SDK_INT >= 23, "Attempt to use REUSE_WITH_SYNTHETIC_SURFACE on invalid SDK.");
                if (Build.VERSION.SDK_INT >= 23) {
                    if (pgnVar.c == null) {
                        pgnVar.c = DummySurface.a(pgnVar.a, pgnVar.b);
                    }
                    afki afkiVar = afki.ABR;
                    pgnVar.j(pgnVar.c);
                    dummySurface = pgnVar.c;
                }
            }
            DummySurface dummySurface2 = dummySurface;
            if (dummySurface2 != null) {
                avv avvVar = pgzVar.b;
                avz avzVar = avvVar.a;
                MediaFormat mediaFormat = avvVar.b;
                Format format = avvVar.c;
                MediaCrypto mediaCrypto = avvVar.e;
                int i2 = avvVar.f;
                pgzVar.b = new avv(avzVar, mediaFormat, format, dummySurface2, mediaCrypto);
            }
        }
    }

    public final void d(final Thread thread, final afly aflyVar, final pgm pgmVar, final Surface surface) {
        Long l;
        ScheduledExecutorService scheduledExecutorService = this.b;
        Runnable runnable = new Runnable() { // from class: pgt
            @Override // java.lang.Runnable
            public final void run() {
                final pha phaVar = pha.this;
                Thread thread2 = thread;
                afly aflyVar2 = aflyVar;
                pgm pgmVar2 = pgmVar;
                Surface surface2 = surface;
                if (aflyVar2.isDone() || phaVar.d == phaVar.b) {
                    return;
                }
                phaVar.e++;
                afkj.e(afki.CODEC_REUSE, "Codec initialization stuck. Time No. %d", Integer.valueOf(phaVar.e));
                thread2.interrupt();
                aflyVar2.a = true;
                pgmVar2.r(new TimeoutException(), surface2);
                aflyVar2.run();
                phaVar.d.shutdownNow();
                phaVar.d = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: pgv
                    @Override // java.util.concurrent.ThreadFactory
                    public final Thread newThread(Runnable runnable2) {
                        int i = pha.this.e;
                        StringBuilder sb = new StringBuilder(17);
                        sb.append("codec-");
                        sb.append(i);
                        return new Thread(runnable2, sb.toString());
                    }
                });
                aewc aewcVar = phaVar.i;
                int i = phaVar.e;
                StringBuilder sb = new StringBuilder(47);
                sb.append("Codec initialization stuck. Time No.");
                sb.append(i);
                aewcVar.b(new TimeoutException(sb.toString()));
            }
        };
        aqxe aqxeVar = this.j.b.b.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        long j = 0;
        if (aqxeVar.a(45352816L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45352816L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45352816L);
            if (aqxfVar.b == 2) {
                j = ((Long) aqxfVar.c).longValue();
            }
            l = Long.valueOf(j);
        } else {
            l = 0L;
        }
        int intValue = Long.valueOf(l.longValue()).intValue();
        if (intValue == 0) {
            intValue = 5000;
        }
        scheduledExecutorService.schedule(runnable, intValue, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.pgn e(defpackage.pgz r23, defpackage.avv r24, int r25) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pha.e(pgz, avv, int):pgn");
    }

    public final pgn f(avv avvVar, int i) {
        MediaCodec createByCodecName;
        String str = avvVar.a.a;
        MediaCodec mediaCodec = null;
        try {
            if (str.length() != 0) {
                "createCodec:".concat(str);
            }
            int i2 = pxi.a;
            createByCodecName = MediaCodec.createByCodecName(str);
        } catch (IOException e) {
            e = e;
        } catch (RuntimeException e2) {
            e = e2;
        }
        try {
            boolean z = false;
            createByCodecName.configure(avvVar.b, avvVar.d, avvVar.e, 0);
            createByCodecName.start();
            int i3 = this.m ? 11 : this.o;
            afki afkiVar = afki.CODEC_REUSE;
            Object[] objArr = new Object[3];
            objArr[0] = str;
            objArr[1] = i != 1 ? i != 2 ? i != 3 ? "FLUSH_AND_SYNTHETIC_SURFACE" : "FLUSH" : "STOP" : "RELEASE";
            String m = alwb.m(i3);
            if (i3 == 0) {
                throw null;
            }
            objArr[2] = m;
            afkj.e(afkiVar, "Codec created: %s. ReleaseMode %s. InitReason %s.", objArr);
            aewc aewcVar = this.i;
            aewcVar.a.b().a().aR(i3);
            aewcVar.d.i("cir", String.format(Locale.US, "reused.false;reason.%s", alwb.m(i3)));
            this.m = false;
            MediaCrypto mediaCrypto = avvVar.e;
            if (mediaCrypto == null) {
                z = true;
            }
            if (mediaCrypto != null) {
                this.o = 23;
            } else {
                this.o = 2;
            }
            return new pgn(createByCodecName, avvVar.d, i, this.l, true ^ z);
        } catch (IOException | RuntimeException e3) {
            e = e3;
            mediaCodec = createByCodecName;
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
    }

    public final void g(final int i) {
        this.c.execute(new Runnable() { // from class: pgs
            @Override // java.lang.Runnable
            public final void run() {
                pha.this.h(i);
            }
        });
    }

    public final synchronized void h(int i) {
        this.h = false;
        this.o = i;
        k();
        this.f.evictAll();
    }
}
