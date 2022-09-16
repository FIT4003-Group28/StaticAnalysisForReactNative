package defpackage;

import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: bdr  reason: default package */
/* loaded from: classes2.dex */
public final class bdr implements bdx {
    private Format a;
    private pxg b;
    private bab c;

    public bdr(String str) {
        pis pisVar = new pis();
        pisVar.k = str;
        this.a = pisVar.a();
    }

    @Override // defpackage.bdx
    public final void a(pwu pwuVar) {
        ptx.b(this.b);
        int i = pxi.a;
        long d = this.b.d();
        long e = this.b.e();
        if (d == -9223372036854775807L || e == -9223372036854775807L) {
            return;
        }
        Format format = this.a;
        if (e != format.p) {
            pis b = format.b();
            b.o = e;
            Format a = b.a();
            this.a = a;
            this.c.rx(a);
        }
        int a2 = pwuVar.a();
        this.c.c(pwuVar, a2);
        this.c.e(d, 1, a2, 0, null);
    }

    @Override // defpackage.bdx
    public final void b(pxg pxgVar, azh azhVar, bef befVar) {
        this.b = pxgVar;
        befVar.c();
        bab pT = azhVar.pT(befVar.a(), 5);
        this.c = pT;
        pT.rx(this.a);
    }
}
