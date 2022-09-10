package defpackage;

import com.google.android.libraries.social.sendkit.api.SendKitPickerResult;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajxv  reason: default package */
/* loaded from: classes2.dex */
public final class ajxv implements cxov {
    final /* synthetic */ ajya a;

    public ajxv(ajya ajyaVar) {
        this.a = ajyaVar;
    }

    @Override // defpackage.cxov
    public final void q(SendKitPickerResult sendKitPickerResult) {
    }

    @Override // defpackage.cxov
    public final void r(czha czhaVar) {
        ajxw ajxwVar = this.a.c;
        if (ajxwVar != null) {
            ajxwVar.a(true);
            this.a.c.b(czhaVar);
        }
    }

    @Override // defpackage.cxov
    public final void s(czha czhaVar, boolean z) {
        ajxw ajxwVar = this.a.c;
        if (ajxwVar != null) {
            ajxwVar.a(z);
            this.a.c.c(czhaVar);
        }
    }
}
