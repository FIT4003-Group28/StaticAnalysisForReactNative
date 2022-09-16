package defpackage;
/* compiled from: PG */
/* renamed from: aivh  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aivh implements Runnable {
    public final /* synthetic */ aivl a;
    private final /* synthetic */ int b;

    public /* synthetic */ aivh(aivl aivlVar, int i) {
        this.b = i;
        this.a = aivlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.g(false);
        } else if (i == 1) {
            this.a.g(true);
        } else if (i == 2) {
            this.a.h(true);
        } else if (i == 3) {
            this.a.h(false);
        } else {
            this.a.j(false);
        }
    }
}
