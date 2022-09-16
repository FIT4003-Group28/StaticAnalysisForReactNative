package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adjw  reason: default package */
/* loaded from: classes.dex */
public final class adjw implements airt {
    final /* synthetic */ adjx a;
    private final /* synthetic */ int b;

    public adjw(adjx adjxVar) {
        this.a = adjxVar;
    }

    public adjw(adjx adjxVar, int i) {
        this.b = i;
        this.a = adjxVar;
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return this.b != 0 ? new aypg[]{airwVar.G().i.Z(new ayqb(null) { // from class: adju
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                adjw adjwVar = adjw.this;
                if (((ahia) obj).a() == 2) {
                    adjwVar.a.e();
                }
            }
        })} : new aypg[]{airwVar.ao().Z(new ayqb() { // from class: adjv
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                adjw adjwVar = adjw.this;
                if (((ahhm) obj).c().a(aijx.NEW)) {
                    adjwVar.a.e();
                }
            }
        })};
    }
}
