package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: leb  reason: default package */
/* loaded from: classes7.dex */
public final class leb implements asmo {
    public final askx a;
    public final aszs b;
    public final mau c;
    private final aswk d;

    public leb(cqhn cqhnVar, Context context, btrm btrmVar, bvjj bvjjVar, final dxio dxioVar, brlz brlzVar, jzv jzvVar, final dxio dxioVar2, btvo btvoVar, ckcw ckcwVar, akfa akfaVar, cjqy cjqyVar, cjqq cjqqVar, dehq dehqVar, Executor executor, crem cremVar, final dxio dxioVar3, cqat cqatVar, final dxio dxioVar4, bvsl bvslVar, asxu asxuVar, broq broqVar, arbu arbuVar, akox akoxVar, asvx asvxVar, qbo qboVar, gll gllVar, awpk awpkVar, jzp jzpVar, dcdc dcdcVar, asik asikVar, aufc aufcVar, brcw brcwVar, dxio dxioVar5, asxm asxmVar, lxj lxjVar, kdg kdgVar, dxio dxioVar6, koc kocVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(asxmVar);
        arrayList.addAll(dcdcVar);
        askx askxVar = new askx(context.getResources(), akoxVar, gllVar, arbuVar, asvxVar, asxmVar, null, btvoVar, cjqqVar);
        this.a = askxVar;
        arrayList.add(askxVar);
        arrayList.add(new lxe(asxuVar, asxmVar, btrmVar, askxVar, akoxVar, qboVar, cjqyVar, aufcVar, dxioVar5, dehqVar, lxjVar));
        asuk asukVar = new asuk(context, cqhnVar, cremVar, btvoVar);
        dxioVar3.getClass();
        dzsj dzsjVar = new dzsj(dxioVar3) { // from class: mai
            private final dxio a;

            {
                this.a = dxioVar3;
            }

            @Override // defpackage.dzsj
            public final Object a() {
                return this.a.a();
            }
        };
        dzsj a = dczx.a(btvoVar);
        dzsj a2 = dczx.a(cqatVar);
        dzsj a3 = dczx.a(context);
        dxioVar4.getClass();
        dzsj dzsjVar2 = new dzsj(dxioVar4) { // from class: maj
            private final dxio a;

            {
                this.a = dxioVar4;
            }

            @Override // defpackage.dzsj
            public final Object a() {
                return this.a.a();
            }
        };
        dzsj a4 = dczx.a(bvslVar);
        dzsj a5 = dczx.a(btrmVar);
        dzsj a6 = dczx.a(Boolean.valueOf(jzpVar.h()));
        dzsj a7 = dczx.a(map.a(context));
        dxioVar2.getClass();
        dzsj dzsjVar3 = new dzsj(dxioVar2) { // from class: mak
            private final dxio a;

            {
                this.a = dxioVar2;
            }

            @Override // defpackage.dzsj
            public final Object a() {
                return this.a.a();
            }
        };
        dzsj a8 = dczx.a(jzvVar);
        dxioVar.getClass();
        dzsj dzsjVar4 = new dzsj(dxioVar) { // from class: mal
            private final dxio a;

            {
                this.a = dxioVar;
            }

            @Override // defpackage.dzsj
            public final Object a() {
                return this.a.a();
            }
        };
        dzsj a9 = dczx.a(bvjjVar);
        dzsj a10 = dczx.a(brlzVar);
        dzsj a11 = dczx.a(asxuVar);
        dzsj a12 = dczx.a(dbsg.i(asxmVar));
        dzsj a13 = dczx.a(asxmVar);
        dzsj a14 = dczx.a(cjqyVar);
        dzsj a15 = dczx.a(cjqqVar);
        dzsj a16 = dczx.a(dehqVar);
        dzsj a17 = dczx.a(executor);
        dzsj a18 = dczx.a(cqhnVar);
        aszs aszsVar = new aszs(cqhnVar, asxuVar, asxmVar, akfaVar, context, btrmVar, asukVar, new lzn(man.a(btvoVar, dzsjVar, a, a2, a3, dzsjVar2, a5, a6, a7, dzsjVar3, a8, a10, a12, a16, a17, a14, a15, dczx.a(cremVar)), man.b(a5, dzsjVar, a3, a2, a14, a15, a16, a17, a7, dzsjVar4, a4, a6, a18, a), man.c(a5, dzsjVar, a3, a2, a14, a15, a16, a17, a7, a6, a18, a, a9), new atts(a3, a5, a, dzsjVar, a2, a14, a15, dzsjVar2, a4, a16, a17, a7, a11, a13, a6)), null, btvoVar, asikVar, null, null, null, null);
        this.b = aszsVar;
        arrayList.add(aszsVar);
        arrayList.add(awpkVar);
        if (!kdgVar.o()) {
            aslx aslxVar = new aslx(asxmVar, btrmVar);
            aslxVar.j(false);
            arrayList.add(aslxVar);
        }
        mau mauVar = new mau(cqatVar, context, btvoVar, akfaVar, bvjjVar, dxioVar3, broqVar, ckcwVar, asxmVar, akoxVar, brcwVar, dxioVar6, kocVar);
        this.c = mauVar;
        arrayList.add(mauVar);
        this.d = new aswk(arrayList, asxmVar, aszsVar);
    }

    @Override // defpackage.asmo
    public final void NZ(@dzsi Bundle bundle) {
        this.d.NZ(bundle);
    }

    @Override // defpackage.asmo
    public final void Qo(Configuration configuration) {
        this.d.Qo(configuration);
    }

    @Override // defpackage.asmo
    public final void Qp() {
        this.d.Qp();
    }

    @Override // defpackage.asmo
    public final void Qr(Bundle bundle) {
        this.d.Qr(bundle);
    }

    @Override // defpackage.asmo
    public final void b() {
        this.d.b();
    }

    @Override // defpackage.asmo
    public final void c() {
        this.d.c();
    }
}
