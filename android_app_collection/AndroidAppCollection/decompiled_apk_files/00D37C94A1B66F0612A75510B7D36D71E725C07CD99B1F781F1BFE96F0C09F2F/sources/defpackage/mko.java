package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: mko  reason: default package */
/* loaded from: classes3.dex */
public final class mko implements ajru, fzq, geq {
    private final aafo a;
    private final azqb b;
    private final azqb c;
    private final FrameLayout d;
    private Object e;
    private ggz f;
    private ajru g;
    private mfl h;
    private mkl i;

    public mko(Context context, azqb azqbVar, azqb azqbVar2, aafo aafoVar) {
        this.d = new FrameLayout(context);
        this.b = azqbVar;
        this.c = azqbVar2;
        this.a = aafoVar;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.d;
    }

    @Override // defpackage.fzq
    public final View g() {
        ajru ajruVar = this.g;
        if (ajruVar == null) {
            return null;
        }
        return ((fzq) ajruVar).g();
    }

    @Override // defpackage.fzq
    public final void i(boolean z) {
        ajru ajruVar = this.g;
        if (ajruVar != null) {
            ((fzq) ajruVar).i(z);
        }
    }

    @Override // defpackage.fzq
    public final /* synthetic */ mct j() {
        return null;
    }

    @Override // defpackage.geq
    public final aynr oI(int i) {
        ajru ajruVar = this.g;
        if (ajruVar instanceof geq) {
            return ((geq) ajruVar).oI(i);
        }
        return aynr.f();
    }

    @Override // defpackage.geq
    public final boolean oJ(geq geqVar) {
        return (geqVar instanceof mko) && ((mko) geqVar).e == this.e;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        ajru ajruVar;
        itt ittVar = (itt) obj;
        this.e = ittVar.a;
        ggz bm = eog.bm(ittVar);
        this.f = bm;
        if (bm == null || !ggs.c(bm)) {
            if (this.h == null) {
                this.h = (mfl) this.b.get();
            }
            ajruVar = this.h;
        } else {
            if (this.i == null) {
                this.i = (mkl) this.c.get();
            }
            ajruVar = this.i;
        }
        if (ajruVar != this.g) {
            this.d.removeAllViews();
            this.d.addView(ajruVar.a());
            this.g = ajruVar;
        }
        this.g.oK(ajrsVar, ittVar);
        aafx.c(this.a, ittVar.a.i, ittVar);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        ajru ajruVar = this.g;
        if (ajruVar != null) {
            ajruVar.qZ(ajsaVar);
            this.g = null;
        }
        this.f = null;
        this.e = null;
    }
}
