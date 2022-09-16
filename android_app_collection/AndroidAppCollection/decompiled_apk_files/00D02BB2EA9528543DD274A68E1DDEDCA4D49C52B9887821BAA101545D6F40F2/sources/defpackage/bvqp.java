package defpackage;

import android.content.Context;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: bvqp  reason: default package */
/* loaded from: classes.dex */
public final class bvqp implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(1);
    private final bvrj b;
    private final Context c;

    public bvqp(Context context, bvrj bvrjVar) {
        this.c = context.getApplicationContext();
        this.b = bvrjVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.b.K;
        int andIncrement = this.a.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 15);
        sb.append(str);
        sb.append("Pool");
        sb.append(andIncrement);
        bvqq bvqqVar = new bvqq(this.c, runnable, this.b, sb.toString());
        bvqqVar.setDaemon(false);
        return bvqqVar;
    }
}
