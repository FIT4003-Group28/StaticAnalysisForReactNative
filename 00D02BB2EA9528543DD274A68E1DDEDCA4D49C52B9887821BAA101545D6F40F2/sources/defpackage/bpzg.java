package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bpzg  reason: default package */
/* loaded from: classes4.dex */
final class bpzg implements Runnable {
    final /* synthetic */ akqq a;
    final /* synthetic */ bpzj b;

    public bpzg(bpzj bpzjVar, akqq akqqVar) {
        this.b = bpzjVar;
        this.a = akqqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bpzj bpzjVar = this.b;
        if (!bpzjVar.h) {
            akqq akqqVar = this.a;
            List<akqq> f = bpzjVar.a.f();
            if (!f.isEmpty() && akqq.v(akqqVar, (akqq) dcft.s(f), 0.1d)) {
                return;
            }
            bpzj bpzjVar2 = this.b;
            bpzjVar2.h = true;
            bpzjVar2.m();
        }
    }
}
