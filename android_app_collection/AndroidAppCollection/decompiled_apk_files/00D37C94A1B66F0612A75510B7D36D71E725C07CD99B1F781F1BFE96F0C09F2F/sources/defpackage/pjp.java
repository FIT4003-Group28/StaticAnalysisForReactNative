package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pjp  reason: default package */
/* loaded from: classes4.dex */
public final class pjp {
    public final pjo d;
    public final pqh e;
    public final pnj f;
    public final HashMap g;
    public final Set h;
    public boolean i;
    public atk j;
    public prl k = new prl();
    public final IdentityHashMap b = new IdentityHashMap();
    public final Map c = new HashMap();
    public final List a = new ArrayList();

    public pjp(pjo pjoVar, auy auyVar, Handler handler) {
        this.d = pjoVar;
        pqh pqhVar = new pqh();
        this.e = pqhVar;
        pnj pnjVar = new pnj();
        this.f = pnjVar;
        this.g = new HashMap();
        this.h = new HashSet();
        if (auyVar != null) {
            pqhVar.a(handler, auyVar);
            pnjVar.a(handler, auyVar);
        }
    }

    private final void h(int i, int i2) {
        while (i < this.a.size()) {
            ((pjn) this.a.get(i)).d += i2;
            i++;
        }
    }

    private final void i(pjn pjnVar) {
        pjm pjmVar = (pjm) this.g.get(pjnVar);
        if (pjmVar != null) {
            pjmVar.a.c(pjmVar.b);
        }
    }

    private final void j(pjn pjnVar) {
        if (!pjnVar.e || !pjnVar.c.isEmpty()) {
            return;
        }
        pjm pjmVar = (pjm) this.g.remove(pjnVar);
        ptx.a(pjmVar);
        pjmVar.a.rG(pjmVar.b);
        pjmVar.a.rI(pjmVar.c);
        pjmVar.a.rH(pjmVar.c);
        this.h.remove(pjnVar);
    }

    public final int a() {
        return this.a.size();
    }

    public final pkt b() {
        if (!this.a.isEmpty()) {
            int i = 0;
            for (int i2 = 0; i2 < this.a.size(); i2++) {
                pjn pjnVar = (pjn) this.a.get(i2);
                pjnVar.d = i;
                i += pjnVar.a.d.q();
            }
            return new phc(this.a, this.k);
        }
        return pkt.c;
    }

    public final void c() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            pjn pjnVar = (pjn) it.next();
            if (pjnVar.c.isEmpty()) {
                i(pjnVar);
                it.remove();
            }
        }
    }

    public final void d(pjn pjnVar) {
        ppv ppvVar = pjnVar.a;
        pqa pqaVar = new pqa() { // from class: pjk
            @Override // defpackage.pqa
            public final void a(pqb pqbVar, pkt pktVar) {
                ((pip) pjp.this.d).a.g(22);
            }
        };
        pjl pjlVar = new pjl(this, pjnVar);
        this.g.put(pjnVar, new pjm(ppvVar, pqaVar, pjlVar));
        ppvVar.b(pxi.u(), pjlVar);
        ppvVar.pY(pxi.u(), pjlVar);
        ppvVar.rE(pqaVar, this.j);
    }

    public final void e(ppy ppyVar) {
        pjn pjnVar = (pjn) this.b.remove(ppyVar);
        ptx.a(pjnVar);
        pjnVar.a.u(ppyVar);
        pjnVar.c.remove(((pps) ppyVar).e);
        if (!this.b.isEmpty()) {
            c();
        }
        j(pjnVar);
    }

    public final void f(int i, int i2) {
        while (true) {
            i2--;
            if (i2 >= i) {
                pjn pjnVar = (pjn) this.a.remove(i2);
                this.c.remove(pjnVar.b);
                h(i2, -pjnVar.a.d.q());
                pjnVar.e = true;
                if (this.i) {
                    j(pjnVar);
                }
            } else {
                return;
            }
        }
    }

    public final pkt g(int i, List list, prl prlVar) {
        if (!list.isEmpty()) {
            this.k = prlVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                pjn pjnVar = (pjn) list.get(i2 - i);
                if (i2 > 0) {
                    pjn pjnVar2 = (pjn) this.a.get(i2 - 1);
                    pjnVar.c(pjnVar2.d + pjnVar2.a.d.q());
                } else {
                    pjnVar.c(0);
                }
                h(i2, pjnVar.a.d.q());
                this.a.add(i2, pjnVar);
                this.c.put(pjnVar.b, pjnVar);
                if (this.i) {
                    d(pjnVar);
                    if (this.b.isEmpty()) {
                        this.h.add(pjnVar);
                    } else {
                        i(pjnVar);
                    }
                }
            }
        }
        return b();
    }
}
