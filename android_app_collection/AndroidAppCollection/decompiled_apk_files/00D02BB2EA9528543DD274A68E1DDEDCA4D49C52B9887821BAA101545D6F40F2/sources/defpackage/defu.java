package defpackage;

import java.io.Closeable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: defu  reason: default package */
/* loaded from: classes6.dex */
public final class defu {
    private final defr a;

    public defu(defr defrVar) {
        this.a = defrVar;
    }

    public final <C extends Closeable> void a(C c, Executor executor) {
        dbsk.s(executor);
        if (c != null) {
            this.a.c(c, executor);
        }
    }
}
