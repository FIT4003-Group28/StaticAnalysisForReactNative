package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: byk  reason: default package */
/* loaded from: classes.dex */
public final class byk implements bye {
    private final File b;
    private bsh d;
    private final byi c = new byi();
    private final byu a = new byu();

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public byk(File file) {
        this.b = file;
    }

    private final synchronized bsh c() {
        if (this.d == null) {
            this.d = bsh.i(this.b);
        }
        return this.d;
    }

    @Override // defpackage.bye
    public final File a(btw btwVar) {
        try {
            bsg b = c().b(this.a.a(btwVar));
            if (b == null) {
                return null;
            }
            return b.a();
        } catch (IOException unused) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
            }
            return null;
        }
    }

    @Override // defpackage.bye
    public final void b(btw btwVar, bvr bvrVar) {
        byg bygVar;
        byi byiVar;
        bsh c;
        String a = this.a.a(btwVar);
        byi byiVar2 = this.c;
        synchronized (byiVar2) {
            bygVar = byiVar2.a.get(a);
            if (bygVar == null) {
                byh byhVar = byiVar2.b;
                synchronized (byhVar.a) {
                    bygVar = byhVar.a.poll();
                }
                if (bygVar == null) {
                    bygVar = new byg();
                }
                byiVar2.a.put(a, bygVar);
            }
            bygVar.b++;
        }
        bygVar.a.lock();
        try {
            c = c();
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.c.a(a);
            throw th;
        }
        if (c.b(a) == null) {
            bse g = c.g(a);
            if (g == null) {
                throw new IllegalStateException(a.length() != 0 ? "Had two simultaneous puts for: ".concat(a) : new String("Had two simultaneous puts for: "));
            }
            try {
                if (bvrVar.a(g.d())) {
                    g.a();
                }
                g.c();
                byiVar = this.c;
                byiVar.a(a);
            } catch (Throwable th2) {
                g.c();
                throw th2;
            }
        }
        byiVar = this.c;
        byiVar.a(a);
    }
}
