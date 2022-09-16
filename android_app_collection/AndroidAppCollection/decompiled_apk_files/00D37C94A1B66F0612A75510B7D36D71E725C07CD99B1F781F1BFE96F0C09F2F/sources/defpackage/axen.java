package defpackage;
/* compiled from: PG */
/* renamed from: axen  reason: default package */
/* loaded from: classes2.dex */
final class axen implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ axeo c;

    public axen(axeo axeoVar, int i, int i2) {
        this.c = axeoVar;
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a <= 0 || this.b <= 0) {
            this.c.a.getHolder().setSizeFromLayout();
        } else {
            this.c.a.getHolder().setFixedSize(this.a, this.b);
        }
    }
}
