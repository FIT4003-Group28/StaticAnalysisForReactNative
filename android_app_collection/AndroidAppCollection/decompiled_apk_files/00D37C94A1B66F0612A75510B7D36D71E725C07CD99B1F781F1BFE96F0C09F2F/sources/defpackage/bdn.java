package defpackage;

import android.util.Log;
/* compiled from: PG */
/* renamed from: bdn  reason: default package */
/* loaded from: classes2.dex */
public final class bdn implements bdd {
    private final pwu a = new pwu(10);
    private bab b;
    private boolean c;
    private long d;
    private int e;
    private int f;

    @Override // defpackage.bdd
    public final void a(pwu pwuVar) {
        ptx.b(this.b);
        if (!this.c) {
            return;
        }
        int a = pwuVar.a();
        int i = this.f;
        if (i < 10) {
            int min = Math.min(a, 10 - i);
            System.arraycopy(pwuVar.a, pwuVar.b, this.a.a, this.f, min);
            if (this.f + min == 10) {
                this.a.G(0);
                if (this.a.i() != 73 || this.a.i() != 68 || this.a.i() != 51) {
                    Log.w("Id3Reader", "Discarding invalid ID3 tag");
                    this.c = false;
                    return;
                }
                this.a.H(3);
                this.e = this.a.h() + 10;
            }
        }
        int min2 = Math.min(a, this.e - this.f);
        this.b.c(pwuVar, min2);
        this.f += min2;
    }

    @Override // defpackage.bdd
    public final void b(azh azhVar, bef befVar) {
        befVar.c();
        bab pT = azhVar.pT(befVar.a(), 5);
        this.b = pT;
        pis pisVar = new pis();
        pisVar.a = befVar.b();
        pisVar.k = "application/id3";
        pT.rx(pisVar.a());
    }

    @Override // defpackage.bdd
    public final void c() {
        int i;
        ptx.b(this.b);
        if (!this.c || (i = this.e) == 0 || this.f != i) {
            return;
        }
        this.b.e(this.d, 1, i, 0, null);
        this.c = false;
    }

    @Override // defpackage.bdd
    public final void d(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        this.d = j;
        this.e = 0;
        this.f = 0;
    }

    @Override // defpackage.bdd
    public final void e() {
        this.c = false;
    }
}
