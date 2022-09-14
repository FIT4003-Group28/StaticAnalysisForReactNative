package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxpl  reason: default package */
/* loaded from: classes5.dex */
public final class cxpl implements View.OnClickListener {
    final /* synthetic */ cxpn a;

    public cxpl(cxpn cxpnVar) {
        this.a = cxpnVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.l(true);
    }
}
