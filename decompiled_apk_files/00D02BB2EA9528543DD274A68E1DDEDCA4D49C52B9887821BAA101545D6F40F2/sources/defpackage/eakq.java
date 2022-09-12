package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eakq  reason: default package */
/* loaded from: classes6.dex */
public final class eakq implements ThreadFactory {
    final /* synthetic */ int a;

    public eakq(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return Executors.defaultThreadFactory().newThread(new eakp(this, runnable));
    }
}
