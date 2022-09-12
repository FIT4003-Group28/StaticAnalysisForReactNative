package defpackage;
/* compiled from: PG */
/* renamed from: alcm  reason: default package */
/* loaded from: classes2.dex */
final class alcm extends aleb {
    private final int a;
    private final int b;
    private final int c;

    public alcm(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // defpackage.aleb
    public final int a() {
        return this.a;
    }

    @Override // defpackage.aleb
    public final int b() {
        return this.b;
    }

    @Override // defpackage.aleb
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aleb) {
            aleb alebVar = (aleb) obj;
            if (this.a == alebVar.a() && this.b == alebVar.b() && this.c == alebVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        String str = this.c != 1 ? "INTERMEDIATE" : "LEADING";
        StringBuilder sb = new StringBuilder(str.length() + 70);
        sb.append("TransitStopInfo{strokeColor=");
        sb.append(i);
        sb.append(", drawOrder=");
        sb.append(i2);
        sb.append(", type=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
