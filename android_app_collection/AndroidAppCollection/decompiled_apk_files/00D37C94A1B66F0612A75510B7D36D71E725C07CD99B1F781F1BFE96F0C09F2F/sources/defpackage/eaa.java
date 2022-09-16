package defpackage;

import android.content.IntentFilter;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: eaa  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class eaa implements Runnable {
    public final /* synthetic */ eai a;
    private final /* synthetic */ int b;

    public /* synthetic */ eaa(eai eaiVar) {
        this.a = eaiVar;
    }

    public /* synthetic */ eaa(eai eaiVar, int i) {
        this.b = i;
        this.a = eaiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((aksw) this.a.ab.get()).b();
                return;
            case 1:
                jvk jvkVar = (jvk) this.a.aJ.get();
                jvkVar.b();
                jvkVar.d();
                jvkVar.e();
                return;
            case 2:
                ((aggc) this.a.T.get()).a();
                return;
            case 3:
                eai eaiVar = this.a;
                try {
                    afuy afuyVar = (afuy) eaiVar.aZ.get();
                    ((yni) eaiVar.z.get()).g(afuyVar);
                    ((etd) eaiVar.F.get()).g();
                    afuyVar.b();
                    return;
                } catch (IOException e) {
                    zep.d("Failed to read offline browse from store", e);
                    return;
                }
            case 4:
                this.a.aU.get();
                return;
            case 5:
                ((adyt) this.a.X.get()).c();
                return;
            case 6:
                ((akws) this.a.aC.get()).a();
                return;
            case 7:
                ((yvs) this.a.aV.get()).a();
                return;
            case 8:
                ((egc) this.a.aP.get()).b();
                return;
            case 9:
                eai eaiVar2 = this.a;
                if (eog.bc(eaiVar2.bu)) {
                    eaiVar2.bd.get();
                    return;
                } else {
                    eaiVar2.i();
                    return;
                }
            case 10:
                eai eaiVar3 = this.a;
                ((aidn) eaiVar3.av.get()).a((aidi) eaiVar3.aw.get());
                return;
            case 11:
                eai eaiVar4 = this.a;
                ((aacu) eaiVar4.au.get()).e(new acrl(eaiVar4.ax, (zen) eaiVar4.at.get()));
                return;
            case 12:
                ((akud) this.a.aM.get()).a();
                return;
            case 13:
                this.a.aX.get();
                return;
            case 14:
                ((acrb) this.a.Z.get()).c();
                return;
            case 15:
                ((akuw) this.a.H.get()).b();
                return;
            case 16:
                eai eaiVar5 = this.a;
                aadd a = eaiVar5.h.a();
                agbo.e(a, (yjs) eaiVar5.ap.get(), eaiVar5.e, 0, false);
                agbl.c(a, (yjs) eaiVar5.ap.get(), new dzx(eaiVar5, 2));
                return;
            case 17:
                eai eaiVar6 = this.a;
                try {
                    if (!((Boolean) ((aacu) eaiVar6.au.get()).b().get()).booleanValue() || !new esp((zen) eaiVar6.at.get()).a()) {
                        return;
                    }
                    zew.c((File) eaiVar6.aR.get());
                    return;
                } catch (InterruptedException | ExecutionException e2) {
                    afus.c(2, 18, "Failed to get the fail safe status", e2);
                    return;
                }
            case 18:
                this.a.h();
                return;
            case 19:
                eai eaiVar7 = this.a;
                yhr.c(eaiVar7.f);
                asxj asxjVar = eaiVar7.bu.b().e;
                if (asxjVar == null) {
                    asxjVar = asxj.a;
                }
                if (asxjVar.y) {
                    ((yus) eaiVar7.aA.get()).a();
                }
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
                eaiVar7.f.registerReceiver(new fai(), intentFilter);
                return;
            default:
                eai eaiVar8 = this.a;
                afuw afuwVar = (afuw) eaiVar8.A.get();
                afus.a(afuwVar);
                ((yni) eaiVar8.z.get()).g(eaiVar8.B.get());
                if (!eog.aD(eaiVar8.bu)) {
                    return;
                }
                acrk acrkVar = (acrk) eaiVar8.bf.get();
                afuwVar.b = acrkVar.a((afst) eaiVar8.bg.get());
                afuwVar.g();
                acrkVar.b();
                acrkVar.d(eaiVar8.a);
                return;
        }
    }
}
