package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.account.verification.ui.PhoneVerificationActivity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wih  reason: default package */
/* loaded from: classes4.dex */
public final class wih implements abv {
    final /* synthetic */ wii a;

    public wih(wii wiiVar) {
        this.a = wiiVar;
    }

    @Override // defpackage.abv
    public final void a(Context context) {
        wii wiiVar = this.a;
        if (!wiiVar.a) {
            wiiVar.a = true;
            Object lI = wiiVar.lI();
            PhoneVerificationActivity phoneVerificationActivity = (PhoneVerificationActivity) wiiVar;
            dwq dwqVar = (dwq) lI;
            phoneVerificationActivity.b = (aafo) dwqVar.H.get();
            phoneVerificationActivity.c = dwqVar.kN;
        }
    }
}
