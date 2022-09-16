package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: axpp  reason: default package */
/* loaded from: classes2.dex */
public final class axpp implements Runnable {
    public IOException a;
    public boolean b = false;
    final /* synthetic */ axpq c;

    public axpp(axpq axpqVar) {
        this.c = axpqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ServerSocket serverSocket = this.c.j;
            String str = this.c.i;
            serverSocket.bind(str != null ? new InetSocketAddress(str, 0) : new InetSocketAddress(0));
            this.b = true;
            do {
                try {
                    Socket accept = this.c.j.accept();
                    InputStream inputStream = accept.getInputStream();
                    axpq axpqVar = this.c;
                    axpf axpfVar = axpqVar.l;
                    axpc axpcVar = new axpc(axpqVar, inputStream, accept);
                    axpfVar.a++;
                    Thread thread = new Thread(axpcVar);
                    thread.setDaemon(true);
                    long j = axpfVar.a;
                    StringBuilder sb = new StringBuilder(51);
                    sb.append("NanoHttpd Request Processor (#");
                    sb.append(j);
                    sb.append(")");
                    thread.setName(sb.toString());
                    axpfVar.b.add(axpcVar);
                    thread.start();
                } catch (IOException e) {
                    axpq.h.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                }
            } while (!this.c.j.isClosed());
        } catch (IOException e2) {
            this.a = e2;
        }
    }
}
