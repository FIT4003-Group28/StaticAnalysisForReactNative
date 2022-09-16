package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: wvt  reason: default package */
/* loaded from: classes4.dex */
public final class wvt implements wvs, wlk {
    final xei a = new xei();
    private final azqb b;
    private final azqb c;
    private PlayerResponseModel d;
    private aika e;
    private String f;

    public wvt(azqb azqbVar, azqb azqbVar2) {
        this.b = azqbVar;
        this.c = azqbVar2;
    }

    private final boolean i(xdu xduVar, boolean z) {
        if (this.e != aika.NEW) {
            return false;
        }
        return !z || !((wun) this.c.get()).h().contains(xduVar.a);
    }

    @Override // defpackage.wlk
    public final void f(aika aikaVar, PlayerResponseModel playerResponseModel, ajbf ajbfVar, String str, String str2) {
        this.f = str;
        this.e = aikaVar;
        this.d = playerResponseModel;
        ArrayList arrayList = new ArrayList();
        for (xeh xehVar : this.a.c()) {
            xek xekVar = xehVar.b;
            if (xekVar instanceof xdg) {
                xdg xdgVar = (xdg) xekVar;
                String str3 = xdgVar.a;
                if (i(xehVar.c, xdgVar.b)) {
                    arrayList.add(xehVar);
                }
            } else if (xekVar instanceof xde) {
                xde xdeVar = (xde) xekVar;
                if (this.e == aika.PLAYBACK_LOADED && this.d != null && !TextUtils.equals(xdeVar.a(), this.d.B())) {
                    arrayList.add(xehVar);
                }
            } else if ((xekVar instanceof xab) && this.e == aika.PLAYBACK_LOADED && TextUtils.equals(this.f, ((xab) xehVar.b).a)) {
                arrayList.add(xehVar);
            }
        }
        if (!arrayList.isEmpty()) {
            ((wvr) this.b.get()).q(arrayList);
        }
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void h(int i, String str) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qD(afkn afknVar) {
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
    public final /* synthetic */ void qK(String str, int i) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qM(ahgc ahgcVar) {
    }

    @Override // defpackage.wvs
    public final void qN(int i, xek xekVar, xdu xduVar, xci xciVar) {
        boolean z;
        if (this.a.e(xekVar.c())) {
            String str = xduVar.a;
            throw new wuq(str.length() != 0 ? "Tried to register duplicate trigger for slot: ".concat(str) : new String("Tried to register duplicate trigger for slot: "));
        }
        boolean z2 = xekVar instanceof xdg;
        if (z2 || (xekVar instanceof xde) || (xekVar instanceof xab)) {
            this.a.d(xekVar.c(), new xeh(i, xekVar, xduVar, xciVar));
            if (this.e == null) {
                return;
            }
            if (z2) {
                xdg xdgVar = (xdg) xekVar;
                String str2 = xdgVar.a;
                z = i(xduVar, xdgVar.b);
            } else {
                z = false;
            }
            if ((!(xekVar instanceof xab) || !TextUtils.equals(this.f, ((xab) xekVar).a) || this.e == aika.NEW) && !z) {
                return;
            }
            ((wvr) this.b.get()).q(Arrays.asList(this.a.a(xekVar.c())));
            return;
        }
        String str3 = xduVar.a;
        String valueOf = String.valueOf(xekVar.b());
        StringBuilder sb = new StringBuilder(str3.length() + 107 + String.valueOf(valueOf).length());
        sb.append("Incorrect TriggerType: Tried to register entry trigger for slot: ");
        sb.append(str3);
        sb.append(" of type ");
        sb.append(valueOf);
        sb.append(" in VideoStageEventTriggerAdapter");
        throw new wuq(sb.toString());
    }

    @Override // defpackage.wvs
    public final void qO(xek xekVar) {
        this.a.b(xekVar.c());
    }
}
