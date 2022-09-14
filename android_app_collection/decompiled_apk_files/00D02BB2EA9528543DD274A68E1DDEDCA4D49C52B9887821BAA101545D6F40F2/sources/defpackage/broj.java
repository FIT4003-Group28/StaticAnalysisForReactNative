package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: broj  reason: default package */
/* loaded from: classes4.dex */
public final class broj implements btzi<dwir, dwiv> {
    final /* synthetic */ broo a;

    public broj(broo brooVar) {
        this.a = brooVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwir> btzrVar, btzy btzyVar) {
        synchronized (this.a) {
            this.a.d.a(1, true != btxz.e(btzyVar.p) ? 3 : 4, null);
            broo brooVar = this.a;
            if (!brooVar.l) {
                brooVar.g = btzyVar;
                if (brooVar.h != null || brooVar.i != null) {
                    brooVar.e();
                }
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
            brooVar.f = dwivVar2;
            brooVar.e();
        }
    }
}
