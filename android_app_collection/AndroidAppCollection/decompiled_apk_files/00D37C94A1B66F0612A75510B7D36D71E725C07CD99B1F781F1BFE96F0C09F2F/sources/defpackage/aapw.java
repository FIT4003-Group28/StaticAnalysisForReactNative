package defpackage;
/* compiled from: PG */
/* renamed from: aapw  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aapw implements ayqb {
    public final /* synthetic */ aaqd a;
    private final /* synthetic */ int b;

    public /* synthetic */ aapw(aaqd aaqdVar) {
        this.a = aaqdVar;
    }

    public /* synthetic */ aapw(aaqd aaqdVar, int i) {
        this.b = i;
        this.a = aaqdVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            aaqd aaqdVar = this.a;
            arhd arhdVar = (arhd) obj;
            aaqdVar.m = aaqdVar.a();
        } else if (i == 1) {
            aaqd aaqdVar2 = this.a;
            apyy apyyVar = (apyy) obj;
            aaqdVar2.l = aaqdVar2.a();
        } else {
            aaqd aaqdVar3 = this.a;
            apej apejVar = (apej) obj;
            aaqdVar3.k = aaqdVar3.a();
        }
    }
}
