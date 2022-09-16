package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: ayqd  reason: default package */
/* loaded from: classes3.dex */
public class ayqd extends brwd implements aymu {
    @dzsi
    private final brvg a;
    @dzsi
    private izx b;

    public ayqd(Application application, bvjj bvjjVar, dxio<akfa> dxioVar, brvh brvhVar, aeqg aeqgVar, brvm brvmVar, bmmq bmmqVar, bfhu bfhuVar, brwc brwcVar, bfgx bfgxVar, ahjq ahjqVar, bruu bruuVar, bnjs bnjsVar, Runnable runnable, ddho ddhoVar) {
        super(application, bvjjVar, dxioVar, aeqgVar, bmmqVar, bfhuVar, brwcVar.a(runnable), bfgxVar, ahjqVar, bnjsVar, null, runnable, ddhoVar, null, null, true, null, null, ddhoVar, bruuVar);
        bnju A = A();
        dccx F = dcdc.F();
        if (A().aC().booleanValue()) {
            brrs j = brrx.j();
            j.b(dghs.SAVE);
            j.f(brrw.PLACE_LIST);
            ((brry) j).a = dtyc.W;
            F.g(j.a());
        }
        brvg a = brvhVar.a(A, F.f());
        this.a = a;
        if (a != null) {
            a.d(bwrs.a(A().aH()));
        }
        this.b = null;
    }

    @Override // defpackage.brwd
    public int QB() {
        return 4;
    }

    @Override // defpackage.brwd, defpackage.brvd
    public void QR(bwrs<ilo> bwrsVar) {
        throw null;
    }

    @Override // defpackage.aymu
    @dzsi
    public bruv a() {
        return this.a;
    }

    @Override // defpackage.aymu
    @dzsi
    public izx b() {
        return this.b;
    }

    @Override // defpackage.aymu
    public void c(@dzsi izx izxVar) {
        this.b = izxVar;
    }

    @Override // defpackage.brvd
    public Boolean d() {
        return true;
    }

    @Override // defpackage.brvd
    public cqtv e() {
        return cqrp.d(A().ah().A().size() > 1 ? 152.0d : 220.0d);
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
        return 1.0f;
    }

    @Override // defpackage.brwd
    @dzsi
    protected final dkee i() {
        return dkee.RICH;
    }
}
