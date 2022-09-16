package defpackage;

import android.graphics.Bitmap;
import com.google.android.apps.auto.sdk.vanagon.PhoneSysUiClient$ScreenshotProvider;
/* compiled from: PG */
/* renamed from: ashw  reason: default package */
/* loaded from: classes2.dex */
public final class ashw implements achf {
    final /* synthetic */ PhoneSysUiClient$ScreenshotProvider.OnCompleteListener a;

    public ashw(PhoneSysUiClient$ScreenshotProvider.OnCompleteListener onCompleteListener) {
        this.a = onCompleteListener;
    }

    @Override // defpackage.achf
    public final void a(@dzsi Bitmap bitmap) {
        this.a.onScreenshotComplete(bitmap);
    }
}
