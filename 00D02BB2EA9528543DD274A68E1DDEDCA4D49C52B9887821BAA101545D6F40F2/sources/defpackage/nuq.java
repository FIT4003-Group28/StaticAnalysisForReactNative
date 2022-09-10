package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: nuq  reason: default package */
/* loaded from: classes7.dex */
public final class nuq<T> extends btrh<T> {
    public nuq(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        dthb dthbVar;
        dtid dtidVar;
        nuo nuoVar = (nuo) this.a;
        bqje bqjeVar = (bqje) obj;
        nup nupVar = nuoVar.a;
        if (!nupVar.i || (dthbVar = nupVar.d) == null || nupVar.e == null || (dthbVar.a & 32) == 0) {
            return;
        }
        dtrm dtrmVar = dthbVar.g;
        if (dtrmVar == null) {
            dtrmVar = dtrm.l;
        }
        dgrh dgrhVar = dtrmVar.b;
        if (dgrhVar == null) {
            dgrhVar = dgrh.d;
        }
        akqi k = akqi.k(dgrhVar);
        ilo c = bqjeVar.a.c();
        if (c == null || !c.ai().equals(k)) {
            return;
        }
        nup nupVar2 = nuoVar.a;
        String str = nupVar2.e;
        ArrayList<nun> arrayList = nupVar2.a;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dtidVar = null;
                break;
            }
            nun nunVar = arrayList.get(i);
            i++;
            if (nunVar.b.equals(str)) {
                dtidVar = nunVar.a();
                break;
            }
        }
        if (bqjeVar.c == 1) {
            dtrm dtrmVar2 = nuoVar.a.d.g;
            if (dtrmVar2 == null) {
                dtrmVar2 = dtrm.l;
            }
            if (dtrmVar2.h) {
                nuoVar.a.h(dtidVar);
                return;
            }
        }
        if (bqjeVar.c == 1) {
            dtrm dtrmVar3 = nuoVar.a.d.g;
            if (dtrmVar3 == null) {
                dtrmVar3 = dtrm.l;
            }
            if (dtrmVar3.f) {
                nuoVar.a.h.c();
                return;
            }
        }
        nuoVar.a.a();
    }
}
