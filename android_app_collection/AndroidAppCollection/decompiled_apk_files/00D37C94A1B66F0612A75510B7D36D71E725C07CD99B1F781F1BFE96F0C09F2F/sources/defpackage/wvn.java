package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: wvn  reason: default package */
/* loaded from: classes4.dex */
public final class wvn implements wvs, wlk {
    final xei a = new xei();
    private final azqb b;
    private String c;
    private boolean d;

    public wvn(azqb azqbVar) {
        this.b = azqbVar;
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void f(aika aikaVar, PlayerResponseModel playerResponseModel, ajbf ajbfVar, String str, String str2) {
    }

    @Override // defpackage.wlk
    public final void h(int i, String str) {
        boolean z = false;
        if (!TextUtils.equals(this.c, str)) {
            this.c = str;
            this.d = false;
        }
        if (i == 3 || i == 2 || i == 4) {
            ArrayList arrayList = new ArrayList();
            for (xeh xehVar : this.a.c()) {
                xek xekVar = xehVar.b;
                if (xekVar instanceof xcw) {
                    xcw xcwVar = (xcw) xekVar;
                    if (i == 3 && TextUtils.equals(xcwVar.a, str)) {
                        arrayList.add(xehVar);
                    }
                } else if (xekVar instanceof xcy) {
                    xcy xcyVar = (xcy) xekVar;
                    if (i == 2 && this.d && TextUtils.equals(xcyVar.a, str)) {
                        arrayList.add(xehVar);
                    }
                } else if (xekVar instanceof xcx) {
                    if (i == 2 && !this.d && TextUtils.equals(((xcx) xekVar).a, str)) {
                        arrayList.add(xehVar);
                    }
                } else if (xekVar instanceof xbz) {
                    xbz xbzVar = (xbz) xekVar;
                    if (i == 4 && TextUtils.equals(xbzVar.a, str)) {
                        arrayList.add(xehVar);
                    }
                }
            }
            if (this.d || i == 2) {
                z = true;
            }
            this.d = z;
            if (arrayList.isEmpty()) {
                return;
            }
            ((wvr) this.b.get()).q(arrayList);
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
    public final /* synthetic */ void qK(String str, int i) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qM(ahgc ahgcVar) {
    }

    @Override // defpackage.wvs
    public final void qN(int i, xek xekVar, xdu xduVar, xci xciVar) {
        if (this.a.e(xekVar.c())) {
            String str = xduVar.a;
            throw new wuq(str.length() != 0 ? "Tried to register duplicate trigger for slot: ".concat(str) : new String("Tried to register duplicate trigger for slot: "));
        } else if ((xekVar instanceof xcw) || (xekVar instanceof xcy) || (xekVar instanceof xcx) || (xekVar instanceof xbz)) {
            this.a.d(xekVar.c(), new xeh(i, xekVar, xduVar, xciVar));
        } else {
            String str2 = xduVar.a;
            String name = xekVar.b().name();
            StringBuilder sb = new StringBuilder(str2.length() + 102 + String.valueOf(name).length());
            sb.append("Incorrect TriggerType: Tried to register trigger for slot: ");
            sb.append(str2);
            sb.append(" of type ");
            sb.append(name);
            sb.append(" in PlayerStateEventTriggerAdapter");
            throw new wuq(sb.toString());
        }
    }

    @Override // defpackage.wvs
    public final void qO(xek xekVar) {
        this.a.b(xekVar.c());
    }
}
