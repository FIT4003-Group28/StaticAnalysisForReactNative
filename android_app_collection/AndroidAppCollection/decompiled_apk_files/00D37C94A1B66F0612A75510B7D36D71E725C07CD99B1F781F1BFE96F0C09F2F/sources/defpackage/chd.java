package defpackage;

import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;
/* compiled from: PG */
/* renamed from: chd  reason: default package */
/* loaded from: classes2.dex */
final class chd extends chh {
    final /* synthetic */ UrlResponseInfo a;
    final /* synthetic */ CronetException b;
    final /* synthetic */ chf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chd(chf chfVar, cfv cfvVar, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        super(cfvVar);
        this.c = chfVar;
        this.a = urlResponseInfo;
        this.b = cronetException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a(this.a, this.b, false, null);
    }
}
