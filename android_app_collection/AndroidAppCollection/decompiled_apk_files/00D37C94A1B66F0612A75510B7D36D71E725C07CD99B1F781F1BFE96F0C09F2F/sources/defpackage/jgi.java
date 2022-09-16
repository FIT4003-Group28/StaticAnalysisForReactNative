package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: jgi  reason: default package */
/* loaded from: classes3.dex */
public final class jgi implements jga {
    private final agss a;
    private final Executor b;

    public jgi(agss agssVar, Executor executor) {
        this.a = agssVar;
        this.b = executor;
    }

    @Override // defpackage.jga
    public final ankt a(jfz jfzVar) {
        return anii.h(anko.q(this.a.a((agqv) jfzVar.b())), new jgl(1), this.b);
    }

    @Override // defpackage.jga
    public final ankt b(jfz jfzVar) {
        return this.a.b((agqv) jfzVar.b());
    }

    @Override // defpackage.jga
    public final ankt c(jfz jfzVar) {
        return this.a.c((agqv) jfzVar.b());
    }

    @Override // defpackage.jga
    public final ankt d(jfz jfzVar) {
        return this.a.d((agqv) jfzVar.b());
    }
}
