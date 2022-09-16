package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aygh  reason: default package */
/* loaded from: classes2.dex */
public final class aygh implements ayeq {
    public final ayeq a;
    public volatile boolean b;
    public List c = new ArrayList();

    public aygh(ayeq ayeqVar) {
        this.a = ayeqVar;
    }

    private final void b(Runnable runnable) {
        synchronized (this) {
            if (!this.b) {
                this.c.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    @Override // defpackage.ayeq
    public final void a(Status status, ayep ayepVar, ayat ayatVar) {
        b(new aygg(this, status, ayepVar, ayatVar));
    }

    @Override // defpackage.ayeq
    public final void c(ayat ayatVar) {
        b(new aygf(this, ayatVar));
    }

    @Override // defpackage.aymn
    public final void d(aymm aymmVar) {
        if (this.b) {
            this.a.d(aymmVar);
        } else {
            b(new aygd(this, aymmVar));
        }
    }

    @Override // defpackage.aymn
    public final void e() {
        if (this.b) {
            this.a.e();
        } else {
            b(new ayge(this));
        }
    }
}
