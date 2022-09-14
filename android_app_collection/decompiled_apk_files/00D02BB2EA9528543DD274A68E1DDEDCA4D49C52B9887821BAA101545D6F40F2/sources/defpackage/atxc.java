package defpackage;

import com.google.android.libraries.social.sendkit.api.SendKitPickerResult;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: atxc  reason: default package */
/* loaded from: classes2.dex */
public final class atxc implements atsn {
    final /* synthetic */ atxm a;

    public atxc(atxm atxmVar) {
        this.a = atxmVar;
    }

    @Override // defpackage.atsn
    public final void a(boolean z) {
        atxm atxmVar = this.a;
        cxsx cxsxVar = atxmVar.F;
        if (cxsxVar != null) {
            atxmVar.G = cxsxVar.c();
        }
        atxm atxmVar2 = this.a;
        SendKitPickerResult sendKitPickerResult = atxmVar2.G;
        if (sendKitPickerResult == null) {
            atxmVar2.p();
            return;
        }
        sendKitPickerResult.c();
        atxm atxmVar3 = this.a;
        ahvq ahvqVar = atxmVar3.c;
        SendKitPickerResult sendKitPickerResult2 = atxmVar3.G;
        dbsk.s(sendKitPickerResult2);
        ahvqVar.e(sendKitPickerResult2, true);
    }
}
