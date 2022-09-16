package defpackage;
/* compiled from: PG */
/* renamed from: ahsz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ahsz implements Runnable {
    public final /* synthetic */ ahta a;
    private final /* synthetic */ int b;

    public /* synthetic */ ahsz(ahta ahtaVar, int i) {
        this.b = i;
        this.a = ahtaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.o(ahty.LOGGED_ATTACH_WATCH_NEXT);
        } else {
            this.a.o(ahty.LOGGED_ATTACH_PLAYER);
        }
    }
}
