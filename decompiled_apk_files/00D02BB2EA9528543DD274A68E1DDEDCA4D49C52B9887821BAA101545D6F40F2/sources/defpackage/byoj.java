package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: byoj  reason: default package */
/* loaded from: classes4.dex */
final class byoj implements Callable<dbsg> {
    final /* synthetic */ String a;
    final /* synthetic */ dssr b;
    final /* synthetic */ byol c;

    public byoj(byol byolVar, String str, dssr dssrVar) {
        this.c = byolVar;
        this.a = str;
        this.b = dssrVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ dbsg call() {
        dbsg dbsgVar;
        dxdz c;
        synchronized (this.c.a) {
            dxdz dxdzVar = null;
            try {
                try {
                    try {
                        c = this.c.c();
                    } catch (IOException e) {
                        e.getStackTrace();
                        dbsgVar = dbpy.a;
                        if (0 != 0 && !dxdzVar.f()) {
                            byol.d(null);
                        }
                    }
                } catch (dsrm e2) {
                    e2.getStackTrace();
                    if (0 != 0 && !dxdzVar.f()) {
                        try {
                            dxdzVar.l(this.a);
                        } catch (IOException e3) {
                            e3.getStackTrace();
                        }
                    }
                    dbsgVar = dbpy.a;
                    if (0 != 0 && !dxdzVar.f()) {
                        byol.d(null);
                    }
                }
            } catch (Exception e4) {
                e4.getStackTrace();
                dbsgVar = dbpy.a;
                if (0 != 0 && !dxdzVar.f()) {
                    byol.d(null);
                }
            }
            if (c == null) {
                return dbpy.a;
            }
            dxdy b = c.b(this.a);
            if (b == null) {
                dbsgVar = dbpy.a;
                if (!c.f()) {
                    byol.d(c);
                }
            } else {
                InputStream a = b.a();
                if (a == null) {
                    dbsgVar = dbpy.a;
                    if (!c.f()) {
                        byol.d(c);
                    }
                } else {
                    dbsgVar = dbsg.i((dssj) this.b.j(ddak.b(a)));
                    if (!c.f()) {
                        byol.d(c);
                    }
                }
            }
            return dbsgVar;
        }
    }
}
