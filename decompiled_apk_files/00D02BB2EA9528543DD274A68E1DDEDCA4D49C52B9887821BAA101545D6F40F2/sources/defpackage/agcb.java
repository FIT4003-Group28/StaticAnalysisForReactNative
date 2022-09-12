package defpackage;
/* compiled from: PG */
/* renamed from: agcb  reason: default package */
/* loaded from: classes2.dex */
final class agcb extends aggn {
    private final int a;

    public agcb(int i) {
        this.a = i;
    }

    @Override // defpackage.aggn
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof aggn) && this.a == ((aggn) obj).a();
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(55);
        sb.append("Options{bottomPaddingDpOfProgressIndicator=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
