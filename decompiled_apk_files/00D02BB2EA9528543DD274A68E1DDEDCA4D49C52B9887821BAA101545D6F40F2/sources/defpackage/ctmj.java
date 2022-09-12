package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ctmj  reason: default package */
/* loaded from: classes5.dex */
public final class ctmj extends ctmq {
    private Integer a;
    private Long b;
    private Long c;
    private Double d;
    private Integer e;

    @Override // defpackage.ctmq
    public final void b(double d) {
        this.d = Double.valueOf(d);
    }

    @Override // defpackage.ctmq
    public final void c(long j) {
        this.c = Long.valueOf(j);
    }

    @Override // defpackage.ctmq
    public final void d(int i) {
        this.e = Integer.valueOf(i);
    }

    @Override // defpackage.ctmq
    public final void e(long j) {
        this.b = Long.valueOf(j);
    }

    @Override // defpackage.ctmq
    public final void f(int i) {
        this.a = Integer.valueOf(i);
    }

    @Override // defpackage.ctmq
    public final ctmr a() {
        String str = this.a == null ? " maxRetries" : "";
        if (this.b == null) {
            str = str.concat(" maxDelayMs");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" initialDelayMs");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" backoff");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" jitterMs");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new ctmk(this.a.intValue(), this.b.longValue(), this.c.longValue(), this.d.doubleValue(), this.e.intValue());
    }
}
