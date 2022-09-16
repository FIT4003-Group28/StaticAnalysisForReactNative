package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: ajuf  reason: default package */
/* loaded from: classes.dex */
public final class ajuf implements afzf {
    public ampq a = amon.a;
    public Object b = this;
    private final Context c;
    private final aafo d;
    private final yzj e;
    private final azqb f;
    private final ajgz g;

    public ajuf(Context context, aafo aafoVar, yzj yzjVar, azqb azqbVar, ajgz ajgzVar) {
        this.c = context;
        this.d = aafoVar;
        this.e = yzjVar;
        this.f = azqbVar;
        this.g = ajgzVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        this.e.e(cffVar);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final void lG(Object obj) {
        asof asofVar;
        aqxq aqxqVar;
        if (!(obj instanceof arrz)) {
            return;
        }
        arrz arrzVar = (arrz) obj;
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
        if (asofVar != null) {
            ((ajun) this.f.get()).a(asofVar, this.a, this.b);
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
        if (aqxqVar != null) {
            ajhb.g(this.c, aqxqVar, this.d, this.g, this.b);
        }
        if (arrzVar.g.size() <= 0) {
            return;
        }
        this.d.d(arrzVar.g, null);
    }
}
