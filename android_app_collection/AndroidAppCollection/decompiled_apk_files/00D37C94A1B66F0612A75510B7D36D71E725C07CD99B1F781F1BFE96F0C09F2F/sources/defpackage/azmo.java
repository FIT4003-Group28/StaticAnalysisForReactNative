package defpackage;

import java.util.concurrent.ThreadFactory;
/* compiled from: PG */
/* renamed from: azmo  reason: default package */
/* loaded from: classes2.dex */
final class azmo implements aznj {
    final int a;
    long b;
    final aznd[] c;

    public azmo(int i, ThreadFactory threadFactory) {
        this.a = i;
        this.c = new aznd[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.c[i2] = new aznd(threadFactory);
        }
    }

    public final void a() {
        for (aznd azndVar : this.c) {
            azndVar.qr();
        }
    }

    @Override // defpackage.aznj
    public final void b(int i, azkg azkgVar) {
        int i2 = this.a;
        if (i2 == 0) {
            for (int i3 = 0; i3 < i; i3++) {
                azkgVar.a(i3, azmp.g);
            }
            return;
        }
        int i4 = ((int) this.b) % i2;
        for (int i5 = 0; i5 < i; i5++) {
            azkgVar.a(i5, new azmn(this.c[i4]));
            i4++;
            if (i4 == i2) {
                i4 = 0;
            }
        }
        this.b = i4;
    }

    public final aznd c() {
        int i = this.a;
        if (i == 0) {
            return azmp.g;
        }
        aznd[] azndVarArr = this.c;
        long j = this.b;
        this.b = 1 + j;
        return azndVarArr[(int) (j % i)];
    }
}
