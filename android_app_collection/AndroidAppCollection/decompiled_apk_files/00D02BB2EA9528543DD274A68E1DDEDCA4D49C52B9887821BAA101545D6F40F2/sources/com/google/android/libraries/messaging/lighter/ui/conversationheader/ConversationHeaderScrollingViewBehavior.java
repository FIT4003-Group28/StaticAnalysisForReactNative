package com.google.android.libraries.messaging.lighter.ui.conversationheader;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ConversationHeaderScrollingViewBehavior extends aji<View> {
    public ConversationHeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.aji
    public final boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        ajl ajlVar = (ajl) view.getLayoutParams();
        if (ajlVar.topMargin != view2.getBottom()) {
            ajlVar.setMargins(ajlVar.leftMargin, view2.getBottom(), ajlVar.rightMargin, ajlVar.bottomMargin);
            view.setLayoutParams(ajlVar);
            return false;
        }
        return false;
    }

    @Override // defpackage.aji
    public final boolean i(View view) {
        return view instanceof AppBarLayout;
    }
}
