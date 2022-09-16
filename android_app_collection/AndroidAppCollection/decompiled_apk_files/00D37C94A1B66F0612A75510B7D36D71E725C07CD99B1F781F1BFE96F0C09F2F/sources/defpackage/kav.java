package defpackage;

import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: kav  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kav implements ayqb {
    public final /* synthetic */ kay a;
    private final /* synthetic */ int b;

    public /* synthetic */ kav(kay kayVar, int i) {
        this.b = i;
        this.a = kayVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            kay kayVar = this.a;
            Integer num = (Integer) obj;
            asxj asxjVar = kayVar.k.b().e;
            if (asxjVar == null) {
                asxjVar = asxj.a;
            }
            zgd.t(asxjVar.bd ? kayVar.b : kayVar.a, zgd.e(num.intValue()), ViewGroup.MarginLayoutParams.class);
            kayVar.b.requestLayout();
        } else if (i != 1) {
            kay kayVar2 = this.a;
            View view = kayVar2.a;
            lj.Y(view, lj.i(view), kayVar2.a.getPaddingTop(), ((Integer) obj).intValue(), kayVar2.a.getPaddingBottom());
        } else {
            kay kayVar3 = this.a;
            if (!((Boolean) obj).booleanValue()) {
                return;
            }
            kayVar3.d.b();
        }
    }
}
