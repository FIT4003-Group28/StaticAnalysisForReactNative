package defpackage;

import android.os.Handler;
import android.view.View;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: lrt  reason: default package */
/* loaded from: classes7.dex */
public final class lrt implements noq {
    public final lwq a;
    public final Runnable b;
    public final cqkj d;
    public final cqkf<lru> e;
    private final not g;
    public final Handler c = new Handler();
    public final lru f = new lrr(this);
    private final Runnable h = new lrs(this);

    public lrt(cqkj cqkjVar, lwq lwqVar, Runnable runnable, not notVar) {
        dbsk.s(lwqVar);
        this.a = lwqVar;
        this.b = runnable;
        dbsk.s(notVar);
        this.g = notVar;
        this.d = cqkjVar;
        this.e = cqkjVar.c(new lrq(), null);
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
    }

    @Override // defpackage.non
    public final void a() {
        this.a.p().as(this.h);
    }

    @Override // defpackage.non
    public final noq b() {
        this.e.e(this.f);
        this.a.q(lwo.SMALL);
        this.c.postDelayed(this.b, 3000L);
        return this;
    }

    @Override // defpackage.noq
    public final View d() {
        throw null;
    }

    @Override // defpackage.non
    public final void e() {
        this.c.removeCallbacks(this.b);
    }

    @Override // defpackage.non
    public final void f() {
        this.a.p().at(this.h);
    }

    @Override // defpackage.non
    public final String g() {
        return "OfflinePromptOverlay";
    }

    @Override // defpackage.non
    public final boolean h() {
        return false;
    }

    @Override // defpackage.non
    public final int i() {
        return nom.a(this);
    }

    @Override // defpackage.noq
    public final void j(noe noeVar) {
        this.g.b(noeVar, this.e.c());
    }
}
