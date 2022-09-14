package defpackage;

import android.os.SystemClock;
/* compiled from: PG */
/* renamed from: qie  reason: default package */
/* loaded from: classes7.dex */
public final class qie {
    private static final dcqe b = dcqe.c("qie");
    public final ckcn a;
    private final ckcq c;
    private final ckcp d;
    private qid e;
    private final qid f;
    private final boolean g;
    private long h = 0;

    public qie(ckcw ckcwVar, boolean z, boolean z2) {
        this.c = ((ckcr) ckcwVar.a(ckeq.l)).a();
        this.a = (ckcn) ckcwVar.a(ckeq.n);
        this.d = (ckcp) ckcwVar.a(ckeq.m);
        this.f = z ? qid.PENDING : qid.DISABLED;
        this.e = qid.PENDING;
        this.g = z2;
    }

    public final synchronized void a() {
        if (this.e == qid.PENDING) {
            this.e = qid.SUCCESS;
            this.c.b();
            if (!this.g || this.f != qid.SUCCESS) {
                return;
            }
            this.d.a(0L);
            return;
        }
        bvoo.h("Unexpected offline request state transition: %s->SUCCESS", this.e);
    }

    public final synchronized void b() {
        if (this.e == qid.PENDING) {
            this.e = qid.ERROR;
        } else {
            bvoo.h("Unexpected offline request state transition: %s->ERROR", this.e);
        }
    }

    public final synchronized void c() {
        if (this.e != qid.SUCCESS) {
            bvoo.h("Offline response was reported to be used in state %s", this.e);
        } else if (this.h != 0) {
        } else {
            this.h = SystemClock.elapsedRealtime();
        }
    }
}
