package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableMap;
import java.util.Arrays;
import java.util.HashSet;
/* loaded from: classes.dex */
public class c1 {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f5886a = {8, 4, 5, 1, 3, 0, 2};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f5887b = {8, 7, 6, 4, 5, 1, 3, 0, 2};

    /* renamed from: c  reason: collision with root package name */
    private static final HashSet<String> f5888c = new HashSet<>(Arrays.asList("alignSelf", "alignItems", "collapsable", "flex", "flexBasis", "flexDirection", "flexGrow", "flexShrink", "flexWrap", "justifyContent", "alignContent", "display", "position", "right", "top", "bottom", "left", "start", "end", "width", "height", "minWidth", "maxWidth", "minHeight", "maxHeight", "margin", "marginVertical", "marginHorizontal", "marginLeft", "marginRight", "marginTop", "marginBottom", "marginStart", "marginEnd", "padding", "paddingVertical", "paddingHorizontal", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom", "paddingStart", "paddingEnd"));

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean a(ReadableMap readableMap, String str) {
        char c2;
        if (f5888c.contains(str)) {
            return true;
        }
        if ("pointerEvents".equals(str)) {
            String string = readableMap.getString(str);
            return "auto".equals(string) || "box-none".equals(string);
        }
        switch (str.hashCode()) {
            case -1989576717:
                if (str.equals("borderRightColor")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1971292586:
                if (str.equals("borderRightWidth")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -1470826662:
                if (str.equals("borderTopColor")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1452542531:
                if (str.equals("borderTopWidth")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -1308858324:
                if (str.equals("borderBottomColor")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -1290574193:
                if (str.equals("borderBottomWidth")) {
                    c2 = '\n';
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
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -223992013:
                if (str.equals("borderLeftWidth")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 529642498:
                if (str.equals("overflow")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 741115130:
                if (str.equals("borderWidth")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    c2 = 1;
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
                return readableMap.isNull("opacity") || readableMap.getDouble("opacity") == 1.0d;
            case 1:
                if (readableMap.hasKey("backgroundColor") && readableMap.getInt("backgroundColor") != 0) {
                    return false;
                }
                return !readableMap.hasKey("borderWidth") || readableMap.isNull("borderWidth") || readableMap.getDouble("borderWidth") == 0.0d;
            case 2:
                return !readableMap.isNull("borderLeftColor") && readableMap.getInt("borderLeftColor") == 0;
            case 3:
                return !readableMap.isNull("borderRightColor") && readableMap.getInt("borderRightColor") == 0;
            case 4:
                return !readableMap.isNull("borderTopColor") && readableMap.getInt("borderTopColor") == 0;
            case 5:
                return !readableMap.isNull("borderBottomColor") && readableMap.getInt("borderBottomColor") == 0;
            case 6:
                return readableMap.isNull("borderWidth") || readableMap.getDouble("borderWidth") == 0.0d;
            case 7:
                return readableMap.isNull("borderLeftWidth") || readableMap.getDouble("borderLeftWidth") == 0.0d;
            case '\b':
                return readableMap.isNull("borderTopWidth") || readableMap.getDouble("borderTopWidth") == 0.0d;
            case '\t':
                return readableMap.isNull("borderRightWidth") || readableMap.getDouble("borderRightWidth") == 0.0d;
            case '\n':
                return readableMap.isNull("borderBottomWidth") || readableMap.getDouble("borderBottomWidth") == 0.0d;
            case 11:
                return readableMap.isNull("overflow") || "visible".equals(readableMap.getString("overflow"));
            default:
                return false;
        }
    }
}
