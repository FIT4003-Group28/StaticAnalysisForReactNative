package defpackage;
/* compiled from: PG */
/* renamed from: awom  reason: default package */
/* loaded from: classes3.dex */
final class awom implements Runnable {
    final /* synthetic */ amub a;
    final /* synthetic */ akrn b;
    final /* synthetic */ awop c;

    public awom(awop awopVar, amub amubVar, akrn akrnVar) {
        this.c = awopVar;
        this.a = amubVar;
        this.b = akrnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.c.a.h) {
            if (this.c.a.g.a()) {
                dbsk.s(this.c.a.l.get());
                atcw atcwVar = (atcw) this.c.a.l.get();
                amub amubVar = this.a;
                akrn akrnVar = this.b;
                awot awotVar = this.c.a;
                atcwVar.e(amubVar, akrnVar, !awotVar.j, true, !awotVar.i);
                this.c.a.j = false;
            }
        }
    }
}
