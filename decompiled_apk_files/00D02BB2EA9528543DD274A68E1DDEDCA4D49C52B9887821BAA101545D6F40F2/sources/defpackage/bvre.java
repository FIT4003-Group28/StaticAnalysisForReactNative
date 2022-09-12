package defpackage;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bvre  reason: default package */
/* loaded from: classes.dex */
final class bvre extends ThreadPoolExecutor {
    @dzsi
    public final bvra a;

    public bvre(int i, ThreadFactory threadFactory) {
        super(i, i, 0L, TimeUnit.SECONDS, new DelayQueue(), threadFactory);
        this.a = null;
    }
}
