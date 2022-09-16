package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: kyv  reason: default package */
/* loaded from: classes3.dex */
final class kyv implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ kyz d;

    public kyv(kyz kyzVar, List list, int i, int i2) {
        this.d = kyzVar;
        this.a = list;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aqtb aqtbVar;
        awdi awdiVar;
        kyz kyzVar = this.d;
        List list = this.a;
        int i = this.b;
        int i2 = this.c;
        awcz awczVar = (awcz) list.get(i);
        int i3 = awczVar.b;
        if (i3 != 122814739) {
            if (i3 != 153515154) {
                return;
            }
            ajsm ajsmVar = kyzVar.a;
            Object obj = ajsmVar.get(i2 + kyzVar.i);
            if (awczVar.b == 153515154) {
                aqtbVar = (aqtb) awczVar.c;
            } else {
                aqtbVar = aqtb.a;
            }
            ajsmVar.o(obj, ajhh.a(aqtbVar));
            return;
        }
        ajsm ajsmVar2 = kyzVar.a;
        Object obj2 = ajsmVar2.get(kyzVar.i + i2);
        if (awczVar.b == 122814739) {
            awdiVar = (awdi) awczVar.c;
        } else {
            awdiVar = awdi.a;
        }
        ajsmVar2.o(obj2, awdiVar);
        if (i >= list.size() - 1 || !kyz.d(awczVar)) {
            return;
        }
        ajsm ajsmVar3 = kyzVar.a;
        ajsmVar3.o(ajsmVar3.get(i2 + 1 + kyzVar.i), new laa());
    }
}
