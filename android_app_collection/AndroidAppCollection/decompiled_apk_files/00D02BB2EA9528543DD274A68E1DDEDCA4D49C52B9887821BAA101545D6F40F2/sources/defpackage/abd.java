package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: abd  reason: default package */
/* loaded from: classes.dex */
public final class abd {
    public final /* synthetic */ RecyclerView a;

    public abd(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a(acl aclVar, abm abmVar, abm abmVar2) {
        this.a.b.l(aclVar);
        RecyclerView recyclerView = this.a;
        recyclerView.d(aclVar);
        aclVar.z(false);
        if (recyclerView.C.l(aclVar, abmVar, abmVar2)) {
            recyclerView.L();
        }
    }

    public final void b(acl aclVar, abm abmVar, abm abmVar2) {
        RecyclerView recyclerView = this.a;
        aclVar.z(false);
        if (recyclerView.C.m(aclVar, abmVar, abmVar2)) {
            recyclerView.L();
        }
    }

    public final void c(acl aclVar) {
        RecyclerView recyclerView = this.a;
        recyclerView.l.aH(aclVar.a, recyclerView.b);
    }
}
