package defpackage;

import android.content.Intent;
import android.os.IBinder;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: awks  reason: default package */
/* loaded from: classes3.dex */
public final class awks extends affo {
    public bvrv a;
    public gdo b;
    public awar c;
    public awfh d;
    public awkq e;
    public awkv f;
    public avpe g;
    public avph h;
    private boolean i;

    private final void a() {
        if (!this.i) {
            this.g.a();
            awkq awkqVar = this.e;
            btrm btrmVar = awkqVar.c;
            dceq a = dcet.a();
            a.b(crmj.class, new awkr(0, crmj.class, awkqVar));
            a.b(crhp.class, new awkr(1, crhp.class, awkqVar));
            btrmVar.g(awkqVar, a.a());
            awkqVar.k = bvom.a(Locale.getDefault());
            awkqVar.m = new awkp(awkqVar);
            awkqVar.b.F(awkqVar.m, awkqVar.g);
            awkqVar.b.y();
            awkqVar.l = new awkm(awkqVar);
            awkqVar.h.d(awkqVar.l, awkqVar.f);
            this.f.a();
            this.h.a();
            this.i = true;
        }
    }

    @Override // android.app.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // android.app.Service
    @dzsi
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        dxiq.b(this);
        super.onCreate();
        this.b.b();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        if (this.i) {
            this.g.c();
            awkq awkqVar = this.e;
            avoy avoyVar = awkqVar.l;
            if (avoyVar != null) {
                awkqVar.h.e(avoyVar);
                awkqVar.l = null;
            }
            avlm avlmVar = awkqVar.m;
            if (avlmVar != null) {
                awkqVar.b.G(avlmVar);
                awkqVar.m = null;
            }
            dehn<?> dehnVar = awkqVar.n;
            if (dehnVar != null) {
                dehnVar.cancel(false);
                awkqVar.n = null;
            }
            awkqVar.c.a(awkqVar);
            while (awkqVar.o.isHeld()) {
                awkqVar.d();
            }
            bvrv bvrvVar = awkqVar.d;
            awkqVar.b.z();
            awkqVar.i = null;
            awkqVar.j = null;
            awkqVar.k = null;
            this.f.b();
            this.h.b();
            this.i = false;
        }
        stopForeground(true);
        this.b.e();
        this.a.a();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (!this.d.i()) {
            stopSelf();
            return 2;
        }
        auhk r = this.c.r();
        dbsk.s(r);
        startForeground(r.a.g, r.c);
        if (intent == null || intent.getAction() == null) {
            a();
            return 1;
        } else if (!"StartDynamicPadding".equals(intent.getAction())) {
            return 1;
        } else {
            a();
            return 1;
        }
    }
}
