package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: akmc  reason: default package */
/* loaded from: classes.dex */
final class akmc implements afzf {
    final /* synthetic */ akmd a;
    final /* synthetic */ akme b;
    final /* synthetic */ akmf c;

    public akmc(akmf akmfVar, akmd akmdVar, akme akmeVar) {
        this.c = akmfVar;
        this.a = akmdVar;
        this.b = akmeVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        this.c.a.e(cffVar);
        akme akmeVar = this.b;
        if (akmeVar != null) {
            akmeVar.c();
        }
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        aqfw aqfwVar;
        aqfy aqfyVar;
        aqfz aqfzVar;
        aron aronVar = (aron) obj;
        if ((aronVar.b & 2) != 0) {
            aqfx aqfxVar = aronVar.d;
            if (aqfxVar == null) {
                aqfxVar = aqfx.a;
            }
            aqfwVar = aqfxVar.d;
            if (aqfwVar == null) {
                aqfwVar = aqfw.a;
            }
        } else {
            aqfwVar = null;
        }
        if ((aronVar.b & 2) != 0) {
            aqfx aqfxVar2 = aronVar.d;
            if (aqfxVar2 == null) {
                aqfxVar2 = aqfx.a;
            }
            aqfyVar = aqfxVar2.c;
            if (aqfyVar == null) {
                aqfyVar = aqfy.a;
            }
        } else {
            aqfyVar = null;
        }
        aqfx aqfxVar3 = aronVar.d;
        if (aqfxVar3 == null) {
            aqfxVar3 = aqfx.a;
        }
        if ((aqfxVar3.b & 4) != 0) {
            aqfx aqfxVar4 = aronVar.d;
            if (aqfxVar4 == null) {
                aqfxVar4 = aqfx.a;
            }
            aqfzVar = aqfxVar4.e;
            if (aqfzVar == null) {
                aqfzVar = aqfz.a;
            }
        } else {
            aqfzVar = null;
        }
        aknv aknvVar = new aknv(null, aqfwVar, aqfyVar, aqfzVar);
        String b = aknvVar.b();
        if (!TextUtils.isEmpty(b)) {
            this.c.c.c(akpq.a(b), aknvVar);
        }
        if (aronVar.e.size() != 0) {
            this.c.b.e(aronVar.e, this.a);
        }
        akme akmeVar = this.b;
        if (akmeVar != null) {
            akmeVar.d();
        }
    }
}
