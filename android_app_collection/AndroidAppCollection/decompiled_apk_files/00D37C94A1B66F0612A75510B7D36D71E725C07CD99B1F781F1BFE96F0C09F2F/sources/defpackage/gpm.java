package defpackage;
/* compiled from: PG */
/* renamed from: gpm  reason: default package */
/* loaded from: classes3.dex */
public final class gpm implements aknw {
    final /* synthetic */ skn a;

    public gpm(skn sknVar) {
        this.a = sknVar;
    }

    @Override // defpackage.aknw
    public final void a() {
        sif sifVar = (sif) this.a;
        sifVar.a = anvh.PREVIOUSLY_DENIED;
        skn sknVar = sifVar.b;
        if (sknVar != null) {
            shx shxVar = (shx) sknVar;
            shxVar.g = false;
            shxVar.f = false;
            shxVar.e.e.d().a();
        }
    }

    @Override // defpackage.aknw
    public final void b() {
        sif sifVar = (sif) this.a;
        sifVar.a = anvh.DENIED;
        skn sknVar = sifVar.b;
        if (sknVar != null) {
            shx shxVar = (shx) sknVar;
            shxVar.g = false;
            shxVar.f = false;
            shxVar.e.e.d().a();
        }
    }

    @Override // defpackage.aknw
    public final void c() {
        this.a.d();
    }
}
