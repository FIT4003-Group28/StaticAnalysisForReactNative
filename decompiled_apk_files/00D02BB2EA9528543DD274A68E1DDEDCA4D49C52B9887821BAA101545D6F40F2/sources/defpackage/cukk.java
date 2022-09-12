package defpackage;
/* compiled from: PG */
/* renamed from: cukk  reason: default package */
/* loaded from: classes5.dex */
public final class cukk extends cuko {
    public cukn a;
    public String b;
    private dbsg<byte[]> c;
    private Integer d;
    private Integer e;
    private Integer f;
    private Integer g;

    public cukk() {
        this.c = dbpy.a;
    }

    public cukk(cukp cukpVar) {
        this.c = dbpy.a;
        cukl cuklVar = (cukl) cukpVar;
        this.a = cuklVar.a;
        this.b = cuklVar.b;
        this.c = cuklVar.c;
        this.d = Integer.valueOf(cuklVar.d);
        this.e = Integer.valueOf(cuklVar.e);
        this.f = Integer.valueOf(cuklVar.f);
        this.g = Integer.valueOf(cuklVar.g);
    }

    @Override // defpackage.cuko
    public final void b(int i) {
        this.g = Integer.valueOf(i);
    }

    @Override // defpackage.cuko
    public final void c(int i) {
        this.e = Integer.valueOf(i);
    }

    @Override // defpackage.cuko
    public final void d(String str) {
        this.b = str;
    }

    @Override // defpackage.cuko
    public final void e(cukn cuknVar) {
        this.a = cuknVar;
    }

    @Override // defpackage.cuko
    public final void f(int i) {
        this.f = Integer.valueOf(i);
    }

    @Override // defpackage.cuko
    public final void g(dbsg<byte[]> dbsgVar) {
        if (dbsgVar != null) {
            this.c = dbsgVar;
            return;
        }
        throw new NullPointerException("Null thumbnail");
    }

    @Override // defpackage.cuko
    public final void h(byte[] bArr) {
        this.c = dbsg.i(bArr);
    }

    @Override // defpackage.cuko
    public final void i(int i) {
        this.d = Integer.valueOf(i);
    }

    @Override // defpackage.cuko
    public final cukp a() {
        String str = this.d == null ? " width" : "";
        if (this.e == null) {
            str = str.concat(" height");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" size");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" downloadStatus");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cukl(this.a, this.b, this.c, this.d.intValue(), this.e.intValue(), this.f.intValue(), this.g.intValue());
    }
}
