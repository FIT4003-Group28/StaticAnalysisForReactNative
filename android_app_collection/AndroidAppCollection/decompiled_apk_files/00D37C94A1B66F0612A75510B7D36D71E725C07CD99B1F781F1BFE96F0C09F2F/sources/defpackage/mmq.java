package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: mmq  reason: default package */
/* loaded from: classes3.dex */
final class mmq implements View.OnClickListener {
    final /* synthetic */ mmr a;

    public mmq(mmr mmrVar) {
        this.a = mmrVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mmr mmrVar = this.a;
        itu ituVar = mmrVar.b;
        if (ituVar != null) {
            aqya aqyaVar = ituVar.a;
            if ((aqyaVar.b & 4) == 0) {
                return;
            }
            aafo aafoVar = mmrVar.a;
            apzg apzgVar = aqyaVar.e;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
        }
    }
}
