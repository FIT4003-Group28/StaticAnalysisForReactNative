package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: broy  reason: default package */
/* loaded from: classes4.dex */
public final class broy implements btzi<dwir, dwiv> {
    final /* synthetic */ brpc a;

    public broy(brpc brpcVar) {
        this.a = brpcVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwir> btzrVar, btzy btzyVar) {
        synchronized (this.a) {
            this.a.d.a(1, true != btxz.e(btzyVar.p) ? 3 : 4, null);
            brpc brpcVar = this.a;
            if (!brpcVar.f) {
                brpcVar.f = true;
                this.a.m.a(null, btzyVar.p, false);
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
            brpcVar.f = true;
            this.a.m.a(dwivVar2, null, false);
        }
    }
}
