package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: wvm  reason: default package */
/* loaded from: classes4.dex */
public final class wvm implements wvs, wlk {
    final xei a = new xei();
    public String b;
    private final azqb c;
    private aijs d;

    public wvm(azqb azqbVar) {
        this.c = azqbVar;
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void f(aika aikaVar, PlayerResponseModel playerResponseModel, ajbf ajbfVar, String str, String str2) {
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
    public final void qF(aijs aijsVar, aijs aijsVar2, int i, int i2, boolean z, boolean z2) {
        boolean z3 = true;
        boolean z4 = this.d != aijs.FULLSCREEN && aijsVar == aijs.FULLSCREEN;
        if (this.d != aijs.FULLSCREEN || aijsVar == aijs.FULLSCREEN) {
            z3 = false;
        }
        if (z4 || z3) {
            ArrayList arrayList = new ArrayList();
            for (xeh xehVar : this.a.c()) {
                if (z4) {
                    xek xekVar = xehVar.b;
                    if (xekVar instanceof xct) {
                        if (TextUtils.equals(((xct) xekVar).a, this.b)) {
                            arrayList.add(xehVar);
                        }
                    }
                }
                if (z3) {
                    xek xekVar2 = xehVar.b;
                    if ((xekVar2 instanceof xcu) && TextUtils.equals(((xcu) xekVar2).a, this.b)) {
                        arrayList.add(xehVar);
                    }
                }
            }
            this.d = aijsVar;
            if (arrayList.isEmpty()) {
                return;
            }
            ((wvr) this.c.get()).q(arrayList);
            return;
        }
        this.d = aijsVar;
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
            String str = xduVar.a;
            throw new wuq(str.length() != 0 ? "Tried to register duplicate trigger for slot: ".concat(str) : new String("Tried to register duplicate trigger for slot: "));
        } else if ((xekVar instanceof xct) || (xekVar instanceof xcu)) {
            this.a.d(xekVar.c(), new xeh(i, xekVar, xduVar, xciVar));
        } else {
            String str2 = xduVar.a;
            String name = xekVar.b().name();
            StringBuilder sb = new StringBuilder(str2.length() + 105 + String.valueOf(name).length());
            sb.append("Incorrect TriggerType: Tried to register trigger for slot: ");
            sb.append(str2);
            sb.append(" of type ");
            sb.append(name);
            sb.append(" in PlayerGeometryEventTriggerAdapter");
            throw new wuq(sb.toString());
        }
    }

    @Override // defpackage.wvs
    public final void qO(xek xekVar) {
        this.a.b(xekVar.c());
    }
}
