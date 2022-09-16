package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azho  reason: default package */
/* loaded from: classes2.dex */
public final class azho extends AtomicReference implements Runnable, ayqb {
    private static final long serialVersionUID = -4552101107598366241L;
    final azhq a;
    aypg b;
    long c;
    boolean d;
    boolean e;

    public azho(azhq azhqVar) {
        this.a = azhqVar;
    }

    @Override // defpackage.ayqb
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        aypg aypgVar = (aypg) obj;
        ayqi.i(this, aypgVar);
        synchronized (this.a) {
            if (this.e) {
                ((ayql) this.a.a).sr(aypgVar);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this);
    }
}
