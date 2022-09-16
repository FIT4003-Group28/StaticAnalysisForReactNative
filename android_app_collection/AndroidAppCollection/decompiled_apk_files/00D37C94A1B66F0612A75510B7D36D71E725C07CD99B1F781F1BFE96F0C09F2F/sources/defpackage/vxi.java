package defpackage;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: vxi  reason: default package */
/* loaded from: classes4.dex */
final class vxi implements afzf {
    final /* synthetic */ vxj a;

    public vxi(vxj vxjVar) {
        this.a = vxjVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        if (this.a.mJ() == null) {
            return;
        }
        this.a.dismiss();
        this.a.al.e(cffVar);
        this.a.aj.b();
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        arms armsVar = (arms) obj;
        if (this.a.mJ() == null) {
            return;
        }
        Bundle bundle = this.a.m;
        boolean z = bundle != null && bundle.getBoolean("hide_toast");
        if ((armsVar.b & 8) != 0) {
            armr armrVar = armsVar.f;
            if (armrVar == null) {
                armrVar = armr.a;
            }
            arag aragVar = armrVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            String obj2 = ajgl.b(aragVar).toString();
            armr armrVar2 = armsVar.f;
            if (armrVar2 == null) {
                armrVar2 = armr.a;
            }
            int K = akpq.K(armrVar2.b);
            if (K == 0 || K != 3) {
                this.a.aI(false);
                vxj vxjVar = this.a;
                vyc vycVar = vxjVar.ag;
                if (vycVar != null) {
                    armr armrVar3 = armsVar.f;
                    if (armrVar3 == null) {
                        armrVar3 = armr.a;
                    }
                    int K2 = akpq.K(armrVar3.b);
                    if (K2 != 0 && K2 == 2) {
                        EditText editText = vycVar.f;
                        editText.setError(editText.getHint());
                        EditText editText2 = vycVar.e;
                        editText2.setError(editText2.getHint());
                    }
                    TextView textView = vycVar.d;
                    armr armrVar4 = armsVar.f;
                    if (armrVar4 == null) {
                        armrVar4 = armr.a;
                    }
                    arag aragVar2 = armrVar4.c;
                    if (aragVar2 == null) {
                        aragVar2 = arag.a;
                    }
                    textView.setText(ajgl.b(aragVar2));
                    vycVar.d.setVisibility(0);
                    return;
                }
                vxjVar.al.d(obj2);
                if (!this.a.aJ()) {
                    return;
                }
                vxj vxjVar2 = this.a;
                apri aE = vxjVar2.aE();
                Boolean bool = false;
                aopa aopaVar = aE.a;
                boolean booleanValue = bool.booleanValue();
                aopaVar.copyOnWrite();
                aprl aprlVar = (aprl) aopaVar.instance;
                aprl aprlVar2 = aprl.a;
                aprlVar.c |= 2;
                aprlVar.e = booleanValue;
                aahb c = ((aagu) vxjVar2.aq.c()).c();
                c.j(aE);
                c.b().Q();
                return;
            }
            this.a.al.d(obj2);
            z = true;
        }
        aoxo aoxoVar = armsVar.e;
        if (aoxoVar == null) {
            aoxoVar = aoxo.b;
        }
        boolean z2 = aoxoVar.c;
        if (z2 && !z) {
            zag.q(this.a.mJ(), R.string.channel_created, 1);
        }
        this.a.dismiss();
        if (z2) {
            this.a.aj.d();
        } else {
            this.a.aj.b();
        }
        if ((armsVar.b & 2) == 0) {
            return;
        }
        aafo aafoVar = this.a.ak;
        apzg apzgVar = armsVar.d;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.a(apzgVar);
    }
}
