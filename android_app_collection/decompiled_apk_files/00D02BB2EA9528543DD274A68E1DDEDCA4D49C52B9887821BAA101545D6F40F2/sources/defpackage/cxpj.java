package defpackage;

import android.text.TextUtils;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxpj  reason: default package */
/* loaded from: classes5.dex */
public final class cxpj implements View.OnFocusChangeListener {
    final /* synthetic */ cxqo a;
    final /* synthetic */ cxpn b;

    public cxpj(cxpn cxpnVar, cxqo cxqoVar) {
        this.b = cxpnVar;
        this.a = cxqoVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            cxpn cxpnVar = this.b;
            if (cxpnVar.m) {
                this.a.d(4, cxpnVar.l);
            } else {
                cxpnVar.m = true;
            }
            this.b.e.setCursorVisible(true);
            this.b.e();
            cxpn cxpnVar2 = this.b;
            cxpnVar2.g.d(cxpnVar2.e.mo48getText().toString(), this.b.e);
        } else {
            this.b.C(8);
            this.b.e.setCursorVisible(false);
            cxpn cxpnVar3 = this.b;
            if (!cxpnVar3.r && !cxpnVar3.t.isEmpty() && TextUtils.isEmpty(this.b.e.mo48getText())) {
                this.b.d();
            }
        }
        cxpm cxpmVar = this.b.o;
        if (cxpmVar != null) {
            cxpmVar.a(z);
        }
    }
}
