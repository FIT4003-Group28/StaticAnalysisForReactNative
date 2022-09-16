package defpackage;
/* compiled from: PG */
/* renamed from: buk  reason: default package */
/* loaded from: classes2.dex */
public final class buk {
    public String a;
    public int b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof buk)) {
            return false;
        }
        buk bukVar = (buk) obj;
        if (this.b == bukVar.b) {
            return this.a.equals(bukVar.a);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int i = this.b;
        adz.f(i);
        return (hashCode * 31) + i;
    }
}
