package defpackage;

import android.os.Parcel;
import java.io.InputStream;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: deyt  reason: default package */
/* loaded from: classes6.dex */
public abstract class deyt {
    public final dyvi a;
    public boolean b;
    private final dexw c;
    private final int d;
    @dzsi
    private InputStream e;
    @dzsi
    private Queue<InputStream> f;
    private boolean g;
    private int h;
    private int i;
    private int j;
    private int k = 1;

    public deyt(dexw dexwVar, int i, dyvi dyviVar) {
        this.c = dexwVar;
        this.d = i;
        this.a = dyviVar;
    }

    private final void h(int i) {
        int i2 = this.k;
        int i3 = i - 1;
        boolean z = false;
        if (i3 == 1) {
            if (i2 == 1) {
                z = true;
            }
            dbsk.l(z);
        } else if (i3 == 2) {
            if (i2 == 2) {
                z = true;
            }
            dbsk.l(z);
        } else if (i3 == 3) {
            if (i2 == 3) {
                z = true;
            }
            dbsk.l(z);
        }
        this.k = i;
    }

    protected abstract int a(Parcel parcel);

    protected abstract int b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(InputStream inputStream) {
        Queue<InputStream> queue = this.f;
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
        this.g = true;
    }

    protected final boolean e() {
        Queue<InputStream> queue = this.f;
        return queue != null ? !queue.isEmpty() : this.e != null && this.i == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f() {
        return !this.c.l;
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
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b2 A[Catch: all -> 0x0124, RemoteException | IOException -> 0x0126, RemoteException -> 0x0128, TryCatch #3 {dyjc -> 0x0138, blocks: (B:25:0x0037, B:79:0x011e, B:26:0x0048, B:76:0x00f1, B:78:0x00ff, B:32:0x0056, B:33:0x005b, B:40:0x0072, B:42:0x0076, B:48:0x0087, B:50:0x008d, B:58:0x00ad, B:60:0x00b2, B:62:0x00bd, B:63:0x00c5, B:64:0x00d1, B:71:0x00e3, B:73:0x00e7, B:75:0x00ed, B:66:0x00d6, B:67:0x00d9, B:68:0x00da, B:69:0x00dc, B:70:0x00dd, B:43:0x0079, B:45:0x007d, B:35:0x005e, B:37:0x006c, B:81:0x0123, B:87:0x0129, B:88:0x0133), top: B:100:0x0037 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deyt.g():void");
    }
}
