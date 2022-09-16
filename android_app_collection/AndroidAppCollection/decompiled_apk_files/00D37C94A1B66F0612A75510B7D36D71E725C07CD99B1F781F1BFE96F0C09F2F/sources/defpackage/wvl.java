package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: wvl  reason: default package */
/* loaded from: classes4.dex */
public final class wvl implements wvs, wlk {
    final xei a = new xei();
    public String b;
    private final azqb c;

    public wvl(azqb azqbVar) {
        this.c = azqbVar;
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void f(aika aikaVar, PlayerResponseModel playerResponseModel, ajbf ajbfVar, String str, String str2) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void h(int i, String str) {
    }

    @Override // defpackage.wlk
    public final void qD(afkn afknVar) {
        if (TextUtils.isEmpty(this.b)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (xeh xehVar : this.a.c()) {
            xdf xdfVar = (xdf) xehVar.b;
            xdfVar.e();
            if (afknVar.n() && TextUtils.equals(xdfVar.a(), this.b)) {
                arrayList.add(new xeh(xehVar, xac.b(new xag(wyx.d(afknVar)))));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((wvr) this.c.get()).q(arrayList);
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qE(String str) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qF(aijs aijsVar, aijs aijsVar2, int i, int i2, boolean z, boolean z2) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qG(String str, long j, long j2, long j3, boolean z) {
    }

    @Override // defpackage.wlk
    public final void qK(String str, int i) {
        this.b = str;
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qM(ahgc ahgcVar) {
    }

    @Override // defpackage.wvs
    public final void qN(int i, xek xekVar, xdu xduVar, xci xciVar) {
        if (this.a.e(xekVar.c())) {
            String valueOf = String.valueOf(xekVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append("Tried to register duplicate trigger: ");
            sb.append(valueOf);
            throw new wuq(sb.toString());
        } else if (!(xekVar instanceof xdf)) {
            String name = xekVar.b().name();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 80);
            sb2.append("Incorrect TriggerType: Tried to register trigger ");
            sb2.append(name);
            sb2.append(" in PlaybackErrorTriggerAdapter");
            throw new wuq(sb2.toString());
        } else {
            this.a.d(xekVar.c(), new xeh(i, xekVar, xduVar, xciVar));
        }
    }

    @Override // defpackage.wvs
    public final void qO(xek xekVar) {
        this.a.b(xekVar.c());
    }
}
