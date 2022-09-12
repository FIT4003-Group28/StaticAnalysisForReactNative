package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: brol  reason: default package */
/* loaded from: classes4.dex */
public final class brol implements btzi<dwir, dwiv> {
    final /* synthetic */ broo a;

    public brol(broo brooVar) {
        this.a = brooVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwir> btzrVar, btzy btzyVar) {
        synchronized (this.a) {
            this.a.d.a(2, 3, null);
            broo brooVar = this.a;
            if (!brooVar.l) {
                brooVar.i = btzyVar;
                if (brooVar.f != null || brooVar.g != null) {
                    brooVar.e();
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
            if (true == broo.f(dwivVar2)) {
                i = 2;
            }
            brpeVar.a(2, i, dwivVar2);
            broo brooVar = this.a;
            if (brooVar.l) {
                return;
            }
            brooVar.j = btzrVar.d;
            brooVar.h = dwivVar2;
            if (brooVar.f == null && brooVar.g == null) {
                if (!broo.f(brooVar.h)) {
                    broo brooVar2 = this.a;
                    this.a.c.a(new brok(this), this.a.n, Math.max(brooVar2.e - brooVar2.b.e(), 0L));
                }
                return;
            }
            brooVar.e();
        }
    }
}
