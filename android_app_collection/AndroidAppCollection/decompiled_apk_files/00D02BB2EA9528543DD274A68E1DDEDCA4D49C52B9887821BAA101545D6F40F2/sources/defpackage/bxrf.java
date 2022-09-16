package defpackage;

import java.io.PrintWriter;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bxrf  reason: default package */
/* loaded from: classes4.dex */
public final class bxrf implements btph {
    public final bxrd a;
    public final bxrd b;
    private final ania c;
    private final akfa d;
    private final bvjj e;
    @dzsi
    private btlu f;
    private final crzp<btlu> g;
    private boolean h;
    private boolean i;

    public bxrf(Executor executor, ania aniaVar, akfa akfaVar, bvjj bvjjVar, dxio<bvrb> dxioVar, bwrh<bxxn> bwrhVar) {
        bxre bxreVar = new bxre(this);
        this.g = bxreVar;
        this.c = aniaVar;
        this.d = akfaVar;
        this.e = bvjjVar;
        this.h = aniaVar.a();
        boolean z = false;
        this.i = bvjjVar.m(bvjk.D, false);
        g(bwrhVar, "new_recent_history_cache").g();
        this.f = akfaVar.j();
        this.a = bxrd.a(20, g(bwrhVar, "new_recent_history_cache_search"), this.f, dxioVar, (this.h || this.i) ? true : z);
        this.b = bxrd.a(9, g(bwrhVar, "new_recent_history_cache_navigated"), this.f, dxioVar, true);
        akfaVar.C().a(bxreVar, executor);
    }

    private static bwrg<bxxn> g(bwrh<bxxn> bwrhVar, String str) {
        return bwrhVar.a((dssr) bxxn.d.cu(7), bwre.PERSISTENT_FILE, str);
    }

    private final synchronized void h(dpte dpteVar, int i) {
        bvrj.UI_THREAD.c();
        int i2 = i - 1;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            this.b.d(dpteVar);
        } else {
            this.a.d(dpteVar);
        }
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a() {
        this.a.l();
        this.b.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dcdc<dpte> b(dcdc<dpte> dcdcVar) {
        e();
        this.a.g(dcdcVar);
        return this.a.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dehn<dcdc<dpte>> d() {
        e();
        return this.a.h();
    }

    public final void e() {
        btlu j = this.d.j();
        boolean a = this.c.a();
        boolean z = false;
        boolean m = this.e.m(bvjk.D, false);
        if (dbsd.a(j, this.f) && a == this.h && m == this.i) {
            return;
        }
        bxrd bxrdVar = this.a;
        if (!a && m) {
            z = true;
        }
        bxrdVar.i(j, z);
        this.b.i(j, true);
        this.f = j;
        this.h = a;
        this.i = m;
    }

    public final void f(dpte dpteVar, int i) {
        bvrj.UI_THREAD.c();
        e();
        btlt i2 = btlu.i(this.f);
        if (i2 == btlt.GOOGLE || i2 == btlt.SIGNED_OUT) {
            h(dpteVar, i);
        }
    }
}
