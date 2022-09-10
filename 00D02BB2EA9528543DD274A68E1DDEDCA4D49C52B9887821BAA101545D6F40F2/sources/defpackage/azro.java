package defpackage;
/* compiled from: PG */
/* renamed from: azro  reason: default package */
/* loaded from: classes3.dex */
public final class azro extends azru {
    public ddho a;
    public String b;
    public akqq c;
    public anee d;
    private dndr e;
    private String f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private Boolean k;
    private Boolean l;
    private byte[] m;
    private Boolean n;

    public azro() {
    }

    public azro(azrv azrvVar) {
        azrp azrpVar = (azrp) azrvVar;
        this.e = azrpVar.a;
        this.f = azrpVar.b;
        this.g = Boolean.valueOf(azrpVar.c);
        this.h = Boolean.valueOf(azrpVar.d);
        this.a = azrpVar.e;
        this.b = azrpVar.f;
        this.i = Boolean.valueOf(azrpVar.g);
        this.j = Boolean.valueOf(azrpVar.h);
        this.k = Boolean.valueOf(azrpVar.i);
        this.l = Boolean.valueOf(azrpVar.j);
        this.c = azrpVar.k;
        this.m = azrpVar.l;
        this.d = azrpVar.m;
        this.n = Boolean.valueOf(azrpVar.n);
    }

    @Override // defpackage.azru
    protected final void b(@dzsi byte[] bArr) {
        this.m = bArr;
    }

    @Override // defpackage.azru
    public final void c(dndr dndrVar) {
        if (dndrVar != null) {
            this.e = dndrVar;
            return;
        }
        throw new NullPointerException("Null aliasType");
    }

    @Override // defpackage.azru
    public final void d(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    @Override // defpackage.azru
    public final void e(boolean z) {
        this.k = Boolean.valueOf(z);
    }

    @Override // defpackage.azru
    public final void f(String str) {
        if (str != null) {
            this.f = str;
            return;
        }
        throw new NullPointerException("Null initialQuery");
    }

    @Override // defpackage.azru
    public final void g(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    @Override // defpackage.azru
    public final void h(@dzsi anee aneeVar) {
        this.d = aneeVar;
    }

    @Override // defpackage.azru
    public final void i(boolean z) {
        this.i = Boolean.valueOf(z);
    }

    @Override // defpackage.azru
    public final void j(boolean z) {
        this.j = Boolean.valueOf(z);
    }

    @Override // defpackage.azru
    public final void k(boolean z) {
        this.l = Boolean.valueOf(z);
    }

    @Override // defpackage.azru
    public final void l(boolean z) {
        this.n = Boolean.valueOf(z);
    }

    @Override // defpackage.azru
    public final void m(@dzsi akqq akqqVar) {
        this.c = akqqVar;
    }

    @Override // defpackage.azru
    public final azrv a() {
        String str = this.e == null ? " aliasType" : "";
        if (this.f == null) {
            str = str.concat(" initialQuery");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" initialQueryIsLatLng");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" forceLoadMapPointPickerOnStart");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" openPlaceSheet");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" popBackStack");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" fromMapPointPicker");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" prepopulateWithStpResults");
        }
        if (this.n == null) {
            str = String.valueOf(str).concat(" shouldUseMapPointPickerHeader");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new azrp(this.e, this.f, this.g.booleanValue(), this.h.booleanValue(), this.a, this.b, this.i.booleanValue(), this.j.booleanValue(), this.k.booleanValue(), this.l.booleanValue(), this.c, this.m, this.d, this.n.booleanValue());
    }
}
