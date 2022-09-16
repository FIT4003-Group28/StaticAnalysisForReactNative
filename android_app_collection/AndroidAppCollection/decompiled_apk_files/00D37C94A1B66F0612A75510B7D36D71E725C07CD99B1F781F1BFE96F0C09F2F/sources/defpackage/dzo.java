package defpackage;

import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.apps.youtube.app.extensions.appindexing.WatchVideoIndexer;
import java.io.File;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dzo */
/* loaded from: classes3.dex */
public final class dzo implements Runnable {
    final /* synthetic */ dzs a;
    private final /* synthetic */ int b;

    public dzo(dzs dzsVar) {
        this.a = dzsVar;
    }

    public dzo(dzs dzsVar, int i) {
        this.b = i;
        this.a = dzsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                yhr.c(this.a.bc);
                asxj asxjVar = ((aacz) this.a.at.get()).b().e;
                if (asxjVar == null) {
                    asxjVar = asxj.a;
                }
                if (asxjVar.y) {
                    ((yus) this.a.aH.get()).a();
                }
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
                this.a.bc.registerReceiver(new fai(), intentFilter);
                return;
            case 1:
                athd athdVar = ((aacz) this.a.at.get()).b().o;
                if (athdVar == null) {
                    athdVar = athd.a;
                }
                if (athdVar.k) {
                    athd athdVar2 = ((aacz) this.a.at.get()).b().o;
                    if (athdVar2 == null) {
                        athdVar2 = athd.a;
                    }
                    if (athdVar2.j) {
                        ((faa) this.a.ae.get()).a();
                        ((fab) this.a.ad.get()).a();
                        ((gss) this.a.ac.get()).a();
                        return;
                    }
                }
                fab.b((yjs) this.a.ao.get());
                gss.b((yjs) this.a.ao.get());
                return;
            case 2:
                aacz aaczVar = (aacz) this.a.at.get();
                if (Build.VERSION.SDK_INT < 23 || !agbo.d(aaczVar)) {
                    return;
                }
                ((fae) this.a.aI.get()).a(this.a.bc);
                return;
            case 3:
                asxj asxjVar2 = ((aacz) this.a.at.get()).b().e;
                if (asxjVar2 == null) {
                    asxjVar2 = asxj.a;
                }
                if (!asxjVar2.au) {
                    return;
                }
                ((gsz) this.a.I.get()).a();
                return;
            case 4:
                aukw aukwVar = ((aacz) this.a.at.get()).b().E;
                if (aukwVar == null) {
                    aukwVar = aukw.a;
                }
                if (!aukwVar.b) {
                    return;
                }
                ((gtu) this.a.f199J.get()).c();
                return;
            case 5:
                ((jcq) this.a.K.get()).d();
                return;
            case 6:
                ((jhp) this.a.L.get()).a();
                return;
            case 7:
                ((jgo) this.a.M.get()).c();
                return;
            case 8:
                this.a.X.get();
                dzs dzsVar = this.a;
                ylx.k(dzsVar.f, (Executor) dzsVar.al.get(), dzl.a, new ylw(null) { // from class: dzm
                    @Override // defpackage.ylw, defpackage.zdt
                    public final void a(Object obj) {
                        dzs dzsVar2 = dzo.this.a;
                        if (((Boolean) obj).booleanValue() || !((Boolean) dzsVar2.g.get()).booleanValue()) {
                            return;
                        }
                        aveq aveqVar = ((aacz) dzsVar2.at.get()).b().u;
                        if (aveqVar == null) {
                            aveqVar = aveq.a;
                        }
                        apgx apgxVar = aveqVar.g;
                        if (apgxVar == null) {
                            apgxVar = apgx.a;
                        }
                        if (!apgxVar.j || !((yrj) dzsVar2.ap.get()).o() || ((edw) dzsVar2.au.get()).a() != 2) {
                            return;
                        }
                        ((efz) dzsVar2.aO.get()).a().S(new dzd(dzsVar2, 14), dzq.b);
                    }
                });
                ((aapk) this.a.Y.get()).b();
                ((isi) this.a.Z.get()).a();
                this.a.aa.get();
                this.a.c();
                return;
            case 9:
                ((SharedPreferences) this.a.an.get()).registerOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) this.a.aU.get());
                ((aadd) this.a.as.get()).a.V(dzy.b).B().at(new ayqb(null) { // from class: dzp
                    @Override // defpackage.ayqb
                    public final void a(Object obj) {
                        lbm.a((aupg) obj, (SharedPreferences) dzo.this.a.an.get());
                    }
                }, dzq.a);
                return;
            case 10:
                ((akid) this.a.p.get()).d();
                ((WatchVideoIndexer) this.a.q.get()).h();
                return;
            case 11:
                for (File file : ((File) this.a.aq.get()).listFiles()) {
                    file.delete();
                }
                ((akid) this.a.p.get()).d();
                ((WatchVideoIndexer) this.a.q.get()).h();
                return;
            case 12:
                ((akuw) this.a.v.get()).b();
                return;
            case 13:
                ((egc) this.a.bb.get()).b();
                return;
            case 14:
                ((ajad) this.a.w.get()).c();
                this.a.c();
                return;
            case 15:
                ((aisl) this.a.aB.get()).a();
                this.a.c();
                return;
            default:
                ((aisl) this.a.aB.get()).a();
                this.a.c();
                return;
        }
    }
}
