package com.facebook.react.h;

import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.am;
import com.facebook.react.bridge.an;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: JSStackTrace.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f3448a = Pattern.compile("(?:^|[/\\\\])(\\d+\\.js)$");

    public static String a(String str, am amVar) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(", stack:\n");
        for (int i = 0; i < amVar.size(); i++) {
            an c2 = amVar.c(i);
            sb.append(c2.getString("methodName"));
            sb.append("@");
            sb.append(a(c2));
            sb.append(c2.getInt("lineNumber"));
            if (c2.hasKey("column") && !c2.isNull("column") && c2.getType("column") == ReadableType.Number) {
                sb.append(":");
                sb.append(c2.getInt("column"));
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    private static String a(an anVar) {
        if (!anVar.hasKey("file") || anVar.isNull("file") || anVar.getType("file") != ReadableType.String) {
            return "";
        }
        Matcher matcher = f3448a.matcher(anVar.getString("file"));
        if (!matcher.find()) {
            return "";
        }
        return matcher.group(1) + ":";
    }
}
