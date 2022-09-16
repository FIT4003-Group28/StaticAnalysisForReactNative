package defpackage;
/* compiled from: PG */
/* renamed from: aoax  reason: default package */
/* loaded from: classes.dex */
public final class aoax {
    public String a;
    public String b;
    public String c;
    public String d;
    private Long e;
    private Long f;
    private int g;

    public aoax() {
    }

    public aoax(aoay aoayVar) {
        this.a = aoayVar.a;
        this.g = aoayVar.g;
        this.b = aoayVar.b;
        this.c = aoayVar.c;
        this.e = Long.valueOf(aoayVar.d);
        this.f = Long.valueOf(aoayVar.e);
        this.d = aoayVar.f;
    }

    public final void b(long j) {
        this.e = Long.valueOf(j);
    }

    public final void c(int i) {
        if (i != 0) {
            this.g = i;
            return;
        }
        throw new NullPointerException("Null registrationStatus");
    }

    public final void d(long j) {
        this.f = Long.valueOf(j);
    }

    public final aoay a() {
        Long l;
        int i = this.g;
        if (i == 0 || (l = this.e) == null || this.f == null) {
            StringBuilder sb = new StringBuilder();
            if (this.g == 0) {
                sb.append(" registrationStatus");
            }
            if (this.e == null) {
                sb.append(" expiresInSecs");
            }
            if (this.f == null) {
                sb.append(" tokenCreationEpochInSecs");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new aoay(this.a, i, this.b, this.c, l.longValue(), this.f.longValue(), this.d);
    }
}
