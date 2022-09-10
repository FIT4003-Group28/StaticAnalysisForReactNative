package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.LinkedBlockingQueue;
/* compiled from: PG */
/* renamed from: dfdh  reason: default package */
/* loaded from: classes6.dex */
public final class dfdh {
    public final long a;
    public long b;
    public final LinkedHashMap<dcqp, dfdg> c;
    public final LinkedBlockingQueue<dfdg> d;

    public dfdh(long j) {
        LinkedHashMap<dcqp, dfdg> i = dcjz.i(100);
        LinkedBlockingQueue<dfdg> linkedBlockingQueue = new LinkedBlockingQueue<>(1000);
        this.a = j;
        this.c = i;
        this.d = linkedBlockingQueue;
        this.b = -1L;
    }
}
