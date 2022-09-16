package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: axz  reason: default package */
/* loaded from: classes2.dex */
public final class axz {
    public static final bbu d = new bbu(2, -9223372036854775807L);
    public static final bbu e = new bbu(3, -9223372036854775807L);
    public final ExecutorService a;
    public axu b;
    public IOException c;

    public axz(String str) {
        this.a = pxi.H(str.length() != 0 ? "ExoPlayer:Loader:".concat(str) : new String("ExoPlayer:Loader:"));
    }

    public static bbu h(boolean z, long j) {
        return new bbu(z ? 1 : 0, j);
    }

    public final void a() {
        axu axuVar = this.b;
        ptx.b(axuVar);
        axuVar.a(false);
    }

    public final void b() {
        this.c = null;
    }

    public final void c(int i) {
        IOException iOException = this.c;
        if (iOException == null) {
            axu axuVar = this.b;
            if (axuVar == null) {
                return;
            }
            if (i == Integer.MIN_VALUE) {
                i = axuVar.a;
            }
            IOException iOException2 = axuVar.b;
            if (iOException2 != null && axuVar.c > i) {
                throw iOException2;
            }
            return;
        }
        throw iOException;
    }

    public final void d(axw axwVar) {
        axu axuVar = this.b;
        if (axuVar != null) {
            axuVar.a(true);
        }
        if (axwVar != null) {
            this.a.execute(new axx(axwVar));
        }
        this.a.shutdown();
    }

    public final boolean e() {
        return this.c != null;
    }

    public final boolean f() {
        return this.b != null;
    }

    public final void g(axv axvVar, axt axtVar, int i) {
        Looper myLooper = Looper.myLooper();
        ptx.b(myLooper);
        this.c = null;
        SystemClock.elapsedRealtime();
        new axu(this, myLooper, axvVar, axtVar, i).b(0L);
    }
}
