package defpackage;
/* compiled from: PG */
/* renamed from: cqoa  reason: default package */
/* loaded from: classes5.dex */
final class cqoa extends cqow {
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    public cqoa(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // defpackage.cqow
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cqow
    public final int b() {
        return this.b;
    }

    @Override // defpackage.cqow
    public final int c() {
        return this.c;
    }

    @Override // defpackage.cqow
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqow) {
            cqow cqowVar = (cqow) obj;
            if (this.a == cqowVar.a() && this.b == cqowVar.b() && this.c == cqowVar.c() && this.d == cqowVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        StringBuilder sb = new StringBuilder(91);
        sb.append("Connect{startId=");
        sb.append(i);
        sb.append(", startSide=");
        sb.append(i2);
        sb.append(", endId=");
        sb.append(i3);
        sb.append(", endSide=");
        sb.append(i4);
        sb.append("}");
        return sb.toString();
    }
}
