package defpackage;

import android.content.Context;
import android.os.PowerManager;
import android.provider.Settings;
/* compiled from: PG */
/* renamed from: aktd  reason: default package */
/* loaded from: classes.dex */
public final class aktd extends aksz {
    private final azqb a;
    private final snc b;
    private final yni c;
    private final azqb d;
    private final azqb e;
    private final PowerManager f;
    private final Object g = new Object();
    private final Object h = new Object();
    private final aktc i;
    private aper j;
    private aktc k;
    private akta l;
    private boolean m;
    private long n;
    private final azqb o;
    private aktb p;

    public aktd(Context context, azqb azqbVar, snc sncVar, yni yniVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        aktb aktbVar = new aktb();
        this.i = aktbVar;
        this.k = aktbVar;
        this.a = azqbVar;
        this.b = sncVar;
        this.c = yniVar;
        this.d = azqbVar2;
        this.e = azqbVar3;
        this.o = azqbVar4;
        this.f = (PowerManager) context.getSystemService("power");
    }

    private final float g() {
        float a = ((zdp) this.e.get()).a();
        if (a == -1.0f) {
            return -1.0f;
        }
        return a * 1000000.0f;
    }

    private final aper h(Context context, float f) {
        aopa createBuilder = aper.a.createBuilder();
        createBuilder.copyOnWrite();
        aper aperVar = (aper) createBuilder.instance;
        aperVar.b |= 1;
        aperVar.c = (int) f;
        int i = ((aktp) this.a.get()).c;
        createBuilder.copyOnWrite();
        aper aperVar2 = (aper) createBuilder.instance;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        aperVar2.h = i2;
        aperVar2.b |= 32;
        aqlv f2 = ((yrj) this.d.get()).f();
        createBuilder.copyOnWrite();
        aper aperVar3 = (aper) createBuilder.instance;
        aperVar3.d = f2.B;
        int i3 = 2;
        aperVar3.b |= 2;
        try {
            int i4 = Settings.System.getInt(context.getContentResolver(), "screen_brightness");
            int i5 = Settings.System.getInt(context.getContentResolver(), "screen_brightness_mode");
            createBuilder.copyOnWrite();
            aper aperVar4 = (aper) createBuilder.instance;
            aperVar4.b |= 4;
            aperVar4.e = i4;
            int i6 = i5 == 1 ? 2 : 3;
            createBuilder.copyOnWrite();
            aper aperVar5 = (aper) createBuilder.instance;
            aperVar5.f = i6 - 1;
            aperVar5.b |= 8;
        } catch (Settings.SettingNotFoundException unused) {
            createBuilder.copyOnWrite();
            aper aperVar6 = (aper) createBuilder.instance;
            aperVar6.b |= 4;
            aperVar6.e = -1;
            createBuilder.copyOnWrite();
            aper aperVar7 = (aper) createBuilder.instance;
            aperVar7.f = 0;
            aperVar7.b |= 8;
        }
        PowerManager powerManager = this.f;
        if (powerManager != null) {
            if (true != powerManager.isPowerSaveMode()) {
                i3 = 3;
            }
            createBuilder.copyOnWrite();
            aper aperVar8 = (aper) createBuilder.instance;
            aperVar8.g = i3 - 1;
            aperVar8.b |= 16;
        } else {
            createBuilder.copyOnWrite();
            aper aperVar9 = (aper) createBuilder.instance;
            aperVar9.g = 0;
            aperVar9.b |= 16;
        }
        return (aper) createBuilder.mo39build();
    }

    private final void i() {
        synchronized (this.g) {
            this.j = null;
        }
    }

    private final boolean j() {
        int a;
        if (!this.m) {
            return false;
        }
        synchronized (this.h) {
            if (!this.k.b()) {
                this.k = this.i;
                return false;
            } else if (((aktp) this.a.get()).b != 2) {
                i();
                return false;
            } else {
                float g = g();
                if (g == -1.0f) {
                    i();
                    return false;
                }
                synchronized (this.g) {
                    aper aperVar = this.j;
                    if (aperVar == null) {
                        return true;
                    }
                    float f = aperVar.c - g;
                    synchronized (this.h) {
                        a = this.k.a();
                    }
                    return f >= ((float) a);
                }
            }
        }
    }

    @Override // defpackage.aksz, defpackage.aktk
    public final void a() {
        if (j()) {
            this.c.d(new akub(null));
        }
    }

    @Override // defpackage.aksz, defpackage.aktk
    public final void b() {
        synchronized (this.h) {
            akta aktaVar = this.l;
            if (aktaVar != null) {
                aktaVar.b = aktaVar.a.d();
                this.k = this.l;
            } else {
                this.k = this.i;
            }
        }
        i();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00a1 A[Catch: all -> 0x00b6, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000b, B:7:0x000d, B:9:0x0018, B:11:0x0024, B:12:0x0026, B:17:0x0040, B:19:0x0046, B:21:0x004a, B:22:0x004c, B:26:0x0053, B:28:0x0060, B:29:0x0062, B:31:0x0068, B:33:0x006c, B:34:0x006e, B:36:0x0072, B:37:0x0074, B:39:0x0078, B:41:0x0080, B:42:0x0082, B:44:0x0086, B:45:0x0088, B:47:0x0093, B:49:0x00a1, B:53:0x00ac, B:50:0x00a6, B:52:0x00aa, B:46:0x0090, B:55:0x00ae, B:56:0x00b0, B:13:0x0030, B:58:0x00b2, B:59:0x00b4), top: B:64:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a6 A[Catch: all -> 0x00b6, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000b, B:7:0x000d, B:9:0x0018, B:11:0x0024, B:12:0x0026, B:17:0x0040, B:19:0x0046, B:21:0x004a, B:22:0x004c, B:26:0x0053, B:28:0x0060, B:29:0x0062, B:31:0x0068, B:33:0x006c, B:34:0x006e, B:36:0x0072, B:37:0x0074, B:39:0x0078, B:41:0x0080, B:42:0x0082, B:44:0x0086, B:45:0x0088, B:47:0x0093, B:49:0x00a1, B:53:0x00ac, B:50:0x00a6, B:52:0x00aa, B:46:0x0090, B:55:0x00ae, B:56:0x00b0, B:13:0x0030, B:58:0x00b2, B:59:0x00b4), top: B:64:0x0003 }] */
    @Override // defpackage.aktk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.avff r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.h
            monitor-enter(r0)
            aktc r1 = r9.i     // Catch: java.lang.Throwable -> Lb6
            r9.k = r1     // Catch: java.lang.Throwable -> Lb6
            avet r1 = r10.h     // Catch: java.lang.Throwable -> Lb6
            if (r1 != 0) goto Ld
            avet r1 = defpackage.avet.a     // Catch: java.lang.Throwable -> Lb6
        Ld:
            float r1 = r1.f     // Catch: java.lang.Throwable -> Lb6
            double r2 = (double) r1     // Catch: java.lang.Throwable -> Lb6
            r4 = 0
            r6 = 1
            r7 = 0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 != 0) goto L30
            azqb r1 = r9.o     // Catch: java.lang.Throwable -> Lb6
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Lb6
            akwp r1 = (defpackage.akwp) r1     // Catch: java.lang.Throwable -> Lb6
            avet r2 = r10.h     // Catch: java.lang.Throwable -> Lb6
            if (r2 != 0) goto L26
            avet r2 = defpackage.avet.a     // Catch: java.lang.Throwable -> Lb6
        L26:
            float r2 = r2.d     // Catch: java.lang.Throwable -> Lb6
            akvj r3 = defpackage.akvj.BATTERY_SAMPLING     // Catch: java.lang.Throwable -> Lb6
            boolean r1 = r1.b(r2, r3)     // Catch: java.lang.Throwable -> Lb6
            r1 = r1 ^ r6
            goto L3e
        L30:
            j$.util.concurrent.ThreadLocalRandom r2 = j$.util.concurrent.ThreadLocalRandom.current()     // Catch: java.lang.Throwable -> Lb6
            long r2 = r2.nextLong()     // Catch: java.lang.Throwable -> Lb6
            float r2 = (float) r2     // Catch: java.lang.Throwable -> Lb6
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 <= 0) goto Lb2
            r1 = 0
        L3e:
            if (r10 == 0) goto Lae
            int r2 = r10.b     // Catch: java.lang.Throwable -> Lb6
            r2 = r2 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto Lae
            avet r2 = r10.h     // Catch: java.lang.Throwable -> Lb6
            if (r2 != 0) goto L4c
            avet r2 = defpackage.avet.a     // Catch: java.lang.Throwable -> Lb6
        L4c:
            boolean r2 = r2.c     // Catch: java.lang.Throwable -> Lb6
            if (r2 == 0) goto Lae
            if (r1 == 0) goto L53
            goto Lae
        L53:
            r9.m = r6     // Catch: java.lang.Throwable -> Lb6
            aktb r1 = new aktb     // Catch: java.lang.Throwable -> Lb6
            r1.<init>(r6)     // Catch: java.lang.Throwable -> Lb6
            r9.p = r1     // Catch: java.lang.Throwable -> Lb6
            avet r1 = r10.h     // Catch: java.lang.Throwable -> Lb6
            if (r1 != 0) goto L62
            avet r1 = defpackage.avet.a     // Catch: java.lang.Throwable -> Lb6
        L62:
            int r1 = r1.b     // Catch: java.lang.Throwable -> Lb6
            r1 = r1 & 4
            if (r1 == 0) goto L90
            avet r1 = r10.h     // Catch: java.lang.Throwable -> Lb6
            if (r1 != 0) goto L6e
            avet r1 = defpackage.avet.a     // Catch: java.lang.Throwable -> Lb6
        L6e:
            aves r1 = r1.e     // Catch: java.lang.Throwable -> Lb6
            if (r1 != 0) goto L74
            aves r1 = defpackage.aves.a     // Catch: java.lang.Throwable -> Lb6
        L74:
            boolean r1 = r1.b     // Catch: java.lang.Throwable -> Lb6
            if (r1 == 0) goto L90
            akta r1 = new akta     // Catch: java.lang.Throwable -> Lb6
            azqb r2 = r9.a     // Catch: java.lang.Throwable -> Lb6
            avet r10 = r10.h     // Catch: java.lang.Throwable -> Lb6
            if (r10 != 0) goto L82
            avet r10 = defpackage.avet.a     // Catch: java.lang.Throwable -> Lb6
        L82:
            aves r10 = r10.e     // Catch: java.lang.Throwable -> Lb6
            if (r10 != 0) goto L88
            aves r10 = defpackage.aves.a     // Catch: java.lang.Throwable -> Lb6
        L88:
            snc r3 = r9.b     // Catch: java.lang.Throwable -> Lb6
            r1.<init>(r2, r10, r3)     // Catch: java.lang.Throwable -> Lb6
            r9.l = r1     // Catch: java.lang.Throwable -> Lb6
            goto L93
        L90:
            r10 = 0
            r9.l = r10     // Catch: java.lang.Throwable -> Lb6
        L93:
            azqb r10 = r9.a     // Catch: java.lang.Throwable -> Lb6
            java.lang.Object r10 = r10.get()     // Catch: java.lang.Throwable -> Lb6
            aktp r10 = (defpackage.aktp) r10     // Catch: java.lang.Throwable -> Lb6
            boolean r10 = r10.b()     // Catch: java.lang.Throwable -> Lb6
            if (r10 == 0) goto La6
            aktb r10 = r9.p     // Catch: java.lang.Throwable -> Lb6
            r9.k = r10     // Catch: java.lang.Throwable -> Lb6
            goto Lac
        La6:
            akta r10 = r9.l     // Catch: java.lang.Throwable -> Lb6
            if (r10 == 0) goto Lac
            r9.k = r10     // Catch: java.lang.Throwable -> Lb6
        Lac:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb6
            return
        Lae:
            r9.m = r7     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb6
            return
        Lb2:
            r9.m = r7     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb6
            return
        Lb6:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb6
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aktd.d(avff):void");
    }

    @Override // defpackage.aktk
    public final boolean e() {
        return this.m;
    }

    @Override // defpackage.aktk
    public final boolean f(Context context, aopa aopaVar) {
        boolean z = false;
        if (!j()) {
            return false;
        }
        long d = this.b.d();
        aper h = h(context, g());
        synchronized (this.g) {
            aper aperVar = this.j;
            if (aperVar != null) {
                aopa createBuilder = apeq.a.createBuilder();
                createBuilder.copyOnWrite();
                apeq apeqVar = (apeq) createBuilder.instance;
                apeqVar.d = aperVar;
                apeqVar.b |= 2;
                createBuilder.copyOnWrite();
                apeq apeqVar2 = (apeq) createBuilder.instance;
                h.getClass();
                apeqVar2.e = h;
                apeqVar2.b |= 4;
                createBuilder.copyOnWrite();
                apeq apeqVar3 = (apeq) createBuilder.instance;
                apeqVar3.b |= 1;
                apeqVar3.c = d - this.n;
                aopaVar.copyOnWrite();
                aven avenVar = (aven) aopaVar.instance;
                apeq apeqVar4 = (apeq) createBuilder.mo39build();
                aven avenVar2 = aven.a;
                apeqVar4.getClass();
                avenVar.i = apeqVar4;
                avenVar.b |= 256;
                z = true;
            }
            this.j = h;
            this.n = d;
        }
        return z;
    }

    @Override // defpackage.aksz, defpackage.aktk
    public final void c() {
        synchronized (this.h) {
            aktb aktbVar = this.p;
            if (aktbVar != null) {
                this.k = aktbVar;
            } else {
                this.k = this.i;
            }
        }
        i();
    }
}
