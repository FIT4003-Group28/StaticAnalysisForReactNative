package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: lmx  reason: default package */
/* loaded from: classes3.dex */
public final class lmx extends ajxl implements ajwq {
    public final Context a;
    public final azqb b;
    public final azqb c;
    public final akaf d;
    public final ajsm e;
    public boolean f;
    public apwz g;
    public jva h;
    private final azqb m;
    private final lmw n;
    private apwx o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public lmx(android.content.Context r11, defpackage.ajyi r12, defpackage.azqb r13, defpackage.yni r14, defpackage.yzj r15, defpackage.azqb r16, defpackage.azqb r17, defpackage.aari r18, defpackage.acti r19, defpackage.akam r20, defpackage.akaf r21) {
        /*
            r10 = this;
            r7 = r10
            r8 = r20
            ajsm r9 = new ajsm
            r9.<init>()
            r12.get()
            r0 = r10
            r1 = r18
            r2 = r14
            r3 = r15
            r4 = r19
            r5 = r20
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = r11
            r7.a = r0
            r0 = r13
            r7.m = r0
            r0 = r16
            r7.b = r0
            r0 = r17
            r7.c = r0
            r0 = r21
            r7.d = r0
            r7.e = r9
            lmw r0 = new lmw
            r0.<init>(r10)
            r7.n = r0
            java.lang.Class<apwz> r0 = defpackage.apwz.class
            r1 = r12
            r12.a(r0)
            boolean r0 = r8 instanceof defpackage.lmv
            if (r0 == 0) goto L61
            r0 = r8
            lmv r0 = (defpackage.lmv) r0
            apwz r1 = r0.a
            r2 = 0
            r10.m(r1, r2)
            java.util.List r1 = r0.b
            r9.addAll(r1)
            apwz r0 = r0.a
            if (r0 == 0) goto L61
            int r1 = r0.b
            r1 = r1 & 16
            if (r1 == 0) goto L61
            acte r1 = new acte
            aoob r0 = r0.h
            r1.<init>(r0)
            r0 = r19
            r0.D(r1)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lmx.<init>(android.content.Context, ajyi, azqb, yni, yzj, azqb, azqb, aari, acti, akam, akaf):void");
    }

    public static aqdv c(aqdv aqdvVar, Map map) {
        aucf aucfVar;
        aqds aqdsVar = aqdvVar.k;
        if (aqdsVar == null) {
            aqdsVar = aqds.a;
        }
        if (aqdsVar.b == 135739232) {
            aucfVar = (aucf) aqdsVar.c;
        } else {
            aucfVar = aucf.a;
        }
        String str = aucfVar.c;
        return map.containsKey(str) ? (aqdv) map.get(str) : aqdvVar;
    }

    public static Object d(List list, int i) {
        if (i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    private final void m(apwz apwzVar, boolean z) {
        apwx apwxVar;
        jva q;
        apwx apwxVar2;
        apwzVar.getClass();
        this.g = apwzVar;
        apwy apwyVar = apwzVar.d;
        if (apwyVar == null) {
            apwyVar = apwy.a;
        }
        if (apwyVar.b == 140080728) {
            apwxVar = (apwx) apwyVar.c;
        } else {
            apwxVar = apwx.a;
        }
        Iterator it = apwxVar.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                q = llm.q(2, false);
                break;
            }
            apwv apwvVar = (apwv) it.next();
            if (apwvVar.d) {
                apxa apxaVar = apwvVar.e;
                if (apxaVar == null) {
                    apxaVar = apxa.a;
                }
                int p = alwb.p(apxaVar.c);
                if (p == 0) {
                    p = 1;
                }
                q = llm.q(p, apwvVar.f);
            }
        }
        this.h = q;
        if (z) {
            lB();
            apwy apwyVar2 = apwzVar.d;
            if (apwyVar2 == null) {
                apwyVar2 = apwy.a;
            }
            if (apwyVar2.b == 140080728) {
                apwy apwyVar3 = apwzVar.d;
                if (apwyVar3 == null) {
                    apwyVar3 = apwy.a;
                }
                if (apwyVar3.b == 140080728) {
                    apwxVar2 = (apwx) apwyVar3.c;
                } else {
                    apwxVar2 = apwx.a;
                }
                this.o = apwxVar2;
            }
            if (apwzVar.e.size() != 0) {
                for (apxb apxbVar : apwzVar.e) {
                    if (apxbVar.b == 48602820) {
                        B((aqdv) apxbVar.c);
                    }
                }
            }
            l();
        }
        apwu apwuVar = apwzVar.c;
        if (apwuVar == null) {
            apwuVar = apwu.a;
        }
        int b = apwt.b(apwuVar.c);
        if (b != 0 && b == 2) {
            jeh jehVar = (jeh) this.m.get();
            lmw lmwVar = this.n;
            Set set = jehVar.b;
            lmwVar.getClass();
            set.add(lmwVar);
            jehVar.a();
        }
        this.i.mG(new akal(this));
    }

    @Override // defpackage.ajxl, defpackage.ajxh, defpackage.zdx
    public final void j() {
        lmw lmwVar = this.n;
        Set set = ((jeh) this.m.get()).b;
        lmwVar.getClass();
        set.remove(lmwVar);
        this.h = null;
        this.g = null;
        this.f = false;
    }

    public final void k(apwz apwzVar) {
        m(apwzVar, true);
    }

    public final void l() {
        if (!this.f || this.e.size() != 1) {
            if (this.o == null || this.f || this.e.isEmpty()) {
                return;
            }
            C(this.o, 0);
            this.f = true;
            return;
        }
        this.e.clear();
        this.f = false;
    }

    @Override // defpackage.ajwq
    public final /* synthetic */ void li(aumx aumxVar, zdt zdtVar, ajxo ajxoVar, apzg apzgVar) {
        throw null;
    }

    @Override // defpackage.ajwq
    public final void lx(aumx aumxVar, apzg apzgVar) {
        lB();
        this.f = false;
        lr(ajna.g(aumxVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajxh
    public final /* bridge */ /* synthetic */ void lz(Object obj, ajfy ajfyVar) {
        apwz apwzVar = (apwz) obj;
        super.lz(apwzVar, ajfyVar);
        if (apwzVar != null) {
            k(apwzVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajxh
    public final /* bridge */ /* synthetic */ Object np(auna aunaVar) {
        if (aunaVar == null || !aunaVar.qn(apxc.a)) {
            return null;
        }
        return (apwz) aunaVar.qm(apxc.a);
    }

    @Override // defpackage.ajxl, defpackage.ajxh, defpackage.ajzh
    public final akam pn() {
        ArrayList arrayList = new ArrayList(this.e.size());
        this.e.k(arrayList);
        return new lmv(super.pn(), this.g, arrayList);
    }
}
