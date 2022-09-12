package defpackage;
/* compiled from: PG */
/* renamed from: qhm  reason: default package */
/* loaded from: classes7.dex */
final class qhm extends qic {
    private final dgas a;
    private final String b;

    public qhm(dgas dgasVar, @dzsi String str) {
        if (dgasVar != null) {
            this.a = dgasVar;
            this.b = str;
            return;
        }
        throw new NullPointerException("Null duration");
    }

    @Override // defpackage.qic
    public final dgas a() {
        return this.a;
    }

    @Override // defpackage.qic
    @dzsi
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qic) {
            qic qicVar = (qic) obj;
            if (this.a.equals(qicVar.a()) && ((str = this.b) != null ? str.equals(qicVar.b()) : qicVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        dgas dgasVar = this.a;
        int i = dgasVar.bC;
        if (i == 0) {
            i = dsst.a.b(dgasVar).c(dgasVar);
            dgasVar.bC = i;
        }
        int i2 = (i ^ 1000003) * 1000003;
        String str = this.b;
        return (str == null ? 0 : str.hashCode()) ^ i2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30 + String.valueOf(str).length());
        sb.append("WalkingLeg{duration=");
        sb.append(valueOf);
        sb.append(", iconId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
