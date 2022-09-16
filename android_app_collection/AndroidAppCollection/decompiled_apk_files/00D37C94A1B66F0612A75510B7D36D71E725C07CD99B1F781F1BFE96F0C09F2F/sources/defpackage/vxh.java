package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: vxh  reason: default package */
/* loaded from: classes4.dex */
final class vxh implements afzf {
    final /* synthetic */ Bundle a;
    final /* synthetic */ vxj b;

    public vxh(vxj vxjVar, Bundle bundle) {
        this.b = vxjVar;
        this.a = bundle;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        this.b.aj.b();
        this.b.al.e(cffVar);
        this.b.ku();
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        apzg apzgVar;
        aats aatsVar = (aats) obj;
        aats aatsVar2 = new aats(aatsVar.a);
        if (this.b.as != null && aatsVar.a() != null) {
            ((acsx) this.b.as).D(new acte(aatsVar.a()));
        }
        vxj vxjVar = this.b;
        apro aproVar = aatsVar2.a.d;
        if (aproVar == null) {
            aproVar = apro.a;
        }
        vxjVar.af = aproVar;
        vxj vxjVar2 = this.b;
        armu armuVar = aatsVar2.a;
        if ((armuVar.b & 4) != 0) {
            apzgVar = armuVar.e;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        vxjVar2.at = apzgVar;
        vxj vxjVar3 = this.b;
        vxjVar3.aG(vxjVar3.af, this.a);
    }
}
