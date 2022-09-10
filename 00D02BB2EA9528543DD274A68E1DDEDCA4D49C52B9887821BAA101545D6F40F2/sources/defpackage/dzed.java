package defpackage;

import java.util.concurrent.ThreadFactory;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzed  reason: default package */
/* loaded from: classes6.dex */
public final class dzed {
    final int a;
    final dzee[] b;
    long c;

    public dzed(int i, ThreadFactory threadFactory) {
        this.a = i;
        this.b = new dzee[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.b[i2] = new dzee(threadFactory);
        }
    }

    public final dzee a() {
        int i = this.a;
        if (i == 0) {
            return dzef.d;
        }
        dzee[] dzeeVarArr = this.b;
        long j = this.c;
        this.c = 1 + j;
        return dzeeVarArr[(int) (j % i)];
    }

    public final void b() {
        for (dzee dzeeVar : this.b) {
            dzeeVar.SQ();
        }
    }
}
