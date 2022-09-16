package defpackage;

import android.os.Handler;
import java.util.Vector;
/* compiled from: PG */
/* renamed from: affx  reason: default package */
/* loaded from: classes.dex */
public final class affx {
    public final Handler d;
    public final afgb e;
    public long i;
    public int j;
    private final affj k;
    private final afte l;
    private final afjz n;
    public boolean a = false;
    public boolean b = false;
    public boolean c = false;
    public aegv f = aegv.NONE;
    public final Vector g = new Vector();
    public final Vector h = new Vector();
    private boolean m = true;

    public affx(affj affjVar, Handler handler, afgb afgbVar, afte afteVar, afjz afjzVar) {
        this.k = affjVar;
        this.d = handler;
        this.e = afgbVar;
        this.l = afteVar;
        this.n = afjzVar;
    }

    public final void a() {
        afnh T = this.e.T();
        if (T == null) {
            return;
        }
        long g = this.e.g() * 1000;
        while (g() && !this.e.aq() && ((Long) this.h.get(this.j)).longValue() < 1000000 + g) {
            T.r(false, (byte[]) this.g.get(this.j), ((Long) this.h.get(this.j)).longValue(), this.e.g() * 1000);
            this.j++;
        }
        if (!g()) {
            return;
        }
        this.d.postDelayed(new affw(this), 1000L);
    }

    public final void b() {
        afnh T = this.e.T();
        if (!this.m || !this.a || T == null) {
            return;
        }
        this.k.g(afnk.GL_GVR, this.l);
        T.t(afnk.GL_GVR);
        this.b = true;
        this.m = false;
        this.e.ao();
    }

    public final void c() {
        this.a = false;
        this.b = false;
        this.f = aegv.NONE;
        d();
        afnh T = this.e.T();
        if (T != null) {
            T.r(true, new byte[0], 0L, 0L);
        }
        this.m = true;
    }

    public final void d() {
        this.g.clear();
        this.h.clear();
        this.j = 0;
        afki afkiVar = afki.ABR;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f6 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.aegu r13, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r14) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.affx.e(aegu, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001d, code lost:
        if (r8 != 19) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r7, com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r8) {
        /*
            r6 = this;
            afgb r0 = r6.e
            afnh r0 = r0.T()
            if (r0 != 0) goto L9
            return
        L9:
            r1 = 2
            r2 = 1
            r3 = 3
            if (r8 == 0) goto L22
            int r4 = r8.y
            int r8 = r8.z
            r5 = 17
            if (r4 == r5) goto L20
            if (r8 != r5) goto L19
            goto L20
        L19:
            r2 = 19
            if (r4 == r2) goto L23
            if (r8 != r2) goto L22
            goto L23
        L20:
            r1 = 1
            goto L23
        L22:
            r1 = 3
        L23:
            boolean r8 = r6.a
            r2 = 0
            if (r7 == 0) goto L33
            atzv r3 = r7.c
            aqwu r3 = r3.e
            if (r3 != 0) goto L30
            aqwu r3 = defpackage.aqwu.b
        L30:
            float r3 = r3.aG
            goto L34
        L33:
            r3 = 0
        L34:
            if (r7 == 0) goto L40
            atzv r7 = r7.c
            aqwu r7 = r7.e
            if (r7 != 0) goto L3e
            aqwu r7 = defpackage.aqwu.b
        L3e:
            float r2 = r7.aH
        L40:
            r0.y(r8, r3, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.affx.f(com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel, com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData):void");
    }

    public final boolean g() {
        return this.j < this.h.size();
    }
}
