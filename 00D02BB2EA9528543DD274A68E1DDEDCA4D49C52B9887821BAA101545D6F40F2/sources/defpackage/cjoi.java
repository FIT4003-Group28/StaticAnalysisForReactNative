package defpackage;
/* compiled from: PG */
/* renamed from: cjoi  reason: default package */
/* loaded from: classes4.dex */
final class cjoi implements agvz {
    final /* synthetic */ cjoo a;

    public cjoi(cjoo cjooVar) {
        this.a = cjooVar;
    }

    @Override // defpackage.agvz
    public final void a(@dzsi final agwo agwoVar) {
        this.a.aB.execute(new Runnable(this, agwoVar) { // from class: cjoh
            private final cjoi a;
            private final agwo b;

            {
                this.a = this;
                this.b = agwoVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cjoi cjoiVar = this.a;
                agwo agwoVar2 = this.b;
                cjoo cjooVar = cjoiVar.a;
                cjooVar.i(cjooVar.af.a().j(), agwoVar2);
            }
        });
    }
}
