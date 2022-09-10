package defpackage;

import android.app.Application;
import android.content.Context;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import java.io.File;
/* compiled from: PG */
/* renamed from: ckod  reason: default package */
/* loaded from: classes.dex */
public final class ckod implements cxfn {
    private final cxfv a;
    @dzsi
    private volatile cxgd b;
    @dzsi
    private duxm c;
    private final dzsj<cjqy> d;
    private final Application e;
    private final bvjj f;

    public ckod(Application application, dzsj<duxm> dzsjVar, dzsj<cjqy> dzsjVar2, bvjj bvjjVar, final akfa akfaVar, dzsj<dkiy> dzsjVar3) {
        this.d = dzsjVar2;
        cxfu cxfuVar = new cxfu();
        cxfuVar.a = application;
        cxfuVar.e = akfaVar.d();
        cxfuVar.b = "GMM_PRIMES";
        if (dzsjVar3.a().L) {
            akfaVar.getClass();
            cxfuVar.c = new cxfi(akfaVar) { // from class: ckoc
                private final akfa a;

                {
                    this.a = akfaVar;
                }

                @Override // defpackage.cxfi
                public final String a() {
                    return this.a.o();
                }
            };
        }
        Context context = cxfuVar.a;
        this.a = new cxfv(context, new cxfs(context.getPackageName(), cxfuVar.b, cxfuVar.c, cxfuVar.d, cxfuVar.e), new ClearcutMetricSnapshotTransmitter(null));
        this.e = application;
        this.f = bvjjVar;
        try {
            this.c = dzsjVar.a();
        } catch (RuntimeException unused) {
            this.c = null;
        }
    }

    @Override // defpackage.cxfn
    public final void a(eacd eacdVar) {
        if (this.f.m(bvjk.io, false)) {
            if (this.b == null) {
                synchronized (this) {
                    if (this.b == null) {
                        File file = new File(this.e.getExternalFilesDir(null), "primes_metrics");
                        this.b = new cxgd(file);
                        file.getAbsolutePath();
                    }
                }
            }
            if (this.b != null) {
                this.b.a(eacdVar);
            }
        }
        if ((eacdVar.a & 32) == 0) {
            this.a.a(eacdVar);
            return;
        }
        duxm duxmVar = this.c;
        if (duxmVar == null) {
            return;
        }
        if (duxmVar.m) {
            this.d.a().F(eacdVar);
        }
        if (!duxmVar.n) {
            return;
        }
        this.a.a(eacdVar);
    }
}
