package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bmyz  reason: default package */
/* loaded from: classes3.dex */
final class bmyz extends bmzv {
    final /* synthetic */ boolean a;
    final /* synthetic */ bmza b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bmyz(bmza bmzaVar, Activity activity, cqkj cqkjVar, dxio dxioVar, cjxd cjxdVar, awnm awnmVar, axwy axwyVar, dxio dxioVar2, dxio dxioVar3, boolean z) {
        super(activity, cqkjVar, dxioVar, cjxdVar, awnmVar, axwyVar, dxioVar2, dxioVar3);
        this.b = bmzaVar;
        this.a = z;
    }

    @Override // defpackage.bmzv
    public final void a() {
        bmza bmzaVar = this.b;
        gga ggaVar = bmzaVar.a;
        bwqv bwqvVar = bmzaVar.c;
        bwrs<ilo> bwrsVar = bmzaVar.s;
        boolean z = this.a;
        if (bwrsVar != null) {
            ggaVar.C(bhul.g(bwqvVar, bwrsVar, bhul.a, z, null), gfu.ACTIVITY_FRAGMENT, new gfs[0]);
        }
    }
}
