package defpackage;

import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: blxg  reason: default package */
/* loaded from: classes3.dex */
public final class blxg implements btzi<dvrc, dvre> {
    final /* synthetic */ blxo a;

    public blxg(blxo blxoVar) {
        this.a = blxoVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dvrc> btzrVar, btzy btzyVar) {
        this.a.h.d = 5;
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dvrc> btzrVar, dvre dvreVar) {
        dvre dvreVar2 = dvreVar;
        this.a.h.d = 4;
        dvyo bZ = dvyp.e.bZ();
        bZ.a(dvreVar2.b);
        blvw blvwVar = new blvw(bZ.bK());
        final blwa blwaVar = this.a.h.a;
        final dcdc<blvu> dcdcVar = blvwVar.a;
        blwaVar.g.b(new Runnable(blwaVar, dcdcVar) { // from class: blvx
            private final blwa a;
            private final dcdc b;

            {
                this.a = blwaVar;
                this.b = dcdcVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final blwa blwaVar2 = this.a;
                dcdc<blvu> b = blwl.b(blwaVar2.e, this.b, blwaVar2.f.o());
                blvu a = blwaVar2.a();
                dccx F = dcdc.F();
                dccx F2 = dcdc.F();
                int size = b.size();
                for (int i = 0; i < size; i++) {
                    blvu blvuVar = b.get(i);
                    if (a == null || !blvuVar.b.equals(a.b)) {
                        F2.g(blvuVar);
                    } else {
                        F.g(blvuVar);
                    }
                }
                final dcdc f = F.f();
                final dcdc f2 = F2.f();
                blwaVar2.g.b(new Runnable(blwaVar2, f, f2) { // from class: blvy
                    private final blwa a;
                    private final dcdc b;
                    private final dcdc c;

                    {
                        this.a = blwaVar2;
                        this.b = f;
                        this.c = f2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        blwa blwaVar3 = this.a;
                        dcdc dcdcVar2 = this.b;
                        dcdc<blvu> dcdcVar3 = this.c;
                        blwaVar3.d.b(dcdcVar2);
                        blwaVar3.a = dcdcVar3;
                        HashMap hashMap = new HashMap();
                        for (blvu blvuVar2 : dcdcVar3) {
                            if (hashMap.containsKey(blvuVar2.b)) {
                                String str = blvuVar2.b;
                                hashMap.put(str, Integer.valueOf(((Integer) hashMap.get(str)).intValue() + 1));
                            } else {
                                hashMap.put(blvuVar2.b, 1);
                            }
                        }
                        blwaVar3.c = dcdn.r(hashMap);
                    }
                }, bvrj.UI_THREAD);
            }
        }, bvrj.BACKGROUND_THREADPOOL);
        blxo blxoVar = this.a;
        blxoVar.d = true;
        blxoVar.e = dvreVar2.b.size() == 0;
        blxo blxoVar2 = this.a;
        if (!blxoVar2.c) {
            int i = dvreVar2.a;
            if ((i & 2) != 0 && (4 & i) != 0) {
                blxoVar2.a += dvreVar2.c;
                blxoVar2.b += dvreVar2.d;
                blxoVar2.c = true;
            }
        }
        int i2 = dvreVar2.a;
        if ((i2 & 8) != 0) {
            blxoVar2.g = dvreVar2.e;
        }
        if ((i2 & 16) != 0) {
            blxoVar2.f = dvreVar2.f;
        }
    }
}
