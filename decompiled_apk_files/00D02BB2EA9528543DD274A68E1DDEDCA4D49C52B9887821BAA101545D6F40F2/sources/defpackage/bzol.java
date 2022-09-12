package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bzol  reason: default package */
/* loaded from: classes4.dex */
final class bzol implements View.OnClickListener {
    final /* synthetic */ bzoo a;

    public bzol(bzoo bzooVar) {
        this.a = bzooVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.b.i(bzoo.d());
        bzmn bzmnVar = this.a.e;
        if (bzmnVar != null) {
            bzmnVar.PJ();
        }
    }
}
