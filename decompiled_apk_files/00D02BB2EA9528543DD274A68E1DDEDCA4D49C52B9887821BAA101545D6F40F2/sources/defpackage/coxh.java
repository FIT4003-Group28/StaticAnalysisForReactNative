package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: coxh  reason: default package */
/* loaded from: classes.dex */
public final class coxh {
    public static final coxh a = new coxh();
    private Pattern[] b = new Pattern[0];
    private String[] c = new String[0];

    private coxh() {
    }

    public final synchronized void a(String[] strArr, String[] strArr2) {
        int length = strArr.length;
        cnwc.g(length == strArr2.length);
        this.b = new Pattern[length];
        this.c = strArr2;
        for (int i = 0; i < strArr.length; i++) {
            this.b[i] = Pattern.compile(strArr[i]);
        }
    }

    public final synchronized String b(String str) {
        if (!TextUtils.isEmpty(str)) {
            int i = 0;
            while (true) {
                Pattern[] patternArr = this.b;
                if (i >= patternArr.length) {
                    return str;
                }
                str = patternArr[i].matcher(str).replaceAll(this.c[i]);
                i++;
            }
        } else {
            return null;
        }
    }
}
