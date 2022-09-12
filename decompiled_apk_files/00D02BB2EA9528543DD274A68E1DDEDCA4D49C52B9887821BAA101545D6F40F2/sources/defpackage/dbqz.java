package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dbqz  reason: default package */
/* loaded from: classes5.dex */
class dbqz extends dbrb {
    private final String a = "CharMatcher.invisible()";
    private final char[] b;
    private final char[] c;

    public dbqz(char[] cArr, char[] cArr2) {
        this.b = cArr;
        this.c = cArr2;
        dbsk.a(cArr.length == cArr2.length);
        int i = 0;
        while (true) {
            int length = cArr.length;
            if (i < length) {
                dbsk.a(cArr[i] <= cArr2[i]);
                int i2 = i + 1;
                if (i2 < length) {
                    dbsk.a(cArr2[i] < cArr[i2]);
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.dbrb
    public final boolean b(char c) {
        int binarySearch = Arrays.binarySearch(this.b, c);
        if (binarySearch >= 0) {
            return true;
        }
        int i = (binarySearch ^ (-1)) - 1;
        return i >= 0 && c <= this.c[i];
    }

    public final String toString() {
        return this.a;
    }
}
