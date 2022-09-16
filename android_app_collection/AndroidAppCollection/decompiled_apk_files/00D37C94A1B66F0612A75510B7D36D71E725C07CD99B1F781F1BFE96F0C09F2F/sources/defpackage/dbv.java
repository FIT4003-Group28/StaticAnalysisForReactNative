package defpackage;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dbv  reason: default package */
/* loaded from: classes3.dex */
public final class dbv extends ThreadPoolExecutor {
    public dbv(int i, int i2, int i3) {
        super(i, i2, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new dbt(i3));
    }
}
