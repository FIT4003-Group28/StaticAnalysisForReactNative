package defpackage;
/* compiled from: PG */
/* renamed from: bgg  reason: default package */
/* loaded from: classes3.dex */
public final class bgg {
    public String a;
    public int b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgg)) {
            return false;
        }
        bgg bggVar = (bgg) obj;
        if (this.b == bggVar.b) {
            return this.a.equals(bggVar.a);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int i = this.b;
        bck.c(i);
        return (hashCode * 31) + i;
    }
}
