package defpackage;
/* compiled from: PG */
/* renamed from: anij  reason: default package */
/* loaded from: classes.dex */
final class anij implements Runnable {
    final /* synthetic */ ankt a;
    final /* synthetic */ int b;
    final /* synthetic */ anil c;

    public anij(anil anilVar, ankt anktVar, int i) {
        this.c = anilVar;
        this.a = anktVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.a.isCancelled()) {
                anil anilVar = this.c;
                anilVar.a = null;
                anilVar.cancel(false);
            } else {
                this.c.h(this.b, this.a);
            }
        } finally {
            this.c.i(null);
        }
    }
}
