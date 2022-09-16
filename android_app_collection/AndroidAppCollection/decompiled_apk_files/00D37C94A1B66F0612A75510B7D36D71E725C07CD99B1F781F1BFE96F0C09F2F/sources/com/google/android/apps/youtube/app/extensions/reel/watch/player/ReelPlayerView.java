package com.google.android.apps.youtube.app.extensions.reel.watch.player;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.libraries.youtube.player.ui.PlayerView;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ReelPlayerView extends PlayerView {
    public boolean a;
    public boolean b;

    public ReelPlayerView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aizi, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View view = this.p;
        if (view == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (this.a) {
            if (measuredWidth2 > 0) {
                double d = measuredHeight2;
                double d2 = measuredWidth2;
                Double.isNaN(d);
                Double.isNaN(d2);
                double d3 = d / d2;
                if (!this.b || d3 <= 1.5d) {
                    double d4 = measuredWidth;
                    Double.isNaN(d4);
                    measuredHeight = (int) (d4 * d3);
                } else {
                    double d5 = measuredHeight;
                    Double.isNaN(d5);
                    int i3 = (int) (d5 / d3);
                    if (i3 < measuredWidth) {
                        double d6 = i3;
                        double d7 = measuredWidth;
                        Double.isNaN(d7);
                        Double.isNaN(d6);
                        double d8 = d7 / d6;
                        Double.isNaN(d6);
                        measuredWidth = (int) (d6 * d8);
                        Double.isNaN(d5);
                        measuredHeight = (int) (d5 * d8);
                    } else {
                        measuredWidth = i3;
                    }
                }
            }
        } else if (measuredWidth > 0 && measuredWidth2 > 0) {
            double d9 = measuredHeight;
            double d10 = measuredWidth;
            Double.isNaN(d9);
            Double.isNaN(d10);
            double d11 = d9 / d10;
            double d12 = measuredHeight2;
            double d13 = measuredWidth2;
            Double.isNaN(d12);
            Double.isNaN(d13);
            double d14 = d12 / d13;
            if (d11 > d14 && d14 != 0.0d) {
                Double.isNaN(d9);
                measuredWidth = (int) (d9 / d14);
            } else if (d11 < d14) {
                Double.isNaN(d10);
                measuredHeight = (int) (d10 * d14);
            }
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public ReelPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
