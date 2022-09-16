package defpackage;
/* compiled from: PG */
/* renamed from: fvo  reason: default package */
/* loaded from: classes3.dex */
public final class fvo {
    public Boolean a;
    public Boolean b;
    public Boolean c;
    public avdu d;
    public avdq e;
    public avdh f;
    public avdj g;
    public CharSequence h;
    public apzg i;
    public String j;
    public fum k;
    public int l;
    public int m;
    private Integer n;
    private Integer o;

    public fvo() {
    }

    public fvo(fvp fvpVar) {
        this.a = Boolean.valueOf(fvpVar.a);
        this.b = Boolean.valueOf(fvpVar.b);
        this.c = Boolean.valueOf(fvpVar.c);
        this.n = Integer.valueOf(fvpVar.d);
        this.d = fvpVar.e;
        this.e = fvpVar.f;
        this.f = fvpVar.g;
        this.g = fvpVar.h;
        this.k = fvpVar.m;
        this.h = fvpVar.i;
        this.l = fvpVar.n;
        this.m = fvpVar.o;
        this.o = Integer.valueOf(fvpVar.j);
        this.i = fvpVar.k;
        this.j = fvpVar.l;
    }

    public final void b(int i) {
        this.o = Integer.valueOf(i);
    }

    public final void c(int i) {
        this.n = Integer.valueOf(i);
    }

    public final fvp a() {
        Boolean bool = this.a;
        if (bool == null || this.b == null || this.c == null || this.n == null || this.d == null || this.l == 0 || this.m == 0 || this.o == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" rateLimited");
            }
            if (this.b == null) {
                sb.append(" shownOnFullscreen");
            }
            if (this.c == null) {
                sb.append(" counterfactual");
            }
            if (this.n == null) {
                sb.append(" surveyType");
            }
            if (this.d == null) {
                sb.append(" surveySupportedRenderers");
            }
            if (this.l == 0) {
                sb.append(" displayTime");
            }
            if (this.m == 0) {
                sb.append(" displayStart");
            }
            if (this.o == null) {
                sb.append(" displayDelaySec");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new fvp(bool.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.n.intValue(), this.d, this.e, this.f, this.g, this.k, this.h, this.l, this.m, this.o.intValue(), this.i, this.j);
    }
}
