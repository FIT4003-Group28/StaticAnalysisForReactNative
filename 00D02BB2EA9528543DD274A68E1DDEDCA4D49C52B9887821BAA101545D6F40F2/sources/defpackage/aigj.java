package defpackage;
/* compiled from: PG */
/* renamed from: aigj  reason: default package */
/* loaded from: classes2.dex */
public final class aigj {
    public static final dcqe a = dcqe.c("aigj");
    public final cjqy b;
    private final cjqq c;

    public aigj(cjqy cjqyVar, cjqq cjqqVar) {
        this.b = cjqyVar;
        this.c = cjqqVar;
    }

    public final void a(ddho ddhoVar) {
        this.c.g().d(cjtd.a(ddhoVar));
    }

    public final void b(ddho ddhoVar, cjsu cjsuVar, ddhj ddhjVar) {
        cjta b = cjtd.b();
        b.d = ddhoVar;
        b.g(cjsuVar.f(0).d);
        b.w(ddhjVar);
        this.c.g().d(b.a());
    }

    public final void c(ddho ddhoVar, cjsu cjsuVar) {
        cjta b = cjtd.b();
        b.d = ddhoVar;
        b.g(cjsuVar.f(0).d);
        this.b.i(b.a());
    }

    public final void d(ddho ddhoVar) {
        a(ddhoVar);
        this.b.i(cjtd.a(ddhoVar));
    }
}
