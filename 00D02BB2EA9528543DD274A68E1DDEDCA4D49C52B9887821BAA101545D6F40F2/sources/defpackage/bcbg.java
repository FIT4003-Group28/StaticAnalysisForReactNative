package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bcbg  reason: default package */
/* loaded from: classes3.dex */
final class bcbg implements View.OnClickListener {
    final /* synthetic */ bcba a;

    public bcbg(bcba bcbaVar) {
        this.a = bcbaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bcba bcbaVar = this.a;
        if (!bcbaVar.aD) {
            return;
        }
        gn gnVar = bcbaVar.A;
        dbsk.s(gnVar);
        gnVar.e();
    }
}
