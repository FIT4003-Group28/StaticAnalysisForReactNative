package defpackage;
/* compiled from: PG */
/* renamed from: azvk  reason: default package */
/* loaded from: classes3.dex */
public final class azvk extends azxb {
    public final String a;
    private final akqi b;
    private final akqq c;
    private final dpuk d;
    private final String e;

    public azvk(akqi akqiVar, @dzsi akqq akqqVar, String str, dpuk dpukVar, String str2) {
        if (akqiVar != null) {
            this.b = akqiVar;
            this.c = akqqVar;
            if (str != null) {
                this.a = str;
                if (dpukVar != null) {
                    this.d = dpukVar;
                    if (str2 != null) {
                        this.e = str2;
                        return;
                    }
                    throw new NullPointerException("Null dealId");
                }
                throw new NullPointerException("Null experienceType");
            }
            throw new NullPointerException("Null mid");
        }
        throw new NullPointerException("Null featureId");
    }

    @Override // defpackage.azxb
    public final akqi a() {
        return this.b;
    }

    @Override // defpackage.azxb
    @dzsi
    public final akqq b() {
        return this.c;
    }

    @Override // defpackage.azxb
    public final String c() {
        return this.a;
    }

    @Override // defpackage.azxb
    public final dpuk d() {
        return this.d;
    }

    @Override // defpackage.azxb
    public final String e() {
        return this.e;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String str = this.a;
        String valueOf3 = String.valueOf(this.d);
        String str2 = this.e;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = str.length();
        StringBuilder sb = new StringBuilder(length + 68 + length2 + length3 + String.valueOf(valueOf3).length() + str2.length());
        sb.append("PlaceIdentifier{featureId=");
        sb.append(valueOf);
        sb.append(", latLng=");
        sb.append(valueOf2);
        sb.append(", mid=");
        sb.append(str);
        sb.append(", experienceType=");
        sb.append(valueOf3);
        sb.append(", dealId=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
