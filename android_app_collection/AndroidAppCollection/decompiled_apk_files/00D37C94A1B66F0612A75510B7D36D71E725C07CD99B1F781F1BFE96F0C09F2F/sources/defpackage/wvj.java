package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: wvj  reason: default package */
/* loaded from: classes4.dex */
public final class wvj implements wvs, wlk {
    final xei a = new xei();
    private final azqb b;
    private String c;

    public wvj(azqb azqbVar) {
        this.b = azqbVar;
    }

    @Override // defpackage.wlk
    public final void f(aika aikaVar, PlayerResponseModel playerResponseModel, ajbf ajbfVar, String str, String str2) {
        if (!aikaVar.a(aika.INTERSTITIAL_PLAYING, aika.VIDEO_PLAYING)) {
            this.c = "";
            return;
        }
        if (aikaVar != aika.VIDEO_PLAYING) {
            str = str2;
        }
        this.c = str;
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void h(int i, String str) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qD(afkn afknVar) {
    }

    @Override // defpackage.wlk
    public final void qE(String str) {
        if (!TextUtils.equals(str, this.c)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (xeh xehVar : this.a.c()) {
            if (TextUtils.equals(((xcv) xehVar.b).a, str)) {
                arrayList.add(xehVar);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((wvr) this.b.get()).q(arrayList);
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qF(aijs aijsVar, aijs aijsVar2, int i, int i2, boolean z, boolean z2) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qG(String str, long j, long j2, long j3, boolean z) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qK(String str, int i) {
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
        } else if (!(xekVar instanceof xcv)) {
            String name = xekVar.b().name();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 87);
            sb2.append("Incorrect TriggerType: Tried to register trigger ");
            sb2.append(name);
            sb2.append(" in NonTerminalAbandonedTriggerAdapter");
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
