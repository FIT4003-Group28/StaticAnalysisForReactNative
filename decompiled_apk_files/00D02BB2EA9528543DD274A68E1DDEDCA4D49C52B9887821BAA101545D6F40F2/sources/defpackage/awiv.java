package defpackage;

import java.util.Collection;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awiv  reason: default package */
/* loaded from: classes3.dex */
public final class awiv {
    public final HashMap<String, awhv> a = new HashMap<>();
    final /* synthetic */ awiw b;
    @dzsi
    private final btlu c;
    private final awhw d;

    public awiv(@dzsi awiw awiwVar, btlu btluVar, awhw awhwVar) {
        this.b = awiwVar;
        this.c = btluVar;
        this.d = awhwVar;
        for (awhv awhvVar : awhwVar.a) {
            this.a.put(awhvVar.b, awhvVar);
        }
    }

    public final void a() {
        awhw awhwVar = this.d;
        dsqp dsqpVar = (dsqp) awhwVar.cu(5);
        dsqpVar.bC(awhwVar);
        awht awhtVar = (awht) dsqpVar;
        if (awhtVar.c) {
            awhtVar.bF();
            awhtVar.c = false;
        }
        awhw awhwVar2 = awhw.b;
        ((awhw) awhtVar.b).a = awhw.ck();
        Collection<awhv> values = this.a.values();
        if (awhtVar.c) {
            awhtVar.bF();
            awhtVar.c = false;
        }
        awhw awhwVar3 = (awhw) awhtVar.b;
        dsrj<awhv> dsrjVar = awhwVar3.a;
        if (!dsrjVar.a()) {
            awhwVar3.a = dsqw.cl(dsrjVar);
        }
        dsod.bv(values, awhwVar3.a);
        awhw bK = awhtVar.bK();
        if (!bK.equals(awhw.b)) {
            if (avjn.a.equals(this.c)) {
                this.b.f.al(awiw.b, bK);
            } else {
                this.b.f.am(awiw.b, this.c, bK);
            }
        } else if (avjn.a.equals(this.c)) {
            this.b.f.P(awiw.b);
        } else {
            this.b.f.Q(awiw.b, this.c);
        }
    }
}
