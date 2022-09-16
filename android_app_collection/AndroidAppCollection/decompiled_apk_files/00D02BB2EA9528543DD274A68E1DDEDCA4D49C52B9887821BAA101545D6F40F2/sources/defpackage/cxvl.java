package defpackage;

import android.view.inputmethod.InputMethodManager;
import com.google.android.libraries.social.sendkit.api.SendKitPickerResult;
/* compiled from: PG */
/* renamed from: cxvl  reason: default package */
/* loaded from: classes5.dex */
final class cxvl implements cxov {
    final /* synthetic */ cxov a;
    final /* synthetic */ cxvr b;

    public cxvl(cxvr cxvrVar, cxov cxovVar) {
        this.b = cxvrVar;
        this.a = cxovVar;
    }

    @Override // defpackage.cxov
    public final void q(SendKitPickerResult sendKitPickerResult) {
        ((InputMethodManager) this.b.b.getSystemService("input_method")).hideSoftInputFromWindow(this.b.a.getWindowToken(), 0);
        this.a.q(sendKitPickerResult);
    }

    @Override // defpackage.cxov
    public final void r(czha czhaVar) {
        this.a.r(czhaVar);
    }

    @Override // defpackage.cxov
    public final void s(czha czhaVar, boolean z) {
        this.a.s(czhaVar, z);
    }
}
