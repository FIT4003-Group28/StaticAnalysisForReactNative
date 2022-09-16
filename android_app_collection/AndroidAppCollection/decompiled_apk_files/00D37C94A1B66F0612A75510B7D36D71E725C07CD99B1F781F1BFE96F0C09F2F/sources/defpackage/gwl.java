package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: gwl  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gwl implements View.OnClickListener {
    public final /* synthetic */ gwm a;
    private final /* synthetic */ int b;

    public /* synthetic */ gwl(gwm gwmVar, int i) {
        this.b = i;
        this.a = gwmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            this.a.a.a(true);
        } else if (i == 1) {
            gwu gwuVar = this.a.a;
            hhl hhlVar = gwuVar.a.ai;
            hhp hhpVar = (hhp) hhlVar.a.at();
            if (hhpVar != null) {
                hhlVar.h(hhpVar.l, hhpVar.k);
            } else {
                hhlVar.h(null, null);
            }
            gwuVar.a.bb.z();
        } else {
            this.a.a.a.bb.z();
        }
    }
}
