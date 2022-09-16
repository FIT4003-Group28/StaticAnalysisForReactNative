package defpackage;

import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: vst  reason: default package */
/* loaded from: classes7.dex */
final class vst extends akvn<akte> {
    final /* synthetic */ amub a;
    final /* synthetic */ boolean b;
    final /* synthetic */ vtb c;

    public vst(vtb vtbVar, amub amubVar, boolean z) {
        this.c = vtbVar;
        this.a = amubVar;
        this.b = z;
    }

    @Override // defpackage.akvo
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        final akte akteVar = (akte) obj;
        bvrb bvrbVar = this.c.c;
        final amub amubVar = this.a;
        final boolean z = this.b;
        bvrbVar.b(new Runnable(this, akteVar, amubVar, z) { // from class: vss
            private final vst a;
            private final akte b;
            private final amub c;
            private final boolean d;

            {
                this.a = this;
                this.b = akteVar;
                this.c = amubVar;
                this.d = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                vst vstVar = this.a;
                akte akteVar2 = this.b;
                amub amubVar2 = this.c;
                boolean z2 = this.d;
                ConcurrentHashMap<Integer, cjql> concurrentHashMap = vstVar.c.y;
                dmqg dmqgVar = (dmqg) akteVar2.k();
                int i = dmqgVar.bC;
                if (i == 0) {
                    i = dsst.a.b(dmqgVar).c(dmqgVar);
                    dmqgVar.bC = i;
                }
                cjql cjqlVar = concurrentHashMap.get(Integer.valueOf(i));
                if (cjqlVar != null) {
                    cjqy cjqyVar = vstVar.c.r;
                    cjta b = cjtd.b();
                    b.g(amubVar2.g());
                    b.d = z2 ? dtyi.cg : dtyi.ch;
                    cjqyVar.j(cjqlVar, b.a());
                    ConcurrentHashMap<Integer, cjql> concurrentHashMap2 = vstVar.c.y;
                    dmqg dmqgVar2 = (dmqg) akteVar2.k();
                    int i2 = dmqgVar2.bC;
                    if (i2 == 0) {
                        i2 = dsst.a.b(dmqgVar2).c(dmqgVar2);
                        dmqgVar2.bC = i2;
                    }
                    concurrentHashMap2.remove(Integer.valueOf(i2));
                }
            }
        }, bvrj.UI_THREAD);
        this.c.b.b(new alco(this.a));
    }
}
