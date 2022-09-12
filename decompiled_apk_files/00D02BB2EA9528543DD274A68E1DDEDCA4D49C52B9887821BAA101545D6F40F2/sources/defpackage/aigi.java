package defpackage;

import com.google.android.filament.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aigi  reason: default package */
/* loaded from: classes2.dex */
public final class aigi extends aijy {
    private final btlu a;
    private final eapd b;
    private final eapd c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    public aigi(@dzsi btlu btluVar, eapd eapdVar, eapd eapdVar2, boolean z, boolean z2, boolean z3) {
        this.a = btluVar;
        this.b = eapdVar;
        this.c = eapdVar2;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    @Override // defpackage.aijy
    @dzsi
    public final btlu a() {
        return this.a;
    }

    @Override // defpackage.aijy
    public final eapd b() {
        return this.b;
    }

    @Override // defpackage.aijy
    public final eapd c() {
        return this.c;
    }

    @Override // defpackage.aijy
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.aijy
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aijy) {
            aijy aijyVar = (aijy) obj;
            btlu btluVar = this.a;
            if (btluVar != null ? btluVar.equals(aijyVar.a()) : aijyVar.a() == null) {
                if (this.b.equals(aijyVar.b()) && this.c.equals(aijyVar.c()) && this.d == aijyVar.d() && this.e == aijyVar.e() && this.f == aijyVar.f()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.aijy
    public final boolean f() {
        return this.f;
    }

    public final int hashCode() {
        btlu btluVar = this.a;
        int i = 1237;
        int hashCode = ((((((((((btluVar == null ? 0 : btluVar.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003;
        if (true == this.f) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        boolean z = this.d;
        boolean z2 = this.e;
        boolean z3 = this.f;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu + length2 + String.valueOf(valueOf3).length());
        sb.append("HistoricalRecord{account=");
        sb.append(valueOf);
        sb.append(", startTime=");
        sb.append(valueOf2);
        sb.append(", completionTime=");
        sb.append(valueOf3);
        sb.append(", succeeded=");
        sb.append(z);
        sb.append(", cancelled=");
        sb.append(z2);
        sb.append(", forceRefresh=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }
}
