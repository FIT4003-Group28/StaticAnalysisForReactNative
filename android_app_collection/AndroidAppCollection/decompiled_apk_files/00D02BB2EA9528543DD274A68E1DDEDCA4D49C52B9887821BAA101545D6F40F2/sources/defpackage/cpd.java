package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: cpd  reason: default package */
/* loaded from: classes5.dex */
final class cpd extends cpf {
    private final boolean a;
    private final boolean b;
    private final Locale c;

    public cpd(boolean z, boolean z2, Locale locale) {
        this.a = z;
        this.b = z2;
        this.c = locale;
    }

    @Override // defpackage.cpf
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.cpf
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.cpf
    public final Locale c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cpf) {
            cpf cpfVar = (cpf) obj;
            if (this.a == cpfVar.a() && this.b == cpfVar.b() && this.c.equals(cpfVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.b) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 73);
        sb.append("FormattedMoneyOptions{showCurrencySymbol=");
        sb.append(z);
        sb.append(", showCents=");
        sb.append(z2);
        sb.append(", locale=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
