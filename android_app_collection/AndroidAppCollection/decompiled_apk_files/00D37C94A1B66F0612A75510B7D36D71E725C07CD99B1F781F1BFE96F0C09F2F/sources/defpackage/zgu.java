package defpackage;

import android.text.TextUtils;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: zgu  reason: default package */
/* loaded from: classes4.dex */
public final class zgu implements Comparable {
    public static final zgu a = new zgu(null);
    private final String b;
    private String[] c;
    private int[] d;

    public zgu(String str) {
        String str2 = "";
        String replaceAll = str == null ? str2 : str.replaceAll("\\.?[^0-9.].*", str2);
        String[] split = TextUtils.split(replaceAll, "\\.");
        this.c = split;
        this.d = new int[split.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.c;
            if (i2 >= strArr.length) {
                break;
            }
            this.d[i2] = Integer.parseInt(strArr[i2]);
            i2++;
        }
        str2 = str != null ? str.substring(replaceAll.length()) : str2;
        String[] strArr2 = new String[3];
        while (i < 3) {
            String[] strArr3 = this.c;
            strArr2[i] = i < strArr3.length ? strArr3[i] : "0";
            i++;
        }
        String valueOf = String.valueOf(TextUtils.join(".", strArr2));
        String valueOf2 = String.valueOf(str2);
        this.b = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(zgu zguVar) {
        int[] b = b();
        int[] b2 = zguVar.b();
        int min = Math.min(b.length, b2.length);
        for (int i = 0; i < min; i++) {
            int i2 = b[i] - b2[i];
            if (i2 != 0) {
                return i2;
            }
        }
        return b.length - b2.length;
    }

    public final int[] b() {
        int[] iArr;
        int length;
        int i = 0;
        int i2 = 0;
        while (true) {
            iArr = this.d;
            length = iArr.length;
            if (i >= length) {
                break;
            }
            if (iArr[i] != 0) {
                i2 = i;
            }
            i++;
        }
        int i3 = i2 + 1;
        return i3 == length ? iArr : Arrays.copyOfRange(iArr, 0, i3);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zgu) && Arrays.equals(b(), ((zgu) obj).b());
    }

    public final int hashCode() {
        return Arrays.hashCode(b()) + 527;
    }

    public final String toString() {
        return this.b;
    }
}
