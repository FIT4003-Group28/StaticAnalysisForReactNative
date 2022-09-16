package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: dfp  reason: default package */
/* loaded from: classes3.dex */
public final class dfp extends dfr {
    private final int a;
    private final dfm b;
    private final Interpolator c;

    public dfp(int i, dfm dfmVar, Interpolator interpolator) {
        this.a = i;
        this.b = dfmVar;
        this.c = interpolator;
    }

    @Override // defpackage.dfg
    public final void b(ArrayList arrayList) {
        arrayList.add(this.b);
    }

    @Override // defpackage.dfr
    protected final void k(dem demVar) {
        dgo dgoVar = new dgo(this.a);
        dge dgeVar = new dge(demVar.a(this.b.a));
        dge dgeVar2 = new dge(this.b.b);
        dgl dglVar = new dgl();
        Interpolator interpolator = this.c;
        if (interpolator != null) {
            dgk dgkVar = new dgk(interpolator);
            l(dgoVar, dgkVar);
            l(dgkVar, dglVar);
        } else {
            l(dgoVar, dglVar);
        }
        m(dgeVar, dglVar, "initial");
        m(dgeVar2, dglVar, "end");
        l(dglVar, demVar.b(this.b.a));
    }
}
