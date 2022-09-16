package defpackage;

import com.google.android.apps.auto.sdk.vanagon.PhoneSysUiClient$ScreenshotProvider;
/* compiled from: PG */
/* renamed from: ashx  reason: default package */
/* loaded from: classes2.dex */
public final class ashx implements PhoneSysUiClient$ScreenshotProvider {
    public final /* synthetic */ ashy a;

    public ashx(ashy ashyVar) {
        this.a = ashyVar;
    }

    @Override // com.google.android.apps.auto.sdk.vanagon.PhoneSysUiClient$ScreenshotProvider
    public final void getScreenshot(PhoneSysUiClient$ScreenshotProvider.OnCompleteListener onCompleteListener) {
        this.a.c.a().B(new ashw(onCompleteListener));
    }
}
