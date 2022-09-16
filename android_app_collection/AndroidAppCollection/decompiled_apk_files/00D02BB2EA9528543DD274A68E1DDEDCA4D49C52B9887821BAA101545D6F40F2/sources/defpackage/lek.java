package defpackage;
/* compiled from: PG */
/* renamed from: lek  reason: default package */
/* loaded from: classes7.dex */
public final class lek implements kyx {
    final /* synthetic */ les a;

    public lek(les lesVar) {
        this.a = lesVar;
    }

    @Override // defpackage.kyx
    public final void a(ldm ldmVar, boolean z) {
        mnz mnzVar;
        this.a.g.a();
        les lesVar = this.a;
        kdk kdkVar = kdk.NOTHING;
        if (z) {
            mnzVar = mnz.MAP_INTERACTION_DROPPED_PIN;
        } else {
            mnzVar = mnz.MAP_INTERACTION_POI;
        }
        lesVar.z(ldmVar, kdkVar, null, true, mnzVar);
        this.a.g.b();
    }
}
