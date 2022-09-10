package defpackage;

import androidx.work.WorkerParameters;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: axbh  reason: default package */
/* loaded from: classes3.dex */
public final class axbh implements irw {
    public final dxio<axbl> a;
    private final Executor b;

    public axbh(dxio<axbl> dxioVar, Executor executor) {
        this.a = dxioVar;
        this.b = executor;
    }

    @Override // defpackage.irw
    public final dehn<bbx> a(final WorkerParameters workerParameters) {
        return deha.f(new deff(this, workerParameters) { // from class: axbf
            private final axbh a;
            private final WorkerParameters b;

            {
                this.a = this;
                this.b = workerParameters;
            }

            @Override // defpackage.deff
            public final dehn a() {
                axbh axbhVar = this.a;
                dbsg r = dcbg.b(this.b.c).r(new dbsl() { // from class: axbg
                    private final String a = "PASSIVE_ASSIST.CLEAR_EXPIRED_DATA";

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj) {
                        return this.a.equals((String) obj);
                    }
                });
                if (!r.a()) {
                    return deha.a(bbx.c());
                }
                r.b();
                axbl a = axbhVar.a.a();
                String[] list = new File(bwrg.a(a.g, bwre.PERSISTENT_FILE), "passive_assist/").list();
                if (list != null) {
                    boolean z = true;
                    for (String str : list) {
                        if (!str.endsWith(".bak")) {
                            String substring = str.substring(0, str.lastIndexOf("_cache.data") + 11);
                            String substring2 = substring.substring(0, str.indexOf("_cache.data"));
                            synchronized (a.h) {
                                a.h.add(substring2);
                            }
                            bwrh<axds> bwrhVar = a.a;
                            dssr<axds> dssrVar = (dssr) axds.ac.cu(7);
                            bwre bwreVar = bwre.PERSISTENT_FILE;
                            String valueOf = String.valueOf(substring);
                            bwrg<axds> a2 = bwrhVar.a(dssrVar, bwreVar, valueOf.length() != 0 ? "passive_assist/".concat(valueOf) : new String("passive_assist/"));
                            axds axdsVar = a2.i().a;
                            if (axdsVar == null) {
                                String valueOf2 = String.valueOf(str);
                                bvoo.j(new Exception(valueOf2.length() != 0 ? "Failed to load cache proto from file passive_assist/".concat(valueOf2) : new String("Failed to load cache proto from file passive_assist/")));
                                z = false;
                            } else {
                                axds a3 = a.e.a(axdsVar, (int) TimeUnit.MILLISECONDS.toSeconds(a.b.b()), dcep.M(awvv.a()));
                                synchronized (a.h) {
                                    if (a.h.contains(substring2)) {
                                        if (a3 != null) {
                                            dsqp dsqpVar = (dsqp) a3.cu(5);
                                            dsqpVar.bC(a3);
                                            axdr axdrVar = (axdr) dsqpVar;
                                            int i = axdsVar.b;
                                            if (axdrVar.c) {
                                                axdrVar.bF();
                                                axdrVar.c = false;
                                            }
                                            axds axdsVar2 = (axds) axdrVar.b;
                                            axdsVar2.a |= 1;
                                            axdsVar2.b = i;
                                            dkut dkutVar = axdsVar.c;
                                            if (dkutVar == null) {
                                                dkutVar = dkut.X;
                                            }
                                            if (axdrVar.c) {
                                                axdrVar.bF();
                                                axdrVar.c = false;
                                            }
                                            axds axdsVar3 = (axds) axdrVar.b;
                                            dkutVar.getClass();
                                            axdsVar3.c = dkutVar;
                                            int i2 = axdsVar3.a | 2;
                                            axdsVar3.a = i2;
                                            String str2 = axdsVar.d;
                                            str2.getClass();
                                            int i3 = i2 | 4;
                                            axdsVar3.a = i3;
                                            axdsVar3.d = str2;
                                            String str3 = axdsVar.e;
                                            str3.getClass();
                                            axdsVar3.a = i3 | 8;
                                            axdsVar3.e = str3;
                                            a2.f(axdrVar.bK());
                                        } else {
                                            a2.k();
                                        }
                                        a.h.remove(substring2);
                                    }
                                }
                            }
                        }
                    }
                    if (!z) {
                        return deha.a(bbx.c());
                    }
                }
                return deha.a(bbx.a());
            }
        }, this.b);
    }
}
