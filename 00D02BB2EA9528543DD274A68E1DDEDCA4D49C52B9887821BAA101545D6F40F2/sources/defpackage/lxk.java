package defpackage;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lxk  reason: default package */
/* loaded from: classes7.dex */
public final class lxk implements vyy {
    final /* synthetic */ lxp a;

    public lxk(lxp lxpVar) {
        this.a = lxpVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
        if (r3 == 0) goto L44;
     */
    @Override // defpackage.vyy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(defpackage.vvy r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            lxp r2 = r0.a
            cqat r3 = r2.d
            bvjj r4 = r2.f
            ksz r5 = r2.j
            com.google.android.apps.gmm.map.model.location.GmmLocation r5 = r5.c
            long r6 = r3.b()
            long r8 = r1.d
            long r6 = r6 - r8
            bvjk r3 = defpackage.bvjk.ec
            r8 = 0
            long r10 = r4.w(r3, r8)
            bvjk r3 = defpackage.bvjk.eb
            long r12 = r4.w(r3, r8)
            int r3 = r1.a
            r3 = r3 & 16
            if (r3 == 0) goto L31
            vvs r3 = r1.e
            if (r3 != 0) goto L2f
            vvs r3 = defpackage.vvs.e
        L2f:
            long r8 = r3.b
        L31:
            bvjk r3 = defpackage.bvjk.ec
            r14 = 3
            long[] r15 = new long[r14]
            r16 = 0
            r15[r16] = r10
            r17 = 1
            r15[r17] = r12
            r18 = 2
            r15[r18] = r8
            long r14 = defpackage.decn.c(r15)
            r4.Z(r3, r14)
            int r3 = r1.a
            r3 = r3 & 16
            if (r3 == 0) goto L5d
            vvs r3 = r1.e
            if (r3 != 0) goto L55
            vvs r3 = defpackage.vvs.e
        L55:
            int r3 = r3.c
            int r3 = defpackage.vvq.a(r3)
            if (r3 != 0) goto L5e
        L5d:
            r3 = 1
        L5e:
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 <= 0) goto La4
            int r4 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r4 >= 0) goto L67
            goto La4
        L67:
            int r4 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r4 != 0) goto L74
            r4 = 3
            if (r3 != r4) goto L6f
            goto L74
        L6f:
            r1 = 6
            r2.l(r1)
            goto La8
        L74:
            long r3 = defpackage.vyz.a
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 <= 0) goto L7f
            r1 = 7
            r2.l(r1)
            goto La8
        L7f:
            boolean r3 = defpackage.vyz.b(r20)
            if (r3 != 0) goto L8b
            r1 = 8
            r2.l(r1)
            goto La8
        L8b:
            boolean r1 = defpackage.vyz.d(r1, r5)
            if (r1 == 0) goto L97
            r1 = 9
            r2.l(r1)
            goto La8
        L97:
            boolean r1 = r2.n
            if (r1 != 0) goto L9e
            r16 = 1
            goto La8
        L9e:
            r1 = 18
            r2.l(r1)
            return r16
        La4:
            r1 = 5
            r2.l(r1)
        La8:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lxk.a(vvy):boolean");
    }

    @Override // defpackage.vyy
    public final void b() {
        this.a.g();
    }

    @Override // defpackage.vyy
    public final void c(vvy vvyVar) {
        this.a.m(4);
        this.a.f(ddda.dm);
        this.a.f.Z(bvjk.ed, this.a.d.b());
        if (this.a.b()) {
            this.a.f(ddda.dn);
            this.a.g();
            this.a.l(10);
        } else if (this.a.a.e()) {
            this.a.f(ddda.dn);
            this.a.g();
            this.a.l(11);
        } else {
            amte a = vze.a(vvyVar, this.a.b);
            if (a == null) {
                this.a.f(ddda.f3do);
                this.a.g();
                this.a.l(12);
                return;
            }
            lxp lxpVar = this.a;
            dcdc<ldm> i = ldm.i(a, lxpVar.b.getResources());
            boolean z = false;
            String str = i.get(0).b;
            Intent a2 = afft.a(lxpVar.b);
            a2.setFlags(268435456);
            PendingIntent activity = PendingIntent.getActivity(lxpVar.b, 0, a2, 134217728);
            String string = lxpVar.b.getString(R.string.NAV_RESTORE_LOADING);
            ib ibVar = new ib(lxpVar.b);
            ibVar.t(2131231959);
            ibVar.l(str);
            ibVar.k(string);
            ibVar.g = activity;
            ibVar.k = 2;
            cmz cmzVar = new cmz();
            cmzVar.b();
            cmzVar.b = str;
            cmzVar.c = string;
            cmzVar.e = asaa.b(cqrt.j(vyt.t, cqrt.c(R.color.gmm_white)).a(lxpVar.b), 256);
            dxio<jzv> dxioVar = lxpVar.g;
            if (dxioVar != null) {
                dxioVar.a().c(dpyv.NAV_RESTORE.dm, ibVar, cmzVar);
            }
            if (ako.a()) {
                lxpVar.i.a().a(false);
                ibVar.G = "OtherChannel";
            }
            ((NotificationManager) lxpVar.b.getSystemService("notification")).notify(dpyv.NAV_RESTORE.dm, ibVar.b());
            lxpVar.m(5);
            ksz kszVar = lxpVar.j;
            lxm lxmVar = new lxm(lxpVar, i, a);
            if (kszVar.d > 0) {
                z = true;
            }
            dbsk.l(z);
            GmmLocation gmmLocation = kszVar.c;
            if (gmmLocation == null) {
                kszVar.a.add(lxmVar);
            } else {
                lxmVar.a(gmmLocation);
            }
        }
    }
}
