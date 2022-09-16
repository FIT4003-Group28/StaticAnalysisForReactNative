package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aejy  reason: default package */
/* loaded from: classes.dex */
public final class aejy {
    public aexf a;
    private Long b;
    private Long c;
    private Long d;
    private Long e;
    private Boolean f;

    public aejy() {
    }

    public aejy(aejz aejzVar) {
        this.b = aejzVar.a;
        this.c = aejzVar.b;
        this.d = aejzVar.c;
        this.e = aejzVar.d;
        this.a = aejzVar.f;
        this.f = Boolean.valueOf(aejzVar.e);
    }

    public final aejz a() {
        Boolean bool = this.f;
        if (bool == null) {
            throw new IllegalStateException("Missing required properties: forceRequestIdempotent");
        }
        return new aejz(this.b, this.c, this.d, this.e, this.a, bool.booleanValue());
    }

    public final void b(long j) {
        if (j != -9223372036854775807L) {
            f(TimeUnit.MICROSECONDS.toMillis(j));
        }
    }

    public final void c(long j) {
        if (j != -9223372036854775807L) {
            g(TimeUnit.MICROSECONDS.toMillis(j));
        }
    }

    public final void d(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    public final void e(long j) {
        this.d = Long.valueOf(j);
    }

    public final void f(long j) {
        this.c = Long.valueOf(j);
    }

    public final void g(long j) {
        this.b = Long.valueOf(j);
    }

    public final void h(long j) {
        this.e = Long.valueOf(j);
    }

    public final void i(aexg... aexgVarArr) {
        int length = aexgVarArr.length;
        for (int i = 0; i <= 0; i++) {
            this.a = new aexf(aexgVarArr[i]);
        }
    }
}
