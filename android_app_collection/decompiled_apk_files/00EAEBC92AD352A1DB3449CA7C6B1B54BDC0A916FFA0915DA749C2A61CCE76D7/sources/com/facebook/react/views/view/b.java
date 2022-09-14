package com.facebook.react.views.view;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.yoga.n;
/* loaded from: classes.dex */
public class b {
    public static int a(float f2, n nVar) {
        return nVar == n.EXACTLY ? View.MeasureSpec.makeMeasureSpec((int) f2, 1073741824) : nVar == n.AT_MOST ? View.MeasureSpec.makeMeasureSpec((int) f2, RecyclerView.UNDEFINED_DURATION) : View.MeasureSpec.makeMeasureSpec(0, 0);
    }
}
