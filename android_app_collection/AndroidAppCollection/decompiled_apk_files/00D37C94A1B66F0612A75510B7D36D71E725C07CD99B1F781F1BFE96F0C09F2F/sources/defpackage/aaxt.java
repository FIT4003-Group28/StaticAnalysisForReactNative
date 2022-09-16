package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aaxt  reason: default package */
/* loaded from: classes.dex */
public final class aaxt extends aars {
    private final afvn a;
    private final aarl b;
    private final aarl c;
    private final aarl g;

    public aaxt(aaqj aaqjVar, aaqf aaqfVar, afvn afvnVar, yqw yqwVar) {
        super(aaqfVar, yqwVar);
        this.a = afvnVar;
        this.b = c(arvl.a, aaqjVar, aaxa.j, aawo.r);
        this.c = c(arvj.a, aaqjVar, aaxa.i, aawo.q);
        this.g = c(arvn.a, aaqjVar, aaxa.k, aawo.s);
    }

    public final aaxq a() {
        return new aaxq(this.e, this.a.c());
    }

    public final aaxr b() {
        return new aaxr(this.e, this.a.c());
    }

    public final aaxs d() {
        return new aaxs(this.e, this.a.c());
    }

    @Deprecated
    public final ankt e(aaxq aaxqVar) {
        return this.c.a(aaxqVar);
    }

    public final ankt f(aaxq aaxqVar, Executor executor) {
        return this.c.b(aaxqVar, executor);
    }

    @Deprecated
    public final ankt g(aaxr aaxrVar) {
        return this.b.a(aaxrVar);
    }

    public final ankt h(aaxr aaxrVar, Executor executor) {
        return this.b.b(aaxrVar, executor);
    }

    @Deprecated
    public final ankt i(aaxs aaxsVar) {
        return this.g.a(aaxsVar);
    }

    public final ankt j(aaxs aaxsVar, Executor executor) {
        return this.g.b(aaxsVar, executor);
    }
}
