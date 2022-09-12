package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxpk  reason: default package */
/* loaded from: classes5.dex */
public final class cxpk implements View.OnClickListener {
    final /* synthetic */ cxpn a;

    public cxpk(cxpn cxpnVar) {
        this.a = cxpnVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.l(true);
    }
}
