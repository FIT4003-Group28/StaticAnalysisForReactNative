package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
/* compiled from: PG */
/* renamed from: acol  reason: default package */
/* loaded from: classes2.dex */
final class acol implements cqkn<acpa> {
    @Override // defpackage.cqkn
    public final /* bridge */ /* synthetic */ void a(acpa acpaVar, View view) {
        acpa acpaVar2 = acpaVar;
        if (acor.a.get(view) == null) {
            Context context = view.getContext();
            cqkf c = cqjz.g(view).g.g().c(new acoz(), null);
            c.e(acpaVar2);
            PopupWindow popupWindow = new PopupWindow(c.c(), -2, -2, true);
            popupWindow.setBackgroundDrawable(new cqlu());
            View contentView = popupWindow.getContentView();
            contentView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            popupWindow.setHeight(contentView.getMeasuredHeight());
            popupWindow.showAsDropDown(view, acpf.a(contentView) ? -view.getMeasuredWidth() : view.getMeasuredWidth() - contentView.getMeasuredWidth(), cqrp.d(5.0d).NR(context) - view.getPaddingBottom());
            popupWindow.setOnDismissListener(new acoq(view));
            acor.a.put(view, popupWindow);
        }
    }
}
