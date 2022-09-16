package defpackage;
/* compiled from: PG */
/* renamed from: adnv  reason: default package */
/* loaded from: classes.dex */
public final class adnv {
    public adna a;
    public adit b;
    private ampq c;
    private Long d;
    private String e;
    private String f;
    private ampq g;
    private String h;
    private Integer i;
    private int j;

    public adnv(adnw adnwVar) {
        this.c = amon.a;
        this.g = amon.a;
        this.j = adnwVar.i;
        this.c = adnwVar.a;
        this.d = Long.valueOf(adnwVar.b);
        this.a = adnwVar.c;
        this.e = adnwVar.d;
        this.f = adnwVar.e;
        this.g = adnwVar.f;
        this.b = adnwVar.j;
        this.h = adnwVar.g;
        this.i = Integer.valueOf(adnwVar.h);
    }

    public adnv(byte[] bArr) {
        this.c = amon.a;
        this.g = amon.a;
    }

    public final void b(admy admyVar) {
        this.c = ampq.j(admyVar);
    }

    public final void c(atcv atcvVar) {
        this.g = ampq.j(atcvVar);
    }

    public final void d(String str) {
        if (str != null) {
            this.e = str;
            return;
        }
        throw new NullPointerException("Null mediaRouteId");
    }

    public final void e(String str) {
        if (str != null) {
            this.f = str;
            return;
        }
        throw new NullPointerException("Null screenName");
    }

    public final void f(int i) {
        this.i = Integer.valueOf(i);
    }

    public final void g(String str) {
        if (str != null) {
            this.h = str;
            return;
        }
        throw new NullPointerException("Null sessionNonce");
    }

    public final void h(long j) {
        this.d = Long.valueOf(j);
    }

    public final void i(int i) {
        if (i != 0) {
            this.j = i;
            return;
        }
        throw new NullPointerException("Null sessionType");
    }

    public adnv() {
    }

    public final adnw a() {
        Long l;
        int i = this.j;
        if (i == 0 || (l = this.d) == null || this.e == null || this.f == null || this.h == null || this.i == null) {
            StringBuilder sb = new StringBuilder();
            if (this.j == 0) {
                sb.append(" sessionType");
            }
            if (this.d == null) {
                sb.append(" startedTimeMs");
            }
            if (this.e == null) {
                sb.append(" mediaRouteId");
            }
            if (this.f == null) {
                sb.append(" screenName");
            }
            if (this.h == null) {
                sb.append(" sessionNonce");
            }
            if (this.i == null) {
                sb.append(" sessionIndex");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new adnw(i, this.c, l.longValue(), this.a, this.e, this.f, this.g, this.b, this.h, this.i.intValue());
    }
}
