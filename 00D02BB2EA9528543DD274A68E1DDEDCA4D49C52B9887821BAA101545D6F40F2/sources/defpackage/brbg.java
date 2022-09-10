package defpackage;

import android.app.Activity;
import android.view.View;
/* compiled from: PG */
/* renamed from: brbg  reason: default package */
/* loaded from: classes4.dex */
public class brbg implements akzx {
    public final brbf a;
    public final brbe b;
    public final Activity c;
    private final bvrb e;
    private final btrm f;
    private final akpm g;
    private final cqkf<jad> h;
    private final int i;
    @dzsi
    private brbc j;
    public boolean d = false;
    private final brbd k = new brbd(this);

    public brbg(bvrb bvrbVar, btrm btrmVar, akpm akpmVar, btvo btvoVar, cqkj cqkjVar, Activity activity, brbe brbeVar) {
        this.e = bvrbVar;
        this.f = btrmVar;
        this.g = akpmVar;
        this.b = brbeVar;
        this.c = activity;
        this.i = btvoVar.getMapMovementRequeryParameters().a;
        cqkf<jad> e = cqkjVar.e(new brhp());
        this.h = e;
        e.c().setVisibility(4);
        this.a = new brbf(this);
    }

    public final View a() {
        return this.h.c();
    }

    public final void b() {
        dbsk.a(!this.d);
        this.d = true;
        this.h.e(this.a);
        btrm btrmVar = this.f;
        brbd brbdVar = this.k;
        dceq a = dcet.a();
        a.b(ardp.class, new brbi(ardp.class, brbdVar));
        btrmVar.g(brbdVar, a.a());
        this.g.ad(this);
    }

    public final void c() {
        this.a.b(false);
        this.g.ae(this);
        this.f.a(this.k);
        this.h.e(null);
        this.d = false;
    }

    public final void d(boolean z) {
        if (this.a.h().booleanValue() == z) {
            return;
        }
        e();
        if (!z) {
            this.a.j(false);
            return;
        }
        brbb brbbVar = new brbb(this);
        this.j = brbbVar;
        this.e.a(brbbVar, bvrj.UI_THREAD, this.i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        brbc brbcVar = this.j;
        if (brbcVar != null) {
            brbcVar.b = true;
            this.j = null;
        }
    }

    @Override // defpackage.akzx
    public final void l(akzs akzsVar) {
        if (!akzsVar.a) {
            return;
        }
        d(true);
    }
}
