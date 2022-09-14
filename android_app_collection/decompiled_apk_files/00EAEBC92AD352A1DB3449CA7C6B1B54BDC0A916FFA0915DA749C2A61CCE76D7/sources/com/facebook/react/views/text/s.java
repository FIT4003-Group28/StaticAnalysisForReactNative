package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class s {
    public static int a(String str) {
        if ("italic".equals(str)) {
            return 2;
        }
        return "normal".equals(str) ? 0 : -1;
    }

    public static Typeface a(Typeface typeface, int i, int i2, String str, AssetManager assetManager) {
        int i3 = 0;
        int style = typeface == null ? 0 : typeface.getStyle();
        if (i2 == 1 || ((style & 1) != 0 && i2 == -1)) {
            i3 = 1;
        }
        if (i == 2 || ((style & 2) != 0 && i == -1)) {
            i3 |= 2;
        }
        if (str != null) {
            typeface = i.a().a(str, i3, i2, assetManager);
        } else if (typeface != null) {
            typeface = Typeface.create(typeface, i3);
        }
        return typeface != null ? typeface : Typeface.defaultFromStyle(i3);
    }

    public static String a(ReadableArray readableArray) {
        String str;
        if (readableArray == null || readableArray.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            String string = readableArray.getString(i);
            if (string != null) {
                char c2 = 65535;
                switch (string.hashCode()) {
                    case -1195362251:
                        if (string.equals("proportional-nums")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case -1061392823:
                        if (string.equals("lining-nums")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case -771984547:
                        if (string.equals("tabular-nums")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case -659678800:
                        if (string.equals("oldstyle-nums")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 1183323111:
                        if (string.equals("small-caps")) {
                            c2 = 0;
                            break;
                        }
                        break;
                }
                if (c2 == 0) {
                    str = "'smcp'";
                } else if (c2 == 1) {
                    str = "'onum'";
                } else if (c2 == 2) {
                    str = "'lnum'";
                } else if (c2 == 3) {
                    str = "'tnum'";
                } else if (c2 == 4) {
                    str = "'pnum'";
                }
                arrayList.add(str);
            }
        }
        return TextUtils.join(", ", arrayList);
    }

    public static int b(String str) {
        int c2 = str != null ? c(str) : -1;
        if (c2 == -1) {
            c2 = 0;
        }
        if (c2 == 700 || "bold".equals(str)) {
            return 1;
        }
        if (c2 != 400 && !"normal".equals(str)) {
            return c2;
        }
        return 0;
    }

    private static int c(String str) {
        if (str.length() != 3 || !str.endsWith("00") || str.charAt(0) > '9' || str.charAt(0) < '1') {
            return -1;
        }
        return (str.charAt(0) - '0') * 100;
    }
}
