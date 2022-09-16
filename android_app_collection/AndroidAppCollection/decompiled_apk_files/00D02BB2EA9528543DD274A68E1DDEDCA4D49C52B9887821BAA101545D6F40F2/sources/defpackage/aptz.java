package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aptz  reason: default package */
/* loaded from: classes2.dex */
final class aptz implements View.OnClickListener {
    final /* synthetic */ dbnd a;
    final /* synthetic */ apua b;

    public aptz(apua apuaVar, dbnd dbndVar) {
        this.b = apuaVar;
        this.a = dbndVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apup apupVar = this.b.a;
        dbnb dbnbVar = this.a.c;
        if (dbnbVar == null) {
            dbnbVar = dbnb.b;
        }
        apupVar.j(dbnbVar);
    }
}
