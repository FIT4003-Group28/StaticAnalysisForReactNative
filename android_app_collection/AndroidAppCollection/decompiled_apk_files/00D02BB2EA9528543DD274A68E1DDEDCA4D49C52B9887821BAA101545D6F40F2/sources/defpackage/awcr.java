package defpackage;

import android.app.Application;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: awcr  reason: default package */
/* loaded from: classes3.dex */
public final class awcr implements awco {
    public final bvjj a;
    public final Executor b;
    public final avzj c;
    public final dxio<avrw> d;
    @dzsi
    public Boolean e;
    @dzsi
    public Boolean f;
    @dzsi
    public btlu g;
    private final Application h;
    private final dzsj<awga> i;
    private final dzsj<avij> j;
    private final Executor k;

    public awcr(Application application, bvjj bvjjVar, Executor executor, Executor executor2, dzsj<avij> dzsjVar, dzsj<awga> dzsjVar2, avzj avzjVar, dxio<avrw> dxioVar) {
        this.h = application;
        this.a = bvjjVar;
        this.b = executor;
        this.k = executor2;
        this.j = dzsjVar;
        this.i = dzsjVar2;
        this.c = avzjVar;
        this.d = dxioVar;
    }

    @Override // defpackage.awco
    public final void a(final Runnable runnable) {
        final avkr l = this.j.a().C().l();
        if (l == null) {
            return;
        }
        this.k.execute(new Runnable(this, l, runnable) { // from class: awcp
            private final awcr a;
            private final avkr b;
            private final Runnable c;

            {
                this.a = this;
                this.b = l;
                this.c = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                awcr awcrVar = this.a;
                avkr avkrVar = this.b;
                Runnable runnable2 = this.c;
                try {
                    awcrVar.g = awcrVar.c.c(avkrVar.f());
                } catch (avzi unused) {
                    awcrVar.g = null;
                }
                boolean z = false;
                awcrVar.f = Boolean.valueOf(!((avkrVar.e().a & 2) != 0));
                dcpd<dltm> it = avkrVar.c().values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().r) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                awcrVar.e = Boolean.valueOf(z);
                awcrVar.b.execute(runnable2);
            }
        });
    }

    @Override // defpackage.awco
    public final boolean b() {
        Boolean bool;
        Boolean bool2 = this.e;
        return bool2 != null && !bool2.booleanValue() && !btlu.p(this.g) && !this.d.a().a() && !this.a.o(bvjk.en, this.g, false) && (bool = this.f) != null && bool.booleanValue() && bvog.d(this.h) < 524288000 && bvog.l(this.h) >= 209715200;
    }

    @Override // defpackage.awco
    public final awga c() {
        awga a = this.i.a();
        awgb awgbVar = a.a;
        awgbVar.e(a.d.getString(R.string.OFFLINE_MAPS_DOWNLOAD_STORAGE_SETTINGS_TITLE));
        awgbVar.d(a.d.getString(R.string.CANCEL_BUTTON), awfy.a, null);
        awgbVar.c(a.d.getString(R.string.OK_BUTTON), new awfz(a), null);
        a.h = cjtd.a(dtxx.aT);
        a.j = cjtd.a(dtxx.aS);
        a.i = cjtd.a(dtxx.aR);
        a.a.h(1);
        a.b(new Runnable(this) { // from class: awcq
            private final awcr a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                awcr awcrVar = this.a;
                if (btlu.p(awcrVar.g) || awcrVar.d.a().a()) {
                    return;
                }
                btlu btluVar = awcrVar.g;
                dbsk.s(btluVar);
                awcrVar.a.T(bvjk.en, btluVar, true);
            }
        });
        return a;
    }
}
