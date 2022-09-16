package defpackage;
/* compiled from: PG */
/* renamed from: aul  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class aul implements pwe {
    public final /* synthetic */ auz a;
    public final /* synthetic */ pms b;
    private final /* synthetic */ int c;

    public /* synthetic */ aul(auz auzVar, pms pmsVar) {
        this.a = auzVar;
        this.b = pmsVar;
    }

    public /* synthetic */ aul(auz auzVar, pms pmsVar, int i) {
        this.c = i;
        this.a = auzVar;
        this.b = pmsVar;
    }

    @Override // defpackage.pwe
    public final void a(Object obj) {
        int i = this.c;
        if (i == 0) {
            auz auzVar = this.a;
            pms pmsVar = this.b;
            ava avaVar = (ava) obj;
            avaVar.B();
            avaVar.e(auzVar, 1, pmsVar);
        } else if (i == 1) {
            auz auzVar2 = this.a;
            pms pmsVar2 = this.b;
            ava avaVar2 = (ava) obj;
            avaVar2.A();
            avaVar2.d(auzVar2, 1, pmsVar2);
        } else if (i == 2) {
            auz auzVar3 = this.a;
            pms pmsVar3 = this.b;
            ava avaVar3 = (ava) obj;
            avaVar3.aj();
            avaVar3.d(auzVar3, 2, pmsVar3);
        } else {
            auz auzVar4 = this.a;
            pms pmsVar4 = this.b;
            ava avaVar4 = (ava) obj;
            avaVar4.ak();
            avaVar4.e(auzVar4, 2, pmsVar4);
        }
    }
}
