package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: cmhm  reason: default package */
/* loaded from: classes5.dex */
final class cmhm {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    private cmhm(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static cmhm a(String str) {
        char c;
        cmmn.a(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        while (true) {
            int length = split.length;
            if (i >= length) {
                if (i2 != -1 && i3 != -1) {
                    return new cmhm(i2, i3, i4, i5, length);
                }
                return null;
            }
            String x = cmny.x(split[i].trim());
            switch (x.hashCode()) {
                case 100571:
                    if (x.equals("end")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3556653:
                    if (x.equals("text")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 109757538:
                    if (x.equals("start")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 109780401:
                    if (x.equals("style")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                i2 = i;
            } else if (c == 1) {
                i3 = i;
            } else if (c == 2) {
                i4 = i;
            } else if (c == 3) {
                i5 = i;
            }
            i++;
        }
    }
}
