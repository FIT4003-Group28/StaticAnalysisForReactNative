package defpackage;

import org.chromium.net.CronetException;
/* compiled from: PG */
/* renamed from: buik  reason: default package */
/* loaded from: classes4.dex */
final class buik implements Runnable {
    final /* synthetic */ CronetException a;
    final /* synthetic */ buil b;

    public buik(buil builVar, CronetException cronetException) {
        this.b = builVar;
        this.a = cronetException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.k(bvgp.a(this.a));
    }
}
