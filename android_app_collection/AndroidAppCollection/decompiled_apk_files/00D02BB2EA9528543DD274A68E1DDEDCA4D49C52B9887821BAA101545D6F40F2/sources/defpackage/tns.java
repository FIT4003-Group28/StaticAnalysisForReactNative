package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: tns  reason: default package */
/* loaded from: classes7.dex */
public final class tns extends tof {
    private dcep<tnz> a;
    private dcep<tob> b;
    private dcep<drsm> c;

    public tns() {
    }

    public tns(tog togVar) {
        this.a = togVar.a();
        this.b = togVar.b();
        this.c = togVar.c();
    }

    @Override // defpackage.tof
    public final dcep<tnz> a() {
        dcep<tnz> dcepVar = this.a;
        if (dcepVar != null) {
            return dcepVar;
        }
        throw new IllegalStateException("Property \"preferredModes\" has not been set");
    }

    @Override // defpackage.tof
    public final dcep<tob> b() {
        dcep<tob> dcepVar = this.b;
        if (dcepVar != null) {
            return dcepVar;
        }
        throw new IllegalStateException("Property \"routeOptions\" has not been set");
    }

    @Override // defpackage.tof
    public final dcep<drsm> c() {
        dcep<drsm> dcepVar = this.c;
        if (dcepVar != null) {
            return dcepVar;
        }
        throw new IllegalStateException("Property \"unselectedNonTransitModes\" has not been set");
    }

    @Override // defpackage.tof
    public final void e(dcep<tnz> dcepVar) {
        if (dcepVar != null) {
            this.a = dcepVar;
            return;
        }
        throw new NullPointerException("Null preferredModes");
    }

    @Override // defpackage.tof
    public final void f(dcep<tob> dcepVar) {
        if (dcepVar != null) {
            this.b = dcepVar;
            return;
        }
        throw new NullPointerException("Null routeOptions");
    }

    @Override // defpackage.tof
    public final void g(dcep<drsm> dcepVar) {
        if (dcepVar != null) {
            this.c = dcepVar;
            return;
        }
        throw new NullPointerException("Null unselectedNonTransitModes");
    }

    @Override // defpackage.tof
    public final tog d() {
        String str = this.a == null ? " preferredModes" : "";
        if (this.b == null) {
            str = str.concat(" routeOptions");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" unselectedNonTransitModes");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new tnu(this.a, this.b, this.c);
    }
}
