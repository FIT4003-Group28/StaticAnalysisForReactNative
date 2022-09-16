package defpackage;
/* compiled from: PG */
/* renamed from: aoxb  reason: default package */
/* loaded from: classes2.dex */
final class aoxb extends aoxp {
    private final String a;

    public aoxb(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    @Override // defpackage.aoxp
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aoxp)) {
            return false;
        }
        return this.a.equals(((aoxp) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
