package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afaz  reason: default package */
/* loaded from: classes.dex */
public final class afaz implements afhm {
    final /* synthetic */ afex a;
    final /* synthetic */ afao b;
    final /* synthetic */ afap c;

    public afaz(afex afexVar, afao afaoVar, afap afapVar) {
        this.a = afexVar;
        this.b = afaoVar;
        this.c = afapVar;
    }

    @Override // defpackage.afhm
    public final aeao a(aean aeanVar) {
        if ((aeanVar.b & 1) != 0) {
            afal afalVar = this.b.a;
            orl a = orl.a(aeanVar.c);
            if (a == null) {
                a = orl.TRACK_TYPE_AUDIO;
            }
            afalVar.c(a).d = true;
        }
        return aeao.a;
    }

    @Override // defpackage.afhm
    public final aeaq b(aeap aeapVar) {
        afap afapVar = this.c;
        adzc adzcVar = aeapVar.b;
        if (adzcVar == null) {
            adzcVar = adzc.a;
        }
        afapVar.a(afkn.e(adzcVar), this.b.c);
        return aeaq.a;
    }

    @Override // defpackage.afhm
    public final aeam c() {
        oqu a = this.a.a(this.b.c.a(), this.b.c.w(), -9223372036854775807L, this.b.c.a);
        aopa createBuilder = aeam.a.createBuilder();
        createBuilder.copyOnWrite();
        aeam aeamVar = (aeam) createBuilder.instance;
        a.getClass();
        aeamVar.c = a;
        aeamVar.b |= 1;
        return (aeam) createBuilder.mo39build();
    }
}
