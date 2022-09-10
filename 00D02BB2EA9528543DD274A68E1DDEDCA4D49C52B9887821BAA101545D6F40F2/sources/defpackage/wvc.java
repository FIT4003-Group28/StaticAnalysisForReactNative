package defpackage;
/* compiled from: PG */
/* renamed from: wvc  reason: default package */
/* loaded from: classes7.dex */
final class wvc implements btzi<djyy, djza> {
    private final qdv a;
    private final wvd b;
    private final wvb c;

    public wvc(qdv qdvVar, wvd wvdVar, wvb wvbVar) {
        this.a = qdvVar;
        this.b = wvdVar;
        this.c = wvbVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<djyy> btzrVar, btzy btzyVar) {
        this.b.c();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<djyy> btzrVar, djza djzaVar) {
        djza djzaVar2 = djzaVar;
        int a = doqd.a(djzaVar2.c);
        if (a != 0 && a == 1) {
            dopk dopkVar = djzaVar2.b;
            if (dopkVar == null) {
                dopkVar = dopk.x;
            }
            this.b.b(this.a, dopkVar);
            this.c.c(this.a, djzaVar2);
            return;
        }
        int a2 = doqd.a(djzaVar2.c);
        if (a2 == 0 || a2 != 6) {
            return;
        }
        this.b.c();
    }
}
