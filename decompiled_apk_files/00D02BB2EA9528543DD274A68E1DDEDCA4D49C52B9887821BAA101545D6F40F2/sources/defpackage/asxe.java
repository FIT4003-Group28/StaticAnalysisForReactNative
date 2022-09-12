package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: asxe  reason: default package */
/* loaded from: classes2.dex */
public abstract class asxe implements asmo, asxv, btph {
    final btrm a;
    public final asxw b;
    protected final askx c;
    public final cjqy d;
    public final dxio<ania> e;
    protected asld f;
    @dzsi
    protected dqvj g;
    @dzsi
    public aszm h;
    private final asmb i;
    private final aufc j;
    private final Executor k;
    @dzsi
    private astg l;
    private final qbo m;
    private final crzp<aufb> n = new asxb(this);
    private final asma o;

    public asxe(asxu asxuVar, asxw asxwVar, btrm btrmVar, askx askxVar, akox akoxVar, qbo qboVar, cjqy cjqyVar, aufc aufcVar, dxio<ania> dxioVar, Executor executor) {
        asxc asxcVar = new asxc(this);
        this.o = asxcVar;
        dbsk.t(asxwVar, "stateController");
        this.b = asxwVar;
        this.a = btrmVar;
        dbsk.t(askxVar, "cameraController");
        this.c = askxVar;
        this.i = new asmb(asxuVar, akoxVar, asxcVar);
        this.m = qboVar;
        this.d = cjqyVar;
        dbsk.t(dxioVar, "userInfoManagerProvider");
        this.e = dxioVar;
        this.f = asld.FOLLOWING;
        this.j = aufcVar;
        this.k = executor;
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.asmo
    public final void NZ(Bundle bundle) {
    }

    @Override // defpackage.asmo
    public final void Qo(Configuration configuration) {
    }

    @Override // defpackage.asmo
    public final void Qp() {
        this.i.b();
    }

    @Override // defpackage.asmo
    public final void Qr(Bundle bundle) {
    }

    public void a(aszm aszmVar, @dzsi aszm aszmVar2) {
        this.h = aszmVar;
        this.f = aszmVar.c.a;
        this.g = aszmVar.e();
        i(false);
    }

    @Override // defpackage.asmo
    public final void b() {
        this.b.F(this);
        this.j.i().d(this.n, this.k);
        asmc.c(this.a, this.i);
    }

    @Override // defpackage.asmo
    public final void c() {
        asmc.b(this.a, this.i);
        this.j.i().c(this.n);
        this.b.G(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean g();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void h(aryn arynVar);

    public final void i(boolean z) {
        aszm aszmVar = this.h;
        if (aszmVar == null || !aszmVar.b()) {
            return;
        }
        aszm aszmVar2 = this.h;
        crqd crqdVar = aszmVar2.l;
        astg astgVar = aszmVar2.d;
        if (astgVar == null) {
            astgVar = null;
        }
        if (astgVar == null || (!z && astgVar.equals(this.l))) {
            if (astgVar != null || this.l == null) {
                return;
            }
            this.m.h();
            this.l = null;
            eapd.a();
            return;
        }
        qbo qboVar = this.m;
        vut I = vuv.I();
        I.A(astgVar.a());
        I.o(astgVar.a().k().ag());
        I.H(albo.a);
        I.E(true);
        I.F(true);
        I.v(true);
        I.Q(astgVar.b());
        I.x(false);
        I.k(astgVar.d());
        I.N(astgVar.e());
        qboVar.e(I.O());
        this.l = astgVar;
        eapd.a();
    }
}
