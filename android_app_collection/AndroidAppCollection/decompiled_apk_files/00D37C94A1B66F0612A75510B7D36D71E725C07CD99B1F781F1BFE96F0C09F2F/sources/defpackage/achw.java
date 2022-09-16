package defpackage;

import android.text.TextUtils;
import android.widget.TextView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: achw  reason: default package */
/* loaded from: classes.dex */
public final class achw implements afzf {
    final /* synthetic */ acid a;

    public achw(acid acidVar) {
        this.a = acidVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        arsu arsuVar = (arsu) obj;
        if (achk.b(this.a)) {
            int i = 0;
            String str = null;
            if (arsuVar != null && arsuVar.c.size() > 0 && ((arsq) arsuVar.c.get(0)).e != 0) {
                arsz arszVar = ((arsq) arsuVar.c.get(0)).g;
                if (arszVar == null) {
                    arszVar = arsz.a;
                }
                if (arszVar.e > 0) {
                    int i2 = arszVar.b;
                    if ((i2 & 1) != 0) {
                        arag aragVar = arszVar.c;
                        if (aragVar == null) {
                            aragVar = arag.a;
                        }
                        str = ajgl.b(aragVar).toString();
                    } else if ((i2 & 2) != 0) {
                        arag aragVar2 = arszVar.d;
                        if (aragVar2 == null) {
                            aragVar2 = arag.a;
                        }
                        str = ajgl.b(aragVar2).toString();
                    }
                }
            }
            acid acidVar = this.a;
            acidVar.ax = str;
            acidVar.ar.setText(str);
            TextView textView = this.a.ar;
            if (true == TextUtils.isEmpty(str)) {
                i = 4;
            }
            textView.setVisibility(i);
        }
    }
}
