package defpackage;

import android.content.Intent;
import android.hardware.Camera;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bbwq  reason: default package */
/* loaded from: classes3.dex */
public final class bbwq extends ges implements cslf {
    public axru a;
    public dxio<apni> ad;
    public cjnf ae;
    public dxio<cjqq> af;
    public dxio<bzmm> ag;
    public btvo ah;
    public bwrs<bcan> ai;
    private bbts am;
    private cqkf<bbyg> an;
    public efg b;
    public cqkj c;
    public bwqv d;
    public bvjj e;
    public bbyz f;
    public bcoz g;
    private bbyy ak = null;
    private bzml al = null;
    public boolean aj = false;

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        cqkf<bbyg> cqkfVar = this.an;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(Object obj) {
        bbyy bbyyVar = this.ak;
        if (bbyyVar != null && (obj instanceof bbua)) {
            bbyyVar.H((bbua) obj);
        }
    }

    @Override // defpackage.fd
    public final void Z(int i, int i2, Intent intent) {
        if (this.ak != null && i == awnn.PICK_PICTURE.ordinal() && i2 == -1 && intent != null) {
            if (intent.getClipData() != null) {
                this.ak.E(intent.getClipData());
            } else if (intent.getData() == null) {
            } else {
                this.ak.F(intent.getData());
            }
        }
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        cqkf<bbyg> d = this.c.d(new bbyf(), viewGroup, false);
        this.an = d;
        d.e(this.ak);
        return this.an.c();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        bbyy bbyyVar = this.ak;
        dbuh.d(bbyyVar);
        bbyyVar.h();
        return true;
    }

    public final void g(boolean z) {
        View view = this.P;
        if (view == null) {
            return;
        }
        int systemUiVisibility = (view.getSystemUiVisibility() & (-3)) | 1792;
        if (z) {
            view.setSystemUiVisibility(systemUiVisibility);
        } else {
            view.setSystemUiVisibility(systemUiVisibility | 2);
        }
    }

    @Override // defpackage.cslf
    public final csle i() {
        bzml bzmlVar = this.al;
        if (bzmlVar instanceof csle) {
            return (csle) bzmlVar;
        }
        return null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = (Bundle) dbsc.a(bundle, this.o);
        try {
            bwrs<bcan> e = this.d.e(bcan.class, bundle2, "photo_selection_context_ref");
            dbsk.s(e);
            this.ai = e;
        } catch (IOException unused) {
        }
        this.am = (bbts) bundle2.getSerializable("live_camera_option");
        this.aj = bundle2.getBoolean("system_camera_opened");
        bbyz bbyzVar = this.f;
        bwrs<bcan> bwrsVar = this.ai;
        bbts bbtsVar = this.am;
        bbyz.a(this, 1);
        bbyz.a(bwrsVar, 2);
        bbyz.a(bbtsVar, 3);
        cqat a = bbyzVar.a.a();
        bbyz.a(a, 4);
        bbyz.a(bbyzVar.b.a(), 5);
        bbyz.a(bbyzVar.c.a(), 6);
        gga a2 = bbyzVar.d.a();
        bbyz.a(a2, 7);
        bbut a3 = bbyzVar.e.a();
        bbyz.a(a3, 8);
        dxio a4 = ((dxjh) bbyzVar.f).a();
        bbyz.a(a4, 9);
        bbwo a5 = bbyzVar.g.a();
        bbyz.a(a5, 10);
        bbtk a6 = bbyzVar.h.a();
        bbyz.a(a6, 11);
        bvrb a7 = bbyzVar.i.a();
        bbyz.a(a7, 12);
        bbzf a8 = bbyzVar.j.a();
        bbyz.a(a8, 13);
        bcpk a9 = bbyzVar.k.a();
        bbyz.a(a9, 14);
        bcpe a10 = bbyzVar.l.a();
        bbyz.a(a10, 15);
        bcoz a11 = bbyzVar.m.a();
        bbyz.a(a11, 16);
        dxio a12 = ((dxjh) bbyzVar.n).a();
        bbyz.a(a12, 17);
        isd a13 = bbyzVar.o.a();
        bbyz.a(a13, 18);
        axru a14 = bbyzVar.p.a();
        bbyz.a(a14, 19);
        axrx a15 = bbyzVar.q.a();
        bbyz.a(a15, 20);
        this.ak = new bbyy(this, bwrsVar, bbtsVar, a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15);
        if (this.am.j() != null) {
            bzmm a16 = this.ag.a();
            cjqq a17 = this.af.a();
            btvo btvoVar = this.ah;
            aojq.a(this, 1);
            aojq.a(a16, 2);
            aojq.a(a17, 3);
            aojq.a(btvoVar, 4);
            this.al = new aojp(this, a16, a17, btvoVar);
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxu.M;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0113, code lost:
        if (new defpackage.eapd(r7.e.w(defpackage.bvjk.gU, 0)).w(defpackage.eapd.a().f(defpackage.eaow.a(14))) != false) goto L20;
     */
    @Override // defpackage.ges, defpackage.fd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbwq.s():void");
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        this.d.c(bundle, "photo_selection_context_ref", this.ai);
        bundle.putSerializable("live_camera_option", this.am);
        bundle.putBoolean("system_camera_opened", this.aj);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        bbyy bbyyVar = this.ak;
        dbuh.d(bbyyVar);
        bbyyVar.h.a();
        bbwn bbwnVar = (bbwn) bbyyVar.h;
        Camera camera = bbwnVar.h;
        if (camera != null) {
            camera.release();
            bbwnVar.h = null;
            bbwnVar.e.disable();
        }
        if (Build.VERSION.SDK_INT >= 27) {
            J().getWindow().setNavigationBarColor(-1);
        } else {
            J().getWindow().setNavigationBarColor(-16777216);
        }
        J().setRequestedOrientation(-1);
        J().getWindow().clearFlags(1024);
        super.u();
    }
}
