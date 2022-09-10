package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cngs  reason: default package */
/* loaded from: classes5.dex */
public final class cngs implements cmvr {
    final /* synthetic */ cneo a;
    final /* synthetic */ cnht b;

    public cngs(cnht cnhtVar, cneo cneoVar) {
        this.b = cnhtVar;
        this.a = cneoVar;
    }

    @Override // defpackage.cmvr
    public final void a() {
        if (cmwk.a("CAR.PROJECTION.CAHI", 3)) {
            int i = cnjc.a;
        }
        this.b.c.drainPermits();
        this.b.e();
    }

    @Override // defpackage.cnac
    public final void b(int i) {
        cmvq.b(this);
    }

    @Override // defpackage.cnac
    public final void c() {
        cmvq.a(this);
    }

    @Override // defpackage.cmvr
    public final void d() {
        if (cmwk.a("CAR.PROJECTION.CAHI", 3)) {
            int i = cnjc.a;
        }
        try {
            cmwk.a = this.a.q("car_force_logging");
        } catch (cmwm | IllegalArgumentException | IllegalStateException | SecurityException unused) {
        }
        cmzd.a(this.b.c);
    }
}
