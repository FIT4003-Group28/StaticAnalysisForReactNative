package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: uqp  reason: default package */
/* loaded from: classes7.dex */
final class uqp implements cqfd {
    @Override // defpackage.cqfd
    public final boolean a(View view) {
        if (((zff) cqjz.o(view)) != null) {
            int paddingLeft = view.getPaddingLeft();
            int paddingTop = view.getPaddingTop();
            int paddingRight = view.getPaddingRight();
            View a = cqhu.a(view.getRootView(), zei.a);
            view.setPadding(paddingLeft, paddingTop, paddingRight, a != null ? a.getMeasuredHeight() : 0);
            return true;
        }
        return true;
    }
}
