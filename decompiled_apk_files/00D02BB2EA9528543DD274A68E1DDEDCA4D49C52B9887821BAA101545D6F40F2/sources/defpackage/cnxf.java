package defpackage;

import android.util.Log;
/* compiled from: PG */
/* renamed from: cnxf  reason: default package */
/* loaded from: classes.dex */
public final class cnxf {
    private final String a;

    public cnxf(String str, String... strArr) {
        if (strArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append(']');
            sb.append(' ');
            sb.toString();
        }
        this.a = str;
        new cnvg(str);
        for (int i = 2; i <= 7 && !Log.isLoggable(this.a, i); i++) {
        }
    }
}
