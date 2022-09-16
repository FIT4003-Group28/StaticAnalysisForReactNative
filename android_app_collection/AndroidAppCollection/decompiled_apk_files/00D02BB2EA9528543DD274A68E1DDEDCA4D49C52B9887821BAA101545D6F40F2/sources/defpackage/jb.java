package defpackage;

import android.content.LocusId;
import android.os.Build;
/* compiled from: PG */
/* renamed from: jb  reason: default package */
/* loaded from: classes7.dex */
public final class jb {
    public final String a;
    public final LocusId b;

    public jb(String str) {
        nb.d(str);
        this.a = str;
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = new LocusId(str);
        } else {
            this.b = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.a;
        String str2 = ((jb) obj).a;
        return str == null ? str2 == null : str.equals(str2);
    }

    public final int hashCode() {
        String str = this.a;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LocusIdCompat[");
        int length = this.a.length();
        sb.append(length + "_chars");
        sb.append("]");
        return sb.toString();
    }
}
