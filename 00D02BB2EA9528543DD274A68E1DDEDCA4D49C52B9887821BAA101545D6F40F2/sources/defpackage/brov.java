package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: brov  reason: default package */
/* loaded from: classes4.dex */
public final class brov implements btzi<dwir, dwiv> {
    final /* synthetic */ brpc a;

    public brov(brpc brpcVar) {
        this.a = brpcVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwir> btzrVar, btzy btzyVar) {
        synchronized (this.a) {
            this.a.d.a(1, true != btxz.e(btzyVar.p) ? 3 : 4, null);
            brpc brpcVar = this.a;
            if (!brpcVar.f) {
                brpcVar.h = btzyVar;
                if (brpcVar.i != null || brpcVar.j != null) {
                    brpcVar.d();
                }
            }
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwir> btzrVar, dwiv dwivVar) {
        dwiv dwivVar2 = dwivVar;
        synchronized (this.a) {
            this.a.d.a(1, 1, dwivVar2);
            brpc brpcVar = this.a;
            if (brpcVar.f) {
                return;
            }
            brpcVar.g = dwivVar2;
            brpcVar.d();
        }
    }
}
