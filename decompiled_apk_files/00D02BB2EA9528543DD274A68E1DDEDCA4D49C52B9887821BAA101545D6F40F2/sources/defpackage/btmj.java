package defpackage;
/* compiled from: PG */
/* renamed from: btmj  reason: default package */
/* loaded from: classes.dex */
public final class btmj implements btmk {
    protected Boolean a = false;
    protected final ckcw b;
    private final int c;
    private final int d;
    private final ckgz e;
    private final ckgz f;

    public btmj(ckcw ckcwVar, int i, int i2, ckgz ckgzVar, ckgz ckgzVar2) {
        this.b = ckcwVar;
        this.c = i;
        this.d = i2;
        this.e = ckgzVar;
        this.f = ckgzVar2;
    }

    @Override // defpackage.btmk
    public final synchronized void a() {
        if (!this.a.booleanValue()) {
            this.a = true;
        }
        this.b.s(this.e, this.c);
        this.b.s(this.e, this.d);
    }

    @Override // defpackage.btmk
    public final synchronized void b() {
        if (this.a.booleanValue()) {
            this.b.s(this.f, this.c);
            this.b.s(this.f, this.d);
        }
    }
}
