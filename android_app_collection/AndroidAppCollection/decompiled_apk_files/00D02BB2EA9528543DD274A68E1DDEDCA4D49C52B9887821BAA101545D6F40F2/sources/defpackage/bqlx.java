package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bqlx  reason: default package */
/* loaded from: classes4.dex */
public final class bqlx implements bqlb {
    final /* synthetic */ bwrs a;
    final /* synthetic */ bqjh b;
    final /* synthetic */ bqly c;

    public bqlx(bqly bqlyVar, bwrs bwrsVar, bqjh bqjhVar) {
        this.c = bqlyVar;
        this.a = bwrsVar;
        this.b = bqjhVar;
    }

    @Override // defpackage.bqlb
    public final void d(bqlf bqlfVar) {
        bqly bqlyVar = this.c;
        bwqv bwqvVar = bqlyVar.d;
        bwrs bwrsVar = this.a;
        bqjh bqjhVar = this.b;
        dbsg<djgl> c = bqlfVar.c();
        if (c.a()) {
            bqjf q = bqjhVar.q();
            q.n(chbv.ALWAYS_SHOW);
            bqjhVar = q.o();
        }
        bqlyVar.g(bqxf.q(bqxf.aV(bwqvVar, bwrsVar, bqjhVar, c)), this.b);
    }

    @Override // defpackage.bqlb
    public final void e() {
    }
}
