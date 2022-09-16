package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bkat  reason: default package */
/* loaded from: classes3.dex */
public final class bkat {
    public final Activity a;
    public boolean b;
    @dzsi
    public bdwp c;
    private final Executor d;
    private final btvo e;
    private final bvkx f;
    private boolean g;

    public bkat(Activity activity, Executor executor, btvo btvoVar, bvkx bvkxVar) {
        this.a = activity;
        this.d = executor;
        this.e = btvoVar;
        this.f = bvkxVar;
    }

    public final synchronized void a() {
        this.b = true;
    }

    public final synchronized void b() {
        if (this.e.getPlaceSheetParameters().ar() == 3 && !this.b && !this.g) {
            this.g = true;
            this.f.k(new Runnable(this) { // from class: bkas
                private final bkat a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bkat bkatVar = this.a;
                    synchronized (bkatVar) {
                        if (bkatVar.b) {
                            return;
                        }
                        bdwp bdwpVar = new bdwp(bkatVar.a, null);
                        synchronized (bkatVar) {
                            bkatVar.c = bdwpVar;
                        }
                    }
                }
            }, this.d, bvkw.ON_STARTUP_FULLY_COMPLETE);
        }
    }

    @dzsi
    public final synchronized bdwp c() {
        bdwp bdwpVar;
        bdwpVar = this.c;
        this.c = null;
        return bdwpVar;
    }
}
