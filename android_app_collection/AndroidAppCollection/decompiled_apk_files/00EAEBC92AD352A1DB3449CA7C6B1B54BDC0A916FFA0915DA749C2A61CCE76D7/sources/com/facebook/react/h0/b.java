package com.facebook.react.h0;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f5542a = Pattern.compile("\\b((?:seg-\\d+(?:_\\d+)?|\\d+)\\.js)");

    private static String a(ReadableMap readableMap) {
        String string;
        if (!readableMap.hasKey("file") || readableMap.isNull("file") || readableMap.getType("file") != ReadableType.String || (string = readableMap.getString("file")) == null) {
            return "";
        }
        Matcher matcher = f5542a.matcher(string);
        if (!matcher.find()) {
            return "";
        }
        return matcher.group(1) + ":";
    }

    public static String a(String str, ReadableArray readableArray) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(", stack:\n");
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap mo209getMap = readableArray.mo209getMap(i);
            sb.append(mo209getMap.getString("methodName"));
            sb.append("@");
            sb.append(a(mo209getMap));
            sb.append((!mo209getMap.hasKey("lineNumber") || mo209getMap.isNull("lineNumber") || mo209getMap.getType("lineNumber") != ReadableType.Number) ? -1 : mo209getMap.getInt("lineNumber"));
            if (mo209getMap.hasKey("column") && !mo209getMap.isNull("column") && mo209getMap.getType("column") == ReadableType.Number) {
                sb.append(":");
                sb.append(mo209getMap.getInt("column"));
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
