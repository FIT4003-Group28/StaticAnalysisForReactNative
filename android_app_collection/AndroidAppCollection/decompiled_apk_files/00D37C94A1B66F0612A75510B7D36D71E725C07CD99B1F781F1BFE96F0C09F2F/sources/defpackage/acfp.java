package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acfp  reason: default package */
/* loaded from: classes.dex */
public final class acfp extends abpd {
    final /* synthetic */ acfq a;
    public final yk l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acfp(acfq acfqVar) {
        super(acfqVar.c, acfqVar.j, null, acfqVar.i, acfqVar.q);
        this.a = acfqVar;
        this.l = new acfn(this.b);
    }

    @Override // defpackage.abpd
    public final RecyclerView a() {
        return this.a.e;
    }

    @Override // defpackage.abpd
    public final RecyclerView b() {
        return null;
    }

    @Override // defpackage.abpd
    public final View d() {
        return null;
    }

    @Override // defpackage.abpd
    public final ajzn f() {
        acfq acfqVar = this.a;
        if (acfqVar.t == null) {
            acfqVar.n.a();
            acfq acfqVar2 = this.a;
            swq swqVar = acfqVar2.w;
            acti actiVar = this.e;
            ajjr ajjrVar = acfqVar2.n;
            ajkd a = ajjrVar.a().a(ajkb.LIVE_CHAT);
            acfq acfqVar3 = this.a;
            acfqVar2.t = new akdb(swqVar, actiVar, ajjrVar, a, acfqVar3.o, acfqVar3.p);
        }
        return this.a.t;
    }

    @Override // defpackage.abpd, defpackage.abkq
    public final void t(ajqm ajqmVar, ajrt ajrtVar) {
        if (this.g == ajqmVar) {
            return;
        }
        super.t(ajqmVar, ajrtVar);
        this.a.e.ag(new acfo(this));
    }
}
