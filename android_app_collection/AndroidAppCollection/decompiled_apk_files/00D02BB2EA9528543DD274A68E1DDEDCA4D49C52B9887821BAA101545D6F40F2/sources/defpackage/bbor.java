package defpackage;

import android.app.Activity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bbor  reason: default package */
/* loaded from: classes3.dex */
public final class bbor implements bbdu {
    final /* synthetic */ dxio a;
    final /* synthetic */ bwrs b;

    public bbor(dxio dxioVar, bwrs bwrsVar) {
        this.a = dxioVar;
        this.b = bwrsVar;
    }

    @Override // defpackage.bbdu
    public final void a(Activity activity, int i) {
        if (i == 1) {
            ((bbdv) this.a.a()).J(this.b);
            return;
        }
        bwrs bwrsVar = this.b;
        ilo iloVar = (ilo) bwrsVar.c();
        dbsk.s(iloVar);
        ily g = iloVar.g();
        g.e = true;
        bwrsVar.d(g.d());
    }
}
