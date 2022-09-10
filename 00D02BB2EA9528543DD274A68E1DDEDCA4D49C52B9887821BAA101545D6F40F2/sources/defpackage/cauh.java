package defpackage;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cauh  reason: default package */
/* loaded from: classes4.dex */
public final class cauh implements btzi<djbl, djce> {
    public final Executor a;
    public final cauj b;
    public final ArrayList<cafq> c;
    public djbl d;
    public boolean e = true;
    public boolean f = false;
    public String g = "";
    public final bvev h;
    private final caug i;
    private final cauf j;

    public cauh(bvev bvevVar, Executor executor, cauv cauvVar, caug caugVar, cauj caujVar, dori doriVar, HashMap hashMap) {
        this.h = bvevVar;
        this.a = executor;
        this.i = caugVar;
        this.b = caujVar;
        this.j = new cauf(cauvVar, doriVar, hashMap);
        djbi bZ = djbl.e.bZ();
        djbk djbkVar = caujVar.f;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djbl djblVar = (djbl) bZ.b;
        djbkVar.getClass();
        djblVar.b = djbkVar;
        int i = djblVar.a | 1;
        djblVar.a = i;
        if (!doriVar.c) {
            String str = doriVar.b;
            str.getClass();
            djblVar.a = i | 8;
            djblVar.d = str;
        }
        this.d = bZ.bK();
        this.c = new ArrayList<>();
    }

    @Override // defpackage.btzi
    public final void QY(btzr<djbl> btzrVar, btzy btzyVar) {
        this.f = false;
        this.i.w();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<djbl> btzrVar, djce djceVar) {
        cauh cauhVar;
        Iterator<djcb> it;
        cauf caufVar;
        ArrayList<cafq> arrayList;
        cauh cauhVar2 = this;
        djce djceVar2 = djceVar;
        int a = djcd.a(djceVar2.b);
        int i = 1;
        int i2 = 3;
        int i3 = 2;
        if (a == 0 || a != 2) {
            int a2 = djcd.a(djceVar2.b);
            if (a2 == 0) {
                a2 = 1;
            }
            int i4 = a2 - 1;
            cauhVar2.QY(btzrVar, i4 != 2 ? i4 != 3 ? btzy.a : btzy.j : btzy.h);
        }
        cauhVar2.f = false;
        boolean z = !djceVar2.d.isEmpty();
        cauhVar2.e = z;
        int i5 = 5;
        if (z) {
            djbl djblVar = cauhVar2.d;
            dsqp dsqpVar = (dsqp) djblVar.cu(5);
            dsqpVar.bC(djblVar);
            djbi djbiVar = (djbi) dsqpVar;
            String str = djceVar2.d;
            if (djbiVar.c) {
                djbiVar.bF();
                djbiVar.c = false;
            }
            djbl djblVar2 = (djbl) djbiVar.b;
            djbl djblVar3 = djbl.e;
            str.getClass();
            djblVar2.a |= 2;
            djblVar2.c = str;
            cauhVar2.d = djbiVar.bK();
        }
        Iterator<djcb> it2 = djceVar2.c.iterator();
        while (it2.hasNext()) {
            djcb next = it2.next();
            int i6 = next.a;
            if (i6 == i3 || i6 == i2 || i6 == i5) {
                ArrayList<cafq> arrayList2 = cauhVar2.c;
                cauf caufVar2 = cauhVar2.j;
                if (!caufVar2.d.containsKey(next)) {
                    HashMap<djcb, cafq> hashMap = caufVar2.d;
                    cauv cauvVar = caufVar2.a;
                    jic jicVar = caufVar2.c;
                    boolean z2 = caufVar2.b.c;
                    gga a3 = cauvVar.a.a();
                    cauv.a(a3, i);
                    Resources a4 = cauvVar.b.a();
                    cauv.a(a4, i3);
                    begg a5 = cauvVar.c.a();
                    cauv.a(a5, i2);
                    Executor a6 = cauvVar.d.a();
                    cauv.a(a6, 4);
                    anhk a7 = cauvVar.e.a();
                    it = it2;
                    cauv.a(a7, 5);
                    bvff a8 = cauvVar.f.a();
                    cauv.a(a8, 6);
                    bvfk a9 = cauvVar.g.a();
                    cauv.a(a9, 7);
                    bvfn a10 = cauvVar.h.a();
                    cauv.a(a10, 8);
                    cauv.a(cauvVar.i.a(), 9);
                    eeu a11 = cauvVar.j.a();
                    cauv.a(a11, 10);
                    bjbu a12 = cauvVar.k.a();
                    cauv.a(a12, 11);
                    caux a13 = cauvVar.l.a();
                    cauv.a(a13, 12);
                    cauv.a(next, 13);
                    cauv.a(jicVar, 14);
                    caufVar = caufVar2;
                    arrayList = arrayList2;
                    hashMap.put(next, new cauu(a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, next, jicVar, z2));
                } else {
                    it = it2;
                    caufVar = caufVar2;
                    arrayList = arrayList2;
                }
                arrayList.add(caufVar.d.get(next));
                it2 = it;
                i = 1;
                i2 = 3;
                i3 = 2;
                i5 = 5;
                cauhVar2 = this;
            }
        }
        if (!djceVar2.e.isEmpty()) {
            String str2 = djceVar2.e;
            cauhVar = this;
            cauhVar.g = str2;
        } else {
            cauhVar = this;
        }
        cauhVar.i.w();
    }
}
