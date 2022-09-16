package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: ceu  reason: default package */
/* loaded from: classes2.dex */
public final class ceu {
    public final String a;
    public final String b;

    public ceu(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ceu ceuVar = (ceu) obj;
            if (TextUtils.equals(this.a, ceuVar.a) && TextUtils.equals(this.b, ceuVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length());
        sb.append("Header[name=");
        sb.append(str);
        sb.append(",value=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
