package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
/* compiled from: PG */
/* renamed from: acms  reason: default package */
/* loaded from: classes.dex */
final class acms implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ LinearLayout b;
    final /* synthetic */ acmt c;

    public acms(acmt acmtVar, View view, LinearLayout linearLayout) {
        this.c = acmtVar;
        this.a = view;
        this.b = linearLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        PopupWindow popupWindow = this.c.g;
        View view = this.a;
        popupWindow.update(view, 0, acmt.c(this.b, view), -2, -2);
        this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
