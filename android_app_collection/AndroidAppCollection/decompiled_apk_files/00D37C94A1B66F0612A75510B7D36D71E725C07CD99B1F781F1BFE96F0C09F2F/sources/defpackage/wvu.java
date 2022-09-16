package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: wvu  reason: default package */
/* loaded from: classes4.dex */
public final class wvu implements wvs, xgo, wua, wub {
    final xei a = new xei();
    private final azqb b;
    private String c;

    public wvu(azqb azqbVar) {
        this.b = azqbVar;
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void c(Bundle bundle) {
    }

    @Override // defpackage.xgo
    public final void d() {
        if (this.c == null) {
            wwf.a(null, "Ping migration VisitAdvertiserLinkClickedTriggerAdapter has no active media layout for click event");
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            xeh xehVar = (xeh) it.next();
            if (TextUtils.equals(((xen) xehVar.b).a, this.c)) {
                arrayList.add(xehVar);
                break;
            }
        }
        if (!arrayList.isEmpty()) {
            ((wvr) this.b.get()).q(arrayList);
        } else {
            wwf.a(null, "Ping migration VisitAdvertiserLinkClickedTriggerAdapter has null triggered bundle for click event");
        }
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void g(boolean z) {
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void i(xgb xgbVar) {
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.wua
    public final void o(xdu xduVar, xci xciVar) {
        if (xduVar.c() == apcd.SLOT_TYPE_PLAYER_BYTES && xciVar.b == apcb.LAYOUT_TYPE_MEDIA) {
            this.c = xciVar.a;
        }
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void p() {
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void q(int i, int i2) {
    }

    @Override // defpackage.wvs
    public final void qN(int i, xek xekVar, xdu xduVar, xci xciVar) {
        if (this.a.e(xekVar.c())) {
            String valueOf = String.valueOf(xekVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append("Tried to register duplicate trigger: ");
            sb.append(valueOf);
            throw new wuq(sb.toString());
        } else if (!(xekVar instanceof xen)) {
            String name = xekVar.b().name();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 93);
            sb2.append("Incorrect TriggerType: Tried to register trigger ");
            sb2.append(name);
            sb2.append(" in VisitAdvertiserLinkClickedTriggerAdapter");
            throw new wuq(sb2.toString());
        } else {
            this.a.d(xekVar.c(), new xeh(i, xekVar, xduVar, xciVar));
        }
    }

    @Override // defpackage.wvs
    public final void qO(xek xekVar) {
        this.a.b(xekVar.c());
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void r(DisplayMetrics displayMetrics, Rect rect, Rect rect2) {
    }

    @Override // defpackage.wub
    public final void s(xdu xduVar, xci xciVar, int i) {
        if (TextUtils.equals(xciVar.a, this.c)) {
            this.c = null;
        }
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void t(boolean z) {
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void u(boolean z) {
    }
}
