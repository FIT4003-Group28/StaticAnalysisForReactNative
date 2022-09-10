package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: dqm  reason: default package */
/* loaded from: classes6.dex */
public final class dqm implements dqn {
    private final czz a;

    public dqm(czz czzVar) {
        this.a = czzVar;
    }

    @Override // defpackage.dqn
    public final void a(View view) {
        this.a.v(view);
    }

    @Override // defpackage.dqn
    public final egu b(ggc ggcVar, View view) {
        egj egjVar = new egj(ggcVar);
        egjVar.ag(null);
        egjVar.w(view);
        egjVar.x(new djb());
        egjVar.f(false);
        egf a = egf.a();
        a.a = true;
        a.k();
        egjVar.A(a);
        egjVar.J(this.a.b());
        return egjVar.a();
    }
}
