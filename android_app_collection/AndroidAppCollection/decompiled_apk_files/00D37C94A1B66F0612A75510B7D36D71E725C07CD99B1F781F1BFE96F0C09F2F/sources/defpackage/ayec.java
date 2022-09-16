package defpackage;

import io.grpc.Status;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: ayec  reason: default package */
/* loaded from: classes2.dex */
final class ayec extends aygy {
    private final ayez a;
    private final AtomicInteger b = new AtomicInteger(-2147483647);
    private volatile Status c;
    private Status d;

    public ayec(ayez ayezVar, String str) {
        ayezVar.getClass();
        this.a = ayezVar;
        str.getClass();
    }

    @Override // defpackage.aygy
    protected final ayez a() {
        return this.a;
    }

    @Override // defpackage.aygy, defpackage.ayjt
    public final void j(Status status) {
        status.getClass();
        synchronized (this) {
            if (this.b.get() < 0) {
                this.c = status;
                this.b.addAndGet(Integer.MAX_VALUE);
                if (this.b.get() != 0) {
                    return;
                }
                super.j(status);
            }
        }
    }

    @Override // defpackage.aygy, defpackage.ayjt
    public final void k(Status status) {
        status.getClass();
        synchronized (this) {
            if (this.b.get() < 0) {
                this.c = status;
                this.b.addAndGet(Integer.MAX_VALUE);
            } else if (this.d != null) {
                return;
            }
            if (this.b.get() != 0) {
                this.d = status;
            } else {
                super.k(status);
            }
        }
    }

    @Override // defpackage.aygy, defpackage.ayer
    public final ayeo l(ayax ayaxVar, ayat ayatVar, axyd axydVar, azqj[] azqjVarArr) {
        if (this.b.get() >= 0) {
            return new aygt(this.c, azqjVarArr, null, null);
        }
        return this.a.l(ayaxVar, ayatVar, axydVar, azqjVarArr);
    }
}
