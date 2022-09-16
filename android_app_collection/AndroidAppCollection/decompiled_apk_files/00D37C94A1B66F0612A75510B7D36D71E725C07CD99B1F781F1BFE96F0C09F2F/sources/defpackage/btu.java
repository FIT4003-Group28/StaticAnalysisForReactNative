package defpackage;
/* compiled from: PG */
/* renamed from: btu  reason: default package */
/* loaded from: classes2.dex */
public final class btu {
    public final String a;
    public final Long b;

    public btu(String str, long j) {
        this.a = str;
        this.b = Long.valueOf(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btu)) {
            return false;
        }
        btu btuVar = (btu) obj;
        if (this.a.equals(btuVar.a)) {
            return this.b.equals(btuVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
