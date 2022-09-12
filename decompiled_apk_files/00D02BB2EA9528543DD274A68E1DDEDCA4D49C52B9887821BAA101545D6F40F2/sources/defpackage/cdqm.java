package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: cdqm  reason: default package */
/* loaded from: classes4.dex */
final class cdqm extends cdrs {
    public dbsg<Locale> a;
    private String b;
    private dbsg<String> c;
    private dbsg<String> d;
    private Boolean e;
    private Boolean f;

    public cdqm() {
        this.c = dbpy.a;
        this.a = dbpy.a;
        this.d = dbpy.a;
    }

    public cdqm(cdrt cdrtVar) {
        this.c = dbpy.a;
        this.a = dbpy.a;
        this.d = dbpy.a;
        cdqn cdqnVar = (cdqn) cdrtVar;
        this.b = cdqnVar.a;
        this.c = cdqnVar.b;
        this.a = cdqnVar.c;
        this.d = cdqnVar.d;
        this.e = Boolean.valueOf(cdqnVar.e);
        this.f = Boolean.valueOf(cdqnVar.f);
    }

    @Override // defpackage.cdrs
    public final void b(String str) {
        this.d = dbsg.i(str);
    }

    @Override // defpackage.cdrs
    public final void c(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null originalText");
    }

    @Override // defpackage.cdrs
    public final void d(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    @Override // defpackage.cdrs
    public final void e(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    @Override // defpackage.cdrs
    public final void f(String str) {
        this.c = dbsg.i(str);
    }

    @Override // defpackage.cdrs
    public final cdrt a() {
        String str = this.b == null ? " originalText" : "";
        if (this.e == null) {
            str = str.concat(" showTranslatedTextFirst");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" showTranslation");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cdqn(this.b, this.c, this.a, this.d, this.e.booleanValue(), this.f.booleanValue());
    }
}
