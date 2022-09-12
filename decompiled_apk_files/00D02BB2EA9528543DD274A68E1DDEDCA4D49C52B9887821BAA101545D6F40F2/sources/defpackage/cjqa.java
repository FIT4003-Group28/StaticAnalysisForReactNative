package defpackage;
/* compiled from: PG */
/* renamed from: cjqa  reason: default package */
/* loaded from: classes4.dex */
final class cjqa extends cjqf {
    private final jjn a;
    private final jjn b;
    private final Integer c;

    public cjqa(jjn jjnVar, jjn jjnVar2, @dzsi Integer num) {
        this.a = jjnVar;
        this.b = jjnVar2;
        this.c = num;
    }

    @Override // defpackage.cjqf
    public final jjn a() {
        return this.a;
    }

    @Override // defpackage.cjqf
    public final jjn b() {
        return this.b;
    }

    @Override // defpackage.cjqf
    @dzsi
    public final dqvj c() {
        return null;
    }

    @Override // defpackage.cjqf
    @dzsi
    public final dqvj d() {
        return null;
    }

    @Override // defpackage.cjqf
    @dzsi
    public final Integer e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cjqf) {
            cjqf cjqfVar = (cjqf) obj;
            if (this.a.equals(cjqfVar.a()) && this.b.equals(cjqfVar.b()) && cjqfVar.c() == null && cjqfVar.d() == null && ((num = this.c) != null ? num.equals(cjqfVar.e()) : cjqfVar.e() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 583896283;
        Integer num = this.c;
        return hashCode ^ (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = "null".length();
        StringBuilder sb = new StringBuilder(length + 92 + length2 + length3 + "null".length() + String.valueOf(valueOf3).length());
        sb.append("PlaceSheetParamsHelper{startState=");
        sb.append(valueOf);
        sb.append(", endState=");
        sb.append(valueOf2);
        sb.append(", previousTravelMode=");
        sb.append("null");
        sb.append(", nextTravelMode=");
        sb.append("null");
        sb.append(", index=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
