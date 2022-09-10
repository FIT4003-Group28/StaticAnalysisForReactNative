package defpackage;
/* compiled from: PG */
/* renamed from: allu  reason: default package */
/* loaded from: classes2.dex */
public final class allu extends alkx implements akti {
    private final alol c;
    private boolean f;
    private boolean g;
    private akwf h;

    public allu(alvi alviVar, aloi aloiVar, alkw alkwVar, alol alolVar, dmpn dmpnVar, int i, akty aktyVar) {
        super(aloiVar, alkwVar, amkn.ad(dmpnVar, i, amje.c(alviVar)), aktyVar, false, false);
        this.h = akwf.h;
        this.c = alolVar;
    }

    @Override // defpackage.alkx
    public final void F(alrv alrvVar, int i) {
        E(D(k(), alrvVar.t(this.e.c()), i));
    }

    @Override // defpackage.akti
    public final void a(akwf akwfVar) {
        boolean z;
        akwf bK;
        synchronized (this) {
            z = this.g;
            akwf akwfVar2 = this.h;
            dsqp dsqpVar = (dsqp) akwfVar2.cu(5);
            dsqpVar.bC(akwfVar2);
            akwa akwaVar = (akwa) dsqpVar;
            akwaVar.bC(akwfVar);
            bK = akwaVar.bK();
            this.h = bK;
            this.f = true;
        }
        if (!z) {
            this.c.a(this, bK);
        }
        this.d.c();
    }

    @Override // defpackage.akti
    public final void c(akth akthVar) {
        synchronized (this) {
            if (!this.g && this.f) {
                this.c.b(this);
            }
            this.c.a.put(this, akthVar);
            this.d.c();
            this.g = true;
        }
    }

    @Override // defpackage.akti
    public final void d() {
        synchronized (this) {
            this.c.a.remove(this);
            if (this.g && this.f) {
                this.c.a(this, this.h);
            }
            this.g = false;
        }
    }

    @Override // defpackage.alkx, defpackage.alaq
    public final akra l() {
        alvi a = this.e.i().a();
        dbsk.s(a);
        return a.a;
    }

    @Override // defpackage.alkx, defpackage.alsl
    public final /* bridge */ /* synthetic */ void v() {
    }

    @Override // defpackage.alkx, defpackage.alsl
    public final void y() {
        d();
        super.y();
    }

    @Override // defpackage.alkx, defpackage.alsl
    public final void z() {
        synchronized (this) {
            if (!this.g && this.f) {
                this.c.b(this);
            }
            this.f = false;
        }
        super.z();
    }

    public allu(alvi alviVar, aloi aloiVar, alkw alkwVar, alol alolVar, dmpn dmpnVar, boolean z, int i, akty aktyVar) {
        super(aloiVar, alkwVar, amkn.ad(dmpnVar, i, amje.c(alviVar)), aktyVar, z);
        this.h = akwf.h;
        this.c = alolVar;
    }
}
