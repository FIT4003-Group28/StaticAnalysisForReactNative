package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: fzd  reason: default package */
/* loaded from: classes.dex */
public final class fzd implements fzc {
    private static final long a = TimeUnit.SECONDS.toMillis(2);
    private final cqat b;
    private long c;
    private long d;
    private long e;

    public fzd(cqat cqatVar) {
        this.b = cqatVar;
    }

    @Override // defpackage.fzc
    public final boolean a(ckme ckmeVar) {
        ckme ckmeVar2 = ckme.PRIMARY_MAP;
        int ordinal = ckmeVar.ordinal();
        return (ordinal != 0 ? ordinal != 1 ? 0L : this.e : this.d) - this.c > a;
    }

    @Override // defpackage.fzc
    public final void b(ckme ckmeVar) {
        long e = this.b.e();
        ckme ckmeVar2 = ckme.PRIMARY_MAP;
        int ordinal = ckmeVar.ordinal();
        if (ordinal == 0) {
            this.d = e;
        } else if (ordinal != 1) {
        } else {
            this.e = e;
        }
    }

    @Override // defpackage.fzc
    public final void c() {
        this.c = this.b.e();
    }
}
