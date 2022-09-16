package defpackage;
/* compiled from: PG */
/* renamed from: aynb  reason: default package */
/* loaded from: classes2.dex */
public final class aynb implements aynl {
    public int a;
    public boolean b;
    private final axyg c;
    private boolean d;
    private boolean e;

    public aynb() {
    }

    public aynb(axyg axygVar) {
        this.a = 1;
        this.b = true;
        this.d = false;
        this.e = false;
        this.c = axygVar;
    }

    @Override // defpackage.aynl
    public final void a() {
        this.c.c();
        this.e = true;
    }

    @Override // defpackage.aynl
    public final void b(Throwable th) {
        this.c.b("Cancelled by client with StreamObserver.onError()", th);
        this.d = true;
    }

    @Override // defpackage.aynl
    public final void c(Object obj) {
        aqxo.z(!this.d, "Stream was terminated by error, no further calls are allowed");
        aqxo.z(!this.e, "Stream is already completed, no further calls are allowed");
        this.c.e(obj);
    }

    public final void d(Throwable th) {
        this.c.b("Reset conversation", th);
    }

    public final void e() {
        this.c.d(1);
    }
}
