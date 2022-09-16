package defpackage;

import android.widget.PopupWindow;
/* compiled from: PG */
/* renamed from: sq  reason: default package */
/* loaded from: classes4.dex */
final class sq implements PopupWindow.OnDismissListener {
    final /* synthetic */ sr a;

    public sq(sr srVar) {
        this.a = srVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.c();
    }
}
