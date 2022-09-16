package defpackage;
/* compiled from: PG */
/* renamed from: chbi  reason: default package */
/* loaded from: classes4.dex */
final class chbi implements chbj {
    final cgwg a;
    boolean b;
    final /* synthetic */ chbl c;

    public chbi(chbl chblVar, cgwg cgwgVar) {
        this.c = chblVar;
        this.a = cgwgVar;
    }

    @Override // defpackage.chbj
    public final cgwg a() {
        return this.a;
    }

    @Override // defpackage.chbj
    public final void b() {
        if (this.b) {
            return;
        }
        this.c.R(this.a);
    }

    @Override // defpackage.chbj
    public final void c() {
        this.b = true;
        this.a.u(cgwf.EDITABLE);
        if (this.a.O().booleanValue() || this.a.J().booleanValue()) {
            this.a.B();
        }
    }

    @Override // defpackage.chbj
    public final cjtd d() {
        cjta b = cjtd.b();
        b.d = dtyd.aO;
        b.g(this.a.V());
        return b.a();
    }
}
