package defpackage;
/* compiled from: PG */
/* renamed from: bzeb  reason: default package */
/* loaded from: classes4.dex */
final class bzeb implements dbsz<bzek> {
    final /* synthetic */ bzec a;

    public bzeb(bzec bzecVar) {
        this.a = bzecVar;
    }

    @Override // defpackage.dbsz
    public final /* bridge */ /* synthetic */ void NU(bzek bzekVar) {
        bzek bzekVar2 = bzekVar;
        bzec bzecVar = this.a;
        if (bzecVar.h != bzekVar2) {
            bzekVar2.getClass();
            dbsk.s(bzekVar2);
            bzecVar.h = bzekVar2;
            if (bzekVar2 instanceof bzdm) {
                byzk byzkVar = this.a.d;
                dbsk.s(byzkVar.p);
                ddrx ddrxVar = byzkVar.p;
                if (ddrxVar.c) {
                    ddrxVar.bF();
                    ddrxVar.c = false;
                }
                ddsh ddshVar = (ddsh) ddrxVar.b;
                ddsh ddshVar2 = ddsh.w;
                ddshVar.a |= 8;
                ddshVar.e = true;
            }
        }
        this.a.b.a();
    }
}
