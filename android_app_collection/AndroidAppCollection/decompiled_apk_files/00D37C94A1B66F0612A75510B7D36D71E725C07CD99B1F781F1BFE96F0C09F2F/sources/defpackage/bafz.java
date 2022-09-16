package defpackage;

import android.util.Log;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bafz  reason: default package */
/* loaded from: classes2.dex */
public final class bafz implements Runnable {
    final /* synthetic */ UrlResponseInfo a;
    final /* synthetic */ CronetException b;
    final /* synthetic */ baga c;

    public bafz(baga bagaVar, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.c = bagaVar;
        this.a = urlResponseInfo;
        this.b = cronetException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            baga bagaVar = this.c;
            bagaVar.a.onFailed(bagaVar.d, this.a, this.b);
        } catch (Exception e) {
            Log.e(bagd.a, "Exception in onFailed method", e);
        }
    }
}
