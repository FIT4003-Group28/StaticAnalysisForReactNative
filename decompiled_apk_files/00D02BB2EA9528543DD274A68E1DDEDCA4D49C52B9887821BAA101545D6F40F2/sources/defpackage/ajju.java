package defpackage;
/* compiled from: PG */
/* renamed from: ajju  reason: default package */
/* loaded from: classes2.dex */
final class ajju extends ajli {
    public eapd a;
    public int b;
    private dcep<btlu> c;
    private dced<btlu, ahwl> d;
    private dcdn<btlu, aile> e;
    private Integer f;
    private dkog g;

    public ajju() {
    }

    public ajju(ajlj ajljVar) {
        ajjv ajjvVar = (ajjv) ajljVar;
        this.c = ajjvVar.a;
        this.d = ajjvVar.b;
        this.e = ajjvVar.c;
        this.b = ajjvVar.g;
        this.f = Integer.valueOf(ajjvVar.d);
        this.a = ajjvVar.e;
        this.g = ajjvVar.f;
    }

    @Override // defpackage.ajli
    public final dcep<btlu> a() {
        dcep<btlu> dcepVar = this.c;
        if (dcepVar != null) {
            return dcepVar;
        }
        throw new IllegalStateException("Property \"accounts\" has not been set");
    }

    @Override // defpackage.ajli
    public final void c(dcep<btlu> dcepVar) {
        if (dcepVar != null) {
            this.c = dcepVar;
            return;
        }
        throw new NullPointerException("Null accounts");
    }

    @Override // defpackage.ajli
    public final void d(int i) {
        this.b = i;
    }

    @Override // defpackage.ajli
    public final void e(dkog dkogVar) {
        if (dkogVar != null) {
            this.g = dkogVar;
            return;
        }
        throw new NullPointerException("Null clientParameters");
    }

    @Override // defpackage.ajli
    public final void f(eapd eapdVar) {
        this.a = eapdVar;
    }

    @Override // defpackage.ajli
    public final void g(int i) {
        this.f = Integer.valueOf(i);
    }

    @Override // defpackage.ajli
    public final void h(dcdn<btlu, aile> dcdnVar) {
        if (dcdnVar != null) {
            this.e = dcdnVar;
            return;
        }
        throw new NullPointerException("Null reportingConfigurations");
    }

    @Override // defpackage.ajli
    public final void i(dced<btlu, ahwl> dcedVar) {
        this.d = dcedVar;
    }

    @Override // defpackage.ajli
    public final ajlj b() {
        String str = this.c == null ? " accounts" : "";
        if (this.d == null) {
            str = str.concat(" sharingStates");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" reportingConfigurations");
        }
        if (this.b == 0) {
            str = String.valueOf(str).concat(" applicationState");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" currentDetectedActivity");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" creationTime");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" clientParameters");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new ajjv(this.c, this.d, this.e, this.b, this.f.intValue(), this.a, this.g);
    }
}
