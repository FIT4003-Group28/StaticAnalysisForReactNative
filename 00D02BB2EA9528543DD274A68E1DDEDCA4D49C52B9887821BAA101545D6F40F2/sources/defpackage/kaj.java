package defpackage;

import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: kaj  reason: default package */
/* loaded from: classes.dex */
public final class kaj implements btph {
    private static final eaow f = eaow.c(15);
    public final btrm a;
    public final cqat b;
    public final bvjj c;
    public dbsg<eapd> d;
    public dbsg<eapd> e = dbpy.a;

    public kaj(btrm btrmVar, cqat cqatVar, bvjj bvjjVar) {
        this.a = btrmVar;
        this.b = cqatVar;
        this.c = bvjjVar;
        long w = bvjjVar.w(bvjk.kk, -1L);
        if (w == -1) {
            this.d = dbpy.a;
        } else {
            this.d = dbsg.i(new eapd(w));
        }
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    public final boolean a() {
        eaow b = b();
        eapd eapdVar = new eapd(this.b.b());
        if (this.d.a()) {
            this.d.b().w(eapdVar);
        }
        boolean z = false;
        if (this.d.a() && eapdVar.f(b).w(this.d.b())) {
            z = true;
        }
        if (z) {
            this.e = dbsg.i(eapdVar);
        }
        return z;
    }

    public final eaow b() {
        eaow eaowVar = f;
        long w = this.c.w(bvjk.kl, -1L);
        return w != -1 ? eaow.e(w) : eaowVar;
    }
}
