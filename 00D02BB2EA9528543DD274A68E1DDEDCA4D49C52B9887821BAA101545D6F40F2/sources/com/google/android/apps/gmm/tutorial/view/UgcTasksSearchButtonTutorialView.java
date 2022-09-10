package com.google.android.apps.gmm.tutorial.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class UgcTasksSearchButtonTutorialView extends bzoq {
    public UgcTasksSearchButtonTutorialView(Context context) {
        super(context);
    }

    @dzsi
    private final Rect e() {
        if (this.f.isEmpty()) {
            return null;
        }
        return this.f.get(0).b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bzoo, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        b(R.id.tutorial_ugc_tasks_search_button_got_it);
        Rect e = e();
        if (e != null) {
            int i5 = (e.left + e.right) / 2;
            int i6 = (e.top + e.bottom) / 2;
            View findViewById = findViewById(R.id.tutorial_highlight_container);
            findViewById.layout(i5 - (findViewById.getMeasuredWidth() / 2), i6 - (findViewById.getMeasuredHeight() / 2), i5 + (findViewById.getMeasuredWidth() / 2), i6 + (findViewById.getMeasuredHeight() / 2));
        }
    }

    @Override // defpackage.bzoo, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        Rect e = e();
        return e == null || ((float) e.left) > x || x > ((float) e.right) || ((float) e.top) > y || y > ((float) e.bottom);
    }

    public UgcTasksSearchButtonTutorialView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UgcTasksSearchButtonTutorialView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
