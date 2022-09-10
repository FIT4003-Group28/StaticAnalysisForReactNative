package defpackage;

import android.widget.PopupMenu;
/* compiled from: PG */
/* renamed from: zja  reason: default package */
/* loaded from: classes7.dex */
final class zja implements PopupMenu.OnDismissListener {
    final /* synthetic */ zjm a;

    public zja(zjm zjmVar) {
        this.a = zjmVar;
    }

    @Override // android.widget.PopupMenu.OnDismissListener
    public final void onDismiss(PopupMenu popupMenu) {
        this.a.t = null;
    }
}
