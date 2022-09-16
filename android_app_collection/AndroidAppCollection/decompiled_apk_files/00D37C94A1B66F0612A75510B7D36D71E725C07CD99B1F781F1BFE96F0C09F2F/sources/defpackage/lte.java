package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: lte  reason: default package */
/* loaded from: classes3.dex */
public final class lte implements View.OnClickListener {
    final /* synthetic */ Object a;
    final /* synthetic */ ltg b;

    public lte(ltg ltgVar, Object obj) {
        this.b = ltgVar;
        this.a = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int checkedRadioButtonId = this.b.f.getCheckedRadioButtonId();
        if (checkedRadioButtonId != -1) {
            Object tag = this.b.f.findViewById(checkedRadioButtonId).getTag();
            if (tag instanceof avdp) {
                aafo aafoVar = this.b.b;
                apzg apzgVar = ((avdp) tag).e;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar.c(apzgVar, null);
            } else if (tag instanceof avdk) {
                aafo aafoVar2 = this.b.b;
                apzg apzgVar2 = ((avdk) tag).d;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
                aafoVar2.c(apzgVar2, null);
            }
            this.b.g.dismiss();
            Object obj = this.a;
            if (obj == null) {
                return;
            }
            this.b.c.d(aabm.b(obj));
        }
    }
}
