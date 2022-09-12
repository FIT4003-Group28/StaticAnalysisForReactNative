package defpackage;
/* compiled from: PG */
/* renamed from: bwon  reason: default package */
/* loaded from: classes4.dex */
final class bwon extends bwoo {
    private final Integer a;
    private final Integer b;

    public bwon(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    @Override // defpackage.bwoo
    public final Integer a() {
        return this.a;
    }

    @Override // defpackage.bwoo
    public final Integer b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bwoo) {
            bwoo bwooVar = (bwoo) obj;
            if (this.a.equals(bwooVar.a()) && this.b.equals(bwooVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34 + String.valueOf(valueOf2).length());
        sb.append("ButtonContents{stringId=");
        sb.append(valueOf);
        sb.append(", iconId=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
