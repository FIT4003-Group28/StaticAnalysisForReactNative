package defpackage;

import org.chromium.net.CronetException;
/* compiled from: PG */
/* renamed from: cvhm  reason: default package */
/* loaded from: classes5.dex */
final class cvhm implements Runnable {
    final /* synthetic */ CronetException a;
    final /* synthetic */ cvhp b;

    public cvhm(cvhp cvhpVar, CronetException cronetException) {
        this.b = cvhpVar;
        this.a = cronetException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.k(bvgp.a(this.a));
    }
}
