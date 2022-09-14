package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: PG */
/* renamed from: ssg  reason: default package */
/* loaded from: classes7.dex */
final class ssg implements btzi<djqw, djqy> {
    final /* synthetic */ int a;
    final /* synthetic */ degu b;
    final /* synthetic */ ssi c;

    public ssg(ssi ssiVar, int i, degu deguVar) {
        this.c = ssiVar;
        this.a = i;
        this.b = deguVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<djqw> btzrVar, btzy btzyVar) {
        this.c.c(this.a);
        if (btzyVar.equals(btzy.d)) {
            this.b.a(new CancellationException());
        } else {
            this.b.a(new qdy());
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<djqw> btzrVar, djqy djqyVar) {
        djqy djqyVar2 = djqyVar;
        this.c.c(this.a);
        albv.h(this.c.a, djqyVar2.a);
        degu deguVar = this.b;
        qbf qbfVar = new qbf();
        dsrj<dopk> dsrjVar = djqyVar2.a;
        if (dsrjVar != null) {
            qbfVar.a = dsrjVar;
            String str = qbfVar.a == null ? " stationsList" : "";
            if (!str.isEmpty()) {
                throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
            }
            deguVar.b(new qbg(qbfVar.a));
            return;
        }
        throw new NullPointerException("Null stationsList");
    }
}
