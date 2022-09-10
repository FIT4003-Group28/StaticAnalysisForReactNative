package defpackage;
/* renamed from: bdnz  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bdnz {
    private final bdoc a;
    private final bdrs b;
    private final dcdn c;

    public bdnz(bdoc bdocVar, bdrs bdrsVar, dcdn dcdnVar) {
        this.a = bdocVar;
        this.b = bdrsVar;
        this.c = dcdnVar;
    }

    public final void a(final dbsg dbsgVar) {
        final bdoc bdocVar = this.a;
        bdrs bdrsVar = this.b;
        final dcdn dcdnVar = this.c;
        bdrsVar.a(new Runnable(bdocVar, dbsgVar, dcdnVar) { // from class: bdoa
            private final bdoc a;
            private final dbsg b;
            private final dcdn c;

            {
                this.a = bdocVar;
                this.b = dbsgVar;
                this.c = dcdnVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bdoc bdocVar2 = this.a;
                dbsg dbsgVar2 = this.b;
                dcdn dcdnVar2 = this.c;
                if (!dbsgVar2.a()) {
                    return;
                }
                bbtj bbtjVar = (bbtj) dbsgVar2.b();
                if (bdocVar2.j.q(bbtjVar)) {
                    bdocVar2.j.z(bbtjVar);
                }
                bdpa d = bdoc.d(bbtjVar, dcdnVar2);
                dbuh.d(d);
                d.m(bbtjVar);
                cqkx.p(d);
            }
        }, bvrj.UI_THREAD);
    }
}
