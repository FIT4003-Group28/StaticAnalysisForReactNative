package defpackage;

import android.view.View;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: lew  reason: default package */
/* loaded from: classes7.dex */
public final class lew implements noq {
    private final atxz a;
    private final not b;
    private final cqkf<atxz> c;
    private final kxs d;

    public lew(cqkj cqkjVar, not notVar, kxu kxuVar, atxz atxzVar) {
        this.b = notVar;
        this.a = atxzVar;
        cqkf<atxz> d = cqkjVar.d(new lfd(), ((npb) notVar).b, false);
        this.c = d;
        kxn k = kxo.k();
        k.k();
        this.d = new kxs(d.c(), k, kxuVar);
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
    }

    @Override // defpackage.non
    public final void a() {
        this.a.Oa();
        this.c.e(this.a);
    }

    @Override // defpackage.non
    public final noq b() {
        this.d.a();
        return this;
    }

    @Override // defpackage.noq
    public final View d() {
        throw null;
    }

    @Override // defpackage.non
    public final void e() {
        this.d.b();
    }

    @Override // defpackage.non
    public final void f() {
        this.c.e(null);
        this.a.Ob();
    }

    @Override // defpackage.non
    public final String g() {
        return "FreeNavPromptOverlay";
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
        this.b.b(noeVar, this.c.c());
    }
}
