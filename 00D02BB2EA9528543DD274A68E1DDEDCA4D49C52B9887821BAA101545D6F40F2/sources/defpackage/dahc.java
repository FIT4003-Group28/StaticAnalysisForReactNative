package defpackage;

import android.widget.AutoCompleteTextView;
/* compiled from: PG */
/* renamed from: dahc  reason: default package */
/* loaded from: classes5.dex */
final class dahc implements AutoCompleteTextView.OnDismissListener {
    final /* synthetic */ dahe a;

    public dahc(dahe daheVar) {
        this.a = daheVar;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public final void onDismiss() {
        dahe daheVar = this.a;
        daheVar.d = true;
        daheVar.f = System.currentTimeMillis();
        this.a.i(false);
    }
}
