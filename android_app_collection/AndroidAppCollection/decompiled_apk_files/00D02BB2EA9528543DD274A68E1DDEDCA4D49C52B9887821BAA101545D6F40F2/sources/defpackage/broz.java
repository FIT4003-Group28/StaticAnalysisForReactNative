package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: broz  reason: default package */
/* loaded from: classes4.dex */
public final class broz implements btzi<dwir, dwiv> {
    final /* synthetic */ brpc a;

    public broz(brpc brpcVar) {
        this.a = brpcVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwir> btzrVar, btzy btzyVar) {
        synchronized (this.a) {
            this.a.d.a(2, 3, null);
            brpc brpcVar = this.a;
            if (!brpcVar.f) {
                brpcVar.f = true;
                this.a.m.a(null, btzyVar.p, true);
            }
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwir> btzrVar, dwiv dwivVar) {
        dwiv dwivVar2 = dwivVar;
        synchronized (this.a) {
            this.a.d.a(2, true != brpc.e(dwivVar2) ? 1 : 2, dwivVar2);
            brpc brpcVar = this.a;
            if (brpcVar.f) {
                return;
            }
            brpcVar.f = true;
            brpc brpcVar2 = this.a;
            cqat cqatVar = brpcVar2.b;
            dcdc<dtaq> c = brpcVar2.c(btzrVar.d);
            brpc brpcVar3 = this.a;
            btul.c(cqatVar, c, brpcVar3.l, dwivVar2, brpcVar3.a);
            this.a.m.a(dwivVar2, null, true);
        }
    }
}
