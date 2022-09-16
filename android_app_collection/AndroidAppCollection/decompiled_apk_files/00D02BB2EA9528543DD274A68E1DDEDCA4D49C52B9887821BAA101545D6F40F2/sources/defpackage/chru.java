package defpackage;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: chru  reason: default package */
/* loaded from: classes4.dex */
public final class chru implements chrm, chrw, crzp {
    private static final dcqe f = dcqe.c("chru");
    public final bvrb a;
    public final LinkedHashMap<String, chug> b = new LinkedHashMap<>();
    public final crzo<chuh> c;
    public final chrx d;
    public chtr e;
    private final chtr g;

    public chru(bvrb bvrbVar, Executor executor, chrx chrxVar, crzm<chtr> crzmVar) {
        chtr b = chtr.b(dcmn.a);
        this.g = b;
        this.e = b;
        this.a = bvrbVar;
        this.c = new crzo<>();
        this.d = chrxVar;
        crzmVar.d(this, executor);
    }

    public static chuh g(Collection<chug> collection, @dzsi String str) {
        return h(collection, str, false);
    }

    public static chuh h(Collection<chug> collection, @dzsi String str, boolean z) {
        chue bZ = chuh.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        chuh chuhVar = (chuh) bZ.b;
        dsrj<chug> dsrjVar = chuhVar.b;
        if (!dsrjVar.a()) {
            chuhVar.b = dsqw.cl(dsrjVar);
        }
        dsod.bv(collection, chuhVar.b);
        if (str != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            chuh chuhVar2 = (chuh) bZ.b;
            str.getClass();
            chuhVar2.a |= 1;
            chuhVar2.c = str;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        chuh chuhVar3 = (chuh) bZ.b;
        chuhVar3.a |= 2;
        chuhVar3.d = z;
        return bZ.bK();
    }

    @Override // defpackage.crzp
    public final void On(crzm<chtr> crzmVar) {
        chtr l = crzmVar.l();
        if (l == null) {
            this.e = this.g;
            return;
        }
        this.e = l;
        for (Map.Entry<String, chug> entry : this.b.entrySet()) {
            chug value = entry.getValue();
            dsqp dsqpVar = (dsqp) value.cu(5);
            dsqpVar.bC(value);
            chuf chufVar = (chuf) dsqpVar;
            int j = j(value.e, value.f) + (this.e.c(dpwe.PHOTO_ASSOCIATED_WITH_OFFERING) * value.g) + (this.e.c(dpwe.PHOTO) * value.h) + (this.e.c(dpwe.PLACE_QA_ANSWER) * value.i);
            if (chufVar.c) {
                chufVar.bF();
                chufVar.c = false;
            }
            chug chugVar = (chug) chufVar.b;
            chugVar.a |= 4;
            chugVar.d = j;
            entry.setValue(chufVar.bK());
        }
        i();
    }

    @Override // defpackage.chrw
    public final void b(String str) {
        if (str.equals(f())) {
            bvoo.h("Try to enable already enabled filter: %s", str);
        }
        this.c.a(g(this.b.values(), str));
        this.d.af();
    }

    @Override // defpackage.chrw
    public final void c(String str) {
        if (!str.equals(f())) {
            bvoo.h("Try to disable already disabled filter: %s", str);
        }
        this.c.a(g(this.b.values(), null));
        this.d.af();
    }

    @Override // defpackage.chrw
    public final void d(chxl chxlVar) {
        dwlh dwlhVar = chxlVar.d;
        if (dwlhVar == null) {
            dwlhVar = dwlh.n;
        }
        dpsr dpsrVar = dwlhVar.f;
        if (dpsrVar == null) {
            dpsrVar = dpsr.c;
        }
        String str = dpsrVar.a;
        if (this.b.containsKey(str)) {
            chug chugVar = this.b.get(str);
            LinkedHashMap<String, chug> linkedHashMap = this.b;
            dsqp dsqpVar = (dsqp) chugVar.cu(5);
            dsqpVar.bC(chugVar);
            chuf chufVar = (chuf) dsqpVar;
            int i = chugVar.e + 1;
            if (chufVar.c) {
                chufVar.bF();
                chufVar.c = false;
            }
            chug chugVar2 = (chug) chufVar.b;
            chugVar2.a |= 8;
            chugVar2.e = i;
            int j = chugVar.d + j(1, 0);
            if (chufVar.c) {
                chufVar.bF();
                chufVar.c = false;
            }
            chug chugVar3 = (chug) chufVar.b;
            chugVar3.a |= 4;
            chugVar3.d = j;
            linkedHashMap.put(str, chufVar.bK());
            i();
        }
    }

    @Override // defpackage.chrw
    public final void e(chxl chxlVar, int i) {
        dwlh dwlhVar = chxlVar.d;
        if (dwlhVar == null) {
            dwlhVar = dwlh.n;
        }
        dpsr dpsrVar = dwlhVar.f;
        if (dpsrVar == null) {
            dpsrVar = dpsr.c;
        }
        String str = dpsrVar.a;
        if (this.b.containsKey(str)) {
            chug chugVar = this.b.get(str);
            LinkedHashMap<String, chug> linkedHashMap = this.b;
            dsqp dsqpVar = (dsqp) chugVar.cu(5);
            dsqpVar.bC(chugVar);
            chuf chufVar = (chuf) dsqpVar;
            int i2 = chugVar.h + i;
            if (chufVar.c) {
                chufVar.bF();
                chufVar.c = false;
            }
            chug chugVar2 = (chug) chufVar.b;
            chugVar2.a |= 64;
            chugVar2.h = i2;
            int c = chugVar.d + (this.e.c(dpwe.PHOTO) * i);
            if (chufVar.c) {
                chufVar.bF();
                chufVar.c = false;
            }
            chug chugVar3 = (chug) chufVar.b;
            chugVar3.a |= 4;
            chugVar3.d = c;
            linkedHashMap.put(str, chufVar.bK());
            i();
        }
    }

    public final String f() {
        chuh l = this.c.a.l();
        dbsk.s(l);
        return l.c;
    }

    public final void i() {
        if (this.c.a.k()) {
            chuh l = this.c.a.l();
            dbsk.s(l);
            this.c.a(h(this.b.values(), l.c, l.d));
        }
    }

    public final int j(int i, int i2) {
        return (this.e.c(dpwe.RATING) * i) + ((this.e.c(dpwe.REVIEW) - this.e.c(dpwe.RATING)) * i2);
    }
}
