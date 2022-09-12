package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: cpmj  reason: default package */
/* loaded from: classes5.dex */
final class cpmj implements dbrn<dgzy, Boolean> {
    final /* synthetic */ cpnv a;
    final /* synthetic */ cpmk b;

    public cpmj(cpmk cpmkVar, cpnv cpnvVar) {
        this.b = cpmkVar;
        this.a = cpnvVar;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ Boolean a(dgzy dgzyVar) {
        dgzy dgzyVar2 = dgzyVar;
        if (this.b.c() != cpnd.USER_INPUT_NOT_VERIFIED) {
            this.a.k();
            return true;
        } else if (dgzyVar2 == dgzy.MSG_VALID || dgzyVar2 == dgzy.MSG_UNSPECIFIED) {
            this.b.c.setAddressInputState(cpnd.USER_INPUT_VALID);
            return true;
        } else {
            new Handler(Looper.getMainLooper()).post(new cpni(this.b.c));
            return false;
        }
    }
}
