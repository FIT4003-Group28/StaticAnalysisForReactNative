package defpackage;
/* compiled from: PG */
/* renamed from: yri  reason: default package */
/* loaded from: classes4.dex */
public final class yri implements yrh {
    private final snc b;
    private int c = 0;
    private long d = 0;

    public yri(snc sncVar) {
        this.b = sncVar;
    }

    @Override // defpackage.yrh
    public final synchronized long a() {
        if (this.c > 0) {
            return -1L;
        }
        return this.b.d() - this.d;
    }

    @Override // defpackage.yrh
    public final synchronized void b() {
        this.c--;
        this.d = this.b.d();
    }

    @Override // defpackage.yrh
    public final synchronized void c() {
        this.c++;
    }
}
