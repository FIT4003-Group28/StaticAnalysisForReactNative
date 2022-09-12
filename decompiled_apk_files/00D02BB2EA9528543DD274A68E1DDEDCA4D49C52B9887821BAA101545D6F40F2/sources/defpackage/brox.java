package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: brox  reason: default package */
/* loaded from: classes4.dex */
public final class brox implements btzi<dwir, dwiv> {
    final /* synthetic */ brpc a;

    public brox(brpc brpcVar) {
        this.a = brpcVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwir> btzrVar, btzy btzyVar) {
        synchronized (this.a) {
            this.a.d.a(2, 3, null);
            brpc brpcVar = this.a;
            if (!brpcVar.f) {
                brpcVar.j = btzyVar;
                if (brpcVar.g != null || brpcVar.h != null) {
                    brpcVar.d();
                }
            }
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwir> btzrVar, dwiv dwivVar) {
        dwiv dwivVar2 = dwivVar;
        synchronized (this.a) {
            brpe brpeVar = this.a.d;
            int i = 1;
            if (true == brpc.e(dwivVar2)) {
                i = 2;
            }
            brpeVar.a(2, i, dwivVar2);
            brpc brpcVar = this.a;
            if (brpcVar.f) {
                return;
            }
            brpcVar.k = btzrVar.d;
            brpcVar.i = dwivVar2;
            if (brpcVar.g == null && brpcVar.h == null) {
                if (!brpc.e(brpcVar.i)) {
                    brpc brpcVar2 = this.a;
                    this.a.c.a(new brow(this), this.a.n, Math.max(brpcVar2.e - brpcVar2.b.e(), 0L));
                }
                return;
            }
            brpcVar.d();
        }
    }
}
