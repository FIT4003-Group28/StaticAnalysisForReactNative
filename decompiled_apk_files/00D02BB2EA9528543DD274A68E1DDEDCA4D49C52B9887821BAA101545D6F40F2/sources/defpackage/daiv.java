package defpackage;

import java.util.concurrent.ThreadFactory;
/* compiled from: PG */
/* renamed from: daiv  reason: default package */
/* loaded from: classes5.dex */
final class daiv implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "SplitCompatBackgroundThread");
    }
}
