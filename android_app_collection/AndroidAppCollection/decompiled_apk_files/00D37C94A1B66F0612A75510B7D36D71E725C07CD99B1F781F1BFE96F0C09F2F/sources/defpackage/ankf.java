package defpackage;

import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: ankf  reason: default package */
/* loaded from: classes.dex */
public final class ankf implements Runnable {
    ankt a;
    Future b;

    public ankf(ankt anktVar, Future future) {
        this.a = anktVar;
        this.b = future;
    }

    @Override // java.lang.Runnable
    public final void run() {
        anlz.B(this.a, this.b);
        this.a = null;
        this.b = null;
    }
}
