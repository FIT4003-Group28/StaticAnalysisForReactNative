package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: crwg  reason: default package */
/* loaded from: classes5.dex */
public final class crwg extends crwn {
    public String A;
    private String B;
    private Long C;
    private String D;
    private String E;
    private dcdc<String> F;
    private dcdc<dszs> G;
    private dcdc<crtk> H;
    private crtx I;
    private Integer J;
    private int K;
    public String a;
    public dgpy b;
    public dgpu c;
    public dfqp d;
    public String e;
    public String f;
    public String g;
    public crtr h;
    public dspd i;
    public dgrh j;
    public dgpo k;
    public String l;
    public Boolean m;
    public Boolean n;
    public crtp o;
    public String p;
    public String q;
    public String r;
    public Long s;
    public String t;
    public Long u;
    public crtz v;
    public cruc w;
    public String x;
    public String y;
    public String z;

    @Override // defpackage.crwn
    public final void b(String str) {
        if (str != null) {
            this.D = str;
            return;
        }
        throw new NullPointerException("Null accountName");
    }

    @Override // defpackage.crwn
    public final void c(List<crtk> list) {
        this.H = list == null ? null : dcdc.r(list);
    }

    @Override // defpackage.crwn
    public final void d(int i) {
        this.J = Integer.valueOf(i);
    }

    @Override // defpackage.crwn
    public final void e(String str) {
        if (str != null) {
            this.B = str;
            return;
        }
        throw new NullPointerException("Null gpuMediaId");
    }

    @Override // defpackage.crwn
    public final void f(List<String> list) {
        this.F = list == null ? null : dcdc.r(list);
    }

    @Override // defpackage.crwn
    public final void g(List<dszs> list) {
        this.G = list == null ? null : dcdc.r(list);
    }

    @Override // defpackage.crwn
    public final void h(String str) {
        if (str != null) {
            this.E = str;
            return;
        }
        throw new NullPointerException("Null originalUri");
    }

    @Override // defpackage.crwn
    public final void i(Long l) {
        if (l != null) {
            this.C = l;
            return;
        }
        throw new NullPointerException("Null requestTime");
    }

    @Override // defpackage.crwn
    public final void j(crtx crtxVar) {
        if (crtxVar != null) {
            this.I = crtxVar;
            return;
        }
        throw new NullPointerException("Null uploadStatus");
    }

    @Override // defpackage.crwn
    public final void k(int i) {
        if (i != 0) {
            this.K = i;
            return;
        }
        throw new NullPointerException("Null source");
    }

    @Override // defpackage.crwn
    public final crwo a() {
        String str = this.B == null ? " gpuMediaId" : "";
        if (this.C == null) {
            str = str.concat(" requestTime");
        }
        if (this.D == null) {
            str = String.valueOf(str).concat(" accountName");
        }
        if (this.K == 0) {
            str = String.valueOf(str).concat(" source");
        }
        if (this.E == null) {
            str = String.valueOf(str).concat(" originalUri");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" matchExistingMedia");
        }
        if (this.n == null) {
            str = String.valueOf(str).concat(" wifiOnly");
        }
        if (this.I == null) {
            str = String.valueOf(str).concat(" uploadStatus");
        }
        if (this.J == null) {
            str = String.valueOf(str).concat(" attemptCount");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new crwh(this.B, this.C, this.D, this.a, this.K, this.b, this.c, this.d, this.E, this.e, this.f, this.g, this.h, this.i, this.F, this.G, this.H, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.I, this.J.intValue(), this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A);
    }
}
