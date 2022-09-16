package defpackage;
/* compiled from: PG */
/* renamed from: gda  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gda implements Runnable {
    public final /* synthetic */ ahiq a;
    private final /* synthetic */ int b;

    public /* synthetic */ gda(ahiq ahiqVar, int i) {
        this.b = i;
        this.a = ahiqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.q(false);
        } else if (i == 1) {
            this.a.p();
        } else {
            this.a.h.start();
        }
    }
}
