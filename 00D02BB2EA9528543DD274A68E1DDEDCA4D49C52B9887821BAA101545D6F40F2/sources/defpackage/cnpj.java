package defpackage;

import android.app.Dialog;
/* compiled from: PG */
/* renamed from: cnpj  reason: default package */
/* loaded from: classes5.dex */
final class cnpj extends cnrp {
    final /* synthetic */ Dialog a;
    final /* synthetic */ cnpk b;

    public cnpj(cnpk cnpkVar, Dialog dialog) {
        this.b = cnpkVar;
        this.a = dialog;
    }

    @Override // defpackage.cnrp
    public final void a() {
        this.b.a.k();
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
