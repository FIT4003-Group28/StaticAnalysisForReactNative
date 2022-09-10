package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: chtb  reason: default package */
/* loaded from: classes4.dex */
public final class chtb implements crzp<chtr> {
    public final Map<Integer, chum> a;
    public final Map<chxr, Integer> b;
    public final crzo<chum> c;
    public int d;
    public final chta e;
    public final btvo f;
    public final chsf g;
    public final ckcw h;
    private chtr j = chtr.b(dcmn.a);
    public final HashSet<Integer> i = new HashSet<>();

    public chtb(Executor executor, btvo btvoVar, chsf chsfVar, ckcw ckcwVar, crzm<chtr> crzmVar) {
        this.f = btvoVar;
        this.g = chsfVar;
        this.h = ckcwVar;
        dhpt dhptVar = btvoVar.getContributionsPageParameters().h;
        this.d = !(dhptVar == null ? dhpt.w : dhptVar).p ? 1 : 0;
        this.e = new chta();
        chul bZ = chum.p.bZ();
        int i = this.d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        chum chumVar = (chum) bZ.b;
        chumVar.a |= 1;
        chumVar.b = i;
        this.c = new crzo<>(bZ.bK());
        this.a = new HashMap();
        this.b = new HashMap();
        crzmVar.d(this, executor);
    }

    public static boolean e(chum chumVar) {
        return chumVar.m && chumVar.c == chumVar.d + chumVar.h;
    }

    @Override // defpackage.crzp
    public final void On(crzm<chtr> crzmVar) {
        chtr l = crzmVar.l();
        if (l == null) {
            this.j = chtr.b(dcmn.a);
            return;
        }
        this.j = l;
        for (Map.Entry<Integer, chum> entry : this.a.entrySet()) {
            int intValue = entry.getKey().intValue();
            chum value = entry.getValue();
            int h = h(value.f, value.g);
            int h2 = h(value.j, value.k);
            dsqp dsqpVar = (dsqp) value.cu(5);
            dsqpVar.bC(value);
            chul chulVar = (chul) dsqpVar;
            int i = h + h2;
            if (chulVar.c) {
                chulVar.bF();
                chulVar.c = false;
            }
            chum chumVar = (chum) chulVar.b;
            chumVar.a |= 1024;
            chumVar.l = i;
            chum bK = chulVar.bK();
            entry.setValue(bK);
            if (intValue == this.d) {
                this.c.a(bK);
            }
        }
    }

    @dzsi
    public final chum b(final chxr chxrVar) {
        Integer num = this.b.get(chxrVar);
        if (num != null) {
            return this.a.get(num);
        }
        dbsg h = dcbg.b(this.e.c.entrySet()).r(new dbsl(chxrVar) { // from class: chsy
            private final chxr a;

            {
                this.a = chxrVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return ((ArrayList) ((Map.Entry) obj).getValue()).contains(this.a);
            }
        }).h(chsz.a);
        if (!h.a()) {
            return null;
        }
        chum chumVar = this.a.get(h.b());
        dbsk.s(chumVar);
        return chumVar;
    }

    public final void c(chxr chxrVar) {
        chum b = b(chxrVar);
        if (b == null) {
            return;
        }
        dsqp dsqpVar = (dsqp) b.cu(5);
        dsqpVar.bC(b);
        chul chulVar = (chul) dsqpVar;
        int i = b.j + 1;
        if (chulVar.c) {
            chulVar.bF();
            chulVar.c = false;
        }
        chum chumVar = (chum) chulVar.b;
        chumVar.a |= 256;
        chumVar.j = i;
        int h = b.l + h(1, 0);
        if (chulVar.c) {
            chulVar.bF();
            chulVar.c = false;
        }
        chum chumVar2 = (chum) chulVar.b;
        chumVar2.a |= 1024;
        chumVar2.l = h;
        g(b.b, chulVar.bK());
    }

    @dzsi
    public final String d() {
        return this.e.b;
    }

    public final void f(int i) {
        chum chumVar = this.a.get(Integer.valueOf(i));
        dbsk.s(chumVar);
        dsqp dsqpVar = (dsqp) chumVar.cu(5);
        dsqpVar.bC(chumVar);
        chul chulVar = (chul) dsqpVar;
        int i2 = chumVar.h + 1;
        if (chulVar.c) {
            chulVar.bF();
            chulVar.c = false;
        }
        chum chumVar2 = (chum) chulVar.b;
        int i3 = chumVar2.a | 64;
        chumVar2.a = i3;
        chumVar2.h = i2;
        int i4 = chumVar.i;
        chumVar2.a = i3 | 128;
        chumVar2.i = i4 + 1;
        g(i, chulVar.bK());
    }

    public final void g(int i, chum chumVar) {
        this.a.put(Integer.valueOf(i), chumVar);
        if (i == this.d) {
            this.c.a(chumVar);
        }
    }

    public final int h(int i, int i2) {
        return (this.j.c(dpwe.RATING) * i) + ((this.j.c(dpwe.REVIEW) - this.j.c(dpwe.RATING)) * i2);
    }
}
