package defpackage;
/* compiled from: PG */
/* renamed from: fgy  reason: default package */
/* loaded from: classes3.dex */
final class fgy extends fhf {
    private final boolean a;

    public fgy(boolean z) {
        this.a = z;
    }

    @Override // defpackage.fhf
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof fhf) && this.a == ((fhf) obj).a();
    }

    public int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public String toString() {
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(48);
        sb.append("SwipeRefreshEvent{wasSectionListRefreshed=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
