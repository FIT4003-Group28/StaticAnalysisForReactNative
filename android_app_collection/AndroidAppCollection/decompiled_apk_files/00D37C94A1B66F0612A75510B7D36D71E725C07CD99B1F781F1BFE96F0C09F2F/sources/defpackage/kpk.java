package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kpk  reason: default package */
/* loaded from: classes3.dex */
public final class kpk extends jo {
    final /* synthetic */ kpm b;

    public kpk(kpm kpmVar) {
        this.b = kpmVar;
    }

    @Override // defpackage.jo
    public final void d(View view, mh mhVar) {
        super.d(view, mhVar);
        mhVar.p(true);
        aqrc aqrcVar = (aqrc) view.getTag();
        mhVar.q(this.b.b.getSelectedItem().equals(view.getTag()));
        aovr aovrVar = aqrcVar.i;
        if (aovrVar == null) {
            aovrVar = aovr.a;
        }
        if ((aovrVar.b & 2) != 0) {
            aovr aovrVar2 = aqrcVar.i;
            if (aovrVar2 == null) {
                aovrVar2 = aovr.a;
            }
            mhVar.v(aovrVar2.c);
        }
    }
}
