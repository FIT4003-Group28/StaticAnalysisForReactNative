package defpackage;
/* compiled from: PG */
/* renamed from: aidi  reason: default package */
/* loaded from: classes.dex */
public final class aidi extends aaom implements airt {
    private final axnm c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aidi(axnm axnmVar, axnm axnmVar2, int i) {
        super(axnmVar);
        this.d = i;
        this.c = axnmVar2;
    }

    public aidi(axnm axnmVar, axnm axnmVar2) {
        super(axnmVar);
        this.c = axnmVar2;
    }

    @Override // defpackage.aaom
    public final /* bridge */ /* synthetic */ boolean d(Object obj) {
        if (this.d != 0) {
            return ((ign) this.c.get()).b((apzg) obj) != null;
        }
        atzb b = ((aied) this.c.get()).b((apzg) obj);
        return b != null && !b.c;
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return this.d != 0 ? new aypg[]{airwVar.G().a.h(aiwv.n(airwVar.aB(), 33554432L)).h(aiwv.l(1)).aa(new ayqb(null) { // from class: igm
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                aidi aidiVar = aidi.this;
                if (((ahhw) obj).c() == aika.NEW) {
                    aidiVar.c();
                }
            }
        }, ick.c)} : new aypg[]{airwVar.G().a.h(aiwv.n(airwVar.aB(), 33554432L)).h(aiwv.l(1)).aa(new ayqb() { // from class: aidh
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                aidi aidiVar = aidi.this;
                if (((ahhw) obj).c() == aika.NEW) {
                    aidiVar.c();
                }
            }
        }, aiax.i)};
    }
}
