package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import org.apache.http.ConnectionClosedException;
import org.apache.http.HttpException;
import org.apache.http.impl.DefaultHttpServerConnection;
import org.apache.http.protocol.BasicHttpContext;
/* compiled from: PG */
/* renamed from: aipj  reason: default package */
/* loaded from: classes.dex */
final class aipj implements Runnable {
    final /* synthetic */ aipk a;
    private final Socket b;

    public aipj(aipk aipkVar, Socket socket) {
        this.a = aipkVar;
        this.b = socket;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DefaultHttpServerConnection defaultHttpServerConnection = new DefaultHttpServerConnection();
        try {
            try {
                try {
                    defaultHttpServerConnection.bind(this.b, this.a.a);
                    BasicHttpContext basicHttpContext = new BasicHttpContext();
                    while (!Thread.interrupted() && defaultHttpServerConnection.isOpen()) {
                        this.a.b.handleRequest(defaultHttpServerConnection, basicHttpContext);
                    }
                    try {
                        defaultHttpServerConnection.shutdown();
                    } catch (IOException unused) {
                    }
                } catch (IOException unused2) {
                }
            } catch (Throwable th) {
                try {
                    defaultHttpServerConnection.shutdown();
                } catch (IOException unused3) {
                }
                throw th;
            }
        } catch (HttpException e) {
            zep.d("HTTP protocol violation", e);
            try {
                defaultHttpServerConnection.shutdown();
            } catch (IOException unused4) {
            }
        } catch (ConnectionClosedException unused5) {
            defaultHttpServerConnection.shutdown();
        } catch (IOException e2) {
            String message = e2.getMessage();
            if (message == null || !(e2 instanceof SocketException) || (!message.contains("Connection reset by peer") && !message.contains("Socket closed"))) {
                zep.d("IOException when handling a request", e2);
            }
            try {
                defaultHttpServerConnection.shutdown();
            } catch (IOException unused6) {
            }
        }
    }
}
