package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: cpc  reason: default package */
/* loaded from: classes5.dex */
final class cpc extends cpe {
    public Locale a;
    private Boolean b;
    private Boolean c;

    @Override // defpackage.cpe
    public final void b(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // defpackage.cpe
    public final void c(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    @Override // defpackage.cpe
    public final cpf a() {
        String str = this.b == null ? " showCurrencySymbol" : "";
        if (this.c == null) {
            str = str.concat(" showCents");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" locale");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cpd(this.b.booleanValue(), this.c.booleanValue(), this.a);
    }
}
