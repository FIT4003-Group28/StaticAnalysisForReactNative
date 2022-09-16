package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
/* compiled from: PG */
/* renamed from: kfb  reason: default package */
/* loaded from: classes3.dex */
public final class kfb implements aiaq, kbk, ahit {
    public static final kez a;
    public final azpx b = azpm.e().aO();
    public final azpm c = azpm.e();
    public ahyp d;
    public aiap e;
    private final boolean f;

    static {
        kfd kfdVar = new kfd();
        kfdVar.e(false);
        kfdVar.h(false);
        kfdVar.m(true);
        kfdVar.f(false);
        kfdVar.b(false);
        kfdVar.c(false);
        kfdVar.l(false);
        kfdVar.j(false);
        kfdVar.i(false);
        kfdVar.n(ControlsOverlayStyle.a);
        kfdVar.g(false);
        kfdVar.k(false);
        kfdVar.d(false);
        a = kez.a(kfdVar.a(), false);
    }

    public kfb(ahiu ahiuVar, aacz aaczVar) {
        asxj asxjVar = aaczVar.b().e;
        this.f = (asxjVar == null ? asxj.a : asxjVar).bC;
        ahiuVar.c(new zdt() { // from class: key
            @Override // defpackage.zdt
            public final void a(Object obj) {
                kfb kfbVar = kfb.this;
                kfbVar.r(((Boolean) obj).booleanValue());
                kfbVar.b.Z(kfb.a, eho.r).B().as(new acws(kfbVar.c, 1));
            }
        });
        ahiuVar.d(this);
    }

    private final void e(kfc kfcVar, Object obj, boolean z) {
        this.b.c(new kfa(new kew(kfcVar, obj), z));
    }

    @Override // defpackage.kbk
    public final void b(boolean z) {
        e(kex.i, false, z);
    }

    public final void d(kfc kfcVar, Object obj) {
        e(kfcVar, obj, false);
    }

    @Override // defpackage.kbk
    public final void i(ControlsOverlayStyle controlsOverlayStyle) {
        d(kex.e, controlsOverlayStyle);
    }

    @Override // defpackage.kbk
    public final void j(boolean z) {
        d(kex.k, Boolean.valueOf(z));
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void k(boolean z) {
    }

    @Override // defpackage.kbk
    public final void l(ezx ezxVar) {
        d(kex.j, Boolean.valueOf(ezxVar.b()));
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void m(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nG(zbb zbbVar) {
    }

    @Override // defpackage.aiaq
    public final void nK(boolean z) {
        d(kex.g, Boolean.valueOf(z));
    }

    @Override // defpackage.kbk
    public final void nL(boolean z) {
        e(kex.i, true, z);
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nx(boolean z) {
    }

    @Override // defpackage.kbk
    public final void od(ControlsState controlsState) {
        d(kex.d, Boolean.valueOf(controlsState.a == ahzb.NEW));
    }

    @Override // defpackage.kbk
    public final void oe(boolean z) {
        if (!this.f) {
            return;
        }
        d(kex.m, Boolean.valueOf(z));
    }

    @Override // defpackage.kbk
    public final void og(boolean z) {
        d(kex.b, Boolean.valueOf(z));
    }

    @Override // defpackage.kbk
    public final void p(boolean z) {
        d(kex.a, Boolean.valueOf(z));
    }

    @Override // defpackage.aiaq
    public final void pB(boolean z) {
        d(kex.f, Boolean.valueOf(z));
    }

    @Override // defpackage.aiaq
    public final void pD(aiap aiapVar) {
        this.e = aiapVar;
    }

    @Override // defpackage.kbk
    public final void q(boolean z) {
        d(kex.c, Boolean.valueOf(z));
    }

    @Override // defpackage.ahit
    public final void r(boolean z) {
        d(kex.h, Boolean.valueOf(z));
    }
}
