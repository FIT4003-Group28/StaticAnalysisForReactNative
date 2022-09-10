package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bxku  reason: default package */
/* loaded from: classes4.dex */
public final class bxku {
    int a;
    int b;
    int c;
    boolean j;
    @dzsi
    ddfz l;
    boolean m;
    @dzsi
    String n;
    boolean o;
    boolean p;
    final /* synthetic */ bxkv q;
    int d = 0;
    int e = 0;
    int f = 0;
    int g = 0;
    int h = 0;
    int i = 0;
    int[] k = new int[10];

    public bxku(bxkv bxkvVar, List<bxkx> list) {
        ddfz ddfzVar;
        int i;
        this.q = bxkvVar;
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.j = false;
        this.l = null;
        this.m = false;
        this.n = null;
        this.o = false;
        this.p = false;
        for (int i2 = 0; i2 < list.size(); i2++) {
            bxkx bxkxVar = list.get(i2);
            bxkz g = bxkxVar.g();
            if (g != null) {
                long c = g.c() - this.q.c;
                if (this.a == 0) {
                    this.a = (int) c;
                }
                this.b = (int) c;
                this.f += bxkxVar.k() ? 1 : 0;
                this.g += bxkxVar.l() ? 1 : 0;
                bxkxVar.t();
                this.h += bxkxVar.m() ? 1 : 0;
                this.i += bxkxVar.n() ? 1 : 0;
                this.e += bxkxVar.o() ? 1 : 0;
                if (bxkxVar.p()) {
                    this.j = true;
                }
                if (bxkxVar.r()) {
                    int q = bxkxVar.q();
                    this.c = Math.max(this.c, q);
                    this.d += q;
                    if (q >= 0) {
                        i = 0;
                        while (i < 10) {
                            if (q < bxkv.b[i]) {
                                break;
                            }
                            i++;
                        }
                        bvoo.h("Should never reach here", new Object[0]);
                    } else {
                        bvoo.h("Round trip time must not be negative", new Object[0]);
                    }
                    i = -1;
                    if (i >= 0) {
                        int[] iArr = this.k;
                        iArr[i] = iArr[i] + 1;
                    }
                }
                bxkxVar.s();
                this.l = bxkxVar.i();
                if (i2 != list.size() - 1 && (ddfzVar = this.l) != null && ddfzVar.c) {
                    this.m = true;
                    this.n = ddfzVar.b;
                }
                dcdc<bxmh> h = bxkxVar.h();
                if (h != null) {
                    int size = h.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        }
                        dwjj dwjjVar = h.get(i3).b;
                        dxbp dxbpVar = (dwjjVar == null ? dwjj.k : dwjjVar).b;
                        int a = dxbk.a((dxbpVar == null ? dxbp.x : dxbpVar).g);
                        i3++;
                        if ((a == 0 ? 1 : a) == 17) {
                            this.o = true;
                            break;
                        }
                    }
                }
                drgv j = bxkxVar.j();
                if (j != null && (j.a & 1) != 0) {
                    drgu drguVar = j.b;
                    if ((drguVar == null ? drgu.b : drguVar).a) {
                        this.p = true;
                    }
                }
            }
        }
    }
}
