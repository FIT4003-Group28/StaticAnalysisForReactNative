package defpackage;

import java.io.PrintStream;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: dekh  reason: default package */
/* loaded from: classes6.dex */
final class dekh extends dekc {
    @Override // defpackage.dekc
    public final void a(Throwable th, Throwable th2) {
        th.addSuppressed(th2);
    }

    @Override // defpackage.dekc
    public final Throwable[] b(Throwable th) {
        return th.getSuppressed();
    }

    @Override // defpackage.dekc
    public final void c(Throwable th) {
        th.printStackTrace();
    }

    @Override // defpackage.dekc
    public final void d(Throwable th, PrintStream printStream) {
        th.printStackTrace(printStream);
    }

    @Override // defpackage.dekc
    public final void e(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
    }
}
