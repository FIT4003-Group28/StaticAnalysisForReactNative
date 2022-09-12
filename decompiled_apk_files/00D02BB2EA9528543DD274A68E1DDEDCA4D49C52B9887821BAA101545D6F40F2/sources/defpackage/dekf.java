package defpackage;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;
/* compiled from: PG */
/* renamed from: dekf  reason: default package */
/* loaded from: classes6.dex */
final class dekf extends dekc {
    private final deke b = new deke();

    @Override // defpackage.dekc
    public final Throwable[] b(Throwable th) {
        List<Throwable> a = this.b.a(th, false);
        if (a == null || a.isEmpty()) {
            return a;
        }
        return (Throwable[]) a.toArray(a);
    }

    @Override // defpackage.dekc
    public final void c(Throwable th) {
        th.printStackTrace();
        List<Throwable> a = this.b.a(th, false);
        if (a == null) {
            return;
        }
        synchronized (a) {
            for (Throwable th2 : a) {
                System.err.print("Suppressed: ");
                th2.printStackTrace();
            }
        }
    }

    @Override // defpackage.dekc
    public final void d(Throwable th, PrintStream printStream) {
        th.printStackTrace(printStream);
        List<Throwable> a = this.b.a(th, false);
        if (a == null) {
            return;
        }
        synchronized (a) {
            for (Throwable th2 : a) {
                printStream.print("Suppressed: ");
                th2.printStackTrace(printStream);
            }
        }
    }

    @Override // defpackage.dekc
    public final void e(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        List<Throwable> a = this.b.a(th, false);
        if (a == null) {
            return;
        }
        synchronized (a) {
            for (Throwable th2 : a) {
                printWriter.print("Suppressed: ");
                th2.printStackTrace(printWriter);
            }
        }
    }

    @Override // defpackage.dekc
    public final void a(Throwable th, Throwable th2) {
        if (th2 != th) {
            if (th2 == null) {
                throw new NullPointerException("The suppressed exception cannot be null.");
            }
            this.b.a(th, true).add(th2);
            return;
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th2);
    }
}
