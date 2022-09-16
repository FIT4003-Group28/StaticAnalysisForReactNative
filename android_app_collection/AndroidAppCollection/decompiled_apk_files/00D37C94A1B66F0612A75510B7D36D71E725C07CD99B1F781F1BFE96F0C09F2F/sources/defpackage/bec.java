package defpackage;
/* compiled from: PG */
/* renamed from: bec  reason: default package */
/* loaded from: classes2.dex */
final class bec implements bdx {
    final /* synthetic */ bee a;
    private final pwt b = new pwt(new byte[4]);

    public bec(bee beeVar) {
        this.a = beeVar;
    }

    @Override // defpackage.bdx
    public final void a(pwu pwuVar) {
        if (pwuVar.i() == 0 && (pwuVar.i() & 128) != 0) {
            pwuVar.H(6);
            int a = pwuVar.a() / 4;
            for (int i = 0; i < a; i++) {
                pwuVar.A(this.b, 4);
                int d = this.b.d(16);
                this.b.l(3);
                if (d == 0) {
                    this.b.l(13);
                } else {
                    int d2 = this.b.d(13);
                    if (this.a.b.get(d2) == null) {
                        bee beeVar = this.a;
                        beeVar.b.put(d2, new bdy(new bed(beeVar, d2)));
                        this.a.f++;
                    }
                }
            }
            this.a.b.remove(0);
        }
    }

    @Override // defpackage.bdx
    public final void b(pxg pxgVar, azh azhVar, bef befVar) {
    }
}
