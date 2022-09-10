package defpackage;
/* compiled from: PG */
/* renamed from: crve  reason: default package */
/* loaded from: classes5.dex */
public final class crve extends crvq {
    public cnjz a;
    public crxq b;
    public String c;
    public dtbh d;
    public crwb e;
    public crts f;
    public dgpw g;
    public dgpm h;
    public cruf i;
    public Integer j;
    public Integer k;
    public Integer l;
    public String m;
    public Boolean n;
    public Long o;
    private crxb p;

    @Override // defpackage.crvq
    public final void b(crxb crxbVar) {
        if (crxbVar != null) {
            this.p = crxbVar;
            return;
        }
        throw new NullPointerException("Null requestInfo");
    }

    @Override // defpackage.crvq
    public final crvr a() {
        String str = this.a == null ? " clearcutLogger" : "";
        if (this.b == null) {
            str = str.concat(" connInfo");
        }
        if (this.p == null) {
            str = String.valueOf(str).concat(" requestInfo");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" operation");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new crvf(this.a, this.b, this.c, this.p, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
    }
}
