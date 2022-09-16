package defpackage;

import android.view.View;
import android.view.Window;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aak  reason: default package */
/* loaded from: classes.dex */
public final class aak implements View.OnClickListener {
    final rp a;
    final /* synthetic */ aam b;

    public aak(aam aamVar) {
        this.b = aamVar;
        this.a = new rp(aamVar.a.getContext(), aamVar.d);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aam aamVar = this.b;
        Window.Callback callback = aamVar.e;
        if (callback == null || !aamVar.f) {
            return;
        }
        callback.onMenuItemSelected(0, this.a);
    }
}
