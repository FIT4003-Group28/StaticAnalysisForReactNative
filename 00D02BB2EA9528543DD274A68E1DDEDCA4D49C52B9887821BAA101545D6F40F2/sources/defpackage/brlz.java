package defpackage;

import android.app.Application;
import android.content.Intent;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: brlz  reason: default package */
/* loaded from: classes.dex */
public class brlz {
    public static final dcqe a = dcqe.c("brlz");
    public final Application b;
    public final cscw c;
    public final btrm d;
    public final bvrb e;
    public final brly f;
    @dzsi
    public volatile daqq g;
    private final brlw h;

    public brlz(Application application, btrm btrmVar, bvrb bvrbVar) {
        cscw cscwVar = new cscw(application);
        this.g = null;
        this.h = new brlw(this);
        this.b = application;
        this.c = cscwVar;
        this.d = btrmVar;
        this.e = bvrbVar;
        this.f = new brly(this);
    }

    public final void a() {
        if (bvrj.UI_THREAD.b()) {
            b();
        } else {
            this.e.b(new Runnable(this) { // from class: brlv
                private final brlz a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b();
                }
            }, bvrj.UI_THREAD);
        }
    }

    public final void b() {
        cscw cscwVar = this.c;
        brlw brlwVar = this.h;
        dbsk.l(Looper.getMainLooper().getThread() == Thread.currentThread());
        dbsk.s(brlwVar);
        cscwVar.f = brlwVar;
        String a2 = cscw.a(cscwVar.d);
        if (a2 == null) {
            return;
        }
        cscwVar.e = cscwVar.d.bindService(new Intent("com.google.android.ssb.action.SSB_SERVICE").setPackage(a2), cscwVar.c, 1);
        boolean z = cscwVar.e;
    }

    public final boolean c() {
        return this.c.a != null;
    }
}
