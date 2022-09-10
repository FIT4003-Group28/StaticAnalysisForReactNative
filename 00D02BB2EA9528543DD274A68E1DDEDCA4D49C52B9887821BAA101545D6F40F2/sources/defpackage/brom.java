package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: brom  reason: default package */
/* loaded from: classes4.dex */
public final class brom implements btzi<dwir, dwiv> {
    final /* synthetic */ broo a;

    public brom(broo brooVar) {
        this.a = brooVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwir> btzrVar, btzy btzyVar) {
        synchronized (this.a) {
            this.a.d.a(1, true != btxz.e(btzyVar.p) ? 3 : 4, null);
            broo brooVar = this.a;
            if (!brooVar.l) {
                brooVar.l = true;
                this.a.k.a(btzyVar.p);
                this.a.o.a(null, btzyVar.p, false, false, true);
            }
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwir> btzrVar, dwiv dwivVar) {
        dwiv dwivVar2 = dwivVar;
        synchronized (this.a) {
            this.a.d.a(1, 1, dwivVar2);
            broo brooVar = this.a;
            if (brooVar.l) {
                return;
            }
            brooVar.l = true;
            this.a.o.a(dwivVar2, null, false, false, true);
        }
    }
}
