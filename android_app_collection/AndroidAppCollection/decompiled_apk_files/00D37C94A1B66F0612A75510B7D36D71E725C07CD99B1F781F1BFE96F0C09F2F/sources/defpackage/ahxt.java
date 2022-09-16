package defpackage;
/* compiled from: PG */
/* renamed from: ahxt  reason: default package */
/* loaded from: classes.dex */
public final class ahxt {
    private Boolean a;
    private Boolean b;
    private Boolean c;
    private Long d;

    public ahxt() {
    }

    public ahxt(ahxu ahxuVar) {
        this.a = Boolean.valueOf(ahxuVar.a);
        this.b = Boolean.valueOf(ahxuVar.b);
        this.c = Boolean.valueOf(ahxuVar.c);
        this.d = Long.valueOf(ahxuVar.d);
    }

    public final void b(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    public final void c(long j) {
        this.d = Long.valueOf(j);
    }

    public final void d(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    public final void e(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    public final ahxu a() {
        Boolean bool = this.a;
        if (bool == null || this.b == null || this.c == null || this.d == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" isAccessibilityPlayerEnabled");
            }
            if (this.b == null) {
                sb.append(" isTestOnlyState");
            }
            if (this.c == null) {
                sb.append(" canHidePlayerControls");
            }
            if (this.d == null) {
                sb.append(" controlsHideDelayMs");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new ahxu(bool.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.longValue());
    }
}
