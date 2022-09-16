package defpackage;

import android.util.Log;
import org.chromium.net.UrlResponseInfo;
/* compiled from: PG */
/* renamed from: bafy  reason: default package */
/* loaded from: classes2.dex */
final class bafy implements Runnable {
    final /* synthetic */ UrlResponseInfo a;
    final /* synthetic */ baga b;
    private final /* synthetic */ int c;

    public bafy(baga bagaVar, UrlResponseInfo urlResponseInfo) {
        this.b = bagaVar;
        this.a = urlResponseInfo;
    }

    public bafy(baga bagaVar, UrlResponseInfo urlResponseInfo, int i) {
        this.c = i;
        this.b = bagaVar;
        this.a = urlResponseInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            try {
                baga bagaVar = this.b;
                bagaVar.a.onCanceled(bagaVar.d, this.a);
                return;
            } catch (Exception e) {
                Log.e(bagd.a, "Exception in onCanceled method", e);
                return;
            }
        }
        try {
            baga bagaVar2 = this.b;
            bagaVar2.a.onSucceeded(bagaVar2.d, this.a);
        } catch (Exception e2) {
            Log.e(bagd.a, "Exception in onSucceeded method", e2);
        }
    }
}
