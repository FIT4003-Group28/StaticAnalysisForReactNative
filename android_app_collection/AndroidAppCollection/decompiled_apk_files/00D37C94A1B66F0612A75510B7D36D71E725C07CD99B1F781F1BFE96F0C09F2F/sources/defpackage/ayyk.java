package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayyk  reason: default package */
/* loaded from: classes2.dex */
public final class ayyk extends AtomicReference implements Runnable, ayqb {
    private static final long serialVersionUID = -4552101107598366241L;
    final ayym a;
    aypg b;
    long c;
    boolean d;
    boolean e;

    public ayyk(ayym ayymVar) {
        this.a = ayymVar;
    }

    @Override // defpackage.ayqb
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        aypg aypgVar = (aypg) obj;
        ayqi.i(this, aypgVar);
        synchronized (this.a) {
            if (this.e) {
                ((ayql) this.a.b).sr(aypgVar);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this);
    }
}
