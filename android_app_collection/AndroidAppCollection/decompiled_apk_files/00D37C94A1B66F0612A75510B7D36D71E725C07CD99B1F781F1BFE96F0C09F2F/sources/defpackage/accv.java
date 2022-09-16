package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Random;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: accv  reason: default package */
/* loaded from: classes.dex */
public final class accv implements acdd, acdm {
    public SocketChannel a;
    public accu b;
    public int c;
    public int d;
    public acdh e;
    public acdn f;
    public final boolean g;
    public boolean h;
    public boolean i;
    public MediaFormat j;
    public MediaFormat k;
    private final Context l;
    private final acbq m;
    private final Handler n;
    private final boolean o;
    private int p;
    private final long q;

    public accv(Context context, String str, int i, acbq acbqVar, boolean z, boolean z2, int i2, long j) {
        SocketChannel socketChannel = (SocketChannel) SocketChannel.open().configureBlocking(false);
        this.p = 10;
        this.c = -1;
        this.d = -1;
        socketChannel.getClass();
        zgh.m(str);
        this.l = context;
        this.o = z;
        this.g = z2;
        this.q = j;
        this.a = socketChannel;
        this.m = acbqVar;
        if (Looper.myLooper() != null) {
            this.n = new Handler(Looper.myLooper());
        } else {
            this.n = new Handler(Looper.getMainLooper());
        }
        Socket socket = socketChannel.socket();
        if (socket != null) {
            try {
                socket.setTcpNoDelay(true);
                socket.setTrafficClass(16);
                if (i2 > 0) {
                    socket.setSendBufferSize(i2 * 8192);
                }
            } catch (Exception e) {
                Log.e("RtmpConnection", "Could not set socket options", e);
            }
            socket.getTrafficClass();
            socket.getTcpNoDelay();
            socket.getReceiveBufferSize();
            socket.getSendBufferSize();
            socket.getSoTimeout();
        }
        this.a.connect(new InetSocketAddress(str, i < 0 ? 1935 : i));
    }

    public final int a() {
        int i = this.p;
        this.p = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized int b() {
        acdn acdnVar = this.f;
        if (acdnVar != null) {
            int i = 0;
            if (acdnVar.p) {
                try {
                    i = acdnVar.c.available();
                } catch (IOException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    Log.e("RtmpOutputStream", valueOf.length() != 0 ? "Could not determine bytes available in buffer: ".concat(valueOf) : new String("Could not determine bytes available in buffer: "));
                }
            }
            return i;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized Pair c() {
        Pair pair;
        acdn acdnVar = this.f;
        if (acdnVar == null) {
            return null;
        }
        if (acdnVar.p) {
            pair = new Pair(Integer.valueOf((int) (acdnVar.g - acdnVar.h)), Integer.valueOf(acdnVar.r));
            acdnVar.r = 0;
        } else {
            int i = (int) (acdnVar.g - acdnVar.h);
            acdnVar.r = i;
            pair = new Pair(Integer.valueOf(i), Integer.valueOf(acdnVar.r));
        }
        acdnVar.h = acdnVar.g;
        return pair;
    }

    public final synchronized void d() {
        if (this.h) {
            return;
        }
        if (!this.a.isConnected()) {
            Selector open = Selector.open();
            this.a.register(open, 8);
            int select = open.select(8000L);
            open.close();
            if (select != 1) {
                throw new TimeoutException("RTMP connect timed out");
            }
            if (!this.a.finishConnect()) {
                throw new IOException("RTMP finish connect failed");
            }
            if (!this.a.isConnected()) {
                throw new IOException("RTMP connect failed");
            }
        }
        acdh acdhVar = new acdh(this.a);
        this.e = acdhVar;
        Handler handler = this.n;
        acdhVar.g = this;
        acdhVar.h = handler;
        boolean z = this.o && !this.g;
        Context context = this.l;
        SocketChannel socketChannel = this.a;
        acbq acbqVar = this.m;
        boolean z2 = this.g;
        long j = this.q;
        accx a = accx.a(context);
        accs accsVar = z ? new accs() : null;
        acdn acdnVar = new acdn(context, socketChannel, acbqVar, z2, j, a, z ? new acct(accsVar) : null, accsVar);
        this.f = acdnVar;
        Handler handler2 = this.n;
        acdnVar.n = this;
        acdnVar.o = handler2;
        this.a.configureBlocking(true);
        acdn acdnVar2 = this.f;
        acdnVar2.a.clear();
        acdnVar2.a.put((byte) 3);
        acdnVar2.a.flip();
        acdnVar2.g(acdnVar2.a);
        byte[] bArr = new byte[1528];
        acdn acdnVar3 = this.f;
        aqxo.p(true);
        acdnVar3.a.clear();
        acdnVar3.a.putInt(0);
        acdnVar3.a.putInt(0);
        acdnVar3.a.flip();
        acdnVar3.g(acdnVar3.a);
        new Random(acdnVar3.e.g()).nextBytes(bArr);
        acdnVar3.g(ByteBuffer.wrap(bArr));
        this.f.a();
        this.a.configureBlocking(false);
        Selector open2 = Selector.open();
        this.a.register(open2, 1);
        if (open2.select(5000L) != 1) {
            throw new TimeoutException("RTMP handshake S0/S1 timed out");
        }
        open2.close();
        this.a.configureBlocking(true);
        byte a2 = this.e.a();
        if (a2 == 3) {
            this.a.configureBlocking(false);
            Selector open3 = Selector.open();
            this.a.register(open3, 1);
            if (open3.select(5000L) != 1) {
                throw new TimeoutException("RTMP handshake S0/S1 timed out");
            }
            open3.close();
            this.a.configureBlocking(true);
            int d = this.e.d();
            long g = this.m.g();
            this.f.h(d);
            this.f.h((int) g);
            this.e.d();
            for (int i = 8; i < 1536; i += 4) {
                this.f.h(this.e.d());
            }
            this.f.a();
            this.a.configureBlocking(false);
            Selector open4 = Selector.open();
            this.a.register(open4, 1);
            if (open4.select(5000L) != 1) {
                throw new TimeoutException("RTMP handshake S0/S1 timed out");
            }
            open4.close();
            this.a.configureBlocking(true);
            acdh acdhVar2 = this.e;
            aqxo.p(true);
            int d2 = acdhVar2.d();
            if (d2 != 0) {
                StringBuilder sb = new StringBuilder(42);
                sb.append("Timestamp mismatch in S2: ");
                sb.append(d2);
                sb.append(" != 0");
                throw new ProtocolException(sb.toString());
            }
            acdhVar2.d();
            for (int i2 = 0; i2 < 1528; i2++) {
                byte a3 = acdhVar2.a();
                byte b = bArr[i2];
                if (a3 != b) {
                    StringBuilder sb2 = new StringBuilder(33);
                    sb2.append("Data mismatch in S2: ");
                    sb2.append((int) a3);
                    sb2.append(" != ");
                    sb2.append((int) b);
                    throw new ProtocolException(sb2.toString());
                }
            }
            acdh acdhVar3 = this.e;
            synchronized (acdhVar3.k) {
                if (acdhVar3.b == null) {
                    acdhVar3.c = false;
                    acdhVar3.b = new Thread(acdhVar3.l, "rtmpInput");
                    acdhVar3.b.start();
                }
            }
            acdn acdnVar4 = this.f;
            synchronized (acdnVar4.s) {
                if (acdnVar4.l == null) {
                    if (acdnVar4.p) {
                        acdnVar4.l = new acdl(acdnVar4);
                        acdnVar4.l.start();
                        acdnVar4.q = true;
                    }
                    acdnVar4.m = false;
                }
            }
            this.h = true;
            return;
        }
        StringBuilder sb3 = new StringBuilder(26);
        sb3.append("Unknown RTMP version: ");
        sb3.append((int) a2);
        throw new ProtocolException(sb3.toString());
    }

    public final synchronized void e() {
        if (!this.h) {
            return;
        }
        acdh acdhVar = this.e;
        synchronized (acdhVar.k) {
            acdhVar.c = true;
        }
        acdn acdnVar = this.f;
        synchronized (acdnVar.s) {
            acdnVar.m = true;
        }
        this.a.close();
        acdh acdhVar2 = this.e;
        aqxo.y(acdhVar2.c);
        synchronized (acdhVar2.k) {
            if (acdhVar2.b != null) {
                while (true) {
                    try {
                        acdhVar2.b.join(200L);
                        break;
                    } catch (InterruptedException unused) {
                    }
                }
                Thread thread = acdhVar2.b;
                if (thread != null && thread.isAlive()) {
                    acdhVar2.b.interrupt();
                    while (true) {
                        try {
                            acdhVar2.b.join(200L);
                            break;
                        } catch (InterruptedException unused2) {
                        }
                    }
                    Thread thread2 = acdhVar2.b;
                    if (thread2 != null && !thread2.isAlive()) {
                        acdhVar2.b = null;
                    }
                }
                Thread thread3 = acdhVar2.b;
            }
        }
        acdn acdnVar2 = this.f;
        aqxo.y(acdnVar2.m);
        synchronized (acdnVar2.s) {
            if (acdnVar2.l != null) {
                while (true) {
                    try {
                        acdnVar2.l.join(200L);
                        break;
                    } catch (InterruptedException unused3) {
                    }
                }
                Thread thread4 = acdnVar2.l;
                if (thread4 != null && thread4.isAlive()) {
                    acdnVar2.l.interrupt();
                    while (true) {
                        try {
                            acdnVar2.l.join(200L);
                            break;
                        } catch (InterruptedException unused4) {
                        }
                    }
                    Thread thread5 = acdnVar2.l;
                    if (thread5 != null && !thread5.isAlive()) {
                        acdnVar2.l = null;
                    }
                }
            }
        }
        this.h = false;
        this.i = false;
    }

    public final synchronized void f() {
        if (this.h) {
            e();
        }
        this.a = null;
        this.e = null;
        this.f = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void g(int i) {
        acdn acdnVar = this.f;
        if (acdnVar == null || !acdnVar.p) {
            return;
        }
        acdnVar.c.b(i);
    }
}
