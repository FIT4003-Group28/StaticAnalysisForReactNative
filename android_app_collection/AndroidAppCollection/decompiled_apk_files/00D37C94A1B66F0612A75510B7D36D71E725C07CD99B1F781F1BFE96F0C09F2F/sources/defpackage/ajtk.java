package defpackage;
/* compiled from: PG */
/* renamed from: ajtk  reason: default package */
/* loaded from: classes.dex */
public final class ajtk {
    private ajru a;
    private Long b;
    private Runnable c;
    private Runnable d;

    public final void b(long j) {
        this.b = Long.valueOf(j);
    }

    public final void c(Runnable runnable) {
        if (runnable != null) {
            this.d = runnable;
            return;
        }
        throw new NullPointerException("Null onEnd");
    }

    public final void d(Runnable runnable) {
        if (runnable != null) {
            this.c = runnable;
            return;
        }
        throw new NullPointerException("Null onStart");
    }

    public final void e(ajru ajruVar) {
        if (ajruVar != null) {
            this.a = ajruVar;
            return;
        }
        throw new NullPointerException("Null presenter");
    }

    public final ajtl a() {
        Long l;
        ajru ajruVar = this.a;
        if (ajruVar == null || (l = this.b) == null || this.c == null || this.d == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" presenter");
            }
            if (this.b == null) {
                sb.append(" duration");
            }
            if (this.c == null) {
                sb.append(" onStart");
            }
            if (this.d == null) {
                sb.append(" onEnd");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new ajtl(ajruVar, l.longValue(), this.c, this.d);
    }
}
