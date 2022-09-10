package defpackage;

import com.google.android.libraries.social.sendkit.api.SendKitPickerResult;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxsu  reason: default package */
/* loaded from: classes5.dex */
public final class cxsu implements cxth {
    final /* synthetic */ cxsx a;

    public cxsu(cxsx cxsxVar) {
        this.a = cxsxVar;
    }

    @Override // defpackage.cxth
    public final void a() {
        cxsx cxsxVar = this.a;
        ajxu ajxuVar = cxsxVar.f;
        if (ajxuVar != null) {
            SendKitPickerResult c = cxsxVar.c();
            dbsz<SendKitPickerResult> dbszVar = ajxuVar.a.d;
            if (dbszVar == null) {
                return;
            }
            dbszVar.NU(c);
        }
    }
}
