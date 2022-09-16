package defpackage;
/* compiled from: PG */
/* renamed from: aevu  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aevu implements Runnable {
    public final /* synthetic */ aevv a;
    private final /* synthetic */ int b;

    public /* synthetic */ aevu(aevv aevvVar) {
        this.a = aevvVar;
    }

    public /* synthetic */ aevu(aevv aevvVar, int i) {
        this.b = i;
        this.a = aevvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (this.b == 0) {
            aevv aevvVar = this.a;
            aevvVar.f = null;
            afbi afbiVar = aevvVar.c.n;
            if (afbiVar == null || !afbiVar.I || afbiVar.H) {
                return;
            }
            afbj afbjVar = afbiVar.c;
            if (afbjVar.h || afbjVar.b != 2) {
                return;
            }
            afbiVar.b.i("sbf", new aest("1"));
            if (!afbiVar.b().v) {
                z = afbiVar.L.o().ad;
            } else {
                z = afbiVar.L.o().ac;
            }
            if (!z) {
                return;
            }
            afbiVar.b.g(new afkn("android.stuck.bufferfull", ((Long) aevvVar.b.get()).longValue()));
            return;
        }
        aevv aevvVar2 = this.a;
        afbi afbiVar2 = aevvVar2.c.n;
        if (afbiVar2 == null || afbiVar2.H || afbiVar2.c.h) {
            aevvVar2.e = false;
            return;
        }
        if (!afbiVar2.I) {
            long longValue = ((Long) aevvVar2.a.get()).longValue();
            long longValue2 = ((Long) aevvVar2.b.get()).longValue();
            long j = (longValue == -1 || longValue2 == -1 || longValue < longValue2) ? -1L : longValue - longValue2;
            if (j != -1 && j >= afbiVar2.a().t() && !afbiVar2.I) {
                afbiVar2.I = true;
            }
        }
        aqwu aqwuVar = afbiVar2.a().c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        boolean z2 = aqwuVar.bu && afbiVar2.b().v && !afbiVar2.f39J;
        if (!afbiVar2.I || z2) {
            aevvVar2.d.postDelayed(new aevu(aevvVar2, 1), 1000L);
            return;
        }
        aevvVar2.e = false;
        aevvVar2.f = new aevu(aevvVar2);
        aevvVar2.d.postDelayed(aevvVar2.f, Math.max(afbiVar2.L.o().ae, 2000L));
    }
}
