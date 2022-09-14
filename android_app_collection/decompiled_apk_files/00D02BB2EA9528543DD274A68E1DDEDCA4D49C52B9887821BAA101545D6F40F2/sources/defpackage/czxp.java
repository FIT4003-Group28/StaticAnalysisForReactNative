package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: czxp  reason: default package */
/* loaded from: classes5.dex */
final class czxp implements View.OnClickListener {
    final /* synthetic */ czxs a;

    public czxp(czxs czxsVar) {
        this.a = czxsVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        czxs czxsVar = this.a;
        int i = czxsVar.ad;
        if (i == 2) {
            czxsVar.g(1);
        } else if (i != 1) {
        } else {
            czxsVar.g(2);
        }
    }
}
