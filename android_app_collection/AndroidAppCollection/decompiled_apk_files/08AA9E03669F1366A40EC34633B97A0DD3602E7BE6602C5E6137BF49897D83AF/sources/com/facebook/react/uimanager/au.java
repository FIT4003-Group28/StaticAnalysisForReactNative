package com.facebook.react.uimanager;

import java.util.Arrays;
import java.util.HashSet;
/* compiled from: ViewProps.java */
/* loaded from: classes.dex */
public class au {

    /* renamed from: d  reason: collision with root package name */
    public static boolean f3834d;

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f3831a = {8, 4, 5, 1, 3, 0, 2};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f3832b = {8, 7, 6, 4, 5, 1, 3, 0, 2};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f3833c = {4, 5, 1, 3};
    private static final HashSet<String> e = new HashSet<>(Arrays.asList("alignSelf", "alignItems", "collapsable", "flex", "flexBasis", "flexDirection", "flexGrow", "flexShrink", "flexWrap", "justifyContent", "overflow", "alignContent", "display", "position", "right", "top", "bottom", "left", "start", "end", "width", "height", "minWidth", "maxWidth", "minHeight", "maxHeight", "margin", "marginVertical", "marginHorizontal", "marginLeft", "marginRight", "marginTop", "marginBottom", "marginStart", "marginEnd", "padding", "paddingVertical", "paddingHorizontal", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom", "paddingStart", "paddingEnd"));

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean a(com.facebook.react.bridge.an anVar, String str) {
        char c2;
        if (e.contains(str)) {
            return true;
        }
        if ("pointerEvents".equals(str)) {
            String string = anVar.getString(str);
            return "auto".equals(string) || "box-none".equals(string);
        } else if (!f3834d) {
            return false;
        } else {
            switch (str.hashCode()) {
                case -1989576717:
                    if (str.equals("borderRightColor")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1971292586:
                    if (str.equals("borderRightWidth")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1470826662:
                    if (str.equals("borderTopColor")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1452542531:
                    if (str.equals("borderTopWidth")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1308858324:
                    if (str.equals("borderBottomColor")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1290574193:
                    if (str.equals("borderBottomWidth")) {
                        c2 = '\f';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1267206133:
                    if (str.equals("opacity")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -242276144:
                    if (str.equals("borderLeftColor")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -223992013:
                    if (str.equals("borderLeftWidth")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 529642498:
                    if (str.equals("overflow")) {
                        c2 = 14;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 722830999:
                    if (str.equals("borderColor")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 741115130:
                    if (str.equals("borderWidth")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1287124693:
                    if (str.equals("backgroundColor")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1288688105:
                    if (str.equals("onLayout")) {
                        c2 = '\r';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1349188574:
                    if (str.equals("borderRadius")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    return anVar.getDouble("opacity") == 1.0d;
                case 1:
                    return anVar.getInt("backgroundColor") == 0;
                case 2:
                    if (anVar.hasKey("backgroundColor") && anVar.getInt("backgroundColor") != 0) {
                        return false;
                    }
                    return !anVar.hasKey("borderWidth") || anVar.getDouble("borderWidth") == 0.0d;
                case 3:
                    return anVar.getInt("borderColor") == 0;
                case 4:
                    return anVar.getInt("borderLeftColor") == 0;
                case 5:
                    return anVar.getInt("borderRightColor") == 0;
                case 6:
                    return anVar.getInt("borderTopColor") == 0;
                case 7:
                    return anVar.getInt("borderBottomColor") == 0;
                case '\b':
                    return anVar.getDouble("borderWidth") == 0.0d;
                case '\t':
                    return anVar.getDouble("borderLeftWidth") == 0.0d;
                case '\n':
                    return anVar.getDouble("borderTopWidth") == 0.0d;
                case 11:
                    return anVar.getDouble("borderRightWidth") == 0.0d;
                case '\f':
                    return anVar.getDouble("borderBottomWidth") == 0.0d;
                case '\r':
                    return true;
                case 14:
                    return true;
                default:
                    return false;
            }
        }
    }
}
