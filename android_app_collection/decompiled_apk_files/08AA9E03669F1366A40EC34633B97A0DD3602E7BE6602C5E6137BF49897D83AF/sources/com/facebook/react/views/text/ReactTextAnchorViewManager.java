package com.facebook.react.views.text;

import android.text.TextUtils;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.o;
import com.facebook.react.views.text.d;
import com.google.android.gms.common.api.Api;
/* loaded from: classes.dex */
public abstract class ReactTextAnchorViewManager<T extends View, C extends d> extends BaseViewManager<T, C> {
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};

    @com.facebook.react.uimanager.a.a(a = "numberOfLines", e = Api.BaseClientBuilder.API_PRIORITY_OTHER)
    public void setNumberOfLines(k kVar, int i) {
        kVar.setNumberOfLines(i);
    }

    @com.facebook.react.uimanager.a.a(a = "ellipsizeMode")
    public void setEllipsizeMode(k kVar, String str) {
        if (str == null || str.equals("tail")) {
            kVar.setEllipsizeLocation(TextUtils.TruncateAt.END);
        } else if (str.equals("head")) {
            kVar.setEllipsizeLocation(TextUtils.TruncateAt.START);
        } else if (str.equals("middle")) {
            kVar.setEllipsizeLocation(TextUtils.TruncateAt.MIDDLE);
        } else {
            throw new com.facebook.react.bridge.n("Invalid ellipsizeMode: " + str);
        }
    }

    @com.facebook.react.uimanager.a.a(a = "textAlignVertical")
    public void setTextAlignVertical(k kVar, String str) {
        if (str == null || "auto".equals(str)) {
            kVar.setGravityVertical(0);
        } else if ("top".equals(str)) {
            kVar.setGravityVertical(48);
        } else if ("bottom".equals(str)) {
            kVar.setGravityVertical(80);
        } else if ("center".equals(str)) {
            kVar.setGravityVertical(16);
        } else {
            throw new com.facebook.react.bridge.n("Invalid textAlignVertical: " + str);
        }
    }

    @com.facebook.react.uimanager.a.a(a = "selectable")
    public void setSelectable(k kVar, boolean z) {
        kVar.setTextIsSelectable(z);
    }

    @com.facebook.react.uimanager.a.a(a = "selectionColor", b = "Color")
    public void setSelectionColor(k kVar, Integer num) {
        if (num == null) {
            kVar.setHighlightColor(c.c(kVar.getContext()));
        } else {
            kVar.setHighlightColor(num.intValue());
        }
    }

    @com.facebook.react.uimanager.a.b(a = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"}, c = Float.NaN)
    public void setBorderRadius(k kVar, int i, float f) {
        if (!com.facebook.yoga.a.a(f)) {
            f = o.a(f);
        }
        if (i == 0) {
            kVar.setBorderRadius(f);
        } else {
            kVar.a(f, i - 1);
        }
    }

    @com.facebook.react.uimanager.a.a(a = "borderStyle")
    public void setBorderStyle(k kVar, String str) {
        kVar.setBorderStyle(str);
    }

    @com.facebook.react.uimanager.a.b(a = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"}, c = Float.NaN)
    public void setBorderWidth(k kVar, int i, float f) {
        if (!com.facebook.yoga.a.a(f)) {
            f = o.a(f);
        }
        kVar.a(SPACING_TYPES[i], f);
    }

    @com.facebook.react.uimanager.a.b(a = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"}, b = "Color")
    public void setBorderColor(k kVar, int i, Integer num) {
        float f = Float.NaN;
        float intValue = num == null ? Float.NaN : num.intValue() & 16777215;
        if (num != null) {
            f = num.intValue() >>> 24;
        }
        kVar.a(SPACING_TYPES[i], intValue, f);
    }

    @com.facebook.react.uimanager.a.a(a = "includeFontPadding", f = true)
    public void setIncludeFontPadding(k kVar, boolean z) {
        kVar.setIncludeFontPadding(z);
    }

    @com.facebook.react.uimanager.a.a(a = "disabled", f = false)
    public void setDisabled(k kVar, boolean z) {
        kVar.setEnabled(!z);
    }
}
