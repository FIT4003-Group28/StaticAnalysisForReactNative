package defpackage;

import org.chromium.net.CronetException;
/* compiled from: PG */
/* renamed from: bujb  reason: default package */
/* loaded from: classes4.dex */
final class bujb implements Runnable {
    final /* synthetic */ CronetException a;
    final /* synthetic */ bujd b;

    public bujb(bujd bujdVar, CronetException cronetException) {
        this.b = bujdVar;
        this.a = cronetException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.k(bvgp.a(this.a));
        this.b.d.b();
    }
}
