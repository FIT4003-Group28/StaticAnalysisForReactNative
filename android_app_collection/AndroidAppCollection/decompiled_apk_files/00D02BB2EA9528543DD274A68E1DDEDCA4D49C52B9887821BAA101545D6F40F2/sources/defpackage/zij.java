package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: zij  reason: default package */
/* loaded from: classes7.dex */
final class zij implements Runnable {
    final /* synthetic */ dqvj a;
    final /* synthetic */ amvh b;
    final /* synthetic */ List c;
    final /* synthetic */ dwao d;
    final /* synthetic */ zik e;

    public zij(zik zikVar, dqvj dqvjVar, amvh amvhVar, List list, dwao dwaoVar) {
        this.e = zikVar;
        this.a = dqvjVar;
        this.b = amvhVar;
        this.c = list;
        this.d = dwaoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.c.a(this.a, this.b, this.c, this.d, null, false);
        Runnable runnable = this.e.j;
        if (runnable == null) {
            bvoo.h("createNudgeBarClickRunnable() - dismissCallback was null.", new Object[0]);
        } else {
            runnable.run();
        }
    }
}
