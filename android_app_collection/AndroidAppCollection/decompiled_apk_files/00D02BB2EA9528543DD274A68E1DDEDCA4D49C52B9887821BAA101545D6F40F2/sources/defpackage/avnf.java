package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: PG */
/* renamed from: avnf  reason: default package */
/* loaded from: classes3.dex */
final class avnf implements degu {
    final /* synthetic */ btzi a;
    final /* synthetic */ btzr b;
    final /* synthetic */ awmu c;

    public avnf(btzi btziVar, btzr btzrVar, awmu awmuVar) {
        this.a = btziVar;
        this.b = btzrVar;
        this.c = awmuVar;
    }

    @Override // defpackage.degu
    public final void a(final Throwable th) {
        if ((th instanceof CancellationException) || (th instanceof avni)) {
            this.a.QY(this.b, btzy.a(th));
        } else if (th instanceof awmq) {
            this.a.QY(this.b, btzy.j.b(th));
        } else {
            if (th instanceof Error) {
                this.c.a.execute(new Runnable(th) { // from class: avmw
                    private final Throwable a;

                    {
                        this.a = th;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Throwable th2 = this.a;
                        dbue.b(th2);
                        throw new RuntimeException(th2);
                    }
                });
            }
            bvoo.j(th);
            this.a.QY(this.b, btzy.j.b(th));
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.QZ(this.b, (dssj) obj);
    }
}
