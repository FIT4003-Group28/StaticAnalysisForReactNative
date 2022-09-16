package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Vibrator;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahvu  reason: default package */
/* loaded from: classes.dex */
public class ahvu {
    private final ahvt A;
    private final Context a;
    private final ajmy b;
    private final yzm c;
    public final acwm d;
    public final ahvv e;
    public boolean f;
    public aijs g;
    public yiy h;
    public aphd i;
    public boolean[] j;
    public int k;
    public apha l;
    public List m;
    public boolean n;
    public boolean o;
    public int p;
    public boolean q;
    public final ahvs r;
    public final kaa s;
    private final Handler t;
    private final acti u;
    private yiy v;
    private boolean[] w;
    private Vibrator x;
    private boolean y;
    private final ahvq z;

    public ahvu(Context context, kaa kaaVar, ajmy ajmyVar, aafo aafoVar, yzm yzmVar, afwu afwuVar, afzo afzoVar, acti actiVar, ahvv ahvvVar) {
        this.a = context;
        kaaVar.getClass();
        this.s = kaaVar;
        ajmyVar.getClass();
        this.b = ajmyVar;
        aafoVar.getClass();
        yzmVar.getClass();
        this.c = yzmVar;
        this.t = new Handler(context.getMainLooper());
        this.d = new acwm(afwuVar, afzoVar, "iv");
        this.u = actiVar;
        this.k = -1;
        ahvvVar.getClass();
        this.e = ahvvVar;
        this.A = new ahvt(this, 1);
        new ahvt(this);
        this.r = new ahvs(this);
        this.z = new ahvq(this);
    }

    public static final aphd e(PlayerResponseModel playerResponseModel) {
        for (apgz apgzVar : playerResponseModel.a.o) {
            if (apgzVar != null && apgzVar.b == 49483894) {
                return (aphd) apgzVar.c;
            }
        }
        return null;
    }

    public static final avhm l(avhn avhnVar) {
        return akel.x(avhnVar, 40);
    }

    public ahvq b() {
        return this.z;
    }

    public final void f(aphd aphdVar, String str) {
        if (this.f) {
            h();
        }
        this.f = true;
        this.i = aphdVar;
        if (aphdVar != null && aphdVar.d.size() != 0) {
            aopu aopuVar = aphdVar.d;
            this.m = aopuVar;
            int size = aopuVar.size();
            this.w = new boolean[size];
            this.j = new boolean[size];
        }
        aphd aphdVar2 = this.i;
        if (aphdVar2 != null && (aphdVar2.b & 2) != 0) {
            aphb aphbVar = aphdVar2.c;
            if (aphbVar == null) {
                aphbVar = aphb.a;
            }
            avhn avhnVar = aphbVar.d;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            avhm l = l(avhnVar);
            this.v = d(l, new ahvo(this, l));
        }
        this.d.c("CPN", str);
    }

    public final void g() {
        this.c.j(this.n);
    }

    public final void h() {
        this.f = false;
        yiy yiyVar = this.v;
        if (yiyVar != null) {
            yiyVar.d();
            this.v = null;
        }
        yiy yiyVar2 = this.h;
        if (yiyVar2 != null) {
            yiyVar2.d();
            this.h = null;
        }
        kaa kaaVar = this.s;
        kaaVar.W();
        kaaVar.a = false;
        kaaVar.b = null;
        kaaVar.Y(3);
        this.y = false;
        this.n = false;
        this.o = false;
        this.w = null;
        this.j = null;
        this.k = -1;
        this.l = null;
        this.i = null;
        this.p = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            r9 = this;
            aphd r0 = r9.i
            if (r0 == 0) goto L79
            int r0 = r0.b
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto L79
            aijs r0 = r9.g
            aijs r2 = defpackage.aijs.FULLSCREEN
            r3 = 1
            r4 = 0
            if (r0 != r2) goto L37
            aphd r0 = r9.i
            aphb r0 = r0.c
            if (r0 != 0) goto L1a
            aphb r0 = defpackage.aphb.a
        L1a:
            long r5 = r0.b
            int r0 = r9.p
            long r7 = (long) r0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 > 0) goto L37
            aphd r0 = r9.i
            aphb r0 = r0.c
            if (r0 != 0) goto L2b
            aphb r0 = defpackage.aphb.a
        L2b:
            long r5 = r0.c
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L37
            boolean r0 = r9.q
            if (r0 != 0) goto L37
            r0 = 1
            goto L38
        L37:
            r0 = 0
        L38:
            boolean r2 = r9.y
            if (r0 != r2) goto L3d
            return
        L3d:
            r9.y = r0
            if (r0 == 0) goto L72
            kaa r0 = r9.s
            r0.a = r3
            boolean r2 = r0.mZ()
            if (r2 == 0) goto L4f
            r0.Z()
            goto L52
        L4f:
            r0.W()
        L52:
            r0.Y(r1)
            aphd r0 = r9.i
            aphb r0 = r0.c
            if (r0 != 0) goto L5d
            aphb r0 = defpackage.aphb.a
        L5d:
            aoob r0 = r0.e
            byte[] r0 = r0.I()
            if (r0 != 0) goto L66
            return
        L66:
            acti r1 = r9.u
            acte r2 = new acte
            r2.<init>(r0)
            r0 = 0
            r1.u(r2, r0)
            return
        L72:
            kaa r0 = r9.s
            r0.a = r4
            r0.Y(r1)
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahvu.i():void");
    }

    public final boolean j() {
        int i;
        boolean[] zArr = this.w;
        return zArr != null && (i = this.k) >= 0 && i < zArr.length && zArr[i];
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k() {
        /*
            r6 = this;
            apha r0 = r6.l
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            aucc r0 = r0.g
            if (r0 != 0) goto Lc
            aucc r0 = defpackage.aucc.b
        Lc:
            aopq r0 = r0.c
            int r0 = r0.size()
            r2 = 1
            if (r0 != 0) goto L16
            return r2
        L16:
            aijs r0 = r6.g
            if (r0 != 0) goto L1b
            return r1
        L1b:
            aika r3 = defpackage.aika.NEW
            int r0 = r0.ordinal()
            if (r0 == 0) goto L3e
            if (r0 == r2) goto L3b
            r3 = 2
            if (r0 == r3) goto L38
            r3 = 3
            if (r0 == r3) goto L35
            r3 = 4
            if (r0 == r3) goto L3e
            java.lang.String r0 = "Unhandled player visibility state."
            defpackage.zep.l(r0)
            r0 = 0
            goto L40
        L35:
            aucb r0 = defpackage.aucb.BACKGROUND
            goto L40
        L38:
            aucb r0 = defpackage.aucb.FULLSCREEN
            goto L40
        L3b:
            aucb r0 = defpackage.aucb.MINI
            goto L40
        L3e:
            aucb r0 = defpackage.aucb.STANDARD
        L40:
            if (r0 != 0) goto L43
            return r1
        L43:
            apha r3 = r6.l
            aucc r3 = r3.g
            if (r3 != 0) goto L4b
            aucc r3 = defpackage.aucc.b
        L4b:
            aops r4 = new aops
            aopq r3 = r3.c
            aopr r5 = defpackage.aucc.a
            r4.<init>(r3, r5)
            java.util.Iterator r3 = r4.iterator()
        L58:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L67
            java.lang.Object r4 = r3.next()
            aucb r4 = (defpackage.aucb) r4
            if (r0 != r4) goto L58
            return r2
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahvu.k():boolean");
    }

    public final void m() {
        if (this.n) {
            this.t.removeCallbacks(this.A);
            this.n = false;
            g();
        }
    }

    public final void n(boolean z, int i) {
        if (!this.n || this.o != z) {
            this.n = true;
            this.o = z;
            g();
            if (zdg.e(this.a)) {
                if (this.x == null) {
                    this.x = (Vibrator) this.a.getSystemService("vibrator");
                }
                if (this.x.hasVibrator()) {
                    this.x.vibrate(this.a.getResources().getInteger(R.integer.invideo_accessibility_vibration_duration_ms));
                }
            }
            if (!z || this.j[this.k] || i <= 0) {
                return;
            }
            this.t.removeCallbacks(this.A);
            this.t.postDelayed(this.A, i);
        }
    }

    public final yiy d(avhm avhmVar, ahvp ahvpVar) {
        Uri j = avhmVar == null ? null : zgt.j(avhmVar.c);
        if (j == null) {
            return null;
        }
        yiy c = yiy.c(ahvpVar);
        this.b.l(j, yje.c(this.t, c));
        return c;
    }
}
