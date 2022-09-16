package defpackage;

import android.content.ComponentName;
import android.content.pm.PackageManager;
/* compiled from: PG */
/* renamed from: eaf  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class eaf implements Runnable {
    public final /* synthetic */ eai a;
    private final /* synthetic */ int b;

    public /* synthetic */ eaf(eai eaiVar) {
        this.a = eaiVar;
    }

    public /* synthetic */ eaf(eai eaiVar, int i) {
        this.b = i;
        this.a = eaiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                eai eaiVar = this.a;
                if (!eaiVar.b().c) {
                    return;
                }
                eaiVar.aU.get();
                return;
            case 1:
                eai eaiVar2 = this.a;
                ((dyz) eaiVar2.f).i(eaiVar2.l);
                return;
            case 2:
                ((ajgq) this.a.m.get()).b();
                return;
            case 3:
                ((ajad) this.a.I.get()).c();
                return;
            case 4:
                ((jhp) this.a.O.get()).a();
                return;
            case 5:
                this.a.p.get();
                return;
            case 6:
                eai eaiVar3 = this.a;
                if (!((yrj) eaiVar3.aq.get()).n()) {
                    return;
                }
                ComponentName componentName = new ComponentName(eaiVar3.f, "com.google.android.youtube.ManageNetworkUsageActivity");
                PackageManager packageManager = eaiVar3.f.getPackageManager();
                if (packageManager.getComponentEnabledSetting(componentName) == 1) {
                    return;
                }
                packageManager.setComponentEnabledSetting(componentName, 1, 1);
                return;
            case 7:
                ((akum) this.a.G.get()).b();
                return;
            case 8:
                ((acrb) this.a.Z.get()).b();
                return;
            case 9:
                eai eaiVar4 = this.a;
                aukw aukwVar = eaiVar4.bu.b().E;
                if (aukwVar == null) {
                    aukwVar = aukw.a;
                }
                if (!aukwVar.b) {
                    return;
                }
                ((gtu) eaiVar4.bm.get()).c();
                return;
            case 10:
                ((zen) this.a.at.get()).d();
                return;
            case 11:
                eai eaiVar5 = this.a;
                eaiVar5.t.get();
                eaiVar5.u.get();
                eaiVar5.v.get();
                eaiVar5.w.get();
                eaiVar5.x.get();
                eaiVar5.y.get();
                eaiVar5.s.get();
                return;
            case 12:
                eai eaiVar6 = this.a;
                ((yni) eaiVar6.z.get()).g((zin) eaiVar6.aj.get());
                return;
            case 13:
                ((acss) this.a.bk.get()).c();
                return;
            case 14:
                ((yvd) this.a.ad.get()).c();
                return;
            case 15:
                eai eaiVar7 = this.a;
                dqt.s(eaiVar7.f);
                dpc.a(eaiVar7.f);
                return;
            case 16:
                ((gtu) this.a.bm.get()).a();
                return;
            case 17:
                eai eaiVar8 = this.a;
                asxj asxjVar = eaiVar8.bu.b().e;
                if (asxjVar == null) {
                    asxjVar = asxj.a;
                }
                if (!asxjVar.au) {
                    return;
                }
                ((gsz) eaiVar8.bl.get()).a();
                return;
            case 18:
                ((aacr) this.a.ao.get()).a();
                return;
            case 19:
                ((jdl) this.a.N.get()).b();
                return;
            default:
                ((aaaw) this.a.ae.get()).c();
                return;
        }
    }
}
