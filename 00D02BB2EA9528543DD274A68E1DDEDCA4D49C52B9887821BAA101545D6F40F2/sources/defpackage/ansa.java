package defpackage;
/* compiled from: PG */
/* renamed from: ansa  reason: default package */
/* loaded from: classes2.dex */
public final class ansa implements btzi<dvbj, dvbp> {
    final /* synthetic */ aopy a;

    public ansa(aopy aopyVar) {
        this.a = aopyVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dvbj> btzrVar, btzy btzyVar) {
        this.a.b();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dvbj> btzrVar, dvbp dvbpVar) {
        dvbp dvbpVar2 = dvbpVar;
        int a = dvbo.a(dvbpVar2.a);
        if (a != 0) {
            int i = 2;
            if (a == 2) {
                if (dvbpVar2.b.isEmpty()) {
                    this.a.a(dbpy.a);
                    return;
                }
                dvbm dvbmVar = dvbpVar2.b.get(0);
                dnhe dnheVar = dvbmVar.a;
                if (dnheVar == null) {
                    dnheVar = dnhe.b;
                }
                dngs dngsVar = dnheVar.a;
                if (dngsVar == null) {
                    dngsVar = dngs.h;
                }
                eaph c = aogc.c(dngsVar);
                dnhe dnheVar2 = dvbmVar.b;
                if (dnheVar2 == null) {
                    dnheVar2 = dnhe.b;
                }
                dngs dngsVar2 = dnheVar2.a;
                if (dngsVar2 == null) {
                    dngsVar2 = dngs.h;
                }
                eaph c2 = aogc.c(dngsVar2);
                if (true != dvbmVar.c) {
                    i = 1;
                }
                this.a.a(dbsg.i(aogy.c(aogf.c(c, c2), i)));
                return;
            }
        }
        this.a.b();
    }
}
