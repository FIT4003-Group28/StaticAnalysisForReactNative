package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: dfo  reason: default package */
/* loaded from: classes3.dex */
public final class dfo extends dfr {
    private final dfm a;
    private final dgs b;

    public dfo(dfm dfmVar, dgs dgsVar) {
        this.a = dfmVar;
        this.b = dgsVar;
    }

    @Override // defpackage.dfg
    public final void b(ArrayList arrayList) {
        arrayList.add(this.a);
    }

    @Override // defpackage.dfr
    protected final void k(dem demVar) {
        dgn dgnVar = new dgn(this.b);
        dge dgeVar = new dge(demVar.a(this.a.a));
        dge dgeVar2 = new dge(this.a.b);
        m(dgeVar, dgnVar, "initial");
        m(dgeVar2, dgnVar, "end");
        l(dgnVar, demVar.b(this.a.a));
    }
}
