package defpackage;
/* compiled from: PG */
/* renamed from: xgx  reason: default package */
/* loaded from: classes4.dex */
public final class xgx {
    private apoj a;
    private Boolean b;
    private Boolean c;
    private Boolean d;
    private Boolean e;

    public final void b(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    public final void c(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    public final void d(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    public final void e(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    public final void f(apoj apojVar) {
        if (apojVar != null) {
            this.a = apojVar;
            return;
        }
        throw new NullPointerException("Null renderer");
    }

    public final xgy a() {
        Boolean bool;
        apoj apojVar = this.a;
        if (apojVar == null || (bool = this.b) == null || this.c == null || this.d == null || this.e == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" renderer");
            }
            if (this.b == null) {
                sb.append(" enabled");
            }
            if (this.c == null) {
                sb.append(" fullscreen");
            }
            if (this.d == null) {
                sb.append(" annotationEnabled");
            }
            if (this.e == null) {
                sb.append(" appPromoEnabled");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new xgy(apojVar, bool.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue());
    }
}
