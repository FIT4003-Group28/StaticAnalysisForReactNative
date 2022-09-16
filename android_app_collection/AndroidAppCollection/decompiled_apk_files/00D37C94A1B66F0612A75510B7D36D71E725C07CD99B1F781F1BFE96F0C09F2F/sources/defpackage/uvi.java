package defpackage;
/* compiled from: PG */
/* renamed from: uvi  reason: default package */
/* loaded from: classes4.dex */
public final class uvi {
    public String a;
    public azzk b;
    public String c;
    public Long d;
    public utu e;
    private Boolean f;
    private baax g;
    private Boolean h;

    public final void b(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    public final void c(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    public final void d(baax baaxVar) {
        if (baaxVar != null) {
            this.g = baaxVar;
            return;
        }
        throw new NullPointerException("Null metric");
    }

    public final uvj a() {
        Boolean bool = this.f;
        if (bool == null || this.g == null || this.h == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f == null) {
                sb.append(" isEventNameConstant");
            }
            if (this.g == null) {
                sb.append(" metric");
            }
            if (this.h == null) {
                sb.append(" isUnsampled");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new uvj(this.a, bool.booleanValue(), this.g, this.b, this.c, this.d, this.h.booleanValue(), this.e);
    }
}
