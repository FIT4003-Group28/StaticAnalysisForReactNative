package defpackage;

import java.util.concurrent.CancellationException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: sdp  reason: default package */
/* loaded from: classes7.dex */
public final class sdp implements degu<dspd> {
    final /* synthetic */ dehn a;
    final /* synthetic */ sds b;

    public sdp(sds sdsVar, dehn dehnVar) {
        this.b = sdsVar;
        this.a = dehnVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        sds sdsVar = this.b;
        if (sdsVar.k != this.a) {
            return;
        }
        sdsVar.k = null;
        this.b.T(false);
        if (th instanceof CancellationException) {
            return;
        }
        boolean z = th instanceof qdk;
        this.b.K(z);
        if (z) {
            return;
        }
        rzr y = this.b.y();
        final sds sdsVar2 = this.b;
        y.a(new Runnable(sdsVar2) { // from class: sdo
            private final sds a;

            {
                this.a = sdsVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.w();
            }
        });
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi dspd dspdVar) {
        final dspd dspdVar2 = dspdVar;
        sds sdsVar = this.b;
        if (sdsVar.k != this.a) {
            return;
        }
        sdsVar.k = null;
        this.b.T(false);
        if (dspdVar2 == null) {
            this.b.K(true);
            return;
        }
        sds sdsVar2 = this.b;
        Runnable runnable = new Runnable(this, dspdVar2) { // from class: sdn
            private final sdp a;
            private final dspd b;

            {
                this.a = this;
                this.b = dspdVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                sdp sdpVar = this.a;
                dspd dspdVar3 = this.b;
                sdpVar.b.K(false);
                sdpVar.b.J(dspdVar3);
            }
        };
        bvrj.UI_THREAD.c();
        sdsVar2.r++;
        runnable.run();
        sdsVar2.r--;
        sdsVar2.L();
    }
}
