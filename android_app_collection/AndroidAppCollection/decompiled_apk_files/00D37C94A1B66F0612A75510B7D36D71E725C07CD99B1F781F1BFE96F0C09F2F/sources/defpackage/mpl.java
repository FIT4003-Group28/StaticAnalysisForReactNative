package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mpl  reason: default package */
/* loaded from: classes3.dex */
public final class mpl implements View.OnClickListener {
    final /* synthetic */ mpm a;

    public mpl(mpm mpmVar) {
        this.a = mpmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apzg apzgVar;
        mpm mpmVar = this.a;
        auvo auvoVar = mpmVar.n;
        if (auvoVar != null) {
            apuq apuqVar = auvoVar.f;
            if (apuqVar == null) {
                apuqVar = apuq.a;
            }
            apur apurVar = apuqVar.c;
            if (apurVar == null) {
                apurVar = apur.a;
            }
            if ((apurVar.b & 2) != 0) {
                apuq apuqVar2 = mpmVar.n.f;
                if (apuqVar2 == null) {
                    apuqVar2 = apuq.a;
                }
                apur apurVar2 = apuqVar2.c;
                if (apurVar2 == null) {
                    apurVar2 = apur.a;
                }
                apzgVar = apurVar2.d;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
            } else {
                apzgVar = null;
            }
            if (apzgVar != null) {
                this.a.b.c(apzgVar, null);
                return;
            }
            mpm mpmVar2 = this.a;
            auvo auvoVar2 = mpmVar2.n;
            if ((auvoVar2.b & 8) == 0) {
                return;
            }
            aafo aafoVar = mpmVar2.b;
            apzg apzgVar2 = auvoVar2.g;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            aafoVar.c(apzgVar2, null);
        }
    }
}
