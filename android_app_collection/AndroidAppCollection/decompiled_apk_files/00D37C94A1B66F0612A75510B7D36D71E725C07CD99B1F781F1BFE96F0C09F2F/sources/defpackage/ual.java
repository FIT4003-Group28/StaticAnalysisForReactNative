package defpackage;
/* compiled from: PG */
/* renamed from: ual  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class ual implements Runnable {
    public final /* synthetic */ tzz a;
    private final /* synthetic */ int b;

    public /* synthetic */ ual(tzz tzzVar, int i) {
        this.b = i;
        this.a = tzzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.b();
        } else {
            this.a.a();
        }
    }
}
