package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: avf  reason: default package */
/* loaded from: classes2.dex */
public final class avf {
    public final long a;
    public final long b;
    private final String c;
    private int d;

    public avf(String str, long j, long j2) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public final Uri a(String str) {
        return Uri.parse(poa.b(str, this.c));
    }

    public final avf b(avf avfVar, String str) {
        String c = c(str);
        if (avfVar != null && c.equals(avfVar.c(str))) {
            long j = this.b;
            long j2 = -1;
            if (j != -1) {
                long j3 = this.a;
                if (j3 + j == avfVar.a) {
                    long j4 = avfVar.b;
                    if (j4 != -1) {
                        j2 = j + j4;
                    }
                    return new avf(c, j3, j2);
                }
            }
            long j5 = avfVar.b;
            if (j5 != -1) {
                long j6 = avfVar.a;
                if (j6 + j5 == this.a) {
                    if (j != -1) {
                        j2 = j5 + j;
                    }
                    return new avf(c, j6, j2);
                }
            }
        }
        return null;
    }

    public final String c(String str) {
        return poa.b(str, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            avf avfVar = (avf) obj;
            if (this.a == avfVar.a && this.b == avfVar.b && this.c.equals(avfVar.c)) {
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

    public final String toString() {
        String str = this.c;
        long j = this.a;
        long j2 = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 81);
        sb.append("RangedUri(referenceUri=");
        sb.append(str);
        sb.append(", start=");
        sb.append(j);
        sb.append(", length=");
        sb.append(j2);
        sb.append(")");
        return sb.toString();
    }
}
