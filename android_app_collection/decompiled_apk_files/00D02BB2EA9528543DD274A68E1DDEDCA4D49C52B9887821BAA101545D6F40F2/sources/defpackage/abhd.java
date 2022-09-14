package defpackage;
/* compiled from: PG */
/* renamed from: abhd  reason: default package */
/* loaded from: classes2.dex */
final class abhd extends cqiw<cqkp> {
    final /* synthetic */ abhe a;
    private final dcdc b;
    private final int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abhd(abhe abheVar, dcdc dcdcVar, int i) {
        super(dcdcVar, Integer.valueOf(i));
        this.a = abheVar;
        this.b = dcdcVar;
        this.c = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cqkp> a() {
        cqmj<cqkp> gd = cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(0));
        cqmj f = this.a.f();
        int i = 0;
        while (true) {
            abhe abheVar = this.a;
            if (i < abheVar.a) {
                abheVar.b = this.c + i;
                dcdc dcdcVar = this.b;
                cqmj fY = cqgr.fY(cqgr.bp(-1), cqgr.cd(-1), cqgr.ca(Float.valueOf(1.0f)));
                if (dcdcVar.size() > i) {
                    fY.f(cqgr.fP(abheVar.e(), cqkz.a((cqkp) dcdcVar.get(i)), cqgr.bp(-1)));
                }
                gd.g(fY);
                if (f != null) {
                    abhe abheVar2 = this.a;
                    if (i + 1 < abheVar2.a) {
                        cqmj f2 = abheVar2.f();
                        dbsk.s(f2);
                        f2.g(cqgr.bp(-1));
                        gd.g(f2);
                    }
                }
                i++;
            } else {
                return gd;
            }
        }
    }
}
