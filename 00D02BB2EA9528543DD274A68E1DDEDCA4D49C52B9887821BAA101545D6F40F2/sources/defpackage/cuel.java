package defpackage;
/* compiled from: PG */
/* renamed from: cuel  reason: default package */
/* loaded from: classes5.dex */
final class cuel extends cuhy {
    private Integer a;
    private String b;
    private dbsg<cugd> c = dbpy.a;
    private ctzl d;
    private String e;

    @Override // defpackage.cuhy
    public final void b(ctzl ctzlVar) {
        if (ctzlVar != null) {
            this.d = ctzlVar;
            return;
        }
        throw new NullPointerException("Null action");
    }

    @Override // defpackage.cuhy
    public final void c(int i) {
        this.a = Integer.valueOf(i);
    }

    @Override // defpackage.cuhy
    public final void d(cugd cugdVar) {
        this.c = dbsg.i(cugdVar);
    }

    @Override // defpackage.cuhy
    public final void e(String str) {
        if (str != null) {
            this.e = str;
            return;
        }
        throw new NullPointerException("Null secondaryText");
    }

    @Override // defpackage.cuhy
    public final void f(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null text");
    }

    @Override // defpackage.cuhy
    public final cuhz a() {
        String str = this.a == null ? " id" : "";
        if (this.b == null) {
            str = str.concat(" text");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" action");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" secondaryText");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cuem(this.a.intValue(), this.b, this.c, this.d, this.e);
    }
}
