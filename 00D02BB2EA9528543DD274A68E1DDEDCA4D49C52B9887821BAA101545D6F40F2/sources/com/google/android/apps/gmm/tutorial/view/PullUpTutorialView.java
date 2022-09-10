package com.google.android.apps.gmm.tutorial.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PullUpTutorialView extends bzoq {
    public PullUpTutorialView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bzoo, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        b(R.id.tutorial_pull_up_got_it);
        b(R.id.tutorial_pull_up_got_it_landscape);
        if (this.f.size() <= 0 || this.f.get(0).b == null) {
            return;
        }
        View findViewById = findViewById(R.id.tutorial_pull_up_layout);
        int i5 = this.f.get(0).b.top;
        findViewById.layout(((i3 - i) - findViewById.getMeasuredWidth()) / 2, (i5 - findViewById.getMeasuredHeight()) - getContext().getResources().getDimensionPixelSize(R.dimen.tutorial_slider_top_padding), i3, i5);
    }

    public PullUpTutorialView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PullUpTutorialView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
