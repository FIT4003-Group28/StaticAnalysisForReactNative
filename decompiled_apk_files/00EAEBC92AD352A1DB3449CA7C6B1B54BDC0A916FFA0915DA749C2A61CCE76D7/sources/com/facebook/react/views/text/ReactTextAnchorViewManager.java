package com.facebook.react.views.text;

import android.text.TextUtils;
import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.views.text.h;
import com.horcrux.svg.BuildConfig;
/* loaded from: classes.dex */
public abstract class ReactTextAnchorViewManager<T extends View, C extends h> extends BaseViewManager<T, C> {
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};

    @com.facebook.react.uimanager.e1.a(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(r rVar, boolean z) {
        rVar.setAdjustFontSizeToFit(z);
    }

    @com.facebook.react.uimanager.e1.b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(r rVar, int i, Integer num) {
        float f2 = Float.NaN;
        float intValue = num == null ? Float.NaN : num.intValue() & 16777215;
        if (num != null) {
            f2 = num.intValue() >>> 24;
        }
        rVar.a(SPACING_TYPES[i], intValue, f2);
    }

    @com.facebook.react.uimanager.e1.b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(r rVar, int i, float f2) {
        if (!com.facebook.yoga.g.a(f2)) {
            f2 = com.facebook.react.uimanager.q.b(f2);
        }
        if (i == 0) {
            rVar.setBorderRadius(f2);
        } else {
            rVar.a(f2, i - 1);
        }
    }

    @com.facebook.react.uimanager.e1.a(name = "borderStyle")
    public void setBorderStyle(r rVar, String str) {
        rVar.setBorderStyle(str);
    }

    @com.facebook.react.uimanager.e1.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(r rVar, int i, float f2) {
        if (!com.facebook.yoga.g.a(f2)) {
            f2 = com.facebook.react.uimanager.q.b(f2);
        }
        rVar.a(SPACING_TYPES[i], f2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @com.facebook.react.uimanager.e1.a(name = "dataDetectorType")
    public void setDataDetectorType(r rVar, String str) {
        char c2;
        switch (str.hashCode()) {
            case -1192969641:
                if (str.equals("phoneNumber")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 96673:
                if (str.equals("all")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3321850:
                if (str.equals("link")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 3387192:
                if (str.equals("none")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 96619420:
                if (str.equals("email")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            rVar.setLinkifyMask(4);
        } else if (c2 == 1) {
            rVar.setLinkifyMask(1);
        } else if (c2 == 2) {
            rVar.setLinkifyMask(2);
        } else if (c2 != 3) {
            rVar.setLinkifyMask(0);
        } else {
            rVar.setLinkifyMask(15);
        }
    }

    @com.facebook.react.uimanager.e1.a(defaultBoolean = BuildConfig.DEBUG, name = "disabled")
    public void setDisabled(r rVar, boolean z) {
        rVar.setEnabled(!z);
    }

    @com.facebook.react.uimanager.e1.a(name = "ellipsizeMode")
    public void setEllipsizeMode(r rVar, String str) {
        TextUtils.TruncateAt truncateAt;
        if (str == null || str.equals("tail")) {
            truncateAt = TextUtils.TruncateAt.END;
        } else if (str.equals("head")) {
            truncateAt = TextUtils.TruncateAt.START;
        } else if (str.equals("middle")) {
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        } else if (!str.equals("clip")) {
            throw new JSApplicationIllegalArgumentException("Invalid ellipsizeMode: " + str);
        } else {
            truncateAt = null;
        }
        rVar.setEllipsizeLocation(truncateAt);
    }

    @com.facebook.react.uimanager.e1.a(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(r rVar, boolean z) {
        rVar.setIncludeFontPadding(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "onInlineViewLayout")
    public void setNotifyOnInlineViewLayout(r rVar, boolean z) {
        rVar.setNotifyOnInlineViewLayout(z);
    }

    @com.facebook.react.uimanager.e1.a(defaultInt = Integer.MAX_VALUE, name = "numberOfLines")
    public void setNumberOfLines(r rVar, int i) {
        rVar.setNumberOfLines(i);
    }

    @com.facebook.react.uimanager.e1.a(name = "selectable")
    public void setSelectable(r rVar, boolean z) {
        rVar.setTextIsSelectable(z);
    }

    @com.facebook.react.uimanager.e1.a(customType = "Color", name = "selectionColor")
    public void setSelectionColor(r rVar, Integer num) {
        rVar.setHighlightColor(num == null ? d.b(rVar.getContext()) : num.intValue());
    }

    @com.facebook.react.uimanager.e1.a(name = "textAlignVertical")
    public void setTextAlignVertical(r rVar, String str) {
        int i;
        if (str == null || "auto".equals(str)) {
            i = 0;
        } else if ("top".equals(str)) {
            i = 48;
        } else if ("bottom".equals(str)) {
            i = 80;
        } else if (!"center".equals(str)) {
            throw new JSApplicationIllegalArgumentException("Invalid textAlignVertical: " + str);
        } else {
            i = 16;
        }
        rVar.setGravityVertical(i);
    }
}
