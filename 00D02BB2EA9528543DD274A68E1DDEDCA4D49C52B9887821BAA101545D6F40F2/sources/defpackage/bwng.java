package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bwng  reason: default package */
/* loaded from: classes4.dex */
public final class bwng {
    public static dtmr a(bwnh bwnhVar, List<dtid> list) {
        dtmq dtmqVar = (dtmq) dtmr.o.bZ();
        int i = bwnhVar.b;
        if (dtmqVar.c) {
            dtmqVar.bF();
            dtmqVar.c = false;
        }
        dtmr dtmrVar = (dtmr) dtmqVar.b;
        int i2 = dtmrVar.a | 2;
        dtmrVar.a = i2;
        dtmrVar.b = i;
        long j = bwnhVar.c;
        dtmrVar.a = i2 | 4;
        dtmrVar.c = j;
        dtmr dtmrVar2 = (dtmr) dtmqVar.b;
        dsrj<dtid> dsrjVar = dtmrVar2.f;
        if (!dsrjVar.a()) {
            dtmrVar2.f = dsqw.cl(dsrjVar);
        }
        dsod.bv(list, dtmrVar2.f);
        return (dtmr) dtmqVar.bK();
    }
}
