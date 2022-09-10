package defpackage;

import android.widget.PopupMenu;
/* compiled from: PG */
/* renamed from: tjx  reason: default package */
/* loaded from: classes7.dex */
final class tjx implements PopupMenu.OnDismissListener {
    final /* synthetic */ tjz a;

    public tjx(tjz tjzVar) {
        this.a = tjzVar;
    }

    @Override // android.widget.PopupMenu.OnDismissListener
    public final void onDismiss(PopupMenu popupMenu) {
        this.a.f = null;
    }
}
