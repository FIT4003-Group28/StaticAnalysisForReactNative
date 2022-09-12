package defpackage;
/* compiled from: PG */
/* renamed from: crca  reason: default package */
/* loaded from: classes5.dex */
final class crca {
    private final String a;
    private final String b;

    public crca(String str, String str2) {
        this.b = str2;
        this.a = str;
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crca)) {
            return false;
        }
        crca crcaVar = (crca) obj;
        if (this.b.equals(crcaVar.b)) {
            return this.a.equals(crcaVar.a);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() + 32;
        return hashCode + (hashCode * 31) + this.b.hashCode();
    }
}
