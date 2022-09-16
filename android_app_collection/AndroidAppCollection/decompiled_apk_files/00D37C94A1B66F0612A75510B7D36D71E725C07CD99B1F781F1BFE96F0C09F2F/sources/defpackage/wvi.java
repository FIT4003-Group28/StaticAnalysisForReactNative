package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.MediaAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: wvi  reason: default package */
/* loaded from: classes4.dex */
public final class wvi implements wvs, wul, wlk, wlp {
    boolean d;
    private final azqb e;
    final xei a = new xei();
    final Map b = new HashMap();
    final Map c = new HashMap();
    private String f = "";

    public wvi(azqb azqbVar, wnj wnjVar) {
        this.e = azqbVar;
        wnjVar.a(this);
    }

    private final void l(String str) {
        String str2 = (String) this.b.get(str);
        if (TextUtils.equals(this.f, str2)) {
            return;
        }
        ArrayList arrayList = new ArrayList(2);
        if (!amps.e(this.f)) {
            m(arrayList, this.f, false);
            this.f = "";
        }
        if (!amps.e(str2)) {
            m(arrayList, str2, true);
            this.f = str2;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((wvr) this.e.get()).q(arrayList);
    }

    private final void m(List list, String str, boolean z) {
        for (xeh xehVar : this.a.c()) {
            if (TextUtils.equals(((aeso) xehVar.c.d(xaw.class)).a, str)) {
                xek xekVar = xehVar.b;
                if (z) {
                    if (xekVar instanceof xcr) {
                        list.add(xehVar);
                        return;
                    }
                } else if (xekVar instanceof xcq) {
                    list.add(xehVar);
                    return;
                }
            }
        }
        String str2 = true != z ? "Exiting" : "Entering";
        wwf.a(null, str2.length() != 0 ? "LiveStreamBreakTransitionTriggerAdapter: cannot activate trigger of type ".concat(str2) : new String("LiveStreamBreakTransitionTriggerAdapter: cannot activate trigger of type "));
    }

    @Override // defpackage.wlk
    public final void f(aika aikaVar, PlayerResponseModel playerResponseModel, ajbf ajbfVar, String str, String str2) {
        if (aikaVar == aika.NEW) {
            this.b.clear();
            this.c.clear();
            this.f = "";
        } else if (aikaVar != aika.PLAYBACK_LOADED) {
        } else {
            this.d = playerResponseModel.c().aw();
        }
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void h(int i, String str) {
    }

    @Override // defpackage.wlp
    public final void i(String str) {
        l(str);
    }

    @Override // defpackage.wlp
    public final /* synthetic */ void j(long j) {
    }

    @Override // defpackage.wul
    public final void k(xci xciVar, String str) {
        for (xci xciVar2 : (List) xciVar.e(xbp.class)) {
            if (xciVar2.f(xbh.class)) {
                this.b.put(((MediaAd) xciVar2.e(xbh.class)).l, str);
            }
        }
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
    public final void qK(String str, int i) {
        if (!this.d) {
            return;
        }
        if (amps.e((String) this.b.get(str)) && i == 1) {
            wwf.a(null, "LiveStreamBreakTransitionTriggerAdapter: cannot retrieve cuepoint from associated cpn");
        }
        l(str);
    }

    @Override // defpackage.wlk
    public final void qM(ahgc ahgcVar) {
        aeso a = ahgcVar.a();
        this.c.put(a.a, a);
    }

    @Override // defpackage.wvs
    public final void qN(int i, xek xekVar, xdu xduVar, xci xciVar) {
        if (this.a.e(xekVar.c())) {
            String str = xduVar.a;
            throw new wuq(str.length() != 0 ? "Tried to register duplicate trigger for slot: ".concat(str) : new String("Tried to register duplicate trigger for slot: "));
        } else if ((xekVar instanceof xcr) || (xekVar instanceof xcq)) {
            this.a.d(xekVar.c(), new xeh(i, xekVar, xduVar, xciVar));
        } else {
            String str2 = xduVar.a;
            String name = xekVar.b().name();
            StringBuilder sb = new StringBuilder(str2.length() + 117 + String.valueOf(name).length());
            sb.append("Incorrect TriggerType: Tried to register entry trigger for slot: ");
            sb.append(str2);
            sb.append(" of type ");
            sb.append(name);
            sb.append(" in LiveStreamBreakTransitionTriggerAdapter");
            throw new wuq(sb.toString());
        }
    }

    @Override // defpackage.wvs
    public final void qO(xek xekVar) {
        this.a.b(xekVar.c());
    }
}
