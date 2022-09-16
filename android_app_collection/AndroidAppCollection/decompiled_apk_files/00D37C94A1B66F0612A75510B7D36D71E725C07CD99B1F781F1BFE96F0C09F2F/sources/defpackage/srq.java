package defpackage;
/* compiled from: PG */
/* renamed from: srq  reason: default package */
/* loaded from: classes4.dex */
public final class srq {
    public final Object a;

    public srq() {
    }

    public srq(Object obj) {
        this.a = obj;
    }

    public static srp a() {
        return new srp();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof srq)) {
            return false;
        }
        Object obj2 = this.a;
        Object obj3 = ((srq) obj).a;
        if (obj2 != null) {
            return obj2.equals(obj3);
        }
        return obj3 == null;
    }

    public final int hashCode() {
        Object obj = this.a;
        return (obj == null ? 0 : obj.hashCode()) ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
        sb.append("BottomSheetData{interactionLogger=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
