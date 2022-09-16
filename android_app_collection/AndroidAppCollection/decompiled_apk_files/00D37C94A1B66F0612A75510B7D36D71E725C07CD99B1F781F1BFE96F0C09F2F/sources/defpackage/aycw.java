package defpackage;

import android.os.Parcel;
import java.io.InputStream;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aycw  reason: default package */
/* loaded from: classes2.dex */
public abstract class aycw {
    public final aymk a;
    private final aycl b;
    private final int c;
    private boolean d;
    private InputStream e;
    private Queue f;
    private boolean g;
    private int h;
    private int i;
    private int j;
    private int k = 1;

    public aycw(aycl ayclVar, int i, aymk aymkVar) {
        this.b = ayclVar;
        this.c = i;
        this.a = aymkVar;
    }

    private final void b(int i) {
        int i2 = this.k;
        int i3 = i - 1;
        boolean z = false;
        if (i3 == 1) {
            if (i2 == 1) {
                z = true;
            }
            aqxo.y(z);
        } else if (i3 == 2) {
            if (i2 == 2) {
                z = true;
            }
            aqxo.y(z);
        } else if (i3 == 3) {
            if (i2 == 3) {
                z = true;
            }
            aqxo.y(z);
        }
        this.k = i;
    }

    protected abstract int a(Parcel parcel);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(InputStream inputStream) {
        d();
        Queue queue = this.f;
        if (queue != null) {
            queue.add(inputStream);
        } else if (this.e == null) {
            this.e = inputStream;
        } else {
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            this.f = concurrentLinkedQueue;
            concurrentLinkedQueue.add(inputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d() {
        this.d = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e() {
        this.g = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g() {
        return !this.b.n;
    }

    protected final boolean h() {
        Queue queue = this.f;
        return queue != null ? !queue.isEmpty() : this.e != null && this.i == 0;
    }

    public final synchronized String toString() {
        StringBuilder sb;
        String simpleName = getClass().getSimpleName();
        int i = this.k;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "CLOSED" : "SUFFIX_SENT" : "ALL_MESSAGES_SENT" : "PREFIX_SENT" : "INITIAL";
        int i2 = this.i;
        sb = new StringBuilder(String.valueOf(simpleName).length() + 20 + str.length());
        sb.append(simpleName);
        sb.append("[S=");
        sb.append(str);
        sb.append("/NDM=");
        sb.append(i2);
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8 A[Catch: all -> 0x0117, IOException -> 0x0119, TryCatch #0 {IOException -> 0x0119, blocks: (B:22:0x003e, B:72:0x00eb, B:74:0x00f3, B:28:0x004c, B:29:0x0051, B:36:0x0068, B:38:0x006c, B:44:0x007d, B:46:0x0083, B:54:0x00a3, B:56:0x00a8, B:58:0x00b3, B:59:0x00bb, B:60:0x00cb, B:67:0x00dd, B:69:0x00e1, B:71:0x00e7, B:62:0x00d0, B:63:0x00d3, B:64:0x00d4, B:65:0x00d6, B:66:0x00d7, B:39:0x006f, B:41:0x0073, B:31:0x0054, B:33:0x0062, B:77:0x0116), top: B:92:0x003e, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aycw.f():void");
    }
}
