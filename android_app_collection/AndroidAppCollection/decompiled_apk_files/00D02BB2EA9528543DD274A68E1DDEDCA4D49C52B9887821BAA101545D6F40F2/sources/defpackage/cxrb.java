package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: cxrb  reason: default package */
/* loaded from: classes5.dex */
public final class cxrb {
    public final int a;
    public final boolean b;
    public final int c;
    private final String d;

    public cxrb(cxra cxraVar) {
        this.a = cxraVar.a;
        this.b = cxraVar.b;
        this.d = cxraVar.c;
        this.c = cxraVar.d;
    }

    public static cxra a() {
        return new cxra();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cxrb) {
            cxrb cxrbVar = (cxrb) obj;
            if (TextUtils.equals(this.d, cxrbVar.d) && this.b == cxrbVar.b && this.a == cxrbVar.a && this.c == cxrbVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        String str = this.d;
        int i = this.a;
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 16);
        sb.append(str);
        sb.append(i);
        sb.append(z);
        return sb.toString();
    }
}
