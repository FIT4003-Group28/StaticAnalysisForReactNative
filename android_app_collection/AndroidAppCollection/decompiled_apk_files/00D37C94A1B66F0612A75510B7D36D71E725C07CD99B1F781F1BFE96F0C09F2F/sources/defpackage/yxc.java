package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: yxc  reason: default package */
/* loaded from: classes4.dex */
public final class yxc {
    final aynr a;
    final int b;
    final ArrayList c;

    public yxc(int i, aynr aynrVar) {
        aqxo.p(true);
        this.b = i;
        this.a = aynrVar;
        this.c = new ArrayList(32);
    }

    private final void d(String str, Runnable runnable, boolean z) {
        if (runnable != null) {
            yxb yxbVar = new yxb(str, runnable);
            yxbVar.h = z;
            this.c.add(yxbVar);
        }
    }

    public final void a(String str, Runnable runnable) {
        d(str, runnable, false);
    }

    public final void b(String str, Runnable runnable) {
        d(str, runnable, true);
    }

    public final void c(String str, Runnable runnable, boolean z) {
        if (z) {
            a(str, runnable);
        }
    }
}
