package com.facebook.react.flat;

import android.annotation.TargetApi;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.react.bridge.an;
import com.facebook.react.uimanager.ao;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;
import com.google.android.gms.common.api.Api;
import org.spongycastle.i18n.TextBundle;
/* compiled from: RCTTextInput.java */
/* loaded from: classes.dex */
public class ab extends ad implements YogaMeasureFunction {

    /* renamed from: d  reason: collision with root package name */
    private String f3373d;
    private int e = -1;
    private boolean f = false;
    private int g = -1;
    private EditText h;

    @Override // com.facebook.react.flat.r
    boolean f() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.facebook.react.flat.r
    public boolean g() {
        return true;
    }

    @Override // com.facebook.react.flat.r, com.facebook.react.uimanager.x, com.facebook.react.uimanager.w
    public boolean isVirtual() {
        return false;
    }

    @Override // com.facebook.react.uimanager.x, com.facebook.react.uimanager.w
    public boolean isVirtualAnchor() {
        return true;
    }

    @Override // com.facebook.react.flat.ad, com.facebook.react.flat.q
    public void setBackgroundColor(int i) {
    }

    @Override // com.facebook.react.flat.ad, com.facebook.react.flat.q, com.facebook.react.uimanager.x
    public /* bridge */ /* synthetic */ void addChildAt(com.facebook.react.uimanager.x xVar, int i) {
        super.addChildAt(xVar, i);
    }

    @Override // com.facebook.react.flat.q, com.facebook.react.uimanager.x
    public /* bridge */ /* synthetic */ void markUpdated() {
        super.markUpdated();
    }

    @Override // com.facebook.react.flat.ad
    @com.facebook.react.uimanager.a.a(a = "color", c = Double.NaN)
    public /* bridge */ /* synthetic */ void setColor(double d2) {
        super.setColor(d2);
    }

    @Override // com.facebook.react.flat.ad
    @com.facebook.react.uimanager.a.a(a = "fontFamily")
    public /* bridge */ /* synthetic */ void setFontFamily(String str) {
        super.setFontFamily(str);
    }

    @Override // com.facebook.react.flat.ad
    @com.facebook.react.uimanager.a.a(a = "fontSize", d = Float.NaN)
    public /* bridge */ /* synthetic */ void setFontSize(float f) {
        super.setFontSize(f);
    }

    @Override // com.facebook.react.flat.ad
    @com.facebook.react.uimanager.a.a(a = "fontStyle")
    public /* bridge */ /* synthetic */ void setFontStyle(String str) {
        super.setFontStyle(str);
    }

    @Override // com.facebook.react.flat.ad
    @com.facebook.react.uimanager.a.a(a = "fontWeight")
    public /* bridge */ /* synthetic */ void setFontWeight(String str) {
        super.setFontWeight(str);
    }

    @Override // com.facebook.react.flat.q, com.facebook.react.uimanager.g
    public /* bridge */ /* synthetic */ void setOverflow(String str) {
        super.setOverflow(str);
    }

    @Override // com.facebook.react.flat.ad
    @com.facebook.react.uimanager.a.a(a = "textDecorationLine")
    public /* bridge */ /* synthetic */ void setTextDecorationLine(String str) {
        super.setTextDecorationLine(str);
    }

    @Override // com.facebook.react.flat.ad
    @com.facebook.react.uimanager.a.a(a = "textShadowColor", b = "Color", e = 1426063360)
    public /* bridge */ /* synthetic */ void setTextShadowColor(int i) {
        super.setTextShadowColor(i);
    }

    @Override // com.facebook.react.flat.ad
    @com.facebook.react.uimanager.a.a(a = "textShadowOffset")
    public /* bridge */ /* synthetic */ void setTextShadowOffset(an anVar) {
        super.setTextShadowOffset(anVar);
    }

    @Override // com.facebook.react.flat.ad
    @com.facebook.react.uimanager.a.a(a = "textShadowRadius")
    public /* bridge */ /* synthetic */ void setTextShadowRadius(float f) {
        super.setTextShadowRadius(f);
    }

    public ab() {
        d();
        setMeasureFunction(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.flat.r
    public void a(boolean z) {
        super.a(z);
        markUpdated();
    }

    @Override // com.facebook.react.uimanager.x, com.facebook.react.uimanager.w
    @TargetApi(17)
    public void setThemedContext(com.facebook.react.uimanager.af afVar) {
        super.setThemedContext(afVar);
        this.h = new EditText(afVar);
        this.h.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setDefaultPadding(4, this.h.getPaddingStart());
        setDefaultPadding(1, this.h.getPaddingTop());
        setDefaultPadding(5, this.h.getPaddingEnd());
        setDefaultPadding(3, this.h.getPaddingBottom());
        this.h.setPadding(0, 0, 0, 0);
    }

    @Override // com.facebook.yoga.YogaMeasureFunction
    public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        EditText editText = (EditText) com.facebook.j.a.a.b(this.h);
        int j = j();
        if (j == -1) {
            j = (int) Math.ceil(com.facebook.react.uimanager.o.b(14.0f));
        }
        editText.setTextSize(0, j);
        if (this.g != -1) {
            editText.setLines(this.g);
        }
        editText.measure(com.facebook.react.views.view.b.a(f, yogaMeasureMode), com.facebook.react.views.view.b.a(f2, yogaMeasureMode2));
        return com.facebook.yoga.b.a(editText.getMeasuredWidth(), editText.getMeasuredHeight());
    }

    @Override // com.facebook.react.uimanager.x
    public void onCollectExtraUpdates(ao aoVar) {
        super.onCollectExtraUpdates(aoVar);
        if (this.e != -1) {
            aoVar.a(getReactTag(), new com.facebook.react.views.text.j(m(), this.e, false, getPadding(4), getPadding(1), getPadding(5), getPadding(3), -1));
        }
    }

    @com.facebook.react.uimanager.a.a(a = "mostRecentEventCount")
    public void setMostRecentEventCount(int i) {
        this.e = i;
    }

    @com.facebook.react.uimanager.a.a(a = "numberOfLines", e = Api.BaseClientBuilder.API_PRIORITY_OTHER)
    public void setNumberOfLines(int i) {
        this.g = i;
        a(true);
    }

    @com.facebook.react.uimanager.a.a(a = TextBundle.TEXT_ENTRY)
    public void setText(String str) {
        this.f3373d = str;
        a(true);
    }

    @Override // com.facebook.react.uimanager.x
    public void setPadding(int i, float f) {
        super.setPadding(i, f);
        this.f = true;
        dirty();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.flat.ad, com.facebook.react.flat.r
    public void b(SpannableStringBuilder spannableStringBuilder) {
        if (this.f3373d != null) {
            spannableStringBuilder.append((CharSequence) this.f3373d);
        }
        super.b(spannableStringBuilder);
    }
}
