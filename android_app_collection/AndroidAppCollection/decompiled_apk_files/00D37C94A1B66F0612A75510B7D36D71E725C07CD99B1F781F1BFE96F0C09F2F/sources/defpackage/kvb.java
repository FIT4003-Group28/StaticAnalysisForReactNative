package defpackage;

import android.os.Bundle;
import android.view.View;
/* compiled from: PG */
/* renamed from: kvb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kvb implements View.OnClickListener {
    public final /* synthetic */ kvc a;
    private final /* synthetic */ int b;

    public /* synthetic */ kvb(kvc kvcVar) {
        this.a = kvcVar;
    }

    public /* synthetic */ kvb(kvc kvcVar, int i) {
        this.b = i;
        this.a = kvcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            this.a.dismiss();
            return;
        }
        kvc kvcVar = this.a;
        Bundle bundle = new Bundle();
        kvcVar.aF(bundle);
        eo F = kvcVar.F();
        String str = kvc.ae;
        el elVar = (el) F.h.get(str);
        if (elVar != null) {
            if (((l) elVar.a).b.a(apt.STARTED)) {
                elVar.b.a(str, bundle);
                kvcVar.dismiss();
            }
        }
        F.g.put(str, bundle);
        kvcVar.dismiss();
    }
}
