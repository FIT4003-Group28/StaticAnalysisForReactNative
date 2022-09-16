package defpackage;

import android.view.View;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: lsp  reason: default package */
/* loaded from: classes7.dex */
public final class lsp implements noq {
    private final lwq a;
    private final not b;
    private final atxz c;
    private final kdg d;
    private final cqkf<? extends atxz> e;
    private final kxs f;

    public lsp(cqkj cqkjVar, lwq lwqVar, not notVar, kxu kxuVar, atxz atxzVar, kdg kdgVar) {
        cqiw lsaVar;
        this.a = lwqVar;
        this.b = notVar;
        this.c = atxzVar;
        this.d = kdgVar;
        atxx atxxVar = atxx.DEFAULT;
        int ordinal = atxzVar.U().ordinal();
        if (ordinal == 3) {
            lsaVar = new lsa();
        } else if (ordinal == 4) {
            lsaVar = new lsj();
        } else if (ordinal == 8) {
            lsaVar = new lsg();
        } else {
            lsaVar = new lso();
        }
        cqkf<? extends atxz> d = cqkjVar.d(lsaVar, notVar.a(), false);
        this.e = d;
        View c = d.c();
        kxn k = kxo.k();
        k.k();
        this.f = new kxs(c, k, kxuVar);
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
    }

    @Override // defpackage.non
    public final void a() {
        this.c.Oa();
        this.e.e(this.c);
    }

    @Override // defpackage.non
    public final noq b() {
        this.a.q(lwo.IN_HEADER);
        this.d.f(kdc.MAP_BUTTONS_DISABLED);
        this.f.a();
        return this;
    }

    @Override // defpackage.noq
    public final View d() {
        throw null;
    }

    @Override // defpackage.non
    public final void e() {
        this.f.b();
        this.d.f(kdc.MAP_INTERACTION_AND_BUTTONS_ENABLED);
    }

    @Override // defpackage.non
    public final void f() {
        this.c.Ob();
        this.e.e(null);
    }

    @Override // defpackage.non
    public final String g() {
        return "PromptOverlay";
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
        this.b.b(noeVar, this.e.c());
    }
}
