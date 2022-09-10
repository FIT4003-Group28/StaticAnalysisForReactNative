package defpackage;
/* compiled from: PG */
/* renamed from: rha  reason: default package */
/* loaded from: classes7.dex */
public final class rha {
    private final btvo a;

    public rha(btvo btvoVar) {
        this.a = btvoVar;
    }

    private static dngu d(int i) {
        int i2 = i / 60;
        int i3 = i % 60;
        dngt bZ = dngu.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dngu dnguVar = (dngu) bZ.b;
        int i4 = dnguVar.a | 1;
        dnguVar.a = i4;
        dnguVar.b = i2;
        int i5 = i4 | 2;
        dnguVar.a = i5;
        dnguVar.c = i3;
        dnguVar.a = i5 | 4;
        dnguVar.d = 0;
        return bZ.bK();
    }

    public final dcep<Integer> a() {
        final int i = this.a.getCommuteSetupParameters().c;
        return dcbg.b(dcaf.a(dclz.g(0, 7), dcat.a)).o(new dbsl(i) { // from class: rgy
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return ((1 << ((Integer) obj).intValue()) & this.a) != 0;
            }
        }).s(rgz.a).B();
    }

    public final dngu b() {
        return d(this.a.getCommuteSetupParameters().d);
    }

    public final dngu c() {
        return d(this.a.getCommuteSetupParameters().e);
    }
}
