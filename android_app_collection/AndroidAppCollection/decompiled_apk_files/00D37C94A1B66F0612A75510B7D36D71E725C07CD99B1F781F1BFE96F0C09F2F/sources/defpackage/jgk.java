package defpackage;

import j$.util.Optional;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: jgk  reason: default package */
/* loaded from: classes3.dex */
public final class jgk implements jga {
    public final jgf a;
    private final Executor b;
    private final /* synthetic */ int c;

    public jgk(jgf jgfVar, Executor executor) {
        this.a = jgfVar;
        this.b = executor;
    }

    public jgk(jgf jgfVar, Executor executor, int i) {
        this.c = i;
        this.a = jgfVar;
        this.b = executor;
    }

    public static final ampr e(awjr awjrVar) {
        return ampr.a(Optional.ofNullable(awjrVar.f()), Optional.ofNullable(awjrVar.b()));
    }

    public static final ampr f(asze aszeVar) {
        atss atssVar;
        asza b = aszeVar.b();
        atss atssVar2 = null;
        if (b != null) {
            atyp b2 = b.b();
            if (b2 != null) {
                atssVar2 = b2.f();
            }
            atss atssVar3 = atssVar2;
            atssVar2 = b2;
            atssVar = atssVar3;
        } else {
            atssVar = null;
        }
        return ampr.a(Optional.ofNullable(atssVar2), Optional.ofNullable(atssVar));
    }

    @Override // defpackage.jga
    public final ankt a(jfz jfzVar) {
        if (this.c == 0) {
            return anii.i(anko.q(anlz.u(new jgh(jfzVar, 4), this.b)), new jgj(this, 1), this.b);
        }
        return anii.i(anko.q(anlz.u(new jgh(jfzVar, 1), this.b)), new jgg(this, 1, null), this.b);
    }

    @Override // defpackage.jga
    public final ankt b(jfz jfzVar) {
        if (this.c == 0) {
            return anii.i(anko.q(anlz.u(new jgh(jfzVar, 5), this.b)), new jgj(this), this.b);
        }
        return anii.i(anko.q(anlz.u(new jgh(jfzVar), this.b)), new jgg(this, null), this.b);
    }

    @Override // defpackage.jga
    public final ankt c(jfz jfzVar) {
        if (this.c == 0) {
            return anii.i(anko.q(anlz.u(new jgh(jfzVar, 6), this.b)), new jgj(this, 2), this.b);
        }
        return anii.i(anko.q(anlz.u(new jgh(jfzVar, 2), this.b)), new jgg(this, 2, null), this.b);
    }

    @Override // defpackage.jga
    public final ankt d(jfz jfzVar) {
        if (this.c == 0) {
            return anii.i(anko.q(anlz.u(new jgh(jfzVar, 7), this.b)), new jgj(this, 3), this.b);
        }
        return anii.i(anko.q(anlz.u(new jgh(jfzVar, 3), this.b)), new jgg(this, 3, null), this.b);
    }
}
