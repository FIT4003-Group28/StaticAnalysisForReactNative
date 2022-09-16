package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: axpc  reason: default package */
/* loaded from: classes2.dex */
public final class axpc implements Runnable {
    public final InputStream a;
    public final Socket b;
    final /* synthetic */ axpq c;

    public axpc(axpq axpqVar, InputStream inputStream, Socket socket) {
        this.c = axpqVar;
        this.a = inputStream;
        this.b = socket;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OutputStream outputStream = null;
        try {
            try {
                outputStream = this.b.getOutputStream();
                axpi axpiVar = new axpi(this.c, new axph(), this.a, outputStream, this.b.getInetAddress());
                while (!this.b.isClosed()) {
                    axpiVar.b();
                }
            } catch (Exception e) {
                if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                    axpq.h.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
                }
            }
        } finally {
            axpq.l(outputStream);
            axpq.l(this.a);
            axpq.l(this.b);
            this.c.l.a(this);
        }
    }
}
