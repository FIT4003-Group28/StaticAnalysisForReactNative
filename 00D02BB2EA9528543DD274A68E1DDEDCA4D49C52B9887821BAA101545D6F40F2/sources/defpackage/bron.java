package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bron  reason: default package */
/* loaded from: classes4.dex */
public final class bron implements btzi<dwir, dwiv> {
    final /* synthetic */ broo a;

    public bron(broo brooVar) {
        this.a = brooVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwir> btzrVar, btzy btzyVar) {
        synchronized (this.a) {
            this.a.d.a(2, 3, null);
            broo brooVar = this.a;
            if (!brooVar.l) {
                brooVar.l = true;
                this.a.k.a(btzyVar.p);
                this.a.o.a(null, btzyVar.p, true, false, true);
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
            brooVar.l = true;
            broo brooVar2 = this.a;
            cqat cqatVar = brooVar2.b;
            dcdc<dtaq> c = brooVar2.c(btzrVar.d);
            broo brooVar3 = this.a;
            btul.c(cqatVar, c, brooVar3.m, dwivVar2, brooVar3.a);
            this.a.o.a(dwivVar2, null, true, false, true);
        }
    }
}
