package defpackage;
/* compiled from: PG */
/* renamed from: bfr  reason: default package */
/* loaded from: classes3.dex */
public final class bfr {
    public final String a;
    public final Long b;

    public bfr(String str, long j) {
        this.a = str;
        this.b = Long.valueOf(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfr)) {
            return false;
        }
        bfr bfrVar = (bfr) obj;
        if (this.a.equals(bfrVar.a)) {
            return this.b.equals(bfrVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
