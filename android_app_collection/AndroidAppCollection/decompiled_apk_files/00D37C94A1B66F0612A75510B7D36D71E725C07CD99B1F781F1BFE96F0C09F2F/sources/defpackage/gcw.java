package defpackage;
/* compiled from: PG */
/* renamed from: gcw  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gcw implements ayqb {
    public final /* synthetic */ gde a;
    private final /* synthetic */ int b;

    public /* synthetic */ gcw(gde gdeVar) {
        this.a = gdeVar;
    }

    public /* synthetic */ gcw(gde gdeVar, int i) {
        this.b = i;
        this.a = gdeVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        boolean z;
        gcs gcsVar;
        int i = this.b;
        if (i == 0) {
            gde gdeVar = this.a;
            ahia ahiaVar = (ahia) obj;
            if (akzj.f(gdeVar.j, ahiaVar)) {
                return;
            }
            gdeVar.j = ahiaVar;
            gcs gcsVar2 = gdeVar.p;
            if (gcsVar2 == null || gdeVar.l) {
                return;
            }
            gcsVar2.a();
        } else if (i == 1) {
            gde gdeVar2 = this.a;
            ahhw ahhwVar = (ahhw) obj;
            boolean z2 = gdeVar2.o;
            gdeVar2.o = gdo.c(ahhwVar.b());
            boolean z3 = gdeVar2.m;
            gdeVar2.m = ahhwVar.c().a(aika.PLAYBACK_INTERRUPTED, aika.INTERSTITIAL_REQUESTED, aika.INTERSTITIAL_PLAYING);
            boolean z4 = gdeVar2.n;
            if (ahhwVar.b() != null) {
                z = gdo.a(ahhwVar.b());
            } else {
                z = gdeVar2.n;
            }
            gdeVar2.n = z;
            if ((z3 == gdeVar2.m && z4 == z && z2 == gdeVar2.o) || (gcsVar = gdeVar2.p) == null || gdeVar2.l) {
                return;
            }
            gcsVar.a();
        } else {
            gde gdeVar3 = this.a;
            Boolean bool = (Boolean) obj;
            gcs gcsVar3 = gdeVar3.p;
            if (gcsVar3 == null || gdeVar3.l || gdeVar3.m) {
                return;
            }
            gcsVar3.a();
        }
    }
}
