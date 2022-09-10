package defpackage;

import android.os.Build;
import androidx.work.WorkerParameters;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: huq  reason: default package */
/* loaded from: classes6.dex */
public final class huq implements irw {
    public final dxio<huz> a;
    public final dxio<cjqy> b;
    public final dxio<bvjj> c;
    public final dxio<ckcw> d;
    public final dxio<isa> e;
    private final dehp f;

    public huq(dxio<huz> dxioVar, dxio<cjqy> dxioVar2, dxio<bvjj> dxioVar3, dxio<ckcw> dxioVar4, dxio<isa> dxioVar5, dehp dehpVar) {
        this.a = dxioVar;
        this.b = dxioVar2;
        this.c = dxioVar3;
        this.d = dxioVar4;
        this.e = dxioVar5;
        this.f = dehpVar;
    }

    @Override // defpackage.irw
    public final dehn<bbx> a(final WorkerParameters workerParameters) {
        try {
            this.d.a().f(ckhc.FCM_SERVICE);
            dehn<bbx> c = this.f.c(new Callable(this, workerParameters) { // from class: hun
                private final huq a;
                private final WorkerParameters b;

                {
                    this.a = this;
                    this.b = workerParameters;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    huq huqVar = this.a;
                    try {
                        dbsg r = dcbg.b(this.b.c).r(new dbsl() { // from class: hup
                            private final String a = "NOTIFICATION_OPT_OUT_CHANGE_LOGGER";

                            @Override // defpackage.dbsl
                            public final boolean a(Object obj) {
                                return this.a.equals((String) obj);
                            }
                        });
                        if (!r.a()) {
                            return bbx.c();
                        }
                        r.b();
                        if (Build.VERSION.SDK_INT >= 28) {
                            return bbx.a();
                        }
                        ddkk a = huqVar.a.a().a();
                        if ((a.b & 1024) != 0) {
                            int a2 = ddjw.a(a.u);
                            boolean z = true;
                            boolean z2 = a2 != 0 && a2 == 2;
                            if (!huqVar.c.a().i(bvjk.jY) || huqVar.c.a().m(bvjk.jY, false) == z2) {
                                z = false;
                            }
                            huqVar.c.a().S(bvjk.jY, z2);
                            if (z) {
                                huqVar.b.a().R(dukj.USER_PREFERENCES_CHANGED, null, null, a, null, null);
                            }
                            return bbx.a();
                        }
                        return bbx.a();
                    } catch (RuntimeException e) {
                        huqVar.e.a().b(12, e);
                        return bbx.c();
                    }
                }
            });
            c.Pk(new Runnable(this) { // from class: huo
                private final huq a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.d.a().g(ckhc.FCM_SERVICE);
                }
            }, this.f);
            return c;
        } catch (RuntimeException e) {
            this.e.a().b(12, e);
            return deha.a(bbx.c());
        }
    }
}
