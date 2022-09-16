package defpackage;
/* compiled from: PG */
/* renamed from: xhd  reason: default package */
/* loaded from: classes4.dex */
public final class xhd {
    private Boolean a;
    private Boolean b;
    private CharSequence c;

    public final void b(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    public final void c(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    public final void d(CharSequence charSequence) {
        if (charSequence != null) {
            this.c = charSequence;
            return;
        }
        throw new NullPointerException("Null learnMoreText");
    }

    public final xhe a() {
        Boolean bool = this.a;
        if (bool == null || this.b == null || this.c == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" learnMoreCtaHidden");
            }
            if (this.b == null) {
                sb.append(" learnMoreCtaEnabled");
            }
            if (this.c == null) {
                sb.append(" learnMoreText");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new xhe(bool.booleanValue(), this.b.booleanValue(), this.c);
    }
}
