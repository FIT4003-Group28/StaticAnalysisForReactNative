package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: amlk  reason: default package */
/* loaded from: classes.dex */
public final class amlk {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ExecutorService c;
    public final ReferenceQueue b = new ReferenceQueue();
    public final AtomicBoolean d = new AtomicBoolean(false);

    public amlk(ExecutorService executorService) {
        this.c = executorService;
    }
}
