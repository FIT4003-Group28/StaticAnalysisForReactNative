package defpackage;
/* compiled from: PG */
/* renamed from: cllx  reason: default package */
/* loaded from: classes5.dex */
final class cllx implements cmnc {
    public final cmnr a;
    public final cllw b;
    public clol c;
    public cmnc d;
    public boolean e = true;
    public boolean f;

    public cllx(cllw cllwVar, cmmq cmmqVar) {
        this.b = cllwVar;
        this.a = new cmnr(cmmqVar);
    }

    @Override // defpackage.cmnc
    public final clod RP() {
        cmnc cmncVar = this.d;
        return cmncVar != null ? cmncVar.RP() : this.a.a;
    }

    public final void a() {
        this.f = false;
        this.a.e();
    }

    @Override // defpackage.cmnc
    public final long b() {
        if (this.e) {
            return this.a.b();
        }
        cmnc cmncVar = this.d;
        cmmn.f(cmncVar);
        return cmncVar.b();
    }

    @Override // defpackage.cmnc
    public final void c(clod clodVar) {
        cmnc cmncVar = this.d;
        if (cmncVar != null) {
            cmncVar.c(clodVar);
            clodVar = this.d.RP();
        }
        this.a.c(clodVar);
    }
}
