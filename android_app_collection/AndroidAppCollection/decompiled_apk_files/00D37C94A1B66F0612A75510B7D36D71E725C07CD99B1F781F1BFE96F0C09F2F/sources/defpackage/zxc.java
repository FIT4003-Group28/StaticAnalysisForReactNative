package defpackage;
/* compiled from: PG */
/* renamed from: zxc  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class zxc implements Runnable {
    public final /* synthetic */ zxh a;
    private final /* synthetic */ int b;

    public /* synthetic */ zxc(zxh zxhVar, int i) {
        this.b = i;
        this.a = zxhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.g();
        } else {
            this.a.h();
        }
    }
}
