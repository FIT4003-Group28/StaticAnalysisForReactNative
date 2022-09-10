package defpackage;
/* compiled from: PG */
/* renamed from: chbh  reason: default package */
/* loaded from: classes4.dex */
final class chbh implements chbj {
    final cgvv a;
    final String b;
    boolean c;
    final /* synthetic */ chbl d;

    public chbh(chbl chblVar, cgvv cgvvVar, String str) {
        this.d = chblVar;
        this.a = cgvvVar;
        this.b = str;
    }

    @Override // defpackage.chbj
    public final cgwg a() {
        return this.a;
    }

    @Override // defpackage.chbj
    public final void b() {
        if (this.c) {
            return;
        }
        this.d.S(this.a, this.b);
    }

    @Override // defpackage.chbj
    public final void c() {
        this.c = true;
        this.a.e(this.b);
    }

    @Override // defpackage.chbj
    public final cjtd d() {
        cjta b = cjtd.b();
        b.d = dtyd.aO;
        b.g(this.a.V());
        return b.a();
    }
}
