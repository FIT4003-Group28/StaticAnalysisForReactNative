package defpackage;

import android.content.Intent;
import android.os.Bundle;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: byoo  reason: default package */
/* loaded from: classes4.dex */
public final class byoo implements bypx {
    public final bvjj a;
    public final cqat b;
    public final dxio<axwq> c;
    private final Executor d;
    private final dxio<axvy> e;
    private final btvo f;

    public byoo(Executor executor, bvjj bvjjVar, cqat cqatVar, dxio<axvy> dxioVar, dxio<axwq> dxioVar2, btvo btvoVar) {
        this.d = executor;
        this.a = bvjjVar;
        this.e = dxioVar;
        this.c = dxioVar2;
        this.b = cqatVar;
        this.f = btvoVar;
    }

    @Override // defpackage.bypx
    public final void a(Intent intent, final gga ggaVar, final int i) {
        Bundle extras = intent.getExtras();
        if (extras != null && extras.getBoolean("cnhowi")) {
            boolean z = this.f.getTripAssistanceNotificationsParameters().e;
            if (this.a.w(bvjk.cC, -1L) != -1) {
                if (this.e.a().l() == 1 && z) {
                    return;
                }
                b(true != this.a.m(bvjk.cD, false) ? 3 : 4);
                return;
            }
            b(2);
            if (z) {
                this.a.Z(bvjk.cC, this.b.b());
                b(1);
            }
            this.d.execute(new Runnable(ggaVar, i) { // from class: byom
                private final gga a;
                private final int b;

                {
                    this.a = ggaVar;
                    this.b = i;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    gga ggaVar2 = this.a;
                    int i2 = this.b;
                    if (ggaVar2.aZ) {
                        Bundle bundle = new Bundle();
                        bundle.putString("notification_type", i2 != 1 ? "TRANSIT_TO_PLACE" : "TRAFFIC_TO_PLACE");
                        byoq byoqVar = new byoq();
                        byoqVar.B(bundle);
                        ggaVar2.D(byoqVar);
                    }
                }
            });
        }
    }

    public final void b(int i) {
        if (this.e.a().l() == i) {
            return;
        }
        deha.q(this.e.a().k(i), new byon(this), dege.a);
    }
}
