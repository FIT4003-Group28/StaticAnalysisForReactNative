package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: ajpa  reason: default package */
/* loaded from: classes.dex */
public final class ajpa {
    private final aktt a;

    public ajpa(akty aktyVar) {
        this.a = aktyVar;
    }

    public final void a(RecyclerView recyclerView, acti actiVar) {
        aktt akttVar = this.a;
        akty aktyVar = (akty) akttVar;
        if (!aktyVar.a || actiVar == null || aktyVar.c) {
            return;
        }
        aktyVar.b = actiVar;
        recyclerView.aE((ne) akttVar);
        aktyVar.c = true;
        recyclerView.getContext();
    }

    public final void b(RecyclerView recyclerView) {
        aktt akttVar = this.a;
        akty aktyVar = (akty) akttVar;
        if (!aktyVar.a || !aktyVar.c) {
            return;
        }
        recyclerView.aG((ne) akttVar);
        recyclerView.getContext();
        aktyVar.c = false;
    }
}
