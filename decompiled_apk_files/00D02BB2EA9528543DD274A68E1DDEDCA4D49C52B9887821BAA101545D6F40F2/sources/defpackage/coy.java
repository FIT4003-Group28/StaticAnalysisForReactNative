package defpackage;

import android.graphics.Bitmap;
import com.google.android.apps.auto.sdk.vanagon.PhoneSysUiClient$ScreenshotProvider;
import java.lang.reflect.InvocationTargetException;
/* compiled from: PG */
/* renamed from: coy  reason: default package */
/* loaded from: classes5.dex */
final class coy implements PhoneSysUiClient$ScreenshotProvider.OnCompleteListener {
    final /* synthetic */ Object[] a;

    public coy(Object[] objArr) {
        this.a = objArr;
    }

    @Override // com.google.android.apps.auto.sdk.vanagon.PhoneSysUiClient$ScreenshotProvider.OnCompleteListener
    public final void onScreenshotComplete(Bitmap bitmap) {
        try {
            this.a[0].getClass().getMethod("onScreenshotComplete", Bitmap.class).invoke(this.a[0], bitmap);
        } catch (IllegalAccessException e) {
            e = e;
            cpb.g(e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            cpb.g(e);
        } catch (NoSuchMethodException unused) {
        } catch (InvocationTargetException e3) {
            e = e3;
            cpb.g(e);
        }
    }
}
