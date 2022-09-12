package defpackage;

import android.widget.PopupMenu;
/* compiled from: PG */
/* renamed from: cgzs  reason: default package */
/* loaded from: classes4.dex */
final class cgzs implements PopupMenu.OnDismissListener {
    final /* synthetic */ chac a;

    public cgzs(chac chacVar) {
        this.a = chacVar;
    }

    @Override // android.widget.PopupMenu.OnDismissListener
    public final void onDismiss(PopupMenu popupMenu) {
        this.a.f = null;
    }
}
