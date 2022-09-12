package defpackage;
/* compiled from: PG */
/* renamed from: aeku  reason: default package */
/* loaded from: classes2.dex */
final class aeku extends aela {
    private final int a;
    private final aekz b;
    private final aekz c;

    public aeku(int i, aekz aekzVar, aekz aekzVar2) {
        this.a = i;
        this.b = aekzVar;
        this.c = aekzVar2;
    }

    @Override // defpackage.aela
    public final int a() {
        return this.a;
    }

    @Override // defpackage.aela
    public final aekz b() {
        return this.b;
    }

    @Override // defpackage.aela
    public final aekz c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aela) {
            aela aelaVar = (aela) obj;
            if (this.a == aelaVar.a() && this.b.equals(aelaVar.b()) && this.c.equals(aelaVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 104 + String.valueOf(valueOf2).length());
        sb.append("HotelDatepickersConfig{dateFormatFlags=");
        sb.append(i);
        sb.append(", checkInDatepickerConfig=");
        sb.append(valueOf);
        sb.append(", checkOutDatepickerConfig=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
