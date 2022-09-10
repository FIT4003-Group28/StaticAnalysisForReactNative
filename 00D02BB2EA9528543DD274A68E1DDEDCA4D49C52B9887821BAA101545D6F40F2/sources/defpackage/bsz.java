package defpackage;

import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;
/* compiled from: PG */
/* renamed from: bsz  reason: default package */
/* loaded from: classes4.dex */
final class bsz extends btd {
    final /* synthetic */ UrlResponseInfo a;
    final /* synthetic */ CronetException b;
    final /* synthetic */ btb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsz(btb btbVar, bro broVar, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        super(broVar);
        this.c = btbVar;
        this.a = urlResponseInfo;
        this.b = cronetException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a(this.a, this.b, false, null);
    }
}
