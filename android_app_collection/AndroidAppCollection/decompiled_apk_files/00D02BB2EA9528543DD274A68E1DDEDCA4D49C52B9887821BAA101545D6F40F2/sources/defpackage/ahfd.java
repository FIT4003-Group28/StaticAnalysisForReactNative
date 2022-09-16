package defpackage;
/* compiled from: PG */
/* renamed from: ahfd  reason: default package */
/* loaded from: classes2.dex */
final class ahfd implements crzp<dqaw> {
    dfqe a = null;
    final /* synthetic */ String b;
    final /* synthetic */ ahff c;

    public ahfd(ahff ahffVar, String str) {
        this.c = ahffVar;
        this.b = str;
    }

    @Override // defpackage.crzp
    public final void On(crzm<dqaw> crzmVar) {
        dqaw l = crzmVar.l();
        if (l != null) {
            dfqe dfqeVar = this.a;
            if (dfqeVar != null && !dfqeVar.equals(dfqe.FOLLOWING_PUBLICLY)) {
                dfqe b = dfqe.b(l.b);
                if (b == null) {
                    b = dfqe.UNDEFINED_STATE;
                }
                if (b.equals(dfqe.FOLLOWING_PUBLICLY)) {
                    ahff ahffVar = this.c;
                    String str = this.b;
                    ahin ahinVar = ahffVar.n;
                    if (ahinVar != null && ahinVar.g.f()) {
                        ahinVar.o.add(str);
                        ahinVar.N(dcdc.r(ahinVar.o));
                    }
                }
            }
            dfqe dfqeVar2 = this.a;
            if (dfqeVar2 != null && dfqeVar2.equals(dfqe.FOLLOWING_PUBLICLY)) {
                dfqe b2 = dfqe.b(l.b);
                if (b2 == null) {
                    b2 = dfqe.UNDEFINED_STATE;
                }
                if (b2.equals(dfqe.NOT_FOLLOWING)) {
                    ahff ahffVar2 = this.c;
                    String str2 = this.b;
                    ahin ahinVar2 = ahffVar2.n;
                    if (ahinVar2 != null && ahinVar2.g.f()) {
                        ahinVar2.n.h();
                        ahinVar2.o.remove(str2);
                    }
                }
            }
            dfqe b3 = dfqe.b(l.b);
            if (b3 == null) {
                b3 = dfqe.UNDEFINED_STATE;
            }
            this.a = b3;
        }
    }
}
