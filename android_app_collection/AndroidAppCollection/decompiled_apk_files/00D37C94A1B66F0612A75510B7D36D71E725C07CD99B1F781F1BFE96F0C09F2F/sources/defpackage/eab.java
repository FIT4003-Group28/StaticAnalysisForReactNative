package defpackage;

import android.net.Uri;
import com.google.android.apps.youtube.app.application.backup.YouTubeBackupAgent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: eab  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class eab implements Runnable {
    public final /* synthetic */ eai a;
    private final /* synthetic */ int b;

    public /* synthetic */ eab(eai eaiVar) {
        this.a = eaiVar;
    }

    public /* synthetic */ eab(eai eaiVar, int i) {
        this.b = i;
        this.a = eaiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dzk dzkVar;
        eai eaiVar;
        boolean z = false;
        int i = 2;
        switch (this.b) {
            case 0:
                eai eaiVar2 = this.a;
                if (!eog.aH(eaiVar2.bu)) {
                    return;
                }
                ((grx) eaiVar2.aE.get()).a();
                return;
            case 1:
                eai eaiVar3 = this.a;
                aksw akswVar = (aksw) eaiVar3.ab.get();
                azqb azqbVar = eaiVar3.aF;
                azqbVar.getClass();
                akswVar.d("system_health_cap_primes", new dzk(azqbVar, 2));
                if (eaiVar3.g.c(ywk.S) == 10) {
                    azqb azqbVar2 = eaiVar3.az;
                    azqbVar2.getClass();
                    dzkVar = new dzk(azqbVar2, 2);
                } else {
                    azqb azqbVar3 = eaiVar3.ay;
                    azqbVar3.getClass();
                    dzkVar = new dzk(azqbVar3, 2);
                }
                akswVar.d("system_health_delayed_event_metrics", dzkVar);
                axnm axnmVar = eaiVar3.bj;
                axnmVar.getClass();
                akswVar.d("system_health_capturer_battery", new uzv(axnmVar, 1));
                akswVar.e("system_health_tx_gel", new dzx(eaiVar3, 1));
                akswVar.e("system_health_tx_disk", new dzx(eaiVar3));
                aqvb aqvbVar = (aqvb) eaiVar3.aG.get();
                akswVar.a();
                return;
            case 2:
                ((xyt) this.a.bo.get()).a();
                return;
            case 3:
                ((acrb) this.a.Z.get()).a();
                return;
            case 4:
                eai eaiVar4 = this.a;
                ylr.c();
                evt evtVar = new evt((acvp) eaiVar4.M.get(), (yni) eaiVar4.z.get());
                evtVar.b();
                evtVar.c((aiji) eaiVar4.aS.get(), (afkf) eaiVar4.S.get(), eaiVar4.g);
                evtVar.a(eaiVar4.f, eaiVar4.j);
                return;
            case 5:
                this.a.i();
                return;
            case 6:
                ((aggc) this.a.T.get()).b();
                return;
            case 7:
                ((yik) this.a.ac.get()).c();
                return;
            case 8:
                this.a.bs.sh(Boolean.valueOf(!((Boolean) eaiVar.aY.get()).booleanValue()));
                return;
            case 9:
                ((ajms) this.a.aH.get()).c();
                return;
            case 10:
                eai eaiVar5 = this.a;
                if (!YouTubeBackupAgent.f((zen) eaiVar5.at.get())) {
                    return;
                }
                YouTubeBackupAgent.g(eaiVar5.f);
                eaiVar5.br = YouTubeBackupAgent.a(eaiVar5.f);
                return;
            case 11:
                ((adxy) this.a.W.get()).c();
                return;
            case 12:
                ((agbu) this.a.U.get()).a(eso.a());
                return;
            case 13:
                ((agak) this.a.aD.get()).a();
                return;
            case 14:
                ((acrr) this.a.ax.get()).a();
                return;
            case 15:
                final eai eaiVar6 = this.a;
                final evt evtVar2 = new evt((acvp) eaiVar6.M.get(), (yni) eaiVar6.z.get());
                evtVar2.b();
                evtVar2.a(eaiVar6.f, eaiVar6.j);
                eaiVar6.a.execute(new Runnable() { // from class: dzw
                    @Override // java.lang.Runnable
                    public final void run() {
                        eai eaiVar7 = eai.this;
                        evtVar2.c((aiji) eaiVar7.aS.get(), (afkf) eaiVar7.S.get(), eaiVar7.g);
                        yni yniVar = (yni) eaiVar7.z.get();
                        acvp acvpVar = (acvp) eaiVar7.M.get();
                        Iterator it = ((Set) eaiVar7.L.get()).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            exn exnVar = (exn) it.next();
                            if (exnVar.c()) {
                                exnVar.b(acvpVar);
                                eaiVar7.bt = exnVar.a();
                                ymg ymgVar = eaiVar7.bt;
                                if (ymgVar != null) {
                                    yniVar.d(ymgVar);
                                    break;
                                }
                            }
                        }
                        aaqd b = eaiVar7.h.b();
                        yniVar.d(new evu(b.k));
                        yniVar.d(new ewm(b.l));
                        yniVar.d(new ewq(b.m));
                        eaiVar7.d.i.d().O(eaiVar7.bs).M(300L, TimeUnit.SECONDS, eaiVar7.b).G(eaiVar7.b).p(15L, TimeUnit.SECONDS, eaiVar7.b).T(new dzu(eaiVar7), new dzu(eaiVar7, 3));
                    }
                });
                return;
            case 16:
                eai eaiVar7 = this.a;
                yqi yqiVar = (yqi) eaiVar7.aQ.get();
                if (!yqiVar.a()) {
                    return;
                }
                afxg afxgVar = (afxg) eaiVar7.f200J.get();
                for (Uri uri : yqiVar.b) {
                    afxgVar.a(uri);
                }
                return;
            case 17:
                eai eaiVar8 = this.a;
                aveq aveqVar = eaiVar8.bu.b().u;
                if (aveqVar == null) {
                    aveqVar = aveq.a;
                }
                apgx apgxVar = aveqVar.g;
                if (apgxVar == null) {
                    apgxVar = apgx.a;
                }
                int b = aphq.b(apgxVar.k);
                if (b == 0) {
                    b = 1;
                }
                int i2 = b - 1;
                if (i2 == 1) {
                    i = 3;
                } else if (i2 != 2) {
                    i = 1;
                }
                aaca aacaVar = (aaca) eaiVar8.aN.get();
                if (b != 1) {
                    z = true;
                }
                aacaVar.a(z, i);
                return;
            case 18:
                eai eaiVar9 = this.a;
                yni yniVar = (yni) eaiVar9.z.get();
                yniVar.a(eaiVar9, afwb.class, new eac(eaiVar9, 1));
                yniVar.a(eaiVar9, afwd.class, new eac(eaiVar9));
                return;
            case 19:
                eai eaiVar10 = this.a;
                athd athdVar = eaiVar10.bu.b().o;
                if (athdVar == null) {
                    athdVar = athd.a;
                }
                if (athdVar.j) {
                    athd athdVar2 = eaiVar10.bu.b().o;
                    if (athdVar2 == null) {
                        athdVar2 = athd.a;
                    }
                    if (athdVar2.k) {
                        ((faa) eaiVar10.al.get()).a();
                        ((fab) eaiVar10.am.get()).a();
                        ((gss) eaiVar10.ak.get()).a();
                        return;
                    }
                }
                fab.b((yjs) eaiVar10.ap.get());
                gss.b((yjs) eaiVar10.ap.get());
                return;
            default:
                this.a.d();
                return;
        }
    }
}
