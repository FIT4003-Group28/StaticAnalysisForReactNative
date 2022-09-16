package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: abmp  reason: default package */
/* loaded from: classes.dex */
final class abmp implements View.OnClickListener {
    final /* synthetic */ apoj a;
    final /* synthetic */ abmq b;

    public abmp(abmq abmqVar, apoj apojVar) {
        this.b = abmqVar;
        this.a = apojVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aafo aafoVar = this.b.b;
        apzg apzgVar = this.a.o;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.c(apzgVar, null);
    }
}
