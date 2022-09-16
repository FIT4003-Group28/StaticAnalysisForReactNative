package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: algs  reason: default package */
/* loaded from: classes.dex */
public final class algs extends akzt {
    final /* synthetic */ ayqb a;
    final /* synthetic */ alct b;
    final /* synthetic */ boolean c;
    final /* synthetic */ aypx d;
    final /* synthetic */ algt e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public algs(algt algtVar, albf albfVar, alct alctVar, ayqb ayqbVar, alct alctVar2, boolean z, aypx aypxVar) {
        super(albfVar, alctVar);
        this.e = algtVar;
        this.a = ayqbVar;
        this.b = alctVar2;
        this.c = z;
        this.d = aypxVar;
    }

    @Override // defpackage.akzt
    public final aypx d() {
        return this.d;
    }

    @Override // defpackage.akzt
    public final void e(aopa aopaVar) {
        ayqb ayqbVar = this.a;
        if (ayqbVar != null) {
            try {
                ayqbVar.a(aopaVar);
            } catch (Exception unused) {
            }
        }
        int z = araa.z(this.b.c);
        if (z != 0 && z == 4 && !((alcw) aopaVar.instance).ad) {
            if (!this.c || !this.e.h()) {
                if (this.c || !this.e.j()) {
                    return;
                }
                aopaVar.copyOnWrite();
                alcw alcwVar = (alcw) aopaVar.instance;
                alcwVar.c |= 4194304;
                alcwVar.ad = true;
                return;
            }
            aopaVar.copyOnWrite();
            alcw alcwVar2 = (alcw) aopaVar.instance;
            alcwVar2.c = 4194304 | alcwVar2.c;
            alcwVar2.ad = true;
            avuo avuoVar = this.e.j;
            aopaVar.copyOnWrite();
            alcw alcwVar3 = (alcw) aopaVar.instance;
            alcwVar3.ae = avuoVar.R;
            alcwVar3.c |= 8388608;
            avun b = avun.b(this.b.d);
            if (b == null) {
                b = avun.UPLOAD_PROCESSOR_FAILURE_REASON_UNKNOWN;
            }
            aopaVar.copyOnWrite();
            alcw alcwVar4 = (alcw) aopaVar.instance;
            alcwVar4.af = b.aB;
            alcwVar4.c |= 16777216;
        }
    }
}
