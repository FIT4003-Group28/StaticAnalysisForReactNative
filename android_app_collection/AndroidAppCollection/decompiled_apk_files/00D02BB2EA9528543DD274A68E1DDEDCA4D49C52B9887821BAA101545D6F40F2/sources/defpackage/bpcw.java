package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bpcw  reason: default package */
/* loaded from: classes3.dex */
public final class bpcw extends bpdh {
    private final boolean a;
    private final eaol b;
    private final eaol c;

    public bpcw(boolean z, eaol eaolVar, eaol eaolVar2) {
        this.a = z;
        if (eaolVar != null) {
            this.b = eaolVar;
            if (eaolVar2 != null) {
                this.c = eaolVar2;
                return;
            }
            throw new NullPointerException("Null endDateTime");
        }
        throw new NullPointerException("Null startDateTime");
    }

    @Override // defpackage.bpdh
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.bpdh
    public final eaol b() {
        return this.b;
    }

    @Override // defpackage.bpdh
    public final eaol c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bpdh) {
            bpdh bpdhVar = (bpdh) obj;
            if (this.a == bpdhVar.a() && this.b.equals(bpdhVar.b()) && this.c.equals(bpdhVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 73 + String.valueOf(valueOf2).length());
        sb.append("RoadClosedScheduleResult{isClosedNow=");
        sb.append(z);
        sb.append(", startDateTime=");
        sb.append(valueOf);
        sb.append(", endDateTime=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
