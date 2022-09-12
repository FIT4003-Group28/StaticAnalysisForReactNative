package defpackage;
/* compiled from: PG */
/* renamed from: bsnl  reason: default package */
/* loaded from: classes4.dex */
final class bsnl extends bsno {
    private final int a;

    public bsnl(int i) {
        this.a = i;
    }

    @Override // defpackage.bsno
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof bsno) && this.a == ((bsno) obj).a();
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(61);
        sb.append("CreateResultForCardIndexEvent{traversalCardIndex=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
