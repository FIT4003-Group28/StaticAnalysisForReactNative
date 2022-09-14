package defpackage;

import android.os.Build;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bmfg  reason: default package */
/* loaded from: classes3.dex */
public class bmfg {
    public static final dcqe a = dcqe.c("bmfg");
    public final degu<List<String>> b;
    dcdc<String> c = dcdc.f(Locale.getDefault().getLanguage());
    private final bmgw d;
    private final btvo e;
    private final dehp f;

    public bmfg(bmgw bmgwVar, final ckmc ckmcVar, btvo btvoVar, akfa akfaVar, Executor executor, final dehp dehpVar) {
        this.d = bmgwVar;
        this.e = btvoVar;
        this.f = dehpVar;
        bmff bmffVar = new bmff(this);
        this.b = bmffVar;
        if (a()) {
            ckmcVar.getClass();
            deha.q(dehpVar.c(new Callable(ckmcVar) { // from class: bmfb
                private final ckmc a;

                {
                    this.a = ckmcVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.c();
                }
            }), bmffVar, dehpVar);
            akfaVar.C().a(new crzp(this, dehpVar, ckmcVar) { // from class: bmfc
                private final bmfg a;
                private final dehp b;
                private final ckmc c;

                {
                    this.a = this;
                    this.b = dehpVar;
                    this.c = ckmcVar;
                }

                @Override // defpackage.crzp
                public final void On(crzm crzmVar) {
                    bmfg bmfgVar = this.a;
                    dehp dehpVar2 = this.b;
                    final ckmc ckmcVar2 = this.c;
                    ckmcVar2.getClass();
                    deha.q(dehpVar2.c(new Callable(ckmcVar2) { // from class: bmfe
                        private final ckmc a;

                        {
                            this.a = ckmcVar2;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.a.c();
                        }
                    }), bmfgVar.b, dehpVar2);
                }
            }, executor);
        }
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static final boolean d(ilo iloVar) {
        return iloVar.i || iloVar.be() == iln.GEOCODE;
    }

    private final boolean e(String str) {
        if (dbsj.d(str)) {
            return false;
        }
        Locale forLanguageTag = Locale.forLanguageTag(str);
        if (this.c.contains(forLanguageTag.getLanguage())) {
            return false;
        }
        return this.d.d(forLanguageTag) || this.e.getPlaceSheetParameters().U();
    }

    private final boolean f(ilo iloVar) {
        return !iloVar.u().booleanValue() && !dbsj.d(iloVar.s()) && e(iloVar.t());
    }

    private final boolean g(ilo iloVar) {
        if (f(iloVar)) {
            return false;
        }
        if (e(iloVar.t())) {
            return true;
        }
        String r = iloVar.r();
        return e(r) && this.d.d(Locale.forLanguageTag(r));
    }

    private final boolean h(ilo iloVar) {
        return !i(iloVar) && !d(iloVar) && e(iloVar.t());
    }

    private final boolean i(ilo iloVar) {
        return !iloVar.C().isEmpty() && !d(iloVar) && e(iloVar.t());
    }

    public final Locale b(ilo iloVar) {
        if (f(iloVar) || h(iloVar) || i(iloVar)) {
            return Locale.forLanguageTag(iloVar.t());
        }
        if (!g(iloVar)) {
            return null;
        }
        return Locale.forLanguageTag(iloVar.r());
    }

    public final boolean c(ilo iloVar, int i) {
        boolean g;
        final dehn<Boolean> a2;
        if (iloVar == null) {
            bvoo.h("Attempted to call isSiteSpeakable() with a null Placemark", new Object[0]);
        }
        if (iloVar.p().a || iloVar.p().b) {
            return false;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            g = g(iloVar);
        } else if (i2 == 1) {
            g = f(iloVar);
        } else if (i2 != 2) {
            g = i(iloVar);
        } else {
            g = h(iloVar);
        }
        Locale b = b(iloVar);
        if (!g || b == null || !this.d.d(b) || (a2 = this.d.a(b)) == null) {
            return g;
        }
        a2.Pk(new Runnable(a2) { // from class: bmfd
            private final dehn a;

            {
                this.a = a2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    ((Boolean) this.a.get()).booleanValue();
                } catch (InterruptedException | ExecutionException e) {
                    bvoo.k(e);
                }
            }
        }, this.f);
        return true;
    }
}
