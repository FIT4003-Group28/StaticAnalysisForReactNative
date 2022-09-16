package com.facebook.react.views.progressbar;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.react.uimanager.i;
import com.facebook.yoga.m;
import com.facebook.yoga.n;
import com.facebook.yoga.o;
import com.facebook.yoga.p;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class b extends i implements m {
    private String A = "Normal";
    private final SparseIntArray B = new SparseIntArray();
    private final SparseIntArray C = new SparseIntArray();
    private final Set<Integer> D = new HashSet();

    public b() {
        S();
    }

    private void S() {
        a((m) this);
    }

    public String R() {
        return this.A;
    }

    @Override // com.facebook.yoga.m
    public long a(p pVar, float f2, n nVar, float f3, n nVar2) {
        int styleFromString = ReactProgressBarViewManager.getStyleFromString(R());
        if (!this.D.contains(Integer.valueOf(styleFromString))) {
            ProgressBar createProgressBar = ReactProgressBarViewManager.createProgressBar(i(), styleFromString);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
            createProgressBar.measure(makeMeasureSpec, makeMeasureSpec);
            this.B.put(styleFromString, createProgressBar.getMeasuredHeight());
            this.C.put(styleFromString, createProgressBar.getMeasuredWidth());
            this.D.add(Integer.valueOf(styleFromString));
        }
        return o.a(this.C.get(styleFromString), this.B.get(styleFromString));
    }

    @com.facebook.react.uimanager.e1.a(name = "styleAttr")
    public void setStyle(String str) {
        if (str == null) {
            str = "Normal";
        }
        this.A = str;
    }
}
