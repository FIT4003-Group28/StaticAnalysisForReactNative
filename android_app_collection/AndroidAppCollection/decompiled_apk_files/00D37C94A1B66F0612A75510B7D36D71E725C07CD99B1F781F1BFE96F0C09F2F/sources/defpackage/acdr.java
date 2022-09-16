package defpackage;

import android.app.Service;
import android.content.SharedPreferences;
import com.google.android.libraries.youtube.livecreation.screencast.ScreencastHostService;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: acdr  reason: default package */
/* loaded from: classes.dex */
public abstract class acdr extends Service implements axoo {
    private volatile axog a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.axoo
    /* renamed from: b */
    public final axog lH() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new axog(this);
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            ScreencastHostService screencastHostService = (ScreencastHostService) this;
            eap eapVar = (eap) lI();
            acly aclyVar = (acly) eapVar.a.yO.get();
            screencastHostService.a = (yni) eapVar.a.y.get();
            screencastHostService.b = eapVar.a.cI();
            dyo dyoVar = eapVar.a;
            azqb azqbVar = dyoVar.by;
            azqb azqbVar2 = dyoVar.au;
            azqb azqbVar3 = dyoVar.h;
            azqb azqbVar4 = dyoVar.rN;
            azqb b = axoz.b(eapVar.x);
            dyo dyoVar2 = eapVar.a;
            screencastHostService.c = new acft(azqbVar, azqbVar2, azqbVar3, azqbVar4, b, dyoVar2.lV, dyoVar2.kC, dyoVar2.t);
            dyo dyoVar3 = eapVar.a;
            azqb azqbVar5 = dyoVar3.by;
            azqb azqbVar6 = dyoVar3.an;
            azqb azqbVar7 = eapVar.y;
            azqb azqbVar8 = eapVar.z;
            screencastHostService.d = new abyl(azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar8, azqbVar8, dyoVar3.a.by, eapVar.A, eapVar.B, dyoVar3.v, eapVar.D, eapVar.E, eapVar.F, eapVar.C, dyoVar3.Ai);
            screencastHostService.e = (abtx) eapVar.D.get();
            screencastHostService.f = (abss) eapVar.C.get();
            screencastHostService.g = (Executor) eapVar.a.h.get();
            screencastHostService.h = (Executor) eapVar.a.x.get();
            screencastHostService.i = axot.a(eapVar.I);
            screencastHostService.j = eapVar.a.a.O();
            screencastHostService.k = (SharedPreferences) eapVar.a.t.get();
            screencastHostService.l = (akvm) eapVar.a.hl.get();
        }
        super.onCreate();
    }
}
