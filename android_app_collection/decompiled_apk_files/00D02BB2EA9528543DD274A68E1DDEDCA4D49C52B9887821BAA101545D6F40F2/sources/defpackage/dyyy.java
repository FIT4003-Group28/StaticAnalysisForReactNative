package defpackage;
/* compiled from: PG */
/* renamed from: dyyy  reason: default package */
/* loaded from: classes6.dex */
public final class dyyy<T> extends dyyx<T> {
    public final dyex<T, ?> a;
    private boolean b = false;
    private boolean c = false;

    public dyyy(dyex<T, ?> dyexVar) {
        this.a = dyexVar;
    }

    @Override // defpackage.dyzk
    public final void a(Throwable th) {
        this.a.d("Cancelled by client with StreamObserver.onError()", th);
        this.b = true;
    }

    @Override // defpackage.dyzk
    public final void b() {
        this.a.e();
        this.c = true;
    }

    @Override // defpackage.dyzk
    public final void c(T t) {
        dbsk.m(!this.b, "Stream was terminated by error, no further calls are allowed");
        dbsk.m(!this.c, "Stream is already completed, no further calls are allowed");
        this.a.f(t);
    }

    public final void d() {
        this.a.c(1);
    }
}
