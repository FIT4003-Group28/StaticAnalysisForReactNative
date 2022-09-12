package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: dxii  reason: default package */
/* loaded from: classes6.dex */
public final class dxii {
    private final String[] a;

    public dxii(dxih dxihVar) {
        List<String> list = dxihVar.a;
        this.a = (String[]) list.toArray(new String[list.size()]);
    }

    public final int a() {
        return this.a.length >> 1;
    }

    public final String b(int i) {
        int i2 = i + i;
        if (i2 >= 0) {
            String[] strArr = this.a;
            if (i2 < strArr.length) {
                return strArr[i2];
            }
            return null;
        }
        return null;
    }

    public final String c(int i) {
        int i2 = i + i + 1;
        if (i2 >= 0) {
            String[] strArr = this.a;
            if (i2 < strArr.length) {
                return strArr[i2];
            }
            return null;
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int a = a();
        for (int i = 0; i < a; i++) {
            sb.append(b(i));
            sb.append(": ");
            sb.append(c(i));
            sb.append("\n");
        }
        return sb.toString();
    }
}
