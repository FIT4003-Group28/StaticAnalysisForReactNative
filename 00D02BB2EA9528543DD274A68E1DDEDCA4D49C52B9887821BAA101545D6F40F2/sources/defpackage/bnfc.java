package defpackage;

import android.app.Activity;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bnfc  reason: default package */
/* loaded from: classes3.dex */
public final class bnfc implements View.OnClickListener {
    final /* synthetic */ bnfd a;

    public bnfc(bnfd bnfdVar) {
        this.a = bnfdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        btvo btvoVar;
        dnpq dnpqVar;
        dxio dxioVar;
        Activity activity;
        dnpq dnpqVar2;
        dnpq dnpqVar3;
        dxio dxioVar2;
        dnpq dnpqVar4;
        btvoVar = this.a.i;
        dkpc merchantParameters = btvoVar.getMerchantParameters();
        dzvx.b(merchantParameters, "clientParameters.merchantParameters");
        if (merchantParameters.e) {
            dnpqVar3 = this.a.b;
            if (dnpqVar3 != null) {
                dxioVar2 = this.a.g;
                dnpqVar4 = this.a.b;
                ((beqb) dxioVar2.a()).e(dnpqVar4.c);
                return;
            }
        }
        dnpqVar = this.a.c;
        if (dnpqVar != null) {
            dxioVar = this.a.h;
            activity = this.a.f;
            dnpqVar2 = this.a.c;
            ((afha) dxioVar.a()).k(activity, dnpqVar2.c, 1);
        }
    }
}
