package defpackage;
/* compiled from: PG */
/* renamed from: bqhf  reason: default package */
/* loaded from: classes4.dex */
public abstract class bqhf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static bqhe d() {
        bqgr bqgrVar = new bqgr();
        bqgrVar.d(5);
        bqhq bZ = bqhr.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bqhr bqhrVar = (bqhr) bZ.b;
        bqhrVar.a |= 1;
        bqhrVar.b = 0;
        bqhr bK = bZ.bK();
        dnps bZ2 = dnqe.i.bZ();
        dnqb dnqbVar = dnqb.UNKNOWN_ENTRY_POINT;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnqe dnqeVar = (dnqe) bZ2.b;
        dnqeVar.b = dnqbVar.ah;
        dnqeVar.a |= 1;
        bqgrVar.b(new bqgw(bK, bZ2.bK()));
        bqgrVar.c(-1);
        return bqgrVar;
    }

    public abstract int a();

    public abstract bqgw b();

    public abstract int c();
}
