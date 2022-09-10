package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bcpg  reason: default package */
/* loaded from: classes3.dex */
final class bcpg implements axrw {
    final /* synthetic */ deig a;
    final /* synthetic */ ges b;
    final /* synthetic */ bwrs c;
    final /* synthetic */ bbts d;
    final /* synthetic */ bcpj e;

    public bcpg(bcpj bcpjVar, deig deigVar, ges gesVar, bwrs bwrsVar, bbts bbtsVar) {
        this.e = bcpjVar;
        this.a = deigVar;
        this.b = gesVar;
        this.c = bwrsVar;
        this.d = bbtsVar;
    }

    @Override // defpackage.axrw
    public final void a(int i) {
        dehn<Boolean> a;
        deig deigVar = this.a;
        bcpj bcpjVar = this.e;
        ges gesVar = this.b;
        bwrs<bcan> bwrsVar = this.c;
        bbts bbtsVar = this.d;
        if (i == 0) {
            a = bcpjVar.d(gesVar, bwrsVar, bbtsVar);
        } else {
            gga ggaVar = gesVar.aE;
            if (ggaVar == null) {
                a = deha.a(false);
            } else {
                if (!ggaVar.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                    bcpj.c(ggaVar, bcpjVar.a, R.string.CAMERA_PERMISSION_DIALOG_MESSAGE);
                }
                a = deha.a(false);
            }
        }
        deigVar.p(a);
    }
}
