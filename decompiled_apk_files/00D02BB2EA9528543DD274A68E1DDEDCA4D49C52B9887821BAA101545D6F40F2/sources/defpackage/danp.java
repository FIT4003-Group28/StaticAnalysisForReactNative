package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: danp  reason: default package */
/* loaded from: classes5.dex */
public final class danp {
    public static String a(File file) {
        if (!file.getName().endsWith(".apk")) {
            throw new IllegalArgumentException("Non-apk found in splits directory.");
        }
        String str = "";
        String replaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", str);
        if (replaceFirst.equals("base-master")) {
            return str;
        }
        String str2 = "base-";
        if (replaceFirst.startsWith(str2)) {
            str = "config.";
        } else {
            replaceFirst = replaceFirst.replace("-", ".config.");
            str2 = ".config.master";
        }
        return replaceFirst.replace(str2, str);
    }
}
