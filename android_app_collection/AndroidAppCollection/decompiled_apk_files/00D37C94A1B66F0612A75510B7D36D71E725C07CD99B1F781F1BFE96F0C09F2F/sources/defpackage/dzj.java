package defpackage;

import java.io.IOException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dzj  reason: default package */
/* loaded from: classes3.dex */
final class dzj implements Runnable {
    final /* synthetic */ yni a;
    final /* synthetic */ dzs b;
    private final /* synthetic */ int c;

    public dzj(dzs dzsVar, yni yniVar) {
        this.b = dzsVar;
        this.a = yniVar;
    }

    public dzj(dzs dzsVar, yni yniVar, int i) {
        this.c = i;
        this.b = dzsVar;
        this.a = yniVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            try {
                afuy afuyVar = (afuy) this.b.r.get();
                this.a.g(afuyVar);
                ((etd) this.b.s.get()).g();
                afuyVar.b();
            } catch (IOException e) {
                zep.d("Failed to read offline browse from store", e);
            }
        } else if (i == 1) {
            afuy afuyVar2 = (afuy) this.b.t.get();
            this.a.g(afuyVar2);
            afuyVar2.b();
        } else if (i == 2) {
            this.a.g((zin) this.b.ab.get());
        } else if (i == 3) {
            this.a.h(this.b, dzs.class);
        } else {
            afuw afuwVar = (afuw) this.b.i.get();
            afus.a(afuwVar);
            this.a.g(this.b.l.get());
            if (eog.aD((aacz) this.b.at.get())) {
                acrk acrkVar = (acrk) this.b.j.get();
                afuwVar.b = acrkVar.a((afst) this.b.k.get());
                afuwVar.g();
                acrkVar.b();
                acrkVar.d((Executor) this.b.al.get());
            }
            this.b.c();
        }
    }
}
