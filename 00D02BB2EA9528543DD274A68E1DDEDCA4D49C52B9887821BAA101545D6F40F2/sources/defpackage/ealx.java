package defpackage;

import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ealx  reason: default package */
/* loaded from: classes6.dex */
public final class ealx implements Runnable {
    final /* synthetic */ UrlResponseInfo a;
    final /* synthetic */ CronetException b;
    final /* synthetic */ ealy c;

    public ealx(ealy ealyVar, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.c = ealyVar;
        this.a = urlResponseInfo;
        this.b = cronetException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ealy ealyVar = this.c;
            ealyVar.a.onFailed(ealyVar.d, this.a, this.b);
        } catch (Exception unused) {
        }
    }
}
