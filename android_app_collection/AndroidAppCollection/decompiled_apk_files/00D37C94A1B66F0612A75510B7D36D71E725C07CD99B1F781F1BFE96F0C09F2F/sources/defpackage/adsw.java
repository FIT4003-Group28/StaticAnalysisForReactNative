package defpackage;
/* compiled from: PG */
/* renamed from: adsw  reason: default package */
/* loaded from: classes.dex */
public final class adsw {
    public final adil a;
    public final adip b;
    public final adim c;
    public final boolean d;
    public final adnb e;
    public final String f;

    public adsw() {
    }

    public adsw(adil adilVar, adip adipVar, adim adimVar, boolean z, adnb adnbVar, String str) {
        this.a = adilVar;
        this.b = adipVar;
        this.c = adimVar;
        this.d = z;
        this.e = adnbVar;
        this.f = str;
    }

    public final boolean a() {
        return this.a != null;
    }

    public final boolean b() {
        return this.b != null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adsw) {
            adsw adswVar = (adsw) obj;
            adil adilVar = this.a;
            if (adilVar != null ? adilVar.equals(adswVar.a) : adswVar.a == null) {
                adip adipVar = this.b;
                if (adipVar != null ? adipVar.equals(adswVar.b) : adswVar.b == null) {
                    adim adimVar = this.c;
                    if (adimVar != null ? adimVar.equals(adswVar.c) : adswVar.c == null) {
                        if (this.d == adswVar.d && this.e.equals(adswVar.e) && this.f.equals(adswVar.f)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        adil adilVar = this.a;
        int i = 0;
        int hashCode = ((adilVar == null ? 0 : adilVar.hashCode()) ^ 1000003) * 1000003;
        adip adipVar = this.b;
        int hashCode2 = (hashCode ^ (adipVar == null ? 0 : adipVar.hashCode())) * 1000003;
        adim adimVar = this.c;
        if (adimVar != null) {
            i = adimVar.hashCode();
        }
        return ((((((hashCode2 ^ i) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        boolean z = this.d;
        String valueOf4 = String.valueOf(this.e);
        String str = this.f;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 106 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(str).length());
        sb.append("ConnectionProperties{method=");
        sb.append(valueOf);
        sb.append(", params=");
        sb.append(valueOf2);
        sb.append(", pairingType=");
        sb.append(valueOf3);
        sb.append(", userInitiated=");
        sb.append(z);
        sb.append(", loungeTokenProvider=");
        sb.append(valueOf4);
        sb.append(", magmaKey=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
