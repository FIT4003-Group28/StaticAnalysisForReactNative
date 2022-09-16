package defpackage;
/* compiled from: PG */
/* renamed from: cyuw  reason: default package */
/* loaded from: classes5.dex */
public final class cyuw extends cyxf {
    public String a;
    public String b;
    public Boolean c;
    public Boolean d;
    public Boolean e;
    public Boolean f;
    public Boolean g;
    public Boolean h;
    public Boolean i;
    public Boolean j;
    public Boolean k;
    public Boolean l;
    public Integer m;
    public Integer n;
    public Integer o;
    private Integer p;
    private Integer q;
    private Long r;
    private Long s;

    @Override // defpackage.cyxf
    public final void b(long j) {
        this.s = Long.valueOf(j);
    }

    @Override // defpackage.cyxf
    public final void c(int i) {
        this.q = Integer.valueOf(i);
    }

    @Override // defpackage.cyxf
    public final void d(long j) {
        this.r = Long.valueOf(j);
    }

    @Override // defpackage.cyxf
    public final void e(int i) {
        this.p = Integer.valueOf(i);
    }

    @Override // defpackage.cyxf
    public final cyxg a() {
        String str = this.p == null ? " timesContacted" : "";
        if (this.q == null) {
            str = str.concat(" fieldTimesUsed");
        }
        if (this.r == null) {
            str = String.valueOf(str).concat(" lastTimeContacted");
        }
        if (this.s == null) {
            str = String.valueOf(str).concat(" fieldLastTimeUsed");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cyux(this.p.intValue(), this.q.intValue(), this.r.longValue(), this.s.longValue(), this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
    }
}
