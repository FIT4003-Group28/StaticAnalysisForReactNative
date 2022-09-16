package defpackage;

import java.security.MessageDigest;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awyj  reason: default package */
/* loaded from: classes2.dex */
public final class awyj implements awyp {
    public static final char[] a = "0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();
    public final String b;
    public final String c;
    public final awya d;
    public final String e;
    public final awxx f;
    public final awxz g;
    public final MessageDigest h;
    public awyp i;
    public int j;
    public int k;
    public axij l;
    private int m;

    public awyj(String str, awya awyaVar, awxx awxxVar, String str2, awxz awxzVar, awyu awyuVar) {
        str.getClass();
        awxxVar.getClass();
        awxzVar.getClass();
        this.b = str;
        this.c = "POST";
        this.d = awyaVar;
        this.e = amps.d(str2);
        this.g = awxzVar;
        this.f = awxxVar;
        this.m = 1;
        this.h = awyuVar.b;
    }

    @Override // defpackage.awyp
    public final ankt a() {
        Callable callable = new Callable() { // from class: awyh
            /* JADX WARN: Removed duplicated region for block: B:49:0x0104 A[Catch: all -> 0x0118, awyr -> 0x0127, TryCatch #8 {awyr -> 0x0127, all -> 0x0118, blocks: (B:3:0x0002, B:8:0x000b, B:11:0x001d, B:12:0x002e, B:13:0x0046, B:15:0x004c, B:17:0x005e, B:18:0x0068, B:19:0x0072, B:21:0x0094, B:23:0x009e, B:25:0x00af, B:31:0x00c3, B:32:0x00c4, B:35:0x00cc, B:36:0x00d2, B:38:0x00d8, B:40:0x00e0, B:41:0x00e4, B:42:0x00e6, B:43:0x00e7, B:47:0x00f2, B:49:0x0104, B:51:0x010e, B:52:0x0111, B:50:0x0109, B:55:0x0114, B:22:0x0099, B:58:0x0117), top: B:85:0x0002 }] */
            /* JADX WARN: Removed duplicated region for block: B:50:0x0109 A[Catch: all -> 0x0118, awyr -> 0x0127, TryCatch #8 {awyr -> 0x0127, all -> 0x0118, blocks: (B:3:0x0002, B:8:0x000b, B:11:0x001d, B:12:0x002e, B:13:0x0046, B:15:0x004c, B:17:0x005e, B:18:0x0068, B:19:0x0072, B:21:0x0094, B:23:0x009e, B:25:0x00af, B:31:0x00c3, B:32:0x00c4, B:35:0x00cc, B:36:0x00d2, B:38:0x00d8, B:40:0x00e0, B:41:0x00e4, B:42:0x00e6, B:43:0x00e7, B:47:0x00f2, B:49:0x0104, B:51:0x010e, B:52:0x0111, B:50:0x0109, B:55:0x0114, B:22:0x0099, B:58:0x0117), top: B:85:0x0002 }] */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 330
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.awyh.call():java.lang.Object");
            }
        };
        anlk anlkVar = new anlk();
        anlkVar.d("Scotty-Uploader-MultipartTransfer-%d");
        ankw e = anlz.e(Executors.newSingleThreadExecutor(anlk.b(anlkVar)));
        ankt qp = e.qp(callable);
        e.shutdown();
        return qp;
    }

    @Override // defpackage.awyp
    public final /* synthetic */ ankt b() {
        return axij.l();
    }

    @Override // defpackage.awyp
    public final awxx c() {
        return this.f;
    }

    public final synchronized void d() {
        int i;
        while (true) {
            i = this.m;
            if (i != 2) {
                break;
            }
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
        if (i == 3) {
            throw new awyr(awyq.CANCELED, "");
        }
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        araa.x(z);
    }

    @Override // defpackage.awyp
    public final String e() {
        return null;
    }

    @Override // defpackage.awyp
    public final void f() {
        synchronized (this) {
            awyp awypVar = this.i;
            if (awypVar != null) {
                awypVar.f();
            }
            this.m = 3;
            notifyAll();
        }
    }

    @Override // defpackage.awyp
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // defpackage.awyp
    public final synchronized void j(axij axijVar, int i, int i2) {
        aqxo.q(i > 0, "Progress threshold (bytes) must be greater than 0");
        aqxo.q(true, "Progress threshold (millis) must be greater or equal to 0");
        this.l = axijVar;
        this.j = i;
        this.k = i2;
    }
}
