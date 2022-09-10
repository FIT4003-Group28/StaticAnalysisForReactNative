package defpackage;
/* compiled from: PG */
/* renamed from: dfcg  reason: default package */
/* loaded from: classes6.dex */
public final class dfcg {
    public static final dfcg a = new dfcg(dfce.PROCEED, null, null, null);
    public static final dfcg b = new dfcg(dfce.DELAY_START, null, null, null);
    public final dfce c;
    public final dfcf d;
    public final dfcb e;
    public final dyet f;
    private final dehn<?> g;

    private dfcg(dfce dfceVar, dfcb dfcbVar, dehn<?> dehnVar, dyet dyetVar) {
        dbsk.s(dfceVar);
        this.c = dfceVar;
        this.d = null;
        this.e = dfcbVar;
        this.g = dehnVar;
        this.f = dyetVar;
    }

    public static dfcg a(dyet dyetVar) {
        return new dfcg(dfce.PROCEED, null, null, dyetVar);
    }

    public static dfcg b(dyjb dyjbVar, dyhw dyhwVar) {
        dbsk.s(dyjbVar);
        dbsk.m(!dyjbVar.i(), "Error status must not be ok");
        return new dfcg(dfce.ABORT_WITH_EXCEPTION, new dfcb(dyjbVar, dyhwVar), null, null);
    }

    public static dfcg c(dehn<?> dehnVar) {
        dbsk.s(dehnVar);
        return new dfcg(dfce.CONTINUE_AFTER, null, dehnVar, null);
    }

    public final dehn<?> d() {
        dbsk.l(this.c == dfce.CONTINUE_AFTER);
        return this.g;
    }
}
