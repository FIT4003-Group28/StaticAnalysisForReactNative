package com.google.android.gms.measurement.internal;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
/* loaded from: classes.dex */
final class ca extends SSLSocketFactory {

    /* renamed from: a  reason: collision with root package name */
    private final SSLSocketFactory f7225a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ca() {
        this(HttpsURLConnection.getDefaultSSLSocketFactory());
    }

    private ca(SSLSocketFactory sSLSocketFactory) {
        this.f7225a = sSLSocketFactory;
    }

    private final SSLSocket a(SSLSocket sSLSocket) {
        return new ba(this, sSLSocket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        return a((SSLSocket) this.f7225a.createSocket());
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        return a((SSLSocket) this.f7225a.createSocket(str, i));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return a((SSLSocket) this.f7225a.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        return a((SSLSocket) this.f7225a.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return a((SSLSocket) this.f7225a.createSocket(inetAddress, i, inetAddress2, i2));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        return a((SSLSocket) this.f7225a.createSocket(socket, str, i, z));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f7225a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f7225a.getSupportedCipherSuites();
    }
}
