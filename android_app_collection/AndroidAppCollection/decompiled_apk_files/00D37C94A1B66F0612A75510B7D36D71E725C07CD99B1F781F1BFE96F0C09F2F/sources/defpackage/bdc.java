package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: bdc  reason: default package */
/* loaded from: classes2.dex */
public final class bdc implements bdd {
    private final List a;
    private final bab[] b;
    private boolean c;
    private int d;
    private int e;
    private long f;

    public bdc(List list) {
        this.a = list;
        this.b = new bab[list.size()];
    }

    private final boolean f(pwu pwuVar, int i) {
        if (pwuVar.a() == 0) {
            return false;
        }
        if (pwuVar.i() != i) {
            this.c = false;
        }
        this.d--;
        return this.c;
    }

    @Override // defpackage.bdd
    public final void a(pwu pwuVar) {
        bab[] babVarArr;
        if (this.c) {
            if (this.d == 2 && !f(pwuVar, 32)) {
                return;
            }
            if (this.d == 1 && !f(pwuVar, 0)) {
                return;
            }
            int i = pwuVar.b;
            int a = pwuVar.a();
            for (bab babVar : this.b) {
                pwuVar.G(i);
                babVar.c(pwuVar, a);
            }
            this.e += a;
        }
    }

    @Override // defpackage.bdd
    public final void b(azh azhVar, bef befVar) {
        for (int i = 0; i < this.b.length; i++) {
            pnu pnuVar = (pnu) this.a.get(i);
            befVar.c();
            bab pT = azhVar.pT(befVar.a(), 3);
            pis pisVar = new pis();
            pisVar.a = befVar.b();
            pisVar.k = "application/dvbsubs";
            pisVar.m = Collections.singletonList(pnuVar.a);
            pisVar.c = pnuVar.b;
            pT.rx(pisVar.a());
            this.b[i] = pT;
        }
    }

    @Override // defpackage.bdd
    public final void c() {
        if (this.c) {
            for (bab babVar : this.b) {
                babVar.e(this.f, 1, this.e, 0, null);
            }
            this.c = false;
        }
    }

    @Override // defpackage.bdd
    public final void d(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        this.f = j;
        this.e = 0;
        this.d = 2;
    }

    @Override // defpackage.bdd
    public final void e() {
        this.c = false;
    }
}
