package com.facebook.react.views.progressbar;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.react.uimanager.g;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProgressBarShadowNode.java */
/* loaded from: classes.dex */
public class b extends g implements YogaMeasureFunction {

    /* renamed from: a  reason: collision with root package name */
    private String f4014a = "Normal";

    /* renamed from: b  reason: collision with root package name */
    private final SparseIntArray f4015b = new SparseIntArray();

    /* renamed from: c  reason: collision with root package name */
    private final SparseIntArray f4016c = new SparseIntArray();

    /* renamed from: d  reason: collision with root package name */
    private final Set<Integer> f4017d = new HashSet();

    public b() {
        setMeasureFunction(this);
    }

    public String a() {
        return this.f4014a;
    }

    @com.facebook.react.uimanager.a.a(a = "styleAttr")
    public void setStyle(String str) {
        if (str == null) {
            str = "Normal";
        }
        this.f4014a = str;
    }

    @Override // com.facebook.yoga.YogaMeasureFunction
    public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        int styleFromString = ReactProgressBarViewManager.getStyleFromString(a());
        if (!this.f4017d.contains(Integer.valueOf(styleFromString))) {
            ProgressBar createProgressBar = ReactProgressBarViewManager.createProgressBar(getThemedContext(), styleFromString);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
            createProgressBar.measure(makeMeasureSpec, makeMeasureSpec);
            this.f4015b.put(styleFromString, createProgressBar.getMeasuredHeight());
            this.f4016c.put(styleFromString, createProgressBar.getMeasuredWidth());
            this.f4017d.add(Integer.valueOf(styleFromString));
        }
        return com.facebook.yoga.b.a(this.f4016c.get(styleFromString), this.f4015b.get(styleFromString));
    }
}
