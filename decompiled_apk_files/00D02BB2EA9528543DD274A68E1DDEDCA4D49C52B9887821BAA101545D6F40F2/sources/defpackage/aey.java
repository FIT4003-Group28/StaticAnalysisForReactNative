package defpackage;

import android.view.View;
import android.view.Window;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aey  reason: default package */
/* loaded from: classes2.dex */
public final class aey implements View.OnClickListener {
    final up a;
    final /* synthetic */ afa b;

    public aey(afa afaVar) {
        this.b = afaVar;
        this.a = new up(afaVar.a.getContext(), afaVar.b);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        afa afaVar = this.b;
        Window.Callback callback = afaVar.c;
        if (callback == null || !afaVar.d) {
            return;
        }
        callback.onMenuItemSelected(0, this.a);
    }
}
