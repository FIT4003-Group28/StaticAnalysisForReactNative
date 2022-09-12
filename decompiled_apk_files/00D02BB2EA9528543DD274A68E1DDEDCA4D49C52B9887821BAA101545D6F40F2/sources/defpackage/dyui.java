package defpackage;

import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: dyui  reason: default package */
/* loaded from: classes6.dex */
final class dyui {
    final Object a;
    Future<?> b;
    boolean c;

    public dyui(Object obj) {
        this.a = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Future<?> future) {
        synchronized (this.a) {
            if (!this.c) {
                this.b = future;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Future<?> b() {
        this.c = true;
        return this.b;
    }
}
