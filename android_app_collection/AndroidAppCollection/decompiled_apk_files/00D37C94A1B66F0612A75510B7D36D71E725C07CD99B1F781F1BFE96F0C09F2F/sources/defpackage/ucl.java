package defpackage;
/* compiled from: PG */
/* renamed from: ucl  reason: default package */
/* loaded from: classes4.dex */
public final class ucl {
    public Long a;
    public String b;
    public Long c;
    public Long d;
    public Long e;
    public Long f;
    private String g;
    private ubx h;
    private Integer i;

    public ucl() {
    }

    public ucl(ucp ucpVar) {
        this.a = ucpVar.a;
        this.g = ucpVar.b;
        this.b = ucpVar.c;
        this.c = ucpVar.d;
        this.d = ucpVar.e;
        this.h = ucpVar.f;
        this.e = ucpVar.g;
        this.i = Integer.valueOf(ucpVar.h);
        this.f = ucpVar.i;
    }

    public final void b(String str) {
        if (str != null) {
            this.g = str;
            return;
        }
        throw new NullPointerException("Null accountName");
    }

    public final void c(int i) {
        this.i = Integer.valueOf(i);
    }

    public final void d(ubx ubxVar) {
        if (ubxVar != null) {
            this.h = ubxVar;
            return;
        }
        throw new NullPointerException("Null registrationStatus");
    }

    public final ucp a() {
        Long l;
        Long l2;
        ubx ubxVar;
        Long l3;
        Integer num;
        String str = this.g;
        if (str == null || (l = this.c) == null || (l2 = this.d) == null || (ubxVar = this.h) == null || (l3 = this.e) == null || (num = this.i) == null || this.f == null) {
            StringBuilder sb = new StringBuilder();
            if (this.g == null) {
                sb.append(" accountName");
            }
            if (this.c == null) {
                sb.append(" syncVersion");
            }
            if (this.d == null) {
                sb.append(" pageVersion");
            }
            if (this.h == null) {
                sb.append(" registrationStatus");
            }
            if (this.e == null) {
                sb.append(" lastRegistrationTimeMs");
            }
            if (this.i == null) {
                sb.append(" lastRegistrationRequestHash");
            }
            if (this.f == null) {
                sb.append(" firstRegistrationVersion");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new ucp(this.a, str, this.b, l, l2, ubxVar, l3, num.intValue(), this.f);
    }
}
