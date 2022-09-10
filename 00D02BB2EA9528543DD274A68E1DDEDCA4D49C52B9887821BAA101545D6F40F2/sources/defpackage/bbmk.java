package defpackage;
/* compiled from: PG */
/* renamed from: bbmk  reason: default package */
/* loaded from: classes3.dex */
public final class bbmk extends bbmn {
    public final dpot a;
    private final dcdc<bbmo> d;

    public bbmk(dpot dpotVar, dcdc<bbmo> dcdcVar) {
        if (dpotVar != null) {
            this.a = dpotVar;
            if (dcdcVar != null) {
                this.d = dcdcVar;
                return;
            }
            throw new NullPointerException("Null items");
        }
        throw new NullPointerException("Null proto");
    }

    @Override // defpackage.bbmn
    public final dpot a() {
        return this.a;
    }

    @Override // defpackage.bbmn
    public final dcdc<bbmo> b() {
        return this.d;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35 + String.valueOf(valueOf2).length());
        sb.append("PersonalizationList{proto=");
        sb.append(valueOf);
        sb.append(", items=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
