package defpackage;
/* compiled from: PG */
/* renamed from: byxn  reason: default package */
/* loaded from: classes4.dex */
public final class byxn {
    public final bvjj a;
    public final ckcw b;
    public final btvo c;

    public byxn(bvjj bvjjVar, ckcw ckcwVar, btvo btvoVar) {
        this.a = bvjjVar;
        this.b = ckcwVar;
        this.c = btvoVar;
    }

    public static bzhe a(final bzhe bzheVar, Iterable<Integer> iterable) {
        dsqp dsqpVar = (dsqp) bzheVar.cu(5);
        dsqpVar.bC(bzheVar);
        bzhd bzhdVar = (bzhd) dsqpVar;
        dcbg s = dcbg.b(iterable).o(new dbsl(bzheVar) { // from class: byxf
            private final bzhe a;

            {
                this.a = bzheVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                bzhe bzheVar2 = this.a;
                final int intValue = ((Integer) obj).intValue();
                return !dcft.m(bzheVar2.c, new dbsl(intValue) { // from class: byxh
                    private final int a;

                    {
                        this.a = intValue;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj2) {
                        return ((bzhb) obj2).b == this.a;
                    }
                }).a();
            }
        }).s(byxg.a);
        if (bzhdVar.c) {
            bzhdVar.bF();
            bzhdVar.c = false;
        }
        bzhe bzheVar2 = (bzhe) bzhdVar.b;
        bzhe bzheVar3 = bzhe.d;
        dsrj<bzhb> dsrjVar = bzheVar2.c;
        if (!dsrjVar.a()) {
            bzheVar2.c = dsqw.cl(dsrjVar);
        }
        dsod.bv(s, bzheVar2.c);
        return bzhdVar.bK();
    }
}
