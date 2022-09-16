package org.spongycastle.crypto.tls;
/* loaded from: classes.dex */
public interface DatagramTransport {
    void close();

    int getReceiveLimit();

    int getSendLimit();

    int receive(byte[] bArr, int i, int i2, int i3);

    void send(byte[] bArr, int i, int i2);
}
