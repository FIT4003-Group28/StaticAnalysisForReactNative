package defpackage;
/* compiled from: PG */
/* renamed from: aijo  reason: default package */
/* loaded from: classes.dex */
public final class aijo {
    public acvg a;
    public afmv b;
    private Boolean c;
    private Integer d;
    private Integer e;
    private Boolean f;
    private Boolean g;

    public final void b(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    public final void c(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    public final void d(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    public final void e(int i) {
        this.e = Integer.valueOf(i);
    }

    public final void f(int i) {
        this.d = Integer.valueOf(i);
    }

    public final aijp a() {
        Boolean bool = this.c;
        if (bool == null || this.d == null || this.e == null || this.f == null || this.g == null) {
            StringBuilder sb = new StringBuilder();
            if (this.c == null) {
                sb.append(" shouldUseQueuedVideoForNavigation");
            }
            if (this.d == null) {
                sb.append(" watchNextResponseProcessingDelay");
            }
            if (this.e == null) {
                sb.append(" watchNextResponseParsingDelay");
            }
            if (this.f == null) {
                sb.append(" shouldPauseOnLastFrame");
            }
            if (this.g == null) {
                sb.append(" mediaSessionDisabled");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new aijp(this.a, bool.booleanValue(), this.d.intValue(), this.e.intValue(), this.f.booleanValue(), this.g.booleanValue(), this.b);
    }
}
