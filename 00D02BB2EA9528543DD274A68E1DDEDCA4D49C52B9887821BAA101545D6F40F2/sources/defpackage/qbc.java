package defpackage;

import com.google.android.filament.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: qbc  reason: default package */
/* loaded from: classes7.dex */
public final class qbc extends qdv {
    private final akqi a;
    private final List<String> b;
    private final int c;
    private final boolean d;
    private final int e;

    public qbc(@dzsi akqi akqiVar, List<String> list, int i, int i2, boolean z) {
        this.a = akqiVar;
        if (list != null) {
            this.b = list;
            this.c = i;
            this.e = i2;
            this.d = z;
            return;
        }
        throw new NullPointerException("Null queryTokens");
    }

    @Override // defpackage.qdv
    @dzsi
    public final akqi a() {
        return this.a;
    }

    @Override // defpackage.qdv
    public final List<String> b() {
        return this.b;
    }

    @Override // defpackage.qdv
    public final int c() {
        return this.c;
    }

    @Override // defpackage.qdv
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.qdv
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qdv) {
            qdv qdvVar = (qdv) obj;
            akqi akqiVar = this.a;
            if (akqiVar != null ? akqiVar.equals(qdvVar.a()) : qdvVar.a() == null) {
                if (this.b.equals(qdvVar.b()) && this.c == qdvVar.c() && this.e == qdvVar.e() && this.d == qdvVar.d()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        akqi akqiVar = this.a;
        return (((((((((akqiVar == null ? 0 : akqiVar.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ dopr.a(this.e)) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int i = this.c;
        String valueOf3 = String.valueOf(dopr.c(this.e));
        boolean z = this.d;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_tooltipFrameBackground + length2 + String.valueOf(valueOf3).length());
        sb.append("RequestParams{featureId=");
        sb.append(valueOf);
        sb.append(", queryTokens=");
        sb.append(valueOf2);
        sb.append(", numDepartures=");
        sb.append(i);
        sb.append(", departureTimeStrategy=");
        sb.append(valueOf3);
        sb.append(", isBusynessEnabled=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
