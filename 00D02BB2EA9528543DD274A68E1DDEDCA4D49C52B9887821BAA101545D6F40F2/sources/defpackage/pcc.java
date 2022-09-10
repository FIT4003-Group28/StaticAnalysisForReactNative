package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: PG */
/* renamed from: pcc  reason: default package */
/* loaded from: classes7.dex */
final class pcc implements Runnable {
    final /* synthetic */ dehn a;
    final /* synthetic */ btlu b;
    final /* synthetic */ String c;
    final /* synthetic */ pcg d;

    public pcc(pcg pcgVar, dehn dehnVar, btlu btluVar, String str) {
        this.d = pcgVar;
        this.a = dehnVar;
        this.b = btluVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dbyy<btlu, dehn<duto>> dbyyVar;
        duto dutoVar;
        int a;
        try {
            try {
                try {
                    dutoVar = (duto) deha.s(this.a);
                    a = duts.a(dutoVar.a);
                } catch (CancellationException unused) {
                    int i = pcg.j;
                    dbyyVar = this.d.h;
                }
            } catch (deiw e) {
                if (e.getCause() instanceof pcf) {
                    int i2 = pcg.j;
                    dbyyVar = this.d.h;
                } else {
                    throw e;
                }
            }
            if (a != 0 && a != 1) {
                int i3 = pcg.j;
                int i4 = dutoVar.a;
                dbyyVar = this.d.h;
                dbyyVar.i().remove(this.a);
            }
            this.d.f.ad(bvjk.gh, this.b, this.c);
            this.d.f.aa(bvjk.gi, this.b, this.d.e.b());
            dbyyVar = this.d.h;
            dbyyVar.i().remove(this.a);
        } catch (Throwable th) {
            this.d.h.i().remove(this.a);
            throw th;
        }
    }
}
