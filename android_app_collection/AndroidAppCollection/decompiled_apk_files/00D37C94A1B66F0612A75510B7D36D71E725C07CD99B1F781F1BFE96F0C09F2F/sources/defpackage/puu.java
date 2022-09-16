package defpackage;
/* compiled from: PG */
/* renamed from: puu  reason: default package */
/* loaded from: classes4.dex */
public final class puu {
    public final long a;
    public final long b;

    public puu(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof puu)) {
            return false;
        }
        puu puuVar = (puu) obj;
        return this.a == puuVar.a && this.b == puuVar.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
