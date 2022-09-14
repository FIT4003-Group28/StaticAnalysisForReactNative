package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: bdp  reason: default package */
/* loaded from: classes3.dex */
final class bdp implements Runnable {
    final /* synthetic */ bid a;
    final /* synthetic */ bdr b;

    public bdp(bdr bdrVar, bid bidVar) {
        this.b = bdrVar;
        this.a = bidVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bdr bdrVar;
        try {
            try {
                bbx bbxVar = (bbx) this.a.get();
                if (bbxVar != null) {
                    bbz e = bbz.e();
                    int i = bdr.h;
                    String str = this.b.b.b;
                    e.a(new Throwable[0]);
                    this.b.d = bbxVar;
                } else {
                    bbz e2 = bbz.e();
                    int i2 = bdr.h;
                    String str2 = this.b.b.b;
                    e2.b(new Throwable[0]);
                }
                bdrVar = this.b;
            } catch (InterruptedException e3) {
                e = e3;
                bbz e4 = bbz.e();
                int i3 = bdr.h;
                e4.b(e);
                bdrVar = this.b;
            } catch (CancellationException e5) {
                bbz e6 = bbz.e();
                int i4 = bdr.h;
                e6.c(e5);
                bdrVar = this.b;
            } catch (ExecutionException e7) {
                e = e7;
                bbz e42 = bbz.e();
                int i32 = bdr.h;
                e42.b(e);
                bdrVar = this.b;
            }
            bdrVar.a();
        } catch (Throwable th) {
            this.b.a();
            throw th;
        }
    }
}
