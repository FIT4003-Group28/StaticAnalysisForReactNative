package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aqyz  reason: default package */
/* loaded from: classes.dex */
public final class aqyz extends aqye {
    final /* synthetic */ View d;
    final /* synthetic */ aqzc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqyz(aqzc aqzcVar, amzi amziVar, aqzz aqzzVar, View view) {
        super(amziVar, aqzzVar);
        this.e = aqzcVar;
        this.d = view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aqye
    public final void c(amzi amziVar) {
        ddho ddhoVar;
        aqzc aqzcVar = this.e;
        if (aqzcVar.x) {
            ddhoVar = amziVar.a() ? dtxq.v : dtxq.u;
        } else {
            ddhoVar = aqzcVar.y ? amziVar.a() ? dtxp.aq : dtxp.ap : dtxk.i;
        }
        this.e.q.n(this.e.r.f(this.d).d(cjtd.a(ddhoVar)), new cjte(deaf.TAP), cjtd.a(ddhoVar));
        aqzz aqzzVar = this.c;
        if (aqzzVar != null) {
            aqzzVar.c();
        } else {
            this.b.c();
        }
    }
}
