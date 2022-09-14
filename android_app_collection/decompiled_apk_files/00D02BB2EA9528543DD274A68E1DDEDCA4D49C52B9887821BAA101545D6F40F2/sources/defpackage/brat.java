package defpackage;
/* compiled from: PG */
/* renamed from: brat  reason: default package */
/* loaded from: classes4.dex */
public final class brat {
    public final btvo a;
    public final dcep<dpvf> b;
    public final dcep<dpvf> c;
    public final dcep<dpvf> d;
    public final dcep<dpvf> e;
    private final dxio<btpc> f;

    public brat(btvo btvoVar, dxio<btpc> dxioVar) {
        this.a = btvoVar;
        this.f = dxioVar;
        this.e = dcbg.b(btvoVar.getExploreMapParametersWithoutLogging().v).s(bran.a).o(dbss.NOT_NULL).B();
        this.c = dcbg.b(btvoVar.getExploreMapParametersWithoutLogging().B).s(brao.a).o(dbss.NOT_NULL).B();
        final dcep<dpvf> B = dcbg.b(btvoVar.getExploreMapParametersWithoutLogging().A).s(brap.a).o(dbss.NOT_NULL).B();
        this.b = B;
        this.d = dcbg.b(btvoVar.getExploreMapParametersWithoutLogging().y).s(braq.a).o(dbss.NOT_NULL).B();
        dcbg o = dcbg.b(btvoVar.getExploreMapParametersWithoutLogging().D).s(brar.a).o(dbss.NOT_NULL);
        B.getClass();
        o.o(new dbsl(B) { // from class: bras
            private final dcep a;

            {
                this.a = B;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return this.a.contains((dpvf) obj);
            }
        }).B();
    }

    public final boolean a() {
        return this.a.getExploreMapParametersWithoutLogging().I;
    }

    public final boolean b() {
        return this.a.getCategoricalSearchParameters().z();
    }

    public final int c() {
        int a = dkji.a(this.a.getExploreMapParametersWithoutLogging().E);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    public final int d() {
        if (!this.f.a().i()) {
            return 2;
        }
        int a = dkkh.a(this.a.getExploreMapParametersWithoutLogging().e);
        if (a == 0) {
            a = 1;
        }
        if (a == 4) {
            return 4;
        }
        return a == 3 ? 3 : 2;
    }
}
