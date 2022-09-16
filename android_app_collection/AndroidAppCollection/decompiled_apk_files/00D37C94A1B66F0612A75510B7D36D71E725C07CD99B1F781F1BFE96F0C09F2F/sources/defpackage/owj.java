package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: owj  reason: default package */
/* loaded from: classes4.dex */
public final class owj {
    public final long a;
    public final long b;
    private final String c;
    private int d;

    public owj(String str, long j, long j2) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public final Uri a(String str) {
        return Uri.parse(pcw.a(str, this.c));
    }

    public final String b(String str) {
        return pcw.a(str, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            owj owjVar = (owj) obj;
            if (this.a == owjVar.a && this.b == owjVar.b && this.c.equals(owjVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        if (i == 0) {
            int hashCode = ((((((int) this.a) + 527) * 31) + ((int) this.b)) * 31) + this.c.hashCode();
            this.d = hashCode;
            return hashCode;
        }
        return i;
    }
}
