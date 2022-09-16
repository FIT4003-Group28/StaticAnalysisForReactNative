package defpackage;
/* compiled from: PG */
/* renamed from: ppc  reason: default package */
/* loaded from: classes7.dex */
final class ppc implements degu<String> {
    final /* synthetic */ dvdy a;
    final /* synthetic */ pow b;
    final /* synthetic */ ppd c;

    public ppc(ppd ppdVar, dvdy dvdyVar, pow powVar) {
        this.c = ppdVar;
        this.a = dvdyVar;
        this.b = powVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(String str) {
        String str2 = str;
        final ppd ppdVar = this.c;
        dvdy dvdyVar = this.a;
        int i = dvdyVar.b;
        String str3 = dvdyVar.j;
        final pow powVar = this.b;
        ppdVar.d = dbsg.i(str2);
        ppdVar.b.a().m().f().r(str2, i, str3, new Runnable(ppdVar, powVar) { // from class: pox
            private final ppd a;
            private final pow b;

            {
                this.a = ppdVar;
                this.b = powVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ppd ppdVar2 = this.a;
                final pow powVar2 = this.b;
                ppdVar2.c.b(new Runnable(powVar2) { // from class: poy
                    private final pow a;

                    {
                        this.a = powVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.l(false);
                    }
                }, bvrj.UI_THREAD);
            }
        });
    }
}
