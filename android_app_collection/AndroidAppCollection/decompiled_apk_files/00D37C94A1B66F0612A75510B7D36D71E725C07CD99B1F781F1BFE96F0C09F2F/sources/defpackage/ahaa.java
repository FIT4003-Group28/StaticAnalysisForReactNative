package defpackage;

import android.database.sqlite.SQLiteException;
import android.os.Process;
/* compiled from: PG */
/* renamed from: ahaa  reason: default package */
/* loaded from: classes.dex */
public final class ahaa implements agxp {
    private final agvx a;
    private final agxo b;
    private final agqz c;
    private final Object d = new Object();
    private boolean e = false;

    public ahaa(agvx agvxVar, agqz agqzVar, agxo agxoVar) {
        this.a = agvxVar;
        this.b = agxoVar;
        this.c = agqzVar;
    }

    @Override // defpackage.agxp
    public final void a(int i) {
        synchronized (this.d) {
            this.e = true;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        synchronized (this.d) {
            if (!this.e) {
                aglj A = this.a.A();
                agpj e = this.a.e();
                if (A != null && e != null) {
                    try {
                        this.b.b(this.c.a, 0L, 0.0d, false);
                        ahai.f(A, e, this.c);
                        this.b.a(this.c.a, new agqy());
                    } catch (agxq e2) {
                        this.b.d(this.c.a, e2, new agqy());
                    } catch (SQLiteException e3) {
                        this.b.d(this.c.a, agxq.a("SQL error encountered while saving the thumbnail.", e3, agqe.FAILED_UNKNOWN, atsg.UNKNOWN_FAILURE_REASON), new agqy());
                    } catch (Exception e4) {
                        String valueOf = String.valueOf(e4.getMessage());
                        afus.c(2, 28, valueOf.length() != 0 ? "Thumbnail save exception: ".concat(valueOf) : new String("Thumbnail save exception: "), e4);
                        this.b.d(this.c.a, agxq.a("Unknown error encountered while saving the thumbnail.", e4, agqe.FAILED_UNKNOWN, atsg.UNKNOWN_FAILURE_REASON), new agqy());
                    }
                }
            }
        }
    }
}
