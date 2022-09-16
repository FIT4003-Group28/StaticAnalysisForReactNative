package com.facebook.react.views.textinput;

import android.os.Build;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.react.uimanager.af;
import com.facebook.react.uimanager.ao;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;
import org.spongycastle.i18n.TextBundle;
/* compiled from: ReactTextInputShadowNode.java */
/* loaded from: classes.dex */
public class m extends com.facebook.react.views.text.d implements YogaMeasureFunction {
    private k A;
    private EditText z;
    private int y = -1;
    private String B = null;

    @Override // com.facebook.react.uimanager.x, com.facebook.react.uimanager.w
    public boolean isVirtualAnchor() {
        return true;
    }

    @Override // com.facebook.react.uimanager.x
    public boolean isYogaLeafNode() {
        return true;
    }

    public m() {
        int i = Build.VERSION.SDK_INT;
        this.l = 0;
        setMeasureFunction(this);
    }

    @Override // com.facebook.react.uimanager.x, com.facebook.react.uimanager.w
    public void setThemedContext(af afVar) {
        super.setThemedContext(afVar);
        EditText editText = new EditText(getThemedContext());
        setDefaultPadding(4, editText.getPaddingStart());
        setDefaultPadding(1, editText.getPaddingTop());
        setDefaultPadding(5, editText.getPaddingEnd());
        setDefaultPadding(3, editText.getPaddingBottom());
        this.z = editText;
        this.z.setPadding(0, 0, 0, 0);
        this.z.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    @Override // com.facebook.yoga.YogaMeasureFunction
    public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        EditText editText = (EditText) com.facebook.j.a.a.b(this.z);
        if (this.A == null) {
            return com.facebook.yoga.b.a(0, 0);
        }
        this.A.a(editText);
        editText.measure(com.facebook.react.views.view.b.a(f, yogaMeasureMode), com.facebook.react.views.view.b.a(f2, yogaMeasureMode2));
        return com.facebook.yoga.b.a(editText.getMeasuredWidth(), editText.getMeasuredHeight());
    }

    @Override // com.facebook.react.uimanager.x, com.facebook.react.uimanager.w
    public void setLocalData(Object obj) {
        com.facebook.j.a.a.a(obj instanceof k);
        this.A = (k) obj;
        dirty();
    }

    @com.facebook.react.uimanager.a.a(a = "mostRecentEventCount")
    public void setMostRecentEventCount(int i) {
        this.y = i;
    }

    @com.facebook.react.uimanager.a.a(a = TextBundle.TEXT_ENTRY)
    public void setText(String str) {
        this.B = str;
        markUpdated();
    }

    public String b() {
        return this.B;
    }

    @Override // com.facebook.react.views.text.d
    public void setTextBreakStrategy(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        if (str == null || "simple".equals(str)) {
            this.l = 0;
        } else if ("highQuality".equals(str)) {
            this.l = 1;
        } else if ("balanced".equals(str)) {
            this.l = 2;
        } else {
            throw new com.facebook.react.bridge.n("Invalid textBreakStrategy: " + str);
        }
    }

    @Override // com.facebook.react.uimanager.x
    public void onCollectExtraUpdates(ao aoVar) {
        super.onCollectExtraUpdates(aoVar);
        if (this.y != -1) {
            aoVar.a(getReactTag(), new com.facebook.react.views.text.j(a(this, b()), this.y, this.w, getPadding(0), getPadding(1), getPadding(2), getPadding(3), this.k, this.l));
        }
    }

    @Override // com.facebook.react.uimanager.x
    public void setPadding(int i, float f) {
        super.setPadding(i, f);
        markUpdated();
    }
}
