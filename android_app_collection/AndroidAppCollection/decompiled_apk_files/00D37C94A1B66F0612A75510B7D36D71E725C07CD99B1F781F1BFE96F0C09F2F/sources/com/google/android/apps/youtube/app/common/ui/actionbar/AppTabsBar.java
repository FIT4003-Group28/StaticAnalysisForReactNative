package com.google.android.apps.youtube.app.common.ui.actionbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.DefaultTabsBar;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AppTabsBar extends DefaultTabsBar {
    public int a;
    public int b;

    public AppTabsBar(Context context) {
        super(context);
    }

    public final void d(int i, int i2) {
        yzh yzhVar = this.f;
        yzhVar.getClass();
        this.a = i;
        this.b = i2;
        h(yzhVar.a(i, i, i, i, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.youtube.common.ui.DefaultTabsBar
    public final void e(View view, ColorStateList colorStateList) {
        yzh yzhVar;
        super.e(view, colorStateList);
        if (!(view instanceof ImageView) || (yzhVar = this.f) == null) {
            return;
        }
        ImageView imageView = (ImageView) view;
        imageView.setImageDrawable(yzhVar.c(imageView.getDrawable(), colorStateList));
    }

    public AppTabsBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AppTabsBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
