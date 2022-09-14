package com.facebook.react.views.text;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.facebook.react.uimanager.ao;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* compiled from: ReactTextShadowNode.java */
/* loaded from: classes.dex */
public class i extends d {
    private static final TextPaint y = new TextPaint(1);
    private final YogaMeasureFunction A = new YogaMeasureFunction() { // from class: com.facebook.react.views.text.i.1
        @Override // com.facebook.yoga.YogaMeasureFunction
        public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
            Layout build;
            TextPaint textPaint = i.y;
            Spanned spanned = (Spanned) com.facebook.j.a.a.a(i.this.z, "Spannable element has not been prepared in onBeforeLayout");
            BoringLayout.Metrics isBoring = BoringLayout.isBoring(spanned, textPaint);
            float desiredWidth = isBoring == null ? Layout.getDesiredWidth(spanned, textPaint) : Float.NaN;
            boolean z = yogaMeasureMode == YogaMeasureMode.UNDEFINED || f < BitmapDescriptorFactory.HUE_RED;
            if (isBoring == null && (z || (!com.facebook.yoga.a.a(desiredWidth) && desiredWidth <= f))) {
                int ceil = (int) Math.ceil(desiredWidth);
                if (Build.VERSION.SDK_INT < 23) {
                    build = new StaticLayout(spanned, textPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, BitmapDescriptorFactory.HUE_RED, i.this.s);
                } else {
                    build = StaticLayout.Builder.obtain(spanned, 0, spanned.length(), textPaint, ceil).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(BitmapDescriptorFactory.HUE_RED, 1.0f).setIncludePad(i.this.s).setBreakStrategy(i.this.l).setHyphenationFrequency(1).build();
                }
            } else if (isBoring != null && (z || isBoring.width <= f)) {
                build = BoringLayout.make(spanned, textPaint, isBoring.width, Layout.Alignment.ALIGN_NORMAL, 1.0f, BitmapDescriptorFactory.HUE_RED, isBoring, i.this.s);
            } else if (Build.VERSION.SDK_INT < 23) {
                build = new StaticLayout(spanned, textPaint, (int) f, Layout.Alignment.ALIGN_NORMAL, 1.0f, BitmapDescriptorFactory.HUE_RED, i.this.s);
            } else {
                build = StaticLayout.Builder.obtain(spanned, 0, spanned.length(), textPaint, (int) f).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(BitmapDescriptorFactory.HUE_RED, 1.0f).setIncludePad(i.this.s).setBreakStrategy(i.this.l).setHyphenationFrequency(1).build();
            }
            if (i.this.g != -1 && i.this.g < build.getLineCount()) {
                return com.facebook.yoga.b.a(build.getWidth(), build.getLineBottom(i.this.g - 1));
            }
            return com.facebook.yoga.b.a(build.getWidth(), build.getHeight());
        }
    };
    private Spannable z;

    @Override // com.facebook.react.uimanager.x, com.facebook.react.uimanager.w
    public boolean isVirtualAnchor() {
        return true;
    }

    public i() {
        if (!isVirtual()) {
            setMeasureFunction(this.A);
        }
    }

    private int c() {
        int i = this.k;
        if (getLayoutDirection() == YogaDirection.RTL) {
            if (i == 5) {
                return 3;
            }
            if (i != 3) {
                return i;
            }
            return 5;
        }
        return i;
    }

    @Override // com.facebook.react.uimanager.x, com.facebook.react.uimanager.w
    public void onBeforeLayout() {
        this.z = a(this, null);
        markUpdated();
    }

    @Override // com.facebook.react.uimanager.x
    public void markUpdated() {
        super.markUpdated();
        super.dirty();
    }

    @Override // com.facebook.react.uimanager.x
    public void onCollectExtraUpdates(ao aoVar) {
        super.onCollectExtraUpdates(aoVar);
        if (this.z != null) {
            aoVar.a(getReactTag(), new j(this.z, -1, this.w, getPadding(4), getPadding(1), getPadding(5), getPadding(3), c(), this.l));
        }
    }
}
