package defpackage;

import android.os.Handler;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
/* compiled from: PG */
/* renamed from: kgr  reason: default package */
/* loaded from: classes3.dex */
public final class kgr implements kbk {
    public final Handler a;
    public final kbl b;
    public final Runnable c;
    public final kgn d;
    public final acti e;
    public final int f;
    public ampq g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    private final azpx m;

    public kgr(Handler handler, kbl kblVar, azpx azpxVar, aacz aaczVar, acti actiVar, kgn kgnVar) {
        this.a = handler;
        this.b = kblVar;
        this.m = azpxVar;
        this.e = actiVar;
        this.d = kgnVar;
        asxj asxjVar = aaczVar.b().e;
        this.f = (asxjVar == null ? asxj.a : asxjVar).bM;
        this.g = amon.a;
        this.c = new kgq(this);
    }

    public final void a() {
        c(false);
        this.a.removeCallbacks(this.c);
    }

    @Override // defpackage.kbk
    public final void b(boolean z) {
        this.k = false;
        a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r4 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(boolean r4) {
        /*
            r3 = this;
            ampq r0 = r3.g
            boolean r0 = r0.h()
            if (r0 == 0) goto L4f
            boolean r0 = r3.j
            if (r0 != r4) goto Ld
            goto L4f
        Ld:
            r3.j = r4
            ampq r0 = r3.g
            java.lang.Object r0 = r0.c()
            yye r0 = (defpackage.yye) r0
            r1 = 1
            r0.a(r4, r1)
            kgn r0 = r3.d
            boolean r0 = r0.a()
            r1 = 0
            if (r0 == 0) goto L34
            if (r4 == 0) goto L43
            boolean r4 = r3.k
            if (r4 != 0) goto L36
            azpx r4 = r3.m
            kbn r0 = defpackage.kbn.a()
            r4.c(r0)
            goto L36
        L34:
            if (r4 == 0) goto L43
        L36:
            acti r4 = r3.e
            acte r0 = new acte
            actj r2 = defpackage.actj.SEEK_EDUOVERLAY
            r0.<init>(r2)
            r4.u(r0, r1)
            return
        L43:
            acti r4 = r3.e
            acte r0 = new acte
            actj r2 = defpackage.actj.SEEK_EDUOVERLAY
            r0.<init>(r2)
            r4.q(r0, r1)
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kgr.c(boolean):void");
    }

    @Override // defpackage.kbk
    public final void i(ControlsOverlayStyle controlsOverlayStyle) {
        boolean z = true;
        if (!ControlsOverlayStyle.a(controlsOverlayStyle) && !ControlsOverlayStyle.c(controlsOverlayStyle)) {
            z = false;
        }
        this.h = z;
        if (z) {
            a();
        }
    }

    @Override // defpackage.kbk
    public final void j(boolean z) {
        this.i = z;
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void k(boolean z) {
    }

    @Override // defpackage.kbk
    public final void l(ezx ezxVar) {
        this.l = ezxVar.b();
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void m(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nG(zbb zbbVar) {
    }

    @Override // defpackage.kbk
    public final void nL(boolean z) {
        this.k = true;
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nx(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void od(ControlsState controlsState) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void oe(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void og(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void p(boolean z) {
    }

    @Override // defpackage.kbk
    public final void q(boolean z) {
        if (!z) {
            return;
        }
        a();
    }
}
