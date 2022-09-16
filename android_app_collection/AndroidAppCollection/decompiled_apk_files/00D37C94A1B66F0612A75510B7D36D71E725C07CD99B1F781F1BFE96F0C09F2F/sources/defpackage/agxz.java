package defpackage;
/* compiled from: PG */
/* renamed from: agxz  reason: default package */
/* loaded from: classes.dex */
public final class agxz {
    public ampq a;
    public ampq b;
    public ampq c;
    public agpw d;
    public int e;
    private ampq f;
    private Long g;
    private Long h;
    private Double i;
    private Boolean j;
    private ampq k;
    private ampq l;
    private Integer m;

    public agxz() {
    }

    public agxz(byte[] bArr) {
        this.a = amon.a;
        this.f = amon.a;
        this.k = amon.a;
        this.l = amon.a;
        this.b = amon.a;
        this.c = amon.a;
    }

    public final void b(long j) {
        this.h = Long.valueOf(j);
    }

    public final void c(atsg atsgVar) {
        this.l = ampq.j(atsgVar);
    }

    public final void d(agqe agqeVar) {
        this.k = ampq.j(agqeVar);
    }

    public final void e(int i) {
        this.m = Integer.valueOf(i);
    }

    public final void f(String str) {
        this.f = ampq.j(str);
    }

    public final void g(long j) {
        this.g = Long.valueOf(j);
    }

    public final void h(double d) {
        this.i = Double.valueOf(d);
    }

    public final void i(boolean z) {
        this.j = Boolean.valueOf(z);
    }

    public final agya a() {
        Long l;
        int i = this.e;
        if (i == 0 || (l = this.g) == null || this.h == null || this.i == null || this.j == null || this.m == null) {
            StringBuilder sb = new StringBuilder();
            if (this.e == 0) {
                sb.append(" type");
            }
            if (this.g == null) {
                sb.append(" transferSize");
            }
            if (this.h == null) {
                sb.append(" bytesTransferred");
            }
            if (this.i == null) {
                sb.append(" transferSpeedBytesPerSecond");
            }
            if (this.j == null) {
                sb.append(" usingDataToDownloadStreams");
            }
            if (this.m == null) {
                sb.append(" statusReason");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new agya(i, this.a, this.f, l.longValue(), this.h.longValue(), this.i.doubleValue(), this.j.booleanValue(), this.k, this.l, this.m.intValue(), this.b, this.c, this.d);
    }
}
