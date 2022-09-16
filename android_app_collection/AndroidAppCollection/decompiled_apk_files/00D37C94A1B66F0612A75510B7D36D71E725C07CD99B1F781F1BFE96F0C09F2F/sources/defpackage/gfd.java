package defpackage;
/* compiled from: PG */
/* renamed from: gfd  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gfd implements Runnable {
    public final /* synthetic */ gfm a;
    private final /* synthetic */ int b;

    public /* synthetic */ gfd(gfm gfmVar, int i) {
        this.b = i;
        this.a = gfmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.b();
        } else {
            this.a.d();
        }
    }
}
