package defpackage;

import java.util.concurrent.ScheduledFuture;
/* compiled from: PG */
/* renamed from: ywe  reason: default package */
/* loaded from: classes4.dex */
final class ywe {
    public long[] a;
    public long[] b;
    public Boolean c;
    public Integer d;
    public Integer e;
    public Integer f;
    public ScheduledFuture g;

    public ywe() {
    }

    public ywe(ywf ywfVar) {
        this.a = ywfVar.a;
        this.b = ywfVar.b;
        this.c = Boolean.valueOf(ywfVar.c);
        this.d = Integer.valueOf(ywfVar.d);
        this.e = Integer.valueOf(ywfVar.e);
        this.f = Integer.valueOf(ywfVar.f);
        this.g = ywfVar.g;
    }

    public final void c(int i) {
        this.f = Integer.valueOf(i);
    }

    public final void d(int i) {
        this.d = Integer.valueOf(i);
    }

    public final void e(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    public final void f(int i) {
        this.e = Integer.valueOf(i);
    }

    public final void g(long[] jArr) {
        if (jArr != null) {
            this.b = jArr;
            return;
        }
        throw new NullPointerException("Null serialized");
    }

    public final void h(long[] jArr) {
        if (jArr != null) {
            this.a = jArr;
            return;
        }
        throw new NullPointerException("Null active");
    }

    public final int a() {
        Integer num = this.d;
        if (num == null) {
            throw new IllegalStateException("Property \"disposed\" has not been set");
        }
        return num.intValue();
    }

    public final int b() {
        Integer num = this.e;
        if (num == null) {
            throw new IllegalStateException("Property \"isShutdownLikely\" has not been set");
        }
        return num.intValue();
    }
}
