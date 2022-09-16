package defpackage;

import android.widget.CompoundButton;
/* compiled from: PG */
/* renamed from: akoq  reason: default package */
/* loaded from: classes.dex */
final class akoq implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ akot a;

    public akoq(akot akotVar) {
        this.a = akotVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        apnn apnnVar;
        apzg apzgVar;
        akll akllVar = this.a.b;
        avni avniVar = akllVar.b;
        apnm apnmVar = avniVar.d;
        if (apnmVar == null) {
            apnmVar = apnm.a;
        }
        if ((apnmVar.b & 2) != 0) {
            apnm apnmVar2 = avniVar.d;
            if (apnmVar2 == null) {
                apnmVar2 = apnm.a;
            }
            apnnVar = apnmVar2.c;
            if (apnnVar == null) {
                apnnVar = apnn.a;
            }
        } else {
            apnnVar = null;
        }
        if (apnnVar == null) {
            return;
        }
        if (z) {
            apzgVar = apnnVar.e;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = apnnVar.f;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        }
        akllVar.a.c(apzgVar, null);
    }
}
