package defpackage;
/* compiled from: PG */
/* renamed from: aofv  reason: default package */
/* loaded from: classes2.dex */
public final class aofv extends aogk {
    private final int a;
    private final boolean b;

    public aofv(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.aogk
    public final int a() {
        return this.a;
    }

    @Override // defpackage.aogk
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aogk) {
            aogk aogkVar = (aogk) obj;
            if (this.a == aogkVar.a() && this.b == aogkVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.a;
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(38);
        sb.append("Edge{color=");
        sb.append(i);
        sb.append(", ghosted=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
