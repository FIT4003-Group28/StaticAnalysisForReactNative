package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adpx  reason: default package */
/* loaded from: classes.dex */
public final class adpx implements airt {
    final /* synthetic */ adpy a;

    public adpx(adpy adpyVar) {
        this.a = adpyVar;
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().a.Z(new ayqb() { // from class: adpw
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                adpx adpxVar = adpx.this;
                ahhw ahhwVar = (ahhw) obj;
                if (adpxVar.a.g || !ahhwVar.c().a(aika.VIDEO_PLAYING) || adpxVar.a.b.a != 1) {
                    return;
                }
                adpxVar.a.e();
            }
        })};
    }
}
