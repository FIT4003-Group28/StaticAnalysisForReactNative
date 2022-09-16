package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
/* compiled from: PG */
/* renamed from: aerd  reason: default package */
/* loaded from: classes.dex */
public final class aerd implements aere, owz {
    public static final /* synthetic */ int f = 0;
    private static final owx g = new oww(new owv("video/x-unknown", new byte[0]));
    public final aerv a;
    public final Handler b;
    public final List c = new ArrayList();
    public owx d;
    public Runnable e;
    private final Looper h;
    private final aesk i;
    private final HashMap j;
    private final aerq k;
    private final oxe l;
    private final aflm m;
    private final PlayerConfigModel n;
    private final Random o;

    public aerd(Looper looper, aesk aeskVar, HashMap hashMap, Handler handler, aerq aerqVar, oxe oxeVar, aflm aflmVar, PlayerConfigModel playerConfigModel) {
        this.h = looper;
        this.i = aeskVar;
        this.j = hashMap;
        this.b = handler;
        this.k = aerqVar;
        this.l = oxeVar;
        this.m = aflmVar;
        afms.a(playerConfigModel);
        this.n = playerConfigModel;
        this.o = new Random();
        try {
            oxeVar.b("sessionSharing", "enable");
            aerb aerbVar = new aerb(looper, aeskVar, hashMap, handler, aerqVar, adyd.h, oxeVar, aflmVar);
            this.a = aerbVar;
            aerbVar.d(g);
            oxeVar.a(this);
        } catch (IllegalStateException e) {
            String valueOf = String.valueOf(e.getLocalizedMessage());
            afus.b(1, 6, valueOf.length() != 0 ? "Cannot set mediaDrm property sessionSharing to enable: ".concat(valueOf) : new String("Cannot set mediaDrm property sessionSharing to enable: "));
            afki afkiVar = afki.DRM;
            Object[] objArr = new Object[1];
            objArr[0] = pcx.a < 28 ? null : oxeVar.a.getMetrics();
            afkj.e(afkiVar, "MediaDrm metrics while trying to enable sessionSharing: %s", objArr);
            throw new oxg();
        }
    }

    static boolean m(owx owxVar, owx owxVar2) {
        if (pcx.p(owxVar, owxVar2)) {
            return true;
        }
        if (owxVar != null && owxVar2 != null) {
            return pcx.p(owxVar.a(aeqw.a), owxVar2.a(aeqw.a));
        }
        return false;
    }

    public static final String n(owx owxVar) {
        return Base64.encodeToString(owxVar.a(aeqw.a).b, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a A[RETURN, SYNTHETIC] */
    @Override // defpackage.owy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a() {
        /*
            r11 = this;
            com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r0 = r11.n
            int r0 = r0.k()
            r1 = 4
            r2 = 3
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L3f
            aerv r0 = r11.a
            int r0 = r0.h
            if (r0 != r4) goto L13
            goto L45
        L13:
            java.util.List r0 = r11.c
            java.util.Iterator r0 = r0.iterator()
            r5 = 0
            r6 = 0
        L1b:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L38
            java.lang.Object r7 = r0.next()
            aerc r7 = (defpackage.aerc) r7
            aerv r7 = r7.a
            int r7 = r7.h
            if (r7 != 0) goto L30
        L2d:
            r1 = 0
            goto L90
        L30:
            if (r7 != r1) goto L34
            r6 = 1
            goto L1b
        L34:
            if (r7 != r2) goto L1b
            r5 = 1
            goto L1b
        L38:
            if (r5 == 0) goto L3c
        L3a:
            r1 = 3
            goto L90
        L3c:
            if (r6 == 0) goto L3a
            goto L90
        L3f:
            aerv r0 = r11.a
            int r0 = r0.h
            if (r0 != r4) goto L47
        L45:
            r1 = 1
            goto L90
        L47:
            owx r0 = r11.d
            java.util.UUID r5 = defpackage.aeqw.a
            owv r0 = r0.a(r5)
            byte[] r0 = r0.b
            pdz r0 = defpackage.afmg.bc(r0)
            owx r5 = r11.d
            r6 = -2
            if (r5 == 0) goto L5e
            if (r0 == 0) goto L5e
            int r6 = r0.b
        L5e:
            java.util.List r0 = r11.c
            java.util.Iterator r0 = r0.iterator()
            r5 = 0
            r7 = 0
        L66:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L8b
            java.lang.Object r8 = r0.next()
            aerc r8 = (defpackage.aerc) r8
            aerv r9 = r8.a
            int r9 = r9.h
            if (r9 != 0) goto L7a
            r10 = 0
            goto L7b
        L7a:
            r10 = 1
        L7b:
            r10 = r10 ^ r4
            r5 = r5 | r10
            if (r9 != r1) goto L66
            int r8 = r8.c
            int r9 = r6 + (-1)
            if (r8 < r9) goto L66
            int r9 = r6 + 1
            if (r8 > r9) goto L66
            r7 = 1
            goto L66
        L8b:
            if (r5 == 0) goto L8e
            goto L2d
        L8e:
            if (r7 == 0) goto L3a
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aerd.a():int");
    }

    @Override // defpackage.owy
    public final Exception b() {
        for (aerc aercVar : this.c) {
            if (aercVar.a.b() != null) {
                return aercVar.a.b();
            }
        }
        return null;
    }

    @Override // defpackage.owy
    public final void c() {
    }

    @Override // defpackage.owy
    public final void d(final owx owxVar) {
        if (m(owxVar, this.d)) {
            return;
        }
        afki afkiVar = afki.ABR;
        afkj.g(new amzz() { // from class: aeqy
            @Override // defpackage.amzz
            public final Object a() {
                return aerd.n(owx.this);
            }
        });
        this.d = owxVar;
        for (aerc aercVar : this.c) {
            if (m(aercVar.b, owxVar)) {
                aercVar.d = SystemClock.elapsedRealtime();
                return;
            }
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            this.b.removeCallbacks(runnable);
            this.e = null;
        }
        pdz bc = afmg.bc(owxVar.a(aeqw.a).b);
        if (bc != null) {
            int i = bc.b;
            Iterator it = this.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                aerc aercVar2 = (aerc) it.next();
                int i2 = aercVar2.c;
                if (i2 == i - 1 || i2 == i + 1) {
                    if (aercVar2.a.h == 4) {
                        if (this.n.k() != 0) {
                            final pdz bc2 = afmg.bc(owxVar.a(aeqw.a).b);
                            if (bc2 == null) {
                                afkj.d(afki.DRM, "openInternalDelayed: No crypto period info available!");
                            }
                            int i3 = bc2.c;
                            int i4 = bc2.b;
                            this.e = new Runnable() { // from class: aera
                                @Override // java.lang.Runnable
                                public final void run() {
                                    aerd aerdVar = aerd.this;
                                    pdz pdzVar = bc2;
                                    owx owxVar2 = owxVar;
                                    afki afkiVar2 = afki.ABR;
                                    int i5 = pdzVar.b;
                                    aerdVar.k(owxVar2);
                                    aerdVar.e = null;
                                }
                            };
                            this.b.postDelayed(this.e, this.o.nextInt(Math.min(this.n.k(), i3 * 1000)));
                            return;
                        }
                    }
                }
            }
        }
        k(owxVar);
    }

    @Override // defpackage.owy
    public final boolean e(String str) {
        return f().a(str);
    }

    @Override // defpackage.owz
    public final void g(byte[] bArr, int i) {
        for (aerc aercVar : this.c) {
            if (Arrays.equals(bArr, aercVar.a.i)) {
                aercVar.a.c.sendEmptyMessage(i);
                return;
            }
        }
        afkj.e(afki.DRM, "No corresponding session found for event %d", Integer.valueOf(i));
    }

    @Override // defpackage.aere
    public final int h() {
        return this.a.h();
    }

    @Override // defpackage.owy
    /* renamed from: i */
    public final oxa f() {
        aqwu aqwuVar = this.n.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        if (aqwuVar.aQ || this.c.isEmpty()) {
            return this.a.f();
        }
        return ((aerc) this.c.get(0)).a.f();
    }

    @Override // defpackage.aere
    public final oxe j() {
        return this.l;
    }

    public final void k(owx owxVar) {
        while (this.c.size() >= 4) {
            aerc aercVar = (aerc) this.c.get(0);
            long j = aercVar.d;
            for (aerc aercVar2 : this.c) {
                long j2 = aercVar2.d;
                long j3 = j < j2 ? j2 : j;
                if (j < j2) {
                    aercVar = aercVar2;
                }
                j = j3;
            }
            afki afkiVar = afki.ABR;
            n(aercVar.b);
            aercVar.a.f = null;
            this.c.remove(aercVar);
        }
        aerv aervVar = new aerv(this.h, this.i, this.j, this.b, this.k, adyd.i, this.l, this.m);
        this.l.a(this);
        pdz bc = afmg.bc(owxVar.a(aeqw.a).b);
        if (bc == null) {
            afkj.d(afki.DRM, "openInternal: No crypto period info available!");
        }
        this.i.d = Integer.valueOf(bc.b);
        aervVar.d(owxVar);
        aerc aercVar3 = new aerc(aervVar, owxVar, bc.b);
        aercVar3.d = SystemClock.elapsedRealtime();
        this.c.add(aercVar3);
        afki afkiVar2 = afki.ABR;
        this.c.size();
    }

    @Override // defpackage.aere
    public final void l() {
        this.b.postDelayed(new Runnable() { // from class: aeqz
            @Override // java.lang.Runnable
            public final void run() {
                aerd aerdVar = aerd.this;
                if (aerdVar.a.h == 1) {
                    return;
                }
                Runnable runnable = aerdVar.e;
                if (runnable != null) {
                    afki afkiVar = afki.ABR;
                    aerdVar.b.removeCallbacks(runnable);
                    aerdVar.e = null;
                }
                for (aerc aercVar : aerdVar.c) {
                    aercVar.a.l();
                }
                aerdVar.a.l();
                aerdVar.d = null;
                aerdVar.c.clear();
            }
        }, 100L);
    }
}
