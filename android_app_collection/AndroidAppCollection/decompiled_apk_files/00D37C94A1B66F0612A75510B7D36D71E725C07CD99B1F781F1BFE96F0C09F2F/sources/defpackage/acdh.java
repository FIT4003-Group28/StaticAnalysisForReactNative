package defpackage;

import android.os.Handler;
import android.util.Log;
import android.util.SparseArray;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SocketChannel;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acdh  reason: default package */
/* loaded from: classes.dex */
public final class acdh {
    public Thread b;
    public volatile boolean c;
    public acdd g;
    public volatile Handler h;
    public int i;
    public int j;
    private final SocketChannel n;
    private final ByteBuffer o;
    private volatile int q;
    private boolean r;
    private final ExecutorService m = Executors.newCachedThreadPool();
    public final ByteBuffer a = ByteBuffer.allocate(11);
    public final SparseArray d = new SparseArray();
    private final SparseArray p = new SparseArray();
    public int e = 128;
    public ByteBuffer f = ByteBuffer.allocate(128);
    public final Object k = new Object();
    public final Runnable l = new accz(this);

    public acdh(SocketChannel socketChannel) {
        this.n = socketChannel;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        this.o = allocate;
        allocate.order(ByteOrder.BIG_ENDIAN);
    }

    public final byte a() {
        this.o.clear();
        this.o.limit(1);
        g(this.o);
        this.o.flip();
        return this.o.get();
    }

    public final int b(acde acdeVar) {
        aqxo.y(this.f.capacity() == this.e);
        int i = acdeVar.g;
        if (i == 0) {
            i = acdeVar.b;
            acdeVar.g = i;
            acdeVar.f = true;
        }
        int min = Math.min(i, this.e);
        if (min > 0) {
            k(this.f, 0, min);
        }
        int i2 = acdeVar.g - min;
        acdeVar.g = i2;
        if (i2 <= 0) {
            acdeVar.g = 0;
            acdeVar.f = false;
        }
        return min;
    }

    public final int c(acde acdeVar) {
        String str;
        if (acdeVar.g == 0) {
            acdeVar.g = acdeVar.b;
        }
        byte[] bArr = acdeVar.i;
        if (bArr == null || bArr.length < acdeVar.b) {
            acdeVar.i = new byte[acdeVar.b];
            acdeVar.j = ByteBuffer.wrap(acdeVar.i);
            acdeVar.k = new ByteArrayInputStream(acdeVar.i);
            acdeVar.l = new DataInputStream(acdeVar.k);
        }
        int min = Math.min(acdeVar.g, this.e);
        if (min > 0) {
            k(acdeVar.j, acdeVar.b - acdeVar.g, min);
        }
        int i = acdeVar.g - min;
        acdeVar.g = i;
        if (i <= 0) {
            acdeVar.g = 0;
            acdeVar.k.reset();
            DataInputStream dataInputStream = acdeVar.l;
            try {
                achj.g(2, dataInputStream);
                str = dataInputStream.readUTF();
            } catch (ProtocolException unused) {
                Log.e("RtmpInputStream", "Skipping AMF message without a command");
                str = null;
            }
            if ("_result".equals(str)) {
                int d = (int) achj.d(dataInputStream);
                acdf acdfVar = (acdf) this.p.get(d);
                if (acdfVar == null) {
                    StringBuilder sb = new StringBuilder(35);
                    sb.append("No pending transaction: ");
                    sb.append(d);
                    Log.e("RtmpInputStream", sb.toString());
                } else {
                    acdfVar.a = new acdg();
                    acdfVar.a.a = 0;
                    Object e = achj.e(dataInputStream);
                    Object e2 = achj.e(dataInputStream);
                    if (e != null || !(e2 instanceof Double)) {
                        if ((e instanceof Map) && (e2 instanceof Map)) {
                            Map map = (Map) e2;
                            Object obj = map.get("level");
                            Object obj2 = map.get("code");
                            if ((obj instanceof String) && "status".equals(obj) && (obj2 instanceof String)) {
                                acdfVar.a.b = (String) obj2;
                            }
                        }
                    } else {
                        acdfVar.a.c = ((Double) e2).intValue();
                    }
                    acdfVar.b.countDown();
                }
            } else if ("onStatus".equals(str)) {
                acdf acdfVar2 = (acdf) this.p.get(2);
                if (acdfVar2 == null) {
                    Log.e("RtmpInputStream", "No pending transaction: 2");
                } else {
                    acdfVar2.a = new acdg();
                    acdfVar2.a.a = 0;
                    achj.d(dataInputStream);
                    achj.g(5, dataInputStream);
                    achj.g(3, dataInputStream);
                    Map f = achj.f(dataInputStream);
                    Object obj3 = f.get("level");
                    Object obj4 = f.get("code");
                    if ((obj3 instanceof String) && "status".equals(obj3) && (obj4 instanceof String)) {
                        acdfVar2.a.b = (String) obj4;
                    }
                    acdfVar2.b.countDown();
                }
            } else if ("_error".equals(str)) {
                acdf acdfVar3 = (acdf) this.p.get((int) achj.d(dataInputStream));
                if (acdfVar3 != null) {
                    acdfVar3.a = new acdg();
                    acdfVar3.a.a = 1;
                    acdfVar3.b.countDown();
                }
            } else {
                String valueOf = String.valueOf(str);
                Log.e("RtmpInputStream", valueOf.length() != 0 ? "Ignoring unrecognized AMF command: ".concat(valueOf) : new String("Ignoring unrecognized AMF command: "));
            }
        }
        return min;
    }

    public final int d() {
        this.o.clear();
        this.o.limit(4);
        g(this.o);
        this.o.flip();
        return this.o.getInt();
    }

    public final Future e(int i) {
        acdf acdfVar = (acdf) this.p.get(i);
        if (acdfVar == null || acdfVar.a != null) {
            final acdf acdfVar2 = new acdf();
            acdfVar2.b = new CountDownLatch(1);
            this.p.put(i, acdfVar2);
            return this.m.submit(new Callable() { // from class: accy
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    acdf acdfVar3 = acdf.this;
                    acdfVar3.b.await();
                    return acdfVar3.a;
                }
            });
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Transaction already in progress: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final void f(int i) {
        this.p.remove(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void g(java.nio.ByteBuffer r2) {
        /*
            r1 = this;
        L0:
            int r0 = r2.remaining()
            if (r0 <= 0) goto L1f
            java.nio.channels.SocketChannel r0 = r1.n
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L17
            java.nio.channels.SocketChannel r0 = r1.n
            int r0 = r0.read(r2)
            if (r0 < 0) goto L17
            goto L0
        L17:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r0 = "socket closed"
            r2.<init>(r0)
            throw r2
        L1f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acdh.g(java.nio.ByteBuffer):void");
    }

    public final synchronized void h(Throwable th) {
        if (this.h != null) {
            this.h.post(new acda(this, th));
        }
    }

    public final synchronized void i(int i) {
        if (this.h != null) {
            this.h.post(new acdb(this));
        }
    }

    public final synchronized void j(int i, int i2) {
        if (this.h != null) {
            this.h.post(new acdc(this, i, i2));
        }
    }

    public final void k(ByteBuffer byteBuffer, int i, int i2) {
        byteBuffer.position(i);
        byteBuffer.limit(i + i2);
        g(byteBuffer);
    }

    public final synchronized void l(int i) {
        this.q = i;
        this.r = false;
        m(0);
    }

    public final synchronized void m(int i) {
        int i2 = this.i + i;
        this.i = i2;
        if (i2 - this.q >= this.j && !this.r) {
            this.r = true;
            if (this.h != null) {
                this.h.post(new acdb(this, 1));
            }
        }
    }
}
