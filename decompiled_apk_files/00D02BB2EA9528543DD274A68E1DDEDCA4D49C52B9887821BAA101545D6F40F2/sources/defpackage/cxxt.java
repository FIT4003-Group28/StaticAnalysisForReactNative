package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: cxxt  reason: default package */
/* loaded from: classes5.dex */
final class cxxt extends cxzu {
    private final boolean a;
    private final dcep<cygg> b;
    private final dcdc<cydx> c;
    private final Integer d;
    private final int e;

    public cxxt(boolean z, dcep<cygg> dcepVar, dcdc<cydx> dcdcVar, int i, Integer num) {
        this.a = z;
        this.b = dcepVar;
        this.c = dcdcVar;
        this.e = i;
        this.d = num;
    }

    @Override // defpackage.cxzu
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.cxzu
    public final dcep<cygg> b() {
        return this.b;
    }

    @Override // defpackage.cxzu
    public final dcdc<cydx> c() {
        return this.c;
    }

    @Override // defpackage.cxzu
    public final Integer d() {
        return this.d;
    }

    @Override // defpackage.cxzu
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cxzu) {
            cxzu cxzuVar = (cxzu) obj;
            if (this.a == cxzuVar.a() && this.b.equals(cxzuVar.b()) && dchl.m(this.c, cxzuVar.c())) {
                int i = this.e;
                int e = cxzuVar.e();
                if (i == 0) {
                    throw null;
                }
                if (i == e && this.d.equals(cxzuVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        int i = this.e;
        if (i != 0) {
            return ((hashCode ^ i) * 1000003) ^ this.d.hashCode();
        }
        throw null;
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        int i = this.e;
        String str = i != 1 ? i != 2 ? i != 3 ? "null" : "DID_NOT_WAIT_FOR_NETWORK_CALL" : "WAITED_FOR_NETWORK_CALL" : "UNKNOWN";
        String valueOf3 = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu + String.valueOf(valueOf2).length() + str.length() + String.valueOf(valueOf3).length());
        sb.append("PeopleLookupMetadata{isLastCallback=");
        sb.append(z);
        sb.append(", notFoundIds=");
        sb.append(valueOf);
        sb.append(", errors=");
        sb.append(valueOf2);
        sb.append(", callbackDelayStatus=");
        sb.append(str);
        sb.append(", numberSentToNetwork=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
