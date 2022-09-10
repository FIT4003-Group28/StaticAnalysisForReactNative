package defpackage;
/* compiled from: PG */
/* renamed from: jtt  reason: default package */
/* loaded from: classes7.dex */
final class jtt implements crzp<aufb> {
    final /* synthetic */ jtu a;

    public jtt(jtu jtuVar) {
        this.a = jtuVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<aufb> crzmVar) {
        bvrj.UI_THREAD.c();
        aufb l = crzmVar.l();
        dbsk.s(l);
        boolean z = l.c;
        kcx kcxVar = this.a.as;
        kcxVar.a = z;
        kcxVar.a();
        jtz jtzVar = this.a.ae;
        dbsk.s(jtzVar);
        jtzVar.setNightMode(z);
        this.a.X.q().b();
    }
}
