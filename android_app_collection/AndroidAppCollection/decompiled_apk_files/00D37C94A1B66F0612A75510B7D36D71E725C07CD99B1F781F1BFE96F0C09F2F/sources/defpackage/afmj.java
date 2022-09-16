package defpackage;
/* compiled from: PG */
/* renamed from: afmj  reason: default package */
/* loaded from: classes.dex */
public final class afmj implements atk {
    private final snc a;
    private final afkf b;
    private final int c;
    private int d;
    private long e;
    private long f;
    private long g;

    public afmj(snc sncVar, afkf afkfVar, int i) {
        this.a = sncVar;
        this.b = afkfVar;
        this.c = i;
    }

    @Override // defpackage.atk
    public final synchronized void a(asv asvVar, asy asyVar, boolean z, int i) {
        if (z) {
            this.f += i;
        } else {
            this.g += i;
        }
    }

    @Override // defpackage.atk
    public final synchronized void b(asv asvVar, asy asyVar, boolean z) {
        boolean z2 = true;
        afms.d(this.d > 0);
        long d = this.a.d();
        int i = (int) (d - this.e);
        long j = this.g;
        long j2 = this.f;
        long j3 = j + j2;
        if (i > 0 && j3 >= 16384) {
            afkf afkfVar = this.b;
            int i2 = this.c;
            if (j >= j2) {
                z2 = false;
            }
            afkv afkvVar = new afkv(i2, i, j3, z2);
            for (afkg afkgVar : afkfVar.a) {
                afkgVar.a(afkvVar);
            }
        }
        int i3 = this.d - 1;
        this.d = i3;
        if (i3 > 0) {
            this.e = d;
        }
        this.g = 0L;
        this.f = 0L;
    }

    @Override // defpackage.atk
    public final void c(asv asvVar, asy asyVar, boolean z) {
    }

    @Override // defpackage.atk
    public final synchronized void d(asv asvVar, asy asyVar, boolean z) {
        if (this.d == 0) {
            this.e = this.a.d();
        }
        this.d++;
    }
}
