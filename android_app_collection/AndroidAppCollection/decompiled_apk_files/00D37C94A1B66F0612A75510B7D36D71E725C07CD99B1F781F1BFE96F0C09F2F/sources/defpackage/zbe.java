package defpackage;
/* compiled from: PG */
/* renamed from: zbe  reason: default package */
/* loaded from: classes4.dex */
public final class zbe implements zbb {
    public final int a;

    public zbe() {
    }

    public zbe(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zbe) && this.a == ((zbe) obj).a;
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(41);
        sb.append("ClamshellState{foldPositionY=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
