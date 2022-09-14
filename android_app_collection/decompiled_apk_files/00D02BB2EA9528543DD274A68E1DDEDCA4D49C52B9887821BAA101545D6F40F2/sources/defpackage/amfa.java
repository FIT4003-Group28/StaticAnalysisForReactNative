package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: amfa  reason: default package */
/* loaded from: classes.dex */
abstract class amfa implements amfq {
    private final Bitmap[] a;
    private final amfu b;
    private final cqat c;
    private final int d;
    public final amfu[] k;

    public amfa(amfu amfuVar, int i, int i2, cqat cqatVar) {
        this.b = amfuVar;
        this.c = cqatVar;
        this.d = i;
        this.a = new Bitmap[i2];
        this.k = new amfu[i2];
    }

    @Override // defpackage.amfq
    public final synchronized void a(amfu amfuVar) {
        if (this.b.b() == 0) {
            int i = -1;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                amfu[] amfuVarArr = this.k;
                if (i2 >= amfuVarArr.length) {
                    break;
                }
                if (dbsd.a(amfuVarArr[i2], amfuVar)) {
                    this.a[i2] = amfuVar.h();
                    i = i2;
                }
                if (this.a[i2] != null) {
                    i3++;
                }
                i2++;
            }
            if (this.a[i] == null) {
                this.b.c(2);
                this.b.l(this.c.b());
                this.b.e(false);
                this.b.q();
            }
            if (i3 != this.d) {
                return;
            }
            Bitmap b = b(this.a);
            if (b != null) {
                this.b.o(b);
                this.b.c(3);
                Bitmap[] c = c(this.a);
                if (c != null) {
                    this.b.f(c);
                }
            } else {
                this.b.c(2);
            }
            this.b.l(this.c.b());
            this.b.e(false);
            this.b.q();
        }
    }

    public abstract Bitmap b(Bitmap[] bitmapArr);

    public abstract Bitmap[] c(Bitmap[] bitmapArr);
}
