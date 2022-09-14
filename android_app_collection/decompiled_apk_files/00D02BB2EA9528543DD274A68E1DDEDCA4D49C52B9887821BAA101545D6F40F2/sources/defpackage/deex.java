package defpackage;
/* compiled from: PG */
/* renamed from: deex  reason: default package */
/* loaded from: classes.dex */
final class deex implements Runnable {
    final /* synthetic */ dehn a;
    final /* synthetic */ int b;
    final /* synthetic */ defa c;

    public deex(defa defaVar, dehn dehnVar, int i) {
        this.c = defaVar;
        this.a = dehnVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.a.isCancelled()) {
                defa defaVar = this.c;
                defaVar.a = null;
                defaVar.cancel(false);
            } else {
                this.c.g(this.b, this.a);
            }
        } finally {
            this.c.h((dccr) null);
        }
    }
}
