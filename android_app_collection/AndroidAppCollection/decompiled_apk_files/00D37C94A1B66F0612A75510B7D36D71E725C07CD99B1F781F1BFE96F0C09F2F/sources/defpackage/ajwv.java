package defpackage;

import java.util.TimerTask;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajwv  reason: default package */
/* loaded from: classes.dex */
public final class ajwv extends TimerTask {
    final /* synthetic */ Object a;
    final /* synthetic */ ajfz b;
    final /* synthetic */ ajxh c;

    public ajwv(ajxh ajxhVar, Object obj, ajfz ajfzVar) {
        this.c = ajxhVar;
        this.a = obj;
        this.b = ajfzVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.c.C.remove(this.a);
        this.c.t.execute(new ajwu(this));
    }
}
