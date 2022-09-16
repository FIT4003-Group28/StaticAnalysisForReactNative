package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aeyi  reason: default package */
/* loaded from: classes.dex */
public final class aeyi implements pel, pnk, aerw {
    final per a;
    public pob b;
    public boolean d;
    public boolean e;
    private final Handler f;
    private final aesn g;
    private Integer i;
    private String k;
    private String l;
    private byte[] n;
    private final aewp p;
    private final afjz q;
    private aflm h = aflm.a;
    public int c = 0;
    private final Random j = new Random();
    private final List m = new ArrayList();
    private int o = -1;

    public aeyi(aesh aeshVar, HashMap hashMap, Handler handler, aewp aewpVar, afjz afjzVar) {
        this.f = handler;
        aesn aesnVar = new aesn(aeshVar, handler, this);
        this.g = aesnVar;
        this.a = new per(phk.d, aesnVar, hashMap, this);
        this.p = aewpVar;
        this.q = afjzVar;
    }

    @Override // defpackage.pnk
    public final void K(int i, ppz ppzVar) {
    }

    @Override // defpackage.pnk
    public final void L(int i, ppz ppzVar) {
    }

    @Override // defpackage.pnk
    public final void M(int i, ppz ppzVar) {
    }

    @Override // defpackage.pnk
    public final /* synthetic */ void N(int i, ppz ppzVar, int i2) {
    }

    @Override // defpackage.pnk
    public final void O(int i, ppz ppzVar, Exception exc) {
        String l = l();
        if (this.b != null) {
            afki afkiVar = afki.DRM;
            Object[] objArr = new Object[2];
            objArr[0] = amps.d(exc.getLocalizedMessage());
            objArr[1] = l != null ? l : "null";
            afkj.e(afkiVar, "DRM Exception: %s -- MediaDRM Metrics: %s", objArr);
        }
        if (l != null) {
            afbi afbiVar = this.p.a.i.n;
            if (afbiVar == null) {
                afkj.d(afki.DRM, "drmQoeMetrics were received without any playback");
            } else if (!afbiVar.a().ac() || l.length() <= 0 || !afca.b(afbiVar.a().a())) {
            } else {
                afbiVar.b.i("drm", new aeqx(l));
            }
        }
    }

    @Override // defpackage.pnk
    public final /* synthetic */ void P(int i, ppz ppzVar) {
    }

    @Override // defpackage.pnk
    public final /* synthetic */ void Z() {
    }

    @Override // defpackage.pel
    public final void a() {
        this.h.l();
    }

    @Override // defpackage.pel
    public final void b() {
        this.h.m();
    }

    @Override // defpackage.pel
    public final void c() {
        this.h.n();
    }

    @Override // defpackage.pel
    public final void d() {
        this.h.o();
    }

    @Override // defpackage.pel
    public final void e() {
        this.h.p();
    }

    @Override // defpackage.pel
    public final void f() {
        this.h.q();
    }

    @Override // defpackage.pel
    public final void g() {
        this.h.r();
        afbi afbiVar = this.p.a.i.n;
        if (afbiVar == null) {
            afkj.d(afki.DRM, "DRM License was received without any playback");
        } else {
            afbiVar.f39J = true;
        }
    }

    @Override // defpackage.pel
    public final void h() {
        this.h.s();
    }

    @Override // defpackage.pel
    public final void i() {
        aewp aewpVar = this.p;
        String str = this.k;
        afbi afbiVar = aewpVar.a.i.n;
        if (afbiVar == null) {
            afkj.d(afki.DRM, "onOfflineDrmSessionExpirationUpdate were received without any playback");
        } else {
            afbiVar.b.l(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int j() {
        char c;
        String str = "";
        pob pobVar = this.b;
        if (pobVar == null) {
            return -1;
        }
        Integer num = this.i;
        if (num == null) {
            try {
                String e = pobVar.e();
                if (e != null) {
                    str = e;
                }
            } catch (Throwable th) {
                String valueOf = String.valueOf(th.getLocalizedMessage());
                afus.b(1, 6, valueOf.length() != 0 ? "Cannot get mediaDrm securityLevel ".concat(valueOf) : new String("Cannot get mediaDrm securityLevel "));
            }
            switch (str.hashCode()) {
                case 2405:
                    if (str.equals("L1")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 2406:
                    if (str.equals("L2")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 2407:
                    if (str.equals("L3")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0 || c == 1) {
                this.i = 1;
            } else if (c == 2) {
                this.i = 3;
            } else {
                this.i = -1;
            }
            return this.i.intValue();
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized pnp k() {
        return this.a;
    }

    public final String l() {
        pob pobVar = this.b;
        return pobVar == null ? "" : afca.f(pobVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(final pob pobVar) {
        long j = this.q.o().aa;
        if (j > 0) {
            this.f.postDelayed(new Runnable() { // from class: aeyh
                @Override // java.lang.Runnable
                public final void run() {
                    pob.this.h();
                }
            }, j);
        } else {
            pobVar.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void n() {
        this.c = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean o() {
        return this.c == 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa A[Catch: all -> 0x01a3, TryCatch #0 {, blocks: (B:5:0x0009, B:7:0x002d, B:9:0x0031, B:23:0x0059, B:41:0x0084, B:65:0x0117, B:70:0x011f, B:72:0x0131, B:73:0x0133, B:75:0x0137, B:77:0x0145, B:78:0x014b, B:79:0x014d, B:82:0x0159, B:86:0x016f, B:90:0x0179, B:92:0x018e, B:93:0x0190, B:95:0x0194, B:97:0x019c, B:83:0x0160, B:85:0x016a, B:44:0x00aa, B:46:0x00ae, B:48:0x00b6, B:49:0x00b8, B:51:0x00bc, B:52:0x00c1, B:55:0x00cd, B:58:0x00d6, B:60:0x00e6, B:62:0x00f0, B:63:0x010d, B:61:0x00eb, B:64:0x010e, B:28:0x0062, B:30:0x0068, B:32:0x006e, B:33:0x0070, B:34:0x0073, B:36:0x0079, B:37:0x007b, B:12:0x0038, B:16:0x0042, B:18:0x004e, B:19:0x0050), top: B:107:0x0009, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011b A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void p(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r19, boolean r20, defpackage.aetv r21, defpackage.aeub r22, byte[] r23, boolean r24, long r25, int r27) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeyi.p(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel, boolean, aetv, aeub, byte[], boolean, long, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0025 A[Catch: all -> 0x00a3, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:7:0x000d, B:10:0x0014, B:12:0x0018, B:17:0x0025, B:19:0x002f, B:21:0x0039, B:22:0x003e, B:23:0x0045, B:34:0x0061, B:36:0x0069, B:39:0x0072, B:41:0x0083, B:42:0x0085, B:45:0x008e, B:13:0x001c, B:14:0x0020), top: B:53:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039 A[Catch: all -> 0x00a3, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:7:0x000d, B:10:0x0014, B:12:0x0018, B:17:0x0025, B:19:0x002f, B:21:0x0039, B:22:0x003e, B:23:0x0045, B:34:0x0061, B:36:0x0069, B:39:0x0072, B:41:0x0083, B:42:0x0085, B:45:0x008e, B:13:0x001c, B:14:0x0020), top: B:53:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061 A[Catch: all -> 0x00a3, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:7:0x000d, B:10:0x0014, B:12:0x0018, B:17:0x0025, B:19:0x002f, B:21:0x0039, B:22:0x003e, B:23:0x0045, B:34:0x0061, B:36:0x0069, B:39:0x0072, B:41:0x0083, B:42:0x0085, B:45:0x008e, B:13:0x001c, B:14:0x0020), top: B:53:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008e A[Catch: all -> 0x00a3, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:7:0x000d, B:10:0x0014, B:12:0x0018, B:17:0x0025, B:19:0x002f, B:21:0x0039, B:22:0x003e, B:23:0x0045, B:34:0x0061, B:36:0x0069, B:39:0x0072, B:41:0x0083, B:42:0x0085, B:45:0x008e, B:13:0x001c, B:14:0x0020), top: B:53:0x0001 }] */
    @Override // defpackage.aerw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void rv() {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.c     // Catch: java.lang.Throwable -> La3
            r1 = 2
            if (r0 == r1) goto La1
            pob r0 = r7.b     // Catch: java.lang.Throwable -> La3
            r2 = 3
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L20
            int r0 = r7.j()     // Catch: java.lang.Throwable -> La3
            if (r0 == r4) goto L14
            goto L20
        L14:
            boolean r0 = r7.d     // Catch: java.lang.Throwable -> La3
            if (r0 != 0) goto L1c
            r0 = 4
            r7.c = r0     // Catch: java.lang.Throwable -> La3
            goto L22
        L1c:
            r7.c = r1     // Catch: java.lang.Throwable -> La3
            r0 = 1
            goto L23
        L20:
            r7.c = r2     // Catch: java.lang.Throwable -> La3
        L22:
            r0 = 0
        L23:
            if (r0 == 0) goto L45
            java.util.List r5 = r7.m     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = r7.l     // Catch: java.lang.Throwable -> La3
            boolean r5 = r5.contains(r6)     // Catch: java.lang.Throwable -> La3
            if (r5 != 0) goto L45
            java.util.List r5 = r7.m     // Catch: java.lang.Throwable -> La3
            int r5 = r5.size()     // Catch: java.lang.Throwable -> La3
            r6 = 10
            if (r5 < r6) goto L3e
            java.util.List r5 = r7.m     // Catch: java.lang.Throwable -> La3
            r5.remove(r3)     // Catch: java.lang.Throwable -> La3
        L3e:
            java.util.List r3 = r7.m     // Catch: java.lang.Throwable -> La3
            java.lang.String r5 = r7.l     // Catch: java.lang.Throwable -> La3
            r3.add(r5)     // Catch: java.lang.Throwable -> La3
        L45:
            aewp r3 = r7.p     // Catch: java.lang.Throwable -> La3
            int r5 = r7.c     // Catch: java.lang.Throwable -> La3
            if (r5 == 0) goto L5d
            if (r5 == r4) goto L5a
            if (r5 == r1) goto L57
            if (r5 == r2) goto L54
            java.lang.String r1 = "SecureSurfaceUnavailable"
            goto L5f
        L54:
            java.lang.String r1 = "WidevineL1"
            goto L5f
        L57:
            java.lang.String r1 = "HD"
            goto L5f
        L5a:
            java.lang.String r1 = "SD"
            goto L5f
        L5d:
            java.lang.String r1 = "Clear"
        L5f:
            if (r0 == 0) goto L8e
            aewx r0 = r3.a     // Catch: java.lang.Throwable -> La3
            aevy r0 = r0.i     // Catch: java.lang.Throwable -> La3
            afbi r0 = r0.n     // Catch: java.lang.Throwable -> La3
            if (r0 != 0) goto L72
            afki r0 = defpackage.afki.DRM     // Catch: java.lang.Throwable -> La3
            java.lang.String r1 = "onHdAllowed were received without any playback"
            defpackage.afkj.d(r0, r1)     // Catch: java.lang.Throwable -> La3
            monitor-exit(r7)
            return
        L72:
            aeub r2 = r0.K     // Catch: java.lang.Throwable -> La3
            java.lang.String r5 = "hdallowed"
            r2.i(r5, r1)     // Catch: java.lang.Throwable -> La3
            com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r0 = r0.a()     // Catch: java.lang.Throwable -> La3
            atzv r0 = r0.c     // Catch: java.lang.Throwable -> La3
            aqwu r0 = r0.e     // Catch: java.lang.Throwable -> La3
            if (r0 != 0) goto L85
            aqwu r0 = defpackage.aqwu.b     // Catch: java.lang.Throwable -> La3
        L85:
            boolean r0 = r0.bi     // Catch: java.lang.Throwable -> La3
            aewx r1 = r3.a     // Catch: java.lang.Throwable -> La3
            r1.ag(r4, r0)     // Catch: java.lang.Throwable -> La3
            monitor-exit(r7)
            return
        L8e:
            aewx r0 = r3.a     // Catch: java.lang.Throwable -> La3
            aevy r0 = r0.i     // Catch: java.lang.Throwable -> La3
            aetv r0 = r0.b()     // Catch: java.lang.Throwable -> La3
            aewx r2 = r3.a     // Catch: java.lang.Throwable -> La3
            afkl r3 = defpackage.afkl.DRM     // Catch: java.lang.Throwable -> La3
            java.lang.String r4 = "hdunavailable"
            r2.A(r0, r3, r4, r1)     // Catch: java.lang.Throwable -> La3
            monitor-exit(r7)
            return
        La1:
            monitor-exit(r7)
            return
        La3:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeyi.rv():void");
    }
}
