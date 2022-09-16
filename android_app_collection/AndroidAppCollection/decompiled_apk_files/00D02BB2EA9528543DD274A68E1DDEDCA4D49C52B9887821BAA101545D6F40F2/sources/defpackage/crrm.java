package defpackage;

import java.io.PrintWriter;
import java.util.EnumSet;
/* compiled from: PG */
/* renamed from: crrm  reason: default package */
/* loaded from: classes5.dex */
public final class crrm implements crgx {
    private static final EnumSet<dqvj> h = EnumSet.of(dqvj.DRIVE, dqvj.TAXICAB, dqvj.TWO_WHEELER);
    final crrx a;
    @dzsi
    crrx b;
    final Runnable c;
    private final bqxt d;
    private final crrp e;
    private final btvo f;
    private boolean g = false;

    public crrm(btvo btvoVar, bqxt bqxtVar, crrp crrpVar, ambz ambzVar) {
        crrl crrlVar = new crrl(this);
        this.c = crrlVar;
        bvmn bvmnVar = bvmo.a;
        this.d = bqxtVar;
        this.f = btvoVar;
        this.e = crrpVar;
        this.a = crrpVar.a(new crrs(14, 200, btvoVar), ambzVar.c(akry.BASE), h, "vector");
        bqxtVar.c(crrlVar);
    }

    @Override // defpackage.crgx, defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
    }

    @Override // defpackage.crgx
    public final synchronized void a() {
        this.g = true;
        d();
        this.a.d();
    }

    @Override // defpackage.crgx
    public final synchronized void b() {
        this.g = false;
        crrx crrxVar = this.b;
        if (crrxVar != null) {
            crrxVar.e();
            this.b = null;
        }
        this.a.e();
    }

    public final synchronized void d() {
        if (!this.g) {
            return;
        }
        crrx crrxVar = this.b;
        if (crrxVar != null) {
            crrxVar.e();
        }
        crro a = this.e.a(new crrs(bqxu.Jc, this.f.getNavigationParameters().s().a, this.f), this.d.a(this.d.b()), h, "reroutile");
        this.b = a;
        a.d();
    }
}
