package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
/* compiled from: PG */
/* renamed from: sle  reason: default package */
/* loaded from: classes4.dex */
public final class sle implements ankb {
    private final /* synthetic */ int a;

    public sle() {
    }

    public sle(int i) {
        this.a = i;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        int i = this.a;
        if (i == 0) {
            ((amzw) ((amzw) ((amzw) slf.a.f()).h(th)).i("com/google/android/libraries/ar/faceviewer/utils/FutureHelper$1", "onFailure", (char) 31, "FutureHelper.java")).q("Failed to close future closeable.");
        } else if (i == 1) {
            ((amzw) ((amzw) ((amzw) shs.a.f()).h(th)).i("com/google/android/libraries/ar/faceviewer/FaceViewerManager$2", "onFailure", (char) 239, "FaceViewerManager.java")).q("Failed to create cronet engine.");
        } else if (i == 2) {
            ((anav) ((anav) ((anav) tol.a.f()).h(th)).i("com/google/android/libraries/logging/ve/handlers/result/flogger/FloggerResultDaggerModule", "lambda$provideEventResultHandler$1", 26, "FloggerResultDaggerModule.java")).o();
        } else if (i == 3) {
            Log.w("OneGoogle", "Failed to grant account access to app", th);
        } else if (th instanceof urb) {
        } else {
            Log.w("OneGoogle", "Failed to load owner avatar", th);
        }
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        int i = this.a;
        if (i == 0) {
            try {
                ((AutoCloseable) obj).close();
            } catch (Exception e) {
                a(e);
            }
        } else if (i == 1) {
            Void r3 = (Void) obj;
        } else if (i == 2) {
            Void r32 = (Void) obj;
        } else if (i == 3) {
            if (((Boolean) obj).booleanValue()) {
                return;
            }
            Log.e("OneGoogle", "Failed to grant account access to app");
        } else {
            Bitmap bitmap = (Bitmap) obj;
        }
    }
}
