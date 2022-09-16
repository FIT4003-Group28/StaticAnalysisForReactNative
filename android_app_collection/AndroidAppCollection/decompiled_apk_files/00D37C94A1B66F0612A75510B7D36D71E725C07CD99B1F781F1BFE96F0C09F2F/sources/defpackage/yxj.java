package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: yxj  reason: default package */
/* loaded from: classes4.dex */
public final class yxj {
    public long a;
    public long b;
    public long c;
    public long d;
    public final String e;
    public final int f;
    public Throwable g;
    public final int h;
    private long i;
    private long j;
    private final snc k;

    public yxj(int i, snc sncVar, int i2) {
        this.f = i;
        this.e = "null";
        this.k = sncVar;
        this.h = i2;
    }

    public yxj(String str, snc sncVar, int i) {
        this.f = -1;
        this.e = str == null ? "null" : str;
        this.k = sncVar;
        this.h = i;
    }

    public final void a() {
        this.b = TimeUnit.MICROSECONDS.convert(this.k.e(), TimeUnit.NANOSECONDS);
        long g = this.k.g();
        long b = this.h != 4 ? this.k.b() : 0L;
        long j = this.b - this.a;
        this.c = this.h != 4 ? Math.max(0L, j - TimeUnit.MICROSECONDS.convert(b - this.i, TimeUnit.MILLISECONDS)) : -1L;
        this.d = Math.max(0L, j - TimeUnit.MICROSECONDS.convert(g - this.j, TimeUnit.MILLISECONDS));
    }

    public final void b() {
        this.i = this.h != 4 ? this.k.b() : 0L;
        this.j = this.k.g();
        this.a = TimeUnit.MICROSECONDS.convert(this.k.e(), TimeUnit.NANOSECONDS);
        Thread.currentThread().getId();
    }
}
