package defpackage;

import java.io.IOException;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: byok  reason: default package */
/* loaded from: classes4.dex */
final class byok implements Callable<Boolean> {
    final /* synthetic */ String a;
    final /* synthetic */ dssj b;
    final /* synthetic */ byol c;

    public byok(byol byolVar, String str, dssj dssjVar) {
        this.c = byolVar;
        this.a = str;
        this.b = dssjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() {
        Boolean bool;
        synchronized (this.c.a) {
            bool = 0;
            bool = 0;
            dxdz dxdzVar = null;
            try {
                try {
                    dxdzVar = this.c.c();
                    if (dxdzVar == null) {
                        bool = false;
                    } else {
                        dxdw j = dxdzVar.j(this.a);
                        this.b.bT(j.d());
                        j.a();
                        dxdzVar.g();
                        bool = true;
                        if (!dxdzVar.f()) {
                            byol.d(dxdzVar);
                            bool = true;
                        }
                    }
                } catch (Exception e) {
                    e.getStackTrace();
                    bool = Boolean.valueOf(bool);
                    if (dxdzVar != null && !dxdzVar.f()) {
                        byol.d(dxdzVar);
                    }
                }
            } catch (IOException e2) {
                e2.getStackTrace();
                bool = Boolean.valueOf(bool);
                if (dxdzVar != null && !dxdzVar.f()) {
                    byol.d(dxdzVar);
                }
            }
        }
        return bool;
    }
}
