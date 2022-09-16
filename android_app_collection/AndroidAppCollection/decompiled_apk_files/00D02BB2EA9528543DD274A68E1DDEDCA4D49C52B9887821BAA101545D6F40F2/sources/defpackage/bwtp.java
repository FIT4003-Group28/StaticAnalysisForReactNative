package defpackage;

import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: bwtp  reason: default package */
/* loaded from: classes4.dex */
final class bwtp implements egq {
    final /* synthetic */ bwtr a;

    public bwtp(bwtr bwtrVar) {
        this.a = bwtrVar;
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        bwtr bwtrVar = this.a;
        if (bwtrVar.ay != null) {
            FrameLayout frameLayout = bwtrVar.az;
            dbsk.s(frameLayout);
            if (frameLayout.indexOfChild(this.a.ay) >= 0) {
                return;
            }
            FrameLayout frameLayout2 = this.a.az;
            dbsk.s(frameLayout2);
            bxbs bxbsVar = this.a.ay;
            dbsk.s(bxbsVar);
            frameLayout2.addView(bxbsVar);
        }
    }
}
