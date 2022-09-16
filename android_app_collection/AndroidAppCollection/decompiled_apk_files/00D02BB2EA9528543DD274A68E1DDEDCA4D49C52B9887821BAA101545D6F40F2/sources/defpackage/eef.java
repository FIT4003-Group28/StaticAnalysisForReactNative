package defpackage;
/* compiled from: PG */
/* renamed from: eef  reason: default package */
/* loaded from: classes.dex */
final class eef extends gh {
    final /* synthetic */ eeo a;

    public eef(eeo eeoVar) {
        this.a = eeoVar;
    }

    @Override // defpackage.gh
    public final void a(gn gnVar, fd fdVar) {
        eeo eeoVar = this.a;
        dbsi<fd, egu> dbsiVar = eeoVar.g;
        if (dbsiVar != null && dbsd.a(dbsiVar.a, fdVar)) {
            eeoVar.g = null;
        }
        eeoVar.b.a().i(fdVar);
    }
}
