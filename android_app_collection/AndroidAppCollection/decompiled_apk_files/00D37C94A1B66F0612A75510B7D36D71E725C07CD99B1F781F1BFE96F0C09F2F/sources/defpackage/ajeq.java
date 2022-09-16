package defpackage;
/* compiled from: PG */
/* renamed from: ajeq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ajeq implements Runnable {
    public final /* synthetic */ wnn a;
    private final /* synthetic */ int b;

    public /* synthetic */ ajeq(wnn wnnVar, int i) {
        this.b = i;
        this.a = wnnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            ((wqy) this.a.a).a.i(new wuo("Internal media error"));
        } else {
            this.a.a.i();
        }
    }
}
