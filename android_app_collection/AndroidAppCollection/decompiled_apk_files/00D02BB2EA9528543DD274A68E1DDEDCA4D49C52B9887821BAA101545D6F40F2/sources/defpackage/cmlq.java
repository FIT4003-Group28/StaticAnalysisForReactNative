package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
/* compiled from: PG */
/* renamed from: cmlq  reason: default package */
/* loaded from: classes5.dex */
public final class cmlq extends cmka {
    private final byte[] a;
    private final DatagramPacket b;
    private Uri c;
    private DatagramSocket d;
    private MulticastSocket e;
    private InetAddress f;
    private InetSocketAddress g;
    private boolean h;
    private int i;

    public cmlq() {
        super(true);
        byte[] bArr = new byte[2000];
        this.a = bArr;
        this.b = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // defpackage.cmkd
    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.i == 0) {
            try {
                this.d.receive(this.b);
                int length = this.b.getLength();
                this.i = length;
                h(length);
            } catch (IOException e) {
                throw new cmlp(e);
            }
        }
        int length2 = this.b.getLength();
        int i3 = this.i;
        int min = Math.min(i3, i2);
        System.arraycopy(this.a, length2 - i3, bArr, i, min);
        this.i -= min;
        return min;
    }

    @Override // defpackage.cmkg
    public final long c(cmkj cmkjVar) {
        Uri uri = cmkjVar.a;
        this.c = uri;
        String host = uri.getHost();
        int port = this.c.getPort();
        j();
        try {
            this.f = InetAddress.getByName(host);
            this.g = new InetSocketAddress(this.f, port);
            if (!this.f.isMulticastAddress()) {
                this.d = new DatagramSocket(this.g);
            } else {
                MulticastSocket multicastSocket = new MulticastSocket(this.g);
                this.e = multicastSocket;
                multicastSocket.joinGroup(this.f);
                this.d = this.e;
            }
            try {
                this.d.setSoTimeout(8000);
                this.h = true;
                g(cmkjVar);
                return -1L;
            } catch (SocketException e) {
                throw new cmlp(e);
            }
        } catch (IOException e2) {
            throw new cmlp(e2);
        }
    }

    @Override // defpackage.cmkg
    public final Uri d() {
        return this.c;
    }

    @Override // defpackage.cmkg
    public final void f() {
        this.c = null;
        MulticastSocket multicastSocket = this.e;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f);
            } catch (IOException unused) {
            }
            this.e = null;
        }
        DatagramSocket datagramSocket = this.d;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.d = null;
        }
        this.f = null;
        this.g = null;
        this.i = 0;
        if (this.h) {
            this.h = false;
            i();
        }
    }
}
