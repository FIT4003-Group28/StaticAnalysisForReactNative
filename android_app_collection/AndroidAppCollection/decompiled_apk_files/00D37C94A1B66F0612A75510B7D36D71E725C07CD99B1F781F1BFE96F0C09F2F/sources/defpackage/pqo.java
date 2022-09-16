package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: pqo  reason: default package */
/* loaded from: classes4.dex */
public final class pqo extends ppl {
    private final pqb[] d;
    private final pkt[] e;
    private final ArrayList f;
    private int g = -1;
    private long[][] h = new long[0];
    private pqn i;

    static {
        pix pixVar = new pix();
        pixVar.b("MergingMediaSource");
        pixVar.a();
    }

    public pqo(pqb... pqbVarArr) {
        this.d = pqbVarArr;
        this.f = new ArrayList(Arrays.asList(pqbVarArr));
        this.e = new pkt[pqbVarArr.length];
        new HashMap();
        araa.v(8, "expectedKeys");
        new amxd().b().b();
    }

    @Override // defpackage.pqb
    public final pjc r() {
        return this.d[0].r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ppl, defpackage.ppa
    public final void rA() {
        super.rA();
        Arrays.fill(this.e, (Object) null);
        this.g = -1;
        this.i = null;
        this.f.clear();
        Collections.addAll(this.f, this.d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ppl, defpackage.ppa
    public final void rz(atk atkVar) {
        super.rz(atkVar);
        for (int i = 0; i < this.d.length; i++) {
            x(Integer.valueOf(i), this.d[i]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ppl
    public final /* bridge */ /* synthetic */ void t(Object obj, pqb pqbVar, pkt pktVar) {
        int i;
        Integer num = (Integer) obj;
        if (this.i != null) {
            return;
        }
        if (this.g == -1) {
            i = pktVar.p();
            this.g = i;
        } else {
            int p = pktVar.p();
            int i2 = this.g;
            if (p != i2) {
                this.i = new pqn();
                return;
            }
            i = i2;
        }
        if (this.h.length == 0) {
            this.h = (long[][]) Array.newInstance(long.class, i, this.e.length);
        }
        this.f.remove(pqbVar);
        this.e[num.intValue()] = pktVar;
        if (!this.f.isEmpty()) {
            return;
        }
        pkr pkrVar = new pkr();
        for (int i3 = 0; i3 < this.g; i3++) {
            long j = -this.e[0].x(i3, pkrVar).e;
            int i4 = 1;
            while (true) {
                pkt[] pktVarArr = this.e;
                if (i4 < pktVarArr.length) {
                    this.h[i3][1] = j - (-pktVarArr[1].x(i3, pkrVar).e);
                    i4 = 2;
                }
            }
        }
        rF(this.e[0]);
    }

    @Override // defpackage.pqb
    public final void u(ppy ppyVar) {
        pqm pqmVar = (pqm) ppyVar;
        int i = 0;
        while (true) {
            pqb[] pqbVarArr = this.d;
            if (i < pqbVarArr.length) {
                pqb pqbVar = pqbVarArr[i];
                ppy ppyVar2 = pqmVar.a[i];
                if (ppyVar2 instanceof pqk) {
                    ppyVar2 = ((pqk) ppyVar2).a;
                }
                pqbVar.u(ppyVar2);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.pqb
    public final ppy v(ppz ppzVar, axf axfVar, long j) {
        int length = this.d.length;
        ppy[] ppyVarArr = new ppy[length];
        int b = this.e[0].b(ppzVar.a);
        for (int i = 0; i < length; i++) {
            ppyVarArr[i] = this.d[i].v(ppzVar.b(this.e[i].j(b)), axfVar, j - this.h[b][i]);
        }
        return new pqm(this.h[b], ppyVarArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ppl
    public final /* bridge */ /* synthetic */ ppz z(Object obj, ppz ppzVar) {
        if (((Integer) obj).intValue() == 0) {
            return ppzVar;
        }
        return null;
    }

    @Override // defpackage.ppl, defpackage.pqb
    public final void s() {
        pqn pqnVar = this.i;
        if (pqnVar != null) {
            throw pqnVar;
        }
        super.s();
    }
}
