package org.spongycastle.crypto.tls;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
/* loaded from: classes.dex */
public class UDPTransport implements DatagramTransport {
    protected static final int MAX_IP_OVERHEAD = 84;
    protected static final int MIN_IP_OVERHEAD = 20;
    protected static final int UDP_OVERHEAD = 8;
    protected final int receiveLimit;
    protected final int sendLimit;
    protected final DatagramSocket socket;

    public UDPTransport(DatagramSocket datagramSocket, int i) {
        if (!datagramSocket.isBound() || !datagramSocket.isConnected()) {
            throw new IllegalArgumentException("'socket' must be bound and connected");
        }
        this.socket = datagramSocket;
        this.receiveLimit = (i - 20) - 8;
        this.sendLimit = (i - 84) - 8;
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public int getReceiveLimit() {
        return this.receiveLimit;
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public int getSendLimit() {
        return this.sendLimit;
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public int receive(byte[] bArr, int i, int i2, int i3) {
        this.socket.setSoTimeout(i3);
        DatagramPacket datagramPacket = new DatagramPacket(bArr, i, i2);
        this.socket.receive(datagramPacket);
        return datagramPacket.getLength();
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public void send(byte[] bArr, int i, int i2) {
        if (i2 > getSendLimit()) {
            throw new TlsFatalAlert((short) 80);
        }
        this.socket.send(new DatagramPacket(bArr, i, i2));
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public void close() {
        this.socket.close();
    }
}
