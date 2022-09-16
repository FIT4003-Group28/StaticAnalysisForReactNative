package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bafb  reason: default package */
/* loaded from: classes2.dex */
public final class bafb implements ThreadFactory {
    final /* synthetic */ int a;

    public bafb(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return Executors.defaultThreadFactory().newThread(new bafa(this, runnable));
    }
}
