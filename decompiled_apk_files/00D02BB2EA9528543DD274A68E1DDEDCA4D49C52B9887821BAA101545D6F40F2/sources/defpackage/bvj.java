package defpackage;

import java.util.concurrent.ThreadFactory;
/* compiled from: PG */
/* renamed from: bvj  reason: default package */
/* loaded from: classes.dex */
final class bvj implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(new bvi(runnable), "glide-active-resources");
    }
}
