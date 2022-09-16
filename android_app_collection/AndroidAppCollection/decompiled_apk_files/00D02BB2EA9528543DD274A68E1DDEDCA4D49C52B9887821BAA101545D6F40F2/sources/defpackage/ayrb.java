package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: ayrb  reason: default package */
/* loaded from: classes3.dex */
public class ayrb extends brwd implements aymy {
    private final gga a;
    private final aymp b;

    public ayrb(Application application, gga ggaVar, bvjj bvjjVar, dxio<akfa> dxioVar, aeqg aeqgVar, brvm brvmVar, bmmq bmmqVar, bfhu bfhuVar, brwc brwcVar, bfgx bfgxVar, ahjq ahjqVar, bruu bruuVar, bnjs bnjsVar, Runnable runnable, ddho ddhoVar, aymp aympVar) {
        super(application, bvjjVar, dxioVar, aeqgVar, bmmqVar, bfhuVar, brwcVar.a(runnable), bfgxVar, ahjqVar, bnjsVar, null, runnable, ddhoVar, null, null, true, null, null, ddhoVar, bruuVar);
        this.a = ggaVar;
        this.b = aympVar;
    }

    @Override // defpackage.brwd, defpackage.brvd
    public Boolean Qx() {
        return Boolean.valueOf(!btpf.c(this.a).f);
    }

    @Override // defpackage.brwd, defpackage.brvd
    public Integer Qy() {
        return 1;
    }

    @Override // defpackage.aymy
    public aymp a() {
        return this.b;
    }

    @Override // defpackage.brvd
    public Boolean d() {
        return true;
    }

    @Override // defpackage.brvd
    public cqtv e() {
        return cqrp.d(75.0d);
    }

    @Override // defpackage.brvd
    public Boolean f() {
        return false;
    }

    @Override // defpackage.brvd
    public Boolean g() {
        return false;
    }

    @Override // defpackage.brwd
    protected final float h() {
        return 0.0f;
    }

    @Override // defpackage.brwd
    protected final dkee i() {
        return dkee.RICH;
    }

    @Override // defpackage.brwd, defpackage.brvd
    public bfkm m() {
        bfkr bfkrVar = (bfkr) super.m();
        bfkrVar.t(super.A().aH());
        return bfkrVar;
    }
}
