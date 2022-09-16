package defpackage;
/* compiled from: PG */
/* renamed from: dem  reason: default package */
/* loaded from: classes3.dex */
public final class dem {
    final /* synthetic */ den a;

    public dem(den denVar) {
        this.a = denVar;
    }

    public final float a(dfn dfnVar) {
        dda ddaVar;
        dfe dfeVar = dfnVar.b;
        deh dehVar = (deh) this.a.b.a(dfnVar.a);
        dej dejVar = (dej) dehVar.a.get(dfeVar);
        if (dejVar != null) {
            return dejVar.a.c;
        }
        if (dehVar.c == 0) {
            ddaVar = dehVar.e;
        } else {
            ddaVar = dehVar.d;
        }
        if (ddaVar == null) {
            throw new RuntimeException("Both LayoutOutputs were null!");
        }
        return dfeVar.e((dbn) ddaVar.d());
    }

    public final dff b(dfn dfnVar) {
        return ((dej) ((deh) this.a.b.a(dfnVar.a)).a.get(dfnVar.b)).a;
    }
}
