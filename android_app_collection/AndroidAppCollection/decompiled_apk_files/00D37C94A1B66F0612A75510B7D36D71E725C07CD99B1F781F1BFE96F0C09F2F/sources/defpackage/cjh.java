package defpackage;

import java.util.concurrent.ThreadFactory;
/* compiled from: PG */
/* renamed from: cjh  reason: default package */
/* loaded from: classes2.dex */
final class cjh implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(new ibx(runnable, 1), "glide-active-resources");
    }
}
