package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: swm  reason: default package */
/* loaded from: classes7.dex */
final class swm implements View.OnClickListener {
    final /* synthetic */ swo a;

    public swm(swo swoVar) {
        this.a = swoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        swo swoVar = this.a;
        swoVar.a.d(swoVar.b, view);
    }
}
