package defpackage;
/* compiled from: PG */
/* renamed from: fzy  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fzy implements ylv {
    public final /* synthetic */ gac a;
    public final /* synthetic */ gab b;
    public final /* synthetic */ aspb c;
    public final /* synthetic */ asov d;
    private final /* synthetic */ int e;

    public /* synthetic */ fzy(gac gacVar, gab gabVar, aspb aspbVar, asov asovVar) {
        this.a = gacVar;
        this.b = gabVar;
        this.c = aspbVar;
        this.d = asovVar;
    }

    public /* synthetic */ fzy(gac gacVar, gab gabVar, aspb aspbVar, asov asovVar, int i) {
        this.e = i;
        this.a = gacVar;
        this.b = gabVar;
        this.c = aspbVar;
        this.d = asovVar;
    }

    @Override // defpackage.zdt
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        int i = this.e;
        if (i == 0) {
            b((Throwable) obj);
        } else if (i == 1) {
            b((Throwable) obj);
        } else {
            b((Throwable) obj);
        }
    }

    @Override // defpackage.ylv
    public final void b(Throwable th) {
        int i = this.e;
        if (i == 0) {
            gac gacVar = this.a;
            gab gabVar = this.b;
            aspb aspbVar = this.c;
            asov asovVar = this.d;
            zep.d("Error rating", th);
            gacVar.a.e(th);
            gabVar.a(aspbVar, asovVar);
        } else if (i == 1) {
            gac gacVar2 = this.a;
            gab gabVar2 = this.b;
            aspb aspbVar2 = this.c;
            asov asovVar2 = this.d;
            zep.d("Error rating", th);
            gacVar2.a.e(th);
            gabVar2.a(aspbVar2, asovVar2);
        } else {
            gac gacVar3 = this.a;
            gab gabVar3 = this.b;
            aspb aspbVar3 = this.c;
            asov asovVar3 = this.d;
            zep.d("Error rating", th);
            gacVar3.a.e(th);
            gabVar3.a(aspbVar3, asovVar3);
        }
    }
}
