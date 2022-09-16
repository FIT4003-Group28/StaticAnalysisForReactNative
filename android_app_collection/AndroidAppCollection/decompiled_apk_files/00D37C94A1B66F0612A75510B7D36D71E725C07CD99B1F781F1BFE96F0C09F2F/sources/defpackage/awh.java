package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: awh  reason: default package */
/* loaded from: classes2.dex */
final class awh {
    public final String a;
    public final boolean b;
    public final boolean c;

    public awh(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == awh.class) {
            awh awhVar = (awh) obj;
            if (TextUtils.equals(this.a, awhVar.a) && this.b == awhVar.b && this.c == awhVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((this.a.hashCode() + 31) * 31) + (true != this.b ? 1237 : 1231)) * 31;
        if (true == this.c) {
            i = 1231;
        }
        return hashCode + i;
    }
}
