package defpackage;

import android.content.res.Resources;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ept  reason: default package */
/* loaded from: classes6.dex */
public final class ept<T> implements dzsj<T> {
    final /* synthetic */ epu a;
    private final int b;

    public ept(epu epuVar, int i) {
        this.a = epuVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                epu epuVar = this.a;
                dzsj<Resources> fr = epuVar.g.eW.fr();
                dzsj<cqhn> il = epuVar.g.eW.il();
                dzsj dzsjVar = epuVar.a;
                if (dzsjVar == null) {
                    dzsjVar = new ept(epuVar, 1);
                    epuVar.a = dzsjVar;
                }
                return (T) new cfpe(fr, il, dzsjVar, epuVar.b(), epuVar.c(), epuVar.d(), epuVar.g.eW.aw(), dxjh.c(epuVar.g.tK()), epuVar.g.eW.V(), epuVar.g.eW.bk(), epuVar.g.eW.di(), epuVar.g.eW.at(), epuVar.b(), epuVar.c(), epuVar.d());
            case 1:
                epu epuVar2 = this.a;
                return (T) new cfns(epuVar2.g.eW.at(), epuVar2.g.eW.fr(), epuVar2.g.eW.na(), epuVar2.g.eW.nb(), epuVar2.g.eW.V(), epuVar2.g.eW.o());
            case 2:
                epu epuVar3 = this.a;
                dzsj dzsjVar2 = epuVar3.b;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new ept(epuVar3, 3);
                    epuVar3.b = dzsjVar2;
                }
                dzsj dzsjVar3 = epuVar3.d;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new ept(epuVar3, 4);
                    epuVar3.d = dzsjVar3;
                }
                dzsj dzsjVar4 = epuVar3.f;
                if (dzsjVar4 == null) {
                    dzsjVar4 = new ept(epuVar3, 6);
                    epuVar3.f = dzsjVar4;
                }
                return (T) new cfof(dzsjVar2, dzsjVar3, dzsjVar4);
            case 3:
                return (T) new cfos();
            case 4:
                epu epuVar4 = this.a;
                dzsj dzsjVar5 = epuVar4.c;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new ept(epuVar4, 5);
                    epuVar4.c = dzsjVar5;
                }
                return (T) new cfoq(dzsjVar5);
            case 5:
                return (T) new cfon(this.a.g.eW.il());
            case 6:
                epu epuVar5 = this.a;
                dzsj dzsjVar6 = epuVar5.e;
                if (dzsjVar6 == null) {
                    dzsjVar6 = new ept(epuVar5, 7);
                    epuVar5.e = dzsjVar6;
                }
                return (T) cfol.b(dzsjVar6);
            case 7:
                return (T) new cfoh(this.a.g.eW.il());
            case 8:
                return (T) new cfod(this.a.g.eW.il());
            case 9:
                return (T) new cfpg();
            default:
                epu epuVar6 = this.a;
                return (T) new bxbe(epuVar6.g.da(), epuVar6.g.eW.V(), dxjh.c(epuVar6.g.ic()));
        }
    }
}
