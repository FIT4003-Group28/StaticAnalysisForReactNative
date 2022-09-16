package defpackage;

import android.app.Activity;
import android.view.ContextThemeWrapper;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hzo  reason: default package */
/* loaded from: classes3.dex */
public final class hzo implements afzf {
    private final Activity a;
    private final aafo b;
    private final yzj c;
    private final azqb d;
    private final Object e = this;

    public hzo(Activity activity, aafo aafoVar, yzj yzjVar, azqb azqbVar) {
        this.a = activity;
        this.b = aafoVar;
        this.c = yzjVar;
        this.d = azqbVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        this.c.e(cffVar);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        asof asofVar;
        boolean z;
        aqxq aqxqVar;
        arrz arrzVar = (arrz) obj;
        if (arrzVar == null) {
            return;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.a, 2132083352);
        boolean z2 = !this.a.isFinishing();
        if (z2) {
            z2 = !this.a.isDestroyed();
        }
        arsc arscVar = arrzVar.f;
        if (arscVar == null) {
            arscVar = arsc.a;
        }
        if (arscVar.b == 171313147) {
            arsc arscVar2 = arrzVar.f;
            if (arscVar2 == null) {
                arscVar2 = arsc.a;
            }
            if (arscVar2.b == 171313147) {
                asofVar = (asof) arscVar2.c;
            } else {
                asofVar = asof.a;
            }
        } else {
            asofVar = null;
        }
        boolean z3 = false;
        if (!z2 || asofVar == null) {
            z = true;
        } else {
            ((ajun) this.d.get()).a(asofVar, amon.a, this.e);
            z = false;
        }
        arsc arscVar3 = arrzVar.f;
        if (arscVar3 == null) {
            arscVar3 = arsc.a;
        }
        if (arscVar3.b == 85374086) {
            arsc arscVar4 = arrzVar.f;
            if (arscVar4 == null) {
                arscVar4 = arsc.a;
            }
            if (arscVar4.b == 85374086) {
                aqxqVar = (aqxq) arscVar4.c;
            } else {
                aqxqVar = aqxq.a;
            }
        } else {
            aqxqVar = null;
        }
        if (!z2 || aqxqVar == null) {
            z3 = z;
        } else {
            ajhb.c(contextThemeWrapper, aqxqVar, this.b, this.e);
        }
        if (z2 && arrzVar.g.size() > 0) {
            this.b.d(arrzVar.g, null);
        } else if (!z3) {
        } else {
            zag.q(this.a.getApplicationContext(), R.string.video_is_flagged, 1);
        }
    }
}
