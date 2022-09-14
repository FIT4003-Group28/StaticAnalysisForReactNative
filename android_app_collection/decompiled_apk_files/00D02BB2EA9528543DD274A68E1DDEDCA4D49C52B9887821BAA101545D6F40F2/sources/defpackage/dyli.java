package defpackage;

import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: dyli  reason: default package */
/* loaded from: classes6.dex */
final class dyli extends dymf {
    final /* synthetic */ dyew a;
    final /* synthetic */ dylr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyli(dylr dylrVar, dyew dyewVar) {
        super(dylrVar.d);
        this.b = dylrVar;
        this.a = dyewVar;
    }

    @Override // defpackage.dymf
    public final void a() {
        dyjb f;
        dyew dyewVar = this.a;
        dyfo dyfoVar = this.b.d;
        dbsk.t(dyfoVar, "context must not be null");
        if (!dyfoVar.d()) {
            f = null;
        } else {
            Throwable e = dyfoVar.e();
            if (e == null) {
                f = dyjb.c.g("io.grpc.Context was cancelled without error");
            } else if (e instanceof TimeoutException) {
                f = dyjb.f.g(e.getMessage()).f(e);
            } else {
                dyjb c = dyjb.c(e);
                if (!dyiy.UNKNOWN.equals(c.p) || c.r != e) {
                    f = c.f(e);
                } else {
                    f = dyjb.c.g("Context cancelled").f(e);
                }
            }
        }
        dyewVar.b(f, new dyhw());
    }
}
