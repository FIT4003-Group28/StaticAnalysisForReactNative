package defpackage;

import android.view.View;
import android.widget.PopupWindow;
/* compiled from: PG */
/* renamed from: acoq  reason: default package */
/* loaded from: classes2.dex */
final class acoq implements PopupWindow.OnDismissListener {
    final /* synthetic */ View a;

    public acoq(View view) {
        this.a = view;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        acor.a.remove(this.a);
    }
}
