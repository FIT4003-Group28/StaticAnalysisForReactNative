package defpackage;
/* compiled from: PG */
/* renamed from: angm  reason: default package */
/* loaded from: classes2.dex */
public final class angm extends anhq {
    public eaou a;
    public eapg b;
    public String c;
    public dbsg<String> d;
    public int e;
    private anhw f;
    private anhu g;
    private anhu h;
    private anhu i;
    private eapd j;

    public angm() {
        this.d = dbpy.a;
    }

    public angm(anhy anhyVar) {
        this.d = dbpy.a;
        angn angnVar = (angn) anhyVar;
        this.f = angnVar.a;
        this.g = angnVar.b;
        this.h = angnVar.c;
        this.i = angnVar.d;
        this.j = angnVar.e;
        this.a = angnVar.f;
        this.b = angnVar.g;
        this.c = angnVar.h;
        this.d = angnVar.i;
        this.e = angnVar.j;
    }

    @Override // defpackage.anhq
    public final void b(eapg eapgVar) {
        this.b = eapgVar;
    }

    @Override // defpackage.anhq
    public final void c(eapd eapdVar) {
        this.j = eapdVar;
    }

    @Override // defpackage.anhq
    public final void d(anhu anhuVar) {
        if (anhuVar != null) {
            this.i = anhuVar;
            return;
        }
        throw new NullPointerException("Null showAccountSelection");
    }

    @Override // defpackage.anhq
    public final void e(anhu anhuVar) {
        if (anhuVar != null) {
            this.h = anhuVar;
            return;
        }
        throw new NullPointerException("Null showNotificationsOptOutBanner");
    }

    @Override // defpackage.anhq
    public final void f(anhu anhuVar) {
        if (anhuVar != null) {
            this.g = anhuVar;
            return;
        }
        throw new NullPointerException("Null showOobeOption");
    }

    @Override // defpackage.anhq
    public final void g(anhw anhwVar) {
        if (anhwVar != null) {
            this.f = anhwVar;
            return;
        }
        throw new NullPointerException("Null target");
    }

    @Override // defpackage.anhq
    public final void h(eaou eaouVar) {
        this.a = eaouVar;
    }

    @Override // defpackage.anhq
    public final void i(int i) {
        this.e = i;
    }

    @Override // defpackage.anhq
    public final void j(dbsg<String> dbsgVar) {
        this.d = dbsgVar;
    }

    @Override // defpackage.anhq
    public final anhy a() {
        String str = this.f == null ? " target" : "";
        if (this.g == null) {
            str = str.concat(" showOobeOption");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" showNotificationsOptOutBanner");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" showAccountSelection");
        }
        if (this.e == 0) {
            str = String.valueOf(str).concat(" transition");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new angn(this.f, this.g, this.h, this.i, this.j, this.a, this.b, this.c, this.d, this.e);
    }
}
