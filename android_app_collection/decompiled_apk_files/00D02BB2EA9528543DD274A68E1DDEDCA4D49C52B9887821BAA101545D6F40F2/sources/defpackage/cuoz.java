package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cuoz  reason: default package */
/* loaded from: classes5.dex */
public final class cuoz extends cupz {
    private String a;
    private dbsg<cugd> b;
    private ctzl c;
    private Integer d;
    private Integer e;
    private Integer f;
    private Boolean g;

    public cuoz() {
        this.b = dbpy.a;
    }

    public cuoz(cuqa cuqaVar) {
        this.b = dbpy.a;
        cupa cupaVar = (cupa) cuqaVar;
        this.a = cupaVar.a;
        this.b = cupaVar.b;
        this.c = cupaVar.c;
        this.d = Integer.valueOf(cupaVar.d);
        this.e = Integer.valueOf(cupaVar.e);
        this.f = Integer.valueOf(cupaVar.f);
        this.g = Boolean.valueOf(cupaVar.g);
    }

    @Override // defpackage.cupz
    public final void b(ctzl ctzlVar) {
        if (ctzlVar != null) {
            this.c = ctzlVar;
            return;
        }
        throw new NullPointerException("Null action");
    }

    @Override // defpackage.cupz
    public final void c(int i) {
        this.e = Integer.valueOf(i);
    }

    @Override // defpackage.cupz
    public final void d(int i) {
        this.f = Integer.valueOf(i);
    }

    @Override // defpackage.cupz
    public final void e(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    @Override // defpackage.cupz
    public final void f(cugd cugdVar) {
        this.b = dbsg.i(cugdVar);
    }

    @Override // defpackage.cupz
    public final void g(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null text");
    }

    @Override // defpackage.cupz
    public final void h(int i) {
        this.d = Integer.valueOf(i);
    }

    @Override // defpackage.cupz
    public final cuqa a() {
        String str = this.a == null ? " text" : "";
        if (this.c == null) {
            str = str.concat(" action");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" textColor");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" backgroundColor");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" borderColor");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" enabled");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cupa(this.a, this.b, this.c, this.d.intValue(), this.e.intValue(), this.f.intValue(), this.g.booleanValue());
    }
}
