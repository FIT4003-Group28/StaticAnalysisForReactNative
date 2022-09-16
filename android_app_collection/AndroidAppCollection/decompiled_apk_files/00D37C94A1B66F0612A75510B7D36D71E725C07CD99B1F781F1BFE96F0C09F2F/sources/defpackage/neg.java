package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: neg  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class neg implements View.OnClickListener {
    public final /* synthetic */ nek a;
    private final /* synthetic */ int b;

    public /* synthetic */ neg(nek nekVar, int i) {
        this.b = i;
        this.a = nekVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        actj actjVar;
        if (this.b == 0) {
            nek nekVar = this.a;
            if (nekVar.e) {
                return;
            }
            auwu auwuVar = (auwu) nekVar.k;
            auwv auwvVar = auwuVar.f;
            if (auwvVar == null) {
                auwvVar = auwv.a;
            }
            if ((auwvVar.b & 8) == 0) {
                return;
            }
            auwv auwvVar2 = auwuVar.f;
            if (auwvVar2 == null) {
                auwvVar2 = auwv.a;
            }
            apzg apzgVar = auwvVar2.f;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            nekVar.g.c(apzgVar, null);
            return;
        }
        nek nekVar2 = this.a;
        acti actiVar = nekVar2.j.a;
        if (nekVar2.e) {
            actjVar = actj.SLIM_CHANNEL_METADATA_RENDERER_COLLAPSE_ICON;
        } else {
            actjVar = actj.SLIM_CHANNEL_METADATA_RENDERER_EXPAND_ELEMENTS;
        }
        actiVar.H(3, new acte(actjVar), null);
        nekVar2.f(!nekVar2.e);
    }
}
