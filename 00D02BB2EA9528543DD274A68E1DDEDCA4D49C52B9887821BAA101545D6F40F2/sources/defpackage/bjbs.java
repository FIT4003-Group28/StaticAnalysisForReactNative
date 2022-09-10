package defpackage;
/* compiled from: PG */
/* renamed from: bjbs  reason: default package */
/* loaded from: classes3.dex */
public final class bjbs {
    public String a;
    public gfw b;
    private Boolean c;
    private Boolean d;
    private Boolean e;
    private Boolean f;
    private dqcj g;

    public final void b(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    public final void c(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    public final void d(dqcj dqcjVar) {
        if (dqcjVar != null) {
            this.g = dqcjVar;
            return;
        }
        throw new NullPointerException("Null entryPoint");
    }

    public final void e(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    public final void f(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    public final bjbv a() {
        String str = this.c == null ? " enableAnswerInput" : "";
        if (this.d == null) {
            str = str.concat(" skipPostContributionThanksPage");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" showPlaceSnippet");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" closeAfterAnsweringQuestion");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" entryPoint");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bjbt(this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.a, this.b, this.g);
    }
}
