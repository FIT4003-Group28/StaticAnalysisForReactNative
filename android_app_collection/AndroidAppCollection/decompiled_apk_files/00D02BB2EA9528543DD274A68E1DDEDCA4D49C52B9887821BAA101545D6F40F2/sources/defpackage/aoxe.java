package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aoxe  reason: default package */
/* loaded from: classes2.dex */
public final class aoxe extends aoye {
    public aoyj a;
    public eapd b;
    public dspd c;
    public dbsg<bttq> d;
    private aoyf e;
    private dcdc<aoxt> f;
    private dcdc<aoxt> g;

    public aoxe() {
        this.d = dbpy.a;
    }

    public aoxe(aoyg aoygVar) {
        this.d = dbpy.a;
        aoxf aoxfVar = (aoxf) aoygVar;
        this.a = aoxfVar.a;
        this.e = aoxfVar.b;
        this.f = aoxfVar.c;
        this.g = aoxfVar.d;
        this.b = aoxfVar.e;
        this.c = aoxfVar.f;
        this.d = aoxfVar.g;
    }

    @Override // defpackage.aoye
    public final void b(@dzsi dspd dspdVar) {
        this.c = dspdVar;
    }

    @Override // defpackage.aoye
    public final void c(dbsg<bttq> dbsgVar) {
        this.d = dbsgVar;
    }

    @Override // defpackage.aoye
    public final void d(dcdc<aoxt> dcdcVar) {
        if (dcdcVar != null) {
            this.g = dcdcVar;
            return;
        }
        throw new NullPointerException("Null fullyLoadedPlaces");
    }

    @Override // defpackage.aoye
    public final void e(dcdc<aoxt> dcdcVar) {
        if (dcdcVar != null) {
            this.f = dcdcVar;
            return;
        }
        throw new NullPointerException("Null partiallyLoadedPlaces");
    }

    @Override // defpackage.aoye
    public final void f(aoyf aoyfVar) {
        if (aoyfVar != null) {
            this.e = aoyfVar;
            return;
        }
        throw new NullPointerException("Null stateType");
    }

    @Override // defpackage.aoye
    public final aoyg a() {
        String str = this.a == null ? " key" : "";
        if (this.e == null) {
            str = str.concat(" stateType");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" partiallyLoadedPlaces");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" fullyLoadedPlaces");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" creationTimestamp");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new aoxf(this.a, this.e, this.f, this.g, this.b, this.c, this.d);
    }
}
