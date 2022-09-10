package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: wga  reason: default package */
/* loaded from: classes7.dex */
public class wga implements bxsz {
    private final gga a;
    private final gft b;
    private final azva c;
    private final bxsj d;
    private final int e;
    private final cqtd f = cqrt.g(2131231285, bxnv.i(50));
    private final cqss g;
    private final cjtd h;

    public wga(gga ggaVar, gft gftVar, azva azvaVar, bxsj bxsjVar, ddho ddhoVar, int i, int i2) {
        this.a = ggaVar;
        this.b = gftVar;
        this.c = azvaVar;
        this.d = bxsjVar;
        this.e = i;
        cqss h = bxnv.h(50);
        this.g = h == null ? ibm.u() : h;
        cjta b = cjtd.b();
        b.d = ddhoVar;
        b.i(i2);
        this.h = b.a();
    }

    @Override // defpackage.bxsz
    public cqtd a() {
        return this.f;
    }

    @Override // defpackage.bxsz
    public cqss b() {
        return this.g;
    }

    @Override // defpackage.bxsz
    @dzsi
    public cqss c() {
        return null;
    }

    @Override // defpackage.abiu
    public String d() {
        return this.c.e(this.a);
    }

    @Override // defpackage.bxsz
    public String e() {
        return this.c.e(this.a);
    }

    @Override // defpackage.bxsz
    @dzsi
    public String f() {
        return this.c.d;
    }

    @Override // defpackage.bxsz
    public Integer g() {
        return Integer.valueOf(this.e);
    }

    @Override // defpackage.abiu
    public cqkl h(cjqm cjqmVar) {
        if (!this.b.bb()) {
            return cqkl.a;
        }
        this.d.a(this.c);
        return cqkl.a;
    }

    @Override // defpackage.abiu
    public cjtd i() {
        return this.h;
    }

    @Override // defpackage.abql
    public View.OnAttachStateChangeListener j() {
        return null;
    }

    @Override // defpackage.abql
    public cqtd k() {
        return abqk.a();
    }

    @Override // defpackage.abiu
    public jic l() {
        return new jic((String) null, ckqc.FIFE, this.f, 0);
    }
}
