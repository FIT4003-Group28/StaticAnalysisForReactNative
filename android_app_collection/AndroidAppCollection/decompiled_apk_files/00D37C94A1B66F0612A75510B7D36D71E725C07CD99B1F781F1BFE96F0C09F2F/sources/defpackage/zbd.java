package defpackage;
/* compiled from: PG */
/* renamed from: zbd  reason: default package */
/* loaded from: classes4.dex */
public final class zbd implements zbb {
    public final int a;

    public zbd() {
    }

    public zbd(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zbd) && this.a == ((zbd) obj).a;
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("BookState{foldPositionX=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
