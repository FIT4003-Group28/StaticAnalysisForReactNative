package defpackage;

import android.content.Intent;
import android.os.Bundle;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: byot  reason: default package */
/* loaded from: classes4.dex */
public final class byot implements bypy {
    public final bvjj a;
    public final cqat b;
    public final dxio<axwq> c;
    private final Executor d;
    private final dxio<axvy> e;

    public byot(Executor executor, bvjj bvjjVar, cqat cqatVar, dxio<axvy> dxioVar, dxio<axwq> dxioVar2) {
        this.d = executor;
        this.a = bvjjVar;
        this.b = cqatVar;
        this.e = dxioVar;
        this.c = dxioVar2;
    }

    @Override // defpackage.bypy
    public final void a(Intent intent, final gga ggaVar, final int i) {
        Bundle extras = intent.getExtras();
        if (extras != null && extras.getBoolean("cnidwr")) {
            if (this.a.w(bvjk.cB, -1L) != -1) {
                b(this.a.m(bvjk.cE, false) ? 4 : 3);
                return;
            }
            final String string = extras.getString("cnsi");
            final String string2 = extras.getString("obgi");
            b(2);
            this.d.execute(new Runnable(ggaVar, i, string, string2) { // from class: byor
                private final gga a;
                private final String b;
                private final String c;
                private final int d;

                {
                    this.a = ggaVar;
                    this.d = i;
                    this.b = string;
                    this.c = string2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    gga ggaVar2 = this.a;
                    int i2 = this.d;
                    String str = this.b;
                    String str2 = this.c;
                    if (ggaVar2.aZ) {
                        Bundle bundle = new Bundle();
                        bundle.putString("notification_type", i2 != 1 ? "TRANSIT_TO_PLACE" : "TRAFFIC_TO_PLACE");
                        bundle.putString("notification_session_id", str);
                        bundle.putString("notification_ogi", str2);
                        byov byovVar = new byov();
                        byovVar.B(bundle);
                        ggaVar2.D(byovVar);
                    }
                }
            });
        }
    }

    public final void b(int i) {
        if (this.e.a().j() == i) {
            return;
        }
        deha.q(this.e.a().m(i), new byos(this), dege.a);
    }
}
