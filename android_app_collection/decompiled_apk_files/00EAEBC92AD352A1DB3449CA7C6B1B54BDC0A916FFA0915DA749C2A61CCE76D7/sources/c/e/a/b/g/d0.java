package c.e.a.b.g;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ c0 f4607b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Callable f4608c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d0(c0 c0Var, Callable callable) {
        this.f4607b = c0Var;
        this.f4608c = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4607b.a((c0) this.f4608c.call());
        } catch (Exception e2) {
            this.f4607b.a(e2);
        }
    }
}
