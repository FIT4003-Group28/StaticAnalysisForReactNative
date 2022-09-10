package defpackage;

import android.app.Application;
import android.content.Context;
import com.google.android.apps.gmm.transit.TransitStationService;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: byvd  reason: default package */
/* loaded from: classes.dex */
public final class byvd implements bvkz {
    public final Context a;
    public final dxio<akfa> b;
    @dzsi
    public btlu c;
    private final Executor d;

    public byvd(Application application, Executor executor, dxio<akfa> dxioVar) {
        this.a = application;
        this.d = executor;
        this.b = dxioVar;
    }

    @Override // defpackage.bvkz
    public final Executor a() {
        return this.d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a().l().Pk(new Runnable(this) { // from class: byvb
            private final byvd a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final byvd byvdVar = this.a;
                byvdVar.c = byvdVar.b.a().C().l();
                byvdVar.b.a().C().a(new crzp(byvdVar) { // from class: byvc
                    private final byvd a;

                    {
                        this.a = byvdVar;
                    }

                    @Override // defpackage.crzp
                    public final void On(crzm crzmVar) {
                        byvd byvdVar2 = this.a;
                        btlu l = byvdVar2.b.a().C().l();
                        if (btlu.g(byvdVar2.c, l)) {
                            return;
                        }
                        byvdVar2.c = l;
                        TransitStationService.r(byvdVar2.a, 3);
                    }
                }, dege.a);
            }
        }, dege.a);
    }
}
