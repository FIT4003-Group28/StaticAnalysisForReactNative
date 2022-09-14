package defpackage;
/* compiled from: PG */
/* renamed from: bfu  reason: default package */
/* loaded from: classes3.dex */
public final class bfu {
    public final String a;
    public final int b;

    public bfu(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfu)) {
            return false;
        }
        bfu bfuVar = (bfu) obj;
        if (this.b == bfuVar.b) {
            return this.a.equals(bfuVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
