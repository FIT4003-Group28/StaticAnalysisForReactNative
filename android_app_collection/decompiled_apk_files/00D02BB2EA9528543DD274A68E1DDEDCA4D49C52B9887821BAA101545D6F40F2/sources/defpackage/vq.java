package defpackage;

import android.widget.PopupWindow;
/* compiled from: PG */
/* renamed from: vq  reason: default package */
/* loaded from: classes7.dex */
final class vq implements PopupWindow.OnDismissListener {
    final /* synthetic */ vr a;

    public vq(vr vrVar) {
        this.a = vrVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.f();
    }
}
