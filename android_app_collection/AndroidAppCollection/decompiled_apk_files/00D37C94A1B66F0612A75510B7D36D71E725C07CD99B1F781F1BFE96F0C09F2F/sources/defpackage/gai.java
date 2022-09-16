package defpackage;
/* compiled from: PG */
/* renamed from: gai  reason: default package */
/* loaded from: classes3.dex */
final class gai extends gar {
    private final int a;
    private final int b;

    public gai(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.gar
    public int a() {
        return this.b;
    }

    @Override // defpackage.gar
    public int b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gar) {
            gar garVar = (gar) obj;
            if (this.a == garVar.b() && this.b == garVar.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public String toString() {
        int i = this.a;
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(76);
        sb.append("ActivePaneChangedEvent{previousPane=");
        sb.append(i);
        sb.append(", navigationType=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
