package defpackage;
/* compiled from: PG */
/* renamed from: bmtc  reason: default package */
/* loaded from: classes3.dex */
public final class bmtc extends bmth {
    private final eapg a;
    private final dcdc<Double> b;

    public bmtc(eapg eapgVar, dcdc<Double> dcdcVar) {
        if (eapgVar != null) {
            this.a = eapgVar;
            if (dcdcVar != null) {
                this.b = dcdcVar;
                return;
            }
            throw new NullPointerException("Null labelSizes");
        }
        throw new NullPointerException("Null day");
    }

    @Override // defpackage.bmth
    public final eapg a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bmth
    public final dcdc<Double> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bmth) {
            bmth bmthVar = (bmth) obj;
            if (this.a.equals(bmthVar.a()) && dchl.m(this.b, bmthVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27 + String.valueOf(valueOf2).length());
        sb.append("DayWidth{day=");
        sb.append(valueOf);
        sb.append(", labelSizes=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
