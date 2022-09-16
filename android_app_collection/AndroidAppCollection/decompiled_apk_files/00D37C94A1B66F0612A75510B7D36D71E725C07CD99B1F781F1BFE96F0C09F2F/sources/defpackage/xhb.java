package defpackage;
/* compiled from: PG */
/* renamed from: xhb  reason: default package */
/* loaded from: classes4.dex */
public final class xhb {
    private Boolean a;
    private Boolean b;
    private Boolean c;
    private Boolean d;
    private Boolean e;
    private apnr f;
    private int g;

    public final void b(int i) {
        if (i != 0) {
            this.g = i;
            return;
        }
        throw new NullPointerException("Null activeButton");
    }

    public final void c(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    public final void d(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    public final void e(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    public final void f(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    public final void g(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    public final void h(apnr apnrVar) {
        if (apnrVar != null) {
            this.f = apnrVar;
            return;
        }
        throw new NullPointerException("Null renderer");
    }

    public final xhc a() {
        Boolean bool = this.a;
        if (bool == null || this.b == null || this.c == null || this.d == null || this.e == null || this.g == 0 || this.f == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" hidden");
            }
            if (this.b == null) {
                sb.append(" enabled");
            }
            if (this.c == null) {
                sb.append(" annotationEnabled");
            }
            if (this.d == null) {
                sb.append(" appPromoEnabled");
            }
            if (this.e == null) {
                sb.append(" fullscreen");
            }
            if (this.g == 0) {
                sb.append(" activeButton");
            }
            if (this.f == null) {
                sb.append(" renderer");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new xhc(bool.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.g, this.f);
    }
}
