package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: roq  reason: default package */
/* loaded from: classes4.dex */
final class roq implements Runnable {
    final /* synthetic */ rpn a;
    final /* synthetic */ Runnable b;

    public roq(rpn rpnVar, Runnable runnable) {
        this.a = rpnVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.w();
        rpn rpnVar = this.a;
        Runnable runnable = this.b;
        rpnVar.v();
        if (rpnVar.l == null) {
            rpnVar.l = new ArrayList();
        }
        rpnVar.l.add(runnable);
        this.a.M();
    }
}
