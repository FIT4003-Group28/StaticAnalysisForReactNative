package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: cmbi  reason: default package */
/* loaded from: classes5.dex */
final class cmbi {
    public final String a;
    public final boolean b;
    public final boolean c;

    public cmbi(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == cmbi.class) {
            cmbi cmbiVar = (cmbi) obj;
            if (TextUtils.equals(this.a, cmbiVar.a) && this.b == cmbiVar.b && this.c == cmbiVar.c) {
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
