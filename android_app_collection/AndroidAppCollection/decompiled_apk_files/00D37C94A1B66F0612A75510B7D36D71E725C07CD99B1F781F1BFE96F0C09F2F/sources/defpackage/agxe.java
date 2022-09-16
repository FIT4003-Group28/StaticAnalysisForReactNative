package defpackage;
/* compiled from: PG */
/* renamed from: agxe  reason: default package */
/* loaded from: classes.dex */
public final class agxe {
    public final String a;
    public int b;
    public long c;
    public long d;
    public final agpw e;
    public agpw f;
    public final String g;
    public final int h;
    public int i;
    public avkl j;
    private final afvm k;

    public agxe(String str, String str2, int i, agpw agpwVar, int i2) {
        this.j = avkl.TRANSFER_STATE_UNKNOWN;
        zgh.n(str2, "transferId may not be empty");
        this.a = str2;
        this.e = agpwVar;
        this.j = avkl.TRANSFER_STATE_TRANSFER_IN_QUEUE;
        this.b = 1;
        this.c = 0L;
        this.d = 0L;
        this.f = new agqy();
        this.g = str;
        this.h = i;
        this.i = i2;
        this.k = afvl.a;
    }

    public final agqz a() {
        return new agqz(this.a, this.j, this.b, this.c, this.d, this.e, this.f, this.g, this.k);
    }

    public final boolean b() {
        return this.j == avkl.TRANSFER_STATE_PAUSED_BY_USER;
    }

    public final boolean c() {
        return this.j == avkl.TRANSFER_STATE_TRANSFERRING;
    }

    public final boolean d() {
        return c() || this.j == avkl.TRANSFER_STATE_TRANSFER_IN_QUEUE;
    }
}
